package com.spotify.lockstate.p104v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.lj90;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class LockLayout extends AbstractC0269h implements sre0 {
    public static final int CARD_FIELD_NUMBER = 2;
    public static final int COLUMN_LAYOUT_FIELD_NUMBER = 1;
    private static final LockLayout DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SECTIONED_FIELD_NUMBER = 3;
    private int layoutCase_ = 0;
    private Object layout_;

    static {
        LockLayout lockLayout = new LockLayout();
        DEFAULT_INSTANCE = lockLayout;
        AbstractC0269h.registerDefaultInstance(LockLayout.class, lockLayout);
    }

    private LockLayout() {
    }

    /* JADX INFO: renamed from: o */
    public static LockLayout m13245o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"layout_", "layoutCase_", ColumnLayout.class, CardLayout.class, SectionedLayout.class});
        }
        if (iOrdinal == 3) {
            return new LockLayout();
        }
        if (iOrdinal == 4) {
            return new lj90(DEFAULT_INSTANCE, 28);
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
        synchronized (LockLayout.class) {
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
    public final ColumnLayout m13246n() {
        return this.layoutCase_ == 1 ? (ColumnLayout) this.layout_ : ColumnLayout.m13222o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final SectionedLayout m13247p() {
        return this.layoutCase_ == 3 ? (SectionedLayout) this.layout_ : SectionedLayout.m13256o();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m13248q() {
        return this.layoutCase_ == 1;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m13249r() {
        return this.layoutCase_ == 3;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
