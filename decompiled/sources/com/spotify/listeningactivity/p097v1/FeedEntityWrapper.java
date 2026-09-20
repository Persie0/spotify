package com.spotify.listeningactivity.p097v1;

import com.google.protobuf.AbstractC0269h;
import p204p.mlx;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class FeedEntityWrapper extends AbstractC0269h implements sre0 {
    private static final FeedEntityWrapper DEFAULT_INSTANCE;
    public static final int FOLLOW_ENTITY_FIELD_NUMBER = 2;
    public static final int GROUP_ENTITY_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int USER_ENTITY_FIELD_NUMBER = 1;
    private int entityCase_ = 0;
    private Object entity_;

    static {
        FeedEntityWrapper feedEntityWrapper = new FeedEntityWrapper();
        DEFAULT_INSTANCE = feedEntityWrapper;
        AbstractC0269h.registerDefaultInstance(FeedEntityWrapper.class, feedEntityWrapper);
    }

    private FeedEntityWrapper() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"entity_", "entityCase_", UserFeedEntity.class, FollowFeedEntity.class, GroupFeedEntity.class});
        }
        if (iOrdinal == 3) {
            return new FeedEntityWrapper();
        }
        if (iOrdinal == 4) {
            return new mlx(DEFAULT_INSTANCE, 19);
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
        synchronized (FeedEntityWrapper.class) {
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
    public final FollowFeedEntity m12925n() {
        return this.entityCase_ == 2 ? (FollowFeedEntity) this.entity_ : FollowFeedEntity.m12931o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final GroupFeedEntity m12926o() {
        return this.entityCase_ == 3 ? (GroupFeedEntity) this.entity_ : GroupFeedEntity.m12947o();
    }

    /* JADX INFO: renamed from: p */
    public final UserFeedEntity m12927p() {
        return this.entityCase_ == 1 ? (UserFeedEntity) this.entity_ : UserFeedEntity.m12974o();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m12928q() {
        return this.entityCase_ == 2;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m12929r() {
        return this.entityCase_ == 3;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m12930s() {
        return this.entityCase_ == 1;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
