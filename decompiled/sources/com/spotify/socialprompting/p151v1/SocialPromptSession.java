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
public final class SocialPromptSession extends AbstractC0269h implements sre0 {
    private static final SocialPromptSession DEFAULT_INSTANCE;
    public static final int DISPLAY_LABEL_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PROMPT_FIELD_NUMBER = 2;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int STATUS_FIELD_NUMBER = 4;
    private int status_;
    private String sessionId_ = "";
    private String prompt_ = "";
    private String displayLabel_ = "";

    static {
        SocialPromptSession socialPromptSession = new SocialPromptSession();
        DEFAULT_INSTANCE = socialPromptSession;
        AbstractC0269h.registerDefaultInstance(SocialPromptSession.class, socialPromptSession);
    }

    private SocialPromptSession() {
    }

    /* JADX INFO: renamed from: n */
    public static SocialPromptSession m21459n() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f", new Object[]{"sessionId_", "prompt_", "displayLabel_", "status_"});
        }
        if (iOrdinal == 3) {
            return new SocialPromptSession();
        }
        if (iOrdinal == 4) {
            return new ne21(DEFAULT_INSTANCE, 14);
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
        synchronized (SocialPromptSession.class) {
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

    public final String getPrompt() {
        return this.prompt_;
    }

    public final String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m21460o() {
        return this.displayLabel_;
    }

    /* JADX INFO: renamed from: p */
    public final d310 m21461p() {
        d310 d310VarM34797a = d310.m34797a(this.status_);
        return d310VarM34797a == null ? d310.UNRECOGNIZED : d310VarM34797a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
