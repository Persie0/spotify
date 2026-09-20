package com.spotify.kidsview.p092v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.C1900gk;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class AccountControls extends AbstractC0269h implements sre0 {
    public static final int ALLOW_ACTIVITY_ON_PROFILE_FIELD_NUMBER = 5;
    public static final int ALLOW_EXPLICIT_CONTENT_FIELD_NUMBER = 1;
    public static final int ALLOW_LISTENING_ACTIVITY_FIELD_NUMBER = 7;
    public static final int ALLOW_MESSAGES_FIELD_NUMBER = 6;
    public static final int ALLOW_PLAYLISTS_PUBLIC_BY_DEFAULT_FIELD_NUMBER = 4;
    public static final int ALLOW_VIDEO_AND_CANVAS_FIELD_NUMBER = 2;
    private static final AccountControls DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int VIDEO_CONTROLS_FIELD_NUMBER = 3;
    private boolean allowActivityOnProfile_;
    private boolean allowExplicitContent_;
    private boolean allowListeningActivity_;
    private boolean allowMessages_;
    private boolean allowPlaylistsPublicByDefault_;
    private int bitField0_;
    private int videoSettingCase_ = 0;
    private Object videoSetting_;

    static {
        AccountControls accountControls = new AccountControls();
        DEFAULT_INSTANCE = accountControls;
        AbstractC0269h.registerDefaultInstance(AccountControls.class, accountControls);
    }

    private AccountControls() {
    }

    /* JADX INFO: renamed from: H */
    public static C1900gk m12466H() {
        return (C1900gk) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m12467n(AccountControls accountControls, boolean z) {
        accountControls.bitField0_ |= 4;
        accountControls.allowActivityOnProfile_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m12468o(AccountControls accountControls, boolean z) {
        accountControls.bitField0_ |= 1;
        accountControls.allowExplicitContent_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m12469p(AccountControls accountControls, boolean z) {
        accountControls.bitField0_ |= 16;
        accountControls.allowListeningActivity_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m12470q(AccountControls accountControls, boolean z) {
        accountControls.bitField0_ |= 8;
        accountControls.allowMessages_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static void m12471r(AccountControls accountControls, boolean z) {
        accountControls.bitField0_ |= 2;
        accountControls.allowPlaylistsPublicByDefault_ = z;
    }

    /* JADX INFO: renamed from: s */
    public static void m12472s(AccountControls accountControls, boolean z) {
        accountControls.videoSettingCase_ = 2;
        accountControls.videoSetting_ = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: t */
    public static void m12473t(AccountControls accountControls, VideoControls videoControls) {
        accountControls.getClass();
        videoControls.getClass();
        accountControls.videoSetting_ = videoControls;
        accountControls.videoSettingCase_ = 3;
    }

    /* JADX INFO: renamed from: z */
    public static AccountControls m12474z() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final VideoControls m12475A() {
        return this.videoSettingCase_ == 3 ? (VideoControls) this.videoSetting_ : VideoControls.m12521t();
    }

    /* JADX INFO: renamed from: B */
    public final boolean m12476B() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m12477C() {
        return (this.bitField0_ & 16) != 0;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m12478D() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m12479E() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m12480F() {
        return this.videoSettingCase_ == 2;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m12481G() {
        return this.videoSettingCase_ == 3;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002:\u0000\u0003<\u0000\u0004ဇ\u0001\u0005ဇ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"videoSetting_", "videoSettingCase_", "bitField0_", "allowExplicitContent_", VideoControls.class, "allowPlaylistsPublicByDefault_", "allowActivityOnProfile_", "allowMessages_", "allowListeningActivity_"});
        }
        if (iOrdinal == 3) {
            return new AccountControls();
        }
        if (iOrdinal == 4) {
            return new C1900gk(DEFAULT_INSTANCE);
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
        synchronized (AccountControls.class) {
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

    public final boolean getAllowExplicitContent() {
        return this.allowExplicitContent_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final boolean hasAllowExplicitContent() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m12482u() {
        return this.allowActivityOnProfile_;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m12483v() {
        return this.allowListeningActivity_;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m12484w() {
        return this.allowMessages_;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m12485x() {
        return this.allowPlaylistsPublicByDefault_;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m12486y() {
        if (this.videoSettingCase_ == 2) {
            return ((Boolean) this.videoSetting_).booleanValue();
        }
        return false;
    }
}
