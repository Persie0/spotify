package com.spotify.searchview.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.bfv0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.u6u0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Recommendations extends AbstractC0269h implements sre0 {
    private static final Recommendations DEFAULT_INSTANCE;
    public static final int ENTITIES_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private ae50 entities_ = AbstractC0269h.emptyProtobufList();
    private int type_;

    static {
        Recommendations recommendations = new Recommendations();
        DEFAULT_INSTANCE = recommendations;
        AbstractC0269h.registerDefaultInstance(Recommendations.class, recommendations);
    }

    private Recommendations() {
    }

    /* JADX INFO: renamed from: n */
    public static Recommendations m20895n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"type_", "entities_", Entity.class});
        }
        if (iOrdinal == 3) {
            return new Recommendations();
        }
        if (iOrdinal == 4) {
            return new u6u0(DEFAULT_INSTANCE, 26);
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
        synchronized (Recommendations.class) {
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
    public final ae50 m20896o() {
        return this.entities_;
    }

    /* JADX INFO: renamed from: p */
    public final bfv0 m20897p() {
        bfv0 bfv0Var;
        int i = this.type_;
        if (i == 0) {
            bfv0Var = bfv0.RECOMMENDATIONS_TYPE_UNKNOWN;
        } else if (i == 1) {
            bfv0Var = bfv0.RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_ARTIST;
        } else if (i == 2) {
            bfv0Var = bfv0.RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_GENRE;
        } else if (i == 3) {
            bfv0Var = bfv0.RECOMMENDATIONS_TYPE_PODCASTS_FOR_CATEGORY;
        } else if (i != 4) {
            bfv0Var = i != 6 ? null : bfv0.RECOMMENDATIONS_TYPE_PERSONALIZED_PODCASTS_FOR_CATEGORY;
        } else {
            bfv0Var = bfv0.RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_TRACK;
        }
        return bfv0Var == null ? bfv0.UNRECOGNIZED : bfv0Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
