package com.proyectofinal.datos.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table clientes
     *
     * @ibatorgenerated Wed Oct 21 15:31:02 CDT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table clientes
     *
     * @ibatorgenerated Wed Oct 21 15:31:02 CDT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table clientes
     *
     * @ibatorgenerated Wed Oct 21 15:31:02 CDT 2015
     */
    public ClienteExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table clientes
     *
     * @ibatorgenerated Wed Oct 21 15:31:02 CDT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table clientes
     *
     * @ibatorgenerated Wed Oct 21 15:31:02 CDT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table clientes
     *
     * @ibatorgenerated Wed Oct 21 15:31:02 CDT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table clientes
     *
     * @ibatorgenerated Wed Oct 21 15:31:02 CDT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table clientes
     *
     * @ibatorgenerated Wed Oct 21 15:31:02 CDT 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table clientes
     *
     * @ibatorgenerated Wed Oct 21 15:31:02 CDT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table clientes
     *
     * @ibatorgenerated Wed Oct 21 15:31:02 CDT 2015
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table clientes
     *
     * @ibatorgenerated Wed Oct 21 15:31:02 CDT 2015
     */
    public static class Criteria {
        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andIdClienteIsNull() {
            addCriterion("id_cliente is null");
            return this;
        }

        public Criteria andIdClienteIsNotNull() {
            addCriterion("id_cliente is not null");
            return this;
        }

        public Criteria andIdClienteEqualTo(Integer value) {
            addCriterion("id_cliente =", value, "idCliente");
            return this;
        }

        public Criteria andIdClienteNotEqualTo(Integer value) {
            addCriterion("id_cliente <>", value, "idCliente");
            return this;
        }

        public Criteria andIdClienteGreaterThan(Integer value) {
            addCriterion("id_cliente >", value, "idCliente");
            return this;
        }

        public Criteria andIdClienteGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_cliente >=", value, "idCliente");
            return this;
        }

        public Criteria andIdClienteLessThan(Integer value) {
            addCriterion("id_cliente <", value, "idCliente");
            return this;
        }

        public Criteria andIdClienteLessThanOrEqualTo(Integer value) {
            addCriterion("id_cliente <=", value, "idCliente");
            return this;
        }

        public Criteria andIdClienteIn(List<Integer> values) {
            addCriterion("id_cliente in", values, "idCliente");
            return this;
        }

        public Criteria andIdClienteNotIn(List<Integer> values) {
            addCriterion("id_cliente not in", values, "idCliente");
            return this;
        }

        public Criteria andIdClienteBetween(Integer value1, Integer value2) {
            addCriterion("id_cliente between", value1, value2, "idCliente");
            return this;
        }

        public Criteria andIdClienteNotBetween(Integer value1, Integer value2) {
            addCriterion("id_cliente not between", value1, value2, "idCliente");
            return this;
        }

        public Criteria andNombreIsNull() {
            addCriterion("nombre is null");
            return this;
        }

        public Criteria andNombreIsNotNull() {
            addCriterion("nombre is not null");
            return this;
        }

        public Criteria andNombreEqualTo(String value) {
            addCriterion("nombre =", value, "nombre");
            return this;
        }

        public Criteria andNombreNotEqualTo(String value) {
            addCriterion("nombre <>", value, "nombre");
            return this;
        }

        public Criteria andNombreGreaterThan(String value) {
            addCriterion("nombre >", value, "nombre");
            return this;
        }

        public Criteria andNombreGreaterThanOrEqualTo(String value) {
            addCriterion("nombre >=", value, "nombre");
            return this;
        }

        public Criteria andNombreLessThan(String value) {
            addCriterion("nombre <", value, "nombre");
            return this;
        }

        public Criteria andNombreLessThanOrEqualTo(String value) {
            addCriterion("nombre <=", value, "nombre");
            return this;
        }

        public Criteria andNombreLike(String value) {
            addCriterion("nombre like", value, "nombre");
            return this;
        }

        public Criteria andNombreNotLike(String value) {
            addCriterion("nombre not like", value, "nombre");
            return this;
        }

        public Criteria andNombreIn(List<String> values) {
            addCriterion("nombre in", values, "nombre");
            return this;
        }

        public Criteria andNombreNotIn(List<String> values) {
            addCriterion("nombre not in", values, "nombre");
            return this;
        }

        public Criteria andNombreBetween(String value1, String value2) {
            addCriterion("nombre between", value1, value2, "nombre");
            return this;
        }

        public Criteria andNombreNotBetween(String value1, String value2) {
            addCriterion("nombre not between", value1, value2, "nombre");
            return this;
        }

        public Criteria andApellido_paternoIsNull() {
            addCriterion("apellido_paterno is null");
            return this;
        }

        public Criteria andApellido_paternoIsNotNull() {
            addCriterion("apellido_paterno is not null");
            return this;
        }

        public Criteria andApellido_paternoEqualTo(String value) {
            addCriterion("apellido_paterno =", value, "apellido_paterno");
            return this;
        }

        public Criteria andApellido_paternoNotEqualTo(String value) {
            addCriterion("apellido_paterno <>", value, "apellido_paterno");
            return this;
        }

        public Criteria andApellido_paternoGreaterThan(String value) {
            addCriterion("apellido_paterno >", value, "apellido_paterno");
            return this;
        }

        public Criteria andApellido_paternoGreaterThanOrEqualTo(String value) {
            addCriterion("apellido_paterno >=", value, "apellido_paterno");
            return this;
        }

        public Criteria andApellido_paternoLessThan(String value) {
            addCriterion("apellido_paterno <", value, "apellido_paterno");
            return this;
        }

        public Criteria andApellido_paternoLessThanOrEqualTo(String value) {
            addCriterion("apellido_paterno <=", value, "apellido_paterno");
            return this;
        }

        public Criteria andApellido_paternoLike(String value) {
            addCriterion("apellido_paterno like", value, "apellido_paterno");
            return this;
        }

        public Criteria andApellido_paternoNotLike(String value) {
            addCriterion("apellido_paterno not like", value, "apellido_paterno");
            return this;
        }

        public Criteria andApellido_paternoIn(List<String> values) {
            addCriterion("apellido_paterno in", values, "apellido_paterno");
            return this;
        }

        public Criteria andApellido_paternoNotIn(List<String> values) {
            addCriterion("apellido_paterno not in", values, "apellido_paterno");
            return this;
        }

        public Criteria andApellido_paternoBetween(String value1, String value2) {
            addCriterion("apellido_paterno between", value1, value2, "apellido_paterno");
            return this;
        }

        public Criteria andApellido_paternoNotBetween(String value1, String value2) {
            addCriterion("apellido_paterno not between", value1, value2, "apellido_paterno");
            return this;
        }

        public Criteria andApellido_maternoIsNull() {
            addCriterion("apellido_materno is null");
            return this;
        }

        public Criteria andApellido_maternoIsNotNull() {
            addCriterion("apellido_materno is not null");
            return this;
        }

        public Criteria andApellido_maternoEqualTo(String value) {
            addCriterion("apellido_materno =", value, "apellido_materno");
            return this;
        }

        public Criteria andApellido_maternoNotEqualTo(String value) {
            addCriterion("apellido_materno <>", value, "apellido_materno");
            return this;
        }

        public Criteria andApellido_maternoGreaterThan(String value) {
            addCriterion("apellido_materno >", value, "apellido_materno");
            return this;
        }

        public Criteria andApellido_maternoGreaterThanOrEqualTo(String value) {
            addCriterion("apellido_materno >=", value, "apellido_materno");
            return this;
        }

        public Criteria andApellido_maternoLessThan(String value) {
            addCriterion("apellido_materno <", value, "apellido_materno");
            return this;
        }

        public Criteria andApellido_maternoLessThanOrEqualTo(String value) {
            addCriterion("apellido_materno <=", value, "apellido_materno");
            return this;
        }

        public Criteria andApellido_maternoLike(String value) {
            addCriterion("apellido_materno like", value, "apellido_materno");
            return this;
        }

        public Criteria andApellido_maternoNotLike(String value) {
            addCriterion("apellido_materno not like", value, "apellido_materno");
            return this;
        }

        public Criteria andApellido_maternoIn(List<String> values) {
            addCriterion("apellido_materno in", values, "apellido_materno");
            return this;
        }

        public Criteria andApellido_maternoNotIn(List<String> values) {
            addCriterion("apellido_materno not in", values, "apellido_materno");
            return this;
        }

        public Criteria andApellido_maternoBetween(String value1, String value2) {
            addCriterion("apellido_materno between", value1, value2, "apellido_materno");
            return this;
        }

        public Criteria andApellido_maternoNotBetween(String value1, String value2) {
            addCriterion("apellido_materno not between", value1, value2, "apellido_materno");
            return this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return this;
        }

        public Criteria andNombre_usuarioIsNull() {
            addCriterion("nombre_usuario is null");
            return this;
        }

        public Criteria andNombre_usuarioIsNotNull() {
            addCriterion("nombre_usuario is not null");
            return this;
        }

        public Criteria andNombre_usuarioEqualTo(String value) {
            addCriterion("nombre_usuario =", value, "nombre_usuario");
            return this;
        }

        public Criteria andNombre_usuarioNotEqualTo(String value) {
            addCriterion("nombre_usuario <>", value, "nombre_usuario");
            return this;
        }

        public Criteria andNombre_usuarioGreaterThan(String value) {
            addCriterion("nombre_usuario >", value, "nombre_usuario");
            return this;
        }

        public Criteria andNombre_usuarioGreaterThanOrEqualTo(String value) {
            addCriterion("nombre_usuario >=", value, "nombre_usuario");
            return this;
        }

        public Criteria andNombre_usuarioLessThan(String value) {
            addCriterion("nombre_usuario <", value, "nombre_usuario");
            return this;
        }

        public Criteria andNombre_usuarioLessThanOrEqualTo(String value) {
            addCriterion("nombre_usuario <=", value, "nombre_usuario");
            return this;
        }

        public Criteria andNombre_usuarioLike(String value) {
            addCriterion("nombre_usuario like", value, "nombre_usuario");
            return this;
        }

        public Criteria andNombre_usuarioNotLike(String value) {
            addCriterion("nombre_usuario not like", value, "nombre_usuario");
            return this;
        }

        public Criteria andNombre_usuarioIn(List<String> values) {
            addCriterion("nombre_usuario in", values, "nombre_usuario");
            return this;
        }

        public Criteria andNombre_usuarioNotIn(List<String> values) {
            addCriterion("nombre_usuario not in", values, "nombre_usuario");
            return this;
        }

        public Criteria andNombre_usuarioBetween(String value1, String value2) {
            addCriterion("nombre_usuario between", value1, value2, "nombre_usuario");
            return this;
        }

        public Criteria andNombre_usuarioNotBetween(String value1, String value2) {
            addCriterion("nombre_usuario not between", value1, value2, "nombre_usuario");
            return this;
        }

        public Criteria andContrasenaIsNull() {
            addCriterion("contrasena is null");
            return this;
        }

        public Criteria andContrasenaIsNotNull() {
            addCriterion("contrasena is not null");
            return this;
        }

        public Criteria andContrasenaEqualTo(String value) {
            addCriterion("contrasena =", value, "contrasena");
            return this;
        }

        public Criteria andContrasenaNotEqualTo(String value) {
            addCriterion("contrasena <>", value, "contrasena");
            return this;
        }

        public Criteria andContrasenaGreaterThan(String value) {
            addCriterion("contrasena >", value, "contrasena");
            return this;
        }

        public Criteria andContrasenaGreaterThanOrEqualTo(String value) {
            addCriterion("contrasena >=", value, "contrasena");
            return this;
        }

        public Criteria andContrasenaLessThan(String value) {
            addCriterion("contrasena <", value, "contrasena");
            return this;
        }

        public Criteria andContrasenaLessThanOrEqualTo(String value) {
            addCriterion("contrasena <=", value, "contrasena");
            return this;
        }

        public Criteria andContrasenaLike(String value) {
            addCriterion("contrasena like", value, "contrasena");
            return this;
        }

        public Criteria andContrasenaNotLike(String value) {
            addCriterion("contrasena not like", value, "contrasena");
            return this;
        }

        public Criteria andContrasenaIn(List<String> values) {
            addCriterion("contrasena in", values, "contrasena");
            return this;
        }

        public Criteria andContrasenaNotIn(List<String> values) {
            addCriterion("contrasena not in", values, "contrasena");
            return this;
        }

        public Criteria andContrasenaBetween(String value1, String value2) {
            addCriterion("contrasena between", value1, value2, "contrasena");
            return this;
        }

        public Criteria andContrasenaNotBetween(String value1, String value2) {
            addCriterion("contrasena not between", value1, value2, "contrasena");
            return this;
        }

        public Criteria andImagenIsNull() {
            addCriterion("imagen is null");
            return this;
        }

        public Criteria andImagenIsNotNull() {
            addCriterion("imagen is not null");
            return this;
        }

        public Criteria andImagenEqualTo(String value) {
            addCriterion("imagen =", value, "imagen");
            return this;
        }

        public Criteria andImagenNotEqualTo(String value) {
            addCriterion("imagen <>", value, "imagen");
            return this;
        }

        public Criteria andImagenGreaterThan(String value) {
            addCriterion("imagen >", value, "imagen");
            return this;
        }

        public Criteria andImagenGreaterThanOrEqualTo(String value) {
            addCriterion("imagen >=", value, "imagen");
            return this;
        }

        public Criteria andImagenLessThan(String value) {
            addCriterion("imagen <", value, "imagen");
            return this;
        }

        public Criteria andImagenLessThanOrEqualTo(String value) {
            addCriterion("imagen <=", value, "imagen");
            return this;
        }

        public Criteria andImagenLike(String value) {
            addCriterion("imagen like", value, "imagen");
            return this;
        }

        public Criteria andImagenNotLike(String value) {
            addCriterion("imagen not like", value, "imagen");
            return this;
        }

        public Criteria andImagenIn(List<String> values) {
            addCriterion("imagen in", values, "imagen");
            return this;
        }

        public Criteria andImagenNotIn(List<String> values) {
            addCriterion("imagen not in", values, "imagen");
            return this;
        }

        public Criteria andImagenBetween(String value1, String value2) {
            addCriterion("imagen between", value1, value2, "imagen");
            return this;
        }

        public Criteria andImagenNotBetween(String value1, String value2) {
            addCriterion("imagen not between", value1, value2, "imagen");
            return this;
        }

        public Criteria andId_rolIsNull() {
            addCriterion("id_rol is null");
            return this;
        }

        public Criteria andId_rolIsNotNull() {
            addCriterion("id_rol is not null");
            return this;
        }

        public Criteria andId_rolEqualTo(Long value) {
            addCriterion("id_rol =", value, "id_rol");
            return this;
        }

        public Criteria andId_rolNotEqualTo(Long value) {
            addCriterion("id_rol <>", value, "id_rol");
            return this;
        }

        public Criteria andId_rolGreaterThan(Long value) {
            addCriterion("id_rol >", value, "id_rol");
            return this;
        }

        public Criteria andId_rolGreaterThanOrEqualTo(Long value) {
            addCriterion("id_rol >=", value, "id_rol");
            return this;
        }

        public Criteria andId_rolLessThan(Long value) {
            addCriterion("id_rol <", value, "id_rol");
            return this;
        }

        public Criteria andId_rolLessThanOrEqualTo(Long value) {
            addCriterion("id_rol <=", value, "id_rol");
            return this;
        }

        public Criteria andId_rolIn(List<Long> values) {
            addCriterion("id_rol in", values, "id_rol");
            return this;
        }

        public Criteria andId_rolNotIn(List<Long> values) {
            addCriterion("id_rol not in", values, "id_rol");
            return this;
        }

        public Criteria andId_rolBetween(Long value1, Long value2) {
            addCriterion("id_rol between", value1, value2, "id_rol");
            return this;
        }

        public Criteria andId_rolNotBetween(Long value1, Long value2) {
            addCriterion("id_rol not between", value1, value2, "id_rol");
            return this;
        }
    }
}