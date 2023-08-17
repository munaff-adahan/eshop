
<%@taglib prefix="layout" uri="http://callidora.lk/jsp/template-inheritance" %>
<layout:extends name="test_layout">
    <layout:put block="a" type="PREPEND">
        <h1>A Tag</h1>
    </layout:put>

</layout:extends>
