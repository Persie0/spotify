package com.spotify.premiummarketing.premiumdestinationpage.p130v1;

import com.google.protobuf.AbstractC0269h;
import p204p.isa0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class LoggingInfo extends AbstractC0269h implements sre0 {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 2;
    private static final LoggingInfo DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OFFER_TYPE_ID_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private String name_ = "";
    private String campaignId_ = "";
    private String offerTypeId_ = "";

    static {
        LoggingInfo loggingInfo = new LoggingInfo();
        DEFAULT_INSTANCE = loggingInfo;
        AbstractC0269h.registerDefaultInstance(LoggingInfo.class, loggingInfo);
    }

    private LoggingInfo() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19575n(LoggingInfo loggingInfo, String str) {
        loggingInfo.getClass();
        loggingInfo.campaignId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m19576o(LoggingInfo loggingInfo, String str) {
        loggingInfo.getClass();
        loggingInfo.name_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m19577p(LoggingInfo loggingInfo, String str) {
        loggingInfo.getClass();
        loggingInfo.offerTypeId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static LoggingInfo m19578r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static isa0 m19579t() {
        return (isa0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"name_", "campaignId_", "offerTypeId_"});
        }
        if (iOrdinal == 3) {
            return new LoggingInfo();
        }
        if (iOrdinal == 4) {
            return new isa0(DEFAULT_INSTANCE);
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
        synchronized (LoggingInfo.class) {
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

    public final String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: q */
    public final String m19580q() {
        return this.campaignId_;
    }

    /* JADX INFO: renamed from: s */
    public final String m19581s() {
        return this.offerTypeId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
