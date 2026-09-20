package com.spotify.playlist.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.c0n0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PermissionGrant extends AbstractC0269h implements sre0 {
    public static final int CREATED_AT_FIELD_NUMBER = 3;
    public static final int CREATED_BY_USERNAME_FIELD_NUMBER = 4;
    public static final int CREATED_BY_USER_ID_FIELD_NUMBER = 5;
    private static final PermissionGrant DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PERMISSION_GRANT_OPTIONS_FIELD_NUMBER = 2;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private int bitField0_;
    private Timestamp createdAt_;
    private PermissionGrantOptions permissionGrantOptions_;
    private String token_ = "";
    private String createdByUsername_ = "";
    private String createdByUserId_ = "";

    static {
        PermissionGrant permissionGrant = new PermissionGrant();
        DEFAULT_INSTANCE = permissionGrant;
        AbstractC0269h.registerDefaultInstance(PermissionGrant.class, permissionGrant);
    }

    private PermissionGrant() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "token_", "permissionGrantOptions_", "createdAt_", "createdByUsername_", "createdByUserId_"});
        }
        if (iOrdinal == 3) {
            return new PermissionGrant();
        }
        if (iOrdinal == 4) {
            return new c0n0(DEFAULT_INSTANCE, 29);
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
        synchronized (PermissionGrant.class) {
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
    public final PermissionGrantOptions m18519n() {
        PermissionGrantOptions permissionGrantOptions = this.permissionGrantOptions_;
        return permissionGrantOptions == null ? PermissionGrantOptions.m18528q() : permissionGrantOptions;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m18520o() {
        return this.token_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m18521p() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
