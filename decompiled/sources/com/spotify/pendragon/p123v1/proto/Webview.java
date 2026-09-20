package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.eyc1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.t3d1;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class Webview extends AbstractC0269h implements sre0 {
    public static final int BASIC_WEBVIEW_FIELD_NUMBER = 1;
    private static final Webview DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int webviewTemplateCase_ = 0;
    private Object webviewTemplate_;

    static {
        Webview webview = new Webview();
        DEFAULT_INSTANCE = webview;
        AbstractC0269h.registerDefaultInstance(Webview.class, webview);
    }

    private Webview() {
    }

    /* JADX INFO: renamed from: p */
    public static Webview m17315p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"webviewTemplate_", "webviewTemplateCase_", BasicWebview.class});
        }
        if (iOrdinal == 3) {
            return new Webview();
        }
        if (iOrdinal == 4) {
            return new eyc1(25);
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
        synchronized (Webview.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final BasicWebview m17316o() {
        return this.webviewTemplateCase_ == 1 ? (BasicWebview) this.webviewTemplate_ : BasicWebview.m17110n();
    }

    /* JADX INFO: renamed from: q */
    public final int m17317q() {
        return t3d1.m79987b(this.webviewTemplateCase_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
