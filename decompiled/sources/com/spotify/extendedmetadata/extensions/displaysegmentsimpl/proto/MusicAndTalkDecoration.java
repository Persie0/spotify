package com.spotify.extendedmetadata.extensions.displaysegmentsimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.d2i0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class MusicAndTalkDecoration extends AbstractC0269h implements sre0 {
    public static final int CAN_UPSELL_FIELD_NUMBER = 1;
    private static final MusicAndTalkDecoration DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private boolean canUpsell_;

    static {
        MusicAndTalkDecoration musicAndTalkDecoration = new MusicAndTalkDecoration();
        DEFAULT_INSTANCE = musicAndTalkDecoration;
        AbstractC0269h.registerDefaultInstance(MusicAndTalkDecoration.class, musicAndTalkDecoration);
    }

    private MusicAndTalkDecoration() {
    }

    /* JADX INFO: renamed from: n */
    public static MusicAndTalkDecoration m10096n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"canUpsell_"});
        }
        if (iOrdinal == 3) {
            return new MusicAndTalkDecoration();
        }
        if (iOrdinal == 4) {
            return new d2i0(DEFAULT_INSTANCE, 10);
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
        synchronized (MusicAndTalkDecoration.class) {
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

    public final boolean getCanUpsell() {
        return this.canUpsell_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
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
