package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.fi11;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ShowShowRequest$AuxiliarySections extends AbstractC0269h implements sre0 {
    public static final int CONTINUE_LISTENING_FIELD_NUMBER = 1;
    private static final ShowShowRequest$AuxiliarySections DEFAULT_INSTANCE;
    public static final int NEXT_BEST_EPISODE_SECTION_FIELD_NUMBER = 10;
    private static volatile r2n0 PARSER = null;
    public static final int TRAILER_SECTION_FIELD_NUMBER = 3;
    private int bitField0_;
    private ShowShowRequest$ContinueListeningSection continueListening_;
    private ShowShowRequest$NextBestEpisodeSection nextBestEpisodeSection_;
    private ShowShowRequest$TrailerSection trailerSection_;

    static {
        ShowShowRequest$AuxiliarySections showShowRequest$AuxiliarySections = new ShowShowRequest$AuxiliarySections();
        DEFAULT_INSTANCE = showShowRequest$AuxiliarySections;
        AbstractC0269h.registerDefaultInstance(ShowShowRequest$AuxiliarySections.class, showShowRequest$AuxiliarySections);
    }

    private ShowShowRequest$AuxiliarySections() {
    }

    /* JADX INFO: renamed from: o */
    public static ShowShowRequest$AuxiliarySections m15496o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\n\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001\nဉ\u0002", new Object[]{"bitField0_", "continueListening_", "trailerSection_", "nextBestEpisodeSection_"});
        }
        if (iOrdinal == 3) {
            return new ShowShowRequest$AuxiliarySections();
        }
        if (iOrdinal == 4) {
            return new fi11(DEFAULT_INSTANCE, 25);
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
        synchronized (ShowShowRequest$AuxiliarySections.class) {
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
    public final ShowShowRequest$ContinueListeningSection m15497n() {
        ShowShowRequest$ContinueListeningSection showShowRequest$ContinueListeningSection = this.continueListening_;
        return showShowRequest$ContinueListeningSection == null ? ShowShowRequest$ContinueListeningSection.m15503n() : showShowRequest$ContinueListeningSection;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final ShowShowRequest$NextBestEpisodeSection m15498p() {
        ShowShowRequest$NextBestEpisodeSection showShowRequest$NextBestEpisodeSection = this.nextBestEpisodeSection_;
        return showShowRequest$NextBestEpisodeSection == null ? ShowShowRequest$NextBestEpisodeSection.m15505n() : showShowRequest$NextBestEpisodeSection;
    }

    /* JADX INFO: renamed from: q */
    public final ShowShowRequest$TrailerSection m15499q() {
        ShowShowRequest$TrailerSection showShowRequest$TrailerSection = this.trailerSection_;
        return showShowRequest$TrailerSection == null ? ShowShowRequest$TrailerSection.m15541n() : showShowRequest$TrailerSection;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m15500r() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m15501s() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m15502t() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
