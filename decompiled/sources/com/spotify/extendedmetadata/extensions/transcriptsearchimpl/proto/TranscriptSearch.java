package com.spotify.extendedmetadata.extensions.transcriptsearchimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.p981;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class TranscriptSearch extends AbstractC0269h implements sre0 {
    private static final TranscriptSearch DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SCRIPT_CODE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String languageCode_ = "";
    private String scriptCode_ = "";

    static {
        TranscriptSearch transcriptSearch = new TranscriptSearch();
        DEFAULT_INSTANCE = transcriptSearch;
        AbstractC0269h.registerDefaultInstance(TranscriptSearch.class, transcriptSearch);
    }

    private TranscriptSearch() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static TranscriptSearch m10492q(byte[] bArr) {
        return (TranscriptSearch) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000", new Object[]{"bitField0_", "languageCode_", "scriptCode_"});
        }
        if (iOrdinal == 3) {
            return new TranscriptSearch();
        }
        if (iOrdinal == 4) {
            return new p981(DEFAULT_INSTANCE, 24);
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
        synchronized (TranscriptSearch.class) {
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
    public final String m10493n() {
        return this.languageCode_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m10494o() {
        return this.scriptCode_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m10495p() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
