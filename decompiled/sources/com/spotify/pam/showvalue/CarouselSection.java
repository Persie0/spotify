package com.spotify.pam.showvalue;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.gjb;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class CarouselSection extends AbstractC0269h implements sre0 {
    private static final CarouselSection DEFAULT_INSTANCE;
    public static final int HEADING_SUBTITLE_FIELD_NUMBER = 2;
    public static final int HEADING_TITLE_FIELD_NUMBER = 1;
    public static final int NAVIGATION_ACTION_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int TRAILING_ACTION_FIELD_NUMBER = 5;
    public static final int URIS_FIELD_NUMBER = 3;
    private int bitField0_;
    private CarouselAction navigationAction_;
    private CarouselAction trailingAction_;
    private String headingTitle_ = "";
    private String headingSubtitle_ = "";
    private ae50 uris_ = AbstractC0269h.emptyProtobufList();

    static {
        CarouselSection carouselSection = new CarouselSection();
        DEFAULT_INSTANCE = carouselSection;
        AbstractC0269h.registerDefaultInstance(CarouselSection.class, carouselSection);
    }

    private CarouselSection() {
    }

    /* JADX INFO: renamed from: n */
    public static CarouselSection m16277n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002ለ\u0000\u0003Ț\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "headingTitle_", "headingSubtitle_", "uris_", "navigationAction_", "trailingAction_"});
        }
        if (iOrdinal == 3) {
            return new CarouselSection();
        }
        if (iOrdinal == 4) {
            return new gjb(DEFAULT_INSTANCE, 23);
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
        synchronized (CarouselSection.class) {
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

    public final List getUrisList() {
        return this.uris_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m16278o() {
        return this.headingSubtitle_;
    }

    /* JADX INFO: renamed from: p */
    public final String m16279p() {
        return this.headingTitle_;
    }

    /* JADX INFO: renamed from: q */
    public final CarouselAction m16280q() {
        CarouselAction carouselAction = this.navigationAction_;
        return carouselAction == null ? CarouselAction.m16274n() : carouselAction;
    }

    /* JADX INFO: renamed from: r */
    public final CarouselAction m16281r() {
        CarouselAction carouselAction = this.trailingAction_;
        return carouselAction == null ? CarouselAction.m16274n() : carouselAction;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m16282s() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m16283t() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m16284u() {
        return (this.bitField0_ & 4) != 0;
    }
}
