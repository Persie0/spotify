package com.spotify.highlightsstats.data.proto.sharing.p074v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import java.util.Iterator;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.n350;
import p204p.n511;
import p204p.o511;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.z110;
import p204p.zy5;

/* JADX INFO: loaded from: classes7.dex */
public final class ShareStatsRequest extends AbstractC0269h implements sre0 {
    public static final int DATE_FIELD_NUMBER = 1;
    private static final ShareStatsRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STATS_TYPE_FIELD_NUMBER = 3;
    public static final int TIME_ZONE_FIELD_NUMBER = 2;
    private static final vd50 statsType_converter_ = new zy5(25);
    private int bitField0_;
    private Timestamp date_;
    private int statsTypeMemoizedSerializedSize;
    private String timeZone_ = "";
    private ud50 statsType_ = AbstractC0269h.emptyIntList();

    static {
        ShareStatsRequest shareStatsRequest = new ShareStatsRequest();
        DEFAULT_INSTANCE = shareStatsRequest;
        AbstractC0269h.registerDefaultInstance(ShareStatsRequest.class, shareStatsRequest);
    }

    private ShareStatsRequest() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m11313n(ShareStatsRequest shareStatsRequest, List list) {
        ud50 ud50Var = shareStatsRequest.statsType_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            shareStatsRequest.statsType_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o511 o511Var = (o511) it.next();
            ((n350) shareStatsRequest.statsType_).m63581b(o511Var.getNumber());
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m11314o(ShareStatsRequest shareStatsRequest, Timestamp timestamp) {
        shareStatsRequest.getClass();
        shareStatsRequest.date_ = timestamp;
        shareStatsRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m11315p(ShareStatsRequest shareStatsRequest, String str) {
        shareStatsRequest.getClass();
        shareStatsRequest.timeZone_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static n511 m11316q() {
        return (n511) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003,", new Object[]{"bitField0_", "date_", "timeZone_", "statsType_"});
        }
        if (iOrdinal == 3) {
            return new ShareStatsRequest();
        }
        if (iOrdinal == 4) {
            return new n511(DEFAULT_INSTANCE);
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
        synchronized (ShareStatsRequest.class) {
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
