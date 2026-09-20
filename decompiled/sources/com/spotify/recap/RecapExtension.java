package com.spotify.recap;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.u6u0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class RecapExtension extends AbstractC0269h implements sre0 {
    private static final RecapExtension DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PROGRESS_REQUIRED_FIELD_NUMBER = 3;
    public static final int RECAP_AVAILABLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private Duration progressRequired_;
    private boolean recapAvailable_;

    static {
        RecapExtension recapExtension = new RecapExtension();
        DEFAULT_INSTANCE = recapExtension;
        AbstractC0269h.registerDefaultInstance(RecapExtension.class, recapExtension);
    }

    private RecapExtension() {
    }

    /* JADX INFO: renamed from: p */
    public static RecapExtension m20206p(byte[] bArr) {
        return (RecapExtension) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u0007\u0003ဉ\u0000", new Object[]{"bitField0_", "recapAvailable_", "progressRequired_"});
        }
        if (iOrdinal == 3) {
            return new RecapExtension();
        }
        if (iOrdinal == 4) {
            return new u6u0(DEFAULT_INSTANCE, 14);
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
        synchronized (RecapExtension.class) {
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
    public final Duration m20207n() {
        Duration duration = this.progressRequired_;
        return duration == null ? Duration.m1928p() : duration;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m20208o() {
        return this.recapAvailable_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
