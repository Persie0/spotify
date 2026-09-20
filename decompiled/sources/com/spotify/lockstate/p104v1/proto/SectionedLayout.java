package com.spotify.lockstate.p104v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.h8z0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class SectionedLayout extends AbstractC0269h implements sre0 {
    public static final int BANNER_TITLE_FIELD_NUMBER = 1;
    private static final SectionedLayout DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SECTIONS_FIELD_NUMBER = 4;
    public static final int TITLE_COLOR_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String bannerTitle_ = "";
    private String title_ = "";
    private String titleColor_ = "";
    private ae50 sections_ = AbstractC0269h.emptyProtobufList();

    static {
        SectionedLayout sectionedLayout = new SectionedLayout();
        DEFAULT_INSTANCE = sectionedLayout;
        AbstractC0269h.registerDefaultInstance(SectionedLayout.class, sectionedLayout);
    }

    private SectionedLayout() {
    }

    /* JADX INFO: renamed from: o */
    public static SectionedLayout m13256o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ለ\u0000\u0002Ȉ\u0003ለ\u0001\u0004\u001b", new Object[]{"bitField0_", "bannerTitle_", "title_", "titleColor_", "sections_", LockSection.class});
        }
        if (iOrdinal == 3) {
            return new SectionedLayout();
        }
        if (iOrdinal == 4) {
            return new h8z0(DEFAULT_INSTANCE, 7);
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
        synchronized (SectionedLayout.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final String m13257n() {
        return this.bannerTitle_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m13258p() {
        return this.sections_;
    }

    /* JADX INFO: renamed from: q */
    public final String m13259q() {
        return this.titleColor_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m13260r() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m13261s() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
