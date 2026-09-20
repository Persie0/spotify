package spotify.show_cosmos.unfinished_episodes_request.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.s791;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class UnfinishedEpisodesRequest$Response extends AbstractC0269h implements sre0 {
    private static final UnfinishedEpisodesRequest$Response DEFAULT_INSTANCE;
    public static final int EPISODE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private ae50 episode_ = AbstractC0269h.emptyProtobufList();

    static {
        UnfinishedEpisodesRequest$Response unfinishedEpisodesRequest$Response = new UnfinishedEpisodesRequest$Response();
        DEFAULT_INSTANCE = unfinishedEpisodesRequest$Response;
        AbstractC0269h.registerDefaultInstance(UnfinishedEpisodesRequest$Response.class, unfinishedEpisodesRequest$Response);
    }

    private UnfinishedEpisodesRequest$Response() {
    }

    /* JADX INFO: renamed from: n */
    public static UnfinishedEpisodesRequest$Response m97964n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"episode_", UnfinishedEpisodesRequest$Episode.class});
        }
        if (iOrdinal == 3) {
            return new UnfinishedEpisodesRequest$Response();
        }
        if (iOrdinal == 4) {
            return new s791(DEFAULT_INSTANCE, 16);
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
        synchronized (UnfinishedEpisodesRequest$Response.class) {
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
    public final int m97965o() {
        return this.episode_.size();
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m97966p() {
        return this.episode_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
