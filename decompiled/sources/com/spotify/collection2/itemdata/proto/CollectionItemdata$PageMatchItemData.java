package com.spotify.collection2.itemdata.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import p204p.g4f;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class CollectionItemdata$PageMatchItemData extends AbstractC0269h implements sre0 {
    private static final CollectionItemdata$PageMatchItemData DEFAULT_INSTANCE;
    public static final int PAGE_MATCH_OFFSET_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private Duration pageMatchOffset_;

    static {
        CollectionItemdata$PageMatchItemData collectionItemdata$PageMatchItemData = new CollectionItemdata$PageMatchItemData();
        DEFAULT_INSTANCE = collectionItemdata$PageMatchItemData;
        AbstractC0269h.registerDefaultInstance(CollectionItemdata$PageMatchItemData.class, collectionItemdata$PageMatchItemData);
    }

    private CollectionItemdata$PageMatchItemData() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6827n(CollectionItemdata$PageMatchItemData collectionItemdata$PageMatchItemData, Duration duration) {
        collectionItemdata$PageMatchItemData.getClass();
        duration.getClass();
        collectionItemdata$PageMatchItemData.pageMatchOffset_ = duration;
        collectionItemdata$PageMatchItemData.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static CollectionItemdata$PageMatchItemData m6828o() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static g4f m6829q() {
        return (g4f) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "pageMatchOffset_"});
        }
        if (iOrdinal == 3) {
            return new CollectionItemdata$PageMatchItemData();
        }
        if (iOrdinal == 4) {
            return new g4f(DEFAULT_INSTANCE);
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
        synchronized (CollectionItemdata$PageMatchItemData.class) {
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
    public final Duration m6830p() {
        Duration duration = this.pageMatchOffset_;
        return duration == null ? Duration.m1928p() : duration;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
