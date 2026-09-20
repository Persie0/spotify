package com.spotify.savetospotify.p145v1;

import com.google.protobuf.AbstractC0269h;
import p204p.a530;
import p204p.bh30;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class HttpEpisodeReadinessResponse extends AbstractC0269h implements sre0 {
    private static final HttpEpisodeReadinessResponse DEFAULT_INSTANCE;
    public static final int EPISODE_URI_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int READINESS_FIELD_NUMBER = 2;
    private String episodeUri_ = "";
    private int readiness_;

    static {
        HttpEpisodeReadinessResponse httpEpisodeReadinessResponse = new HttpEpisodeReadinessResponse();
        DEFAULT_INSTANCE = httpEpisodeReadinessResponse;
        AbstractC0269h.registerDefaultInstance(HttpEpisodeReadinessResponse.class, httpEpisodeReadinessResponse);
    }

    private HttpEpisodeReadinessResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"episodeUri_", "readiness_"});
        }
        if (iOrdinal == 3) {
            return new HttpEpisodeReadinessResponse();
        }
        if (iOrdinal == 4) {
            return new a530(DEFAULT_INSTANCE, 6);
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
        synchronized (HttpEpisodeReadinessResponse.class) {
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
    public final bh30 m20437n() {
        bh30 bh30Var;
        int i = this.readiness_;
        if (i == 0) {
            bh30Var = bh30.READINESS_UNSPECIFIED;
        } else if (i == 1) {
            bh30Var = bh30.READY;
        } else if (i != 2) {
            bh30Var = i != 3 ? null : bh30.FAILED;
        } else {
            bh30Var = bh30.NOT_READY;
        }
        return bh30Var == null ? bh30.UNRECOGNIZED : bh30Var;
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
