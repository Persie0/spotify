package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wo80;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ListChallengeTargetsRequest extends AbstractC0269h implements sre0 {
    private static final ListChallengeTargetsRequest DEFAULT_INSTANCE;
    public static final int HTTP_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private boolean http_;

    static {
        ListChallengeTargetsRequest listChallengeTargetsRequest = new ListChallengeTargetsRequest();
        DEFAULT_INSTANCE = listChallengeTargetsRequest;
        AbstractC0269h.registerDefaultInstance(ListChallengeTargetsRequest.class, listChallengeTargetsRequest);
    }

    private ListChallengeTargetsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m15858n(ListChallengeTargetsRequest listChallengeTargetsRequest) {
        listChallengeTargetsRequest.http_ = true;
    }

    /* JADX INFO: renamed from: o */
    public static wo80 m15859o() {
        return (wo80) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"http_"});
        }
        if (iOrdinal == 3) {
            return new ListChallengeTargetsRequest();
        }
        if (iOrdinal == 4) {
            return new wo80(DEFAULT_INSTANCE);
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
        synchronized (ListChallengeTargetsRequest.class) {
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
