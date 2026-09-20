package com.spotify.collection2.itemdata.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z3f;

/* JADX INFO: loaded from: classes5.dex */
public final class CollectionItemdata$SnoozedRecsItemData extends AbstractC0269h implements sre0 {
    private static final CollectionItemdata$SnoozedRecsItemData DEFAULT_INSTANCE;
    public static final int EXPIRES_AT_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SNOOZE_CONTEXT_URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private Timestamp expiresAt_;
    private String snoozeContextUri_ = "";

    static {
        CollectionItemdata$SnoozedRecsItemData collectionItemdata$SnoozedRecsItemData = new CollectionItemdata$SnoozedRecsItemData();
        DEFAULT_INSTANCE = collectionItemdata$SnoozedRecsItemData;
        AbstractC0269h.registerDefaultInstance(CollectionItemdata$SnoozedRecsItemData.class, collectionItemdata$SnoozedRecsItemData);
    }

    private CollectionItemdata$SnoozedRecsItemData() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "expiresAt_", "snoozeContextUri_"});
        }
        if (iOrdinal == 3) {
            return new CollectionItemdata$SnoozedRecsItemData();
        }
        if (iOrdinal == 4) {
            return new z3f(DEFAULT_INSTANCE, 8);
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
        synchronized (CollectionItemdata$SnoozedRecsItemData.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
