package com.spotify.show_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.policy.proto.EpisodeCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeSyncDecorationPolicy;
import p204p.e290;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ListPolicy extends AbstractC0269h implements sre0 {
    private static final ListPolicy DEFAULT_INSTANCE;
    public static final int EPISODE_COLLECTION_POLICY_FIELD_NUMBER = 2;
    public static final int EPISODE_PLAYED_STATE_POLICY_FIELD_NUMBER = 4;
    public static final int EPISODE_POLICY_FIELD_NUMBER = 1;
    public static final int EPISODE_SYNC_POLICY_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PROGRESS_FIELD_NUMBER = 5;
    public static final int SHOW_POLICY_FIELD_NUMBER = 6;
    private int bitField0_;
    private EpisodeCollectionDecorationPolicy episodeCollectionPolicy_;
    private EpisodePlayedStateDecorationPolicy episodePlayedStatePolicy_;
    private EpisodeDecorationPolicy episodePolicy_;
    private EpisodeSyncDecorationPolicy episodeSyncPolicy_;
    private boolean progress_;
    private HeaderPolicy showPolicy_;

    static {
        ListPolicy listPolicy = new ListPolicy();
        DEFAULT_INSTANCE = listPolicy;
        AbstractC0269h.registerDefaultInstance(ListPolicy.class, listPolicy);
    }

    private ListPolicy() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21225n(ListPolicy listPolicy, EpisodeCollectionDecorationPolicy episodeCollectionDecorationPolicy) {
        listPolicy.getClass();
        episodeCollectionDecorationPolicy.getClass();
        listPolicy.episodeCollectionPolicy_ = episodeCollectionDecorationPolicy;
        listPolicy.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m21226o(ListPolicy listPolicy, EpisodePlayedStateDecorationPolicy episodePlayedStateDecorationPolicy) {
        listPolicy.getClass();
        episodePlayedStateDecorationPolicy.getClass();
        listPolicy.episodePlayedStatePolicy_ = episodePlayedStateDecorationPolicy;
        listPolicy.bitField0_ |= 8;
    }

    /* JADX INFO: renamed from: p */
    public static void m21227p(ListPolicy listPolicy, EpisodeDecorationPolicy episodeDecorationPolicy) {
        listPolicy.getClass();
        episodeDecorationPolicy.getClass();
        listPolicy.episodePolicy_ = episodeDecorationPolicy;
        listPolicy.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21228q(ListPolicy listPolicy, EpisodeSyncDecorationPolicy episodeSyncDecorationPolicy) {
        listPolicy.getClass();
        episodeSyncDecorationPolicy.getClass();
        listPolicy.episodeSyncPolicy_ = episodeSyncDecorationPolicy;
        listPolicy.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: r */
    public static void m21229r(ListPolicy listPolicy, HeaderPolicy headerPolicy) {
        listPolicy.getClass();
        headerPolicy.getClass();
        listPolicy.showPolicy_ = headerPolicy;
        listPolicy.bitField0_ |= 16;
    }

    /* JADX INFO: renamed from: s */
    public static e290 m21230s() {
        return (e290) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u0007\u0006ဉ\u0004", new Object[]{"bitField0_", "episodePolicy_", "episodeCollectionPolicy_", "episodeSyncPolicy_", "episodePlayedStatePolicy_", "progress_", "showPolicy_"});
        }
        if (iOrdinal == 3) {
            return new ListPolicy();
        }
        if (iOrdinal == 4) {
            return new e290(DEFAULT_INSTANCE);
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
        synchronized (ListPolicy.class) {
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
