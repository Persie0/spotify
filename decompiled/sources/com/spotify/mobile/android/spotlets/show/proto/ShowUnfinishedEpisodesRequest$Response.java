package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.qr11;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ShowUnfinishedEpisodesRequest$Response extends AbstractC0269h implements sre0 {
    private static final ShowUnfinishedEpisodesRequest$Response DEFAULT_INSTANCE;
    public static final int EPISODE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private ae50 episode_ = AbstractC0269h.emptyProtobufList();

    static {
        ShowUnfinishedEpisodesRequest$Response showUnfinishedEpisodesRequest$Response = new ShowUnfinishedEpisodesRequest$Response();
        DEFAULT_INSTANCE = showUnfinishedEpisodesRequest$Response;
        AbstractC0269h.registerDefaultInstance(ShowUnfinishedEpisodesRequest$Response.class, showUnfinishedEpisodesRequest$Response);
    }

    private ShowUnfinishedEpisodesRequest$Response() {
    }

    /* JADX INFO: renamed from: p */
    public static ShowUnfinishedEpisodesRequest$Response m15556p(byte[] bArr) {
        return (ShowUnfinishedEpisodesRequest$Response) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"episode_", ShowUnfinishedEpisodesRequest$Episode.class});
        }
        if (iOrdinal == 3) {
            return new ShowUnfinishedEpisodesRequest$Response();
        }
        if (iOrdinal == 4) {
            return new qr11(DEFAULT_INSTANCE, 10);
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
        synchronized (ShowUnfinishedEpisodesRequest$Response.class) {
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
    public final int m15557n() {
        return this.episode_.size();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m15558o() {
        return this.episode_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
