package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.r610;
import p204p.sre0;
import p204p.yl6;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class GetAudiobookConsiderationRequest extends AbstractC0269h implements sre0 {
    public static final int ASTRO_ON_TYPE_FIELD_NUMBER = 2;
    private static final GetAudiobookConsiderationRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 1;
    private int astroOnType_;
    private String payload_ = "";

    static {
        GetAudiobookConsiderationRequest getAudiobookConsiderationRequest = new GetAudiobookConsiderationRequest();
        DEFAULT_INSTANCE = getAudiobookConsiderationRequest;
        AbstractC0269h.registerDefaultInstance(GetAudiobookConsiderationRequest.class, getAudiobookConsiderationRequest);
    }

    private GetAudiobookConsiderationRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16455n(GetAudiobookConsiderationRequest getAudiobookConsiderationRequest, yl6 yl6Var) {
        getAudiobookConsiderationRequest.getClass();
        getAudiobookConsiderationRequest.astroOnType_ = yl6Var.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m16456o(GetAudiobookConsiderationRequest getAudiobookConsiderationRequest) {
        getAudiobookConsiderationRequest.getClass();
        getAudiobookConsiderationRequest.payload_ = "yeet";
    }

    /* JADX INFO: renamed from: p */
    public static r610 m16457p() {
        return (r610) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"payload_", "astroOnType_"});
        }
        if (iOrdinal == 3) {
            return new GetAudiobookConsiderationRequest();
        }
        if (iOrdinal == 4) {
            return new r610(DEFAULT_INSTANCE);
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
        synchronized (GetAudiobookConsiderationRequest.class) {
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
