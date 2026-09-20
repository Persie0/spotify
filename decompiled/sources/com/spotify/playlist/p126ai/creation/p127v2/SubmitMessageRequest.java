package com.spotify.playlist.p126ai.creation.p127v2;

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

/* JADX INFO: loaded from: classes9.dex */
public final class SubmitMessageRequest extends AbstractC0269h implements SubmitMessageRequestOrBuilder {
    private static final SubmitMessageRequest DEFAULT_INSTANCE;
    public static final int MESSAGE_PREFERENCES_FIELD_NUMBER = 3;
    public static final int MESSAGE_PROMPT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private ChatMessagePreferences messagePreferences_;
    private String sessionId_ = "";
    private String messagePrompt_ = "";

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.SubmitMessageRequest$1 */
    public static /* synthetic */ class C11991 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f6452xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f6452xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6452xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6452xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6452xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6452xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6452xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6452xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements SubmitMessageRequestOrBuilder {
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

        public final Builder clearMessagePreferences() {
            copyOnWrite();
            ((SubmitMessageRequest) this.instance).clearMessagePreferences();
            return this;
        }

        public final Builder clearMessagePrompt() {
            copyOnWrite();
            ((SubmitMessageRequest) this.instance).clearMessagePrompt();
            return this;
        }

        public final Builder clearSessionId() {
            copyOnWrite();
            ((SubmitMessageRequest) this.instance).clearSessionId();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public final /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageRequestOrBuilder
        public final ChatMessagePreferences getMessagePreferences() {
            return ((SubmitMessageRequest) this.instance).getMessagePreferences();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageRequestOrBuilder
        public final String getMessagePrompt() {
            return ((SubmitMessageRequest) this.instance).getMessagePrompt();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageRequestOrBuilder
        public final gva getMessagePromptBytes() {
            return ((SubmitMessageRequest) this.instance).getMessagePromptBytes();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageRequestOrBuilder
        public final String getSessionId() {
            return ((SubmitMessageRequest) this.instance).getSessionId();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageRequestOrBuilder
        public final gva getSessionIdBytes() {
            return ((SubmitMessageRequest) this.instance).getSessionIdBytes();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageRequestOrBuilder
        public final boolean hasMessagePreferences() {
            return ((SubmitMessageRequest) this.instance).hasMessagePreferences();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public final /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public final Builder mergeMessagePreferences(ChatMessagePreferences chatMessagePreferences) {
            copyOnWrite();
            ((SubmitMessageRequest) this.instance).mergeMessagePreferences(chatMessagePreferences);
            return this;
        }

        public final Builder setMessagePreferences(ChatMessagePreferences chatMessagePreferences) {
            copyOnWrite();
            ((SubmitMessageRequest) this.instance).setMessagePreferences(chatMessagePreferences);
            return this;
        }

        public final Builder setMessagePrompt(String str) {
            copyOnWrite();
            ((SubmitMessageRequest) this.instance).setMessagePrompt(str);
            return this;
        }

        public final Builder setMessagePromptBytes(gva gvaVar) {
            copyOnWrite();
            ((SubmitMessageRequest) this.instance).setMessagePromptBytes(gvaVar);
            return this;
        }

        public final Builder setSessionId(String str) {
            copyOnWrite();
            ((SubmitMessageRequest) this.instance).setSessionId(str);
            return this;
        }

        public final Builder setSessionIdBytes(gva gvaVar) {
            copyOnWrite();
            ((SubmitMessageRequest) this.instance).setSessionIdBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(SubmitMessageRequest.DEFAULT_INSTANCE);
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

        public final Builder setMessagePreferences(ChatMessagePreferences.Builder builder) {
            copyOnWrite();
            ((SubmitMessageRequest) this.instance).setMessagePreferences((ChatMessagePreferences) builder.build());
            return this;
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
        SubmitMessageRequest submitMessageRequest = new SubmitMessageRequest();
        DEFAULT_INSTANCE = submitMessageRequest;
        AbstractC0269h.registerDefaultInstance(SubmitMessageRequest.class, submitMessageRequest);
    }

    private SubmitMessageRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessagePreferences() {
        this.messagePreferences_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessagePrompt() {
        this.messagePrompt_ = DEFAULT_INSTANCE.messagePrompt_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = DEFAULT_INSTANCE.sessionId_;
    }

    public static SubmitMessageRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMessagePreferences(ChatMessagePreferences chatMessagePreferences) {
        chatMessagePreferences.getClass();
        ChatMessagePreferences chatMessagePreferences2 = this.messagePreferences_;
        if (chatMessagePreferences2 == null || chatMessagePreferences2 == ChatMessagePreferences.getDefaultInstance()) {
            this.messagePreferences_ = chatMessagePreferences;
        } else {
            this.messagePreferences_ = (ChatMessagePreferences) ((ChatMessagePreferences.Builder) ChatMessagePreferences.newBuilder(this.messagePreferences_).mergeFrom((AbstractC0269h) chatMessagePreferences)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static SubmitMessageRequest parseDelimitedFrom(InputStream inputStream) {
        return (SubmitMessageRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SubmitMessageRequest parseFrom(ByteBuffer byteBuffer) {
        return (SubmitMessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessagePreferences(ChatMessagePreferences chatMessagePreferences) {
        chatMessagePreferences.getClass();
        this.messagePreferences_ = chatMessagePreferences;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessagePrompt(String str) {
        str.getClass();
        this.messagePrompt_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessagePromptBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.messagePrompt_ = gvaVar.m45892u();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "sessionId_", "messagePrompt_", "messagePreferences_"});
        }
        if (iOrdinal == 3) {
            return new SubmitMessageRequest();
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
        synchronized (SubmitMessageRequest.class) {
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

    @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageRequestOrBuilder
    public final ChatMessagePreferences getMessagePreferences() {
        ChatMessagePreferences chatMessagePreferences = this.messagePreferences_;
        return chatMessagePreferences == null ? ChatMessagePreferences.getDefaultInstance() : chatMessagePreferences;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageRequestOrBuilder
    public final String getMessagePrompt() {
        return this.messagePrompt_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageRequestOrBuilder
    public final gva getMessagePromptBytes() {
        return gva.m45888f(this.messagePrompt_);
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageRequestOrBuilder
    public final String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageRequestOrBuilder
    public final gva getSessionIdBytes() {
        return gva.m45888f(this.sessionId_);
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageRequestOrBuilder
    public final boolean hasMessagePreferences() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(SubmitMessageRequest submitMessageRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(submitMessageRequest);
    }

    public static SubmitMessageRequest parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (SubmitMessageRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static SubmitMessageRequest parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (SubmitMessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static SubmitMessageRequest parseFrom(gva gvaVar) {
        return (SubmitMessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static SubmitMessageRequest parseFrom(gva gvaVar, aux auxVar) {
        return (SubmitMessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static SubmitMessageRequest parseFrom(byte[] bArr) {
        return (SubmitMessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SubmitMessageRequest parseFrom(byte[] bArr, aux auxVar) {
        return (SubmitMessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static SubmitMessageRequest parseFrom(InputStream inputStream) {
        return (SubmitMessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SubmitMessageRequest parseFrom(InputStream inputStream, aux auxVar) {
        return (SubmitMessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static SubmitMessageRequest parseFrom(owe oweVar) {
        return (SubmitMessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static SubmitMessageRequest parseFrom(owe oweVar, aux auxVar) {
        return (SubmitMessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
