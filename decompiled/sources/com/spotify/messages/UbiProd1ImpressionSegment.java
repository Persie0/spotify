package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.fw91;
import p204p.gw91;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class UbiProd1ImpressionSegment extends AbstractC0269h implements sre0 {
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 10;
    public static final int APP_VISIT_INDEX_FIELD_NUMBER = 11;
    public static final int CLIENT_DEBUG_METADATA_FIELD_NUMBER = 5;
    private static final UbiProd1ImpressionSegment DEFAULT_INSTANCE;
    public static final int DWELL_TIME_MS_FIELD_NUMBER = 3;
    public static final int ELEMENT_PATH_NAMES_FIELD_NUMBER = 6;
    public static final int IMPRESSION_ID_FIELD_NUMBER = 1;
    public static final int PAGE_PRESENTATION_ID_FIELD_NUMBER = 9;
    public static final int PAGE_VISIT_ID_FIELD_NUMBER = 8;
    public static final int PARENT_PATH_NAMES_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int SEGMENT_INDEX_FIELD_NUMBER = 2;
    public static final int UBI_EVENT_CREATION_TIMESTAMP_FIELD_NUMBER = 4;
    private int appVisitIndex_;
    private int bitField0_;
    private long dwellTimeMs_;
    private int pagePresentationId_;
    private int segmentIndex_;
    private long ubiEventCreationTimestamp_;
    private ihc0 clientDebugMetadata_ = ihc0.f102235b;
    private String impressionId_ = "";
    private ae50 elementPathNames_ = AbstractC0269h.emptyProtobufList();
    private ae50 parentPathNames_ = AbstractC0269h.emptyProtobufList();
    private String pageVisitId_ = "";
    private String appInstanceId_ = "";

    static {
        UbiProd1ImpressionSegment ubiProd1ImpressionSegment = new UbiProd1ImpressionSegment();
        DEFAULT_INSTANCE = ubiProd1ImpressionSegment;
        AbstractC0269h.registerDefaultInstance(UbiProd1ImpressionSegment.class, ubiProd1ImpressionSegment);
    }

    private UbiProd1ImpressionSegment() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14662n(UbiProd1ImpressionSegment ubiProd1ImpressionSegment, ArrayList arrayList) {
        ae50 ae50Var = ubiProd1ImpressionSegment.elementPathNames_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1ImpressionSegment.elementPathNames_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, ubiProd1ImpressionSegment.elementPathNames_);
    }

    /* JADX INFO: renamed from: o */
    public static void m14663o(UbiProd1ImpressionSegment ubiProd1ImpressionSegment, ArrayList arrayList) {
        ae50 ae50Var = ubiProd1ImpressionSegment.parentPathNames_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1ImpressionSegment.parentPathNames_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, ubiProd1ImpressionSegment.parentPathNames_);
    }

    /* JADX INFO: renamed from: p */
    public static ihc0 m14664p(UbiProd1ImpressionSegment ubiProd1ImpressionSegment) {
        ihc0 ihc0Var = ubiProd1ImpressionSegment.clientDebugMetadata_;
        if (!ihc0Var.f102236a) {
            ubiProd1ImpressionSegment.clientDebugMetadata_ = ihc0Var.m50613h();
        }
        return ubiProd1ImpressionSegment.clientDebugMetadata_;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14665q(UbiProd1ImpressionSegment ubiProd1ImpressionSegment, String str) {
        ubiProd1ImpressionSegment.getClass();
        str.getClass();
        ubiProd1ImpressionSegment.bitField0_ |= 64;
        ubiProd1ImpressionSegment.appInstanceId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m14666r(UbiProd1ImpressionSegment ubiProd1ImpressionSegment, int i) {
        ubiProd1ImpressionSegment.bitField0_ |= 128;
        ubiProd1ImpressionSegment.appVisitIndex_ = i;
    }

    /* JADX INFO: renamed from: s */
    public static void m14667s(UbiProd1ImpressionSegment ubiProd1ImpressionSegment, long j) {
        ubiProd1ImpressionSegment.bitField0_ |= 4;
        ubiProd1ImpressionSegment.dwellTimeMs_ = j;
    }

    /* JADX INFO: renamed from: t */
    public static void m14668t(UbiProd1ImpressionSegment ubiProd1ImpressionSegment, String str) {
        ubiProd1ImpressionSegment.getClass();
        str.getClass();
        ubiProd1ImpressionSegment.bitField0_ |= 1;
        ubiProd1ImpressionSegment.impressionId_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m14669u(UbiProd1ImpressionSegment ubiProd1ImpressionSegment, int i) {
        ubiProd1ImpressionSegment.bitField0_ |= 32;
        ubiProd1ImpressionSegment.pagePresentationId_ = i;
    }

    /* JADX INFO: renamed from: v */
    public static void m14670v(UbiProd1ImpressionSegment ubiProd1ImpressionSegment, String str) {
        ubiProd1ImpressionSegment.getClass();
        str.getClass();
        ubiProd1ImpressionSegment.bitField0_ |= 16;
        ubiProd1ImpressionSegment.pageVisitId_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m14671w(UbiProd1ImpressionSegment ubiProd1ImpressionSegment, int i) {
        ubiProd1ImpressionSegment.bitField0_ |= 2;
        ubiProd1ImpressionSegment.segmentIndex_ = i;
    }

    /* JADX INFO: renamed from: x */
    public static void m14672x(UbiProd1ImpressionSegment ubiProd1ImpressionSegment, long j) {
        ubiProd1ImpressionSegment.bitField0_ |= 8;
        ubiProd1ImpressionSegment.ubiEventCreationTimestamp_ = j;
    }

    /* JADX INFO: renamed from: y */
    public static fw91 m14673y() {
        return (fw91) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0001\u0002\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u00052\u0006\u001a\u0007\u001a\bဈ\u0004\tင\u0005\nဈ\u0006\u000bင\u0007", new Object[]{"bitField0_", "impressionId_", "segmentIndex_", "dwellTimeMs_", "ubiEventCreationTimestamp_", "clientDebugMetadata_", gw91.f84958a, "elementPathNames_", "parentPathNames_", "pageVisitId_", "pagePresentationId_", "appInstanceId_", "appVisitIndex_"});
        }
        if (iOrdinal == 3) {
            return new UbiProd1ImpressionSegment();
        }
        if (iOrdinal == 4) {
            return new fw91(DEFAULT_INSTANCE);
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
        synchronized (UbiProd1ImpressionSegment.class) {
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
