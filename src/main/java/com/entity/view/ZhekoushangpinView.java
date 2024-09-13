package com.entity.view;

import com.entity.ZhekoushangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 折扣商品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-13 12:42:37
 */
@TableName("zhekoushangpin")
public class ZhekoushangpinView  extends ZhekoushangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhekoushangpinView(){
	}
 
 	public ZhekoushangpinView(ZhekoushangpinEntity zhekoushangpinEntity){
 	try {
			BeanUtils.copyProperties(this, zhekoushangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
