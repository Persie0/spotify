package com.spotify.lockstate.p104v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.k810;
import p204p.myw0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class GetLockResponse extends AbstractC0269h implements sre0 {
    private static final GetLockResponse DEFAULT_INSTANCE;
    public static final int LOCK_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int RESOLUTION_FAILURE_REASON_FIELD_NUMBER = 2;
    private int bitField0_;
    private Lock lock_;
    private int resolutionFailureReason_;

    static {
        GetLockResponse getLockResponse = new GetLockResponse();
        DEFAULT_INSTANCE = getLockResponse;
        AbstractC0269h.registerDefaultInstance(GetLockResponse.class, getLockResponse);
    }

    private GetLockResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "lock_", "resolutionFailureReason_"});
        }
        if (iOrdinal == 3) {
            return new GetLockResponse();
        }
        if (iOrdinal == 4) {
            return new k810(DEFAULT_INSTANCE, 17);
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
        synchronized (GetLockResponse.class) {
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

    /* JADX INFO: renamed from: n */
    public final Lock m13235n() {
        Lock lock = this.lock_;
        return lock == null ? Lock.m13239o() : lock;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final myw0 m13236o() {
        myw0 myw0Var;
        int i = this.resolutionFailureReason_;
        if (i == 0) {
            myw0Var = myw0.RESOLUTION_FAILURE_REASON_UNSPECIFIED;
        } else if (i == 1) {
            myw0Var = myw0.RESOLUTION_FAILURE_REASON_ELIGIBILITY_TIMEOUT;
        } else if (i != 2) {
            myw0Var = i != 3 ? null : myw0.RESOLUTION_FAILURE_REASON_INTERNAL_ERROR;
        } else {
            myw0Var = myw0.RESOLUTION_FAILURE_REASON_CONTENT_RESOLUTION_FAILED;
        }
        return myw0Var == null ? myw0.UNRECOGNIZED : myw0Var;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m13237p() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m13238q() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
