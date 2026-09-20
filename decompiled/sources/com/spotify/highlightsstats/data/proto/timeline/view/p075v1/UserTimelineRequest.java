package com.spotify.highlightsstats.data.proto.timeline.view.p075v1;

import com.google.protobuf.AbstractC0269h;
import p204p.e5u0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.yxa1;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class UserTimelineRequest extends AbstractC0269h implements sre0 {
    private static final UserTimelineRequest DEFAULT_INSTANCE;
    public static final int LOOK_BACK_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int RANGE_FIELD_NUMBER = 1;
    public static final int TIME_ZONE_FIELD_NUMBER = 3;
    private int lookBack_;
    private int range_;
    private String timeZone_ = "";

    static {
        UserTimelineRequest userTimelineRequest = new UserTimelineRequest();
        DEFAULT_INSTANCE = userTimelineRequest;
        AbstractC0269h.registerDefaultInstance(UserTimelineRequest.class, userTimelineRequest);
    }

    private UserTimelineRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11490n(UserTimelineRequest userTimelineRequest, int i) {
        userTimelineRequest.lookBack_ = i;
    }

    /* JADX INFO: renamed from: o */
    public static void m11491o(UserTimelineRequest userTimelineRequest, e5u0 e5u0Var) {
        userTimelineRequest.getClass();
        userTimelineRequest.range_ = e5u0Var.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static void m11492p(UserTimelineRequest userTimelineRequest, String str) {
        userTimelineRequest.getClass();
        userTimelineRequest.timeZone_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static yxa1 m11493q() {
        return (yxa1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003Ȉ", new Object[]{"range_", "lookBack_", "timeZone_"});
        }
        if (iOrdinal == 3) {
            return new UserTimelineRequest();
        }
        if (iOrdinal == 4) {
            return new yxa1(DEFAULT_INSTANCE);
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
        synchronized (UserTimelineRequest.class) {
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
