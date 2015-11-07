package com.proyectofinal.datos.dao.impl;

import com.proyectofinal.datos.dao.EntregaDAO;
import com.proyectofinal.datos.domain.Entrega;
import com.proyectofinal.datos.dto.EntregaExample;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class EntregaDAOImpl extends SqlMapClientDaoSupport implements EntregaDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table entrega
     *
     * @ibatorgenerated Fri Oct 23 13:39:18 CDT 2015
     */
    public EntregaDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table entrega
     *
     * @ibatorgenerated Fri Oct 23 13:39:18 CDT 2015
     */
    public int countByExample(EntregaExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("entrega.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table entrega
     *
     * @ibatorgenerated Fri Oct 23 13:39:18 CDT 2015
     */
    public int deleteByPrimaryKey(Integer idEntrega) {
        Entrega key = new Entrega();
        key.setIdEntrega(idEntrega);
        int rows = getSqlMapClientTemplate().delete("entrega.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table entrega
     *
     * @ibatorgenerated Fri Oct 23 13:39:18 CDT 2015
     */
    public Integer insert(Entrega record) {
        Object newKey = getSqlMapClientTemplate().insert("entrega.ibatorgenerated_insert", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table entrega
     *
     * @ibatorgenerated Fri Oct 23 13:39:18 CDT 2015
     */
    public Integer insertSelective(Entrega record) {
        Object newKey = getSqlMapClientTemplate().insert("entrega.ibatorgenerated_insertSelective", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table entrega
     *
     * @ibatorgenerated Fri Oct 23 13:39:18 CDT 2015
     */
    @SuppressWarnings("unchecked")
    public List<Entrega> selectByExample(EntregaExample example) {
        List<Entrega> list = getSqlMapClientTemplate().queryForList("entrega.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table entrega
     *
     * @ibatorgenerated Fri Oct 23 13:39:18 CDT 2015
     */
    public Entrega selectByPrimaryKey(Integer idEntrega) {
        Entrega key = new Entrega();
        key.setIdEntrega(idEntrega);
        Entrega record = (Entrega) getSqlMapClientTemplate().queryForObject("entrega.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table entrega
     *
     * @ibatorgenerated Fri Oct 23 13:39:18 CDT 2015
     */
    public int updateByExampleSelective(Entrega record, EntregaExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("entrega.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table entrega
     *
     * @ibatorgenerated Fri Oct 23 13:39:18 CDT 2015
     */
    public int updateByExample(Entrega record, EntregaExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("entrega.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table entrega
     *
     * @ibatorgenerated Fri Oct 23 13:39:18 CDT 2015
     */
    public int updateByPrimaryKeySelective(Entrega record) {
        int rows = getSqlMapClientTemplate().update("entrega.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table entrega
     *
     * @ibatorgenerated Fri Oct 23 13:39:18 CDT 2015
     */
    public int updateByPrimaryKey(Entrega record) {
        int rows = getSqlMapClientTemplate().update("entrega.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table entrega
     *
     * @ibatorgenerated Fri Oct 23 13:39:18 CDT 2015
     */
    private static class UpdateByExampleParms extends EntregaExample {
        private Object record;

        public UpdateByExampleParms(Object record, EntregaExample example) {
            super(example);
            this.record = record;
        }

        @SuppressWarnings("unused")
		public Object getRecord() {
            return record;
        }
    }
}