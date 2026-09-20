package com.spotify.speedpreview.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.p541;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class SpeedPreviewOuterClass$SpeedPreview extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_URI_FIELD_NUMBER = 6;
    private static final SpeedPreviewOuterClass$SpeedPreview DEFAULT_INSTANCE;
    public static final int END_POSITION_MS_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PITCH_FACTOR_FIELD_NUMBER = 3;
    public static final int SPEED_MULTIPLIER_FIELD_NUMBER = 2;
    public static final int START_POSITION_MS_FIELD_NUMBER = 4;
    public static final int TRACK_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private long endPositionMs_;
    private double pitchFactor_;
    private double speedMultiplier_;
    private long startPositionMs_;
    private String trackUri_ = "";
    private String contextUri_ = "";

    static {
        SpeedPreviewOuterClass$SpeedPreview speedPreviewOuterClass$SpeedPreview = new SpeedPreviewOuterClass$SpeedPreview();
        DEFAULT_INSTANCE = speedPreviewOuterClass$SpeedPreview;
        AbstractC0269h.registerDefaultInstance(SpeedPreviewOuterClass$SpeedPreview.class, speedPreviewOuterClass$SpeedPreview);
    }

    private SpeedPreviewOuterClass$SpeedPreview() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21525n(SpeedPreviewOuterClass$SpeedPreview speedPreviewOuterClass$SpeedPreview) {
        speedPreviewOuterClass$SpeedPreview.getClass();
        speedPreviewOuterClass$SpeedPreview.contextUri_ = "spotify:speed-control:preview";
    }

    /* JADX INFO: renamed from: o */
    public static void m21526o(SpeedPreviewOuterClass$SpeedPreview speedPreviewOuterClass$SpeedPreview) {
        speedPreviewOuterClass$SpeedPreview.bitField0_ |= 4;
        speedPreviewOuterClass$SpeedPreview.endPositionMs_ = 30000L;
    }

    /* JADX INFO: renamed from: p */
    public static void m21527p(SpeedPreviewOuterClass$SpeedPreview speedPreviewOuterClass$SpeedPreview, double d) {
        speedPreviewOuterClass$SpeedPreview.speedMultiplier_ = d;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21528q(SpeedPreviewOuterClass$SpeedPreview speedPreviewOuterClass$SpeedPreview) {
        speedPreviewOuterClass$SpeedPreview.bitField0_ |= 2;
        speedPreviewOuterClass$SpeedPreview.startPositionMs_ = 0L;
    }

    /* JADX INFO: renamed from: r */
    public static void m21529r(SpeedPreviewOuterClass$SpeedPreview speedPreviewOuterClass$SpeedPreview, String str) {
        speedPreviewOuterClass$SpeedPreview.getClass();
        str.getClass();
        speedPreviewOuterClass$SpeedPreview.trackUri_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static p541 m21530s() {
        return (p541) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0000\u0003က\u0000\u0004ဂ\u0001\u0005ဂ\u0002\u0006Ȉ", new Object[]{"bitField0_", "trackUri_", "speedMultiplier_", "pitchFactor_", "startPositionMs_", "endPositionMs_", "contextUri_"});
        }
        if (iOrdinal == 3) {
            return new SpeedPreviewOuterClass$SpeedPreview();
        }
        if (iOrdinal == 4) {
            return new p541(DEFAULT_INSTANCE);
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
        synchronized (SpeedPreviewOuterClass$SpeedPreview.class) {
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
