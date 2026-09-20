package com.spotify.playlist.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ioc;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class ClaimPermissionGrantResponse extends AbstractC0269h implements sre0 {
    public static final int CAPABILITIES_FIELD_NUMBER = 2;
    private static final ClaimPermissionGrantResponse DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int USER_PERMISSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private Capabilities capabilities_;
    private ae50 details_ = AbstractC0269h.emptyProtobufList();
    private Permission userPermission_;

    static {
        ClaimPermissionGrantResponse claimPermissionGrantResponse = new ClaimPermissionGrantResponse();
        DEFAULT_INSTANCE = claimPermissionGrantResponse;
        AbstractC0269h.registerDefaultInstance(ClaimPermissionGrantResponse.class, claimPermissionGrantResponse);
    }

    private ClaimPermissionGrantResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"bitField0_", "userPermission_", "capabilities_", "details_", PermissionGrantDetails.class});
        }
        if (iOrdinal == 3) {
            return new ClaimPermissionGrantResponse();
        }
        if (iOrdinal == 4) {
            return new ioc(DEFAULT_INSTANCE, 19);
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
        synchronized (ClaimPermissionGrantResponse.class) {
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
