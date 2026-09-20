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
public final class SubmitMessageResponse extends AbstractC0269h implements SubmitMessageResponseOrBuilder {
    private static final SubmitMessageResponse DEFAULT_INSTANCE;
    public static final int MESSAGE_ID_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int RETRY_AFTER_MS_FIELD_NUMBER = 5;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int SUBMIT_TIMESTAMP_MS_FIELD_NUMBER = 4;
    private int bitField0_;
    private int retryAfterMs_;
    private Status status_;
    private long submitTimestampMs_;
    private String sessionId_ = "";
    private String messageId_ = "";

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.SubmitMessageResponse$1 */
    public static /* synthetic */ class C12001 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f6453xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f6453xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6453xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6453xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6453xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6453xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6453xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6453xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements SubmitMessageResponseOrBuilder {
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
            ((SubmitMessageResponse) this.instance).clearMessageId();
            return this;
        }

        public final Builder clearRetryAfterMs() {
            copyOnWrite();
            SubmitMessageResponse.m18263o((SubmitMessageResponse) this.instance);
            return this;
        }

        public final Builder clearSessionId() {
            copyOnWrite();
            ((SubmitMessageResponse) this.instance).clearSessionId();
            return this;
        }

        public final Builder clearStatus() {
            copyOnWrite();
            ((SubmitMessageResponse) this.instance).clearStatus();
            return this;
        }

