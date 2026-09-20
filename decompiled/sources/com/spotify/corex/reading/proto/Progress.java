package com.spotify.corex.reading.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.t3r0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class Progress extends AbstractC0269h implements sre0 {
    private static final Progress DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int POSITION_OFFSET_MS_FIELD_NUMBER = 2;
    public static final int TOTAL_DURATION_MS_FIELD_NUMBER = 1;
    private int bitField0_;
    private int positionOffsetMs_;
    private int totalDurationMs_;

    static {
        Progress progress = new Progress();
        DEFAULT_INSTANCE = progress;
        AbstractC0269h.registerDefaultInstance(Progress.class, progress);
    }

    private Progress() {
    }

    /* JADX INFO: renamed from: n */
    public static Progress m8130n() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002င\u0000", new Object[]{"bitField0_", "totalDurationMs_", "positionOffsetMs_"});
        }
        if (iOrdinal == 3) {
            return new Progress();
        }
        if (iOrdinal == 4) {
            return new t3r0(DEFAULT_INSTANCE, 25);
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
        synchronized (Progress.class) {
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
    public final int m8131o() {
        return this.positionOffsetMs_;
    }

    /* JADX INFO: renamed from: p */
    public final int m8132p() {
        return this.totalDurationMs_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
