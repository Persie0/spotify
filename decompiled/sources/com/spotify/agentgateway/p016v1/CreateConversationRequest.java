package com.spotify.agentgateway.p016v1;

import com.google.protobuf.AbstractC0269h;
import java.util.Iterator;
import p204p.AbstractC1733c9;
import p204p.m57;
import p204p.n350;
import p204p.n70;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.v5l;
import p204p.vd50;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class CreateConversationRequest extends AbstractC0269h implements sre0 {
    private static final CreateConversationRequest DEFAULT_INSTANCE;
    public static final int EXPERIENCE_NAME_FIELD_NUMBER = 1;
    public static final int INCLUDE_DEBUG_INFO_FIELD_NUMBER = 4;
    public static final int INITIAL_MESSAGE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SUPPORTED_ACTIONS_FIELD_NUMBER = 3;
    public static final int VARIANT_FIELD_NUMBER = 5;
    private static final vd50 supportedActions_converter_ = new m57(4);
    private int bitField0_;
    private boolean includeDebugInfo_;
    private UserMessage initialMessage_;
    private int supportedActionsMemoizedSerializedSize;
    private String experienceName_ = "";
    private ud50 supportedActions_ = AbstractC0269h.emptyIntList();
    private String variant_ = "";

    static {
        CreateConversationRequest createConversationRequest = new CreateConversationRequest();
        DEFAULT_INSTANCE = createConversationRequest;
        AbstractC0269h.registerDefaultInstance(CreateConversationRequest.class, createConversationRequest);
    }

    private CreateConversationRequest() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m2888n(CreateConversationRequest createConversationRequest, Iterable iterable) {
        ud50 ud50Var = createConversationRequest.supportedActions_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            createConversationRequest.supportedActions_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            n70 n70Var = (n70) it.next();
            ((n350) createConversationRequest.supportedActions_).m63581b(n70Var.getNumber());
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m2889o(CreateConversationRequest createConversationRequest, String str) {
        createConversationRequest.getClass();
        str.getClass();
        createConversationRequest.experienceName_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m2890p(CreateConversationRequest createConversationRequest, boolean z) {
        createConversationRequest.includeDebugInfo_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m2891q(CreateConversationRequest createConversationRequest, UserMessage userMessage) {
        createConversationRequest.getClass();
        createConversationRequest.initialMessage_ = userMessage;
        createConversationRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: r */
    public static void m2892r(CreateConversationRequest createConversationRequest, String str) {
        createConversationRequest.getClass();
        createConversationRequest.bitField0_ |= 2;
        createConversationRequest.variant_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static v5l m2894t() {
        return (v5l) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003,\u0004\u0007\u0005ለ\u0001", new Object[]{"bitField0_", "experienceName_", "initialMessage_", "supportedActions_", "includeDebugInfo_", "variant_"});
        }
        if (iOrdinal == 3) {
            return new CreateConversationRequest();
        }
        if (iOrdinal == 4) {
            return new v5l();
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
        synchronized (CreateConversationRequest.class) {
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
