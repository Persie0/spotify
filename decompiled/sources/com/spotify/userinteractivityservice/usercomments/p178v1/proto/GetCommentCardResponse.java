package com.spotify.userinteractivityservice.usercomments.p178v1.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.k710;
import p204p.myt;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class GetCommentCardResponse extends AbstractC0269h implements sre0 {
    private static final GetCommentCardResponse DEFAULT_INSTANCE;
    public static final int ELIGIBILITY_STATUS_FIELD_NUMBER = 1;
    public static final int NUMBER_OF_COMMENTS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TOP_COMMENTS_FIELD_NUMBER = 3;
    private int eligibilityStatus_;
    private int numberOfComments_;
    private ae50 topComments_ = AbstractC0269h.emptyProtobufList();

    static {
        GetCommentCardResponse getCommentCardResponse = new GetCommentCardResponse();
        DEFAULT_INSTANCE = getCommentCardResponse;
        AbstractC0269h.registerDefaultInstance(GetCommentCardResponse.class, getCommentCardResponse);
    }

    private GetCommentCardResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static void m22173n(GetCommentCardResponse getCommentCardResponse, ArrayList arrayList) {
        ae50 ae50Var = getCommentCardResponse.topComments_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            getCommentCardResponse.topComments_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, getCommentCardResponse.topComments_);
    }

    /* JADX INFO: renamed from: o */
    public static void m22174o(GetCommentCardResponse getCommentCardResponse) {
        getCommentCardResponse.getClass();
        getCommentCardResponse.topComments_ = AbstractC0269h.emptyProtobufList();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u0004\u0003\u001b", new Object[]{"eligibilityStatus_", "numberOfComments_", "topComments_", Comment.class});
        }
        if (iOrdinal == 3) {
            return new GetCommentCardResponse();
        }
        if (iOrdinal == 4) {
            return new k710();
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
        synchronized (GetCommentCardResponse.class) {
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

    /* JADX INFO: renamed from: q */
    public final myt m22176q() {
        myt mytVarM63209a = myt.m63209a(this.eligibilityStatus_);
        return mytVarM63209a == null ? myt.UNRECOGNIZED : mytVarM63209a;
    }

    /* JADX INFO: renamed from: r */
    public final int m22177r() {
        return this.numberOfComments_;
    }

    /* JADX INFO: renamed from: s */
    public final int m22178s() {
        return this.topComments_.size();
    }

    /* JADX INFO: renamed from: t */
    public final ae50 m22179t() {
        return this.topComments_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
