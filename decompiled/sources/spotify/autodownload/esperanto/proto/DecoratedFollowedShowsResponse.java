package spotify.autodownload.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wzl;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class DecoratedFollowedShowsResponse extends AbstractC0269h implements sre0 {
    private static final DecoratedFollowedShowsResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 99;
    private static volatile r2n0 PARSER = null;
    public static final int REMAINING_SHOWS_FIELD_NUMBER = 2;
    public static final int SHOWS_FIELD_NUMBER = 1;
    private int remainingShows_;
    private ae50 shows_ = AbstractC0269h.emptyProtobufList();
    private String error_ = "";

    static {
        DecoratedFollowedShowsResponse decoratedFollowedShowsResponse = new DecoratedFollowedShowsResponse();
        DEFAULT_INSTANCE = decoratedFollowedShowsResponse;
        AbstractC0269h.registerDefaultInstance(DecoratedFollowedShowsResponse.class, decoratedFollowedShowsResponse);
    }

    private DecoratedFollowedShowsResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static DecoratedFollowedShowsResponse m97398q(byte[] bArr) {
        return (DecoratedFollowedShowsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001c\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u0004cȈ", new Object[]{"shows_", DecoratedShow.class, "remainingShows_", "error_"});
        }
        if (iOrdinal == 3) {
            return new DecoratedFollowedShowsResponse();
        }
        if (iOrdinal == 4) {
            return new wzl(DEFAULT_INSTANCE, 27);
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
        synchronized (DecoratedFollowedShowsResponse.class) {
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
    public final int m97399n() {
        return this.remainingShows_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m97400o() {
        return this.shows_.size();
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m97401p() {
        return this.shows_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
