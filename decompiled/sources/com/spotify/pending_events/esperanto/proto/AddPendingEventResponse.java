package com.spotify.pending_events.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cin0;
import p204p.iu0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class AddPendingEventResponse extends AbstractC0269h implements sre0 {
    private static final AddPendingEventResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    public static final int TOKEN_EVENT_NAME_FIELD_NUMBER = 3;
    public static final int TOKEN_SEQUENCE_NO_FIELD_NUMBER = 4;
    private int error_;
    private boolean success_;
    private String tokenEventName_ = "";
    private int tokenSequenceNo_;

    static {
        AddPendingEventResponse addPendingEventResponse = new AddPendingEventResponse();
        DEFAULT_INSTANCE = addPendingEventResponse;
        AbstractC0269h.registerDefaultInstance(AddPendingEventResponse.class, addPendingEventResponse);
    }

    private AddPendingEventResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static AddPendingEventResponse m16960r(byte[] bArr) {
        return (AddPendingEventResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\f\u0003Ȉ\u0004\u000b", new Object[]{"success_", "error_", "tokenEventName_", "tokenSequenceNo_"});
        }
        if (iOrdinal == 3) {
            return new AddPendingEventResponse();
        }
        if (iOrdinal == 4) {
            return new iu0(DEFAULT_INSTANCE, 6);
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
        synchronized (AddPendingEventResponse.class) {
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
    public final cin0 m16961n() {
        cin0 cin0VarM32900a = cin0.m32900a(this.error_);
        return cin0VarM32900a == null ? cin0.UNRECOGNIZED : cin0VarM32900a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m16962o() {
        return this.success_;
    }

    /* JADX INFO: renamed from: p */
    public final String m16963p() {
        return this.tokenEventName_;
    }

    /* JADX INFO: renamed from: q */
    public final int m16964q() {
        return this.tokenSequenceNo_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
