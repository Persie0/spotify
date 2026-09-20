package com.spotify.trending.p166v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qm71;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class TnyLocationSuggestion extends AbstractC0269h implements sre0 {
    public static final int CITY_NAME_FIELD_NUMBER = 2;
    public static final int COUNTRY_CODE_FIELD_NUMBER = 4;
    private static final TnyLocationSuggestion DEFAULT_INSTANCE;
    public static final int GEONAME_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REGION_FIELD_NUMBER = 3;
    private int geonameId_;
    private String cityName_ = "";
    private String region_ = "";
    private String countryCode_ = "";

    static {
        TnyLocationSuggestion tnyLocationSuggestion = new TnyLocationSuggestion();
        DEFAULT_INSTANCE = tnyLocationSuggestion;
        AbstractC0269h.registerDefaultInstance(TnyLocationSuggestion.class, tnyLocationSuggestion);
    }

    private TnyLocationSuggestion() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"geonameId_", "cityName_", "region_", "countryCode_"});
        }
        if (iOrdinal == 3) {
            return new TnyLocationSuggestion();
        }
        if (iOrdinal == 4) {
            return new qm71(DEFAULT_INSTANCE, 18);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        r2n0 r2n0Var = PARSER;
        if (r2n0Var != null) {
            return r2n0Var;
        }
        synchronized (TnyLocationSuggestion.class) {
            try {
                r110Var = PARSER;
                if (r110Var == null) {
                    r110Var = new r110(DEFAULT_INSTANCE);
                    PARSER = r110Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r110Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    /* JADX INFO: renamed from: n */
    public final String m21849n() {
        return this.cityName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m21850o() {
        return this.countryCode_;
    }

    /* JADX INFO: renamed from: p */
    public final int m21851p() {
        return this.geonameId_;
    }

    /* JADX INFO: renamed from: q */
    public final String m21852q() {
        return this.region_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
