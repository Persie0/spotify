package com.spotify.party.mobile.p121v2;

import com.google.protobuf.AbstractC0269h;
import p204p.bpj0;
import p204p.dj90;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class ObserveParty extends AbstractC0269h implements sre0 {
    private static final ObserveParty DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RESTRICTION_FIELD_NUMBER = 1;
    private int restriction_;

    static {
        ObserveParty observeParty = new ObserveParty();
        DEFAULT_INSTANCE = observeParty;
        AbstractC0269h.registerDefaultInstance(ObserveParty.class, observeParty);
    }

    private ObserveParty() {
    }

    /* JADX INFO: renamed from: n */
    public static ObserveParty m16631n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"restriction_"});
        }
        if (iOrdinal == 3) {
            return new ObserveParty();
        }
        if (iOrdinal == 4) {
            return new bpj0(DEFAULT_INSTANCE, 11);
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
        synchronized (ObserveParty.class) {
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
    public final dj90 m16632o() {
        dj90 dj90Var;
        int i = this.restriction_;
        if (i == 0) {
            dj90Var = dj90.UNKNOWN_LISTENING_PARTY_RESTRICTION;
        } else if (i == 1) {
            dj90Var = dj90.NO_RESTRICTION;
        } else if (i == 2) {
            dj90Var = dj90.NON_PREMIUM;
        } else if (i == 3) {
            dj90Var = dj90.GEO_BLOCKED;
        } else if (i != 4) {
            dj90Var = i != 5 ? null : dj90.NOT_REGISTERED;
        } else {
            dj90Var = dj90.AGE_GATED;
        }
        return dj90Var == null ? dj90.UNRECOGNIZED : dj90Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
