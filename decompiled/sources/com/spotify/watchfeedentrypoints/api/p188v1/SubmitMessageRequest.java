package com.spotify.watchfeedentrypoints.api.p188v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qs51;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class SubmitMessageRequest extends AbstractC0269h implements sre0 {
    private static final SubmitMessageRequest DEFAULT_INSTANCE;
    public static final int MESSAGE_PREFERENCES_FIELD_NUMBER = 3;
    public static final int MESSAGE_PROMPT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private ChatMessagePreferences messagePreferences_;
    private String sessionId_ = "";
    private String messagePrompt_ = "";

    static {
        SubmitMessageRequest submitMessageRequest = new SubmitMessageRequest();
        DEFAULT_INSTANCE = submitMessageRequest;
        AbstractC0269h.registerDefaultInstance(SubmitMessageRequest.class, submitMessageRequest);
    }

    private SubmitMessageRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m22975n(SubmitMessageRequest submitMessageRequest, String str) {
        submitMessageRequest.getClass();
        str.getClass();
        submitMessageRequest.messagePrompt_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m22976o(SubmitMessageRequest submitMessageRequest, String str) {
        submitMessageRequest.getClass();
        submitMessageRequest.sessionId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static qs51 m22977p() {
        return (qs51) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "sessionId_", "messagePrompt_", "messagePreferences_"});
        }
        if (iOrdinal == 3) {
            return new SubmitMessageRequest();
        }
        if (iOrdinal == 4) {
            return new qs51(DEFAULT_INSTANCE);
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
        synchronized (SubmitMessageRequest.class) {
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
