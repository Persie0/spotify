package com.spotify.thestage.vtec.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.h5d1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class VtecEvent extends AbstractC0269h implements sre0 {
    public static final int AD_ID_FIELD_NUMBER = 7;
    private static final VtecEvent DEFAULT_INSTANCE;
    public static final int ELAPSED_SECONDS_FIELD_NUMBER = 3;
    public static final int EVENT_DATA_FIELD_NUMBER = 6;
    public static final int EVENT_TYPE_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public static final int SITE_ID_FIELD_NUMBER = 1;
    public static final int URL_FIELD_NUMBER = 4;
    private int bitField0_;
    private double elapsedSeconds_;
    private String siteId_ = "";
    private String sessionId_ = "";
    private String url_ = "";
    private String eventType_ = "";
    private String eventData_ = "";
    private String adId_ = "";

    static {
        VtecEvent vtecEvent = new VtecEvent();
        DEFAULT_INSTANCE = vtecEvent;
        AbstractC0269h.registerDefaultInstance(VtecEvent.class, vtecEvent);
    }

    private VtecEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21801n(VtecEvent vtecEvent, double d) {
        vtecEvent.bitField0_ |= 4;
        vtecEvent.elapsedSeconds_ = d;
    }

    /* JADX INFO: renamed from: o */
    public static void m21802o(VtecEvent vtecEvent, String str) {
        vtecEvent.getClass();
        str.getClass();
        vtecEvent.bitField0_ |= 32;
        vtecEvent.eventData_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m21803p(VtecEvent vtecEvent, String str) {
        vtecEvent.getClass();
        str.getClass();
        vtecEvent.bitField0_ |= 16;
        vtecEvent.eventType_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21804q(VtecEvent vtecEvent, String str) {
        vtecEvent.getClass();
        str.getClass();
        vtecEvent.bitField0_ |= 2;
        vtecEvent.sessionId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m21805r(VtecEvent vtecEvent, String str) {
        vtecEvent.getClass();
        vtecEvent.bitField0_ |= 1;
        vtecEvent.siteId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m21806s(VtecEvent vtecEvent, String str) {
        vtecEvent.getClass();
        str.getClass();
        vtecEvent.bitField0_ |= 8;
        vtecEvent.url_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static h5d1 m21807t() {
        return (h5d1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003က\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "siteId_", "sessionId_", "elapsedSeconds_", "url_", "eventType_", "eventData_", "adId_"});
        }
        if (iOrdinal == 3) {
            return new VtecEvent();
        }
        if (iOrdinal == 4) {
            return new h5d1(DEFAULT_INSTANCE);
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
        synchronized (VtecEvent.class) {
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
