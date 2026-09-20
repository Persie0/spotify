package com.spotify.liveroom.listeningparty.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.e45;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.wzl;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class CurrentUser extends AbstractC0269h implements sre0 {
    private static final CurrentUser DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 3;
    public static final int FEATURES_FIELD_NUMBER = 5;
    public static final int IMAGE_URL_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int USERNAME_FIELD_NUMBER = 1;
    public static final int USER_IDENTIFIER_FIELD_NUMBER = 2;
    private static final vd50 features_converter_ = new e45(5);
    private int bitField0_;
    private int featuresMemoizedSerializedSize;
    private UserIdentifier userIdentifier_;
    private String username_ = "";
    private String displayName_ = "";
    private String imageUrl_ = "";
    private ud50 features_ = AbstractC0269h.emptyIntList();

    static {
        CurrentUser currentUser = new CurrentUser();
        DEFAULT_INSTANCE = currentUser;
        AbstractC0269h.registerDefaultInstance(CurrentUser.class, currentUser);
    }

    private CurrentUser() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004Ȉ\u0005,", new Object[]{"bitField0_", "username_", "userIdentifier_", "displayName_", "imageUrl_", "features_"});
        }
        if (iOrdinal == 3) {
            return new CurrentUser();
        }
        if (iOrdinal == 4) {
            return new wzl(DEFAULT_INSTANCE, 5);
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
        synchronized (CurrentUser.class) {
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
