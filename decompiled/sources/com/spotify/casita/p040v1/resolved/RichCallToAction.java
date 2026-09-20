package com.spotify.casita.p040v1.resolved;

import com.google.protobuf.AbstractC0269h;
import p204p.bab;
import p204p.h4x0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class RichCallToAction extends AbstractC0269h implements sre0 {
    public static final int CALL_TO_ACTION_TEXT_FIELD_NUMBER = 5;
    private static final RichCallToAction DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 2;
    public static final int IS_DISMISSIBLE_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 1;
    private boolean isDismissible_;
    private int type_;
    private String imageUrl_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String callToActionText_ = "";

    static {
        RichCallToAction richCallToAction = new RichCallToAction();
        DEFAULT_INSTANCE = richCallToAction;
        AbstractC0269h.registerDefaultInstance(RichCallToAction.class, richCallToAction);
    }

    private RichCallToAction() {
    }

    /* JADX INFO: renamed from: o */
    public static RichCallToAction m5779o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0007", new Object[]{"type_", "imageUrl_", "title_", "subtitle_", "callToActionText_", "isDismissible_"});
        }
        if (iOrdinal == 3) {
            return new RichCallToAction();
        }
        if (iOrdinal == 4) {
            return new h4x0(DEFAULT_INSTANCE, 23);
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
        synchronized (RichCallToAction.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final String m5780n() {
        return this.callToActionText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m5781p() {
        return this.isDismissible_;
    }

    /* JADX INFO: renamed from: q */
    public final bab m5782q() {
        bab babVarM28579a = bab.m28579a(this.type_);
        return babVarM28579a == null ? bab.UNRECOGNIZED : babVarM28579a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
