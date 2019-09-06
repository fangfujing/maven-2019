package spring.strategy;

public enum SysCodeEnum {

    /**
     *
     */
    GT("111", "柜台"),HS("222", "恒生");

    private String sysCode;

    private String name;

    SysCodeEnum(String sysCode, String name) {
        this.sysCode = sysCode;
        this.name = name;
    }

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }
}
