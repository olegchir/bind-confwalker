package ru.olegchir.bindconf.walker.parser.override;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: Olga
 * Date: 16.09.2009
 * Time: 12:22:49
 * To change this template use File | Settings | File Templates.
 */
public class Bind9ParserOverrider extends Bind9RecognizerOverrider {
    
private String currentZoneType = null;
private HashMap zoneTypeParamsMap;
private String[] zoneTypeForwardParams = {"forward","forwarders","delegation-only"};
private String[] zoneTypeStubParams = {"allow-query","allow-query-on","check-names",
                                        "dialup","delegation-only","file","masterfile-format",
                                        "forward","forwarders","masters","max-transfer-idle-in",
                                        "max-transfer-time-in","pubkey","transfer-source",
                                        "transfer-source-v6","alt-transfer-source",
                                        "alt-transfer-source-v6","use-alt-transfer-source",
                                        "zone-statistics","database","min-refresh-time",
                                        "max-refresh-time","min-retry-time","max-retry-time",
                                        "multi-master"};
//private String[] zoneTypeHintParams = {

public String resetCurrentZoneType() {
	String returnValue = this.currentZoneType;
	currentZoneType = null;
	return returnValue;
}

public String setCurrentZoneType(String newZoneType) {
	String returnValue = this.currentZoneType;
	this.currentZoneType = newZoneType;
	return returnValue;
}

public String getCurrentZoneType() {
	return this.currentZoneType;
}

public boolean currentZoneTypeSet() {
	return this.currentZoneType!=null;
}

    public String getInstanceClass() {
        return RECOGNIZER_CLASS_PARSER;
    }

    public String getInstanceName() {
        return "stage1";
    }
}
