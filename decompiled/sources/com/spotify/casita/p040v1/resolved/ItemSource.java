package com.spotify.casita.p040v1.resolved;

import com.google.protobuf.AbstractC0269h;
import p204p.dv50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class ItemSource extends AbstractC0269h implements sre0 {
    private static final ItemSource DEFAULT_INSTANCE;
    public static final int LIST_PLATFORM_FIELD_NUMBER = 3;
    public static final int LOCAL_RECENTLY_PLAYED_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PROVIDED_FIELD_NUMBER = 1;
    private int sourceCase_ = 0;
    private Object source_;

    static {
        ItemSource itemSource = new ItemSource();
        DEFAULT_INSTANCE = itemSource;
        AbstractC0269h.registerDefaultInstance(ItemSource.class, itemSource);
    }

    private ItemSource() {
    }

    /* JADX INFO: renamed from: o */
    public static ItemSource m5692o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"source_", "sourceCase_", Provided.class, LocalRecentlyPlayed.class, ListPlatform.class});
        }
        if (iOrdinal == 3) {
            return new ItemSource();
        }
        if (iOrdinal == 4) {
            return new dv50(1);
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
        synchronized (ItemSource.class) {
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
    public final ListPlatform m5693p() {
        return this.sourceCase_ == 3 ? (ListPlatform) this.source_ : ListPlatform.m5697o();
    }

    /* JADX INFO: renamed from: q */
    public final Provided m5694q() {
        return this.sourceCase_ == 1 ? (Provided) this.source_ : Provided.m5756o();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m5695r() {
        return this.sourceCase_ == 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
