package com.spotify.songdnaeligibility;

import com.google.protobuf.AbstractC0269h;
import p204p.ne21;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class SongDnaEligibility extends AbstractC0269h implements sre0 {
    private static final SongDnaEligibility DEFAULT_INSTANCE;
    public static final int IS_ELIGIBLE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private boolean isEligible_;

    static {
        SongDnaEligibility songDnaEligibility = new SongDnaEligibility();
        DEFAULT_INSTANCE = songDnaEligibility;
        AbstractC0269h.registerDefaultInstance(SongDnaEligibility.class, songDnaEligibility);
    }

    private SongDnaEligibility() {
    }

    /* JADX INFO: renamed from: o */
    public static SongDnaEligibility m21487o(byte[] bArr) {
        return (SongDnaEligibility) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"isEligible_"});
        }
        if (iOrdinal == 3) {
            return new SongDnaEligibility();
        }
        if (iOrdinal == 4) {
            return new ne21(DEFAULT_INSTANCE, 27);
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
        synchronized (SongDnaEligibility.class) {
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
    public final boolean m21488n() {
        return this.isEligible_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
