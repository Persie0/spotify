package com.spotify.listeningactivity.p097v1;

import com.google.protobuf.AbstractC0269h;
import p204p.byy;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class FollowFeedEntity extends AbstractC0269h implements sre0 {
    public static final int ACTIVITY_FIELD_NUMBER = 2;
    private static final FollowFeedEntity DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private FeedActivity activity_;
    private int bitField0_;
    private String uri_ = "";

    static {
        FollowFeedEntity followFeedEntity = new FollowFeedEntity();
        DEFAULT_INSTANCE = followFeedEntity;
        AbstractC0269h.registerDefaultInstance(FollowFeedEntity.class, followFeedEntity);
    }

    private FollowFeedEntity() {
    }

    /* JADX INFO: renamed from: o */
    public static FollowFeedEntity m12931o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "uri_", "activity_"});
        }
        if (iOrdinal == 3) {
            return new FollowFeedEntity();
        }
        if (iOrdinal == 4) {
            return new byy(DEFAULT_INSTANCE, 16);
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
        synchronized (FollowFeedEntity.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final FeedActivity m12932n() {
        FeedActivity feedActivity = this.activity_;
        return feedActivity == null ? FeedActivity.m12919o() : feedActivity;
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
