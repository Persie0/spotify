package spotify.autodownload.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.rro;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class DecoratedFollowedShowsRequest extends AbstractC0269h implements sre0 {
    private static final DecoratedFollowedShowsRequest DEFAULT_INSTANCE;
    public static final int LENGTH_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SKIP_FIELD_NUMBER = 1;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 3;
    private int length_;
    private int skip_;
    private int updateThrottling_;

    static {
        DecoratedFollowedShowsRequest decoratedFollowedShowsRequest = new DecoratedFollowedShowsRequest();
        DEFAULT_INSTANCE = decoratedFollowedShowsRequest;
        AbstractC0269h.registerDefaultInstance(DecoratedFollowedShowsRequest.class, decoratedFollowedShowsRequest);
    }

    private DecoratedFollowedShowsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97395n(DecoratedFollowedShowsRequest decoratedFollowedShowsRequest, int i) {
        decoratedFollowedShowsRequest.length_ = i;
    }

    /* JADX INFO: renamed from: o */
    public static void m97396o(DecoratedFollowedShowsRequest decoratedFollowedShowsRequest, int i) {
        decoratedFollowedShowsRequest.skip_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static rro m97397p() {
        return (rro) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"skip_", "length_", "updateThrottling_"});
        }
        if (iOrdinal == 3) {
            return new DecoratedFollowedShowsRequest();
        }
        if (iOrdinal == 4) {
            return new rro(DEFAULT_INSTANCE);
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
        synchronized (DecoratedFollowedShowsRequest.class) {
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
