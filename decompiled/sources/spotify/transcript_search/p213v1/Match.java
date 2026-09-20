package spotify.transcript_search.p213v1;

import com.google.protobuf.AbstractC0269h;
import p204p.gsa0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Match extends AbstractC0269h implements sre0 {
    public static final int BOUNDARIES_FIELD_NUMBER = 6;
    public static final int CHAPTER_INFO_FIELD_NUMBER = 8;
    public static final int DEBUG_INFO_FIELD_NUMBER = 99;
    private static final Match DEFAULT_INSTANCE;
    public static final int EPISODE_URI_FIELD_NUMBER = 2;
    public static final int HIGHLIGHT_FIELD_NUMBER = 9;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_URI_FIELD_NUMBER = 3;
    public static final int TRANSCRIPT_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private MatchBoundaries boundaries_;
    private ChapterInfo chapterInfo_;
    private DebugInfo debugInfo_;
    private Highlight highlight_;
    private String transcriptId_ = "";
    private String episodeUri_ = "";
    private String showUri_ = "";

    static {
        Match match = new Match();
        DEFAULT_INSTANCE = match;
        AbstractC0269h.registerDefaultInstance(Match.class, match);
    }

    private Match() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static Match m98069q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001c\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0006ဉ\u0000\bဉ\u0001\tဉ\u0002cဉ\u0003", new Object[]{"bitField0_", "transcriptId_", "episodeUri_", "showUri_", "boundaries_", "chapterInfo_", "highlight_", "debugInfo_"});
        }
        if (iOrdinal == 3) {
            return new Match();
        }
        if (iOrdinal == 4) {
            return new gsa0(DEFAULT_INSTANCE, 25);
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
        synchronized (Match.class) {
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
    public final MatchBoundaries m98070n() {
        MatchBoundaries matchBoundaries = this.boundaries_;
        return matchBoundaries == null ? MatchBoundaries.m98081n() : matchBoundaries;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ChapterInfo m98071o() {
        ChapterInfo chapterInfo = this.chapterInfo_;
        return chapterInfo == null ? ChapterInfo.m98058o() : chapterInfo;
    }

    /* JADX INFO: renamed from: p */
    public final DebugInfo m98072p() {
        DebugInfo debugInfo = this.debugInfo_;
        return debugInfo == null ? DebugInfo.m98060n() : debugInfo;
    }

    /* JADX INFO: renamed from: r */
    public final String m98073r() {
        return this.episodeUri_;
    }

    /* JADX INFO: renamed from: s */
    public final Highlight m98074s() {
        Highlight highlight = this.highlight_;
        return highlight == null ? Highlight.m98066n() : highlight;
    }

    /* JADX INFO: renamed from: t */
    public final String m98075t() {
        return this.showUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m98076u() {
        return this.transcriptId_;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m98077v() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m98078w() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m98079x() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m98080y() {
        return (this.bitField0_ & 4) != 0;
    }
}
