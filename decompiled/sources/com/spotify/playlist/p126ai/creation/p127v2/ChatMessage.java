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
public final class ChatMessage extends AbstractC0269h implements ChatMessageOrBuilder {
    private static final ChatMessage DEFAULT_INSTANCE;
    public static final int MESSAGE_ID_FIELD_NUMBER = 1;
    public static final int MESSAGE_PREFERENCES_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_FIELD_NUMBER = 6;
    public static final int SENDER_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 5;
    public static final int SUBMIT_TIMESTAMP_FIELD_NUMBER = 3;
    public static final int UPDATED_TIMESTAMP_FIELD_NUMBER = 4;
    private int bitField0_;
    private String messageId_ = "";
    private ChatMessagePreferences messagePreferences_;
    private Playlist playlist_;
    private int sender_;
    private Status status_;
    private long submitTimestamp_;
    private long updatedTimestamp_;

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.ChatMessage$1 */
    public static /* synthetic */ class C11731 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f6428xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f6428xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6428xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6428xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6428xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6428xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6428xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6428xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ChatMessageOrBuilder {
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
            ((ChatMessage) this.instance).clearMessageId();
            return this;
        }

        public final Builder clearMessagePreferences() {
            copyOnWrite();
            ((ChatMessage) this.instance).clearMessagePreferences();
            return this;
        }

        public final Builder clearPlaylist() {
            copyOnWrite();
            ((ChatMessage) this.instance).clearPlaylist();
            return this;
        }

        public final Builder clearSender() {
            copyOnWrite();
            ChatMessage.m18039q((ChatMessage) this.instance);
            return this;
        }

        public final Builder clearStatus() {
            copyOnWrite();
            ((ChatMessage) this.instance).clearStatus();
            return this;
        }

        public final Builder clearSubmitTimestamp() {
            copyOnWrite();
            ChatMessage.m18041s((ChatMessage) this.instance);
            return this;
        }

