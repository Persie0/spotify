package com.spotify.list_collection.save_source.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cv31;
import p204p.f7y0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class SaveSource extends AbstractC0269h implements sre0 {
    private static final SaveSource DEFAULT_INSTANCE;
    public static final int INTERACTION_ID_FIELD_NUMBER = 2;
    public static final int ORIGINAL_URI_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SOURCE_TOOL_FIELD_NUMBER = 3;
    private int bitField0_;
    private int sourceTool_;
    private String originalUri_ = "";
    private String interactionId_ = "";

    static {
        SaveSource saveSource = new SaveSource();
        DEFAULT_INSTANCE = saveSource;
        AbstractC0269h.registerDefaultInstance(SaveSource.class, saveSource);
    }

    private SaveSource() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12899n(SaveSource saveSource, String str) {
        saveSource.getClass();
        str.getClass();
        saveSource.bitField0_ |= 2;
        saveSource.interactionId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static SaveSource m12900o() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static f7y0 m12901q() {
        return (f7y0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: r */
    public static f7y0 m12902r(SaveSource saveSource) {
        return (f7y0) DEFAULT_INSTANCE.createBuilder(saveSource);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဌ\u0002", new Object[]{"bitField0_", "originalUri_", "interactionId_", "sourceTool_"});
        }
        if (iOrdinal == 3) {
            return new SaveSource();
        }
        if (iOrdinal == 4) {
            return new f7y0(DEFAULT_INSTANCE);
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
        synchronized (SaveSource.class) {
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

    /* JADX INFO: renamed from: p */
    public final cv31 m12903p() {
        cv31 cv31Var;
        int i = this.sourceTool_;
        if (i == 0) {
            cv31Var = cv31.SOURCE_TOOL_UNSPECIFIED;
        } else if (i != 1) {
            cv31Var = i != 2 ? null : cv31.SOURCE_TOOL_STUDIO_AGENT;
        } else {
            cv31Var = cv31.SOURCE_TOOL_PROMPT;
        }
        return cv31Var == null ? cv31.UNRECOGNIZED : cv31Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
