package com.spotify.watchfeed.component.item.p184v1;

import com.google.protobuf.AbstractC0269h;
import p204p.dv50;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wsa;
import p204p.wta;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class LabeledShareButtonComponent extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 3;
    public static final int BUTTON_COLOR_SCHEME_FIELD_NUMBER = 7;
    public static final int BUTTON_STYLE_FIELD_NUMBER = 5;
    private static final LabeledShareButtonComponent DEFAULT_INSTANCE;
    public static final int DESTINATION_URI_FIELD_NUMBER = 6;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    public static final int LABEL_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SHARE_IMAGE_URL_FIELD_NUMBER = 4;
    private int buttonColorScheme_;
    private int buttonStyle_;
    private String entityUri_ = "";
    private String label_ = "";
    private String accessibilityText_ = "";
    private String shareImageUrl_ = "";
    private String destinationUri_ = "";

    static {
        LabeledShareButtonComponent labeledShareButtonComponent = new LabeledShareButtonComponent();
        DEFAULT_INSTANCE = labeledShareButtonComponent;
        AbstractC0269h.registerDefaultInstance(LabeledShareButtonComponent.class, labeledShareButtonComponent);
    }

    private LabeledShareButtonComponent() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: u */
    public static LabeledShareButtonComponent m22681u(gva gvaVar) {
        return (LabeledShareButtonComponent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\f\u0006Ȉ\u0007\f", new Object[]{"entityUri_", "label_", "accessibilityText_", "shareImageUrl_", "buttonStyle_", "destinationUri_", "buttonColorScheme_"});
        }
        if (iOrdinal == 3) {
            return new LabeledShareButtonComponent();
        }
        if (iOrdinal == 4) {
            return new dv50(DEFAULT_INSTANCE, 14);
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
        synchronized (LabeledShareButtonComponent.class) {
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
    public final String m22682n() {
        return this.accessibilityText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final wsa m22683o() {
        wsa wsaVarM88882a = wsa.m88882a(this.buttonColorScheme_);
        return wsaVarM88882a == null ? wsa.UNRECOGNIZED : wsaVarM88882a;
    }

    /* JADX INFO: renamed from: p */
    public final wta m22684p() {
        wta wtaVarM88915a = wta.m88915a(this.buttonStyle_);
        return wtaVarM88915a == null ? wta.UNRECOGNIZED : wtaVarM88915a;
    }

    /* JADX INFO: renamed from: q */
    public final String m22685q() {
        return this.destinationUri_;
    }

    /* JADX INFO: renamed from: r */
    public final String m22686r() {
        return this.entityUri_;
    }

    /* JADX INFO: renamed from: s */
    public final String m22687s() {
        return this.label_;
    }

    /* JADX INFO: renamed from: t */
    public final String m22688t() {
        return this.shareImageUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
