package com.spotify.playlist.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.jnn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class PermissionGrantOptions extends AbstractC0269h implements sre0 {
    private static final PermissionGrantOptions DEFAULT_INSTANCE;
    public static final int MAX_USAGES_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 1;
    public static final int TTL_MS_FIELD_NUMBER = 2;
    private int bitField0_;
    private long maxUsages_;
    private Permission permission_;
    private long ttlMs_;

    static {
        PermissionGrantOptions permissionGrantOptions = new PermissionGrantOptions();
        DEFAULT_INSTANCE = permissionGrantOptions;
        AbstractC0269h.registerDefaultInstance(PermissionGrantOptions.class, permissionGrantOptions);
    }

    private PermissionGrantOptions() {
    }

    /* JADX INFO: renamed from: n */
    public static void m18525n(PermissionGrantOptions permissionGrantOptions, Permission permission) {
        permissionGrantOptions.getClass();
        permission.getClass();
        permissionGrantOptions.permission_ = permission;
        permissionGrantOptions.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m18526o(PermissionGrantOptions permissionGrantOptions, long j) {
        permissionGrantOptions.bitField0_ |= 2;
        permissionGrantOptions.ttlMs_ = j;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static PermissionGrantOptions m18528q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static jnn0 m18529u() {
        return (jnn0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "permission_", "ttlMs_", "maxUsages_"});
        }
        if (iOrdinal == 3) {
            return new PermissionGrantOptions();
        }
        if (iOrdinal == 4) {
            return new jnn0();
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
        synchronized (PermissionGrantOptions.class) {
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

    /* JADX INFO: renamed from: r */
    public final Permission m18530r() {
        Permission permission = this.permission_;
        return permission == null ? Permission.m18513r() : permission;
    }

    /* JADX INFO: renamed from: s */
    public final long m18531s() {
        return this.ttlMs_;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m18532t() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
