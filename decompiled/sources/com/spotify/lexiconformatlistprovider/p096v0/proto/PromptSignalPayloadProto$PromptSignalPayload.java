package com.spotify.lexiconformatlistprovider.p096v0.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xls0;
import p204p.yls0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class PromptSignalPayloadProto$PromptSignalPayload extends AbstractC0269h implements sre0 {
    private static final PromptSignalPayloadProto$PromptSignalPayload DEFAULT_INSTANCE;
    public static final int INPUT_TYPE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int USER_PROMPT_FIELD_NUMBER = 1;
    private int inputType_;
    private String userPrompt_ = "";

    static {
        PromptSignalPayloadProto$PromptSignalPayload promptSignalPayloadProto$PromptSignalPayload = new PromptSignalPayloadProto$PromptSignalPayload();
        DEFAULT_INSTANCE = promptSignalPayloadProto$PromptSignalPayload;
        AbstractC0269h.registerDefaultInstance(PromptSignalPayloadProto$PromptSignalPayload.class, promptSignalPayloadProto$PromptSignalPayload);
    }

    private PromptSignalPayloadProto$PromptSignalPayload() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12595n(PromptSignalPayloadProto$PromptSignalPayload promptSignalPayloadProto$PromptSignalPayload, yls0 yls0Var) {
        promptSignalPayloadProto$PromptSignalPayload.getClass();
        promptSignalPayloadProto$PromptSignalPayload.inputType_ = yls0Var.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m12596o(PromptSignalPayloadProto$PromptSignalPayload promptSignalPayloadProto$PromptSignalPayload, String str) {
        promptSignalPayloadProto$PromptSignalPayload.getClass();
        promptSignalPayloadProto$PromptSignalPayload.userPrompt_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static xls0 m12597p() {
        return (xls0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"userPrompt_", "inputType_"});
        }
        if (iOrdinal == 3) {
            return new PromptSignalPayloadProto$PromptSignalPayload();
        }
        if (iOrdinal == 4) {
            return new xls0(DEFAULT_INSTANCE);
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
        synchronized (PromptSignalPayloadProto$PromptSignalPayload.class) {
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
