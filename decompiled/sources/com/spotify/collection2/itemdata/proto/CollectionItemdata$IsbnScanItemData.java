package com.spotify.collection2.itemdata.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.e4f;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z3f;

/* JADX INFO: loaded from: classes5.dex */
public final class CollectionItemdata$IsbnScanItemData extends AbstractC0269h implements sre0 {
    private static final CollectionItemdata$IsbnScanItemData DEFAULT_INSTANCE;
    public static final int LATEST_ISBN_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SCAN_STATUS_FIELD_NUMBER = 2;
    private String latestIsbn_ = "";
    private int scanStatus_;

    static {
        CollectionItemdata$IsbnScanItemData collectionItemdata$IsbnScanItemData = new CollectionItemdata$IsbnScanItemData();
        DEFAULT_INSTANCE = collectionItemdata$IsbnScanItemData;
        AbstractC0269h.registerDefaultInstance(CollectionItemdata$IsbnScanItemData.class, collectionItemdata$IsbnScanItemData);
    }

    private CollectionItemdata$IsbnScanItemData() {
    }

    /* JADX INFO: renamed from: n */
    public static CollectionItemdata$IsbnScanItemData m6815n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"latestIsbn_", "scanStatus_"});
        }
        if (iOrdinal == 3) {
            return new CollectionItemdata$IsbnScanItemData();
        }
        if (iOrdinal == 4) {
            return new z3f(DEFAULT_INSTANCE, 5);
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
        synchronized (CollectionItemdata$IsbnScanItemData.class) {
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
    public final String m6816o() {
        return this.latestIsbn_;
    }

    /* JADX INFO: renamed from: p */
    public final e4f m6817p() {
        e4f e4fVar;
        int i = this.scanStatus_;
        if (i == 0) {
            e4fVar = e4f.UNKNOWN;
        } else if (i != 1) {
            e4fVar = i != 2 ? null : e4f.SCAN_SKIPPED;
        } else {
            e4fVar = e4f.SCAN_PRESENT;
        }
        return e4fVar == null ? e4f.UNRECOGNIZED : e4fVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
