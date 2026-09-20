package com.spotify.profile.editprofile.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gza1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class UserprofileviewV4$UpdateBioRequest extends AbstractC0269h implements sre0 {
    public static final int BIO_FIELD_NUMBER = 1;
    private static final UserprofileviewV4$UpdateBioRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private UserprofileviewV4$Bio bio_;
    private int bitField0_;

    static {
        UserprofileviewV4$UpdateBioRequest userprofileviewV4$UpdateBioRequest = new UserprofileviewV4$UpdateBioRequest();
        DEFAULT_INSTANCE = userprofileviewV4$UpdateBioRequest;
        AbstractC0269h.registerDefaultInstance(UserprofileviewV4$UpdateBioRequest.class, userprofileviewV4$UpdateBioRequest);
    }

    private UserprofileviewV4$UpdateBioRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19787n(UserprofileviewV4$UpdateBioRequest userprofileviewV4$UpdateBioRequest, UserprofileviewV4$Bio userprofileviewV4$Bio) {
        userprofileviewV4$UpdateBioRequest.getClass();
        userprofileviewV4$Bio.getClass();
        userprofileviewV4$UpdateBioRequest.bio_ = userprofileviewV4$Bio;
        userprofileviewV4$UpdateBioRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static gza1 m19788o() {
        return (gza1) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "bio_"});
        }
        if (iOrdinal == 3) {
            return new UserprofileviewV4$UpdateBioRequest();
        }
        if (iOrdinal == 4) {
            return new gza1(DEFAULT_INSTANCE);
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
        synchronized (UserprofileviewV4$UpdateBioRequest.class) {
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
