package com.spotify.usergeopoints.p176v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uaa1;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class UpdateLocationRequest extends AbstractC0269h implements sre0 {
    public static final int ACCURACY_FIELD_NUMBER = 3;
    private static final UpdateLocationRequest DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LOCATION_CONTEXT_FIELD_NUMBER = 4;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private double accuracy_;
    private double latitude_;
    private String locationContext_ = "";
    private double longitude_;

    static {
        UpdateLocationRequest updateLocationRequest = new UpdateLocationRequest();
        DEFAULT_INSTANCE = updateLocationRequest;
        AbstractC0269h.registerDefaultInstance(UpdateLocationRequest.class, updateLocationRequest);
    }

    private UpdateLocationRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m22107n(UpdateLocationRequest updateLocationRequest, double d) {
        updateLocationRequest.accuracy_ = d;
    }

    /* JADX INFO: renamed from: o */
    public static void m22108o(UpdateLocationRequest updateLocationRequest, double d) {
        updateLocationRequest.latitude_ = d;
    }

    /* JADX INFO: renamed from: p */
    public static void m22109p(UpdateLocationRequest updateLocationRequest, String str) {
        updateLocationRequest.getClass();
        str.getClass();
        updateLocationRequest.locationContext_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m22110q(UpdateLocationRequest updateLocationRequest, double d) {
        updateLocationRequest.longitude_ = d;
    }

    /* JADX INFO: renamed from: s */
    public static uaa1 m22112s() {
        return (uaa1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\u0000\u0004Ȉ", new Object[]{"latitude_", "longitude_", "accuracy_", "locationContext_"});
        }
        if (iOrdinal == 3) {
            return new UpdateLocationRequest();
        }
        if (iOrdinal == 4) {
            return new uaa1();
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
        synchronized (UpdateLocationRequest.class) {
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
