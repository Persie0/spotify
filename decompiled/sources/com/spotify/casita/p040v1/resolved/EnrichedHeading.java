package com.spotify.casita.p040v1.resolved;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z5u;

/* JADX INFO: loaded from: classes.dex */
public final class EnrichedHeading extends AbstractC0269h implements sre0 {
    public static final int ASSOCIATED_ITEM_FIELD_NUMBER = 2;
    private static final EnrichedHeading DEFAULT_INSTANCE;
    public static final int ENCORE_ICON_NAME_FIELD_NUMBER = 3;
    public static final int FORMAT_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private HeadingAssociatedItem associatedItem_;
    private int bitField0_;
    private String format_ = "";
    private String encoreIconName_ = "";

    static {
        EnrichedHeading enrichedHeading = new EnrichedHeading();
        DEFAULT_INSTANCE = enrichedHeading;
        AbstractC0269h.registerDefaultInstance(EnrichedHeading.class, enrichedHeading);
    }

    private EnrichedHeading() {
    }

    /* JADX INFO: renamed from: p */
    public static EnrichedHeading m5638p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ", new Object[]{"bitField0_", "format_", "associatedItem_", "encoreIconName_"});
        }
        if (iOrdinal == 3) {
            return new EnrichedHeading();
        }
        if (iOrdinal == 4) {
            return new z5u(14);
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
        synchronized (EnrichedHeading.class) {
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

    public final String getFormat() {
        return this.format_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final HeadingAssociatedItem m5639o() {
        HeadingAssociatedItem headingAssociatedItem = this.associatedItem_;
        return headingAssociatedItem == null ? HeadingAssociatedItem.m5654o() : headingAssociatedItem;
    }

    /* JADX INFO: renamed from: q */
    public final String m5640q() {
        return this.encoreIconName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
