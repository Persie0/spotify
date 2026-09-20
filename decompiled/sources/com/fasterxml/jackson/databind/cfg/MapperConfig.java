package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude$Value;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MapperConfig<T extends MapperConfig<T>> implements ClassIntrospector.MixInResolver, Serializable {
    protected final BaseSettings _base;
    protected final long _mapperFeatures;
    protected static final JsonInclude$Value EMPTY_INCLUDE = JsonInclude$Value.empty();
    protected static final JsonFormat.Value EMPTY_FORMAT = JsonFormat.Value.empty();

    public MapperConfig(BaseSettings baseSettings, long j) {
        this._base = baseSettings;
        this._mapperFeatures = j;
    }

    public static <F extends Enum<F> & ConfigFeature> int collectFeatureDefaults(Class<F> cls) {
        int mask = 0;
        for (Object obj : (Enum[]) cls.getEnumConstants()) {
            ConfigFeature configFeature = (ConfigFeature) obj;
            if (configFeature.enabledByDefault()) {
                mask |= configFeature.getMask();
            }
        }
        return mask;
    }

    public AnnotationIntrospector getAnnotationIntrospector() {
        return isEnabled(MapperFeature.USE_ANNOTATIONS) ? this._base.getAnnotationIntrospector() : NopAnnotationIntrospector.instance;
    }

    public final boolean isEnabled(MapperFeature mapperFeature) {
        return mapperFeature.enabledIn(this._mapperFeatures);
    }

    public MapperConfig(MapperConfig<T> mapperConfig, long j) {
        this._base = mapperConfig._base;
        this._mapperFeatures = j;
    }
}
