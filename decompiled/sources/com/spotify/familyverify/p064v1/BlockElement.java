package com.spotify.familyverify.p064v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z79;

/* JADX INFO: loaded from: classes6.dex */
public final class BlockElement extends AbstractC0269h implements sre0 {
    private static final BlockElement DEFAULT_INSTANCE;
    public static final int NUMBERED_LIST_ITEM_FIELD_NUMBER = 2;
    public static final int PARAGRAPH_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SUPPORT_LINK_FIELD_NUMBER = 3;
    private int elementCase_ = 0;
    private Object element_;

    static {
        BlockElement blockElement = new BlockElement();
        DEFAULT_INSTANCE = blockElement;
        AbstractC0269h.registerDefaultInstance(BlockElement.class, blockElement);
    }

    private BlockElement() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȼ\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"element_", "elementCase_", NumberedListItem.class, SupportLink.class});
        }
        if (iOrdinal == 3) {
            return new BlockElement();
        }
        if (iOrdinal == 4) {
            return new z79(DEFAULT_INSTANCE, 5);
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
        synchronized (BlockElement.class) {
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
    public final int m10604n() {
        int i = this.elementCase_;
        if (i == 0) {
            return 4;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final NumberedListItem m10605o() {
        return this.elementCase_ == 2 ? (NumberedListItem) this.element_ : NumberedListItem.m10620n();
    }

    /* JADX INFO: renamed from: p */
    public final String m10606p() {
        return this.elementCase_ == 1 ? (String) this.element_ : "";
    }

    /* JADX INFO: renamed from: q */
    public final SupportLink m10607q() {
        return this.elementCase_ == 3 ? (SupportLink) this.element_ : SupportLink.m10644n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
