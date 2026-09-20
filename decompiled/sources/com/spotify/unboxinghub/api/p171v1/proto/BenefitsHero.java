package com.spotify.unboxinghub.api.p171v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z79;

/* JADX INFO: loaded from: classes10.dex */
public final class BenefitsHero extends AbstractC0269h implements sre0 {
    public static final int ACTIVATED_FIELD_NUMBER = 8;
    private static final BenefitsHero DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 7;
    public static final int MEDIA_FIELD_NUMBER = 4;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int PRE_TITLE_FIELD_NUMBER = 1;
    public static final int PROGRESS_FIELD_NUMBER = 9;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TINT_COLOR_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 2;
    private boolean activated_;
    private int bitField0_;
    private Media media_;
    private Progress progress_;
    private String preTitle_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String tintColor_ = "";
    private String navigationUri_ = "";
    private String id_ = "";

    static {
        BenefitsHero benefitsHero = new BenefitsHero();
        DEFAULT_INSTANCE = benefitsHero;
        AbstractC0269h.registerDefaultInstance(BenefitsHero.class, benefitsHero);
    }

    private BenefitsHero() {
    }

    /* JADX INFO: renamed from: o */
    public static BenefitsHero m21954o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005Ȉ\u0006ለ\u0001\u0007Ȉ\b\u0007\tဉ\u0002", new Object[]{"bitField0_", "preTitle_", "title_", "subtitle_", "media_", "tintColor_", "navigationUri_", "id_", "activated_", "progress_"});
        }
        if (iOrdinal == 3) {
            return new BenefitsHero();
        }
        if (iOrdinal == 4) {
            return new z79(DEFAULT_INSTANCE, 0);
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
        synchronized (BenefitsHero.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m21955n() {
        return this.activated_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final Media m21956p() {
        Media media = this.media_;
        return media == null ? Media.m21989o() : media;
    }

    /* JADX INFO: renamed from: q */
    public final String m21957q() {
        return this.navigationUri_;
    }

    /* JADX INFO: renamed from: r */
    public final String m21958r() {
        return this.preTitle_;
    }

    /* JADX INFO: renamed from: s */
    public final Progress m21959s() {
        Progress progress = this.progress_;
        return progress == null ? Progress.m21992o() : progress;
    }

    /* JADX INFO: renamed from: t */
    public final String m21960t() {
        return this.tintColor_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m21961u() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m21962v() {
        return (this.bitField0_ & 4) != 0;
    }
}
