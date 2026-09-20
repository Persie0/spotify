package com.spotify.personalizedepisodes.contentservice.p124v1;

import com.google.protobuf.AbstractC0269h;
import p204p.io11;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class ShowItem extends AbstractC0269h implements sre0 {
    private static final ShowItem DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLACEHOLDER_FIELD_NUMBER = 2;
    public static final int SHOW_FIELD_NUMBER = 1;
    private int itemCase_ = 0;
    private Object item_;

    static {
        ShowItem showItem = new ShowItem();
        DEFAULT_INSTANCE = showItem;
        AbstractC0269h.registerDefaultInstance(ShowItem.class, showItem);
    }

    private ShowItem() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17505n(ShowItem showItem, Placeholder placeholder) {
        showItem.getClass();
        placeholder.getClass();
        showItem.item_ = placeholder;
        showItem.itemCase_ = 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m17506o(ShowItem showItem, Show show) {
        showItem.getClass();
        show.getClass();
        showItem.item_ = show;
        showItem.itemCase_ = 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static io11 m17507s() {
        return (io11) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"item_", "itemCase_", Show.class, Placeholder.class});
        }
        if (iOrdinal == 3) {
            return new ShowItem();
        }
        if (iOrdinal == 4) {
            return new io11(DEFAULT_INSTANCE);
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
        synchronized (ShowItem.class) {
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
    public final int m17508p() {
        int i = this.itemCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: q */
    public final Placeholder m17509q() {
        return this.itemCase_ == 2 ? (Placeholder) this.item_ : Placeholder.m17442t();
    }

    /* JADX INFO: renamed from: r */
    public final Show m17510r() {
        return this.itemCase_ == 1 ? (Show) this.item_ : Show.m17502o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
