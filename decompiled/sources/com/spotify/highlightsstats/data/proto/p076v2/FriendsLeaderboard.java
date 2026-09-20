package com.spotify.highlightsstats.data.proto.p076v2;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.byy;
import p204p.ore0;
import p204p.pre0;
import p204p.qd31;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class FriendsLeaderboard extends AbstractC0269h implements sre0 {
    public static final int CURRENT_USER_ITEM_FIELD_NUMBER = 2;
    public static final int DATA_TYPE_FIELD_NUMBER = 3;
    private static final FriendsLeaderboard DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private LeaderboardItem currentUserItem_;
    private int dataType_;
    private ae50 items_ = AbstractC0269h.emptyProtobufList();

    static {
        FriendsLeaderboard friendsLeaderboard = new FriendsLeaderboard();
        DEFAULT_INSTANCE = friendsLeaderboard;
        AbstractC0269h.registerDefaultInstance(FriendsLeaderboard.class, friendsLeaderboard);
    }

    private FriendsLeaderboard() {
    }

    /* JADX INFO: renamed from: p */
    public static FriendsLeaderboard m11518p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003\f", new Object[]{"bitField0_", "items_", LeaderboardItem.class, "currentUserItem_", "dataType_"});
        }
        if (iOrdinal == 3) {
            return new FriendsLeaderboard();
        }
        if (iOrdinal == 4) {
            return new byy(DEFAULT_INSTANCE, 29);
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
        synchronized (FriendsLeaderboard.class) {
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

    public final List getItemsList() {
        return this.items_;
    }

    /* JADX INFO: renamed from: n */
    public final LeaderboardItem m11519n() {
        LeaderboardItem leaderboardItem = this.currentUserItem_;
        return leaderboardItem == null ? LeaderboardItem.m11552p() : leaderboardItem;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final qd31 m11520o() {
        qd31 qd31VarM72579a = qd31.m72579a(this.dataType_);
        return qd31VarM72579a == null ? qd31.UNRECOGNIZED : qd31VarM72579a;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m11521q() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
