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

/* JADX INFO: loaded from: classes.dex */
public final class GenerateAndPlayRecsRequest extends AbstractC0269h implements GenerateAndPlayRecsRequestOrBuilder {
    public static final int ACK_COMMENTARY_TEXT_FIELD_NUMBER = 6;
    public static final int CURRENT_SEGMENT_ID_FIELD_NUMBER = 4;
    public static final int CURRENT_TRACK_URI_FIELD_NUMBER = 5;
    private static final GenerateAndPlayRecsRequest DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PROMPT_FIELD_NUMBER = 1;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    private String prompt_ = "";
    private String sessionId_ = "";
    private String deviceId_ = "";
    private String currentSegmentId_ = "";
    private String currentTrackUri_ = "";
    private String ackCommentaryText_ = "";

    /* JADX INFO: renamed from: com.spotify.dj.interactionmanager.v0.GenerateAndPlayRecsRequest$1 */
    /* JADX INFO: loaded from: classes6.dex */
    public static /* synthetic */ class C06921 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3572xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3572xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3572xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3572xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3572xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3572xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3572xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3572xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder extends AbstractC0268g implements GenerateAndPlayRecsRequestOrBuilder {
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
            ((GenerateAndPlayRecsRequest) this.instance).clearAckCommentaryText();
            return this;
        }

        public final Builder clearCurrentSegmentId() {
            copyOnWrite();
            ((GenerateAndPlayRecsRequest) this.instance).clearCurrentSegmentId();
            return this;
        }

        public final Builder clearCurrentTrackUri() {
            copyOnWrite();
            ((GenerateAndPlayRecsRequest) this.instance).clearCurrentTrackUri();
            return this;
        }

        public final Builder clearDeviceId() {
            copyOnWrite();
            ((GenerateAndPlayRecsRequest) this.instance).clearDeviceId();
            return this;
        }

        public final Builder clearPrompt() {
            copyOnWrite();
            ((GenerateAndPlayRecsRequest) this.instance).clearPrompt();
            return this;
        }

