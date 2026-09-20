package spotify.show_cosmos.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.fi11;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ShowRequest$AuxiliarySections extends AbstractC0269h implements sre0 {
    public static final int CONTINUE_LISTENING_FIELD_NUMBER = 1;
    private static final ShowRequest$AuxiliarySections DEFAULT_INSTANCE;
    public static final int LATEST_UNPLAYED_EPISODE_SECTION_FIELD_NUMBER = 9;
    public static final int NEXT_BEST_EPISODE_SECTION_FIELD_NUMBER = 10;
    private static volatile r2n0 PARSER = null;
    public static final int SAVED_EPISODES_SECTION_FIELD_NUMBER = 11;
    public static final int TRAILER_SECTION_FIELD_NUMBER = 3;
    private int bitField0_;
    private ShowRequest$ContinueListeningSection continueListening_;
    private ShowRequest$LatestUnplayedEpisodeSection latestUnplayedEpisodeSection_;
    private ShowRequest$NextBestEpisodeSection nextBestEpisodeSection_;
    private ShowRequest$SavedEpisodesSection savedEpisodesSection_;
    private ShowRequest$TrailerSection trailerSection_;

    static {
        ShowRequest$AuxiliarySections showRequest$AuxiliarySections = new ShowRequest$AuxiliarySections();
        DEFAULT_INSTANCE = showRequest$AuxiliarySections;
        AbstractC0269h.registerDefaultInstance(ShowRequest$AuxiliarySections.class, showRequest$AuxiliarySections);
    }

    private ShowRequest$AuxiliarySections() {
    }

    /* JADX INFO: renamed from: o */
    public static ShowRequest$AuxiliarySections m97923o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u000b\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001\tဉ\u0002\nဉ\u0003\u000bဉ\u0004", new Object[]{"bitField0_", "continueListening_", "trailerSection_", "latestUnplayedEpisodeSection_", "nextBestEpisodeSection_", "savedEpisodesSection_"});
        }
        if (iOrdinal == 3) {
            return new ShowRequest$AuxiliarySections();
        }
        if (iOrdinal == 4) {
            return new fi11(DEFAULT_INSTANCE, 18);
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
        synchronized (ShowRequest$AuxiliarySections.class) {
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
    public final ShowRequest$ContinueListeningSection m97924n() {
        ShowRequest$ContinueListeningSection showRequest$ContinueListeningSection = this.continueListening_;
        return showRequest$ContinueListeningSection == null ? ShowRequest$ContinueListeningSection.m97930n() : showRequest$ContinueListeningSection;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final ShowRequest$NextBestEpisodeSection m97925p() {
        ShowRequest$NextBestEpisodeSection showRequest$NextBestEpisodeSection = this.nextBestEpisodeSection_;
        return showRequest$NextBestEpisodeSection == null ? ShowRequest$NextBestEpisodeSection.m97945n() : showRequest$NextBestEpisodeSection;
    }

    /* JADX INFO: renamed from: q */
    public final ShowRequest$TrailerSection m97926q() {
        ShowRequest$TrailerSection showRequest$TrailerSection = this.trailerSection_;
        return showRequest$TrailerSection == null ? ShowRequest$TrailerSection.m97957n() : showRequest$TrailerSection;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m97927r() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m97928s() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m97929t() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
