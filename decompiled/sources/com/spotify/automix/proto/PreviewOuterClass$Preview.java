package com.spotify.automix.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.o9r0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class PreviewOuterClass$Preview extends AbstractC0269h implements sre0 {
    public static final int ARM_ID_FIELD_NUMBER = 13;
    public static final int AUTOMIX_MODE_FIELD_NUMBER = 3;
    public static final int CONTEXT_URI_FIELD_NUMBER = 12;
    public static final int CUEPOINTS_FIELD_NUMBER = 7;
    private static final PreviewOuterClass$Preview DEFAULT_INSTANCE;
    public static final int ITEM_SPEED_A_FIELD_NUMBER = 14;
    public static final int ITEM_SPEED_B_FIELD_NUMBER = 15;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYABLE_TRACK_URI_1_FIELD_NUMBER = 10;
    public static final int PLAYABLE_TRACK_URI_2_FIELD_NUMBER = 11;
    public static final int RELATIVE_START_POSITION_FIELD_NUMBER = 6;
    public static final int START_POSITION_MS_FIELD_NUMBER = 5;
    public static final int STOP_POSITION_MS_FIELD_NUMBER = 8;
    public static final int TRACK_URI_1_FIELD_NUMBER = 1;
    public static final int TRACK_URI_2_FIELD_NUMBER = 2;
    public static final int TRANSITION_RECIPE_FIELD_NUMBER = 9;
    public static final int TRANSITION_URI_FIELD_NUMBER = 4;
    private int bitField0_;
    private CuepointsOuterClass$Cuepoints cuepoints_;
    private double itemSpeedA_;
    private double itemSpeedB_;
    private boolean relativeStartPosition_;
    private long startPositionMs_;
    private long stopPositionMs_;
    private TransitionOuterClass$Transition transitionRecipe_;
    private String trackUri1_ = "";
    private String trackUri2_ = "";
    private String automixMode_ = "";
    private String transitionUri_ = "";
    private String playableTrackUri1_ = "";
    private String playableTrackUri2_ = "";
    private String contextUri_ = "";
    private String armId_ = "";

    static {
        PreviewOuterClass$Preview previewOuterClass$Preview = new PreviewOuterClass$Preview();
        DEFAULT_INSTANCE = previewOuterClass$Preview;
        AbstractC0269h.registerDefaultInstance(PreviewOuterClass$Preview.class, previewOuterClass$Preview);
    }

    private PreviewOuterClass$Preview() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3736n(PreviewOuterClass$Preview previewOuterClass$Preview, String str) {
        previewOuterClass$Preview.getClass();
        str.getClass();
        previewOuterClass$Preview.armId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m3737o(PreviewOuterClass$Preview previewOuterClass$Preview) {
        previewOuterClass$Preview.getClass();
        previewOuterClass$Preview.automixMode_ = "auto";
    }

    /* JADX INFO: renamed from: p */
    public static void m3738p(PreviewOuterClass$Preview previewOuterClass$Preview, String str) {
        previewOuterClass$Preview.getClass();
        str.getClass();
        previewOuterClass$Preview.contextUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m3739q(PreviewOuterClass$Preview previewOuterClass$Preview, double d) {
        previewOuterClass$Preview.itemSpeedA_ = d;
    }

    /* JADX INFO: renamed from: r */
    public static void m3740r(PreviewOuterClass$Preview previewOuterClass$Preview, double d) {
        previewOuterClass$Preview.itemSpeedB_ = d;
    }

    /* JADX INFO: renamed from: s */
    public static void m3741s(PreviewOuterClass$Preview previewOuterClass$Preview, String str) {
        previewOuterClass$Preview.getClass();
        str.getClass();
        previewOuterClass$Preview.playableTrackUri1_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m3742t(PreviewOuterClass$Preview previewOuterClass$Preview, String str) {
        previewOuterClass$Preview.getClass();
        str.getClass();
        previewOuterClass$Preview.playableTrackUri2_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m3743u(PreviewOuterClass$Preview previewOuterClass$Preview) {
        previewOuterClass$Preview.relativeStartPosition_ = true;
    }

    /* JADX INFO: renamed from: v */
    public static void m3744v(PreviewOuterClass$Preview previewOuterClass$Preview) {
        previewOuterClass$Preview.startPositionMs_ = 3000L;
    }

    /* JADX INFO: renamed from: w */
    public static void m3745w(PreviewOuterClass$Preview previewOuterClass$Preview, String str) {
        previewOuterClass$Preview.getClass();
        str.getClass();
        previewOuterClass$Preview.trackUri1_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m3746x(PreviewOuterClass$Preview previewOuterClass$Preview, String str) {
        previewOuterClass$Preview.getClass();
        str.getClass();
        previewOuterClass$Preview.trackUri2_ = str;
    }

    /* JADX INFO: renamed from: y */
    public static void m3747y(PreviewOuterClass$Preview previewOuterClass$Preview, TransitionOuterClass$Transition transitionOuterClass$Transition) {
        previewOuterClass$Preview.getClass();
        previewOuterClass$Preview.transitionRecipe_ = transitionOuterClass$Transition;
        previewOuterClass$Preview.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: z */
    public static o9r0 m3748z() {
        return (o9r0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0002\u0006\u0007\u0007ဉ\u0000\bဂ\u0001\tဉ\u0002\nȈ\u000bȈ\fȈ\rȈ\u000e\u0000\u000f\u0000", new Object[]{"bitField0_", "trackUri1_", "trackUri2_", "automixMode_", "transitionUri_", "startPositionMs_", "relativeStartPosition_", "cuepoints_", "stopPositionMs_", "transitionRecipe_", "playableTrackUri1_", "playableTrackUri2_", "contextUri_", "armId_", "itemSpeedA_", "itemSpeedB_"});
        }
        if (iOrdinal == 3) {
            return new PreviewOuterClass$Preview();
        }
        if (iOrdinal == 4) {
            return new o9r0(DEFAULT_INSTANCE);
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
        synchronized (PreviewOuterClass$Preview.class) {
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
