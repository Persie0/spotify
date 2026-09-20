package com.spotify.subscriptionviewservice.p161v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ugv;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class EntryPointCard extends AbstractC0269h implements sre0 {
    private static final EntryPointCard DEFAULT_INSTANCE;
    public static final int ENTRY_POINTS_HORIZONTAL_FIELD_NUMBER = 4;
    public static final int ENTRY_POINTS_LARGE_FIELD_NUMBER = 3;
    public static final int ENTRY_POINTS_WITH_DIVIDER_FIELD_NUMBER = 2;
    public static final int ENTRY_POINTS_WITH_GAP_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int entryPointsCase_ = 0;
    private Object entryPoints_;

    static {
        EntryPointCard entryPointCard = new EntryPointCard();
        DEFAULT_INSTANCE = entryPointCard;
        AbstractC0269h.registerDefaultInstance(EntryPointCard.class, entryPointCard);
    }

    private EntryPointCard() {
    }

    /* JADX INFO: renamed from: n */
    public static EntryPointCard m21739n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"entryPoints_", "entryPointsCase_", EntryPointList.class, EntryPointList.class, EntryPointList.class, EntryPointList.class});
        }
        if (iOrdinal == 3) {
            return new EntryPointCard();
        }
        if (iOrdinal == 4) {
            return new ugv(DEFAULT_INSTANCE, 11);
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
        synchronized (EntryPointCard.class) {
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
    public final int m21740o() {
        int i = this.entryPointsCase_;
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: p */
    public final EntryPointList m21741p() {
        return this.entryPointsCase_ == 4 ? (EntryPointList) this.entryPoints_ : EntryPointList.m21745n();
    }

    /* JADX INFO: renamed from: q */
    public final EntryPointList m21742q() {
        return this.entryPointsCase_ == 3 ? (EntryPointList) this.entryPoints_ : EntryPointList.m21745n();
    }

    /* JADX INFO: renamed from: r */
    public final EntryPointList m21743r() {
        return this.entryPointsCase_ == 2 ? (EntryPointList) this.entryPoints_ : EntryPointList.m21745n();
    }

    /* JADX INFO: renamed from: s */
    public final EntryPointList m21744s() {
        return this.entryPointsCase_ == 1 ? (EntryPointList) this.entryPoints_ : EntryPointList.m21745n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
