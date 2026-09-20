package com.spotify.watchfeed.component.item.p184v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Any;
import p204p.gva;
import p204p.ore0;
import p204p.osa;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class CallToActionSheetButtonComponent extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 4;
    private static final CallToActionSheetButtonComponent DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 5;
    public static final int SHEET_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private Any sheet_;
    private String title_ = "";
    private String icon_ = "";
    private String accessibilityText_ = "";
    private String reason_ = "";

    static {
        CallToActionSheetButtonComponent callToActionSheetButtonComponent = new CallToActionSheetButtonComponent();
        DEFAULT_INSTANCE = callToActionSheetButtonComponent;
        AbstractC0269h.registerDefaultInstance(CallToActionSheetButtonComponent.class, callToActionSheetButtonComponent);
    }

    private CallToActionSheetButtonComponent() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static CallToActionSheetButtonComponent m22591r(gva gvaVar) {
        return (CallToActionSheetButtonComponent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ\u0005Ȉ", new Object[]{"bitField0_", "title_", "icon_", "sheet_", "accessibilityText_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new CallToActionSheetButtonComponent();
        }
        if (iOrdinal == 4) {
            return new osa(DEFAULT_INSTANCE, 8);
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
        synchronized (CallToActionSheetButtonComponent.class) {
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
    public final String m22592n() {
        return this.accessibilityText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m22593o() {
        return this.icon_;
    }

    /* JADX INFO: renamed from: p */
    public final String m22594p() {
        return this.reason_;
    }

    /* JADX INFO: renamed from: q */
    public final Any m22595q() {
        Any any = this.sheet_;
        return any == null ? Any.m1909p() : any;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
