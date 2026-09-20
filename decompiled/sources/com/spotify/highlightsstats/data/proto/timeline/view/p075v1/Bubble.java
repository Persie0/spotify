package com.spotify.highlightsstats.data.proto.timeline.view.p075v1;

import com.google.protobuf.AbstractC0269h;
import p204p.jpa;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z79;

/* JADX INFO: loaded from: classes7.dex */
public final class Bubble extends AbstractC0269h implements sre0 {
    private static final Bubble DEFAULT_INSTANCE;
    public static final int MINUTES_LISTENED_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 4;
    public static final int TIME_OF_DAY_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int size_;
    private int value_;
    private String timeOfDay_ = "";
    private String minutesListened_ = "";

    static {
        Bubble bubble = new Bubble();
        DEFAULT_INSTANCE = bubble;
        AbstractC0269h.registerDefaultInstance(Bubble.class, bubble);
    }

    private Bubble() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004\f", new Object[]{"timeOfDay_", "value_", "minutesListened_", "size_"});
        }
        if (iOrdinal == 3) {
            return new Bubble();
        }
        if (iOrdinal == 4) {
            return new z79(DEFAULT_INSTANCE, 25);
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
        synchronized (Bubble.class) {
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
    public final String m11323n() {
        return this.minutesListened_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final jpa m11324o() {
        jpa jpaVar;
        int i = this.size_;
        if (i == 0) {
            jpaVar = jpa.UNSPECIFIED;
        } else if (i == 1) {
            jpaVar = jpa.XL;
        } else if (i == 2) {
            jpaVar = jpa.L;
        } else if (i != 3) {
            jpaVar = i != 4 ? null : jpa.S;
        } else {
            jpaVar = jpa.M;
        }
        return jpaVar == null ? jpa.UNRECOGNIZED : jpaVar;
    }

    /* JADX INFO: renamed from: p */
    public final String m11325p() {
        return this.timeOfDay_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
