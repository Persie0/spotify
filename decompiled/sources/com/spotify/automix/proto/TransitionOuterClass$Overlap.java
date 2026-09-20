package com.spotify.automix.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.k991;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class TransitionOuterClass$Overlap extends AbstractC0269h implements sre0 {
    public static final int BPM_A_FIELD_NUMBER = 16;
    public static final int BPM_B_FIELD_NUMBER = 17;
    private static final TransitionOuterClass$Overlap DEFAULT_INSTANCE;
    public static final int DURATION_BARS_FIELD_NUMBER = 8;
    public static final int DURATION_MS_FIELD_NUMBER = 5;
    public static final int IS_BEATMATCHED_FIELD_NUMBER = 9;
    public static final int ITEM_SPEED_A_FIELD_NUMBER = 18;
    public static final int ITEM_SPEED_B_FIELD_NUMBER = 19;
    private static volatile r2n0 PARSER = null;
    public static final int SPEED_A_FIELD_NUMBER = 6;
    public static final int SPEED_B_FIELD_NUMBER = 7;
    public static final int START_A_MS_FIELD_NUMBER = 3;
    public static final int START_B_MS_FIELD_NUMBER = 4;
    public static final int TRACK_A_PLAYABLE_BEATS_HASH_FIELD_NUMBER = 14;
    public static final int TRACK_A_PLAYABLE_URI_FIELD_NUMBER = 12;
    public static final int TRACK_A_ROW_ID_FIELD_NUMBER = 1;
    public static final int TRACK_A_URI_FIELD_NUMBER = 10;
    public static final int TRACK_B_PLAYABLE_BEATS_HASH_FIELD_NUMBER = 15;
    public static final int TRACK_B_PLAYABLE_URI_FIELD_NUMBER = 13;
    public static final int TRACK_B_ROW_ID_FIELD_NUMBER = 2;
    public static final int TRACK_B_URI_FIELD_NUMBER = 11;
    private int bitField0_;
    private float bpmA_;
    private float bpmB_;
    private int durationBars_;
    private int durationMs_;
    private boolean isBeatmatched_;
    private double itemSpeedA_;
    private double itemSpeedB_;
    private float speedA_;
    private float speedB_;
    private int startAMs_;
    private int startBMs_;
    private String trackARowId_ = "";
    private String trackBRowId_ = "";
    private String trackAUri_ = "";
    private String trackBUri_ = "";
    private String trackAPlayableUri_ = "";
    private String trackBPlayableUri_ = "";
    private String trackAPlayableBeatsHash_ = "";
    private String trackBPlayableBeatsHash_ = "";

    static {
        TransitionOuterClass$Overlap transitionOuterClass$Overlap = new TransitionOuterClass$Overlap();
        DEFAULT_INSTANCE = transitionOuterClass$Overlap;
        AbstractC0269h.registerDefaultInstance(TransitionOuterClass$Overlap.class, transitionOuterClass$Overlap);
    }

    private TransitionOuterClass$Overlap() {
    }

    /* JADX INFO: renamed from: A */
    public static void m3850A(TransitionOuterClass$Overlap transitionOuterClass$Overlap, String str) {
        transitionOuterClass$Overlap.getClass();
        str.getClass();
        transitionOuterClass$Overlap.trackARowId_ = str;
    }

    /* JADX INFO: renamed from: B */
    public static void m3851B(TransitionOuterClass$Overlap transitionOuterClass$Overlap, String str) {
        transitionOuterClass$Overlap.getClass();
        str.getClass();
        transitionOuterClass$Overlap.trackAUri_ = str;
    }

    /* JADX INFO: renamed from: C */
    public static void m3852C(TransitionOuterClass$Overlap transitionOuterClass$Overlap, String str) {
        transitionOuterClass$Overlap.getClass();
        str.getClass();
        transitionOuterClass$Overlap.trackBPlayableBeatsHash_ = str;
    }

    /* JADX INFO: renamed from: D */
    public static void m3853D(TransitionOuterClass$Overlap transitionOuterClass$Overlap, String str) {
        transitionOuterClass$Overlap.getClass();
        str.getClass();
        transitionOuterClass$Overlap.trackBPlayableUri_ = str;
    }

    /* JADX INFO: renamed from: E */
    public static void m3854E(TransitionOuterClass$Overlap transitionOuterClass$Overlap, String str) {
        transitionOuterClass$Overlap.getClass();
        str.getClass();
        transitionOuterClass$Overlap.trackBRowId_ = str;
    }

    /* JADX INFO: renamed from: F */
    public static void m3855F(TransitionOuterClass$Overlap transitionOuterClass$Overlap, String str) {
        transitionOuterClass$Overlap.getClass();
        str.getClass();
        transitionOuterClass$Overlap.trackBUri_ = str;
    }

    /* JADX INFO: renamed from: I */
    public static TransitionOuterClass$Overlap m3856I() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: d0 */
    public static k991 m3857d0() {
        return (k991) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m3858n(TransitionOuterClass$Overlap transitionOuterClass$Overlap, float f) {
        transitionOuterClass$Overlap.bpmA_ = f;
    }

    /* JADX INFO: renamed from: o */
    public static void m3859o(TransitionOuterClass$Overlap transitionOuterClass$Overlap, float f) {
        transitionOuterClass$Overlap.bpmB_ = f;
    }

    /* JADX INFO: renamed from: p */
    public static void m3860p(TransitionOuterClass$Overlap transitionOuterClass$Overlap, int i) {
        transitionOuterClass$Overlap.bitField0_ |= 4;
        transitionOuterClass$Overlap.durationBars_ = i;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m3861q(TransitionOuterClass$Overlap transitionOuterClass$Overlap, int i) {
        transitionOuterClass$Overlap.durationMs_ = i;
    }

    /* JADX INFO: renamed from: r */
    public static void m3862r(TransitionOuterClass$Overlap transitionOuterClass$Overlap, boolean z) {
        transitionOuterClass$Overlap.isBeatmatched_ = z;
    }

    /* JADX INFO: renamed from: s */
    public static void m3863s(TransitionOuterClass$Overlap transitionOuterClass$Overlap, double d) {
        transitionOuterClass$Overlap.itemSpeedA_ = d;
    }

    /* JADX INFO: renamed from: t */
    public static void m3864t(TransitionOuterClass$Overlap transitionOuterClass$Overlap, double d) {
        transitionOuterClass$Overlap.itemSpeedB_ = d;
    }

    /* JADX INFO: renamed from: u */
    public static void m3865u(TransitionOuterClass$Overlap transitionOuterClass$Overlap, float f) {
        transitionOuterClass$Overlap.bitField0_ |= 1;
        transitionOuterClass$Overlap.speedA_ = f;
    }

    /* JADX INFO: renamed from: v */
    public static void m3866v(TransitionOuterClass$Overlap transitionOuterClass$Overlap, float f) {
        transitionOuterClass$Overlap.bitField0_ |= 2;
        transitionOuterClass$Overlap.speedB_ = f;
    }

    /* JADX INFO: renamed from: w */
    public static void m3867w(TransitionOuterClass$Overlap transitionOuterClass$Overlap, int i) {
        transitionOuterClass$Overlap.startAMs_ = i;
    }

    /* JADX INFO: renamed from: x */
    public static void m3868x(TransitionOuterClass$Overlap transitionOuterClass$Overlap, int i) {
        transitionOuterClass$Overlap.startBMs_ = i;
    }

    /* JADX INFO: renamed from: y */
    public static void m3869y(TransitionOuterClass$Overlap transitionOuterClass$Overlap, String str) {
        transitionOuterClass$Overlap.getClass();
        str.getClass();
        transitionOuterClass$Overlap.trackAPlayableBeatsHash_ = str;
    }

    /* JADX INFO: renamed from: z */
    public static void m3870z(TransitionOuterClass$Overlap transitionOuterClass$Overlap, String str) {
        transitionOuterClass$Overlap.getClass();
        str.getClass();
        transitionOuterClass$Overlap.trackAPlayableUri_ = str;
    }

    /* JADX INFO: renamed from: G */
    public final float m3871G() {
        return this.bpmA_;
    }

    /* JADX INFO: renamed from: H */
    public final float m3872H() {
        return this.bpmB_;
    }

    /* JADX INFO: renamed from: J */
    public final int m3873J() {
        return this.durationBars_;
    }

    /* JADX INFO: renamed from: K */
    public final int m3874K() {
        return this.durationMs_;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m3875L() {
        return this.isBeatmatched_;
    }

    /* JADX INFO: renamed from: M */
    public final double m3876M() {
        return this.itemSpeedA_;
    }

    /* JADX INFO: renamed from: N */
    public final double m3877N() {
        return this.itemSpeedB_;
    }

    /* JADX INFO: renamed from: O */
    public final float m3878O() {
        return this.speedA_;
    }

    /* JADX INFO: renamed from: P */
    public final float m3879P() {
        return this.speedB_;
    }

    /* JADX INFO: renamed from: Q */
    public final int m3880Q() {
        return this.startAMs_;
    }

    /* JADX INFO: renamed from: R */
    public final int m3881R() {
        return this.startBMs_;
    }

    /* JADX INFO: renamed from: S */
    public final String m3882S() {
        return this.trackAPlayableBeatsHash_;
    }

    /* JADX INFO: renamed from: T */
    public final String m3883T() {
        return this.trackAPlayableUri_;
    }

    /* JADX INFO: renamed from: U */
    public final String m3884U() {
        return this.trackARowId_;
    }

    /* JADX INFO: renamed from: V */
    public final String m3885V() {
        return this.trackAUri_;
    }

    /* JADX INFO: renamed from: W */
    public final String m3886W() {
        return this.trackBPlayableBeatsHash_;
    }

    /* JADX INFO: renamed from: X */
    public final String m3887X() {
        return this.trackBPlayableUri_;
    }

    /* JADX INFO: renamed from: Y */
    public final String m3888Y() {
        return this.trackBRowId_;
    }

    /* JADX INFO: renamed from: Z */
    public final String m3889Z() {
        return this.trackBUri_;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m3890a0() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m3891b0() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m3892c0() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0004\u0005\u0004\u0006ခ\u0000\u0007ခ\u0001\bင\u0002\t\u0007\nȈ\u000bȈ\fȈ\rȈ\u000eȈ\u000fȈ\u0010\u0001\u0011\u0001\u0012\u0000\u0013\u0000", new Object[]{"bitField0_", "trackARowId_", "trackBRowId_", "startAMs_", "startBMs_", "durationMs_", "speedA_", "speedB_", "durationBars_", "isBeatmatched_", "trackAUri_", "trackBUri_", "trackAPlayableUri_", "trackBPlayableUri_", "trackAPlayableBeatsHash_", "trackBPlayableBeatsHash_", "bpmA_", "bpmB_", "itemSpeedA_", "itemSpeedB_"});
        }
        if (iOrdinal == 3) {
            return new TransitionOuterClass$Overlap();
        }
        if (iOrdinal == 4) {
            return new k991(DEFAULT_INSTANCE);
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
        synchronized (TransitionOuterClass$Overlap.class) {
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
