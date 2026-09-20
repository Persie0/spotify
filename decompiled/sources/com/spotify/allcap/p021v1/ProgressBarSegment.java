package com.spotify.allcap.p021v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.t3r0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class ProgressBarSegment extends AbstractC0269h implements sre0 {
    private static final ProgressBarSegment DEFAULT_INSTANCE;
    public static final int LABEL_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PROGRESS_BAR_COLOR_FIELD_NUMBER = 3;
    public static final int USED_PERCENTAGE_FIELD_NUMBER = 1;
    public static final int WIDTH_PERCENTAGE_FIELD_NUMBER = 4;
    private int bitField0_;
    private String label_ = "";
    private String progressBarColor_ = "";
    private float usedPercentage_;
    private float widthPercentage_;

    static {
        ProgressBarSegment progressBarSegment = new ProgressBarSegment();
        DEFAULT_INSTANCE = progressBarSegment;
        AbstractC0269h.registerDefaultInstance(ProgressBarSegment.class, progressBarSegment);
    }

    private ProgressBarSegment() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002Ȉ\u0003ለ\u0000\u0004ခ\u0001", new Object[]{"bitField0_", "usedPercentage_", "label_", "progressBarColor_", "widthPercentage_"});
        }
        if (iOrdinal == 3) {
            return new ProgressBarSegment();
        }
        if (iOrdinal == 4) {
            return new t3r0(DEFAULT_INSTANCE, 27);
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
        synchronized (ProgressBarSegment.class) {
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

    /* JADX INFO: renamed from: n */
    public final String m3244n() {
        return this.label_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m3245o() {
        return this.progressBarColor_;
    }

    /* JADX INFO: renamed from: p */
    public final float m3246p() {
        return this.usedPercentage_;
    }

    /* JADX INFO: renamed from: q */
    public final float m3247q() {
        return this.widthPercentage_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m3248r() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
