<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AOL Coding Test</title>
<link rel="stylesheet" type="text/css" href="http://myopenissues.com/magento/skin/frontend/default/default/css/styles.css" media="all" />
<link rel="stylesheet" type="text/css" href="http://myopenissues.com/magento/skin/frontend/base/default/css/widgets.css" media="all" />
<link rel="stylesheet" type="text/css" href="http://myopenissues.com/magento/skin/frontend/default/default/css/print.css" media="print" />
<script type="text/javascript" src="http://myopenissues.com/magento/js/prototype/prototype.js"></script>
<script type="text/javascript" src="http://myopenissues.com/magento/js/lib/ccard.js"></script>
<script type="text/javascript" src="http://myopenissues.com/magento/js/prototype/validation.js"></script>
<script type="text/javascript" src="http://myopenissues.com/magento/js/scriptaculous/builder.js"></script>
<script type="text/javascript" src="http://myopenissues.com/magento/js/scriptaculous/effects.js"></script>
<script type="text/javascript" src="http://myopenissues.com/magento/js/scriptaculous/dragdrop.js"></script>
<script type="text/javascript" src="http://myopenissues.com/magento/js/scriptaculous/controls.js"></script>
<script type="text/javascript" src="http://myopenissues.com/magento/js/scriptaculous/slider.js"></script>
<script type="text/javascript" src="http://myopenissues.com/magento/js/varien/js.js"></script>
<script type="text/javascript" src="http://myopenissues.com/magento/js/varien/form.js"></script>
<script type="text/javascript" src="http://myopenissues.com/magento/js/varien/menu.js"></script>
<script type="text/javascript" src="http://myopenissues.com/magento/js/mage/translate.js"></script>
<script type="text/javascript" src="http://myopenissues.com/magento/js/mage/cookies.js"></script>
<script type="text/javascript" src="http://myopenissues.com/magento/js/mage/captcha.js"></script>
</head>
<body>

<div class="main-container col1-layout">
            <div class="main">
                                <div class="col-main">
                                        <div class="account-create">
    <div class="page-title">
        <h1>Create an Account</h1>
    </div>
            <form action="RegisterServlet" method="post" id="form-validate">
        <div class="fieldset">
            <input type="hidden" name="success_url" value="" />
            <input type="hidden" name="error_url" value="" />
            <h2 class="legend">Personal Information</h2>
            <ul class="form-list">
                <li class="fields">
                    <div class="customer-name">
    <div class="field name-firstname">
        <label for="firstname" class="required"><em>*</em>First Name</label>
        <div class="input-box">
            <input type="text" id="firstname" name="firstname" value="" title="First Name" maxlength="255" class="input-text required-entry"  />
        </div>
    </div>
    <div class="field name-lastname">
        <label for="lastname" class="required"><em>*</em>Last Name</label>
        <div class="input-box">
            <input type="text" id="lastname" name="lastname" value="" title="Last Name" maxlength="255" class="input-text required-entry"  />
        </div>
    </div>
</div>
                </li>
                <li>
                    <label for="email_address" class="required"><em>*</em>Email Address</label>
                    <div class="input-box">
                        <input type="text" name="email" id="email_address" value="" title="Email Address" class="input-text validate-email required-entry" />
                    </div>
                </li>
                                <li class="control">
                    <div class="input-box">
                        <input type="checkbox" name="is_subscribed" title="Sign Up for Newsletter" value="1" id="is_subscribed" class="checkbox" />
                    </div>
                    <label for="is_subscribed">Sign Up for Newsletter</label>
                </li>
                                                                                                    </ul>
        </div>
            <div class="fieldset">
            <h2 class="legend">Login Information</h2>
            <ul class="form-list">
                <li class="fields">
                    <div class="field">
                        <label for="password" class="required"><em>*</em>Password</label>
                        <div class="input-box">
                            <input type="password" name="password" id="password" title="Password" class="input-text required-entry validate-password" />
                        </div>
                    </div>
                    <div class="field">
                        <label for="confirmation" class="required"><em>*</em>Confirm Password</label>
                        <div class="input-box">
                            <input type="password" name="confirmation" title="Confirm Password" id="confirmation" class="input-text required-entry validate-cpassword" />
                        </div>
                    </div>
                </li>
                                            </ul>
            <div id="window-overlay" class="window-overlay" style="display:none;"></div>
<div id="remember-me-popup" class="remember-me-popup" style="display:none;">
    <div class="remember-me-popup-head">
        <h3>What's this?</h3>
        <a href="#" class="remember-me-popup-close" title="Close">Close</a>
    </div>
    <div class="remember-me-popup-body">
        <p>Checking &quot;Remember Me&quot; will let you access your shopping cart on this computer when you are logged out</p>
        <div class="remember-me-popup-close-button a-right">
            <a href="#" class="remember-me-popup-close button" title="Close"><span>Close</span></a>
        </div>
    </div>
</div>

        </div>
        <div class="buttons-set">
            <p class="required">* Required Fields</p>
            <button type="submit" title="Submit" class="button"><span><span>Submit</span></span></button>
        </div>
            </form>
    <script type="text/javascript">

        var dataForm = new VarienForm('form-validate', true);
          //alert(dataForm);
    </script>
</div>
                </div>
            </div>
        </div>
</body>
</html>