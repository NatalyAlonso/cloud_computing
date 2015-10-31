package com.proyectofinal.datos.dao.impl;

import com.proyectofinal.datos.dao.RolDAO;
import com.proyectofinal.datos.domain.Rol;
import com.proyectofinal.datos.dto.RolExample;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class RolDAOImpl extends SqlMapClientDaoSupport implements RolDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table roles
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    public RolDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table roles
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    public int countByExample(RolExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("roles.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table roles
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    public int deleteByPrimaryKey(Integer idRol) {
        Rol key = new Rol();
        key.setIdRol(idRol);
        int rows = getSqlMapClientTemplate().delete("roles.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table roles
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    public Integer insert(Rol record) {
        Object newKey = getSqlMapClientTemplate().insert("roles.ibatorgenerated_insert", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table roles
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    public Integer insertSelective(Rol record) {
        Object newKey = getSqlMapClientTemplate().insert("roles.ibatorgenerated_insertSelective", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table roles
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    @SuppressWarnings("unchecked")
    public List<Rol> selectByExample(RolExample example) {
        List<Rol> list = getSqlMapClientTemplate().queryForList("roles.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table roles
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    public Rol selectByPrimaryKey(Integer idRol) {
        Rol key = new Rol();
        key.setIdRol(idRol);
        Rol record = (Rol) getSqlMapClientTemplate().queryForObject("roles.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table roles
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    public int updateByExampleSelective(Rol record, RolExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("roles.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table roles
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    public int updateByExample(Rol record, RolExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("roles.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table roles
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    public int updateByPrimaryKeySelective(Rol record) {
        int rows = getSqlMapClientTemplate().update("roles.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table roles
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    public int updateByPrimaryKey(Rol record) {
        int rows = getSqlMapClientTemplate().update("roles.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table roles
     *
     * @ibatorgenerated Thu Oct 22 16:15:00 CDT 2015
     */
    private static class UpdateByExampleParms extends RolExample {
        private Object record;

        public UpdateByExampleParms(Object record, RolExample example) {
            super(example);
            this.record = record;
        }

        @SuppressWarnings("unused")
		public Object getRecord() {
            return record;
        }
    }
}