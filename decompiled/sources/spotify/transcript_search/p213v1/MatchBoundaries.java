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
public final class MatchBoundaries extends AbstractC0269h implements sre0 {
    private static final MatchBoundaries DEFAULT_INSTANCE;
    public static final int END_TIME_MS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int START_TIME_MS_FIELD_NUMBER = 1;
    private long endTimeMs_;
    private long startTimeMs_;

    static {
        MatchBoundaries matchBoundaries = new MatchBoundaries();
        DEFAULT_INSTANCE = matchBoundaries;
        AbstractC0269h.registerDefaultInstance(MatchBoundaries.class, matchBoundaries);
    }

    private MatchBoundaries() {
    }

    /* JADX INFO: renamed from: n */
    public static MatchBoundaries m98081n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"startTimeMs_", "endTimeMs_"});
        }
        if (iOrdinal == 3) {
            return new MatchBoundaries();
        }
        if (iOrdinal == 4) {
            return new gsa0(DEFAULT_INSTANCE, 26);
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
        synchronized (MatchBoundaries.class) {
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
    public final long m98082o() {
        return this.endTimeMs_;
    }

    /* JADX INFO: renamed from: p */
    public final long m98083p() {
        return this.startTimeMs_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
