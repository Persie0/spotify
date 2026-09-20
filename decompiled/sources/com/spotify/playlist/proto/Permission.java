package com.spotify.playlist.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.g6f0;
import p204p.gva;
import p204p.knn0;
import p204p.mmn0;
import p204p.nnn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class Permission extends AbstractC0269h implements sre0 {
    public static final int AUDIT_FIELD_NUMBER = 6;
    private static final Permission DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PERMISSION_LEVEL_FIELD_NUMBER = 2;
    public static final int PERMISSION_LEVEL_STATE_FIELD_NUMBER = 3;
    public static final int REVISION_FIELD_NUMBER = 1;
    private Audit audit_;
    private int bitField0_;
    private int permissionLevelState_;
    private int permissionLevel_;
    private gva revision_ = gva.f84678b;

    static {
        Permission permission = new Permission();
        DEFAULT_INSTANCE = permission;
        AbstractC0269h.registerDefaultInstance(Permission.class, permission);
    }

    private Permission() {
    }

    /* JADX INFO: renamed from: n */
    public static void m18509n(Permission permission, knn0 knn0Var) {
        permission.getClass();
        permission.permissionLevel_ = knn0Var.f124447a;
        permission.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m18510o(Permission permission) {
        permission.getClass();
        permission.permissionLevelState_ = 2;
        permission.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: p */
    public static void m18511p(Permission permission, gva gvaVar) {
        permission.getClass();
        gvaVar.getClass();
        permission.bitField0_ |= 1;
        permission.revision_ = gvaVar;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static Permission m18513r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static mmn0 m18514w() {
        return (mmn0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002᠌\u0001\u0003᠌\u0002\u0006ဉ\u0003", new Object[]{"bitField0_", "revision_", "permissionLevel_", g6f0.f77035h, "permissionLevelState_", g6f0.f77036i, "audit_"});
        }
        if (iOrdinal == 3) {
            return new Permission();
        }
        if (iOrdinal == 4) {
            return new mmn0();
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
        synchronized (Permission.class) {
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

    public final gva getRevision() {
        return this.revision_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: s */
    public final knn0 m18515s() {
        knn0 knn0VarM56948a = knn0.m56948a(this.permissionLevel_);
        return knn0VarM56948a == null ? knn0.UNKNOWN : knn0VarM56948a;
    }

    /* JADX INFO: renamed from: t */
    public final nnn0 m18516t() {
        nnn0 nnn0VarM65212a = nnn0.m65212a(this.permissionLevelState_);
        return nnn0VarM65212a == null ? nnn0.PERMISSION_LEVEL_STATE_UNSPECIFIED : nnn0VarM65212a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m18517u() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m18518v() {
        return (this.bitField0_ & 4) != 0;
    }
}
