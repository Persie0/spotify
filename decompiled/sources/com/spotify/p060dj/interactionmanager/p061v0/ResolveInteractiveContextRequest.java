package com.spotify.p060dj.interactionmanager.p061v0;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.aux;
import p204p.gva;
import p204p.od50;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.rd50;
import p204p.sd50;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class ResolveInteractiveContextRequest extends AbstractC0269h implements ResolveInteractiveContextRequestOrBuilder {
    public static final int CURRENT_SEGMENT_ID_FIELD_NUMBER = 4;
    public static final int CURRENT_TRACK_URI_FIELD_NUMBER = 7;
    private static final ResolveInteractiveContextRequest DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 3;
    public static final int INPUT_TYPE_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int PROMPT_FIELD_NUMBER = 1;
    public static final int REASON_FIELD_NUMBER = 6;
    public static final int RETRIES_LEFT_FIELD_NUMBER = 5;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    private int inputType_;
    private int reason_;
    private String prompt_ = "";
    private String sessionId_ = "";
    private String deviceId_ = "";
    private String currentSegmentId_ = "";
    private String retriesLeft_ = "";
    private String currentTrackUri_ = "";

    /* JADX INFO: renamed from: com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextRequest$1 */
    /* JADX INFO: loaded from: classes6.dex */
    public static /* synthetic */ class C07001 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3578xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3578xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3578xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3578xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3578xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3578xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3578xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3578xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder extends AbstractC0268g implements ResolveInteractiveContextRequestOrBuilder {
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

        public final Builder clearCurrentSegmentId() {
            copyOnWrite();
            ((ResolveInteractiveContextRequest) this.instance).clearCurrentSegmentId();
            return this;
        }

        public final Builder clearCurrentTrackUri() {
            copyOnWrite();
            ((ResolveInteractiveContextRequest) this.instance).clearCurrentTrackUri();
            return this;
        }

        public final Builder clearDeviceId() {
            copyOnWrite();
            ((ResolveInteractiveContextRequest) this.instance).clearDeviceId();
            return this;
        }

        public final Builder clearInputType() {
            copyOnWrite();
            ResolveInteractiveContextRequest.m9469q((ResolveInteractiveContextRequest) this.instance);
            return this;
        }

        public final Builder clearPrompt() {
            copyOnWrite();
            ((ResolveInteractiveContextRequest) this.instance).clearPrompt();
            return this;
        }

        public final Builder clearReason() {
            copyOnWrite();
            ResolveInteractiveContextRequest.m9471s((ResolveInteractiveContextRequest) this.instance);
            return this;
        }

        public final Builder clearRetriesLeft() {
            copyOnWrite();
            ((ResolveInteractiveContextRequest) this.instance).clearRetriesLeft();
            return this;
        }

        public final Builder clearSessionId() {
            copyOnWrite();
            ((ResolveInteractiveContextRequest) this.instance).clearSessionId();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public final /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
        public final String getCurrentSegmentId() {
            return ((ResolveInteractiveContextRequest) this.instance).getCurrentSegmentId();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
        public final gva getCurrentSegmentIdBytes() {
            return ((ResolveInteractiveContextRequest) this.instance).getCurrentSegmentIdBytes();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
        public final String getCurrentTrackUri() {
            return ((ResolveInteractiveContextRequest) this.instance).getCurrentTrackUri();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
        public final gva getCurrentTrackUriBytes() {
            return ((ResolveInteractiveContextRequest) this.instance).getCurrentTrackUriBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
        public final String getDeviceId() {
            return ((ResolveInteractiveContextRequest) this.instance).getDeviceId();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
        public final gva getDeviceIdBytes() {
            return ((ResolveInteractiveContextRequest) this.instance).getDeviceIdBytes();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
        public final PromptInputType getInputType() {
            return ((ResolveInteractiveContextRequest) this.instance).getInputType();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
        public final int getInputTypeValue() {
            return ((ResolveInteractiveContextRequest) this.instance).getInputTypeValue();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
        public final String getPrompt() {
            return ((ResolveInteractiveContextRequest) this.instance).getPrompt();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
        public final gva getPromptBytes() {
            return ((ResolveInteractiveContextRequest) this.instance).getPromptBytes();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
        public final RequestSubmissionReason getReason() {
            return ((ResolveInteractiveContextRequest) this.instance).getReason();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
        public final int getReasonValue() {
            return ((ResolveInteractiveContextRequest) this.instance).getReasonValue();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
        public final String getRetriesLeft() {
            return ((ResolveInteractiveContextRequest) this.instance).getRetriesLeft();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
        public final gva getRetriesLeftBytes() {
            return ((ResolveInteractiveContextRequest) this.instance).getRetriesLeftBytes();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
        public final String getSessionId() {
            return ((ResolveInteractiveContextRequest) this.instance).getSessionId();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
        public final gva getSessionIdBytes() {
            return ((ResolveInteractiveContextRequest) this.instance).getSessionIdBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public final /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public final Builder setCurrentSegmentId(String str) {
            copyOnWrite();
            ((ResolveInteractiveContextRequest) this.instance).setCurrentSegmentId(str);
            return this;
        }

        public final Builder setCurrentSegmentIdBytes(gva gvaVar) {
            copyOnWrite();
            ((ResolveInteractiveContextRequest) this.instance).setCurrentSegmentIdBytes(gvaVar);
            return this;
        }

        public final Builder setCurrentTrackUri(String str) {
            copyOnWrite();
            ((ResolveInteractiveContextRequest) this.instance).setCurrentTrackUri(str);
            return this;
        }

        public final Builder setCurrentTrackUriBytes(gva gvaVar) {
            copyOnWrite();
            ((ResolveInteractiveContextRequest) this.instance).setCurrentTrackUriBytes(gvaVar);
            return this;
        }

        public final Builder setDeviceId(String str) {
            copyOnWrite();
            ((ResolveInteractiveContextRequest) this.instance).setDeviceId(str);
            return this;
        }

        public final Builder setDeviceIdBytes(gva gvaVar) {
            copyOnWrite();
            ((ResolveInteractiveContextRequest) this.instance).setDeviceIdBytes(gvaVar);
            return this;
        }

        public final Builder setInputType(PromptInputType promptInputType) {
            copyOnWrite();
            ((ResolveInteractiveContextRequest) this.instance).setInputType(promptInputType);
            return this;
        }

        public final Builder setInputTypeValue(int i) {
            copyOnWrite();
            ResolveInteractiveContextRequest.m9456C((ResolveInteractiveContextRequest) this.instance, i);
            return this;
        }

        public final Builder setPrompt(String str) {
            copyOnWrite();
            ((ResolveInteractiveContextRequest) this.instance).setPrompt(str);
            return this;
        }

        public final Builder setPromptBytes(gva gvaVar) {
            copyOnWrite();
            ((ResolveInteractiveContextRequest) this.instance).setPromptBytes(gvaVar);
            return this;
        }

        public final Builder setReason(RequestSubmissionReason requestSubmissionReason) {
            copyOnWrite();
            ((ResolveInteractiveContextRequest) this.instance).setReason(requestSubmissionReason);
            return this;
        }

        public final Builder setReasonValue(int i) {
            copyOnWrite();
            ResolveInteractiveContextRequest.m9460G((ResolveInteractiveContextRequest) this.instance, i);
            return this;
        }

        public final Builder setRetriesLeft(String str) {
            copyOnWrite();
            ((ResolveInteractiveContextRequest) this.instance).setRetriesLeft(str);
            return this;
        }

        public final Builder setRetriesLeftBytes(gva gvaVar) {
            copyOnWrite();
            ((ResolveInteractiveContextRequest) this.instance).setRetriesLeftBytes(gvaVar);
            return this;
        }

        public final Builder setSessionId(String str) {
            copyOnWrite();
            ((ResolveInteractiveContextRequest) this.instance).setSessionId(str);
            return this;
        }

        public final Builder setSessionIdBytes(gva gvaVar) {
            copyOnWrite();
            ((ResolveInteractiveContextRequest) this.instance).setSessionIdBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(ResolveInteractiveContextRequest.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public final /* bridge */ /* synthetic */ ore0 mo98328clone() {
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

    /* JADX INFO: loaded from: classes6.dex */
    public enum PromptInputType implements od50 {
        PROMPT_INPUT_TYPE_UNSPECIFIED(0),
        PROMPT_INPUT_TYPE_VOICE(1),
        PROMPT_INPUT_TYPE_TEXT(2),
        PROMPT_INPUT_TYPE_SUGGESTED(3),
        UNRECOGNIZED(-1);

        public static final int PROMPT_INPUT_TYPE_SUGGESTED_VALUE = 3;
        public static final int PROMPT_INPUT_TYPE_TEXT_VALUE = 2;
        public static final int PROMPT_INPUT_TYPE_UNSPECIFIED_VALUE = 0;
        public static final int PROMPT_INPUT_TYPE_VOICE_VALUE = 1;
        private static final rd50 internalValueMap = new C07011();
        private final int value;

        /* JADX INFO: renamed from: com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextRequest$PromptInputType$1 */
        public class C07011 implements rd50 {
            @Override // p204p.rd50
            public final PromptInputType findValueByNumber(int i) {
                return PromptInputType.forNumber(i);
            }

            @Override // p204p.rd50
            public final od50 findValueByNumber(int i) {
                return PromptInputType.forNumber(i);
            }
        }

        public static final class PromptInputTypeVerifier implements sd50 {
            static final sd50 INSTANCE = new PromptInputTypeVerifier();

            private PromptInputTypeVerifier() {
            }

            @Override // p204p.sd50
            public final boolean isInRange(int i) {
                return PromptInputType.forNumber(i) != null;
            }
        }

        PromptInputType(int i) {
            this.value = i;
        }

        public static PromptInputType forNumber(int i) {
            if (i == 0) {
                return PROMPT_INPUT_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return PROMPT_INPUT_TYPE_VOICE;
            }
            if (i == 2) {
                return PROMPT_INPUT_TYPE_TEXT;
            }
            if (i != 3) {
                return null;
            }
            return PROMPT_INPUT_TYPE_SUGGESTED;
        }

        public static rd50 internalGetValueMap() {
            return internalValueMap;
        }

        public static sd50 internalGetVerifier() {
            return PromptInputTypeVerifier.INSTANCE;
        }

        @Override // p204p.od50
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static PromptInputType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public enum RequestSubmissionReason implements od50 {
        REQUEST_PROMPT(0),
        DISMISS(1),
        NO_MIC_PERMISSIONS(2),
        UNRECOGNIZED(-1);

        public static final int DISMISS_VALUE = 1;
        public static final int NO_MIC_PERMISSIONS_VALUE = 2;
        public static final int REQUEST_PROMPT_VALUE = 0;
        private static final rd50 internalValueMap = new C07021();
        private final int value;

        /* JADX INFO: renamed from: com.spotify.dj.interactionmanager.v0.ResolveInteractiveContextRequest$RequestSubmissionReason$1 */
        public class C07021 implements rd50 {
            @Override // p204p.rd50
            public final RequestSubmissionReason findValueByNumber(int i) {
                return RequestSubmissionReason.forNumber(i);
            }

            @Override // p204p.rd50
            public final od50 findValueByNumber(int i) {
                return RequestSubmissionReason.forNumber(i);
            }
        }

        public static final class RequestSubmissionReasonVerifier implements sd50 {
            static final sd50 INSTANCE = new RequestSubmissionReasonVerifier();

            private RequestSubmissionReasonVerifier() {
            }

            @Override // p204p.sd50
            public final boolean isInRange(int i) {
                return RequestSubmissionReason.forNumber(i) != null;
            }
        }

        RequestSubmissionReason(int i) {
            this.value = i;
        }

        public static RequestSubmissionReason forNumber(int i) {
            if (i == 0) {
                return REQUEST_PROMPT;
            }
            if (i == 1) {
                return DISMISS;
            }
            if (i != 2) {
                return null;
            }
            return NO_MIC_PERMISSIONS;
        }

        public static rd50 internalGetValueMap() {
            return internalValueMap;
        }

        public static sd50 internalGetVerifier() {
            return RequestSubmissionReasonVerifier.INSTANCE;
        }

        @Override // p204p.od50
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static RequestSubmissionReason valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        ResolveInteractiveContextRequest resolveInteractiveContextRequest = new ResolveInteractiveContextRequest();
        DEFAULT_INSTANCE = resolveInteractiveContextRequest;
        AbstractC0269h.registerDefaultInstance(ResolveInteractiveContextRequest.class, resolveInteractiveContextRequest);
    }

    private ResolveInteractiveContextRequest() {
    }

    /* JADX INFO: renamed from: C */
    public static void m9456C(ResolveInteractiveContextRequest resolveInteractiveContextRequest, int i) {
        resolveInteractiveContextRequest.inputType_ = i;
    }

    /* JADX INFO: renamed from: G */
    public static void m9460G(ResolveInteractiveContextRequest resolveInteractiveContextRequest, int i) {
        resolveInteractiveContextRequest.reason_ = i;
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

    private void clearInputType() {
        this.inputType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrompt() {
        this.prompt_ = DEFAULT_INSTANCE.prompt_;
    }

    private void clearReason() {
        this.reason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetriesLeft() {
        this.retriesLeft_ = DEFAULT_INSTANCE.retriesLeft_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = DEFAULT_INSTANCE.sessionId_;
    }

    public static ResolveInteractiveContextRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ResolveInteractiveContextRequest parseDelimitedFrom(InputStream inputStream) {
        return (ResolveInteractiveContextRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResolveInteractiveContextRequest parseFrom(ByteBuffer byteBuffer) {
        return (ResolveInteractiveContextRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m9469q(ResolveInteractiveContextRequest resolveInteractiveContextRequest) {
        resolveInteractiveContextRequest.inputType_ = 0;
    }

    /* JADX INFO: renamed from: s */
    public static void m9471s(ResolveInteractiveContextRequest resolveInteractiveContextRequest) {
        resolveInteractiveContextRequest.reason_ = 0;
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
    public void setInputType(PromptInputType promptInputType) {
        this.inputType_ = promptInputType.getNumber();
    }

    private void setInputTypeValue(int i) {
        this.inputType_ = i;
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
    public void setReason(RequestSubmissionReason requestSubmissionReason) {
        this.reason_ = requestSubmissionReason.getNumber();
    }

    private void setReasonValue(int i) {
        this.reason_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetriesLeft(String str) {
        str.getClass();
        this.retriesLeft_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetriesLeftBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.retriesLeft_ = gvaVar.m45892u();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\f\u0007Ȉ\b\f", new Object[]{"prompt_", "sessionId_", "deviceId_", "currentSegmentId_", "retriesLeft_", "reason_", "currentTrackUri_", "inputType_"});
        }
        if (iOrdinal == 3) {
            return new ResolveInteractiveContextRequest();
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
        synchronized (ResolveInteractiveContextRequest.class) {
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

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
    public final String getCurrentSegmentId() {
        return this.currentSegmentId_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
    public final gva getCurrentSegmentIdBytes() {
        return gva.m45888f(this.currentSegmentId_);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
    public final String getCurrentTrackUri() {
        return this.currentTrackUri_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
    public final gva getCurrentTrackUriBytes() {
        return gva.m45888f(this.currentTrackUri_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
    public final String getDeviceId() {
        return this.deviceId_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
    public final gva getDeviceIdBytes() {
        return gva.m45888f(this.deviceId_);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
    public final PromptInputType getInputType() {
        PromptInputType promptInputTypeForNumber = PromptInputType.forNumber(this.inputType_);
        return promptInputTypeForNumber == null ? PromptInputType.UNRECOGNIZED : promptInputTypeForNumber;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
    public final int getInputTypeValue() {
        return this.inputType_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
    public final String getPrompt() {
        return this.prompt_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
    public final gva getPromptBytes() {
        return gva.m45888f(this.prompt_);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
    public final RequestSubmissionReason getReason() {
        RequestSubmissionReason requestSubmissionReasonForNumber = RequestSubmissionReason.forNumber(this.reason_);
        return requestSubmissionReasonForNumber == null ? RequestSubmissionReason.UNRECOGNIZED : requestSubmissionReasonForNumber;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
    public final int getReasonValue() {
        return this.reason_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
    public final String getRetriesLeft() {
        return this.retriesLeft_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
    public final gva getRetriesLeftBytes() {
        return gva.m45888f(this.retriesLeft_);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
    public final String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequestOrBuilder
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

    public static Builder newBuilder(ResolveInteractiveContextRequest resolveInteractiveContextRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(resolveInteractiveContextRequest);
    }

    public static ResolveInteractiveContextRequest parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ResolveInteractiveContextRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ResolveInteractiveContextRequest parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ResolveInteractiveContextRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ResolveInteractiveContextRequest parseFrom(gva gvaVar) {
        return (ResolveInteractiveContextRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static ResolveInteractiveContextRequest parseFrom(gva gvaVar, aux auxVar) {
        return (ResolveInteractiveContextRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ResolveInteractiveContextRequest parseFrom(byte[] bArr) {
        return (ResolveInteractiveContextRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ResolveInteractiveContextRequest parseFrom(byte[] bArr, aux auxVar) {
        return (ResolveInteractiveContextRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ResolveInteractiveContextRequest parseFrom(InputStream inputStream) {
        return (ResolveInteractiveContextRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResolveInteractiveContextRequest parseFrom(InputStream inputStream, aux auxVar) {
        return (ResolveInteractiveContextRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ResolveInteractiveContextRequest parseFrom(owe oweVar) {
        return (ResolveInteractiveContextRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ResolveInteractiveContextRequest parseFrom(owe oweVar, aux auxVar) {
        return (ResolveInteractiveContextRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
