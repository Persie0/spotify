package com.spotify.promptablesection;

import com.google.protobuf.AbstractC0269h;
import p204p.c8s0;
import p204p.i9z0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x8z0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class PromptableSectionListAttributes extends AbstractC0269h implements sre0 {
    private static final PromptableSectionListAttributes DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 4;
    public static final int GENERATION_ID_FIELD_NUMBER = 5;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int PROMPT_FIELD_NUMBER = 1;
    public static final int SECTION_TYPE_FIELD_NUMBER = 3;
    public static final int STATE_FIELD_NUMBER = 2;
    private int bitField0_;
    private SectionError error_;
    private int sectionType_;
    private int state_;
    private String prompt_ = "";
    private String generationId_ = "";
    private String navigationUri_ = "";

    static {
        PromptableSectionListAttributes promptableSectionListAttributes = new PromptableSectionListAttributes();
        DEFAULT_INSTANCE = promptableSectionListAttributes;
        AbstractC0269h.registerDefaultInstance(PromptableSectionListAttributes.class, promptableSectionListAttributes);
    }

    private PromptableSectionListAttributes() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: t */
    public static PromptableSectionListAttributes m19917t(byte[] bArr) {
        return (PromptableSectionListAttributes) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ለ\u0000\u0002\f\u0003\f\u0004ဉ\u0001\u0005Ȉ\u0006ለ\u0002", new Object[]{"bitField0_", "prompt_", "state_", "sectionType_", "error_", "generationId_", "navigationUri_"});
        }
        if (iOrdinal == 3) {
            return new PromptableSectionListAttributes();
        }
        if (iOrdinal == 4) {
            return new c8s0(DEFAULT_INSTANCE, 13);
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
        synchronized (PromptableSectionListAttributes.class) {
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

    /* JADX INFO: renamed from: n */
    public final SectionError m19918n() {
        SectionError sectionError = this.error_;
        return sectionError == null ? SectionError.m19924n() : sectionError;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m19919o() {
        return this.generationId_;
    }

    /* JADX INFO: renamed from: p */
    public final String m19920p() {
        return this.navigationUri_;
    }

    /* JADX INFO: renamed from: q */
    public final i9z0 m19921q() {
        i9z0 i9z0Var;
        int i = this.sectionType_;
        if (i == 0) {
            i9z0Var = i9z0.SECTION_TYPE_UNDEFINED;
        } else if (i != 1) {
            i9z0Var = i != 2 ? null : i9z0.SECTION_TYPE_MDC;
        } else {
            i9z0Var = i9z0.SECTION_TYPE_CAROUSEL;
        }
        return i9z0Var == null ? i9z0.UNRECOGNIZED : i9z0Var;
    }

    /* JADX INFO: renamed from: r */
    public final x8z0 m19922r() {
        x8z0 x8z0Var;
        int i = this.state_;
        if (i == 0) {
            x8z0Var = x8z0.SECTION_STATE_UNDEFINED;
        } else if (i == 1) {
            x8z0Var = x8z0.SECTION_STATE_EMPTY;
        } else if (i == 2) {
            x8z0Var = x8z0.SECTION_STATE_IN_PROGRESS;
        } else if (i != 3) {
            x8z0Var = i != 4 ? null : x8z0.SECTION_STATE_DELETED;
        } else {
            x8z0Var = x8z0.SECTION_STATE_POPULATED;
        }
        return x8z0Var == null ? x8z0.UNRECOGNIZED : x8z0Var;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m19923s() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
