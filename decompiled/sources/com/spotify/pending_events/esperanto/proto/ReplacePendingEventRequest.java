package com.spotify.pending_events.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.qmw0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class ReplacePendingEventRequest extends AbstractC0269h implements sre0 {
    private static final ReplacePendingEventRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PROTO_DATA_FIELD_NUMBER = 4;
    public static final int PROTO_NAME_FIELD_NUMBER = 3;
    public static final int TOKEN_EVENT_NAME_FIELD_NUMBER = 1;
    public static final int TOKEN_SEQUENCE_NO_FIELD_NUMBER = 2;
    private int tokenSequenceNo_;
    private String tokenEventName_ = "";
    private String protoName_ = "";
    private gva protoData_ = gva.f84678b;

    static {
        ReplacePendingEventRequest replacePendingEventRequest = new ReplacePendingEventRequest();
        DEFAULT_INSTANCE = replacePendingEventRequest;
        AbstractC0269h.registerDefaultInstance(ReplacePendingEventRequest.class, replacePendingEventRequest);
    }

    private ReplacePendingEventRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16971n(ReplacePendingEventRequest replacePendingEventRequest, gva gvaVar) {
        replacePendingEventRequest.getClass();
        gvaVar.getClass();
        replacePendingEventRequest.protoData_ = gvaVar;
    }

    /* JADX INFO: renamed from: o */
    public static void m16972o(ReplacePendingEventRequest replacePendingEventRequest, String str) {
        replacePendingEventRequest.getClass();
        replacePendingEventRequest.protoName_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m16973p(ReplacePendingEventRequest replacePendingEventRequest, String str) {
        replacePendingEventRequest.getClass();
        str.getClass();
        replacePendingEventRequest.tokenEventName_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m16974q(ReplacePendingEventRequest replacePendingEventRequest, int i) {
        replacePendingEventRequest.tokenSequenceNo_ = i;
    }

    /* JADX INFO: renamed from: r */
    public static qmw0 m16975r() {
        return (qmw0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003Ȉ\u0004\n", new Object[]{"tokenEventName_", "tokenSequenceNo_", "protoName_", "protoData_"});
        }
        if (iOrdinal == 3) {
            return new ReplacePendingEventRequest();
        }
        if (iOrdinal == 4) {
            return new qmw0(DEFAULT_INSTANCE);
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
        synchronized (ReplacePendingEventRequest.class) {
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
