package com.spotify.playlist.p126ai.creation.p127v2;

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

/* JADX INFO: loaded from: classes9.dex */
public final class GetSessionResponse extends AbstractC0269h implements GetSessionResponseOrBuilder {
    private static final GetSessionResponse DEFAULT_INSTANCE;
    public static final int MESSAGES_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_URI_FIELD_NUMBER = 5;
    public static final int POPULAR_PROMPTS_FIELD_NUMBER = 4;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SUGGESTED_PROMPTS_FIELD_NUMBER = 3;
    public static final int WELCOME_MESSAGE_FIELD_NUMBER = 8;
    private int bitField0_;
    private String sessionId_ = "";
    private ae50 messages_ = AbstractC0269h.emptyProtobufList();
    private ae50 suggestedPrompts_ = AbstractC0269h.emptyProtobufList();
    private ae50 popularPrompts_ = AbstractC0269h.emptyProtobufList();
    private String playlistUri_ = "";
    private String welcomeMessage_ = "";

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.GetSessionResponse$1 */
    public static /* synthetic */ class C11851 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f6440xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f6440xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6440xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6440xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6440xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6440xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6440xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6440xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements GetSessionResponseOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final Builder addAllMessages(Iterable<? extends ChatMessage> iterable) {
            copyOnWrite();
            ((GetSessionResponse) this.instance).addAllMessages(iterable);
            return this;
        }

        public final Builder addAllPopularPrompts(Iterable<String> iterable) {
            copyOnWrite();
            ((GetSessionResponse) this.instance).addAllPopularPrompts(iterable);
            return this;
        }

        public final Builder addAllSuggestedPrompts(Iterable<String> iterable) {
            copyOnWrite();
            ((GetSessionResponse) this.instance).addAllSuggestedPrompts(iterable);
            return this;
        }

        public final Builder addMessages(ChatMessage chatMessage) {
            copyOnWrite();
            ((GetSessionResponse) this.instance).addMessages(chatMessage);
            return this;
        }

        public final Builder addPopularPrompts(String str) {
            copyOnWrite();
            ((GetSessionResponse) this.instance).addPopularPrompts(str);
            return this;
        }

        public final Builder addPopularPromptsBytes(gva gvaVar) {
            copyOnWrite();
            ((GetSessionResponse) this.instance).addPopularPromptsBytes(gvaVar);
            return this;
        }

        public final Builder addSuggestedPrompts(String str) {
            copyOnWrite();
            ((GetSessionResponse) this.instance).addSuggestedPrompts(str);
            return this;
        }

