package com.spotify.lockstate.p104v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.fi11;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ShowDialog extends AbstractC0269h implements sre0 {
    public static final int CONFIRM_BUTTON_FIELD_NUMBER = 3;
    private static final ShowDialog DEFAULT_INSTANCE;
    public static final int DISMISS_BUTTON_FIELD_NUMBER = 4;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private ActionableButton confirmButton_;
    private ActionableButton dismissButton_;
    private String title_ = "";
    private String message_ = "";

    static {
        ShowDialog showDialog = new ShowDialog();
        DEFAULT_INSTANCE = showDialog;
        AbstractC0269h.registerDefaultInstance(ShowDialog.class, showDialog);
    }

    private ShowDialog() {
    }

    /* JADX INFO: renamed from: o */
    public static ShowDialog m13270o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "title_", "message_", "confirmButton_", "dismissButton_"});
        }
        if (iOrdinal == 3) {
            return new ShowDialog();
        }
        if (iOrdinal == 4) {
            return new fi11(DEFAULT_INSTANCE, 10);
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
        synchronized (ShowDialog.class) {
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

    public final String getMessage() {
        return this.message_;
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final ActionableButton m13271n() {
        ActionableButton actionableButton = this.confirmButton_;
        return actionableButton == null ? ActionableButton.m13208o() : actionableButton;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final ActionableButton m13272p() {
        ActionableButton actionableButton = this.dismissButton_;
        return actionableButton == null ? ActionableButton.m13208o() : actionableButton;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m13273q() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m13274r() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
