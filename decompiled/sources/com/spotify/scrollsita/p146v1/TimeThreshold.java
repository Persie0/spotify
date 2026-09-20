package com.spotify.scrollsita.p146v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qm71;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class TimeThreshold extends AbstractC0269h implements sre0 {
    private static final TimeThreshold DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SECONDS_BEFORE_END_FIELD_NUMBER = 2;
    public static final int SECONDS_FROM_START_FIELD_NUMBER = 1;
    private int anchorCase_ = 0;
    private Object anchor_;

    static {
        TimeThreshold timeThreshold = new TimeThreshold();
        DEFAULT_INSTANCE = timeThreshold;
        AbstractC0269h.registerDefaultInstance(TimeThreshold.class, timeThreshold);
    }

    private TimeThreshold() {
    }

    /* JADX INFO: renamed from: o */
    public static TimeThreshold m20672o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u00014\u0000\u00024\u0000", new Object[]{"anchor_", "anchorCase_"});
        }
        if (iOrdinal == 3) {
            return new TimeThreshold();
        }
        if (iOrdinal == 4) {
            return new qm71(DEFAULT_INSTANCE, 3);
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
        synchronized (TimeThreshold.class) {
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
    public final int m20673n() {
        int i = this.anchorCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final float m20674p() {
        if (this.anchorCase_ == 2) {
            return ((Float) this.anchor_).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: q */
    public final float m20675q() {
        if (this.anchorCase_ == 1) {
            return ((Float) this.anchor_).floatValue();
        }
        return 0.0f;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
