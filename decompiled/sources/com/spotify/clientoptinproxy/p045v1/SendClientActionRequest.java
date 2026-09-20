package com.spotify.clientoptinproxy.p045v1;

import com.google.protobuf.AbstractC0269h;
import p204p.fqz0;
import p204p.gqz0;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class SendClientActionRequest extends AbstractC0269h implements sre0 {
    private static final SendClientActionRequest DEFAULT_INSTANCE;
    public static final int FEATURE_TYPE_FIELD_NUMBER = 1;
    public static final int METADATA_FIELD_NUMBER = 3;
    public static final int OPT_IN_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private boolean optIn_;
    private ihc0 metadata_ = ihc0.f102235b;
    private String featureType_ = "";

    static {
        SendClientActionRequest sendClientActionRequest = new SendClientActionRequest();
        DEFAULT_INSTANCE = sendClientActionRequest;
        AbstractC0269h.registerDefaultInstance(SendClientActionRequest.class, sendClientActionRequest);
    }

    private SendClientActionRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m6769n(SendClientActionRequest sendClientActionRequest) {
        ihc0 ihc0Var = sendClientActionRequest.metadata_;
        if (!ihc0Var.f102236a) {
            sendClientActionRequest.metadata_ = ihc0Var.m50613h();
        }
        return sendClientActionRequest.metadata_;
    }

    /* JADX INFO: renamed from: o */
    public static void m6770o(SendClientActionRequest sendClientActionRequest, String str) {
        sendClientActionRequest.getClass();
        str.getClass();
        sendClientActionRequest.featureType_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m6771p(SendClientActionRequest sendClientActionRequest, boolean z) {
        sendClientActionRequest.optIn_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static fqz0 m6772q() {
        return (fqz0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001Ȉ\u0002\u0007\u00032", new Object[]{"featureType_", "optIn_", "metadata_", gqz0.f83583a});
        }
        if (iOrdinal == 3) {
            return new SendClientActionRequest();
        }
        if (iOrdinal == 4) {
            return new fqz0(DEFAULT_INSTANCE);
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
        synchronized (SendClientActionRequest.class) {
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
