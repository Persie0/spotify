package com.spotify.userinteractivityservice.usercomments.p178v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.r5l;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class CreateCommentRequest extends AbstractC0269h implements sre0 {
    public static final int COMMENT_STR_FIELD_NUMBER = 2;
    private static final CreateCommentRequest DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TIMESTAMPS_FIELD_NUMBER = 3;
    private String entityUri_ = "";
    private String commentStr_ = "";
    private ae50 timestamps_ = AbstractC0269h.emptyProtobufList();

    static {
        CreateCommentRequest createCommentRequest = new CreateCommentRequest();
        DEFAULT_INSTANCE = createCommentRequest;
        AbstractC0269h.registerDefaultInstance(CreateCommentRequest.class, createCommentRequest);
    }

    private CreateCommentRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m22152n(CreateCommentRequest createCommentRequest, Iterable iterable) {
        ae50 ae50Var = createCommentRequest.timestamps_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            createCommentRequest.timestamps_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, createCommentRequest.timestamps_);
    }

    /* JADX INFO: renamed from: o */
    public static void m22153o(CreateCommentRequest createCommentRequest, String str) {
        createCommentRequest.getClass();
        str.getClass();
        createCommentRequest.commentStr_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m22154p(CreateCommentRequest createCommentRequest, String str) {
        createCommentRequest.getClass();
        str.getClass();
        createCommentRequest.entityUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static r5l m22156r() {
        return (r5l) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"entityUri_", "commentStr_", "timestamps_", Timestamp.class});
        }
        if (iOrdinal == 3) {
            return new CreateCommentRequest();
        }
        if (iOrdinal == 4) {
            return new r5l();
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
        synchronized (CreateCommentRequest.class) {
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
