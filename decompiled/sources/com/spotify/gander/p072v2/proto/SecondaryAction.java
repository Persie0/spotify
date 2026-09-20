package com.spotify.gander.p072v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.k4z0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class SecondaryAction extends AbstractC0269h implements sre0 {
    public static final int BLOCK_FOLLOWER_FIELD_NUMBER = 2;
    private static final SecondaryAction DEFAULT_INSTANCE;
    public static final int DELETE_NOTIFICATION_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int REMOVE_FOLLOWER_FIELD_NUMBER = 1;
    public static final int SET_PLAYLIST_PRIVATE_FIELD_NUMBER = 3;
    private int actionCase_ = 0;
    private Object action_;

    static {
        SecondaryAction secondaryAction = new SecondaryAction();
        DEFAULT_INSTANCE = secondaryAction;
        AbstractC0269h.registerDefaultInstance(SecondaryAction.class, secondaryAction);
    }

    private SecondaryAction() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11120n(SecondaryAction secondaryAction, BlockFollowerAction blockFollowerAction) {
        secondaryAction.getClass();
        blockFollowerAction.getClass();
        secondaryAction.action_ = blockFollowerAction;
        secondaryAction.actionCase_ = 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m11121o(SecondaryAction secondaryAction, DeleteNotificationAction deleteNotificationAction) {
        secondaryAction.getClass();
        deleteNotificationAction.getClass();
        secondaryAction.action_ = deleteNotificationAction;
        secondaryAction.actionCase_ = 4;
    }

    /* JADX INFO: renamed from: p */
    public static void m11122p(SecondaryAction secondaryAction, RemoveFollowerAction removeFollowerAction) {
        secondaryAction.getClass();
        removeFollowerAction.getClass();
        secondaryAction.action_ = removeFollowerAction;
        secondaryAction.actionCase_ = 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m11123q(SecondaryAction secondaryAction, SetPlaylistPrivateAction setPlaylistPrivateAction) {
        secondaryAction.getClass();
        setPlaylistPrivateAction.getClass();
        secondaryAction.action_ = setPlaylistPrivateAction;
        secondaryAction.actionCase_ = 3;
    }

    /* JADX INFO: renamed from: v */
    public static k4z0 m11124v() {
        return (k4z0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"action_", "actionCase_", RemoveFollowerAction.class, BlockFollowerAction.class, SetPlaylistPrivateAction.class, DeleteNotificationAction.class});
        }
        if (iOrdinal == 3) {
            return new SecondaryAction();
        }
        if (iOrdinal == 4) {
            return new k4z0(DEFAULT_INSTANCE);
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
        synchronized (SecondaryAction.class) {
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

    /* JADX INFO: renamed from: r */
    public final int m11125r() {
        int i = this.actionCase_;
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: s */
    public final BlockFollowerAction m11126s() {
        return this.actionCase_ == 2 ? (BlockFollowerAction) this.action_ : BlockFollowerAction.m11067p();
    }

    /* JADX INFO: renamed from: t */
    public final RemoveFollowerAction m11127t() {
        return this.actionCase_ == 1 ? (RemoveFollowerAction) this.action_ : RemoveFollowerAction.m11113p();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final SetPlaylistPrivateAction m11128u() {
        return this.actionCase_ == 3 ? (SetPlaylistPrivateAction) this.action_ : SetPlaylistPrivateAction.m11130o();
    }
}
