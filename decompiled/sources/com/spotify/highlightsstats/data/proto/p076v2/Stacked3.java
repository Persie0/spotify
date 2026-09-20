package com.spotify.highlightsstats.data.proto.p076v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ct31;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class Stacked3 extends AbstractC0269h implements sre0 {
    private static final Stacked3 DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STACK_ITEM_1_FIELD_NUMBER = 2;
    public static final int STACK_ITEM_2_FIELD_NUMBER = 3;
    public static final int STACK_ITEM_3_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private StackItem stackItem1_;
    private StackItem stackItem2_;
    private StackItem stackItem3_;
    private String title_ = "";

    static {
        Stacked3 stacked3 = new Stacked3();
        DEFAULT_INSTANCE = stacked3;
        AbstractC0269h.registerDefaultInstance(Stacked3.class, stacked3);
    }

    private Stacked3() {
    }

    /* JADX INFO: renamed from: n */
    public static Stacked3 m11663n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "title_", "stackItem1_", "stackItem2_", "stackItem3_"});
        }
        if (iOrdinal == 3) {
            return new Stacked3();
        }
        if (iOrdinal == 4) {
            return new ct31(DEFAULT_INSTANCE, 22);
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
        synchronized (Stacked3.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final StackItem m11664o() {
        StackItem stackItem = this.stackItem1_;
        return stackItem == null ? StackItem.m11650n() : stackItem;
    }

    /* JADX INFO: renamed from: p */
    public final StackItem m11665p() {
        StackItem stackItem = this.stackItem2_;
        return stackItem == null ? StackItem.m11650n() : stackItem;
    }

    /* JADX INFO: renamed from: q */
    public final StackItem m11666q() {
        StackItem stackItem = this.stackItem3_;
        return stackItem == null ? StackItem.m11650n() : stackItem;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