        public final Builder clearSubmitTimestampMs() {
            copyOnWrite();
            SubmitMessageResponse.m18266r((SubmitMessageResponse) this.instance);
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

        @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageResponseOrBuilder
        public final String getMessageId() {
            return ((SubmitMessageResponse) this.instance).getMessageId();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageResponseOrBuilder
        public final gva getMessageIdBytes() {
            return ((SubmitMessageResponse) this.instance).getMessageIdBytes();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageResponseOrBuilder
        public final int getRetryAfterMs() {
            return ((SubmitMessageResponse) this.instance).getRetryAfterMs();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageResponseOrBuilder
        public final String getSessionId() {
            return ((SubmitMessageResponse) this.instance).getSessionId();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageResponseOrBuilder
        public final gva getSessionIdBytes() {
            return ((SubmitMessageResponse) this.instance).getSessionIdBytes();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageResponseOrBuilder
        public final Status getStatus() {
            return ((SubmitMessageResponse) this.instance).getStatus();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageResponseOrBuilder
        public final long getSubmitTimestampMs() {
            return ((SubmitMessageResponse) this.instance).getSubmitTimestampMs();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageResponseOrBuilder
        public final boolean hasStatus() {
            return ((SubmitMessageResponse) this.instance).hasStatus();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public final /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public final Builder mergeStatus(Status status) {
            copyOnWrite();
            ((SubmitMessageResponse) this.instance).mergeStatus(status);
            return this;
        }

        public final Builder setMessageId(String str) {
            copyOnWrite();
            ((SubmitMessageResponse) this.instance).setMessageId(str);
            return this;
        }

        public final Builder setMessageIdBytes(gva gvaVar) {
            copyOnWrite();
            ((SubmitMessageResponse) this.instance).setMessageIdBytes(gvaVar);
            return this;
        }

        public final Builder setRetryAfterMs(int i) {
            copyOnWrite();
            SubmitMessageResponse.m18270v((SubmitMessageResponse) this.instance, i);
            return this;
        }

        public final Builder setSessionId(String str) {
            copyOnWrite();
            ((SubmitMessageResponse) this.instance).setSessionId(str);
            return this;
        }

        public final Builder setSessionIdBytes(gva gvaVar) {
            copyOnWrite();
            ((SubmitMessageResponse) this.instance).setSessionIdBytes(gvaVar);
            return this;
        }

        public final Builder setStatus(Status status) {
            copyOnWrite();
            ((SubmitMessageResponse) this.instance).setStatus(status);
            return this;
        }

        public final Builder setSubmitTimestampMs(long j) {
            copyOnWrite();
            SubmitMessageResponse.m18274z((SubmitMessageResponse) this.instance, j);
            return this;
        }

        private Builder() {
            super(SubmitMessageResponse.DEFAULT_INSTANCE);
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

        public final Builder setStatus(Status.Builder builder) {
            copyOnWrite();
            ((SubmitMessageResponse) this.instance).setStatus((Status) builder.build());
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
        SubmitMessageResponse submitMessageResponse = new SubmitMessageResponse();
        DEFAULT_INSTANCE = submitMessageResponse;
        AbstractC0269h.registerDefaultInstance(SubmitMessageResponse.class, submitMessageResponse);
    }

    private SubmitMessageResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageId() {
        this.messageId_ = DEFAULT_INSTANCE.messageId_;
    }

    private void clearRetryAfterMs() {
        this.retryAfterMs_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = DEFAULT_INSTANCE.sessionId_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -2;
    }

    private void clearSubmitTimestampMs() {
        this.submitTimestampMs_ = 0L;
    }

    public static SubmitMessageResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
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

    /* JADX INFO: renamed from: o */
    public static void m18263o(SubmitMessageResponse submitMessageResponse) {
        submitMessageResponse.retryAfterMs_ = 0;
    }

    public static SubmitMessageResponse parseDelimitedFrom(InputStream inputStream) {
        return (SubmitMessageResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SubmitMessageResponse parseFrom(ByteBuffer byteBuffer) {
        return (SubmitMessageResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static void m18266r(SubmitMessageResponse submitMessageResponse) {
        submitMessageResponse.submitTimestampMs_ = 0L;
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

    private void setRetryAfterMs(int i) {
        this.retryAfterMs_ = i;
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
    public void setStatus(Status status) {
        status.getClass();
        this.status_ = status;
        this.bitField0_ |= 1;
    }

    private void setSubmitTimestampMs(long j) {
        this.submitTimestampMs_ = j;
    }

    /* JADX INFO: renamed from: v */
    public static void m18270v(SubmitMessageResponse submitMessageResponse, int i) {
        submitMessageResponse.retryAfterMs_ = i;
    }

    /* JADX INFO: renamed from: z */
    public static void m18274z(SubmitMessageResponse submitMessageResponse, long j) {
        submitMessageResponse.submitTimestampMs_ = j;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004\u0002\u0005\u0004", new Object[]{"bitField0_", "status_", "sessionId_", "messageId_", "submitTimestampMs_", "retryAfterMs_"});
        }
        if (iOrdinal == 3) {
            return new SubmitMessageResponse();
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
        synchronized (SubmitMessageResponse.class) {
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

    @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageResponseOrBuilder
    public final String getMessageId() {
        return this.messageId_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageResponseOrBuilder
    public final gva getMessageIdBytes() {
        return gva.m45888f(this.messageId_);
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageResponseOrBuilder
    public final int getRetryAfterMs() {
        return this.retryAfterMs_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageResponseOrBuilder
    public final String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageResponseOrBuilder
    public final gva getSessionIdBytes() {
        return gva.m45888f(this.sessionId_);
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageResponseOrBuilder
    public final Status getStatus() {
        Status status = this.status_;
        return status == null ? Status.getDefaultInstance() : status;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageResponseOrBuilder
    public final long getSubmitTimestampMs() {
        return this.submitTimestampMs_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.SubmitMessageResponseOrBuilder
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

    public static Builder newBuilder(SubmitMessageResponse submitMessageResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(submitMessageResponse);
    }

    public static SubmitMessageResponse parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (SubmitMessageResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static SubmitMessageResponse parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (SubmitMessageResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static SubmitMessageResponse parseFrom(gva gvaVar) {
        return (SubmitMessageResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static SubmitMessageResponse parseFrom(gva gvaVar, aux auxVar) {
        return (SubmitMessageResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static SubmitMessageResponse parseFrom(byte[] bArr) {
        return (SubmitMessageResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SubmitMessageResponse parseFrom(byte[] bArr, aux auxVar) {
        return (SubmitMessageResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static SubmitMessageResponse parseFrom(InputStream inputStream) {
        return (SubmitMessageResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SubmitMessageResponse parseFrom(InputStream inputStream, aux auxVar) {
        return (SubmitMessageResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static SubmitMessageResponse parseFrom(owe oweVar) {
        return (SubmitMessageResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static SubmitMessageResponse parseFrom(owe oweVar, aux auxVar) {
        return (SubmitMessageResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
