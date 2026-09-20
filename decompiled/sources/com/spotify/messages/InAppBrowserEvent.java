package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.hj40;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class InAppBrowserEvent extends AbstractC0269h implements sre0 {
    public static final int AD_IDENTIFIER_FIELD_NUMBER = 4;
    public static final int AD_REQUEST_ID_FIELD_NUMBER = 11;
    public static final int AD_URL_FIELD_NUMBER = 7;
    private static final InAppBrowserEvent DEFAULT_INSTANCE;
    public static final int EVENT_DATA_FIELD_NUMBER = 3;
    public static final int EVENT_NAME_FIELD_NUMBER = 1;
    public static final int LOADING_PROGRESS_FIELD_NUMBER = 9;
    public static final int LOAD_TIME_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int SEQUENCE_FIELD_NUMBER = 8;
    public static final int SESSION_ID_FIELD_NUMBER = 10;
    public static final int TIME_SPENT_FIELD_NUMBER = 5;
    public static final int TIME_STAMP_FIELD_NUMBER = 2;
    private int bitField0_;
    private double loadTime_;
    private int loadingProgress_;
    private int sequence_;
    private double timeSpent_;
    private long timeStamp_;
    private String eventName_ = "";
    private String eventData_ = "";
    private String adIdentifier_ = "";
    private String adUrl_ = "";
    private String sessionId_ = "";
    private String adRequestId_ = "";

    static {
        InAppBrowserEvent inAppBrowserEvent = new InAppBrowserEvent();
        DEFAULT_INSTANCE = inAppBrowserEvent;
        AbstractC0269h.registerDefaultInstance(InAppBrowserEvent.class, inAppBrowserEvent);
    }

    private InAppBrowserEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13901n(InAppBrowserEvent inAppBrowserEvent, String str) {
        inAppBrowserEvent.getClass();
        str.getClass();
        inAppBrowserEvent.bitField0_ |= 8;
        inAppBrowserEvent.adIdentifier_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m13902o(InAppBrowserEvent inAppBrowserEvent, String str) {
        inAppBrowserEvent.getClass();
        str.getClass();
        inAppBrowserEvent.bitField0_ |= 1024;
        inAppBrowserEvent.adRequestId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m13903p(InAppBrowserEvent inAppBrowserEvent, String str) {
        inAppBrowserEvent.getClass();
        str.getClass();
        inAppBrowserEvent.bitField0_ |= 64;
        inAppBrowserEvent.adUrl_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13904q(InAppBrowserEvent inAppBrowserEvent, String str) {
        inAppBrowserEvent.getClass();
        str.getClass();
        inAppBrowserEvent.bitField0_ |= 4;
        inAppBrowserEvent.eventData_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m13905r(InAppBrowserEvent inAppBrowserEvent, String str) {
        inAppBrowserEvent.getClass();
        inAppBrowserEvent.bitField0_ |= 1;
        inAppBrowserEvent.eventName_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m13906s(InAppBrowserEvent inAppBrowserEvent, int i) {
        inAppBrowserEvent.bitField0_ |= 256;
        inAppBrowserEvent.loadingProgress_ = i;
    }

    /* JADX INFO: renamed from: t */
    public static void m13907t(InAppBrowserEvent inAppBrowserEvent, int i) {
        inAppBrowserEvent.bitField0_ |= 128;
        inAppBrowserEvent.sequence_ = i;
    }

    /* JADX INFO: renamed from: u */
    public static void m13908u(InAppBrowserEvent inAppBrowserEvent, String str) {
        inAppBrowserEvent.getClass();
        str.getClass();
        inAppBrowserEvent.bitField0_ |= 512;
        inAppBrowserEvent.sessionId_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m13909v(InAppBrowserEvent inAppBrowserEvent, double d) {
        inAppBrowserEvent.bitField0_ |= 16;
        inAppBrowserEvent.timeSpent_ = d;
    }

    /* JADX INFO: renamed from: w */
    public static void m13910w(InAppBrowserEvent inAppBrowserEvent, long j) {
        inAppBrowserEvent.bitField0_ |= 2;
        inAppBrowserEvent.timeStamp_ = j;
    }

    /* JADX INFO: renamed from: x */
    public static hj40 m13911x() {
        return (hj40) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005က\u0004\u0006က\u0005\u0007ဈ\u0006\bင\u0007\tင\b\nဈ\t\u000bဈ\n", new Object[]{"bitField0_", "eventName_", "timeStamp_", "eventData_", "adIdentifier_", "timeSpent_", "loadTime_", "adUrl_", "sequence_", "loadingProgress_", "sessionId_", "adRequestId_"});
        }
        if (iOrdinal == 3) {
            return new InAppBrowserEvent();
        }
        if (iOrdinal == 4) {
            return new hj40(DEFAULT_INSTANCE);
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
        synchronized (InAppBrowserEvent.class) {
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
