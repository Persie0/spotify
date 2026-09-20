package com.spotify.kidsaccount.api.p083v2.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Int32Value;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.t3r0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class Profile extends AbstractC0269h implements sre0 {
    public static final int ALLOWED_IN_MUSIC_APP_FIELD_NUMBER = 3;
    public static final int AVATAR_FIELD_NUMBER = 4;
    public static final int COLOR_FIELD_NUMBER = 6;
    public static final int DATE_OF_BIRTH_FIELD_NUMBER = 2;
    private static final Profile DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int V2_AVATAR_FIELD_NUMBER = 5;
    private boolean allowedInMusicApp_;
    private int bitField0_;
    private Int32Value color_;
    private int v2Avatar_;
    private String name_ = "";
    private String dateOfBirth_ = "";
    private String avatar_ = "";

    static {
        Profile profile = new Profile();
        DEFAULT_INSTANCE = profile;
        AbstractC0269h.registerDefaultInstance(Profile.class, profile);
    }

    private Profile() {
    }

    /* JADX INFO: renamed from: n */
    public static Profile m12097n() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005ဌ\u0000\u0006ဉ\u0001", new Object[]{"bitField0_", "name_", "dateOfBirth_", "allowedInMusicApp_", "avatar_", "v2Avatar_", "color_"});
        }
        if (iOrdinal == 3) {
            return new Profile();
        }
        if (iOrdinal == 4) {
            return new t3r0(DEFAULT_INSTANCE, 18);
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
        synchronized (Profile.class) {
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

    public final boolean getAllowedInMusicApp() {
        return this.allowedInMusicApp_;
    }

    public final Int32Value getColor() {
        Int32Value int32Value = this.color_;
        return int32Value == null ? Int32Value.m1943p() : int32Value;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getName() {
        return this.name_;
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
