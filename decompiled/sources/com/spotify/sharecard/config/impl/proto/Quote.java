package com.spotify.sharecard.config.impl.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.s0u0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Quote extends AbstractC0269h implements sre0 {
    private static final Quote DEFAULT_INSTANCE;
    public static final int LINES_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    private int bitField0_;
    private ae50 lines_ = AbstractC0269h.emptyProtobufList();
    private long timestamp_;

    static {
        Quote quote = new Quote();
        DEFAULT_INSTANCE = quote;
        AbstractC0269h.registerDefaultInstance(Quote.class, quote);
    }

    private Quote() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21157n(Quote quote, ArrayList arrayList) {
        ae50 ae50Var = quote.lines_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            quote.lines_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, quote.lines_);
    }

    /* JADX INFO: renamed from: o */
    public static void m21158o(Quote quote, long j) {
        quote.bitField0_ |= 1;
        quote.timestamp_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static Quote m21159p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static s0u0 m21160r() {
        return (s0u0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000", new Object[]{"bitField0_", "lines_", Line.class, "timestamp_"});
        }
        if (iOrdinal == 3) {
            return new Quote();
        }
        if (iOrdinal == 4) {
            return new s0u0(DEFAULT_INSTANCE);
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
        synchronized (Quote.class) {
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

    public final long getTimestamp() {
        return this.timestamp_;
    }

    public final boolean hasTimestamp() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m21161q() {
        return this.lines_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
