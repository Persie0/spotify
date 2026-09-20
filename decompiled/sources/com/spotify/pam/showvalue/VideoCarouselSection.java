package com.spotify.pam.showvalue;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.chb1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class VideoCarouselSection extends AbstractC0269h implements sre0 {
    public static final int CARDS_FIELD_NUMBER = 3;
    private static final VideoCarouselSection DEFAULT_INSTANCE;
    public static final int HEADING_SUBTITLE_FIELD_NUMBER = 2;
    public static final int HEADING_TITLE_FIELD_NUMBER = 1;
    public static final int NAVIGATION_ACTION_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private CarouselAction navigationAction_;
    private String headingTitle_ = "";
    private String headingSubtitle_ = "";
    private ae50 cards_ = AbstractC0269h.emptyProtobufList();

    static {
        VideoCarouselSection videoCarouselSection = new VideoCarouselSection();
        DEFAULT_INSTANCE = videoCarouselSection;
        AbstractC0269h.registerDefaultInstance(VideoCarouselSection.class, videoCarouselSection);
    }

    private VideoCarouselSection() {
    }

    /* JADX INFO: renamed from: o */
    public static VideoCarouselSection m16334o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002ለ\u0000\u0003\u001b\u0004ဉ\u0001", new Object[]{"bitField0_", "headingTitle_", "headingSubtitle_", "cards_", VideoCard.class, "navigationAction_"});
        }
        if (iOrdinal == 3) {
            return new VideoCarouselSection();
        }
        if (iOrdinal == 4) {
            return new chb1(DEFAULT_INSTANCE, 11);
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
        synchronized (VideoCarouselSection.class) {
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
    public final ae50 m16335n() {
        return this.cards_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m16336p() {
        return this.headingSubtitle_;
    }

    /* JADX INFO: renamed from: q */
    public final String m16337q() {
        return this.headingTitle_;
    }

    /* JADX INFO: renamed from: r */
    public final CarouselAction m16338r() {
        CarouselAction carouselAction = this.navigationAction_;
        return carouselAction == null ? CarouselAction.m16274n() : carouselAction;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m16339s() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m16340t() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