        public final Builder clearUpdatedTimestamp() {
            copyOnWrite();
            ChatMessage.m18042t((ChatMessage) this.instance);
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

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessageOrBuilder
        public final String getMessageId() {
            return ((ChatMessage) this.instance).getMessageId();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessageOrBuilder
        public final gva getMessageIdBytes() {
            return ((ChatMessage) this.instance).getMessageIdBytes();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessageOrBuilder
        public final ChatMessagePreferences getMessagePreferences() {
            return ((ChatMessage) this.instance).getMessagePreferences();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessageOrBuilder
        public final Playlist getPlaylist() {
            return ((ChatMessage) this.instance).getPlaylist();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessageOrBuilder
        public final Sender getSender() {
            return ((ChatMessage) this.instance).getSender();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessageOrBuilder
        public final int getSenderValue() {
            return ((ChatMessage) this.instance).getSenderValue();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessageOrBuilder
        public final Status getStatus() {
            return ((ChatMessage) this.instance).getStatus();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessageOrBuilder
        public final long getSubmitTimestamp() {
            return ((ChatMessage) this.instance).getSubmitTimestamp();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessageOrBuilder
        public final long getUpdatedTimestamp() {
            return ((ChatMessage) this.instance).getUpdatedTimestamp();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessageOrBuilder
        public final boolean hasMessagePreferences() {
            return ((ChatMessage) this.instance).hasMessagePreferences();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessageOrBuilder
        public final boolean hasPlaylist() {
            return ((ChatMessage) this.instance).hasPlaylist();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessageOrBuilder
        public final boolean hasStatus() {
            return ((ChatMessage) this.instance).hasStatus();
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
            ((ChatMessage) this.instance).mergeMessagePreferences(chatMessagePreferences);
            return this;
        }

        public final Builder mergePlaylist(Playlist playlist) {
            copyOnWrite();
            ((ChatMessage) this.instance).mergePlaylist(playlist);
            return this;
        }

        public final Builder mergeStatus(Status status) {
            copyOnWrite();
            ((ChatMessage) this.instance).mergeStatus(status);
            return this;
        }

        public final Builder setMessageId(String str) {
            copyOnWrite();
            ((ChatMessage) this.instance).setMessageId(str);
            return this;
        }

        public final Builder setMessageIdBytes(gva gvaVar) {
            copyOnWrite();
            ((ChatMessage) this.instance).setMessageIdBytes(gvaVar);
            return this;
        }

        public final Builder setMessagePreferences(ChatMessagePreferences chatMessagePreferences) {
            copyOnWrite();
            ((ChatMessage) this.instance).setMessagePreferences(chatMessagePreferences);
            return this;
        }

        public final Builder setPlaylist(Playlist playlist) {
            copyOnWrite();
            ((ChatMessage) this.instance).setPlaylist(playlist);
            return this;
        }

        public final Builder setSender(Sender sender) {
            copyOnWrite();
            ((ChatMessage) this.instance).setSender(sender);
            return this;
        }

        public final Builder setSenderValue(int i) {
            copyOnWrite();
            ChatMessage.m18031C(i, (ChatMessage) this.instance);
            return this;
        }

        public final Builder setStatus(Status status) {
            copyOnWrite();
            ((ChatMessage) this.instance).setStatus(status);
            return this;
        }

        public final Builder setSubmitTimestamp(long j) {
            copyOnWrite();
            ChatMessage.m18033E((ChatMessage) this.instance, j);
            return this;
        }

        public final Builder setUpdatedTimestamp(long j) {
            copyOnWrite();
            ChatMessage.m18034F((ChatMessage) this.instance, j);
            return this;
        }

        private Builder() {
            super(ChatMessage.DEFAULT_INSTANCE);
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

        public final Builder setMessagePreferences(ChatMessagePreferences.Builder builder) {
            copyOnWrite();
            ((ChatMessage) this.instance).setMessagePreferences((ChatMessagePreferences) builder.build());
            return this;
        }

        public final Builder setPlaylist(Playlist.Builder builder) {
            copyOnWrite();
            ((ChatMessage) this.instance).setPlaylist((Playlist) builder.build());
            return this;
        }

        public final Builder setStatus(Status.Builder builder) {
            copyOnWrite();
            ((ChatMessage) this.instance).setStatus((Status) builder.build());
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
        ChatMessage chatMessage = new ChatMessage();
        DEFAULT_INSTANCE = chatMessage;
        AbstractC0269h.registerDefaultInstance(ChatMessage.class, chatMessage);
    }

    private ChatMessage() {
    }

    /* JADX INFO: renamed from: C */
    public static void m18031C(int i, ChatMessage chatMessage) {
        chatMessage.sender_ = i;
    }

    /* JADX INFO: renamed from: E */
    public static void m18033E(ChatMessage chatMessage, long j) {
        chatMessage.submitTimestamp_ = j;
    }

    /* JADX INFO: renamed from: F */
    public static void m18034F(ChatMessage chatMessage, long j) {
        chatMessage.updatedTimestamp_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageId() {
        this.messageId_ = DEFAULT_INSTANCE.messageId_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessagePreferences() {
        this.messagePreferences_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaylist() {
        this.playlist_ = null;
        this.bitField0_ &= -3;
    }

    private void clearSender() {
        this.sender_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -2;
    }

    private void clearSubmitTimestamp() {
        this.submitTimestamp_ = 0L;
    }

    private void clearUpdatedTimestamp() {
        this.updatedTimestamp_ = 0L;
    }

    public static ChatMessage getDefaultInstance() {
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
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlaylist(Playlist playlist) {
        playlist.getClass();
        Playlist playlist2 = this.playlist_;
        if (playlist2 == null || playlist2 == Playlist.getDefaultInstance()) {
            this.playlist_ = playlist;
        } else {
            this.playlist_ = (Playlist) ((Playlist.Builder) Playlist.newBuilder(this.playlist_).mergeFrom((AbstractC0269h) playlist)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatus(Status status) {
        status.getClass();
        Status status2 = this.status_;
        if (status2 == null || status2 == Status.getDefaultInstance()) {
            this.status_ = status;
        } else {
            this.status_ = (Status) ((Status.Builder) Status.newBuilder(this.status_).mergeFrom((AbstractC0269h) status)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ChatMessage parseDelimitedFrom(InputStream inputStream) {
        return (ChatMessage) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChatMessage parseFrom(ByteBuffer byteBuffer) {
        return (ChatMessage) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m18039q(ChatMessage chatMessage) {
        chatMessage.sender_ = 0;
    }

    /* JADX INFO: renamed from: s */
    public static void m18041s(ChatMessage chatMessage) {
        chatMessage.submitTimestamp_ = 0L;
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
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaylist(Playlist playlist) {
        playlist.getClass();
        this.playlist_ = playlist;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSender(Sender sender) {
        this.sender_ = sender.getNumber();
    }

    private void setSenderValue(int i) {
        this.sender_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(Status status) {
        status.getClass();
        this.status_ = status;
        this.bitField0_ |= 1;
    }

    private void setSubmitTimestamp(long j) {
        this.submitTimestamp_ = j;
    }

    private void setUpdatedTimestamp(long j) {
        this.updatedTimestamp_ = j;
    }

    /* JADX INFO: renamed from: t */
    public static void m18042t(ChatMessage chatMessage) {
        chatMessage.updatedTimestamp_ = 0L;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0002\u0004\u0002\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002", new Object[]{"bitField0_", "messageId_", "sender_", "submitTimestamp_", "updatedTimestamp_", "status_", "playlist_", "messagePreferences_"});
        }
        if (iOrdinal == 3) {
            return new ChatMessage();
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
        synchronized (ChatMessage.class) {
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

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessageOrBuilder
    public final String getMessageId() {
        return this.messageId_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessageOrBuilder
    public final gva getMessageIdBytes() {
        return gva.m45888f(this.messageId_);
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessageOrBuilder
    public final ChatMessagePreferences getMessagePreferences() {
        ChatMessagePreferences chatMessagePreferences = this.messagePreferences_;
        return chatMessagePreferences == null ? ChatMessagePreferences.getDefaultInstance() : chatMessagePreferences;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessageOrBuilder
    public final Playlist getPlaylist() {
        Playlist playlist = this.playlist_;
        return playlist == null ? Playlist.getDefaultInstance() : playlist;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessageOrBuilder
    public final Sender getSender() {
        Sender senderForNumber = Sender.forNumber(this.sender_);
        return senderForNumber == null ? Sender.UNRECOGNIZED : senderForNumber;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessageOrBuilder
    public final int getSenderValue() {
        return this.sender_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessageOrBuilder
    public final Status getStatus() {
        Status status = this.status_;
        return status == null ? Status.getDefaultInstance() : status;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessageOrBuilder
    public final long getSubmitTimestamp() {
        return this.submitTimestamp_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessageOrBuilder
    public final long getUpdatedTimestamp() {
        return this.updatedTimestamp_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessageOrBuilder
    public final boolean hasMessagePreferences() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessageOrBuilder
    public final boolean hasPlaylist() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ChatMessageOrBuilder
    public final boolean hasStatus() {
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

    public static Builder newBuilder(ChatMessage chatMessage) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(chatMessage);
    }

    public static ChatMessage parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ChatMessage) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ChatMessage parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ChatMessage) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ChatMessage parseFrom(gva gvaVar) {
        return (ChatMessage) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static ChatMessage parseFrom(gva gvaVar, aux auxVar) {
        return (ChatMessage) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ChatMessage parseFrom(byte[] bArr) {
        return (ChatMessage) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ChatMessage parseFrom(byte[] bArr, aux auxVar) {
        return (ChatMessage) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ChatMessage parseFrom(InputStream inputStream) {
        return (ChatMessage) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChatMessage parseFrom(InputStream inputStream, aux auxVar) {
        return (ChatMessage) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ChatMessage parseFrom(owe oweVar) {
        return (ChatMessage) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ChatMessage parseFrom(owe oweVar, aux auxVar) {
        return (ChatMessage) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
