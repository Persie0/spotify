package com.spotify.agentgateway.p016v1;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import java.util.Iterator;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.l45;
import p204p.n350;
import p204p.n70;
import p204p.ore0;
import p204p.pre0;
import p204p.prz0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class SendMessageWithImageRequest extends AbstractC0269h implements sre0 {
    public static final int CONVERSATION_ID_FIELD_NUMBER = 1;
    private static final SendMessageWithImageRequest DEFAULT_INSTANCE;
    public static final int EXPERIENCE_NAME_FIELD_NUMBER = 4;
    public static final int IMAGE_ATTACHMENTS_FIELD_NUMBER = 3;
    public static final int INCLUDE_DEBUG_INFO_FIELD_NUMBER = 5;
    public static final int NEW_USER_MESSAGE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SUPPORTED_ACTIONS_FIELD_NUMBER = 6;
    public static final int VARIANT_FIELD_NUMBER = 7;
    private static final vd50 supportedActions_converter_ = new l45(25);
    private int bitField0_;
    private boolean includeDebugInfo_;
    private UserMessage newUserMessage_;
    private int supportedActionsMemoizedSerializedSize;
    private String conversationId_ = "";
    private ae50 imageAttachments_ = AbstractC0269h.emptyProtobufList();
    private String experienceName_ = "";
    private ud50 supportedActions_ = AbstractC0269h.emptyIntList();
    private String variant_ = "";

    static {
        SendMessageWithImageRequest sendMessageWithImageRequest = new SendMessageWithImageRequest();
        DEFAULT_INSTANCE = sendMessageWithImageRequest;
        AbstractC0269h.registerDefaultInstance(SendMessageWithImageRequest.class, sendMessageWithImageRequest);
    }

    private SendMessageWithImageRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2977n(SendMessageWithImageRequest sendMessageWithImageRequest, ArrayList arrayList) {
        ae50 ae50Var = sendMessageWithImageRequest.imageAttachments_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            sendMessageWithImageRequest.imageAttachments_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, sendMessageWithImageRequest.imageAttachments_);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static void m2978o(SendMessageWithImageRequest sendMessageWithImageRequest, Iterable iterable) {
        ud50 ud50Var = sendMessageWithImageRequest.supportedActions_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            sendMessageWithImageRequest.supportedActions_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            n70 n70Var = (n70) it.next();
            ((n350) sendMessageWithImageRequest.supportedActions_).m63581b(n70Var.getNumber());
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m2979p(SendMessageWithImageRequest sendMessageWithImageRequest, String str) {
        sendMessageWithImageRequest.getClass();
        str.getClass();
        sendMessageWithImageRequest.conversationId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m2980q(SendMessageWithImageRequest sendMessageWithImageRequest, String str) {
        sendMessageWithImageRequest.getClass();
        str.getClass();
        sendMessageWithImageRequest.experienceName_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m2981r(SendMessageWithImageRequest sendMessageWithImageRequest, UserMessage userMessage) {
        sendMessageWithImageRequest.getClass();
        sendMessageWithImageRequest.newUserMessage_ = userMessage;
        sendMessageWithImageRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: s */
    public static void m2982s(SendMessageWithImageRequest sendMessageWithImageRequest, String str) {
        sendMessageWithImageRequest.getClass();
        sendMessageWithImageRequest.bitField0_ |= 2;
        sendMessageWithImageRequest.variant_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static prz0 m2984u() {
        return (prz0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b\u0004Ȉ\u0005\u0007\u0006,\u0007ለ\u0001", new Object[]{"bitField0_", "conversationId_", "newUserMessage_", "imageAttachments_", ImageAttachment.class, "experienceName_", "includeDebugInfo_", "supportedActions_", "variant_"});
        }
        if (iOrdinal == 3) {
            return new SendMessageWithImageRequest();
        }
        if (iOrdinal == 4) {
            return new prz0();
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
        synchronized (SendMessageWithImageRequest.class) {
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
