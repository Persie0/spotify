package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.umw;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsOptional$OptionalInt64 extends AbstractC0269h implements sre0 {
    private static final EsOptional$OptionalInt64 DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    static {
        EsOptional$OptionalInt64 esOptional$OptionalInt64 = new EsOptional$OptionalInt64();
        DEFAULT_INSTANCE = esOptional$OptionalInt64;
        AbstractC0269h.registerDefaultInstance(EsOptional$OptionalInt64.class, esOptional$OptionalInt64);
    }

    private EsOptional$OptionalInt64() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17775n(EsOptional$OptionalInt64 esOptional$OptionalInt64, long j) {
        esOptional$OptionalInt64.value_ = j;
    }

    /* JADX INFO: renamed from: o */
    public static EsOptional$OptionalInt64 m17776o() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static umw m17777q() {
        return (umw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"value_"});
        }
        if (iOrdinal == 3) {
            return new EsOptional$OptionalInt64();
        }
        if (iOrdinal == 4) {
            return new umw(DEFAULT_INSTANCE);
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
        synchronized (EsOptional$OptionalInt64.class) {
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

    /* JADX INFO: renamed from: p */
    public final long m17778p() {
        return this.value_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
