package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.u6u0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class RecentlyPlayedCollectionTracks extends AbstractC0269h implements sre0 {
    public static final int ADD_TIME_FIELD_NUMBER = 3;
    private static final RecentlyPlayedCollectionTracks DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int TYPE_STR_FIELD_NUMBER = 4;
    private int addTime_;
    private String link_ = "";
    private String typeStr_ = "";
    private int type_;

    static {
        RecentlyPlayedCollectionTracks recentlyPlayedCollectionTracks = new RecentlyPlayedCollectionTracks();
        DEFAULT_INSTANCE = recentlyPlayedCollectionTracks;
        AbstractC0269h.registerDefaultInstance(RecentlyPlayedCollectionTracks.class, recentlyPlayedCollectionTracks);
    }

    private RecentlyPlayedCollectionTracks() {
    }

    /* JADX INFO: renamed from: n */
    public static RecentlyPlayedCollectionTracks m20255n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0004Ȉ", new Object[]{"link_", "type_", "addTime_", "typeStr_"});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedCollectionTracks();
        }
        if (iOrdinal == 4) {
            return new u6u0(DEFAULT_INSTANCE, 15);
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
        synchronized (RecentlyPlayedCollectionTracks.class) {
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

    public final String getLink() {
        return this.link_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m20256o() {
        return this.typeStr_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
