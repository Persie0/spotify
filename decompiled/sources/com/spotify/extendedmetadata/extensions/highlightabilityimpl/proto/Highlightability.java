package com.spotify.extendedmetadata.extensions.highlightabilityimpl.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import p204p.og20;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class Highlightability extends AbstractC0269h implements sre0 {
    private static final Highlightability DEFAULT_INSTANCE;
    public static final int MAX_LENGTH_FIELD_NUMBER = 3;
    public static final int MIN_LENGTH_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int USER_HIGHLIGHTABLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private Duration maxLength_;
    private Duration minLength_;
    private boolean userHighlightable_;

    static {
        Highlightability highlightability = new Highlightability();
        DEFAULT_INSTANCE = highlightability;
        AbstractC0269h.registerDefaultInstance(Highlightability.class, highlightability);
    }

    private Highlightability() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static Highlightability m10153r(byte[] bArr) {
        return (Highlightability) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "userHighlightable_", "minLength_", "maxLength_"});
        }
        if (iOrdinal == 3) {
            return new Highlightability();
        }
        if (iOrdinal == 4) {
            return new og20(23);
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
        synchronized (Highlightability.class) {
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
    public final Duration m10154o() {
        Duration duration = this.maxLength_;
        return duration == null ? Duration.m1928p() : duration;
    }

    /* JADX INFO: renamed from: p */
    public final Duration m10155p() {
        Duration duration = this.minLength_;
        return duration == null ? Duration.m1928p() : duration;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m10156q() {
        return this.userHighlightable_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
