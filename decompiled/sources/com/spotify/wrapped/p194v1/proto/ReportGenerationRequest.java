package com.spotify.wrapped.p194v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.i8w0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ReportGenerationRequest extends AbstractC0269h implements sre0 {
    public static final int DAY_FIELD_NUMBER = 2;
    private static final ReportGenerationRequest DEFAULT_INSTANCE;
    public static final int MONTH_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SHORT_TITLE_FIELD_NUMBER = 3;
    private int day_;
    private int month_;
    private String shortTitle_ = "";

    static {
        ReportGenerationRequest reportGenerationRequest = new ReportGenerationRequest();
        DEFAULT_INSTANCE = reportGenerationRequest;
        AbstractC0269h.registerDefaultInstance(ReportGenerationRequest.class, reportGenerationRequest);
    }

    private ReportGenerationRequest() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003Ȉ", new Object[]{"month_", "day_", "shortTitle_"});
        }
        if (iOrdinal == 3) {
            return new ReportGenerationRequest();
        }
        if (iOrdinal == 4) {
            return new i8w0(DEFAULT_INSTANCE, 10);
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
        synchronized (ReportGenerationRequest.class) {
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
