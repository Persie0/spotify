package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonInclude$Value;
import com.fasterxml.jackson.annotation.JsonSetter$Value;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ConfigOverrides implements Serializable {
    protected JsonInclude$Value _defaultInclusion;
    protected Boolean _defaultLeniency;
    protected Boolean _defaultMergeable;
    protected JsonSetter$Value _defaultSetterInfo;
    protected Map<Class<?>, Object> _overrides;
    protected VisibilityChecker<?> _visibilityChecker;

    public ConfigOverrides() {
        this(null, JsonInclude$Value.empty(), JsonSetter$Value.empty(), VisibilityChecker.Std.defaultInstance(), null, null);
    }

    public ConfigOverrides(Map<Class<?>, Object> map, JsonInclude$Value jsonInclude$Value, JsonSetter$Value jsonSetter$Value, VisibilityChecker<?> visibilityChecker, Boolean bool, Boolean bool2) {
        this._overrides = map;
        this._defaultInclusion = jsonInclude$Value;
        this._defaultSetterInfo = jsonSetter$Value;
        this._visibilityChecker = visibilityChecker;
        this._defaultMergeable = bool;
        this._defaultLeniency = bool2;
    }
}
