package com.spotify.concertpageview.p048v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.s5x;
import p204p.sre0;
import p204p.vnw;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class EventHero extends AbstractC0269h implements sre0 {
    private static final EventHero DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TREATMENT_FIELD_NUMBER = 2;
    public static final int VISUAL_IDENTITY_URI_FIELD_NUMBER = 1;
    private int treatment_;
    private String visualIdentityUri_ = "";

    static {
        EventHero eventHero = new EventHero();
        DEFAULT_INSTANCE = eventHero;
        AbstractC0269h.registerDefaultInstance(EventHero.class, eventHero);
    }

    private EventHero() {
    }

    /* JADX INFO: renamed from: n */
    public static EventHero m7038n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"visualIdentityUri_", "treatment_"});
        }
        if (iOrdinal == 3) {
            return new EventHero();
        }
        if (iOrdinal == 4) {
            return new vnw(DEFAULT_INSTANCE, 23);
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
        synchronized (EventHero.class) {
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
    public final s5x m7039o() {
        s5x s5xVar;
        int i = this.treatment_;
        if (i == 0) {
            s5xVar = s5x.EVENT_HERO_TREATMENT_UNSPECIFIED;
        } else if (i != 1) {
            s5xVar = i != 2 ? null : s5x.EVENT_HERO_TREATMENT_CAMPAIGN_RESERVED;
        } else {
            s5xVar = s5x.EVENT_HERO_TREATMENT_STANDARD;
        }
        return s5xVar == null ? s5x.UNRECOGNIZED : s5xVar;
    }

    /* JADX INFO: renamed from: p */
    public final String m7040p() {
        return this.visualIdentityUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
