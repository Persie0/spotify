package com.spotify.identity.proto.p081v3;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.FieldMask;
import p204p.l140;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class Identity$UserProfileUpdateRequest extends AbstractC0269h implements sre0 {
    private static final Identity$UserProfileUpdateRequest DEFAULT_INSTANCE;
    public static final int MASK_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int USER_PROFILE_FIELD_NUMBER = 2;
    private int bitField0_;
    private FieldMask mask_;
    private Identity$UserProfile userProfile_;

    static {
        Identity$UserProfileUpdateRequest identity$UserProfileUpdateRequest = new Identity$UserProfileUpdateRequest();
        DEFAULT_INSTANCE = identity$UserProfileUpdateRequest;
        AbstractC0269h.registerDefaultInstance(Identity$UserProfileUpdateRequest.class, identity$UserProfileUpdateRequest);
    }

    private Identity$UserProfileUpdateRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11954n(Identity$UserProfileUpdateRequest identity$UserProfileUpdateRequest, FieldMask fieldMask) {
        identity$UserProfileUpdateRequest.getClass();
        fieldMask.getClass();
        identity$UserProfileUpdateRequest.mask_ = fieldMask;
        identity$UserProfileUpdateRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m11955o(Identity$UserProfileUpdateRequest identity$UserProfileUpdateRequest, Identity$UserProfile identity$UserProfile) {
        identity$UserProfileUpdateRequest.getClass();
        identity$UserProfile.getClass();
        identity$UserProfileUpdateRequest.userProfile_ = identity$UserProfile;
        identity$UserProfileUpdateRequest.bitField0_ |= 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static l140 m11957q() {
        return (l140) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "mask_", "userProfile_"});
        }
        if (iOrdinal == 3) {
            return new Identity$UserProfileUpdateRequest();
        }
        if (iOrdinal == 4) {
            return new l140();
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
        synchronized (Identity$UserProfileUpdateRequest.class) {
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
