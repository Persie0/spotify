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
public final class UpdateChatMessagePreferencesRequest extends AbstractC0269h implements UpdateChatMessagePreferencesRequestOrBuilder {
    private static final UpdateChatMessagePreferencesRequest DEFAULT_INSTANCE;
    public static final int MESSAGE_ID_FIELD_NUMBER = 2;
    public static final int MESSAGE_PREFERENCES_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private ChatMessagePreferences messagePreferences_;
    private String sessionId_ = "";
    private String messageId_ = "";

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.UpdateChatMessagePreferencesRequest$1 */
    public static /* synthetic */ class C12011 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f6454xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f6454xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6454xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6454xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6454xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6454xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6454xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6454xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements UpdateChatMessagePreferencesRequestOrBuilder {
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

        public final Builder clearMessageId() {
            copyOnWrite();
            ((UpdateChatMessagePreferencesRequest) this.instance).clearMessageId();
            return this;
        }

        public final Builder clearMessagePreferences() {
            copyOnWrite();
            ((UpdateChatMessagePreferencesRequest) this.instance).clearMessagePreferences();
            return this;
        }

        public final Builder clearSessionId() {
            copyOnWrite();
            ((UpdateChatMessagePreferencesRequest) this.instance).clearSessionId();
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

        @Override // com.spotify.playlist.p126ai.creation.p127v2.UpdateChatMessagePreferencesRequestOrBuilder
        public final String getMessageId() {
            return ((UpdateChatMessagePreferencesRequest) this.instance).getMessageId();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.UpdateChatMessagePreferencesRequestOrBuilder
        public final gva getMessageIdBytes() {
            return ((UpdateChatMessagePreferencesRequest) this.instance).getMessageIdBytes();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.UpdateChatMessagePreferencesRequestOrBuilder
        public final ChatMessagePreferences getMessagePreferences() {
            return ((UpdateChatMessagePreferencesRequest) this.instance).getMessagePreferences();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.UpdateChatMessagePreferencesRequestOrBuilder
        public final String getSessionId() {
            return ((UpdateChatMessagePreferencesRequest) this.instance).getSessionId();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.UpdateChatMessagePreferencesRequestOrBuilder
        public final gva getSessionIdBytes() {
            return ((UpdateChatMessagePreferencesRequest) this.instance).getSessionIdBytes();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.UpdateChatMessagePreferencesRequestOrBuilder
        public final boolean hasMessagePreferences() {
            return ((UpdateChatMessagePreferencesRequest) this.instance).hasMessagePreferences();
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
            ((UpdateChatMessagePreferencesRequest) this.instance).mergeMessagePreferences(chatMessagePreferences);
            return this;
        }

        public final Builder setMessageId(String str) {
            copyOnWrite();
            ((UpdateChatMessagePreferencesRequest) this.instance).setMessageId(str);
            return this;
        }

        public final Builder setMessageIdBytes(gva gvaVar) {
            copyOnWrite();
            ((UpdateChatMessagePreferencesRequest) this.instance).setMessageIdBytes(gvaVar);
            return this;
        }

        public final Builder setMessagePreferences(ChatMessagePreferences chatMessagePreferences) {
            copyOnWrite();
            ((UpdateChatMessagePreferencesRequest) this.instance).setMessagePreferences(chatMessagePreferences);
            return this;
        }

        public final Builder setSessionId(String str) {
            copyOnWrite();
            ((UpdateChatMessagePreferencesRequest) this.instance).setSessionId(str);
            return this;
        }

        public final Builder setSessionIdBytes(gva gvaVar) {
            copyOnWrite();
            ((UpdateChatMessagePreferencesRequest) this.instance).setSessionIdBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(UpdateChatMessagePreferencesRequest.DEFAULT_INSTANCE);
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
            ((UpdateChatMessagePreferencesRequest) this.instance).setMessagePreferences((ChatMessagePreferences) builder.build());
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
        UpdateChatMessagePreferencesRequest updateChatMessagePreferencesRequest = new UpdateChatMessagePreferencesRequest();
        DEFAULT_INSTANCE = updateChatMessagePreferencesRequest;
        AbstractC0269h.registerDefaultInstance(UpdateChatMessagePreferencesRequest.class, updateChatMessagePreferencesRequest);
    }

    private UpdateChatMessagePreferencesRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageId() {
        this.messageId_ = DEFAULT_INSTANCE.messageId_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessagePreferences() {
        this.messagePreferences_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = DEFAULT_INSTANCE.sessionId_;
    }

    public static UpdateChatMessagePreferencesRequest getDefaultInstance() {
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

    public static UpdateChatMessagePreferencesRequest parseDelimitedFrom(InputStream inputStream) {
        return (UpdateChatMessagePreferencesRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UpdateChatMessagePreferencesRequest parseFrom(ByteBuffer byteBuffer) {
        return (UpdateChatMessagePreferencesRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageId(String str) {
        str.getClass();
        this.messageId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.messageId_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessagePreferences(ChatMessagePreferences chatMessagePreferences) {
        chatMessagePreferences.getClass();
        this.messagePreferences_ = chatMessagePreferences;
        this.bitField0_ |= 1;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "sessionId_", "messageId_", "messagePreferences_"});
        }
        if (iOrdinal == 3) {
            return new UpdateChatMessagePreferencesRequest();
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
        synchronized (UpdateChatMessagePreferencesRequest.class) {
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

    @Override // com.spotify.playlist.p126ai.creation.p127v2.UpdateChatMessagePreferencesRequestOrBuilder
    public final String getMessageId() {
        return this.messageId_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.UpdateChatMessagePreferencesRequestOrBuilder
    public final gva getMessageIdBytes() {
        return gva.m45888f(this.messageId_);
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.UpdateChatMessagePreferencesRequestOrBuilder
    public final ChatMessagePreferences getMessagePreferences() {
        ChatMessagePreferences chatMessagePreferences = this.messagePreferences_;
        return chatMessagePreferences == null ? ChatMessagePreferences.getDefaultInstance() : chatMessagePreferences;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.UpdateChatMessagePreferencesRequestOrBuilder
    public final String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.UpdateChatMessagePreferencesRequestOrBuilder
    public final gva getSessionIdBytes() {
        return gva.m45888f(this.sessionId_);
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.UpdateChatMessagePreferencesRequestOrBuilder
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

    public static Builder newBuilder(UpdateChatMessagePreferencesRequest updateChatMessagePreferencesRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(updateChatMessagePreferencesRequest);
    }

    public static UpdateChatMessagePreferencesRequest parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (UpdateChatMessagePreferencesRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static UpdateChatMessagePreferencesRequest parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (UpdateChatMessagePreferencesRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static UpdateChatMessagePreferencesRequest parseFrom(gva gvaVar) {
        return (UpdateChatMessagePreferencesRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static UpdateChatMessagePreferencesRequest parseFrom(gva gvaVar, aux auxVar) {
        return (UpdateChatMessagePreferencesRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static UpdateChatMessagePreferencesRequest parseFrom(byte[] bArr) {
        return (UpdateChatMessagePreferencesRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UpdateChatMessagePreferencesRequest parseFrom(byte[] bArr, aux auxVar) {
        return (UpdateChatMessagePreferencesRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static UpdateChatMessagePreferencesRequest parseFrom(InputStream inputStream) {
        return (UpdateChatMessagePreferencesRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UpdateChatMessagePreferencesRequest parseFrom(InputStream inputStream, aux auxVar) {
        return (UpdateChatMessagePreferencesRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static UpdateChatMessagePreferencesRequest parseFrom(owe oweVar) {
        return (UpdateChatMessagePreferencesRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static UpdateChatMessagePreferencesRequest parseFrom(owe oweVar, aux auxVar) {
        return (UpdateChatMessagePreferencesRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
