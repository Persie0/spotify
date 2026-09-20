package com.spotify.socialprompting.p151v1;

import com.google.protobuf.AbstractC0269h;
import p204p.d310;
import p204p.ne21;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class SocialPromptingPusherMessage extends AbstractC0269h implements sre0 {
    public static final int BLEND_ID_FIELD_NUMBER = 2;
    private static final SocialPromptingPusherMessage DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PUBLISHED_AT_MS_FIELD_NUMBER = 4;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int STATUS_FIELD_NUMBER = 3;
    private long publishedAtMs_;
    private int status_;
    private String sessionId_ = "";
    private String blendId_ = "";

    static {
        SocialPromptingPusherMessage socialPromptingPusherMessage = new SocialPromptingPusherMessage();
        DEFAULT_INSTANCE = socialPromptingPusherMessage;
        AbstractC0269h.registerDefaultInstance(SocialPromptingPusherMessage.class, socialPromptingPusherMessage);
    }

    private SocialPromptingPusherMessage() {
    }

    /* JADX INFO: renamed from: o */
    public static SocialPromptingPusherMessage m21462o(byte[] bArr) {
        return (SocialPromptingPusherMessage) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004\u0002", new Object[]{"sessionId_", "blendId_", "status_", "publishedAtMs_"});
        }
        if (iOrdinal == 3) {
            return new SocialPromptingPusherMessage();
        }
        if (iOrdinal == 4) {
            return new ne21(DEFAULT_INSTANCE, 15);
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
        synchronized (SocialPromptingPusherMessage.class) {
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

    public final String getSessionId() {
        return this.sessionId_;
    }

    /* JADX INFO: renamed from: n */
    public final d310 m21463n() {
        d310 d310VarM34797a = d310.m34797a(this.status_);
        return d310VarM34797a == null ? d310.UNRECOGNIZED : d310VarM34797a;
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
