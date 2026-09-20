package com.spotify.show_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pmc0;
import p204p.pre0;
import p204p.qmc0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class MarkShowAsPlayedRequest extends AbstractC0269h implements sre0 {
    private static final MarkShowAsPlayedRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_ID_FIELD_NUMBER = 1;
    public static final int STATE_FIELD_NUMBER = 2;
    private String showId_ = "";
    private int state_;

    static {
        MarkShowAsPlayedRequest markShowAsPlayedRequest = new MarkShowAsPlayedRequest();
        DEFAULT_INSTANCE = markShowAsPlayedRequest;
        AbstractC0269h.registerDefaultInstance(MarkShowAsPlayedRequest.class, markShowAsPlayedRequest);
    }

    private MarkShowAsPlayedRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21231n(MarkShowAsPlayedRequest markShowAsPlayedRequest, String str) {
        markShowAsPlayedRequest.getClass();
        str.getClass();
        markShowAsPlayedRequest.showId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m21232o(MarkShowAsPlayedRequest markShowAsPlayedRequest, qmc0 qmc0Var) {
        markShowAsPlayedRequest.getClass();
        markShowAsPlayedRequest.state_ = qmc0Var.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static pmc0 m21233p() {
        return (pmc0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"showId_", "state_"});
        }
        if (iOrdinal == 3) {
            return new MarkShowAsPlayedRequest();
        }
        if (iOrdinal == 4) {
            return new pmc0(DEFAULT_INSTANCE);
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
        synchronized (MarkShowAsPlayedRequest.class) {
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
