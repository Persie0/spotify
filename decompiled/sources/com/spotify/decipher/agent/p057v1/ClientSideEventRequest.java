package com.spotify.decipher.agent.p057v1;

import com.google.protobuf.AbstractC0269h;
import p204p.jme;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ClientSideEventRequest extends AbstractC0269h implements sre0 {
    private static final ClientSideEventRequest DEFAULT_INSTANCE;
    public static final int EVENT_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PUSH_NOTIFICATION_TAPPED_FIELD_NUMBER = 3;
    public static final int SEARCH_BEGAN_FIELD_NUMBER = 2;
    public static final int SEARCH_PLAYABLE_ITEM_TAPPED_FIELD_NUMBER = 4;
    public static final int SEARCH_RESCUE_PLAYBACK_STARTED_FIELD_NUMBER = 5;
    private int eventCase_ = 0;
    private String eventId_ = "";
    private Object event_;

    static {
        ClientSideEventRequest clientSideEventRequest = new ClientSideEventRequest();
        DEFAULT_INSTANCE = clientSideEventRequest;
        AbstractC0269h.registerDefaultInstance(ClientSideEventRequest.class, clientSideEventRequest);
    }

    private ClientSideEventRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9133n(ClientSideEventRequest clientSideEventRequest, String str) {
        clientSideEventRequest.getClass();
        str.getClass();
        clientSideEventRequest.eventId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m9134o(ClientSideEventRequest clientSideEventRequest, PushNotificationTappedEvent pushNotificationTappedEvent) {
        clientSideEventRequest.getClass();
        pushNotificationTappedEvent.getClass();
        clientSideEventRequest.event_ = pushNotificationTappedEvent;
        clientSideEventRequest.eventCase_ = 3;
    }

    /* JADX INFO: renamed from: p */
    public static void m9135p(ClientSideEventRequest clientSideEventRequest, SearchPlayableItemTappedEvent searchPlayableItemTappedEvent) {
        clientSideEventRequest.getClass();
        searchPlayableItemTappedEvent.getClass();
        clientSideEventRequest.event_ = searchPlayableItemTappedEvent;
        clientSideEventRequest.eventCase_ = 4;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static jme m9136q() {
        return (jme) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"event_", "eventCase_", "eventId_", SearchBeganEvent.class, PushNotificationTappedEvent.class, SearchPlayableItemTappedEvent.class, SearchRescuePlaybackStartedEvent.class});
        }
        if (iOrdinal == 3) {
            return new ClientSideEventRequest();
        }
        if (iOrdinal == 4) {
            return new jme(DEFAULT_INSTANCE);
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
        synchronized (ClientSideEventRequest.class) {
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
