package com.spotify.userinteractivityservice.usercomments.p178v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.dgt0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class PutReactionRequest extends AbstractC0269h implements sre0 {
    public static final int COMMENT_URI_FIELD_NUMBER = 1;
    private static final PutReactionRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REACTION_UNICODE_FIELD_NUMBER = 2;
    private String commentUri_ = "";
    private String reactionUnicode_ = "";

    static {
        PutReactionRequest putReactionRequest = new PutReactionRequest();
        DEFAULT_INSTANCE = putReactionRequest;
        AbstractC0269h.registerDefaultInstance(PutReactionRequest.class, putReactionRequest);
    }

    private PutReactionRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m22209n(PutReactionRequest putReactionRequest, String str) {
        putReactionRequest.getClass();
        str.getClass();
        putReactionRequest.commentUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m22210o(PutReactionRequest putReactionRequest, String str) {
        putReactionRequest.getClass();
        str.getClass();
        putReactionRequest.reactionUnicode_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static dgt0 m22212q() {
        return (dgt0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"commentUri_", "reactionUnicode_"});
        }
        if (iOrdinal == 3) {
            return new PutReactionRequest();
        }
        if (iOrdinal == 4) {
            return new dgt0();
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
        synchronized (PutReactionRequest.class) {
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
