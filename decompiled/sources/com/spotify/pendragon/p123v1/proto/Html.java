package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.a530;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class Html extends AbstractC0269h implements sre0 {
    public static final int BANNER_FIELD_NUMBER = 1;
    public static final int CONTENT_FIELD_NUMBER = 5;
    private static final Html DEFAULT_INSTANCE;
    public static final int FULLSCREEN_FIELD_NUMBER = 2;
    public static final int MODAL_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SNACKBAR_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 6;
    private Object format_;
    private int formatCase_ = 0;
    private String content_ = "";
    private String type_ = "";

    static {
        Html html = new Html();
        DEFAULT_INSTANCE = html;
        AbstractC0269h.registerDefaultInstance(Html.class, html);
    }

    private Html() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static Html m17209q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005Ȉ\u0006Ȉ", new Object[]{"format_", "formatCase_", Banner.class, Fullscreen.class, Modal.class, Snackbar.class, "content_", "type_"});
        }
        if (iOrdinal == 3) {
            return new Html();
        }
        if (iOrdinal == 4) {
            return new a530(1);
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
        synchronized (Html.class) {
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
    public final Banner m17210o() {
        return this.formatCase_ == 1 ? (Banner) this.format_ : Banner.m16997s();
    }

    /* JADX INFO: renamed from: p */
    public final String m17211p() {
        return this.content_;
    }

    /* JADX INFO: renamed from: r */
    public final int m17212r() {
        int i = this.formatCase_;
        if (i == 0) {
            return 5;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i != 3) {
            return i != 4 ? 0 : 4;
        }
        return 3;
    }

    /* JADX INFO: renamed from: s */
    public final Fullscreen m17213s() {
        return this.formatCase_ == 2 ? (Fullscreen) this.format_ : Fullscreen.m17191q();
    }

    /* JADX INFO: renamed from: t */
    public final Modal m17214t() {
        return this.formatCase_ == 3 ? (Modal) this.format_ : Modal.m17256r();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final Snackbar m17215u() {
        return this.formatCase_ == 4 ? (Snackbar) this.format_ : Snackbar.m17285r();
    }
}
