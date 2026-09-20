package com.spotify.highlightsstats.data.proto.p076v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ne21;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialMinutesListenedDetailsPage extends AbstractC0269h implements sre0 {
    private static final SocialMinutesListenedDetailsPage DEFAULT_INSTANCE;
    public static final int FRIENDS_LEADERBOARD_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private FriendsLeaderboard friendsLeaderboard_;

    static {
        SocialMinutesListenedDetailsPage socialMinutesListenedDetailsPage = new SocialMinutesListenedDetailsPage();
        DEFAULT_INSTANCE = socialMinutesListenedDetailsPage;
        AbstractC0269h.registerDefaultInstance(SocialMinutesListenedDetailsPage.class, socialMinutesListenedDetailsPage);
    }

    private SocialMinutesListenedDetailsPage() {
    }

    /* JADX INFO: renamed from: n */
    public static SocialMinutesListenedDetailsPage m11626n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "friendsLeaderboard_"});
        }
        if (iOrdinal == 3) {
            return new SocialMinutesListenedDetailsPage();
        }
        if (iOrdinal == 4) {
            return new ne21(DEFAULT_INSTANCE, 12);
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
        synchronized (SocialMinutesListenedDetailsPage.class) {
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
    public final FriendsLeaderboard m11627o() {
        FriendsLeaderboard friendsLeaderboard = this.friendsLeaderboard_;
        return friendsLeaderboard == null ? FriendsLeaderboard.m11518p() : friendsLeaderboard;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
