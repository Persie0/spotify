package com.spotify.highlightsstats.data.proto.timeline.view.p075v1;

import com.google.protobuf.AbstractC0269h;
import p204p.kea1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class UserTimelineResponse extends AbstractC0269h implements sre0 {
    private static final UserTimelineResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int USERLISTENINGSTATUS_FIELD_NUMBER = 2;
    public static final int USER_TIMELINE_FIELD_NUMBER = 1;
    private int timelineCase_ = 0;
    private Object timeline_;

    static {
        UserTimelineResponse userTimelineResponse = new UserTimelineResponse();
        DEFAULT_INSTANCE = userTimelineResponse;
        AbstractC0269h.registerDefaultInstance(UserTimelineResponse.class, userTimelineResponse);
    }

    private UserTimelineResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"timeline_", "timelineCase_", UserTimeline.class, UserListeningStatus.class});
        }
        if (iOrdinal == 3) {
            return new UserTimelineResponse();
        }
        if (iOrdinal == 4) {
            return new kea1(DEFAULT_INSTANCE, 18);
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
        synchronized (UserTimelineResponse.class) {
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
    public final int m11494n() {
        int i = this.timelineCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final UserListeningStatus m11495o() {
        return this.timelineCase_ == 2 ? (UserListeningStatus) this.timeline_ : UserListeningStatus.m11479o();
    }

    /* JADX INFO: renamed from: p */
    public final UserTimeline m11496p() {
        return this.timelineCase_ == 1 ? (UserTimeline) this.timeline_ : UserTimeline.m11483o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
