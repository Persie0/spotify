package com.spotify.p060dj.interactionmanager.p061v0;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.aux;
import p204p.gva;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class GetAckCommentaryAndPrepareRecsResponse extends AbstractC0269h implements GetAckCommentaryAndPrepareRecsResponseOrBuilder {
    public static final int ACK_COMMENTARY_TEXT_FIELD_NUMBER = 4;
    public static final int AUDIO_CDN_URL_FIELD_NUMBER = 3;
    private static final GetAckCommentaryAndPrepareRecsResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_CODE_FIELD_NUMBER = 1;
    public static final int STATUS_MESSAGE_FIELD_NUMBER = 2;
    private String statusCode_ = "";
    private String statusMessage_ = "";
    private String audioCdnUrl_ = "";
    private String ackCommentaryText_ = "";

    /* JADX INFO: renamed from: com.spotify.dj.interactionmanager.v0.GetAckCommentaryAndPrepareRecsResponse$1 */
    public static /* synthetic */ class C06951 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3575xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3575xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3575xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3575xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3575xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3575xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3575xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3575xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements GetAckCommentaryAndPrepareRecsResponseOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public final /* bridge */ /* synthetic */ pre0 build() {
            return build();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public final /* bridge */ /* synthetic */ pre0 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clear */
        public final /* bridge */ /* synthetic */ ore0 mo98325clear() {
            return mo98325clear();
        }

        public final Builder clearAckCommentaryText() {
            copyOnWrite();
            ((GetAckCommentaryAndPrepareRecsResponse) this.instance).clearAckCommentaryText();
            return this;
        }

        public final Builder clearAudioCdnUrl() {
            copyOnWrite();
            ((GetAckCommentaryAndPrepareRecsResponse) this.instance).clearAudioCdnUrl();
            return this;
        }

        public final Builder clearStatusCode() {
            copyOnWrite();
            ((GetAckCommentaryAndPrepareRecsResponse) this.instance).clearStatusCode();
            return this;
        }

        public final Builder clearStatusMessage() {
            copyOnWrite();
            ((GetAckCommentaryAndPrepareRecsResponse) this.instance).clearStatusMessage();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public final /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GetAckCommentaryAndPrepareRecsResponseOrBuilder
        public final String getAckCommentaryText() {
            return ((GetAckCommentaryAndPrepareRecsResponse) this.instance).getAckCommentaryText();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GetAckCommentaryAndPrepareRecsResponseOrBuilder
        public final gva getAckCommentaryTextBytes() {
            return ((GetAckCommentaryAndPrepareRecsResponse) this.instance).getAckCommentaryTextBytes();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GetAckCommentaryAndPrepareRecsResponseOrBuilder
        public final String getAudioCdnUrl() {
            return ((GetAckCommentaryAndPrepareRecsResponse) this.instance).getAudioCdnUrl();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GetAckCommentaryAndPrepareRecsResponseOrBuilder
        public final gva getAudioCdnUrlBytes() {
            return ((GetAckCommentaryAndPrepareRecsResponse) this.instance).getAudioCdnUrlBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GetAckCommentaryAndPrepareRecsResponseOrBuilder
        public final String getStatusCode() {
            return ((GetAckCommentaryAndPrepareRecsResponse) this.instance).getStatusCode();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GetAckCommentaryAndPrepareRecsResponseOrBuilder
        public final gva getStatusCodeBytes() {
            return ((GetAckCommentaryAndPrepareRecsResponse) this.instance).getStatusCodeBytes();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GetAckCommentaryAndPrepareRecsResponseOrBuilder
        public final String getStatusMessage() {
            return ((GetAckCommentaryAndPrepareRecsResponse) this.instance).getStatusMessage();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GetAckCommentaryAndPrepareRecsResponseOrBuilder
        public final gva getStatusMessageBytes() {
            return ((GetAckCommentaryAndPrepareRecsResponse) this.instance).getStatusMessageBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public final /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public final Builder setAckCommentaryText(String str) {
            copyOnWrite();
            ((GetAckCommentaryAndPrepareRecsResponse) this.instance).setAckCommentaryText(str);
            return this;
        }

        public final Builder setAckCommentaryTextBytes(gva gvaVar) {
            copyOnWrite();
            ((GetAckCommentaryAndPrepareRecsResponse) this.instance).setAckCommentaryTextBytes(gvaVar);
            return this;
        }

        public final Builder setAudioCdnUrl(String str) {
            copyOnWrite();
            ((GetAckCommentaryAndPrepareRecsResponse) this.instance).setAudioCdnUrl(str);
            return this;
        }

        public final Builder setAudioCdnUrlBytes(gva gvaVar) {
            copyOnWrite();
            ((GetAckCommentaryAndPrepareRecsResponse) this.instance).setAudioCdnUrlBytes(gvaVar);
            return this;
        }

        public final Builder setStatusCode(String str) {
            copyOnWrite();
            ((GetAckCommentaryAndPrepareRecsResponse) this.instance).setStatusCode(str);
            return this;
        }

        public final Builder setStatusCodeBytes(gva gvaVar) {
            copyOnWrite();
            ((GetAckCommentaryAndPrepareRecsResponse) this.instance).setStatusCodeBytes(gvaVar);
            return this;
        }

        public final Builder setStatusMessage(String str) {
            copyOnWrite();
            ((GetAckCommentaryAndPrepareRecsResponse) this.instance).setStatusMessage(str);
            return this;
        }

        public final Builder setStatusMessageBytes(gva gvaVar) {
            copyOnWrite();
            ((GetAckCommentaryAndPrepareRecsResponse) this.instance).setStatusMessageBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(GetAckCommentaryAndPrepareRecsResponse.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public final /* bridge */ /* synthetic */ ore0 mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
            return super.mo98372mergeFrom(inputStream, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
            return super.mo98373mergeFrom(gvaVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
            return super.mo98374mergeFrom(gvaVar, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
            return super.mo98375mergeFrom(oweVar);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public final /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        @Override // p204p.AbstractC2081l8, p204p.ore0
        public final /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
            return super.mergeFrom(pre0Var);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
            return super.mo98376mergeFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
            return super.mo98377mergeFrom(bArr, auxVar);
        }
    }

    static {
        GetAckCommentaryAndPrepareRecsResponse getAckCommentaryAndPrepareRecsResponse = new GetAckCommentaryAndPrepareRecsResponse();
        DEFAULT_INSTANCE = getAckCommentaryAndPrepareRecsResponse;
        AbstractC0269h.registerDefaultInstance(GetAckCommentaryAndPrepareRecsResponse.class, getAckCommentaryAndPrepareRecsResponse);
    }

    private GetAckCommentaryAndPrepareRecsResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAckCommentaryText() {
        this.ackCommentaryText_ = DEFAULT_INSTANCE.ackCommentaryText_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudioCdnUrl() {
        this.audioCdnUrl_ = DEFAULT_INSTANCE.audioCdnUrl_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatusCode() {
        this.statusCode_ = DEFAULT_INSTANCE.statusCode_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatusMessage() {
        this.statusMessage_ = DEFAULT_INSTANCE.statusMessage_;
    }

    public static GetAckCommentaryAndPrepareRecsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetAckCommentaryAndPrepareRecsResponse parseDelimitedFrom(InputStream inputStream) {
        return (GetAckCommentaryAndPrepareRecsResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetAckCommentaryAndPrepareRecsResponse parseFrom(ByteBuffer byteBuffer) {
        return (GetAckCommentaryAndPrepareRecsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAckCommentaryText(String str) {
        str.getClass();
        this.ackCommentaryText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAckCommentaryTextBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.ackCommentaryText_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioCdnUrl(String str) {
        str.getClass();
        this.audioCdnUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioCdnUrlBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.audioCdnUrl_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusCode(String str) {
        str.getClass();
        this.statusCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusCodeBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.statusCode_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusMessage(String str) {
        str.getClass();
        this.statusMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusMessageBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.statusMessage_ = gvaVar.m45892u();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"statusCode_", "statusMessage_", "audioCdnUrl_", "ackCommentaryText_"});
        }
        if (iOrdinal == 3) {
            return new GetAckCommentaryAndPrepareRecsResponse();
        }
        if (iOrdinal == 4) {
            return new Builder(0);
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
        synchronized (GetAckCommentaryAndPrepareRecsResponse.class) {
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

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GetAckCommentaryAndPrepareRecsResponseOrBuilder
    public final String getAckCommentaryText() {
        return this.ackCommentaryText_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GetAckCommentaryAndPrepareRecsResponseOrBuilder
    public final gva getAckCommentaryTextBytes() {
        return gva.m45888f(this.ackCommentaryText_);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GetAckCommentaryAndPrepareRecsResponseOrBuilder
    public final String getAudioCdnUrl() {
        return this.audioCdnUrl_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GetAckCommentaryAndPrepareRecsResponseOrBuilder
    public final gva getAudioCdnUrlBytes() {
        return gva.m45888f(this.audioCdnUrl_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GetAckCommentaryAndPrepareRecsResponseOrBuilder
    public final String getStatusCode() {
        return this.statusCode_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GetAckCommentaryAndPrepareRecsResponseOrBuilder
    public final gva getStatusCodeBytes() {
        return gva.m45888f(this.statusCode_);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GetAckCommentaryAndPrepareRecsResponseOrBuilder
    public final String getStatusMessage() {
        return this.statusMessage_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GetAckCommentaryAndPrepareRecsResponseOrBuilder
    public final gva getStatusMessageBytes() {
        return gva.m45888f(this.statusMessage_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(GetAckCommentaryAndPrepareRecsResponse getAckCommentaryAndPrepareRecsResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getAckCommentaryAndPrepareRecsResponse);
    }

    public static GetAckCommentaryAndPrepareRecsResponse parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (GetAckCommentaryAndPrepareRecsResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetAckCommentaryAndPrepareRecsResponse parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (GetAckCommentaryAndPrepareRecsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static GetAckCommentaryAndPrepareRecsResponse parseFrom(gva gvaVar) {
        return (GetAckCommentaryAndPrepareRecsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static GetAckCommentaryAndPrepareRecsResponse parseFrom(gva gvaVar, aux auxVar) {
        return (GetAckCommentaryAndPrepareRecsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static GetAckCommentaryAndPrepareRecsResponse parseFrom(byte[] bArr) {
        return (GetAckCommentaryAndPrepareRecsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetAckCommentaryAndPrepareRecsResponse parseFrom(byte[] bArr, aux auxVar) {
        return (GetAckCommentaryAndPrepareRecsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static GetAckCommentaryAndPrepareRecsResponse parseFrom(InputStream inputStream) {
        return (GetAckCommentaryAndPrepareRecsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetAckCommentaryAndPrepareRecsResponse parseFrom(InputStream inputStream, aux auxVar) {
        return (GetAckCommentaryAndPrepareRecsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetAckCommentaryAndPrepareRecsResponse parseFrom(owe oweVar) {
        return (GetAckCommentaryAndPrepareRecsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static GetAckCommentaryAndPrepareRecsResponse parseFrom(owe oweVar, aux auxVar) {
        return (GetAckCommentaryAndPrepareRecsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
