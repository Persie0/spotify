package com.spotify.kidsview.p092v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.lsb1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class VideoControls extends AbstractC0269h implements sre0 {
    public static final int ALLOW_CANVAS_FIELD_NUMBER = 2;
    public static final int ALLOW_MUSIC_VIDEO_FIELD_NUMBER = 1;
    public static final int ALLOW_OTHER_VIDEO_FIELD_NUMBER = 3;
    private static final VideoControls DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private boolean allowCanvas_;
    private boolean allowMusicVideo_;
    private boolean allowOtherVideo_;
    private int bitField0_;

    static {
        VideoControls videoControls = new VideoControls();
        DEFAULT_INSTANCE = videoControls;
        AbstractC0269h.registerDefaultInstance(VideoControls.class, videoControls);
    }

    private VideoControls() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12518n(VideoControls videoControls, boolean z) {
        videoControls.bitField0_ |= 2;
        videoControls.allowCanvas_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m12519o(VideoControls videoControls, boolean z) {
        videoControls.bitField0_ |= 1;
        videoControls.allowMusicVideo_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m12520p(VideoControls videoControls, boolean z) {
        videoControls.bitField0_ |= 4;
        videoControls.allowOtherVideo_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: t */
    public static VideoControls m12521t() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static lsb1 m12522x() {
        return (lsb1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "allowMusicVideo_", "allowCanvas_", "allowOtherVideo_"});
        }
        if (iOrdinal == 3) {
            return new VideoControls();
        }
        if (iOrdinal == 4) {
            return new lsb1(DEFAULT_INSTANCE);
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
        synchronized (VideoControls.class) {
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

    /* JADX INFO: renamed from: q */
    public final boolean m12523q() {
        return this.allowCanvas_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m12524r() {
        return this.allowMusicVideo_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m12525s() {
        return this.allowOtherVideo_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m12526u() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m12527v() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m12528w() {
        return (this.bitField0_ & 4) != 0;
    }
}
