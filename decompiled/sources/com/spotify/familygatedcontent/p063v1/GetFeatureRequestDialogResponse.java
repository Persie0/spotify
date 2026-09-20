package com.spotify.familygatedcontent.p063v1;

import com.google.protobuf.AbstractC0269h;
import p204p.k810;
import p204p.kgy;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class GetFeatureRequestDialogResponse extends AbstractC0269h implements sre0 {
    public static final int CLOSE_ACTION_TITLE_FIELD_NUMBER = 5;
    private static final GetFeatureRequestDialogResponse DEFAULT_INSTANCE;
    public static final int DIALOG_MESSAGE_FIELD_NUMBER = 2;
    public static final int DIALOG_TITLE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REQUEST_ACTION_FIELD_NUMBER = 3;
    public static final int REQUEST_ACTION_TITLE_FIELD_NUMBER = 4;
    private int requestAction_;
    private String dialogTitle_ = "";
    private String dialogMessage_ = "";
    private String requestActionTitle_ = "";
    private String closeActionTitle_ = "";

    static {
        GetFeatureRequestDialogResponse getFeatureRequestDialogResponse = new GetFeatureRequestDialogResponse();
        DEFAULT_INSTANCE = getFeatureRequestDialogResponse;
        AbstractC0269h.registerDefaultInstance(GetFeatureRequestDialogResponse.class, getFeatureRequestDialogResponse);
    }

    private GetFeatureRequestDialogResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004Ȉ\u0005Ȉ", new Object[]{"dialogTitle_", "dialogMessage_", "requestAction_", "requestActionTitle_", "closeActionTitle_"});
        }
        if (iOrdinal == 3) {
            return new GetFeatureRequestDialogResponse();
        }
        if (iOrdinal == 4) {
            return new k810(DEFAULT_INSTANCE, 4);
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
        synchronized (GetFeatureRequestDialogResponse.class) {
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
    public final String m10592n() {
        return this.closeActionTitle_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m10593o() {
        return this.dialogMessage_;
    }

    /* JADX INFO: renamed from: p */
    public final String m10594p() {
        return this.dialogTitle_;
    }

    /* JADX INFO: renamed from: q */
    public final kgy m10595q() {
        kgy kgyVar;
        int i = this.requestAction_;
        if (i != 0) {
            kgyVar = i != 1 ? null : kgy.FEATURE_REQUEST_ACTION_REQUEST_FEATURE;
        } else {
            kgyVar = kgy.FEATURE_REQUEST_ACTION_UNSPECIFIED;
        }
        return kgyVar == null ? kgy.UNRECOGNIZED : kgyVar;
    }

    /* JADX INFO: renamed from: r */
    public final String m10596r() {
        return this.requestActionTitle_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
