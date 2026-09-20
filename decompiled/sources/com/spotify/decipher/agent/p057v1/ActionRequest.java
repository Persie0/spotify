package com.spotify.decipher.agent.p057v1;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.r50;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class ActionRequest extends AbstractC0269h implements sre0 {
    public static final int ACTIONS_FIELD_NUMBER = 1;
    public static final int ACTION_ID_FIELD_NUMBER = 2;
    private static final ActionRequest DEFAULT_INSTANCE;
    public static final int LABEL_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private ae50 actions_ = AbstractC0269h.emptyProtobufList();
    private String actionId_ = "";
    private String label_ = "";

    static {
        ActionRequest actionRequest = new ActionRequest();
        DEFAULT_INSTANCE = actionRequest;
        AbstractC0269h.registerDefaultInstance(ActionRequest.class, actionRequest);
    }

    private ActionRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9123n(ActionRequest actionRequest, Action action) {
        actionRequest.getClass();
        action.getClass();
        ae50 ae50Var = actionRequest.actions_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            actionRequest.actions_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        actionRequest.actions_.add(action);
    }

    /* JADX INFO: renamed from: o */
    public static void m9124o(ActionRequest actionRequest, String str) {
        actionRequest.getClass();
        str.getClass();
        actionRequest.actionId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m9125p(ActionRequest actionRequest, String str) {
        actionRequest.getClass();
        str.getClass();
        actionRequest.label_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static r50 m9127r() {
        return (r50) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003Ȉ", new Object[]{"actions_", Action.class, "actionId_", "label_"});
        }
        if (iOrdinal == 3) {
            return new ActionRequest();
        }
        if (iOrdinal == 4) {
            return new r50();
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
        synchronized (ActionRequest.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
