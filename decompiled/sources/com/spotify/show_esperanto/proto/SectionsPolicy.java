package com.spotify.show_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.daz0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class SectionsPolicy extends AbstractC0269h implements sre0 {
    public static final int CONTINUE_LISTENING_FIELD_NUMBER = 1;
    private static final SectionsPolicy DEFAULT_INSTANCE;
    public static final int LATEST_UNPLAYED_EPISODE_FIELD_NUMBER = 3;
    public static final int NEXT_BEST_EPISODE_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SAVED_EPISODES_FIELD_NUMBER = 5;
    public static final int TRAILER_SECTION_FIELD_NUMBER = 2;
    private boolean continueListening_;
    private boolean latestUnplayedEpisode_;
    private boolean nextBestEpisode_;
    private boolean savedEpisodes_;
    private boolean trailerSection_;

    static {
        SectionsPolicy sectionsPolicy = new SectionsPolicy();
        DEFAULT_INSTANCE = sectionsPolicy;
        AbstractC0269h.registerDefaultInstance(SectionsPolicy.class, sectionsPolicy);
    }

    private SectionsPolicy() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21245n(SectionsPolicy sectionsPolicy, boolean z) {
        sectionsPolicy.nextBestEpisode_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m21246o(SectionsPolicy sectionsPolicy, boolean z) {
        sectionsPolicy.trailerSection_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static daz0 m21247p() {
        return (daz0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007", new Object[]{"continueListening_", "trailerSection_", "latestUnplayedEpisode_", "nextBestEpisode_", "savedEpisodes_"});
        }
        if (iOrdinal == 3) {
            return new SectionsPolicy();
        }
        if (iOrdinal == 4) {
            return new daz0(DEFAULT_INSTANCE);
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
        synchronized (SectionsPolicy.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
