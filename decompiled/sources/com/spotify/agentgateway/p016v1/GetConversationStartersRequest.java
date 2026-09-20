package com.spotify.agentgateway.p016v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.w710;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class GetConversationStartersRequest extends AbstractC0269h implements sre0 {
    private static final GetConversationStartersRequest DEFAULT_INSTANCE;
    public static final int EXPERIENCE_NAME_FIELD_NUMBER = 2;
    public static final int GROUP_CONVERSATION_STARTERS_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int USER_CONTEXT_FIELD_NUMBER = 1;
    public static final int VARIANT_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean groupConversationStarters_;
    private UserContext userContext_;
    private String experienceName_ = "";
    private String variant_ = "";

    static {
        GetConversationStartersRequest getConversationStartersRequest = new GetConversationStartersRequest();
        DEFAULT_INSTANCE = getConversationStartersRequest;
        AbstractC0269h.registerDefaultInstance(GetConversationStartersRequest.class, getConversationStartersRequest);
    }

    private GetConversationStartersRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2918n(GetConversationStartersRequest getConversationStartersRequest, String str) {
        getConversationStartersRequest.getClass();
        str.getClass();
        getConversationStartersRequest.experienceName_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m2919o(GetConversationStartersRequest getConversationStartersRequest, boolean z) {
        getConversationStartersRequest.groupConversationStarters_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m2920p(GetConversationStartersRequest getConversationStartersRequest, UserContext userContext) {
        getConversationStartersRequest.getClass();
        getConversationStartersRequest.userContext_ = userContext;
        getConversationStartersRequest.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m2921q(GetConversationStartersRequest getConversationStartersRequest, String str) {
        getConversationStartersRequest.getClass();
        getConversationStartersRequest.bitField0_ |= 2;
        getConversationStartersRequest.variant_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static w710 m2923s() {
        return (w710) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ለ\u0001\u0004\u0007", new Object[]{"bitField0_", "userContext_", "experienceName_", "variant_", "groupConversationStarters_"});
        }
        if (iOrdinal == 3) {
            return new GetConversationStartersRequest();
        }
        if (iOrdinal == 4) {
            return new w710();
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
        synchronized (GetConversationStartersRequest.class) {
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
