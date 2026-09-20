package com.spotify.identity.proto.p081v3;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Int32Value;
import p204p.g140;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class Identity$KidProfile extends AbstractC0269h implements sre0 {
    public static final int AVATAR_FIELD_NUMBER = 7;
    public static final int COLOR_FIELD_NUMBER = 6;
    public static final int DATE_OF_BIRTH_FIELD_NUMBER = 2;
    private static final Identity$KidProfile DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private Int32Value color_;
    private String name_ = "";
    private String dateOfBirth_ = "";
    private String avatar_ = "";

    static {
        Identity$KidProfile identity$KidProfile = new Identity$KidProfile();
        DEFAULT_INSTANCE = identity$KidProfile;
        AbstractC0269h.registerDefaultInstance(Identity$KidProfile.class, identity$KidProfile);
    }

    private Identity$KidProfile() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11931n(Identity$KidProfile identity$KidProfile, String str) {
        identity$KidProfile.getClass();
        str.getClass();
        identity$KidProfile.bitField0_ |= 2;
        identity$KidProfile.avatar_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m11932o(Identity$KidProfile identity$KidProfile, Int32Value int32Value) {
        identity$KidProfile.getClass();
        int32Value.getClass();
        identity$KidProfile.color_ = int32Value;
        identity$KidProfile.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static g140 m11933p() {
        return (g140) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0006ဉ\u0000\u0007ለ\u0001", new Object[]{"bitField0_", "name_", "dateOfBirth_", "color_", "avatar_"});
        }
        if (iOrdinal == 3) {
            return new Identity$KidProfile();
        }
        if (iOrdinal == 4) {
            return new g140(DEFAULT_INSTANCE);
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
        synchronized (Identity$KidProfile.class) {
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
