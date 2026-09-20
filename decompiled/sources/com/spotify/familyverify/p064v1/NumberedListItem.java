package com.spotify.familyverify.p064v1;

import com.google.protobuf.AbstractC0269h;
import p204p.bpj0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class NumberedListItem extends AbstractC0269h implements sre0 {
    private static final NumberedListItem DEFAULT_INSTANCE;
    public static final int ITEM_NUMBER_FIELD_NUMBER = 1;
    public static final int ITEM_TEXT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private String itemNumber_ = "";
    private String itemText_ = "";

    static {
        NumberedListItem numberedListItem = new NumberedListItem();
        DEFAULT_INSTANCE = numberedListItem;
        AbstractC0269h.registerDefaultInstance(NumberedListItem.class, numberedListItem);
    }

    private NumberedListItem() {
    }

    /* JADX INFO: renamed from: n */
    public static NumberedListItem m10620n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"itemNumber_", "itemText_"});
        }
        if (iOrdinal == 3) {
            return new NumberedListItem();
        }
        if (iOrdinal == 4) {
            return new bpj0(DEFAULT_INSTANCE, 10);
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
        synchronized (NumberedListItem.class) {
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
    public final String m10621o() {
        return this.itemNumber_;
    }

    /* JADX INFO: renamed from: p */
    public final String m10622p() {
        return this.itemText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
