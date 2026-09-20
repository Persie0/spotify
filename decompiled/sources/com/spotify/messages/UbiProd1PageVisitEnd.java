package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ihc0;
import p204p.ore0;
import p204p.ow91;
import p204p.pre0;
import p204p.pw91;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class UbiProd1PageVisitEnd extends AbstractC0269h implements sre0 {
    public static final int CLIENT_DEBUG_METADATA_FIELD_NUMBER = 6;
    public static final int CLIENT_TIMEZONE_FIELD_NUMBER = 4;
    private static final UbiProd1PageVisitEnd DEFAULT_INSTANCE;
    public static final int END_TIMESTAMP_FIELD_NUMBER = 3;
    public static final int ERRORS_FIELD_NUMBER = 7;
    public static final int PAGE_PRESENTATION_ID_FIELD_NUMBER = 2;
    public static final int PAGE_VISIT_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SCENE_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private long endTimestamp_;
    private int pagePresentationId_;
    private ihc0 clientDebugMetadata_ = ihc0.f102235b;
    private String pageVisitId_ = "";
    private String clientTimezone_ = "";
    private String sceneId_ = "";
    private ae50 errors_ = AbstractC0269h.emptyProtobufList();

    static {
        UbiProd1PageVisitEnd ubiProd1PageVisitEnd = new UbiProd1PageVisitEnd();
        DEFAULT_INSTANCE = ubiProd1PageVisitEnd;
        AbstractC0269h.registerDefaultInstance(UbiProd1PageVisitEnd.class, ubiProd1PageVisitEnd);
    }

    private UbiProd1PageVisitEnd() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14827n(UbiProd1PageVisitEnd ubiProd1PageVisitEnd, String str) {
        ubiProd1PageVisitEnd.getClass();
        str.getClass();
        ubiProd1PageVisitEnd.bitField0_ |= 8;
        ubiProd1PageVisitEnd.clientTimezone_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14828o(UbiProd1PageVisitEnd ubiProd1PageVisitEnd, long j) {
        ubiProd1PageVisitEnd.bitField0_ |= 4;
        ubiProd1PageVisitEnd.endTimestamp_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static void m14829p(UbiProd1PageVisitEnd ubiProd1PageVisitEnd, int i) {
        ubiProd1PageVisitEnd.bitField0_ |= 2;
        ubiProd1PageVisitEnd.pagePresentationId_ = i;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14830q(UbiProd1PageVisitEnd ubiProd1PageVisitEnd, String str) {
        ubiProd1PageVisitEnd.getClass();
        str.getClass();
        ubiProd1PageVisitEnd.bitField0_ |= 1;
        ubiProd1PageVisitEnd.pageVisitId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m14831r(UbiProd1PageVisitEnd ubiProd1PageVisitEnd, String str) {
        ubiProd1PageVisitEnd.getClass();
        ubiProd1PageVisitEnd.bitField0_ |= 16;
        ubiProd1PageVisitEnd.sceneId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static ow91 m14832s() {
        return (ow91) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0001\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u00062\u0007\u001a", new Object[]{"bitField0_", "pageVisitId_", "pagePresentationId_", "endTimestamp_", "clientTimezone_", "sceneId_", "clientDebugMetadata_", pw91.f181973a, "errors_"});
        }
        if (iOrdinal == 3) {
            return new UbiProd1PageVisitEnd();
        }
        if (iOrdinal == 4) {
            return new ow91(DEFAULT_INSTANCE);
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
        synchronized (UbiProd1PageVisitEnd.class) {
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
