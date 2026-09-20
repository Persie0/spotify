package com.spotify.scrollsita.p146v1;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.msl;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Credits extends AbstractC0269h implements sre0 {
    public static final int CONTRIBUTOR_URI_FIELD_NUMBER = 2;
    private static final Credits DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String entityUri_ = "";
    private ae50 contributorUri_ = AbstractC0269h.emptyProtobufList();

    static {
        Credits credits = new Credits();
        DEFAULT_INSTANCE = credits;
        AbstractC0269h.registerDefaultInstance(Credits.class, credits);
    }

    private Credits() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20468n(Credits credits, ArrayList arrayList) {
        ae50 ae50Var = credits.contributorUri_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            credits.contributorUri_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, credits.contributorUri_);
    }

    /* JADX INFO: renamed from: o */
    public static void m20469o(Credits credits, String str) {
        credits.getClass();
        str.getClass();
        credits.entityUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static Credits m20470q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static msl m20471s() {
        return (msl) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"entityUri_", "contributorUri_"});
        }
        if (iOrdinal == 3) {
            return new Credits();
        }
        if (iOrdinal == 4) {
            return new msl(DEFAULT_INSTANCE);
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
        synchronized (Credits.class) {
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
    public final ae50 m20472p() {
        return this.contributorUri_;
    }

    /* JADX INFO: renamed from: r */
    public final String m20473r() {
        return this.entityUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
