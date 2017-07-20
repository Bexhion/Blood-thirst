package bexhion.bloodthirst.common.reference;

public class RefMain {

    //Misc properties
    public static final String MOD_ID = "bloodthirst";
    public static final String NAME = "Blood Thirst";
    public static final String BUILD = "@BUILD@";
    public static final String BUILD_STATE = "@BUILDSTATE@";
    public static final String VERSION = "@VERSION@" + BUILD_STATE + "-" + BUILD;
    public static final String DEPENDENCIES = "";

    //Proxy properties
    public static final String PROXY_COMMON = "bexhion.bloodthirst.common.core.proxy.CommonProxy";
    public static final String PROXY_CLIENT = "bexhion.bloodthirst.client.core.proxy.ClientProxy";
}