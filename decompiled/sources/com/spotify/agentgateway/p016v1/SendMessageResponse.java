package com.spotify.agentgateway.p016v1;

import com.google.protobuf.AbstractC0269h;
import p204p.h8z0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class SendMessageResponse extends AbstractC0269h implements sre0 {
    public static final int AUDIO_URL_FIELD_NUMBER = 3;
    private static final SendMessageResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RESPONSE_FIELD_NUMBER = 1;
    private String audioUrl_ = "";
    private int bitField0_;
    private AgentMessage response_;

    static {
        SendMessageResponse sendMessageResponse = new SendMessageResponse();
        DEFAULT_INSTANCE = sendMessageResponse;
        AbstractC0269h.registerDefaultInstance(SendMessageResponse.class, sendMessageResponse);
    }

    private SendMessageResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ለ\u0001", new Object[]{"bitField0_", "response_", "audioUrl_"});
        }
        if (iOrdinal == 3) {
            return new SendMessageResponse();
        }
        if (iOrdinal == 4) {
            return new h8z0(DEFAULT_INSTANCE, 15);
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
        synchronized (SendMessageResponse.class) {
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
    public final String m2974n() {
        return this.audioUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final AgentMessage m2975o() {
        AgentMessage agentMessage = this.response_;
        return agentMessage == null ? AgentMessage.m2862p() : agentMessage;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m2976p() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
