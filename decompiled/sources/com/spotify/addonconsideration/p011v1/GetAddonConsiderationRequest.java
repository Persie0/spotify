package com.spotify.addonconsideration.p011v1;

import com.google.protobuf.AbstractC0269h;
import p204p.g610;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class GetAddonConsiderationRequest extends AbstractC0269h implements sre0 {
    public static final int CONSIDERATION_PAGE_IDENTIFIER_FIELD_NUMBER = 1;
    public static final int CONSIDERATION_PAGE_INTENT_FIELD_NUMBER = 2;
    public static final int CONSIDERATION_PAGE_REASON_FIELD_NUMBER = 3;
    private static final GetAddonConsiderationRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private String considerationPageIdentifier_ = "";
    private String considerationPageIntent_ = "";
    private String considerationPageReason_ = "";

    static {
        GetAddonConsiderationRequest getAddonConsiderationRequest = new GetAddonConsiderationRequest();
        DEFAULT_INSTANCE = getAddonConsiderationRequest;
        AbstractC0269h.registerDefaultInstance(GetAddonConsiderationRequest.class, getAddonConsiderationRequest);
    }

    private GetAddonConsiderationRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2318n(GetAddonConsiderationRequest getAddonConsiderationRequest, String str) {
        getAddonConsiderationRequest.getClass();
        str.getClass();
        getAddonConsiderationRequest.considerationPageIdentifier_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m2319o(GetAddonConsiderationRequest getAddonConsiderationRequest, String str) {
        getAddonConsiderationRequest.getClass();
        str.getClass();
        getAddonConsiderationRequest.considerationPageIntent_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m2320p(GetAddonConsiderationRequest getAddonConsiderationRequest, String str) {
        getAddonConsiderationRequest.getClass();
        str.getClass();
        getAddonConsiderationRequest.considerationPageReason_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static g610 m2321q() {
        return (g610) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"considerationPageIdentifier_", "considerationPageIntent_", "considerationPageReason_"});
        }
        if (iOrdinal == 3) {
            return new GetAddonConsiderationRequest();
        }
        if (iOrdinal == 4) {
            return new g610(DEFAULT_INSTANCE);
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
        synchronized (GetAddonConsiderationRequest.class) {
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
