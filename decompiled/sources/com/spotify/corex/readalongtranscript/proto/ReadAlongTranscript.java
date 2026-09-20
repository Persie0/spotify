package com.spotify.corex.readalongtranscript.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.po71;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.u6u0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ReadAlongTranscript extends AbstractC0269h implements sre0 {
    public static final int AD_COMPRESSED_FIELD_NUMBER = 12;
    public static final int COLOUR_DATA_FIELD_NUMBER = 7;
    public static final int CREATOR_PROVIDED_FIELD_NUMBER = 13;
    private static final ReadAlongTranscript DEFAULT_INSTANCE;
    public static final int EPISODE_NAME_FIELD_NUMBER = 9;
    public static final int EPISODE_URI_FIELD_NUMBER = 2;
    public static final int ISSHAREBUTTONVISIBLE_FIELD_NUMBER = 10;
    public static final int LANGUAGE_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PUBLISHED_AT_FIELD_NUMBER = 4;
    public static final int SECTION_FIELD_NUMBER = 6;
    public static final int SHOW_NAME_FIELD_NUMBER = 8;
    public static final int TIME_SYNCED_STATUS_FIELD_NUMBER = 11;
    public static final int TRANSCRIPT_URI_FIELD_NUMBER = 3;
    public static final int VERSION_FIELD_NUMBER = 1;
    private boolean adCompressed_;
    private int bitField0_;
    private ColourData colourData_;
    private boolean creatorProvided_;
    private boolean isShareButtonVisible_;
    private int timeSyncedStatus_;
    private String version_ = "";
    private String episodeUri_ = "";
    private String transcriptUri_ = "";
    private String publishedAt_ = "";
    private String language_ = "";
    private ae50 section_ = AbstractC0269h.emptyProtobufList();
    private String showName_ = "";
    private String episodeName_ = "";

    static {
        ReadAlongTranscript readAlongTranscript = new ReadAlongTranscript();
        DEFAULT_INSTANCE = readAlongTranscript;
        AbstractC0269h.registerDefaultInstance(ReadAlongTranscript.class, readAlongTranscript);
    }

    private ReadAlongTranscript() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: w */
    public static ReadAlongTranscript m8098w(byte[] bArr) {
        return (ReadAlongTranscript) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u001b\u0007ဉ\u0000\bȈ\tȈ\n\u0007\u000b\f\f\u0007\r\u0007", new Object[]{"bitField0_", "version_", "episodeUri_", "transcriptUri_", "publishedAt_", "language_", "section_", Section.class, "colourData_", "showName_", "episodeName_", "isShareButtonVisible_", "timeSyncedStatus_", "adCompressed_", "creatorProvided_"});
        }
        if (iOrdinal == 3) {
            return new ReadAlongTranscript();
        }
        if (iOrdinal == 4) {
            return new u6u0(DEFAULT_INSTANCE, 11);
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
        synchronized (ReadAlongTranscript.class) {
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

    public final String getLanguage() {
        return this.language_;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m8099n() {
        return this.adCompressed_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ColourData m8100o() {
        ColourData colourData = this.colourData_;
        return colourData == null ? ColourData.m8057o() : colourData;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m8101p() {
        return this.creatorProvided_;
    }

    /* JADX INFO: renamed from: q */
    public final String m8102q() {
        return this.episodeName_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m8103r() {
        return this.isShareButtonVisible_;
    }

    /* JADX INFO: renamed from: s */
    public final ae50 m8104s() {
        return this.section_;
    }

    /* JADX INFO: renamed from: t */
    public final String m8105t() {
        return this.showName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final po71 m8106u() {
        po71 po71Var;
        int i = this.timeSyncedStatus_;
        if (i == 0) {
            po71Var = po71.UNKNOWN;
        } else if (i == 1) {
            po71Var = po71.STATIC;
        } else if (i != 2) {
            po71Var = i != 3 ? null : po71.SENTENCE_SYNCED;
        } else {
            po71Var = po71.SYLLABLE_SYNCED;
        }
        return po71Var == null ? po71.UNRECOGNIZED : po71Var;
    }

    /* JADX INFO: renamed from: v */
    public final String m8107v() {
        return this.transcriptUri_;
    }
}
