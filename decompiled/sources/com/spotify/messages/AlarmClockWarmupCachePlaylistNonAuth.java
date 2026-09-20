package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qv2;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class AlarmClockWarmupCachePlaylistNonAuth extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_URI_FIELD_NUMBER = 2;
    private static final AlarmClockWarmupCachePlaylistNonAuth DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int WARMUP_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String warmupId_ = "";
    private String contextUri_ = "";

    static {
        AlarmClockWarmupCachePlaylistNonAuth alarmClockWarmupCachePlaylistNonAuth = new AlarmClockWarmupCachePlaylistNonAuth();
        DEFAULT_INSTANCE = alarmClockWarmupCachePlaylistNonAuth;
        AbstractC0269h.registerDefaultInstance(AlarmClockWarmupCachePlaylistNonAuth.class, alarmClockWarmupCachePlaylistNonAuth);
    }

    private AlarmClockWarmupCachePlaylistNonAuth() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13542n(AlarmClockWarmupCachePlaylistNonAuth alarmClockWarmupCachePlaylistNonAuth, String str) {
        alarmClockWarmupCachePlaylistNonAuth.getClass();
        str.getClass();
        alarmClockWarmupCachePlaylistNonAuth.bitField0_ |= 2;
        alarmClockWarmupCachePlaylistNonAuth.contextUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m13543o(AlarmClockWarmupCachePlaylistNonAuth alarmClockWarmupCachePlaylistNonAuth, String str) {
        alarmClockWarmupCachePlaylistNonAuth.getClass();
        str.getClass();
        alarmClockWarmupCachePlaylistNonAuth.bitField0_ |= 1;
        alarmClockWarmupCachePlaylistNonAuth.warmupId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static qv2 m13544p() {
        return (qv2) DEFAULT_INSTANCE.createBuilder();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "warmupId_", "contextUri_"});
        }
        if (iOrdinal == 3) {
            return new AlarmClockWarmupCachePlaylistNonAuth();
        }
        if (iOrdinal == 4) {
            return new qv2(DEFAULT_INSTANCE);
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
        synchronized (AlarmClockWarmupCachePlaylistNonAuth.class) {
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
