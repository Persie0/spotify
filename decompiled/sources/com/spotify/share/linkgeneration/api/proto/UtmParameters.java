package com.spotify.share.linkgeneration.api.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.i1b1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class UtmParameters extends AbstractC0269h implements sre0 {
    private static final UtmParameters DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int UTM_CAMPAIGN_FIELD_NUMBER = 1;
    public static final int UTM_CONTENT_FIELD_NUMBER = 5;
    public static final int UTM_MEDIUM_FIELD_NUMBER = 3;
    public static final int UTM_SOURCE_FIELD_NUMBER = 2;
    public static final int UTM_TERM_FIELD_NUMBER = 4;
    private String utmCampaign_ = "";
    private String utmSource_ = "";
    private String utmMedium_ = "";
    private String utmTerm_ = "";
    private String utmContent_ = "";

    static {
        UtmParameters utmParameters = new UtmParameters();
        DEFAULT_INSTANCE = utmParameters;
        AbstractC0269h.registerDefaultInstance(UtmParameters.class, utmParameters);
    }

    private UtmParameters() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21056n(UtmParameters utmParameters, String str) {
        utmParameters.getClass();
        str.getClass();
        utmParameters.utmCampaign_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m21057o(UtmParameters utmParameters, String str) {
        utmParameters.getClass();
        str.getClass();
        utmParameters.utmContent_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m21058p(UtmParameters utmParameters, String str) {
        utmParameters.getClass();
        str.getClass();
        utmParameters.utmMedium_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21059q(UtmParameters utmParameters, String str) {
        utmParameters.getClass();
        str.getClass();
        utmParameters.utmSource_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m21060r(UtmParameters utmParameters, String str) {
        utmParameters.getClass();
        str.getClass();
        utmParameters.utmTerm_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static i1b1 m21061s() {
        return (i1b1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"utmCampaign_", "utmSource_", "utmMedium_", "utmTerm_", "utmContent_"});
        }
        if (iOrdinal == 3) {
            return new UtmParameters();
        }
        if (iOrdinal == 4) {
            return new i1b1(DEFAULT_INSTANCE);
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
        synchronized (UtmParameters.class) {
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
