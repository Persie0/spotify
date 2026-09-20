package com.spotify.time.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vnw;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsServerTime$ServerTime extends AbstractC0269h implements sre0 {
    public static final int CURRENTSERVERTIME_FIELD_NUMBER = 2;
    public static final int CURRENTTIMEMILLIS_FIELD_NUMBER = 1;
    private static final EsServerTime$ServerTime DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private long currentServerTime_;
    private long currentTimeMillis_;

    static {
        EsServerTime$ServerTime esServerTime$ServerTime = new EsServerTime$ServerTime();
        DEFAULT_INSTANCE = esServerTime$ServerTime;
        AbstractC0269h.registerDefaultInstance(EsServerTime$ServerTime.class, esServerTime$ServerTime);
    }

    private EsServerTime$ServerTime() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static EsServerTime$ServerTime m21809r(byte[] bArr) {
        return (EsServerTime$ServerTime) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002ဂ\u0000", new Object[]{"bitField0_", "currentTimeMillis_", "currentServerTime_"});
        }
        if (iOrdinal == 3) {
            return new EsServerTime$ServerTime();
        }
        if (iOrdinal == 4) {
            return new vnw(7);
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
        synchronized (EsServerTime$ServerTime.class) {
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

    /* JADX INFO: renamed from: o */
    public final long m21810o() {
        return this.currentServerTime_;
    }

    /* JADX INFO: renamed from: p */
    public final long m21811p() {
        return this.currentTimeMillis_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m21812q() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
