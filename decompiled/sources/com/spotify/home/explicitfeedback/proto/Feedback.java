package com.spotify.home.explicitfeedback.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ajy;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class Feedback extends AbstractC0269h implements sre0 {
    public static final int CREATEDAT_FIELD_NUMBER = 2;
    private static final Feedback DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private long createdAt_;
    private String uri_ = "";

    static {
        Feedback feedback = new Feedback();
        DEFAULT_INSTANCE = feedback;
        AbstractC0269h.registerDefaultInstance(Feedback.class, feedback);
    }

    private Feedback() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11791n(Feedback feedback, long j) {
        feedback.createdAt_ = j;
    }

    /* JADX INFO: renamed from: o */
    public static void m11792o(Feedback feedback, String str) {
        feedback.getClass();
        str.getClass();
        feedback.uri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static ajy m11793p() {
        return (ajy) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"uri_", "createdAt_"});
        }
        if (iOrdinal == 3) {
            return new Feedback();
        }
        if (iOrdinal == 4) {
            return new ajy(DEFAULT_INSTANCE);
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
        synchronized (Feedback.class) {
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

    public final long getCreatedAt() {
        return this.createdAt_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getUri() {
        return this.uri_;
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
