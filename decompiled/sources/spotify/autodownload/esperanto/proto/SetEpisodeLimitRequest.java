package spotify.autodownload.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.j501;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class SetEpisodeLimitRequest extends AbstractC0269h implements sre0 {
    private static final SetEpisodeLimitRequest DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int THERES_NO_LIMIT_FIELD_NUMBER = 1;
    private int limit_;
    private boolean theresNoLimit_;

    static {
        SetEpisodeLimitRequest setEpisodeLimitRequest = new SetEpisodeLimitRequest();
        DEFAULT_INSTANCE = setEpisodeLimitRequest;
        AbstractC0269h.registerDefaultInstance(SetEpisodeLimitRequest.class, setEpisodeLimitRequest);
    }

    private SetEpisodeLimitRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97417n(SetEpisodeLimitRequest setEpisodeLimitRequest, int i) {
        setEpisodeLimitRequest.limit_ = i;
    }

    /* JADX INFO: renamed from: o */
    public static void m97418o(SetEpisodeLimitRequest setEpisodeLimitRequest) {
        setEpisodeLimitRequest.theresNoLimit_ = true;
    }

    /* JADX INFO: renamed from: p */
    public static j501 m97419p() {
        return (j501) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0004", new Object[]{"theresNoLimit_", "limit_"});
        }
        if (iOrdinal == 3) {
            return new SetEpisodeLimitRequest();
        }
        if (iOrdinal == 4) {
            return new j501(DEFAULT_INSTANCE);
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
        synchronized (SetEpisodeLimitRequest.class) {
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
