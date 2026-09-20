package com.spotify.playlist.policy.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sr50;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ItemCurationStatePolicy extends AbstractC0269h implements sre0 {
    private static final ItemCurationStatePolicy DEFAULT_INSTANCE;
    public static final int IS_CURATED_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private boolean isCurated_;

    static {
        ItemCurationStatePolicy itemCurationStatePolicy = new ItemCurationStatePolicy();
        DEFAULT_INSTANCE = itemCurationStatePolicy;
        AbstractC0269h.registerDefaultInstance(ItemCurationStatePolicy.class, itemCurationStatePolicy);
    }

    private ItemCurationStatePolicy() {
    }

    /* JADX INFO: renamed from: n */
    public static void m18309n(ItemCurationStatePolicy itemCurationStatePolicy, boolean z) {
        itemCurationStatePolicy.isCurated_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static ItemCurationStatePolicy m18311p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static sr50 m18312q() {
        return (sr50) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"isCurated_"});
        }
        if (iOrdinal == 3) {
            return new ItemCurationStatePolicy();
        }
        if (iOrdinal == 4) {
            return new sr50();
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
        synchronized (ItemCurationStatePolicy.class) {
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

    public final boolean getIsCurated() {
        return this.isCurated_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
