package com.spotify.referrals.service.p143v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.q610;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class GetContextualEntrypointCopyForJamResponse extends AbstractC0269h implements sre0 {
    private static final GetContextualEntrypointCopyForJamResponse DEFAULT_INSTANCE;
    public static final int OPEN_BUTTON_ACCESSIBILITY_TITLE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int REDIRECT_URI_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String title_ = "";
    private String redirectUri_ = "";
    private String openButtonAccessibilityTitle_ = "";

    static {
        GetContextualEntrypointCopyForJamResponse getContextualEntrypointCopyForJamResponse = new GetContextualEntrypointCopyForJamResponse();
        DEFAULT_INSTANCE = getContextualEntrypointCopyForJamResponse;
        AbstractC0269h.registerDefaultInstance(GetContextualEntrypointCopyForJamResponse.class, getContextualEntrypointCopyForJamResponse);
    }

    private GetContextualEntrypointCopyForJamResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"title_", "redirectUri_", "openButtonAccessibilityTitle_"});
        }
        if (iOrdinal == 3) {
            return new GetContextualEntrypointCopyForJamResponse();
        }
        if (iOrdinal == 4) {
            return new q610(DEFAULT_INSTANCE, 20);
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
        synchronized (GetContextualEntrypointCopyForJamResponse.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final String m20360n() {
        return this.openButtonAccessibilityTitle_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m20361o() {
        return this.redirectUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
