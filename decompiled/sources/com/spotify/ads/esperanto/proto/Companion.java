package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pof;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class Companion extends AbstractC0269h implements sre0 {
    public static final int CANVAS_IMAGE_FIELD_NUMBER = 1;
    public static final int CANVAS_VIDEO_FIELD_NUMBER = 2;
    public static final int CAROUSEL_FIELD_NUMBER = 4;
    private static final Companion DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SURVEY_FIELD_NUMBER = 3;
    private int typeCase_ = 0;
    private Object type_;

    static {
        Companion companion = new Companion();
        DEFAULT_INSTANCE = companion;
        AbstractC0269h.registerDefaultInstance(Companion.class, companion);
    }

    private Companion() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"type_", "typeCase_", CanvasImage.class, CanvasVideo.class, Survey.class, Carousel.class});
        }
        if (iOrdinal == 3) {
            return new Companion();
        }
        if (iOrdinal == 4) {
            return new pof(DEFAULT_INSTANCE, 5);
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
        synchronized (Companion.class) {
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
    public final CanvasImage m2627n() {
        return this.typeCase_ == 1 ? (CanvasImage) this.type_ : CanvasImage.m2599n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final CanvasVideo m2628o() {
        return this.typeCase_ == 2 ? (CanvasVideo) this.type_ : CanvasVideo.m2603n();
    }

    /* JADX INFO: renamed from: p */
    public final Carousel m2629p() {
        return this.typeCase_ == 4 ? (Carousel) this.type_ : Carousel.m2611o();
    }

    /* JADX INFO: renamed from: q */
    public final Survey m2630q() {
        return this.typeCase_ == 3 ? (Survey) this.type_ : Survey.m2716n();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m2631r() {
        return this.typeCase_ == 1;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m2632s() {
        return this.typeCase_ == 2;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m2633t() {
        return this.typeCase_ == 4;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m2634u() {
        return this.typeCase_ == 3;
    }
}
