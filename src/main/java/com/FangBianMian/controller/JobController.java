package com.FangBianMian.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.FangBianMian.domain.Job;
import com.FangBianMian.service.IJobService;
import com.FangBianMian.utils.EasyUiDataGrid;

@Controller
@RequestMapping("/job")
public class JobController {

	@Autowired
	private IJobService jobService;
	
	@RequestMapping("/index")
	public String index(){
		return "pages/job/index";
	}
	
	/**
	 * ����ְλ�б�
	 * @param page easyui�Զ����� ��ǰҳ
	 * @param rows easyui�Զ����� һҳ�Ĵ�С
	 * @param sort easyui�Զ����� ��Ҫ������ֶ�
	 * @param order easyui�Զ����� ����ʽ
	 * @return
	 */
	@RequestMapping("/list")
	@ResponseBody
	public EasyUiDataGrid<Job> list(@RequestParam(required=false) Integer page,
							   @RequestParam(required=false) Integer rows,
							   @RequestParam(required=false) String sort,
							   @RequestParam(required=false) String order){
		
		EasyUiDataGrid<Job> eudg = new EasyUiDataGrid<Job>();
		
		if(page==null || rows==null){
			return eudg;
		}
		
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("page", ((page-1)*rows));
		param.put("rows", rows);
		param.put("sort", sort);
		param.put("order", order);
		
		List<Job> jobs = jobService.getAllJobs(param);
		int total = jobService.getJobTotal(param);
		
		eudg.setRows(jobs);
		eudg.setTotal(total);

		return eudg;
	}
}







