package com.spotify.trending.p166v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ge91;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class TrendingLocationSignalPayload extends AbstractC0269h implements sre0 {
    public static final int CITY_NAME_FIELD_NUMBER = 2;
    public static final int COUNTRY_CODE_FIELD_NUMBER = 4;
    private static final TrendingLocationSignalPayload DEFAULT_INSTANCE;
    public static final int GEONAME_ID_FIELD_NUMBER = 1;
    public static final int LATITUDE_FIELD_NUMBER = 5;
    public static final int LONGITUDE_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int REFRESH_FIELD_NUMBER = 7;
    public static final int REGION_FIELD_NUMBER = 3;
    private int geonameId_;
    private double latitude_;
    private double longitude_;
    private boolean refresh_;
    private String cityName_ = "";
    private String region_ = "";
    private String countryCode_ = "";

    static {
        TrendingLocationSignalPayload trendingLocationSignalPayload = new TrendingLocationSignalPayload();
        DEFAULT_INSTANCE = trendingLocationSignalPayload;
        AbstractC0269h.registerDefaultInstance(TrendingLocationSignalPayload.class, trendingLocationSignalPayload);
    }

    private TrendingLocationSignalPayload() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21853n(TrendingLocationSignalPayload trendingLocationSignalPayload, String str) {
        trendingLocationSignalPayload.getClass();
        str.getClass();
        trendingLocationSignalPayload.cityName_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m21854o(TrendingLocationSignalPayload trendingLocationSignalPayload, int i) {
        trendingLocationSignalPayload.geonameId_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static void m21855p(TrendingLocationSignalPayload trendingLocationSignalPayload) {
        trendingLocationSignalPayload.refresh_ = true;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21856q(TrendingLocationSignalPayload trendingLocationSignalPayload, String str) {
        trendingLocationSignalPayload.getClass();
        trendingLocationSignalPayload.region_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static ge91 m21857r() {
        return (ge91) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0000\u0006\u0000\u0007\u0007", new Object[]{"geonameId_", "cityName_", "region_", "countryCode_", "latitude_", "longitude_", "refresh_"});
        }
        if (iOrdinal == 3) {
            return new TrendingLocationSignalPayload();
        }
        if (iOrdinal == 4) {
            return new ge91(DEFAULT_INSTANCE);
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
        synchronized (TrendingLocationSignalPayload.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
