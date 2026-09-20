package com.spotify.lexicon.p094dj.p095v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wzl;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class DJPersona extends AbstractC0269h implements sre0 {
    private static final DJPersona DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 1;
    public static final int INTERACTIVITY_JUMP_FIELD_NUMBER = 6;
    public static final int INTERACTIVITY_TITLE_FIELD_NUMBER = 5;
    public static final int LANGUAGE_NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PERSONA_ID_FIELD_NUMBER = 4;
    public static final int PERSONA_NAME_FIELD_NUMBER = 3;
    public static final int SWITCH_TO_LABEL_FIELD_NUMBER = 8;
    public static final int UP_NEXT_DESCRIPTION_FIELD_NUMBER = 7;
    private String displayName_ = "";
    private String languageName_ = "";
    private String personaName_ = "";
    private String personaId_ = "";
    private String interactivityTitle_ = "";
    private String interactivityJump_ = "";
    private String upNextDescription_ = "";
    private String switchToLabel_ = "";

    static {
        DJPersona dJPersona = new DJPersona();
        DEFAULT_INSTANCE = dJPersona;
        AbstractC0269h.registerDefaultInstance(DJPersona.class, dJPersona);
    }

    private DJPersona() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ", new Object[]{"displayName_", "languageName_", "personaName_", "personaId_", "interactivityTitle_", "interactivityJump_", "upNextDescription_", "switchToLabel_"});
        }
        if (iOrdinal == 3) {
            return new DJPersona();
        }
        if (iOrdinal == 4) {
            return new wzl(DEFAULT_INSTANCE, 6);
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
        synchronized (DJPersona.class) {
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

    public final String getDisplayName() {
        return this.displayName_;
    }

    /* JADX INFO: renamed from: n */
    public final String m12587n() {
        return this.interactivityJump_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m12588o() {
        return this.interactivityTitle_;
    }

    /* JADX INFO: renamed from: p */
    public final String m12589p() {
        return this.languageName_;
    }

    /* JADX INFO: renamed from: q */
    public final String m12590q() {
        return this.personaId_;
    }

    /* JADX INFO: renamed from: r */
    public final String m12591r() {
        return this.personaName_;
    }

    /* JADX INFO: renamed from: s */
    public final String m12592s() {
        return this.switchToLabel_;
    }

    /* JADX INFO: renamed from: t */
    public final String m12593t() {
        return this.upNextDescription_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
