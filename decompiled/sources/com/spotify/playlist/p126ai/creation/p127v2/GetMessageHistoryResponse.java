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
public final class GetMessageHistoryResponse extends AbstractC0269h implements GetMessageHistoryResponseOrBuilder {
    private static final GetMessageHistoryResponse DEFAULT_INSTANCE;
    public static final int MESSAGES_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ae50 messages_ = AbstractC0269h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.GetMessageHistoryResponse$1 */
    public static /* synthetic */ class C11791 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f6434xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f6434xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6434xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6434xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6434xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6434xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6434xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6434xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements GetMessageHistoryResponseOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final Builder addAllMessages(Iterable<? extends ChatMessage> iterable) {
            copyOnWrite();
            ((GetMessageHistoryResponse) this.instance).addAllMessages(iterable);
            return this;
        }

        public final Builder addMessages(ChatMessage chatMessage) {
            copyOnWrite();
            ((GetMessageHistoryResponse) this.instance).addMessages(chatMessage);
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
            ((GetMessageHistoryResponse) this.instance).clearMessages();
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

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageHistoryResponseOrBuilder
        public final ChatMessage getMessages(int i) {
            return ((GetMessageHistoryResponse) this.instance).getMessages(i);
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageHistoryResponseOrBuilder
        public final int getMessagesCount() {
            return ((GetMessageHistoryResponse) this.instance).getMessagesCount();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageHistoryResponseOrBuilder
        public final List<ChatMessage> getMessagesList() {
            return Collections.unmodifiableList(((GetMessageHistoryResponse) this.instance).getMessagesList());
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
            ((GetMessageHistoryResponse) this.instance).removeMessages(i);
            return this;
        }

        public final Builder setMessages(int i, ChatMessage chatMessage) {
            copyOnWrite();
            ((GetMessageHistoryResponse) this.instance).setMessages(i, chatMessage);
            return this;
        }

        private Builder() {
            super(GetMessageHistoryResponse.DEFAULT_INSTANCE);
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

        public final Builder addMessages(int i, ChatMessage chatMessage) {
            copyOnWrite();
            ((GetMessageHistoryResponse) this.instance).addMessages(i, chatMessage);
            return this;
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

        public final Builder setMessages(int i, ChatMessage.Builder builder) {
            copyOnWrite();
            ((GetMessageHistoryResponse) this.instance).setMessages(i, (ChatMessage) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        public final Builder addMessages(ChatMessage.Builder builder) {
            copyOnWrite();
            ((GetMessageHistoryResponse) this.instance).addMessages((ChatMessage) builder.build());
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
            ((GetMessageHistoryResponse) this.instance).addMessages(i, (ChatMessage) builder.build());
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
        GetMessageHistoryResponse getMessageHistoryResponse = new GetMessageHistoryResponse();
        DEFAULT_INSTANCE = getMessageHistoryResponse;
        AbstractC0269h.registerDefaultInstance(GetMessageHistoryResponse.class, getMessageHistoryResponse);
    }

    private GetMessageHistoryResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMessages(Iterable<? extends ChatMessage> iterable) {
        ensureMessagesIsMutable();
        AbstractC2118m8.addAll(iterable, this.messages_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMessages(ChatMessage chatMessage) {
        chatMessage.getClass();
        ensureMessagesIsMutable();
        this.messages_.add(chatMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessages() {
        this.messages_ = AbstractC0269h.emptyProtobufList();
    }

    private void ensureMessagesIsMutable() {
        ae50 ae50Var = this.messages_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.messages_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    public static GetMessageHistoryResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetMessageHistoryResponse parseDelimitedFrom(InputStream inputStream) {
        return (GetMessageHistoryResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetMessageHistoryResponse parseFrom(ByteBuffer byteBuffer) {
        return (GetMessageHistoryResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"messages_", ChatMessage.class});
        }
        if (iOrdinal == 3) {
            return new GetMessageHistoryResponse();
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
        synchronized (GetMessageHistoryResponse.class) {
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

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageHistoryResponseOrBuilder
    public final ChatMessage getMessages(int i) {
        return (ChatMessage) this.messages_.get(i);
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageHistoryResponseOrBuilder
    public final int getMessagesCount() {
        return this.messages_.size();
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageHistoryResponseOrBuilder
    public final List<ChatMessage> getMessagesList() {
        return this.messages_;
    }

    public final ChatMessageOrBuilder getMessagesOrBuilder(int i) {
        return (ChatMessageOrBuilder) this.messages_.get(i);
    }

    public final List<? extends ChatMessageOrBuilder> getMessagesOrBuilderList() {
        return this.messages_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(GetMessageHistoryResponse getMessageHistoryResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getMessageHistoryResponse);
    }

    public static GetMessageHistoryResponse parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (GetMessageHistoryResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetMessageHistoryResponse parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (GetMessageHistoryResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static GetMessageHistoryResponse parseFrom(gva gvaVar) {
        return (GetMessageHistoryResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMessages(int i, ChatMessage chatMessage) {
        chatMessage.getClass();
        ensureMessagesIsMutable();
        this.messages_.add(i, chatMessage);
    }

    public static GetMessageHistoryResponse parseFrom(gva gvaVar, aux auxVar) {
        return (GetMessageHistoryResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static GetMessageHistoryResponse parseFrom(byte[] bArr) {
        return (GetMessageHistoryResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetMessageHistoryResponse parseFrom(byte[] bArr, aux auxVar) {
        return (GetMessageHistoryResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static GetMessageHistoryResponse parseFrom(InputStream inputStream) {
        return (GetMessageHistoryResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetMessageHistoryResponse parseFrom(InputStream inputStream, aux auxVar) {
        return (GetMessageHistoryResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetMessageHistoryResponse parseFrom(owe oweVar) {
        return (GetMessageHistoryResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static GetMessageHistoryResponse parseFrom(owe oweVar, aux auxVar) {
        return (GetMessageHistoryResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
