package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.iw10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class HeaderCard extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_URI_FIELD_NUMBER = 5;
    private static final HeaderCard DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PRIMARY_ACTION_FIELD_NUMBER = 6;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_COLOR_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private Action primaryAction_;
    private String title_ = "";
    private String titleColor_ = "";
    private String subtitle_ = "";
    private String description_ = "";
    private String backgroundUri_ = "";

    static {
        HeaderCard headerCard = new HeaderCard();
        DEFAULT_INSTANCE = headerCard;
        AbstractC0269h.registerDefaultInstance(HeaderCard.class, headerCard);
    }

    private HeaderCard() {
    }

    /* JADX INFO: renamed from: o */
    public static HeaderCard m16523o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဉ\u0000", new Object[]{"bitField0_", "title_", "titleColor_", "subtitle_", "description_", "backgroundUri_", "primaryAction_"});
        }
        if (iOrdinal == 3) {
            return new HeaderCard();
        }
        if (iOrdinal == 4) {
            return new iw10(DEFAULT_INSTANCE, 29);
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
        synchronized (HeaderCard.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final String m16524n() {
        return this.backgroundUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final Action m16525p() {
        Action action = this.primaryAction_;
        return action == null ? Action.m16391o() : action;
    }

    /* JADX INFO: renamed from: q */
    public final String m16526q() {
        return this.titleColor_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
