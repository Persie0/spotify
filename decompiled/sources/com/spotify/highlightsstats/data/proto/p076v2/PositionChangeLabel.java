package com.spotify.highlightsstats.data.proto.p076v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ckc;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x2q0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class PositionChangeLabel extends AbstractC0269h implements sre0 {
    public static final int CHANGE_FROM_PREVIOUS_PERIOD_FIELD_NUMBER = 2;
    private static final PositionChangeLabel DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int POSITION_CHANGE_FIELD_NUMBER = 1;
    private int changeFromPreviousPeriod_;
    private int positionChange_;

    static {
        PositionChangeLabel positionChangeLabel = new PositionChangeLabel();
        DEFAULT_INSTANCE = positionChangeLabel;
        AbstractC0269h.registerDefaultInstance(PositionChangeLabel.class, positionChangeLabel);
    }

    private PositionChangeLabel() {
    }

    /* JADX INFO: renamed from: o */
    public static PositionChangeLabel m11586o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\f", new Object[]{"positionChange_", "changeFromPreviousPeriod_"});
        }
        if (iOrdinal == 3) {
            return new PositionChangeLabel();
        }
        if (iOrdinal == 4) {
            return new x2q0(DEFAULT_INSTANCE, 9);
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
        synchronized (PositionChangeLabel.class) {
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
    public final ckc m11587n() {
        ckc ckcVarM33113a = ckc.m33113a(this.changeFromPreviousPeriod_);
        return ckcVarM33113a == null ? ckc.UNRECOGNIZED : ckcVarM33113a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final int m11588p() {
        return this.positionChange_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
