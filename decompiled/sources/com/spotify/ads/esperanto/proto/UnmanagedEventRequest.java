package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.m3a1;
import p204p.oo0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class UnmanagedEventRequest extends AbstractC0269h implements sre0 {
    public static final int AD_ID_FIELD_NUMBER = 1;
    public static final int ASSET_ID_FIELD_NUMBER = 14;
    public static final int CREATIVE_ID_FIELD_NUMBER = 6;
    private static final UnmanagedEventRequest DEFAULT_INSTANCE;
    public static final int DURATION_SECONDS_FIELD_NUMBER = 13;
    public static final int EVENT_REASON_FIELD_NUMBER = 4;
    public static final int EVENT_SOURCE_FIELD_NUMBER = 10;
    public static final int EVENT_TYPE_FIELD_NUMBER = 2;
    public static final int FORMAT_FIELD_NUMBER = 11;
    public static final int LINEITEM_ID_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_POSITION_FIELD_NUMBER = 3;
    public static final int PRODUCT_NAME_FIELD_NUMBER = 8;
    public static final int REQUEST_ID_FIELD_NUMBER = 7;
    public static final int SLOT_ID_FIELD_NUMBER = 9;
    public static final int TRACKING_URLS_FIELD_NUMBER = 12;
    private int bitField0_;
    private int durationSeconds_;
    private int format_;
    private long playbackPosition_;
    private String adId_ = "";
    private String eventType_ = "";
    private String eventReason_ = "";
    private String lineitemId_ = "";
    private String creativeId_ = "";
    private String requestId_ = "";
    private String productName_ = "";
    private String slotId_ = "";
    private String eventSource_ = "";
    private ae50 trackingUrls_ = AbstractC0269h.emptyProtobufList();
    private String assetId_ = "";

    static {
        UnmanagedEventRequest unmanagedEventRequest = new UnmanagedEventRequest();
        DEFAULT_INSTANCE = unmanagedEventRequest;
        AbstractC0269h.registerDefaultInstance(UnmanagedEventRequest.class, unmanagedEventRequest);
    }

    private UnmanagedEventRequest() {
    }

    /* JADX INFO: renamed from: A */
    public static m3a1 m2736A() {
        return (m3a1) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m2737n(UnmanagedEventRequest unmanagedEventRequest, Iterable iterable) {
        ae50 ae50Var = unmanagedEventRequest.trackingUrls_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            unmanagedEventRequest.trackingUrls_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, unmanagedEventRequest.trackingUrls_);
    }

    /* JADX INFO: renamed from: o */
    public static void m2738o(UnmanagedEventRequest unmanagedEventRequest, String str) {
        unmanagedEventRequest.getClass();
        str.getClass();
        unmanagedEventRequest.adId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m2739p(UnmanagedEventRequest unmanagedEventRequest, String str) {
        unmanagedEventRequest.getClass();
        str.getClass();
        unmanagedEventRequest.bitField0_ |= 32;
        unmanagedEventRequest.assetId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m2740q(UnmanagedEventRequest unmanagedEventRequest, String str) {
        unmanagedEventRequest.getClass();
        str.getClass();
        unmanagedEventRequest.creativeId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m2741r(UnmanagedEventRequest unmanagedEventRequest, int i) {
        unmanagedEventRequest.bitField0_ |= 16;
        unmanagedEventRequest.durationSeconds_ = i;
    }

    /* JADX INFO: renamed from: s */
    public static void m2742s(UnmanagedEventRequest unmanagedEventRequest, String str) {
        unmanagedEventRequest.getClass();
        str.getClass();
        unmanagedEventRequest.bitField0_ |= 2;
        unmanagedEventRequest.eventReason_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m2743t(UnmanagedEventRequest unmanagedEventRequest, String str) {
        unmanagedEventRequest.getClass();
        unmanagedEventRequest.eventType_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m2744u(UnmanagedEventRequest unmanagedEventRequest, oo0 oo0Var) {
        unmanagedEventRequest.getClass();
        unmanagedEventRequest.format_ = oo0Var.getNumber();
        unmanagedEventRequest.bitField0_ |= 8;
    }

    /* JADX INFO: renamed from: v */
    public static void m2745v(UnmanagedEventRequest unmanagedEventRequest, String str) {
        unmanagedEventRequest.getClass();
        str.getClass();
        unmanagedEventRequest.lineitemId_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m2746w(UnmanagedEventRequest unmanagedEventRequest, long j) {
        unmanagedEventRequest.bitField0_ |= 1;
        unmanagedEventRequest.playbackPosition_ = j;
    }

    /* JADX INFO: renamed from: x */
    public static void m2747x(UnmanagedEventRequest unmanagedEventRequest, String str) {
        unmanagedEventRequest.getClass();
        str.getClass();
        unmanagedEventRequest.productName_ = str;
    }

    /* JADX INFO: renamed from: y */
    public static void m2748y(UnmanagedEventRequest unmanagedEventRequest, String str) {
        unmanagedEventRequest.getClass();
        str.getClass();
        unmanagedEventRequest.requestId_ = str;
    }

    /* JADX INFO: renamed from: z */
    public static void m2749z(UnmanagedEventRequest unmanagedEventRequest, String str) {
        unmanagedEventRequest.getClass();
        str.getClass();
        unmanagedEventRequest.slotId_ = str;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003ဃ\u0000\u0004ለ\u0001\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nለ\u0002\u000bဌ\u0003\fȚ\rဋ\u0004\u000eለ\u0005", new Object[]{"bitField0_", "adId_", "eventType_", "playbackPosition_", "eventReason_", "lineitemId_", "creativeId_", "requestId_", "productName_", "slotId_", "eventSource_", "format_", "trackingUrls_", "durationSeconds_", "assetId_"});
        }
        if (iOrdinal == 3) {
            return new UnmanagedEventRequest();
        }
        if (iOrdinal == 4) {
            return new m3a1(DEFAULT_INSTANCE);
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
        synchronized (UnmanagedEventRequest.class) {
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
