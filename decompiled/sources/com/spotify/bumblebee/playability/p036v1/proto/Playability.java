package com.spotify.bumblebee.playability.p036v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.hnn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tso0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class Playability extends AbstractC0269h implements sre0 {
    private static final Playability DEFAULT_INSTANCE;
    public static final int IS_PLAYABLE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    private boolean isPlayable_;
    private int reason_;

    static {
        Playability playability = new Playability();
        DEFAULT_INSTANCE = playability;
        AbstractC0269h.registerDefaultInstance(Playability.class, playability);
    }

    private Playability() {
    }

    /* JADX INFO: renamed from: p */
    public static Playability m4188p(byte[] bArr) {
        return (Playability) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\f", new Object[]{"isPlayable_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new Playability();
        }
        if (iOrdinal == 4) {
            return new hnn0(28);
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
        synchronized (Playability.class) {
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

    public final boolean getIsPlayable() {
        return this.isPlayable_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final tso0 m4189o() {
        tso0 tso0VarM81479a = tso0.m81479a(this.reason_);
        return tso0VarM81479a == null ? tso0.UNRECOGNIZED : tso0VarM81479a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
