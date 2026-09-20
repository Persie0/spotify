package com.spotify.scrollsita.p146v1;

import com.google.protobuf.AbstractC0269h;
import p204p.kea1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class UprankCondition extends AbstractC0269h implements sre0 {
    public static final int AT_FIELD_NUMBER = 2;
    private static final UprankCondition DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TARGET_POSITION_FIELD_NUMBER = 1;
    private TimeThreshold at_;
    private int bitField0_;
    private int targetPosition_;

    static {
        UprankCondition uprankCondition = new UprankCondition();
        DEFAULT_INSTANCE = uprankCondition;
        AbstractC0269h.registerDefaultInstance(UprankCondition.class, uprankCondition);
    }

    private UprankCondition() {
    }

    /* JADX INFO: renamed from: o */
    public static UprankCondition m20681o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "targetPosition_", "at_"});
        }
        if (iOrdinal == 3) {
            return new UprankCondition();
        }
        if (iOrdinal == 4) {
            return new kea1(DEFAULT_INSTANCE, 2);
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
        synchronized (UprankCondition.class) {
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
    public final TimeThreshold m20682n() {
        TimeThreshold timeThreshold = this.at_;
        return timeThreshold == null ? TimeThreshold.m20672o() : timeThreshold;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final int m20683p() {
        return this.targetPosition_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m20684q() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
