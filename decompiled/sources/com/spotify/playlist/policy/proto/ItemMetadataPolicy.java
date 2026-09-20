package com.spotify.playlist.policy.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ju50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ItemMetadataPolicy extends AbstractC0269h implements sre0 {
    private static final ItemMetadataPolicy DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 2;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private boolean image_;
    private boolean isExplicit_;
    private boolean name_;

    static {
        ItemMetadataPolicy itemMetadataPolicy = new ItemMetadataPolicy();
        DEFAULT_INSTANCE = itemMetadataPolicy;
        AbstractC0269h.registerDefaultInstance(ItemMetadataPolicy.class, itemMetadataPolicy);
    }

    private ItemMetadataPolicy() {
    }

    /* JADX INFO: renamed from: n */
    public static void m18317n(ItemMetadataPolicy itemMetadataPolicy) {
        itemMetadataPolicy.image_ = true;
    }

    /* JADX INFO: renamed from: o */
    public static void m18318o(ItemMetadataPolicy itemMetadataPolicy, boolean z) {
        itemMetadataPolicy.isExplicit_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m18319p(ItemMetadataPolicy itemMetadataPolicy, boolean z) {
        itemMetadataPolicy.name_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ItemMetadataPolicy m18320q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static ju50 m18321r() {
        return (ju50) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007", new Object[]{"name_", "image_", "isExplicit_"});
        }
        if (iOrdinal == 3) {
            return new ItemMetadataPolicy();
        }
        if (iOrdinal == 4) {
            return new ju50(DEFAULT_INSTANCE);
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
        synchronized (ItemMetadataPolicy.class) {
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

    public final boolean getIsExplicit() {
        return this.isExplicit_;
    }

    public final boolean getName() {
        return this.name_;
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