        public final Builder addSuggestedPromptsBytes(gva gvaVar) {
            copyOnWrite();
            ((GetSessionResponse) this.instance).addSuggestedPromptsBytes(gvaVar);
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

        public final Builder clearMessages() {
            copyOnWrite();
            ((GetSessionResponse) this.instance).clearMessages();
            return this;
        }

        public final Builder clearPlaylistUri() {
            copyOnWrite();
            ((GetSessionResponse) this.instance).clearPlaylistUri();
            return this;
        }

        public final Builder clearPopularPrompts() {
            copyOnWrite();
            ((GetSessionResponse) this.instance).clearPopularPrompts();
            return this;
        }

        public final Builder clearSessionId() {
            copyOnWrite();
            ((GetSessionResponse) this.instance).clearSessionId();
            return this;
        }

        public final Builder clearSuggestedPrompts() {
            copyOnWrite();
            ((GetSessionResponse) this.instance).clearSuggestedPrompts();
            return this;
        }

        public final Builder clearWelcomeMessage() {
            copyOnWrite();
            ((GetSessionResponse) this.instance).clearWelcomeMessage();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public final /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
        public final ChatMessage getMessages(int i) {
            return ((GetSessionResponse) this.instance).getMessages(i);
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
        public final int getMessagesCount() {
            return ((GetSessionResponse) this.instance).getMessagesCount();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
        public final List<ChatMessage> getMessagesList() {
            return Collections.unmodifiableList(((GetSessionResponse) this.instance).getMessagesList());
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
        public final String getPlaylistUri() {
            return ((GetSessionResponse) this.instance).getPlaylistUri();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
        public final gva getPlaylistUriBytes() {
            return ((GetSessionResponse) this.instance).getPlaylistUriBytes();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
        public final String getPopularPrompts(int i) {
            return ((GetSessionResponse) this.instance).getPopularPrompts(i);
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
        public final gva getPopularPromptsBytes(int i) {
            return ((GetSessionResponse) this.instance).getPopularPromptsBytes(i);
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
        public final int getPopularPromptsCount() {
            return ((GetSessionResponse) this.instance).getPopularPromptsCount();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
        public final List<String> getPopularPromptsList() {
            return Collections.unmodifiableList(((GetSessionResponse) this.instance).getPopularPromptsList());
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
        public final String getSessionId() {
            return ((GetSessionResponse) this.instance).getSessionId();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
        public final gva getSessionIdBytes() {
            return ((GetSessionResponse) this.instance).getSessionIdBytes();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
        public final String getSuggestedPrompts(int i) {
            return ((GetSessionResponse) this.instance).getSuggestedPrompts(i);
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
        public final gva getSuggestedPromptsBytes(int i) {
            return ((GetSessionResponse) this.instance).getSuggestedPromptsBytes(i);
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
        public final int getSuggestedPromptsCount() {
            return ((GetSessionResponse) this.instance).getSuggestedPromptsCount();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
        public final List<String> getSuggestedPromptsList() {
            return Collections.unmodifiableList(((GetSessionResponse) this.instance).getSuggestedPromptsList());
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
        public final String getWelcomeMessage() {
            return ((GetSessionResponse) this.instance).getWelcomeMessage();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
        public final gva getWelcomeMessageBytes() {
            return ((GetSessionResponse) this.instance).getWelcomeMessageBytes();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
        public final boolean hasWelcomeMessage() {
            return ((GetSessionResponse) this.instance).hasWelcomeMessage();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public final /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public final Builder removeMessages(int i) {
            copyOnWrite();
            ((GetSessionResponse) this.instance).removeMessages(i);
            return this;
        }

        public final Builder setMessages(int i, ChatMessage chatMessage) {
            copyOnWrite();
            ((GetSessionResponse) this.instance).setMessages(i, chatMessage);
            return this;
        }

        public final Builder setPlaylistUri(String str) {
            copyOnWrite();
            ((GetSessionResponse) this.instance).setPlaylistUri(str);
            return this;
        }

        public final Builder setPlaylistUriBytes(gva gvaVar) {
            copyOnWrite();
            ((GetSessionResponse) this.instance).setPlaylistUriBytes(gvaVar);
            return this;
        }

        public final Builder setPopularPrompts(int i, String str) {
            copyOnWrite();
            ((GetSessionResponse) this.instance).setPopularPrompts(i, str);
            return this;
        }

        public final Builder setSessionId(String str) {
            copyOnWrite();
            ((GetSessionResponse) this.instance).setSessionId(str);
            return this;
        }

        public final Builder setSessionIdBytes(gva gvaVar) {
            copyOnWrite();
            ((GetSessionResponse) this.instance).setSessionIdBytes(gvaVar);
            return this;
        }

        public final Builder setSuggestedPrompts(int i, String str) {
            copyOnWrite();
            ((GetSessionResponse) this.instance).setSuggestedPrompts(i, str);
            return this;
        }

        public final Builder setWelcomeMessage(String str) {
            copyOnWrite();
            ((GetSessionResponse) this.instance).setWelcomeMessage(str);
            return this;
        }

        public final Builder setWelcomeMessageBytes(gva gvaVar) {
            copyOnWrite();
            ((GetSessionResponse) this.instance).setWelcomeMessageBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(GetSessionResponse.DEFAULT_INSTANCE);
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

        public final Builder addMessages(int i, ChatMessage chatMessage) {
            copyOnWrite();
            ((GetSessionResponse) this.instance).addMessages(i, chatMessage);
            return this;
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

        public final Builder setMessages(int i, ChatMessage.Builder builder) {
            copyOnWrite();
            ((GetSessionResponse) this.instance).setMessages(i, (ChatMessage) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        public final Builder addMessages(ChatMessage.Builder builder) {
            copyOnWrite();
            ((GetSessionResponse) this.instance).addMessages((ChatMessage) builder.build());
            return this;
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

        public final Builder addMessages(int i, ChatMessage.Builder builder) {
            copyOnWrite();
            ((GetSessionResponse) this.instance).addMessages(i, (ChatMessage) builder.build());
            return this;
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
        GetSessionResponse getSessionResponse = new GetSessionResponse();
        DEFAULT_INSTANCE = getSessionResponse;
        AbstractC0269h.registerDefaultInstance(GetSessionResponse.class, getSessionResponse);
    }

    private GetSessionResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMessages(Iterable<? extends ChatMessage> iterable) {
        ensureMessagesIsMutable();
        AbstractC2118m8.addAll(iterable, this.messages_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPopularPrompts(Iterable<String> iterable) {
        ensurePopularPromptsIsMutable();
        AbstractC2118m8.addAll(iterable, this.popularPrompts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSuggestedPrompts(Iterable<String> iterable) {
        ensureSuggestedPromptsIsMutable();
        AbstractC2118m8.addAll(iterable, this.suggestedPrompts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMessages(ChatMessage chatMessage) {
        chatMessage.getClass();
        ensureMessagesIsMutable();
        this.messages_.add(chatMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPopularPrompts(String str) {
        str.getClass();
        ensurePopularPromptsIsMutable();
        this.popularPrompts_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPopularPromptsBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        ensurePopularPromptsIsMutable();
        this.popularPrompts_.add(gvaVar.m45892u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSuggestedPrompts(String str) {
        str.getClass();
        ensureSuggestedPromptsIsMutable();
        this.suggestedPrompts_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSuggestedPromptsBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        ensureSuggestedPromptsIsMutable();
        this.suggestedPrompts_.add(gvaVar.m45892u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessages() {
        this.messages_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaylistUri() {
        this.playlistUri_ = DEFAULT_INSTANCE.playlistUri_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopularPrompts() {
        this.popularPrompts_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = DEFAULT_INSTANCE.sessionId_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuggestedPrompts() {
        this.suggestedPrompts_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWelcomeMessage() {
        this.bitField0_ &= -2;
        this.welcomeMessage_ = DEFAULT_INSTANCE.welcomeMessage_;
    }

    private void ensureMessagesIsMutable() {
        ae50 ae50Var = this.messages_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.messages_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    private void ensurePopularPromptsIsMutable() {
        ae50 ae50Var = this.popularPrompts_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.popularPrompts_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    private void ensureSuggestedPromptsIsMutable() {
        ae50 ae50Var = this.suggestedPrompts_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.suggestedPrompts_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    public static GetSessionResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetSessionResponse parseDelimitedFrom(InputStream inputStream) {
        return (GetSessionResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetSessionResponse parseFrom(ByteBuffer byteBuffer) {
        return (GetSessionResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMessages(int i) {
        ensureMessagesIsMutable();
        this.messages_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessages(int i, ChatMessage chatMessage) {
        chatMessage.getClass();
        ensureMessagesIsMutable();
        this.messages_.set(i, chatMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaylistUri(String str) {
        str.getClass();
        this.playlistUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaylistUriBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.playlistUri_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopularPrompts(int i, String str) {
        str.getClass();
        ensurePopularPromptsIsMutable();
        this.popularPrompts_.set(i, str);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestedPrompts(int i, String str) {
        str.getClass();
        ensureSuggestedPromptsIsMutable();
        this.suggestedPrompts_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWelcomeMessage(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.welcomeMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWelcomeMessageBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.welcomeMessage_ = gvaVar.m45892u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\b\u0006\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004Ț\u0005Ȉ\bለ\u0000", new Object[]{"bitField0_", "sessionId_", "messages_", ChatMessage.class, "suggestedPrompts_", "popularPrompts_", "playlistUri_", "welcomeMessage_"});
        }
        if (iOrdinal == 3) {
            return new GetSessionResponse();
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
        synchronized (GetSessionResponse.class) {
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

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
    public final ChatMessage getMessages(int i) {
        return (ChatMessage) this.messages_.get(i);
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
    public final int getMessagesCount() {
        return this.messages_.size();
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
    public final List<ChatMessage> getMessagesList() {
        return this.messages_;
    }

    public final ChatMessageOrBuilder getMessagesOrBuilder(int i) {
        return (ChatMessageOrBuilder) this.messages_.get(i);
    }

    public final List<? extends ChatMessageOrBuilder> getMessagesOrBuilderList() {
        return this.messages_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
    public final String getPlaylistUri() {
        return this.playlistUri_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
    public final gva getPlaylistUriBytes() {
        return gva.m45888f(this.playlistUri_);
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
    public final String getPopularPrompts(int i) {
        return (String) this.popularPrompts_.get(i);
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
    public final gva getPopularPromptsBytes(int i) {
        return gva.m45888f((String) this.popularPrompts_.get(i));
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
    public final int getPopularPromptsCount() {
        return this.popularPrompts_.size();
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
    public final List<String> getPopularPromptsList() {
        return this.popularPrompts_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
    public final String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
    public final gva getSessionIdBytes() {
        return gva.m45888f(this.sessionId_);
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
    public final String getSuggestedPrompts(int i) {
        return (String) this.suggestedPrompts_.get(i);
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
    public final gva getSuggestedPromptsBytes(int i) {
        return gva.m45888f((String) this.suggestedPrompts_.get(i));
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
    public final int getSuggestedPromptsCount() {
        return this.suggestedPrompts_.size();
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
    public final List<String> getSuggestedPromptsList() {
        return this.suggestedPrompts_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
    public final String getWelcomeMessage() {
        return this.welcomeMessage_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
    public final gva getWelcomeMessageBytes() {
        return gva.m45888f(this.welcomeMessage_);
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetSessionResponseOrBuilder
    public final boolean hasWelcomeMessage() {
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

    public static Builder newBuilder(GetSessionResponse getSessionResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getSessionResponse);
    }

    public static GetSessionResponse parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (GetSessionResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetSessionResponse parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (GetSessionResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static GetSessionResponse parseFrom(gva gvaVar) {
        return (GetSessionResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMessages(int i, ChatMessage chatMessage) {
        chatMessage.getClass();
        ensureMessagesIsMutable();
        this.messages_.add(i, chatMessage);
    }

    public static GetSessionResponse parseFrom(gva gvaVar, aux auxVar) {
        return (GetSessionResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static GetSessionResponse parseFrom(byte[] bArr) {
        return (GetSessionResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetSessionResponse parseFrom(byte[] bArr, aux auxVar) {
        return (GetSessionResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static GetSessionResponse parseFrom(InputStream inputStream) {
        return (GetSessionResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetSessionResponse parseFrom(InputStream inputStream, aux auxVar) {
        return (GetSessionResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetSessionResponse parseFrom(owe oweVar) {
        return (GetSessionResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static GetSessionResponse parseFrom(owe oweVar, aux auxVar) {
        return (GetSessionResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
