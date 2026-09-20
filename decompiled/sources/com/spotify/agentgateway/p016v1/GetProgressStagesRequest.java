package com.spotify.agentgateway.p016v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ka10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class GetProgressStagesRequest extends AbstractC0269h implements sre0 {
    public static final int CONVERSATION_ID_FIELD_NUMBER = 1;
    private static final GetProgressStagesRequest DEFAULT_INSTANCE;
    public static final int EXPERIENCE_NAME_FIELD_NUMBER = 3;
    public static final int INCLUDE_DEBUG_INFO_FIELD_NUMBER = 4;
    public static final int NEW_USER_MESSAGE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String conversationId_ = "";
    private String experienceName_ = "";
    private boolean includeDebugInfo_;
    private UserMessage newUserMessage_;

    static {
        GetProgressStagesRequest getProgressStagesRequest = new GetProgressStagesRequest();
        DEFAULT_INSTANCE = getProgressStagesRequest;
        AbstractC0269h.registerDefaultInstance(GetProgressStagesRequest.class, getProgressStagesRequest);
    }

    private GetProgressStagesRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2931n(GetProgressStagesRequest getProgressStagesRequest, String str) {
        getProgressStagesRequest.getClass();
        str.getClass();
        getProgressStagesRequest.bitField0_ |= 1;
        getProgressStagesRequest.conversationId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m2932o(GetProgressStagesRequest getProgressStagesRequest, String str) {
        getProgressStagesRequest.getClass();
        str.getClass();
        getProgressStagesRequest.experienceName_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m2933p(GetProgressStagesRequest getProgressStagesRequest, UserMessage userMessage) {
        getProgressStagesRequest.getClass();
        getProgressStagesRequest.newUserMessage_ = userMessage;
        getProgressStagesRequest.bitField0_ |= 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static ka10 m2935r() {
        return (ka10) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004\u0007", new Object[]{"bitField0_", "conversationId_", "newUserMessage_", "experienceName_", "includeDebugInfo_"});
        }
        if (iOrdinal == 3) {
            return new GetProgressStagesRequest();
        }
        if (iOrdinal == 4) {
            return new ka10();
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
        synchronized (GetProgressStagesRequest.class) {
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
