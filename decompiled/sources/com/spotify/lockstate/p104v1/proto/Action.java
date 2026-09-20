package com.spotify.lockstate.p104v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.C1997j;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class Action extends AbstractC0269h implements sre0 {
    public static final int CALLBACK_FIELD_NUMBER = 3;
    public static final int CLOSE_APP_FIELD_NUMBER = 6;
    private static final Action DEFAULT_INSTANCE;
    public static final int DISMISS_FIELD_NUMBER = 1;
    public static final int NAVIGATE_TO_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_BOTTOM_SHEET_FIELD_NUMBER = 5;
    public static final int SHOW_DIALOG_FIELD_NUMBER = 4;
    private int actionCase_ = 0;
    private Object action_;

    static {
        Action action = new Action();
        DEFAULT_INSTANCE = action;
        AbstractC0269h.registerDefaultInstance(Action.class, action);
    }

    private Action() {
    }

    /* JADX INFO: renamed from: o */
    public static Action m13197o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"action_", "actionCase_", Dismiss.class, NavigateTo.class, Callback.class, ShowDialog.class, ShowBottomSheet.class, CloseApp.class});
        }
        if (iOrdinal == 3) {
            return new Action();
        }
        if (iOrdinal == 4) {
            return new C1997j(DEFAULT_INSTANCE, 12);
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
        synchronized (Action.class) {
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
    public final Callback m13198n() {
        return this.actionCase_ == 3 ? (Callback) this.action_ : Callback.m13216o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final NavigateTo m13199p() {
        return this.actionCase_ == 2 ? (NavigateTo) this.action_ : NavigateTo.m13253o();
    }

    /* JADX INFO: renamed from: q */
    public final ShowBottomSheet m13200q() {
        return this.actionCase_ == 5 ? (ShowBottomSheet) this.action_ : ShowBottomSheet.m13262p();
    }

    /* JADX INFO: renamed from: r */
    public final ShowDialog m13201r() {
        return this.actionCase_ == 4 ? (ShowDialog) this.action_ : ShowDialog.m13270o();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m13202s() {
        return this.actionCase_ == 3;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m13203t() {
        return this.actionCase_ == 6;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m13204u() {
        return this.actionCase_ == 1;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m13205v() {
        return this.actionCase_ == 2;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m13206w() {
        return this.actionCase_ == 5;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m13207x() {
        return this.actionCase_ == 4;
    }
}
