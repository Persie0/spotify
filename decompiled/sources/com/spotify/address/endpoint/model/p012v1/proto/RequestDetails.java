package com.spotify.address.endpoint.model.p012v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tuw0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class RequestDetails extends AbstractC0269h implements sre0 {
    public static final int ANDROID_APP_VERSION_FIELD_NUMBER = 4;
    public static final int AUTOCOMPLETE_ENABLED_FIELD_NUMBER = 6;
    public static final int CONFIGURATION_TYPE_FIELD_NUMBER = 1;
    public static final int COUNTRY_FIELD_NUMBER = 2;
    private static final RequestDetails DEFAULT_INSTANCE;
    public static final int LOCALE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int WEB_SDK_VERSION_FIELD_NUMBER = 5;
    private boolean autocompleteEnabled_;
    private Object version_;
    private int versionCase_ = 0;
    private String configurationType_ = "";
    private String country_ = "";
    private String locale_ = "";

    static {
        RequestDetails requestDetails = new RequestDetails();
        DEFAULT_INSTANCE = requestDetails;
        AbstractC0269h.registerDefaultInstance(RequestDetails.class, requestDetails);
    }

    private RequestDetails() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2442n(RequestDetails requestDetails) {
        requestDetails.autocompleteEnabled_ = true;
    }

    /* JADX INFO: renamed from: o */
    public static void m2443o(RequestDetails requestDetails, String str) {
        requestDetails.getClass();
        str.getClass();
        requestDetails.configurationType_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m2444p(RequestDetails requestDetails, String str) {
        requestDetails.getClass();
        str.getClass();
        requestDetails.country_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static RequestDetails m2445s() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static tuw0 m2446t() {
        return (tuw0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȼ\u0000\u0005Ȼ\u0000\u0006\u0007", new Object[]{"version_", "versionCase_", "configurationType_", "country_", "locale_", "autocompleteEnabled_"});
        }
        if (iOrdinal == 3) {
            return new RequestDetails();
        }
        if (iOrdinal == 4) {
            return new tuw0(DEFAULT_INSTANCE);
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
        synchronized (RequestDetails.class) {
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

    /* JADX INFO: renamed from: q */
    public final boolean m2447q() {
        return this.autocompleteEnabled_;
    }

    /* JADX INFO: renamed from: r */
    public final String m2448r() {
        return this.country_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
