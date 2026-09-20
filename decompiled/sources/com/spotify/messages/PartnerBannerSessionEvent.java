package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.l4n0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class PartnerBannerSessionEvent extends AbstractC0269h implements sre0 {
    public static final int BANNER_SESSION_ID_FIELD_NUMBER = 1;
    public static final int CONNECTED_APP_FIELD_NUMBER = 7;
    private static final PartnerBannerSessionEvent DEFAULT_INSTANCE;
    public static final int EVENT_REASON_FIELD_NUMBER = 3;
    public static final int EVENT_TYPE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SESSION_LENGTH_SECONDS_FIELD_NUMBER = 4;
    public static final int SESSION_TYPE_FIELD_NUMBER = 5;
    public static final int SHOWN_APPS_FIELD_NUMBER = 6;
    private int bitField0_;
    private long sessionLengthSeconds_;
    private String bannerSessionId_ = "";
    private String eventType_ = "";
    private String eventReason_ = "";
    private String sessionType_ = "";
    private ae50 shownApps_ = AbstractC0269h.emptyProtobufList();
    private String connectedApp_ = "";

    static {
        PartnerBannerSessionEvent partnerBannerSessionEvent = new PartnerBannerSessionEvent();
        DEFAULT_INSTANCE = partnerBannerSessionEvent;
        AbstractC0269h.registerDefaultInstance(PartnerBannerSessionEvent.class, partnerBannerSessionEvent);
    }

    private PartnerBannerSessionEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14330n(PartnerBannerSessionEvent partnerBannerSessionEvent, Iterable iterable) {
        ae50 ae50Var = partnerBannerSessionEvent.shownApps_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            partnerBannerSessionEvent.shownApps_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, partnerBannerSessionEvent.shownApps_);
    }

    /* JADX INFO: renamed from: o */
    public static void m14331o(PartnerBannerSessionEvent partnerBannerSessionEvent, String str) {
        partnerBannerSessionEvent.getClass();
        str.getClass();
        partnerBannerSessionEvent.bitField0_ |= 1;
        partnerBannerSessionEvent.bannerSessionId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14332p(PartnerBannerSessionEvent partnerBannerSessionEvent, String str) {
        partnerBannerSessionEvent.getClass();
        str.getClass();
        partnerBannerSessionEvent.bitField0_ |= 32;
        partnerBannerSessionEvent.connectedApp_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14333q(PartnerBannerSessionEvent partnerBannerSessionEvent, String str) {
        partnerBannerSessionEvent.getClass();
        str.getClass();
        partnerBannerSessionEvent.bitField0_ |= 4;
        partnerBannerSessionEvent.eventReason_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m14334r(PartnerBannerSessionEvent partnerBannerSessionEvent, String str) {
        partnerBannerSessionEvent.getClass();
        partnerBannerSessionEvent.bitField0_ |= 2;
        partnerBannerSessionEvent.eventType_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m14335s(PartnerBannerSessionEvent partnerBannerSessionEvent, long j) {
        partnerBannerSessionEvent.bitField0_ |= 8;
        partnerBannerSessionEvent.sessionLengthSeconds_ = j;
    }

    /* JADX INFO: renamed from: t */
    public static void m14336t(PartnerBannerSessionEvent partnerBannerSessionEvent, String str) {
        partnerBannerSessionEvent.getClass();
        str.getClass();
        partnerBannerSessionEvent.bitField0_ |= 16;
        partnerBannerSessionEvent.sessionType_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static l4n0 m14337u() {
        return (l4n0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006\u001a\u0007ဈ\u0005", new Object[]{"bitField0_", "bannerSessionId_", "eventType_", "eventReason_", "sessionLengthSeconds_", "sessionType_", "shownApps_", "connectedApp_"});
        }
        if (iOrdinal == 3) {
            return new PartnerBannerSessionEvent();
        }
        if (iOrdinal == 4) {
            return new l4n0(DEFAULT_INSTANCE);
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
        synchronized (PartnerBannerSessionEvent.class) {
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
