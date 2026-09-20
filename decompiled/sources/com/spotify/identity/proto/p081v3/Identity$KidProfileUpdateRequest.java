package com.spotify.identity.proto.p081v3;

import com.google.protobuf.AbstractC0269h;
import p204p.h140;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class Identity$KidProfileUpdateRequest extends AbstractC0269h implements sre0 {
    public static final int ATTRIBUTES_FIELD_NUMBER = 2;
    private static final Identity$KidProfileUpdateRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private Identity$KidProfile attributes_;
    private int bitField0_;

    static {
        Identity$KidProfileUpdateRequest identity$KidProfileUpdateRequest = new Identity$KidProfileUpdateRequest();
        DEFAULT_INSTANCE = identity$KidProfileUpdateRequest;
        AbstractC0269h.registerDefaultInstance(Identity$KidProfileUpdateRequest.class, identity$KidProfileUpdateRequest);
    }

    private Identity$KidProfileUpdateRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11934n(Identity$KidProfileUpdateRequest identity$KidProfileUpdateRequest, Identity$KidProfile identity$KidProfile) {
        identity$KidProfileUpdateRequest.getClass();
        identity$KidProfile.getClass();
        identity$KidProfileUpdateRequest.attributes_ = identity$KidProfile;
        identity$KidProfileUpdateRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static h140 m11936p() {
        return (h140) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"bitField0_", "attributes_"});
        }
        if (iOrdinal == 3) {
            return new Identity$KidProfileUpdateRequest();
        }
        if (iOrdinal == 4) {
            return new h140();
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
        synchronized (Identity$KidProfileUpdateRequest.class) {
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
