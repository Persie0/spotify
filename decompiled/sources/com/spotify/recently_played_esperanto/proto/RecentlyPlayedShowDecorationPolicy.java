package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.policy.proto.ShowCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowPlayedStateDecorationPolicy;
import p204p.m3v0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class RecentlyPlayedShowDecorationPolicy extends AbstractC0269h implements sre0 {
    public static final int COLLECTION_POLICY_FIELD_NUMBER = 2;
    private static final RecentlyPlayedShowDecorationPolicy DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYED_STATE_POLICY_FIELD_NUMBER = 3;
    public static final int SHOW_POLICY_FIELD_NUMBER = 1;
    public static final int TIMESTAMP_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 4;
    private int bitField0_;
    private ShowCollectionDecorationPolicy collectionPolicy_;
    private ShowPlayedStateDecorationPolicy playedStatePolicy_;
    private ShowDecorationPolicy showPolicy_;
    private boolean timestamp_;
    private boolean type_;

    static {
        RecentlyPlayedShowDecorationPolicy recentlyPlayedShowDecorationPolicy = new RecentlyPlayedShowDecorationPolicy();
        DEFAULT_INSTANCE = recentlyPlayedShowDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(RecentlyPlayedShowDecorationPolicy.class, recentlyPlayedShowDecorationPolicy);
    }

    private RecentlyPlayedShowDecorationPolicy() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20300n(RecentlyPlayedShowDecorationPolicy recentlyPlayedShowDecorationPolicy, ShowDecorationPolicy showDecorationPolicy) {
        recentlyPlayedShowDecorationPolicy.getClass();
        showDecorationPolicy.getClass();
        recentlyPlayedShowDecorationPolicy.showPolicy_ = showDecorationPolicy;
        recentlyPlayedShowDecorationPolicy.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m20301o(RecentlyPlayedShowDecorationPolicy recentlyPlayedShowDecorationPolicy) {
        recentlyPlayedShowDecorationPolicy.timestamp_ = true;
    }

    /* JADX INFO: renamed from: p */
    public static void m20302p(RecentlyPlayedShowDecorationPolicy recentlyPlayedShowDecorationPolicy) {
        recentlyPlayedShowDecorationPolicy.type_ = true;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static m3v0 m20303q() {
        return (m3v0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u0007\u0005\u0007", new Object[]{"bitField0_", "showPolicy_", "collectionPolicy_", "playedStatePolicy_", "type_", "timestamp_"});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedShowDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new m3v0(DEFAULT_INSTANCE);
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
        synchronized (RecentlyPlayedShowDecorationPolicy.class) {
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
