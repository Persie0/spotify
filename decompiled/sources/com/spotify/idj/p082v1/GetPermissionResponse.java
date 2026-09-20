package com.spotify.idj.p082v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ca10;
import p204p.onn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class GetPermissionResponse extends AbstractC0269h implements sre0 {
    public static final int ALLOWED_FIELD_NUMBER = 3;
    public static final int ATTRIBUTE_FIELD_NUMBER = 4;
    private static final GetPermissionResponse DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int UNUSED_FIELD_NUMBER = 1;
    private boolean allowed_;
    private boolean attribute_;
    private boolean key_;
    private int status_;
    private boolean unused_;

    static {
        GetPermissionResponse getPermissionResponse = new GetPermissionResponse();
        DEFAULT_INSTANCE = getPermissionResponse;
        AbstractC0269h.registerDefaultInstance(GetPermissionResponse.class, getPermissionResponse);
    }

    private GetPermissionResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\f\u0003\u0007\u0004\u0007\u0005\u0007", new Object[]{"unused_", "status_", "allowed_", "attribute_", "key_"});
        }
        if (iOrdinal == 3) {
            return new GetPermissionResponse();
        }
        if (iOrdinal == 4) {
            return new ca10(DEFAULT_INSTANCE, 0);
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
        synchronized (GetPermissionResponse.class) {
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
    public final boolean m11982n() {
        return this.allowed_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final onn0 m11983o() {
        onn0 onn0VarM67418a = onn0.m67418a(this.status_);
        return onn0VarM67418a == null ? onn0.UNRECOGNIZED : onn0VarM67418a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
