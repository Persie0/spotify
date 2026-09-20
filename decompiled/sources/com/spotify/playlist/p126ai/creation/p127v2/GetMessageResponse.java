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
public final class GetMessageResponse extends AbstractC0269h implements GetMessageResponseOrBuilder {
    private static final GetMessageResponse DEFAULT_INSTANCE;
    public static final int MESSAGE_PREFERENCES_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_FIELD_NUMBER = 4;
    public static final int RETRY_AFTER_MS_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int SUBMIT_TIMESTAMP_MS_FIELD_NUMBER = 3;
    private int bitField0_;
    private ChatMessagePreferences messagePreferences_;
    private Playlist playlist_;
    private int retryAfterMs_;
    private Status status_;
    private long submitTimestampMs_;

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.GetMessageResponse$1 */
    public static /* synthetic */ class C11811 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f6436xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f6436xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6436xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6436xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6436xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6436xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6436xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6436xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements GetMessageResponseOrBuilder {
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
            ((GetMessageResponse) this.instance).clearMessagePreferences();
            return this;
        }

        public final Builder clearPlaylist() {
            copyOnWrite();
            ((GetMessageResponse) this.instance).clearPlaylist();
            return this;
        }

        public final Builder clearRetryAfterMs() {
            copyOnWrite();
            GetMessageResponse.m18106p((GetMessageResponse) this.instance);
            return this;
        }

        public final Builder clearStatus() {
            copyOnWrite();
            ((GetMessageResponse) this.instance).clearStatus();
            return this;
        }

