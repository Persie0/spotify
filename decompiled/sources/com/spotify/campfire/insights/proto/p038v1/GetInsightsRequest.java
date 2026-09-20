package com.spotify.campfire.insights.proto.p038v1;

import com.google.protobuf.AbstractC0269h;
import p204p.g910;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class GetInsightsRequest extends AbstractC0269h implements sre0 {
    private static final GetInsightsRequest DEFAULT_INSTANCE;
    public static final int ENTITIES_PER_WEEK_FIELD_NUMBER = 3;
    public static final int HIERARCHY_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int WEEKS_FIELD_NUMBER = 2;
    private int entitiesPerWeek_;
    private String hierarchyId_ = "";
    private int weeks_;

    static {
        GetInsightsRequest getInsightsRequest = new GetInsightsRequest();
        DEFAULT_INSTANCE = getInsightsRequest;
        AbstractC0269h.registerDefaultInstance(GetInsightsRequest.class, getInsightsRequest);
    }

    private GetInsightsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m5466n(GetInsightsRequest getInsightsRequest, String str) {
        getInsightsRequest.getClass();
        str.getClass();
        getInsightsRequest.hierarchyId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static g910 m5467o() {
        return (g910) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b", new Object[]{"hierarchyId_", "weeks_", "entitiesPerWeek_"});
        }
        if (iOrdinal == 3) {
            return new GetInsightsRequest();
        }
        if (iOrdinal == 4) {
            return new g910(DEFAULT_INSTANCE);
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
        synchronized (GetInsightsRequest.class) {
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
