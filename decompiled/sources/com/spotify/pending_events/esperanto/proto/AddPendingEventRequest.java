package com.spotify.pending_events.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gva;
import p204p.jg1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class AddPendingEventRequest extends AbstractC0269h implements sre0 {
    private static final AddPendingEventRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PROTO_DATA_FIELD_NUMBER = 2;
    public static final int PROTO_NAME_FIELD_NUMBER = 1;
    private String protoName_ = "";
    private gva protoData_ = gva.f84678b;

    static {
        AddPendingEventRequest addPendingEventRequest = new AddPendingEventRequest();
        DEFAULT_INSTANCE = addPendingEventRequest;
        AbstractC0269h.registerDefaultInstance(AddPendingEventRequest.class, addPendingEventRequest);
    }

    private AddPendingEventRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16957n(AddPendingEventRequest addPendingEventRequest, gva gvaVar) {
        addPendingEventRequest.getClass();
        gvaVar.getClass();
        addPendingEventRequest.protoData_ = gvaVar;
    }

    /* JADX INFO: renamed from: o */
    public static void m16958o(AddPendingEventRequest addPendingEventRequest, String str) {
        addPendingEventRequest.getClass();
        addPendingEventRequest.protoName_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static jg1 m16959p() {
        return (jg1) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"protoName_", "protoData_"});
        }
        if (iOrdinal == 3) {
            return new AddPendingEventRequest();
        }
        if (iOrdinal == 4) {
            return new jg1(DEFAULT_INSTANCE);
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
        synchronized (AddPendingEventRequest.class) {
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
