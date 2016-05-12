package com.info.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("daoSupport")
public class DaoSupport implements DAO
{
    @Resource(name = "sqlSessionTemplate")
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public Object save(String str, Object obj) throws Exception
    {

        return sqlSessionTemplate.insert(str, obj);
    }

    @Override
    public Object update(String str, Object obj) throws Exception
    {

        return sqlSessionTemplate.update(str, obj);
    }

    @Override
    public Object delete(String str, Object obj) throws Exception
    {

        return sqlSessionTemplate.delete(str, obj);
    }

    @Override
    public Object findForObject(String str, Object obj) throws Exception
    {

        return sqlSessionTemplate.selectOne(str, obj);
    }

    @Override
    public Object findForList(String str, Object obj) throws Exception
    {

        return sqlSessionTemplate.selectList(str, obj);
    }

    @Override
    public Object findForMap(String str, Object obj, String key, String value) throws Exception
    {

        return sqlSessionTemplate.selectMap(str, obj, key);
    }

}
