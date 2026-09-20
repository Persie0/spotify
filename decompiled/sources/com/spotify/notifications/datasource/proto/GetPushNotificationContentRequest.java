package com.spotify.notifications.datasource.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.na10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class GetPushNotificationContentRequest extends AbstractC0269h implements sre0 {
    public static final int CONVERSATION_ID_FIELD_NUMBER = 2;
    private static final GetPushNotificationContentRequest DEFAULT_INSTANCE;
    public static final int MESSAGE_URI_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String messageUri_ = "";
    private String conversationId_ = "";

    static {
        GetPushNotificationContentRequest getPushNotificationContentRequest = new GetPushNotificationContentRequest();
        DEFAULT_INSTANCE = getPushNotificationContentRequest;
        AbstractC0269h.registerDefaultInstance(GetPushNotificationContentRequest.class, getPushNotificationContentRequest);
    }

    private GetPushNotificationContentRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m15963n(GetPushNotificationContentRequest getPushNotificationContentRequest, String str) {
        getPushNotificationContentRequest.getClass();
        str.getClass();
        getPushNotificationContentRequest.conversationId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m15964o(GetPushNotificationContentRequest getPushNotificationContentRequest, String str) {
        getPushNotificationContentRequest.getClass();
        str.getClass();
        getPushNotificationContentRequest.messageUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static na10 m15965p() {
        return (na10) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"messageUri_", "conversationId_"});
        }
        if (iOrdinal == 3) {
            return new GetPushNotificationContentRequest();
        }
        if (iOrdinal == 4) {
            return new na10(DEFAULT_INSTANCE);
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
        synchronized (GetPushNotificationContentRequest.class) {
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
