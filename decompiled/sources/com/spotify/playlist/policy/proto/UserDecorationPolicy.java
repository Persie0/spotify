package com.spotify.playlist.policy.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qoa1;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class UserDecorationPolicy extends AbstractC0269h implements sre0 {
    public static final int COLOR_FIELD_NUMBER = 6;
    private static final UserDecorationPolicy DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 4;
    public static final int LINK_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int THUMBNAIL_FIELD_NUMBER = 5;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private boolean color_;
    private boolean image_;
    private boolean link_;
    private boolean name_;
    private boolean thumbnail_;
    private boolean username_;

    static {
        UserDecorationPolicy userDecorationPolicy = new UserDecorationPolicy();
        DEFAULT_INSTANCE = userDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(UserDecorationPolicy.class, userDecorationPolicy);
    }

    private UserDecorationPolicy() {
    }

    /* JADX INFO: renamed from: n */
    public static void m18444n(UserDecorationPolicy userDecorationPolicy) {
        userDecorationPolicy.color_ = true;
    }

    /* JADX INFO: renamed from: o */
    public static void m18445o(UserDecorationPolicy userDecorationPolicy) {
        userDecorationPolicy.image_ = true;
    }

    /* JADX INFO: renamed from: p */
    public static void m18446p(UserDecorationPolicy userDecorationPolicy) {
        userDecorationPolicy.link_ = true;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m18447q(UserDecorationPolicy userDecorationPolicy) {
        userDecorationPolicy.name_ = true;
    }

    /* JADX INFO: renamed from: r */
    public static void m18448r(UserDecorationPolicy userDecorationPolicy) {
        userDecorationPolicy.thumbnail_ = true;
    }

    /* JADX INFO: renamed from: s */
    public static void m18449s(UserDecorationPolicy userDecorationPolicy) {
        userDecorationPolicy.username_ = true;
    }

    /* JADX INFO: renamed from: t */
    public static UserDecorationPolicy m18450t() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static qoa1 m18451u() {
        return (qoa1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007", new Object[]{"username_", "link_", "name_", "image_", "thumbnail_", "color_"});
        }
        if (iOrdinal == 3) {
            return new UserDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new qoa1(DEFAULT_INSTANCE);
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
        synchronized (UserDecorationPolicy.class) {
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