        public final Builder clearSessionId() {
            copyOnWrite();
            ((GenerateAndPlayRecsRequest) this.instance).clearSessionId();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public final /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsRequestOrBuilder
        public final String getAckCommentaryText() {
            return ((GenerateAndPlayRecsRequest) this.instance).getAckCommentaryText();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsRequestOrBuilder
        public final gva getAckCommentaryTextBytes() {
            return ((GenerateAndPlayRecsRequest) this.instance).getAckCommentaryTextBytes();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsRequestOrBuilder
        public final String getCurrentSegmentId() {
            return ((GenerateAndPlayRecsRequest) this.instance).getCurrentSegmentId();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsRequestOrBuilder
        public final gva getCurrentSegmentIdBytes() {
            return ((GenerateAndPlayRecsRequest) this.instance).getCurrentSegmentIdBytes();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsRequestOrBuilder
        public final String getCurrentTrackUri() {
            return ((GenerateAndPlayRecsRequest) this.instance).getCurrentTrackUri();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsRequestOrBuilder
        public final gva getCurrentTrackUriBytes() {
            return ((GenerateAndPlayRecsRequest) this.instance).getCurrentTrackUriBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsRequestOrBuilder
        public final String getDeviceId() {
            return ((GenerateAndPlayRecsRequest) this.instance).getDeviceId();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsRequestOrBuilder
        public final gva getDeviceIdBytes() {
            return ((GenerateAndPlayRecsRequest) this.instance).getDeviceIdBytes();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsRequestOrBuilder
        public final String getPrompt() {
            return ((GenerateAndPlayRecsRequest) this.instance).getPrompt();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsRequestOrBuilder
        public final gva getPromptBytes() {
            return ((GenerateAndPlayRecsRequest) this.instance).getPromptBytes();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsRequestOrBuilder
        public final String getSessionId() {
            return ((GenerateAndPlayRecsRequest) this.instance).getSessionId();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsRequestOrBuilder
        public final gva getSessionIdBytes() {
            return ((GenerateAndPlayRecsRequest) this.instance).getSessionIdBytes();
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
            ((GenerateAndPlayRecsRequest) this.instance).setAckCommentaryText(str);
            return this;
        }

        public final Builder setAckCommentaryTextBytes(gva gvaVar) {
            copyOnWrite();
            ((GenerateAndPlayRecsRequest) this.instance).setAckCommentaryTextBytes(gvaVar);
            return this;
        }

        public final Builder setCurrentSegmentId(String str) {
            copyOnWrite();
            ((GenerateAndPlayRecsRequest) this.instance).setCurrentSegmentId(str);
            return this;
        }

        public final Builder setCurrentSegmentIdBytes(gva gvaVar) {
            copyOnWrite();
            ((GenerateAndPlayRecsRequest) this.instance).setCurrentSegmentIdBytes(gvaVar);
            return this;
        }

        public final Builder setCurrentTrackUri(String str) {
            copyOnWrite();
            ((GenerateAndPlayRecsRequest) this.instance).setCurrentTrackUri(str);
            return this;
        }

        public final Builder setCurrentTrackUriBytes(gva gvaVar) {
            copyOnWrite();
            ((GenerateAndPlayRecsRequest) this.instance).setCurrentTrackUriBytes(gvaVar);
            return this;
        }

        public final Builder setDeviceId(String str) {
            copyOnWrite();
            ((GenerateAndPlayRecsRequest) this.instance).setDeviceId(str);
            return this;
        }

        public final Builder setDeviceIdBytes(gva gvaVar) {
            copyOnWrite();
            ((GenerateAndPlayRecsRequest) this.instance).setDeviceIdBytes(gvaVar);
            return this;
        }

        public final Builder setPrompt(String str) {
            copyOnWrite();
            ((GenerateAndPlayRecsRequest) this.instance).setPrompt(str);
            return this;
        }

        public final Builder setPromptBytes(gva gvaVar) {
            copyOnWrite();
            ((GenerateAndPlayRecsRequest) this.instance).setPromptBytes(gvaVar);
            return this;
        }

        public final Builder setSessionId(String str) {
            copyOnWrite();
            ((GenerateAndPlayRecsRequest) this.instance).setSessionId(str);
            return this;
        }

        public final Builder setSessionIdBytes(gva gvaVar) {
            copyOnWrite();
            ((GenerateAndPlayRecsRequest) this.instance).setSessionIdBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(GenerateAndPlayRecsRequest.DEFAULT_INSTANCE);
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
        GenerateAndPlayRecsRequest generateAndPlayRecsRequest = new GenerateAndPlayRecsRequest();
        DEFAULT_INSTANCE = generateAndPlayRecsRequest;
        AbstractC0269h.registerDefaultInstance(GenerateAndPlayRecsRequest.class, generateAndPlayRecsRequest);
    }

    private GenerateAndPlayRecsRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAckCommentaryText() {
        this.ackCommentaryText_ = DEFAULT_INSTANCE.ackCommentaryText_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentSegmentId() {
        this.currentSegmentId_ = DEFAULT_INSTANCE.currentSegmentId_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentTrackUri() {
        this.currentTrackUri_ = DEFAULT_INSTANCE.currentTrackUri_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceId() {
        this.deviceId_ = DEFAULT_INSTANCE.deviceId_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrompt() {
        this.prompt_ = DEFAULT_INSTANCE.prompt_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = DEFAULT_INSTANCE.sessionId_;
    }

    public static GenerateAndPlayRecsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GenerateAndPlayRecsRequest parseDelimitedFrom(InputStream inputStream) {
        return (GenerateAndPlayRecsRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GenerateAndPlayRecsRequest parseFrom(ByteBuffer byteBuffer) {
        return (GenerateAndPlayRecsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setCurrentSegmentId(String str) {
        str.getClass();
        this.currentSegmentId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentSegmentIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.currentSegmentId_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentTrackUri(String str) {
        str.getClass();
        this.currentTrackUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentTrackUriBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.currentTrackUri_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceId(String str) {
        str.getClass();
        this.deviceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.deviceId_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrompt(String str) {
        str.getClass();
        this.prompt_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromptBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.prompt_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.sessionId_ = gvaVar.m45892u();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"prompt_", "sessionId_", "deviceId_", "currentSegmentId_", "currentTrackUri_", "ackCommentaryText_"});
        }
        if (iOrdinal == 3) {
            return new GenerateAndPlayRecsRequest();
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
        synchronized (GenerateAndPlayRecsRequest.class) {
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

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsRequestOrBuilder
    public final String getAckCommentaryText() {
        return this.ackCommentaryText_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsRequestOrBuilder
    public final gva getAckCommentaryTextBytes() {
        return gva.m45888f(this.ackCommentaryText_);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsRequestOrBuilder
    public final String getCurrentSegmentId() {
        return this.currentSegmentId_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsRequestOrBuilder
    public final gva getCurrentSegmentIdBytes() {
        return gva.m45888f(this.currentSegmentId_);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsRequestOrBuilder
    public final String getCurrentTrackUri() {
        return this.currentTrackUri_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsRequestOrBuilder
    public final gva getCurrentTrackUriBytes() {
        return gva.m45888f(this.currentTrackUri_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsRequestOrBuilder
    public final String getDeviceId() {
        return this.deviceId_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsRequestOrBuilder
    public final gva getDeviceIdBytes() {
        return gva.m45888f(this.deviceId_);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsRequestOrBuilder
    public final String getPrompt() {
        return this.prompt_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsRequestOrBuilder
    public final gva getPromptBytes() {
        return gva.m45888f(this.prompt_);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsRequestOrBuilder
    public final String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsRequestOrBuilder
    public final gva getSessionIdBytes() {
        return gva.m45888f(this.sessionId_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(GenerateAndPlayRecsRequest generateAndPlayRecsRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(generateAndPlayRecsRequest);
    }

    public static GenerateAndPlayRecsRequest parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (GenerateAndPlayRecsRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GenerateAndPlayRecsRequest parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (GenerateAndPlayRecsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static GenerateAndPlayRecsRequest parseFrom(gva gvaVar) {
        return (GenerateAndPlayRecsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static GenerateAndPlayRecsRequest parseFrom(gva gvaVar, aux auxVar) {
        return (GenerateAndPlayRecsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static GenerateAndPlayRecsRequest parseFrom(byte[] bArr) {
        return (GenerateAndPlayRecsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GenerateAndPlayRecsRequest parseFrom(byte[] bArr, aux auxVar) {
        return (GenerateAndPlayRecsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static GenerateAndPlayRecsRequest parseFrom(InputStream inputStream) {
        return (GenerateAndPlayRecsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GenerateAndPlayRecsRequest parseFrom(InputStream inputStream, aux auxVar) {
        return (GenerateAndPlayRecsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GenerateAndPlayRecsRequest parseFrom(owe oweVar) {
        return (GenerateAndPlayRecsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static GenerateAndPlayRecsRequest parseFrom(owe oweVar, aux auxVar) {
        return (GenerateAndPlayRecsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
