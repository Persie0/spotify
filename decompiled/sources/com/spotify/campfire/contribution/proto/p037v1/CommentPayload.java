package com.spotify.campfire.contribution.proto.p037v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wef;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class CommentPayload extends AbstractC0269h implements sre0 {
    private static final CommentPayload DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private String text_ = "";

    static {
        CommentPayload commentPayload = new CommentPayload();
        DEFAULT_INSTANCE = commentPayload;
        AbstractC0269h.registerDefaultInstance(CommentPayload.class, commentPayload);
    }

    private CommentPayload() {
    }

    /* JADX INFO: renamed from: n */
    public static void m4239n(CommentPayload commentPayload, String str) {
        commentPayload.getClass();
        str.getClass();
        commentPayload.text_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static CommentPayload m4240o() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static wef m4241q() {
        return (wef) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"text_"});
        }
        if (iOrdinal == 3) {
            return new CommentPayload();
        }
        if (iOrdinal == 4) {
            return new wef(DEFAULT_INSTANCE);
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
        synchronized (CommentPayload.class) {
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

    /* JADX INFO: renamed from: p */
    public final String m4242p() {
        return this.text_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
