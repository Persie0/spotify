package com.spotify.highlightsstats.data.proto.p076v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ne21;
import p204p.ore0;
import p204p.pre0;
import p204p.qd31;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialTrackDetailsPage extends AbstractC0269h implements sre0 {
    public static final int DATATYPE_FIELD_NUMBER = 2;
    private static final SocialTrackDetailsPage DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TOP_TRACKS_FIELD_NUMBER = 1;
    private int dataType_;
    private ae50 topTracks_ = AbstractC0269h.emptyProtobufList();

    static {
        SocialTrackDetailsPage socialTrackDetailsPage = new SocialTrackDetailsPage();
        DEFAULT_INSTANCE = socialTrackDetailsPage;
        AbstractC0269h.registerDefaultInstance(SocialTrackDetailsPage.class, socialTrackDetailsPage);
    }

    private SocialTrackDetailsPage() {
    }

    /* JADX INFO: renamed from: o */
    public static SocialTrackDetailsPage m11637o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\f", new Object[]{"topTracks_", SocialTopTrack.class, "dataType_"});
        }
        if (iOrdinal == 3) {
            return new SocialTrackDetailsPage();
        }
        if (iOrdinal == 4) {
            return new ne21(DEFAULT_INSTANCE, 19);
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
        synchronized (SocialTrackDetailsPage.class) {
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
    public final qd31 m11638n() {
        qd31 qd31VarM72579a = qd31.m72579a(this.dataType_);
        return qd31VarM72579a == null ? qd31.UNRECOGNIZED : qd31VarM72579a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m11639p() {
        return this.topTracks_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
