package com.spotify.playlist.policy.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uye;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class CollaboratorPolicy extends AbstractC0269h implements sre0 {
    private static final CollaboratorPolicy DEFAULT_INSTANCE;
    public static final int IS_OWNER_FIELD_NUMBER = 5;
    public static final int NUMBER_OF_EPISODES_FIELD_NUMBER = 4;
    public static final int NUMBER_OF_ITEMS_FIELD_NUMBER = 2;
    public static final int NUMBER_OF_TRACKS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int USER_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean isOwner_;
    private boolean numberOfEpisodes_;
    private boolean numberOfItems_;
    private boolean numberOfTracks_;
    private UserDecorationPolicy user_;

    static {
        CollaboratorPolicy collaboratorPolicy = new CollaboratorPolicy();
        DEFAULT_INSTANCE = collaboratorPolicy;
        AbstractC0269h.registerDefaultInstance(CollaboratorPolicy.class, collaboratorPolicy);
    }

    private CollaboratorPolicy() {
    }

    /* JADX INFO: renamed from: n */
    public static void m18302n(CollaboratorPolicy collaboratorPolicy) {
        collaboratorPolicy.isOwner_ = true;
    }

    /* JADX INFO: renamed from: o */
    public static void m18303o(CollaboratorPolicy collaboratorPolicy) {
        collaboratorPolicy.numberOfEpisodes_ = true;
    }

    /* JADX INFO: renamed from: p */
    public static void m18304p(CollaboratorPolicy collaboratorPolicy) {
        collaboratorPolicy.numberOfTracks_ = true;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m18305q(CollaboratorPolicy collaboratorPolicy, UserDecorationPolicy userDecorationPolicy) {
        collaboratorPolicy.getClass();
        userDecorationPolicy.getClass();
        collaboratorPolicy.user_ = userDecorationPolicy;
        collaboratorPolicy.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: r */
    public static CollaboratorPolicy m18306r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static uye m18307t() {
        return (uye) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007", new Object[]{"bitField0_", "user_", "numberOfItems_", "numberOfTracks_", "numberOfEpisodes_", "isOwner_"});
        }
        if (iOrdinal == 3) {
            return new CollaboratorPolicy();
        }
        if (iOrdinal == 4) {
            return new uye(DEFAULT_INSTANCE);
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
        synchronized (CollaboratorPolicy.class) {
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

    /* JADX INFO: renamed from: s */
    public final UserDecorationPolicy m18308s() {
        UserDecorationPolicy userDecorationPolicy = this.user_;
        return userDecorationPolicy == null ? UserDecorationPolicy.m18450t() : userDecorationPolicy;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
