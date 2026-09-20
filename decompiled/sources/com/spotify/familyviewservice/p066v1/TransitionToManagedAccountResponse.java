package com.spotify.familyviewservice.p066v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.s791;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class TransitionToManagedAccountResponse extends AbstractC0269h implements sre0 {
    private static final TransitionToManagedAccountResponse DEFAULT_INSTANCE;
    public static final int MIGRATION_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TIMEOUT_FIELD_NUMBER = 1;
    private int bitField0_;
    private String migrationId_ = "";
    private Duration timeout_;

    static {
        TransitionToManagedAccountResponse transitionToManagedAccountResponse = new TransitionToManagedAccountResponse();
        DEFAULT_INSTANCE = transitionToManagedAccountResponse;
        AbstractC0269h.registerDefaultInstance(TransitionToManagedAccountResponse.class, transitionToManagedAccountResponse);
    }

    private TransitionToManagedAccountResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "timeout_", "migrationId_"});
        }
        if (iOrdinal == 3) {
            return new TransitionToManagedAccountResponse();
        }
        if (iOrdinal == 4) {
            return new s791(DEFAULT_INSTANCE, 9);
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
        synchronized (TransitionToManagedAccountResponse.class) {
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

    public final String getMigrationId() {
        return this.migrationId_;
    }

    public final Duration getTimeout() {
        Duration duration = this.timeout_;
        return duration == null ? Duration.m1928p() : duration;
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
