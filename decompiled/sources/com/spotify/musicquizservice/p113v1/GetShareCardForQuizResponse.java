package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ca10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class GetShareCardForQuizResponse extends AbstractC0269h implements sre0 {
    public static final int CARD_METADATA_FIELD_NUMBER = 1;
    public static final int COMPLETION_ID_FIELD_NUMBER = 4;
    private static final GetShareCardForQuizResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SHARE_TARGET_FIELD_NUMBER = 2;
    public static final int SHARE_TEXT_FIELD_NUMBER = 3;
    private int bitField0_;
    private CardMetadata cardMetadata_;
    private ShareTarget shareTarget_;
    private String shareText_ = "";
    private String completionId_ = "";

    static {
        GetShareCardForQuizResponse getShareCardForQuizResponse = new GetShareCardForQuizResponse();
        DEFAULT_INSTANCE = getShareCardForQuizResponse;
        AbstractC0269h.registerDefaultInstance(GetShareCardForQuizResponse.class, getShareCardForQuizResponse);
    }

    private GetShareCardForQuizResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004Ȉ", new Object[]{"bitField0_", "cardMetadata_", "shareTarget_", "shareText_", "completionId_"});
        }
        if (iOrdinal == 3) {
            return new GetShareCardForQuizResponse();
        }
        if (iOrdinal == 4) {
            return new ca10(DEFAULT_INSTANCE, 25);
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
        synchronized (GetShareCardForQuizResponse.class) {
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
    public final String m15849n() {
        return this.completionId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ShareTarget m15850o() {
        ShareTarget shareTarget = this.shareTarget_;
        return shareTarget == null ? ShareTarget.m15929o() : shareTarget;
    }

    /* JADX INFO: renamed from: p */
    public final String m15851p() {
        return this.shareText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
