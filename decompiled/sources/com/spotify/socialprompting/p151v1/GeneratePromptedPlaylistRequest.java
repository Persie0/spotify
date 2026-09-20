package com.spotify.socialprompting.p151v1;

import com.google.protobuf.AbstractC0269h;
import p204p.cms0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.v010;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class GeneratePromptedPlaylistRequest extends AbstractC0269h implements sre0 {
    public static final int BLEND_ID_FIELD_NUMBER = 1;
    private static final GeneratePromptedPlaylistRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PROMPT_FIELD_NUMBER = 2;
    public static final int PROMPT_SOURCE_FIELD_NUMBER = 4;
    public static final int PROMPT_TITLE_FIELD_NUMBER = 3;
    private int promptSource_;
    private String blendId_ = "";
    private String prompt_ = "";
    private String promptTitle_ = "";

    static {
        GeneratePromptedPlaylistRequest generatePromptedPlaylistRequest = new GeneratePromptedPlaylistRequest();
        DEFAULT_INSTANCE = generatePromptedPlaylistRequest;
        AbstractC0269h.registerDefaultInstance(GeneratePromptedPlaylistRequest.class, generatePromptedPlaylistRequest);
    }

    private GeneratePromptedPlaylistRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21448n(GeneratePromptedPlaylistRequest generatePromptedPlaylistRequest, String str) {
        generatePromptedPlaylistRequest.getClass();
        str.getClass();
        generatePromptedPlaylistRequest.blendId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m21449o(GeneratePromptedPlaylistRequest generatePromptedPlaylistRequest, String str) {
        generatePromptedPlaylistRequest.getClass();
        str.getClass();
        generatePromptedPlaylistRequest.prompt_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m21450p(GeneratePromptedPlaylistRequest generatePromptedPlaylistRequest, cms0 cms0Var) {
        generatePromptedPlaylistRequest.getClass();
        generatePromptedPlaylistRequest.promptSource_ = cms0Var.getNumber();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21451q(GeneratePromptedPlaylistRequest generatePromptedPlaylistRequest, String str) {
        generatePromptedPlaylistRequest.getClass();
        str.getClass();
        generatePromptedPlaylistRequest.promptTitle_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static v010 m21452r() {
        return (v010) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f", new Object[]{"blendId_", "prompt_", "promptTitle_", "promptSource_"});
        }
        if (iOrdinal == 3) {
            return new GeneratePromptedPlaylistRequest();
        }
        if (iOrdinal == 4) {
            return new v010(DEFAULT_INSTANCE);
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
        synchronized (GeneratePromptedPlaylistRequest.class) {
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
