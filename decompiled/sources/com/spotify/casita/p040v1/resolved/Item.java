package com.spotify.casita.p040v1.resolved;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zc40;

/* JADX INFO: loaded from: classes.dex */
public final class Item extends AbstractC0269h implements sre0 {
    private static final Item DEFAULT_INSTANCE;
    public static final int HIGHLIGHTED_SUB_ITEMS_FIELD_NUMBER = 2;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String identifier_ = "";
    private ae50 highlightedSubItems_ = AbstractC0269h.emptyProtobufList();

    static {
        Item item = new Item();
        DEFAULT_INSTANCE = item;
        AbstractC0269h.registerDefaultInstance(Item.class, item);
    }

    private Item() {
    }

    /* JADX INFO: renamed from: o */
    public static Item m5688o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"identifier_", "highlightedSubItems_"});
        }
        if (iOrdinal == 3) {
            return new Item();
        }
        if (iOrdinal == 4) {
            return new zc40(24);
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
        synchronized (Item.class) {
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
    public final ae50 m5689p() {
        return this.highlightedSubItems_;
    }

    /* JADX INFO: renamed from: q */
    public final String m5690q() {
        return this.identifier_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
