package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ne21;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.stz0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class Snackbar extends AbstractC0269h implements sre0 {
    public static final int AUTO_DISMISS_ENABLED_FIELD_NUMBER = 6;
    public static final int BASE_SNACKBAR_FIELD_NUMBER = 5;
    public static final int BUTTONS_FIELD_NUMBER = 3;
    private static final Snackbar DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 4;
    private boolean autoDismissEnabled_;
    private Object snackbarTemplate_;
    private int snackbarTemplateCase_ = 0;
    private ae50 buttons_ = AbstractC0269h.emptyProtobufList();
    private String type_ = "";

    static {
        Snackbar snackbar = new Snackbar();
        DEFAULT_INSTANCE = snackbar;
        AbstractC0269h.registerDefaultInstance(Snackbar.class, snackbar);
    }

    private Snackbar() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static Snackbar m17285r() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0003\u0006\u0004\u0000\u0001\u0000\u0003\u001b\u0004Ȉ\u0005<\u0000\u0006\u0007", new Object[]{"snackbarTemplate_", "snackbarTemplateCase_", "buttons_", Button.class, "type_", BaseSnackbar.class, "autoDismissEnabled_"});
        }
        if (iOrdinal == 3) {
            return new Snackbar();
        }
        if (iOrdinal == 4) {
            return new ne21();
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
        synchronized (Snackbar.class) {
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
    public final boolean m17286o() {
        return this.autoDismissEnabled_;
    }

    /* JADX INFO: renamed from: p */
    public final BaseSnackbar m17287p() {
        return this.snackbarTemplateCase_ == 5 ? (BaseSnackbar) this.snackbarTemplate_ : BaseSnackbar.m17081p();
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m17288q() {
        return this.buttons_;
    }

    /* JADX INFO: renamed from: s */
    public final int m17289s() {
        return stz0.m79348b(this.snackbarTemplateCase_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
