package com.spotify.socialprompting.p151v1;

import com.google.protobuf.AbstractC0269h;
import p204p.byy;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class FilterPill extends AbstractC0269h implements sre0 {
    private static final FilterPill DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SESSION_FIELD_NUMBER = 1;
    public static final int SUGGESTED_FIELD_NUMBER = 2;
    private int pillCase_ = 0;
    private Object pill_;

    static {
        FilterPill filterPill = new FilterPill();
        DEFAULT_INSTANCE = filterPill;
        AbstractC0269h.registerDefaultInstance(FilterPill.class, filterPill);
    }

    private FilterPill() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"pill_", "pillCase_", SocialPromptSession.class, SuggestedPrompt.class});
        }
        if (iOrdinal == 3) {
            return new FilterPill();
        }
        if (iOrdinal == 4) {
            return new byy(DEFAULT_INSTANCE, 5);
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
        synchronized (FilterPill.class) {
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
    public final int m21445n() {
        int i = this.pillCase_;
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

    /* JADX INFO: renamed from: o */
    public final SocialPromptSession m21446o() {
        return this.pillCase_ == 1 ? (SocialPromptSession) this.pill_ : SocialPromptSession.m21459n();
    }

    /* JADX INFO: renamed from: p */
    public final SuggestedPrompt m21447p() {
        return this.pillCase_ == 2 ? (SuggestedPrompt) this.pill_ : SuggestedPrompt.m21464n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