        public final Builder clearSubmitTimestampMs() {
            copyOnWrite();
            GetMessageResponse.m18108r((GetMessageResponse) this.instance);
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

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageResponseOrBuilder
        public final ChatMessagePreferences getMessagePreferences() {
            return ((GetMessageResponse) this.instance).getMessagePreferences();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageResponseOrBuilder
        public final Playlist getPlaylist() {
            return ((GetMessageResponse) this.instance).getPlaylist();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageResponseOrBuilder
        public final int getRetryAfterMs() {
            return ((GetMessageResponse) this.instance).getRetryAfterMs();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageResponseOrBuilder
        public final Status getStatus() {
            return ((GetMessageResponse) this.instance).getStatus();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageResponseOrBuilder
        public final long getSubmitTimestampMs() {
            return ((GetMessageResponse) this.instance).getSubmitTimestampMs();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageResponseOrBuilder
        public final boolean hasMessagePreferences() {
            return ((GetMessageResponse) this.instance).hasMessagePreferences();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageResponseOrBuilder
        public final boolean hasPlaylist() {
            return ((GetMessageResponse) this.instance).hasPlaylist();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageResponseOrBuilder
        public final boolean hasStatus() {
            return ((GetMessageResponse) this.instance).hasStatus();
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
            ((GetMessageResponse) this.instance).mergeMessagePreferences(chatMessagePreferences);
            return this;
        }

        public final Builder mergePlaylist(Playlist playlist) {
            copyOnWrite();
            ((GetMessageResponse) this.instance).mergePlaylist(playlist);
            return this;
        }

        public final Builder mergeStatus(Status status) {
            copyOnWrite();
            ((GetMessageResponse) this.instance).mergeStatus(status);
            return this;
        }

        public final Builder setMessagePreferences(ChatMessagePreferences chatMessagePreferences) {
            copyOnWrite();
            ((GetMessageResponse) this.instance).setMessagePreferences(chatMessagePreferences);
            return this;
        }

        public final Builder setPlaylist(Playlist playlist) {
            copyOnWrite();
            ((GetMessageResponse) this.instance).setPlaylist(playlist);
            return this;
        }

        public final Builder setRetryAfterMs(int i) {
            copyOnWrite();
            GetMessageResponse.m18114x((GetMessageResponse) this.instance, i);
            return this;
        }

        public final Builder setStatus(Status status) {
            copyOnWrite();
            ((GetMessageResponse) this.instance).setStatus(status);
            return this;
        }

        public final Builder setSubmitTimestampMs(long j) {
            copyOnWrite();
            GetMessageResponse.m18116z((GetMessageResponse) this.instance, j);
            return this;
        }

        private Builder() {
            super(GetMessageResponse.DEFAULT_INSTANCE);
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
            ((GetMessageResponse) this.instance).setMessagePreferences((ChatMessagePreferences) builder.build());
            return this;
        }

        public final Builder setPlaylist(Playlist.Builder builder) {
            copyOnWrite();
            ((GetMessageResponse) this.instance).setPlaylist((Playlist) builder.build());
            return this;
        }

        public final Builder setStatus(Status.Builder builder) {
            copyOnWrite();
            ((GetMessageResponse) this.instance).setStatus((Status) builder.build());
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
        GetMessageResponse getMessageResponse = new GetMessageResponse();
        DEFAULT_INSTANCE = getMessageResponse;
        AbstractC0269h.registerDefaultInstance(GetMessageResponse.class, getMessageResponse);
    }

    private GetMessageResponse() {
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

    private void clearRetryAfterMs() {
        this.retryAfterMs_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -2;
    }

    private void clearSubmitTimestampMs() {
        this.submitTimestampMs_ = 0L;
    }

    public static GetMessageResponse getDefaultInstance() {
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

    /* JADX INFO: renamed from: p */
    public static void m18106p(GetMessageResponse getMessageResponse) {
        getMessageResponse.retryAfterMs_ = 0;
    }

    public static GetMessageResponse parseDelimitedFrom(InputStream inputStream) {
        return (GetMessageResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetMessageResponse parseFrom(ByteBuffer byteBuffer) {
        return (GetMessageResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static void m18108r(GetMessageResponse getMessageResponse) {
        getMessageResponse.submitTimestampMs_ = 0L;
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

    private void setRetryAfterMs(int i) {
        this.retryAfterMs_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(Status status) {
        status.getClass();
        this.status_ = status;
        this.bitField0_ |= 1;
    }

    private void setSubmitTimestampMs(long j) {
        this.submitTimestampMs_ = j;
    }

    /* JADX INFO: renamed from: x */
    public static void m18114x(GetMessageResponse getMessageResponse, int i) {
        getMessageResponse.retryAfterMs_ = i;
    }

    /* JADX INFO: renamed from: z */
    public static void m18116z(GetMessageResponse getMessageResponse, long j) {
        getMessageResponse.submitTimestampMs_ = j;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004\u0003\u0002\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "status_", "retryAfterMs_", "submitTimestampMs_", "playlist_", "messagePreferences_"});
        }
        if (iOrdinal == 3) {
            return new GetMessageResponse();
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
        synchronized (GetMessageResponse.class) {
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

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageResponseOrBuilder
    public final ChatMessagePreferences getMessagePreferences() {
        ChatMessagePreferences chatMessagePreferences = this.messagePreferences_;
        return chatMessagePreferences == null ? ChatMessagePreferences.getDefaultInstance() : chatMessagePreferences;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageResponseOrBuilder
    public final Playlist getPlaylist() {
        Playlist playlist = this.playlist_;
        return playlist == null ? Playlist.getDefaultInstance() : playlist;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageResponseOrBuilder
    public final int getRetryAfterMs() {
        return this.retryAfterMs_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageResponseOrBuilder
    public final Status getStatus() {
        Status status = this.status_;
        return status == null ? Status.getDefaultInstance() : status;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageResponseOrBuilder
    public final long getSubmitTimestampMs() {
        return this.submitTimestampMs_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageResponseOrBuilder
    public final boolean hasMessagePreferences() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageResponseOrBuilder
    public final boolean hasPlaylist() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageResponseOrBuilder
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

    public static Builder newBuilder(GetMessageResponse getMessageResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getMessageResponse);
    }

    public static GetMessageResponse parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (GetMessageResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetMessageResponse parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (GetMessageResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static GetMessageResponse parseFrom(gva gvaVar) {
        return (GetMessageResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static GetMessageResponse parseFrom(gva gvaVar, aux auxVar) {
        return (GetMessageResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static GetMessageResponse parseFrom(byte[] bArr) {
        return (GetMessageResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetMessageResponse parseFrom(byte[] bArr, aux auxVar) {
        return (GetMessageResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static GetMessageResponse parseFrom(InputStream inputStream) {
        return (GetMessageResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetMessageResponse parseFrom(InputStream inputStream, aux auxVar) {
        return (GetMessageResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetMessageResponse parseFrom(owe oweVar) {
        return (GetMessageResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static GetMessageResponse parseFrom(owe oweVar, aux auxVar) {
        return (GetMessageResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
