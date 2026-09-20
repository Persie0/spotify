package com.spotify.casita.p040v1.resolved;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.u6u0;
import p204p.xqq;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class RecentsShelf extends AbstractC0269h implements sre0 {
    private static final RecentsShelf DEFAULT_INSTANCE;
    public static final int HEADING_FIELD_NUMBER = 1;
    public static final int ITEM_SOURCE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_DENSITY_FIELD_NUMBER = 3;
    private int bitField0_;
    private Heading heading_;
    private ItemSource itemSource_;
    private int titleDensity_;

    static {
        RecentsShelf recentsShelf = new RecentsShelf();
        DEFAULT_INSTANCE = recentsShelf;
        AbstractC0269h.registerDefaultInstance(RecentsShelf.class, recentsShelf);
    }

    private RecentsShelf() {
    }

    /* JADX INFO: renamed from: o */
    public static RecentsShelf m5758o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"bitField0_", "heading_", "itemSource_", "titleDensity_"});
        }
        if (iOrdinal == 3) {
            return new RecentsShelf();
        }
        if (iOrdinal == 4) {
            return new u6u0(20);
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
        synchronized (RecentsShelf.class) {
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
    public final Heading m5759p() {
        Heading heading = this.heading_;
        return heading == null ? Heading.m5646o() : heading;
    }

    /* JADX INFO: renamed from: q */
    public final ItemSource m5760q() {
        ItemSource itemSource = this.itemSource_;
        return itemSource == null ? ItemSource.m5692o() : itemSource;
    }

    /* JADX INFO: renamed from: r */
    public final xqq m5761r() {
        xqq xqqVar;
        int i = this.titleDensity_;
        if (i == 0) {
            xqqVar = xqq.UNDEFINED;
        } else if (i == 1) {
            xqqVar = xqq.SPARSE;
        } else if (i != 2) {
            xqqVar = i != 3 ? null : xqq.DENSE;
        } else {
            xqqVar = xqq.NORMAL;
        }
        return xqqVar == null ? xqq.UNRECOGNIZED : xqqVar;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
