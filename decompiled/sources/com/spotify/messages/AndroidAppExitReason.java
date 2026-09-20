package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.ru3;
import p204p.sre0;
import p204p.su3;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidAppExitReason extends AbstractC0269h implements sre0 {
    private static final AndroidAppExitReason DEFAULT_INSTANCE;
    public static final int EXIT_DESC_FIELD_NUMBER = 2;
    public static final int IMPORTANCE_FIELD_NUMBER = 3;
    public static final int METADATA_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int PSS_FIELD_NUMBER = 5;
    public static final int REASON_FIELD_NUMBER = 1;
    public static final int RSS_FIELD_NUMBER = 6;
    public static final int STATUS_FIELD_NUMBER = 4;
    public static final int SUB_REASON_FIELD_NUMBER = 9;
    public static final int TIMESTAMP_FIELD_NUMBER = 8;
    private int bitField0_;
    private long pss_;
    private long rss_;
    private int status_;
    private int subReason_;
    private long timestamp_;
    private ihc0 metadata_ = ihc0.f102235b;
    private String reason_ = "";
    private String exitDesc_ = "";
    private String importance_ = "";

    static {
        AndroidAppExitReason androidAppExitReason = new AndroidAppExitReason();
        DEFAULT_INSTANCE = androidAppExitReason;
        AbstractC0269h.registerDefaultInstance(AndroidAppExitReason.class, androidAppExitReason);
    }

    private AndroidAppExitReason() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13556n(AndroidAppExitReason androidAppExitReason, String str) {
        androidAppExitReason.getClass();
        str.getClass();
        androidAppExitReason.bitField0_ |= 2;
        androidAppExitReason.exitDesc_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m13557o(AndroidAppExitReason androidAppExitReason, String str) {
        androidAppExitReason.getClass();
        str.getClass();
        androidAppExitReason.bitField0_ |= 4;
        androidAppExitReason.importance_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m13558p(AndroidAppExitReason androidAppExitReason, long j) {
        androidAppExitReason.bitField0_ |= 16;
        androidAppExitReason.pss_ = j;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13559q(AndroidAppExitReason androidAppExitReason, String str) {
        androidAppExitReason.getClass();
        str.getClass();
        androidAppExitReason.bitField0_ |= 1;
        androidAppExitReason.reason_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m13560r(AndroidAppExitReason androidAppExitReason, long j) {
        androidAppExitReason.bitField0_ |= 32;
        androidAppExitReason.rss_ = j;
    }

    /* JADX INFO: renamed from: s */
    public static void m13561s(AndroidAppExitReason androidAppExitReason, int i) {
        androidAppExitReason.bitField0_ |= 8;
        androidAppExitReason.status_ = i;
    }

    /* JADX INFO: renamed from: t */
    public static void m13562t(AndroidAppExitReason androidAppExitReason, long j) {
        androidAppExitReason.bitField0_ |= 64;
        androidAppExitReason.timestamp_ = j;
    }

    /* JADX INFO: renamed from: u */
    public static ru3 m13563u() {
        return (ru3) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u00072\bဂ\u0006\tင\u0007", new Object[]{"bitField0_", "reason_", "exitDesc_", "importance_", "status_", "pss_", "rss_", "metadata_", su3.f213988a, "timestamp_", "subReason_"});
        }
        if (iOrdinal == 3) {
            return new AndroidAppExitReason();
        }
        if (iOrdinal == 4) {
            return new ru3(DEFAULT_INSTANCE);
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
        synchronized (AndroidAppExitReason.class) {
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
