package spotify.autodownload.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.q3w;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class EpisodeLimitRequest extends AbstractC0269h implements sre0 {
    private static final EpisodeLimitRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 1;
    private int updateThrottling_;

    static {
        EpisodeLimitRequest episodeLimitRequest = new EpisodeLimitRequest();
        DEFAULT_INSTANCE = episodeLimitRequest;
        AbstractC0269h.registerDefaultInstance(EpisodeLimitRequest.class, episodeLimitRequest);
    }

    private EpisodeLimitRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97413n(EpisodeLimitRequest episodeLimitRequest) {
        episodeLimitRequest.updateThrottling_ = 100;
    }

    /* JADX INFO: renamed from: o */
    public static q3w m97414o() {
        return (q3w) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"updateThrottling_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeLimitRequest();
        }
        if (iOrdinal == 4) {
            return new q3w(DEFAULT_INSTANCE);
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
        synchronized (EpisodeLimitRequest.class) {
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
