package com.spotify.playlist.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.dbd0;
import p204p.g6f0;
import p204p.knn0;
import p204p.nq6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.yxz;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class Member extends AbstractC0269h implements sre0 {
    private static final Member DEFAULT_INSTANCE;
    public static final int FOLLOW_STATE_FIELD_NUMBER = 5;
    public static final int IS_OWNER_FIELD_NUMBER = 2;
    public static final int NUM_EPISODES_FIELD_NUMBER = 4;
    public static final int NUM_TRACKS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PERMISSION_LEVEL_FIELD_NUMBER = 6;
    public static final int USER_FIELD_NUMBER = 1;
    private int bitField0_;
    private int followState_;
    private boolean isOwner_;
    private int numEpisodes_;
    private int numTracks_;
    private int permissionLevel_;
    private User user_;

    static {
        Member member = new Member();
        DEFAULT_INSTANCE = member;
        AbstractC0269h.registerDefaultInstance(Member.class, member);
    }

    private Member() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005᠌\u0004\u0006᠌\u0005", new Object[]{"bitField0_", "user_", "isOwner_", "numTracks_", "numEpisodes_", "followState_", nq6.f157150g, "permissionLevel_", g6f0.f77035h});
        }
        if (iOrdinal == 3) {
            return new Member();
        }
        if (iOrdinal == 4) {
            return new dbd0(DEFAULT_INSTANCE, 5);
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
        synchronized (Member.class) {
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

    public final int getNumEpisodes() {
        return this.numEpisodes_;
    }

    public final int getNumTracks() {
        return this.numTracks_;
    }

    /* JADX INFO: renamed from: n */
    public final yxz m18483n() {
        yxz yxzVarM94863a = yxz.m94863a(this.followState_);
        return yxzVarM94863a == null ? yxz.NONE : yxzVarM94863a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m18484o() {
        return this.isOwner_;
    }

    /* JADX INFO: renamed from: p */
    public final knn0 m18485p() {
        knn0 knn0VarM56948a = knn0.m56948a(this.permissionLevel_);
        return knn0VarM56948a == null ? knn0.UNKNOWN : knn0VarM56948a;
    }

    /* JADX INFO: renamed from: q */
    public final User m18486q() {
        User user = this.user_;
        return user == null ? User.m18670o() : user;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
