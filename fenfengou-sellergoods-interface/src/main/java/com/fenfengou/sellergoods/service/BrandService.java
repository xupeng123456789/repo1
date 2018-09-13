package com.fenfengou.sellergoods.service;

import java.util.List;

import com.fenfengou.entity.PageResult;
import com.fenfengou.pojo.TbBrand;
/**
 * 品牌服务层口
 * @author qinjiwei
 *
 */
public interface BrandService {
	public List<TbBrand> findAll();
	public PageResult findPage(int pageNum,int pageSize);
	public void add(TbBrand brand);
	public TbBrand findOne(Long id);
	public void update(TbBrand brand);
	public void delete(Long[] ids);
	public PageResult findPage(TbBrand brand,int pageNum,int pageSeze);
}
