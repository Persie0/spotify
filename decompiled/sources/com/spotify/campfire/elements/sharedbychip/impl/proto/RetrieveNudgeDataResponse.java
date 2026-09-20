package com.spotify.campfire.elements.sharedbychip.impl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.h4x0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class RetrieveNudgeDataResponse extends AbstractC0269h implements sre0 {
    private static final RetrieveNudgeDataResponse DEFAULT_INSTANCE;
    public static final int NUDGE_DATA_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ae50 nudgeData_ = AbstractC0269h.emptyProtobufList();

    static {
        RetrieveNudgeDataResponse retrieveNudgeDataResponse = new RetrieveNudgeDataResponse();
        DEFAULT_INSTANCE = retrieveNudgeDataResponse;
        AbstractC0269h.registerDefaultInstance(RetrieveNudgeDataResponse.class, retrieveNudgeDataResponse);
    }

    private RetrieveNudgeDataResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"nudgeData_", NudgeData.class});
        }
        if (iOrdinal == 3) {
            return new RetrieveNudgeDataResponse();
        }
        if (iOrdinal == 4) {
            return new h4x0(DEFAULT_INSTANCE, 19);
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
        synchronized (RetrieveNudgeDataResponse.class) {
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
    public final ae50 m5461n() {
        return this.nudgeData_;
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
