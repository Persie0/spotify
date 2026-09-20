package com.spotify.liveroom.listeningparty.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ie00;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.t36;
import p204p.ud50;
import p204p.vd50;
import p204p.wd50;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class GetAllowedFeaturesResponse extends AbstractC0269h implements sre0 {
    private static final GetAllowedFeaturesResponse DEFAULT_INSTANCE;
    public static final int FEATURES_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private static final vd50 features_converter_ = new t36(12);
    private int featuresMemoizedSerializedSize;
    private ud50 features_ = AbstractC0269h.emptyIntList();

    static {
        GetAllowedFeaturesResponse getAllowedFeaturesResponse = new GetAllowedFeaturesResponse();
        DEFAULT_INSTANCE = getAllowedFeaturesResponse;
        AbstractC0269h.registerDefaultInstance(GetAllowedFeaturesResponse.class, getAllowedFeaturesResponse);
    }

    private GetAllowedFeaturesResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"features_"});
        }
        if (iOrdinal == 3) {
            return new GetAllowedFeaturesResponse();
        }
        if (iOrdinal == 4) {
            return new ie00(DEFAULT_INSTANCE, 26);
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
        synchronized (GetAllowedFeaturesResponse.class) {
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
    public final wd50 m13070n() {
        return new wd50(this.features_, features_converter_);
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
