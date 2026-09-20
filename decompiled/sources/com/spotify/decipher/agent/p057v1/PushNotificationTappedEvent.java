package com.spotify.decipher.agent.p057v1;

import com.google.protobuf.AbstractC0269h;
import p204p.dft0;
import p204p.o2k0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class PushNotificationTappedEvent extends AbstractC0269h implements sre0 {
    private static final PushNotificationTappedEvent DEFAULT_INSTANCE;
    public static final int MESSAGE_OPPORTUNITY_ID_FIELD_NUMBER = 5;
    public static final int NOTIFICATION_TYPE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int RESCUE_SESSION_ID_FIELD_NUMBER = 2;
    public static final int SUGGESTION_ID_FIELD_NUMBER = 3;
    public static final int TRIGGER_CORRELATION_ID_FIELD_NUMBER = 4;
    private int notificationType_;
    private String rescueSessionId_ = "";
    private String suggestionId_ = "";
    private String triggerCorrelationId_ = "";
    private String messageOpportunityId_ = "";

    static {
        PushNotificationTappedEvent pushNotificationTappedEvent = new PushNotificationTappedEvent();
        DEFAULT_INSTANCE = pushNotificationTappedEvent;
        AbstractC0269h.registerDefaultInstance(PushNotificationTappedEvent.class, pushNotificationTappedEvent);
    }

    private PushNotificationTappedEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9144n(PushNotificationTappedEvent pushNotificationTappedEvent, String str) {
        pushNotificationTappedEvent.getClass();
        pushNotificationTappedEvent.messageOpportunityId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m9145o(PushNotificationTappedEvent pushNotificationTappedEvent) {
        pushNotificationTappedEvent.getClass();
        pushNotificationTappedEvent.notificationType_ = o2k0.SEARCH_RESCUE.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static void m9146p(PushNotificationTappedEvent pushNotificationTappedEvent, String str) {
        pushNotificationTappedEvent.getClass();
        pushNotificationTappedEvent.rescueSessionId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m9147q(PushNotificationTappedEvent pushNotificationTappedEvent, String str) {
        pushNotificationTappedEvent.getClass();
        pushNotificationTappedEvent.suggestionId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m9148r(PushNotificationTappedEvent pushNotificationTappedEvent, String str) {
        pushNotificationTappedEvent.getClass();
        pushNotificationTappedEvent.triggerCorrelationId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static dft0 m9149s() {
        return (dft0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"notificationType_", "rescueSessionId_", "suggestionId_", "triggerCorrelationId_", "messageOpportunityId_"});
        }
        if (iOrdinal == 3) {
            return new PushNotificationTappedEvent();
        }
        if (iOrdinal == 4) {
            return new dft0(DEFAULT_INSTANCE);
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
        synchronized (PushNotificationTappedEvent.class) {
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
