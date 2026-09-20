package com.spotify.playlist.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.g6f0;
import p204p.hnn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PermissionGrantDescription extends AbstractC0269h implements sre0 {
    public static final int CAPABILITIES_FIELD_NUMBER = 4;
    public static final int CLAIM_FAIL_REASON_FIELD_NUMBER = 2;
    private static final PermissionGrantDescription DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 5;
    public static final int IS_EFFECTIVE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PERMISSION_GRANT_OPTIONS_FIELD_NUMBER = 1;
    private int bitField0_;
    private Capabilities capabilities_;
    private int claimFailReason_;
    private ae50 details_ = AbstractC0269h.emptyProtobufList();
    private boolean isEffective_;
    private PermissionGrantOptions permissionGrantOptions_;

    static {
        PermissionGrantDescription permissionGrantDescription = new PermissionGrantDescription();
        DEFAULT_INSTANCE = permissionGrantDescription;
        AbstractC0269h.registerDefaultInstance(PermissionGrantDescription.class, permissionGrantDescription);
    }

    private PermissionGrantDescription() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005\u001b", new Object[]{"bitField0_", "permissionGrantOptions_", "claimFailReason_", g6f0.f77034g, "isEffective_", "capabilities_", "details_", PermissionGrantDetails.class});
        }
        if (iOrdinal == 3) {
            return new PermissionGrantDescription();
        }
        if (iOrdinal == 4) {
            return new hnn0(DEFAULT_INSTANCE, 0);
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
        synchronized (PermissionGrantDescription.class) {
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

    public final Capabilities getCapabilities() {
        Capabilities capabilities = this.capabilities_;
        return capabilities == null ? Capabilities.m18456w() : capabilities;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final boolean hasCapabilities() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m18522n() {
        return this.isEffective_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final PermissionGrantOptions m18523o() {
        PermissionGrantOptions permissionGrantOptions = this.permissionGrantOptions_;
        return permissionGrantOptions == null ? PermissionGrantOptions.m18528q() : permissionGrantOptions;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m18524p() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
