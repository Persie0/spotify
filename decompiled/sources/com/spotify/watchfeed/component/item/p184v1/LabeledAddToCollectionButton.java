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
public final class LabeledAddToCollectionButton extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_ADDED_TEXT_FIELD_NUMBER = 4;
    public static final int ACCESSIBILITY_NOT_ADDED_TEXT_FIELD_NUMBER = 5;
    public static final int ADDED_TEXT_FIELD_NUMBER = 2;
    public static final int BUTTON_COLOR_SCHEME_FIELD_NUMBER = 7;
    public static final int BUTTON_STYLE_FIELD_NUMBER = 6;
    private static final LabeledAddToCollectionButton DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    public static final int NOT_ADDED_TEXT_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private int buttonColorScheme_;
    private int buttonStyle_;
    private String entityUri_ = "";
    private String addedText_ = "";
    private String notAddedText_ = "";
    private String accessibilityAddedText_ = "";
    private String accessibilityNotAddedText_ = "";

    static {
        LabeledAddToCollectionButton labeledAddToCollectionButton = new LabeledAddToCollectionButton();
        DEFAULT_INSTANCE = labeledAddToCollectionButton;
        AbstractC0269h.registerDefaultInstance(LabeledAddToCollectionButton.class, labeledAddToCollectionButton);
    }

    private LabeledAddToCollectionButton() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: u */
    public static LabeledAddToCollectionButton m22673u(gva gvaVar) {
        return (LabeledAddToCollectionButton) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\f\u0007\f", new Object[]{"entityUri_", "addedText_", "notAddedText_", "accessibilityAddedText_", "accessibilityNotAddedText_", "buttonStyle_", "buttonColorScheme_"});
        }
        if (iOrdinal == 3) {
            return new LabeledAddToCollectionButton();
        }
        if (iOrdinal == 4) {
            return new dv50(DEFAULT_INSTANCE, 12);
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
        synchronized (LabeledAddToCollectionButton.class) {
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
    public final String m22674n() {
        return this.accessibilityAddedText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m22675o() {
        return this.accessibilityNotAddedText_;
    }

    /* JADX INFO: renamed from: p */
    public final String m22676p() {
        return this.addedText_;
    }

    /* JADX INFO: renamed from: q */
    public final wsa m22677q() {
        wsa wsaVarM88882a = wsa.m88882a(this.buttonColorScheme_);
        return wsaVarM88882a == null ? wsa.UNRECOGNIZED : wsaVarM88882a;
    }

    /* JADX INFO: renamed from: r */
    public final wta m22678r() {
        wta wtaVarM88915a = wta.m88915a(this.buttonStyle_);
        return wtaVarM88915a == null ? wta.UNRECOGNIZED : wtaVarM88915a;
    }

    /* JADX INFO: renamed from: s */
    public final String m22679s() {
        return this.entityUri_;
    }

    /* JADX INFO: renamed from: t */
    public final String m22680t() {
        return this.notAddedText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
