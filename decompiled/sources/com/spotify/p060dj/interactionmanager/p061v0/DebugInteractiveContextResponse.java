package com.spotify.p060dj.interactionmanager.p061v0;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.aux;
import p204p.gva;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class DebugInteractiveContextResponse extends AbstractC0269h implements DebugInteractiveContextResponseOrBuilder {
    public static final int ACK_COMMENTARY_FIELD_NUMBER = 3;
    public static final int CONTAINS_PROMPT_VIOLATION_FIELD_NUMBER = 8;
    private static final DebugInteractiveContextResponse DEFAULT_INSTANCE;
    public static final int INTRO_COMMENTARY_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PROMPT_VIOLATION_LABEL_FIELD_NUMBER = 7;
    public static final int RECSPLANATION_FIELD_NUMBER = 6;
    public static final int STATUS_CODE_FIELD_NUMBER = 1;
    public static final int STATUS_MESSAGE_FIELD_NUMBER = 2;
    public static final int TRACK_URIS_FIELD_NUMBER = 4;
    private boolean containsPromptViolation_;
    private String statusCode_ = "";
    private String statusMessage_ = "";
    private String ackCommentary_ = "";
    private ae50 trackUris_ = AbstractC0269h.emptyProtobufList();
    private String introCommentary_ = "";
    private String recsplanation_ = "";
    private String promptViolationLabel_ = "";

    /* JADX INFO: renamed from: com.spotify.dj.interactionmanager.v0.DebugInteractiveContextResponse$1 */
    public static /* synthetic */ class C06911 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3571xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3571xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3571xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3571xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3571xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3571xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3571xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3571xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements DebugInteractiveContextResponseOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final Builder addAllTrackUris(Iterable<String> iterable) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) this.instance).addAllTrackUris(iterable);
            return this;
        }

        public final Builder addTrackUris(String str) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) this.instance).addTrackUris(str);
            return this;
        }

        public final Builder addTrackUrisBytes(gva gvaVar) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) this.instance).addTrackUrisBytes(gvaVar);
            return this;
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

        public final Builder clearAckCommentary() {
            copyOnWrite();
            ((DebugInteractiveContextResponse) this.instance).clearAckCommentary();
            return this;
        }

        public final Builder clearContainsPromptViolation() {
            copyOnWrite();
            DebugInteractiveContextResponse.m9376r((DebugInteractiveContextResponse) this.instance);
            return this;
        }

        public final Builder clearIntroCommentary() {
            copyOnWrite();
            ((DebugInteractiveContextResponse) this.instance).clearIntroCommentary();
            return this;
        }

        public final Builder clearPromptViolationLabel() {
            copyOnWrite();
            ((DebugInteractiveContextResponse) this.instance).clearPromptViolationLabel();
            return this;
        }

        public final Builder clearRecsplanation() {
            copyOnWrite();
            ((DebugInteractiveContextResponse) this.instance).clearRecsplanation();
            return this;
        }

        public final Builder clearStatusCode() {
            copyOnWrite();
            ((DebugInteractiveContextResponse) this.instance).clearStatusCode();
            return this;
        }

        public final Builder clearStatusMessage() {
            copyOnWrite();
            ((DebugInteractiveContextResponse) this.instance).clearStatusMessage();
            return this;
        }

        public final Builder clearTrackUris() {
            copyOnWrite();
            ((DebugInteractiveContextResponse) this.instance).clearTrackUris();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public final /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
        public final String getAckCommentary() {
            return ((DebugInteractiveContextResponse) this.instance).getAckCommentary();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
        public final gva getAckCommentaryBytes() {
            return ((DebugInteractiveContextResponse) this.instance).getAckCommentaryBytes();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
        public final boolean getContainsPromptViolation() {
            return ((DebugInteractiveContextResponse) this.instance).getContainsPromptViolation();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
        public final String getIntroCommentary() {
            return ((DebugInteractiveContextResponse) this.instance).getIntroCommentary();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
        public final gva getIntroCommentaryBytes() {
            return ((DebugInteractiveContextResponse) this.instance).getIntroCommentaryBytes();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
        public final String getPromptViolationLabel() {
            return ((DebugInteractiveContextResponse) this.instance).getPromptViolationLabel();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
        public final gva getPromptViolationLabelBytes() {
            return ((DebugInteractiveContextResponse) this.instance).getPromptViolationLabelBytes();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
        public final String getRecsplanation() {
            return ((DebugInteractiveContextResponse) this.instance).getRecsplanation();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
        public final gva getRecsplanationBytes() {
            return ((DebugInteractiveContextResponse) this.instance).getRecsplanationBytes();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
        public final String getStatusCode() {
            return ((DebugInteractiveContextResponse) this.instance).getStatusCode();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
        public final gva getStatusCodeBytes() {
            return ((DebugInteractiveContextResponse) this.instance).getStatusCodeBytes();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
        public final String getStatusMessage() {
            return ((DebugInteractiveContextResponse) this.instance).getStatusMessage();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
        public final gva getStatusMessageBytes() {
            return ((DebugInteractiveContextResponse) this.instance).getStatusMessageBytes();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
        public final String getTrackUris(int i) {
            return ((DebugInteractiveContextResponse) this.instance).getTrackUris(i);
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
        public final gva getTrackUrisBytes(int i) {
            return ((DebugInteractiveContextResponse) this.instance).getTrackUrisBytes(i);
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
        public final int getTrackUrisCount() {
            return ((DebugInteractiveContextResponse) this.instance).getTrackUrisCount();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
        public final List<String> getTrackUrisList() {
            return Collections.unmodifiableList(((DebugInteractiveContextResponse) this.instance).getTrackUrisList());
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public final /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public final Builder setAckCommentary(String str) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) this.instance).setAckCommentary(str);
            return this;
        }

        public final Builder setAckCommentaryBytes(gva gvaVar) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) this.instance).setAckCommentaryBytes(gvaVar);
            return this;
        }

        public final Builder setContainsPromptViolation(boolean z) {
            copyOnWrite();
            DebugInteractiveContextResponse.m9359A((DebugInteractiveContextResponse) this.instance, z);
            return this;
        }

        public final Builder setIntroCommentary(String str) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) this.instance).setIntroCommentary(str);
            return this;
        }

        public final Builder setIntroCommentaryBytes(gva gvaVar) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) this.instance).setIntroCommentaryBytes(gvaVar);
            return this;
        }

        public final Builder setPromptViolationLabel(String str) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) this.instance).setPromptViolationLabel(str);
            return this;
        }

        public final Builder setPromptViolationLabelBytes(gva gvaVar) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) this.instance).setPromptViolationLabelBytes(gvaVar);
            return this;
        }

        public final Builder setRecsplanation(String str) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) this.instance).setRecsplanation(str);
            return this;
        }

        public final Builder setRecsplanationBytes(gva gvaVar) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) this.instance).setRecsplanationBytes(gvaVar);
            return this;
        }

        public final Builder setStatusCode(String str) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) this.instance).setStatusCode(str);
            return this;
        }

        public final Builder setStatusCodeBytes(gva gvaVar) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) this.instance).setStatusCodeBytes(gvaVar);
            return this;
        }

        public final Builder setStatusMessage(String str) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) this.instance).setStatusMessage(str);
            return this;
        }

        public final Builder setStatusMessageBytes(gva gvaVar) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) this.instance).setStatusMessageBytes(gvaVar);
            return this;
        }

        public final Builder setTrackUris(int i, String str) {
            copyOnWrite();
            ((DebugInteractiveContextResponse) this.instance).setTrackUris(i, str);
            return this;
        }

        private Builder() {
            super(DebugInteractiveContextResponse.DEFAULT_INSTANCE);
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
        DebugInteractiveContextResponse debugInteractiveContextResponse = new DebugInteractiveContextResponse();
        DEFAULT_INSTANCE = debugInteractiveContextResponse;
        AbstractC0269h.registerDefaultInstance(DebugInteractiveContextResponse.class, debugInteractiveContextResponse);
    }

    private DebugInteractiveContextResponse() {
    }

    /* JADX INFO: renamed from: A */
    public static void m9359A(DebugInteractiveContextResponse debugInteractiveContextResponse, boolean z) {
        debugInteractiveContextResponse.containsPromptViolation_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTrackUris(Iterable<String> iterable) {
        ensureTrackUrisIsMutable();
        AbstractC2118m8.addAll(iterable, this.trackUris_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrackUris(String str) {
        str.getClass();
        ensureTrackUrisIsMutable();
        this.trackUris_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrackUrisBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        ensureTrackUrisIsMutable();
        this.trackUris_.add(gvaVar.m45892u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAckCommentary() {
        this.ackCommentary_ = DEFAULT_INSTANCE.ackCommentary_;
    }

    private void clearContainsPromptViolation() {
        this.containsPromptViolation_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntroCommentary() {
        this.introCommentary_ = DEFAULT_INSTANCE.introCommentary_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPromptViolationLabel() {
        this.promptViolationLabel_ = DEFAULT_INSTANCE.promptViolationLabel_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecsplanation() {
        this.recsplanation_ = DEFAULT_INSTANCE.recsplanation_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatusCode() {
        this.statusCode_ = DEFAULT_INSTANCE.statusCode_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatusMessage() {
        this.statusMessage_ = DEFAULT_INSTANCE.statusMessage_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackUris() {
        this.trackUris_ = AbstractC0269h.emptyProtobufList();
    }

    private void ensureTrackUrisIsMutable() {
        ae50 ae50Var = this.trackUris_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.trackUris_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    public static DebugInteractiveContextResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DebugInteractiveContextResponse parseDelimitedFrom(InputStream inputStream) {
        return (DebugInteractiveContextResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DebugInteractiveContextResponse parseFrom(ByteBuffer byteBuffer) {
        return (DebugInteractiveContextResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static void m9376r(DebugInteractiveContextResponse debugInteractiveContextResponse) {
        debugInteractiveContextResponse.containsPromptViolation_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAckCommentary(String str) {
        str.getClass();
        this.ackCommentary_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAckCommentaryBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.ackCommentary_ = gvaVar.m45892u();
    }

    private void setContainsPromptViolation(boolean z) {
        this.containsPromptViolation_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntroCommentary(String str) {
        str.getClass();
        this.introCommentary_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntroCommentaryBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.introCommentary_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromptViolationLabel(String str) {
        str.getClass();
        this.promptViolationLabel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromptViolationLabelBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.promptViolationLabel_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecsplanation(String str) {
        str.getClass();
        this.recsplanation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecsplanationBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.recsplanation_ = gvaVar.m45892u();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackUris(int i, String str) {
        str.getClass();
        ensureTrackUrisIsMutable();
        this.trackUris_.set(i, str);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ț\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0007", new Object[]{"statusCode_", "statusMessage_", "ackCommentary_", "trackUris_", "introCommentary_", "recsplanation_", "promptViolationLabel_", "containsPromptViolation_"});
        }
        if (iOrdinal == 3) {
            return new DebugInteractiveContextResponse();
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
        synchronized (DebugInteractiveContextResponse.class) {
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

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
    public final String getAckCommentary() {
        return this.ackCommentary_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
    public final gva getAckCommentaryBytes() {
        return gva.m45888f(this.ackCommentary_);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
    public final boolean getContainsPromptViolation() {
        return this.containsPromptViolation_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
    public final String getIntroCommentary() {
        return this.introCommentary_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
    public final gva getIntroCommentaryBytes() {
        return gva.m45888f(this.introCommentary_);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
    public final String getPromptViolationLabel() {
        return this.promptViolationLabel_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
    public final gva getPromptViolationLabelBytes() {
        return gva.m45888f(this.promptViolationLabel_);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
    public final String getRecsplanation() {
        return this.recsplanation_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
    public final gva getRecsplanationBytes() {
        return gva.m45888f(this.recsplanation_);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
    public final String getStatusCode() {
        return this.statusCode_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
    public final gva getStatusCodeBytes() {
        return gva.m45888f(this.statusCode_);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
    public final String getStatusMessage() {
        return this.statusMessage_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
    public final gva getStatusMessageBytes() {
        return gva.m45888f(this.statusMessage_);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
    public final String getTrackUris(int i) {
        return (String) this.trackUris_.get(i);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
    public final gva getTrackUrisBytes(int i) {
        return gva.m45888f((String) this.trackUris_.get(i));
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
    public final int getTrackUrisCount() {
        return this.trackUris_.size();
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.DebugInteractiveContextResponseOrBuilder
    public final List<String> getTrackUrisList() {
        return this.trackUris_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(DebugInteractiveContextResponse debugInteractiveContextResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(debugInteractiveContextResponse);
    }

    public static DebugInteractiveContextResponse parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (DebugInteractiveContextResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static DebugInteractiveContextResponse parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (DebugInteractiveContextResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static DebugInteractiveContextResponse parseFrom(gva gvaVar) {
        return (DebugInteractiveContextResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static DebugInteractiveContextResponse parseFrom(gva gvaVar, aux auxVar) {
        return (DebugInteractiveContextResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static DebugInteractiveContextResponse parseFrom(byte[] bArr) {
        return (DebugInteractiveContextResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DebugInteractiveContextResponse parseFrom(byte[] bArr, aux auxVar) {
        return (DebugInteractiveContextResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static DebugInteractiveContextResponse parseFrom(InputStream inputStream) {
        return (DebugInteractiveContextResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DebugInteractiveContextResponse parseFrom(InputStream inputStream, aux auxVar) {
        return (DebugInteractiveContextResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static DebugInteractiveContextResponse parseFrom(owe oweVar) {
        return (DebugInteractiveContextResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static DebugInteractiveContextResponse parseFrom(owe oweVar, aux auxVar) {
        return (DebugInteractiveContextResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
