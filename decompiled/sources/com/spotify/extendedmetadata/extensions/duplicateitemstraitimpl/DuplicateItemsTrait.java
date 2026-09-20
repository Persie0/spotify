package com.spotify.extendedmetadata.extensions.duplicateitemstraitimpl;

import com.google.protobuf.AbstractC0269h;
import p204p.omr;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class DuplicateItemsTrait extends AbstractC0269h implements sre0 {
    private static final DuplicateItemsTrait DEFAULT_INSTANCE;
    public static final int DISALLOW_DUPLICATE_ITEM_URIS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private boolean disallowDuplicateItemUris_;

    static {
        DuplicateItemsTrait duplicateItemsTrait = new DuplicateItemsTrait();
        DEFAULT_INSTANCE = duplicateItemsTrait;
        AbstractC0269h.registerDefaultInstance(DuplicateItemsTrait.class, duplicateItemsTrait);
    }

    private DuplicateItemsTrait() {
    }

    /* JADX INFO: renamed from: o */
    public static DuplicateItemsTrait m10097o(byte[] bArr) {
        return (DuplicateItemsTrait) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "disallowDuplicateItemUris_"});
        }
        if (iOrdinal == 3) {
            return new DuplicateItemsTrait();
        }
        if (iOrdinal == 4) {
            return new omr(DEFAULT_INSTANCE, 13);
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
        synchronized (DuplicateItemsTrait.class) {
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
    public final boolean m10098n() {
        return this.disallowDuplicateItemUris_;
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
