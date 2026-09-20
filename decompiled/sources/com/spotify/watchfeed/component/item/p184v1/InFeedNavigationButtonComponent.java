package com.spotify.watchfeed.component.item.p184v1;

import com.google.protobuf.AbstractC0269h;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wsa;
import p204p.wta;
import p204p.z110;
import p204p.zc40;

/* JADX INFO: loaded from: classes11.dex */
public final class InFeedNavigationButtonComponent extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 3;
    public static final int BUTTON_COLOR_SCHEME_FIELD_NUMBER = 6;
    public static final int BUTTON_STYLE_FIELD_NUMBER = 4;
    private static final InFeedNavigationButtonComponent DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 5;
    public static final int ITEM_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int buttonColorScheme_;
    private int buttonStyle_;
    private String title_ = "";
    private String itemId_ = "";
    private String accessibilityText_ = "";
    private String icon_ = "";

    static {
        InFeedNavigationButtonComponent inFeedNavigationButtonComponent = new InFeedNavigationButtonComponent();
        DEFAULT_INSTANCE = inFeedNavigationButtonComponent;
        AbstractC0269h.registerDefaultInstance(InFeedNavigationButtonComponent.class, inFeedNavigationButtonComponent);
    }

    private InFeedNavigationButtonComponent() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static InFeedNavigationButtonComponent m22667s(gva gvaVar) {
        return (InFeedNavigationButtonComponent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005Ȉ\u0006\f", new Object[]{"title_", "itemId_", "accessibilityText_", "buttonStyle_", "icon_", "buttonColorScheme_"});
        }
        if (iOrdinal == 3) {
            return new InFeedNavigationButtonComponent();
        }
        if (iOrdinal == 4) {
            return new zc40(DEFAULT_INSTANCE, 3);
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
        synchronized (InFeedNavigationButtonComponent.class) {
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
    public final String m22668n() {
        return this.accessibilityText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final wsa m22669o() {
        wsa wsaVarM88882a = wsa.m88882a(this.buttonColorScheme_);
        return wsaVarM88882a == null ? wsa.UNRECOGNIZED : wsaVarM88882a;
    }

    /* JADX INFO: renamed from: p */
    public final wta m22670p() {
        wta wtaVarM88915a = wta.m88915a(this.buttonStyle_);
        return wtaVarM88915a == null ? wta.UNRECOGNIZED : wtaVarM88915a;
    }

    /* JADX INFO: renamed from: q */
    public final String m22671q() {
        return this.icon_;
    }

    /* JADX INFO: renamed from: r */
    public final String m22672r() {
        return this.itemId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
