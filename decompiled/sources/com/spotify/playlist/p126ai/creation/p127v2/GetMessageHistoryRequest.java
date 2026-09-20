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
public final class GetMessageHistoryRequest extends AbstractC0269h implements GetMessageHistoryRequestOrBuilder {
    public static final int AFTER_TIMESTAMP_MS_FIELD_NUMBER = 2;
    public static final int BEFORE_TIMESTAMP_MS_FIELD_NUMBER = 3;
    private static final GetMessageHistoryRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private long afterTimestampMs_;
    private long beforeTimestampMs_;
    private String sessionId_ = "";

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.GetMessageHistoryRequest$1 */
    public static /* synthetic */ class C11781 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f6433xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f6433xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6433xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6433xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6433xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6433xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6433xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6433xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements GetMessageHistoryRequestOrBuilder {
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

        public final Builder clearAfterTimestampMs() {
            copyOnWrite();
            GetMessageHistoryRequest.m18081n((GetMessageHistoryRequest) this.instance);
            return this;
        }

        public final Builder clearBeforeTimestampMs() {
            copyOnWrite();
            GetMessageHistoryRequest.m18082o((GetMessageHistoryRequest) this.instance);
            return this;
        }

        public final Builder clearSessionId() {
            copyOnWrite();
            ((GetMessageHistoryRequest) this.instance).clearSessionId();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public final /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageHistoryRequestOrBuilder
        public final long getAfterTimestampMs() {
            return ((GetMessageHistoryRequest) this.instance).getAfterTimestampMs();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageHistoryRequestOrBuilder
        public final long getBeforeTimestampMs() {
            return ((GetMessageHistoryRequest) this.instance).getBeforeTimestampMs();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageHistoryRequestOrBuilder
        public final String getSessionId() {
            return ((GetMessageHistoryRequest) this.instance).getSessionId();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageHistoryRequestOrBuilder
        public final gva getSessionIdBytes() {
            return ((GetMessageHistoryRequest) this.instance).getSessionIdBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public final /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public final Builder setAfterTimestampMs(long j) {
            copyOnWrite();
            GetMessageHistoryRequest.m18084q((GetMessageHistoryRequest) this.instance, j);
            return this;
        }

        public final Builder setBeforeTimestampMs(long j) {
            copyOnWrite();
            GetMessageHistoryRequest.m18085r((GetMessageHistoryRequest) this.instance, j);
            return this;
        }

        public final Builder setSessionId(String str) {
            copyOnWrite();
            ((GetMessageHistoryRequest) this.instance).setSessionId(str);
            return this;
        }

        public final Builder setSessionIdBytes(gva gvaVar) {
            copyOnWrite();
            ((GetMessageHistoryRequest) this.instance).setSessionIdBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(GetMessageHistoryRequest.DEFAULT_INSTANCE);
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
        GetMessageHistoryRequest getMessageHistoryRequest = new GetMessageHistoryRequest();
        DEFAULT_INSTANCE = getMessageHistoryRequest;
        AbstractC0269h.registerDefaultInstance(GetMessageHistoryRequest.class, getMessageHistoryRequest);
    }

    private GetMessageHistoryRequest() {
    }

    private void clearAfterTimestampMs() {
        this.afterTimestampMs_ = 0L;
    }

    private void clearBeforeTimestampMs() {
        this.beforeTimestampMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = DEFAULT_INSTANCE.sessionId_;
    }

    public static GetMessageHistoryRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static void m18081n(GetMessageHistoryRequest getMessageHistoryRequest) {
        getMessageHistoryRequest.afterTimestampMs_ = 0L;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: o */
    public static void m18082o(GetMessageHistoryRequest getMessageHistoryRequest) {
        getMessageHistoryRequest.beforeTimestampMs_ = 0L;
    }

    public static GetMessageHistoryRequest parseDelimitedFrom(InputStream inputStream) {
        return (GetMessageHistoryRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetMessageHistoryRequest parseFrom(ByteBuffer byteBuffer) {
        return (GetMessageHistoryRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m18084q(GetMessageHistoryRequest getMessageHistoryRequest, long j) {
        getMessageHistoryRequest.afterTimestampMs_ = j;
    }

    /* JADX INFO: renamed from: r */
    public static void m18085r(GetMessageHistoryRequest getMessageHistoryRequest, long j) {
        getMessageHistoryRequest.beforeTimestampMs_ = j;
    }

    private void setAfterTimestampMs(long j) {
        this.afterTimestampMs_ = j;
    }

    private void setBeforeTimestampMs(long j) {
        this.beforeTimestampMs_ = j;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002", new Object[]{"sessionId_", "afterTimestampMs_", "beforeTimestampMs_"});
        }
        if (iOrdinal == 3) {
            return new GetMessageHistoryRequest();
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
        synchronized (GetMessageHistoryRequest.class) {
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

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageHistoryRequestOrBuilder
    public final long getAfterTimestampMs() {
        return this.afterTimestampMs_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageHistoryRequestOrBuilder
    public final long getBeforeTimestampMs() {
        return this.beforeTimestampMs_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageHistoryRequestOrBuilder
    public final String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.GetMessageHistoryRequestOrBuilder
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

    public static Builder newBuilder(GetMessageHistoryRequest getMessageHistoryRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getMessageHistoryRequest);
    }

    public static GetMessageHistoryRequest parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (GetMessageHistoryRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetMessageHistoryRequest parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (GetMessageHistoryRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static GetMessageHistoryRequest parseFrom(gva gvaVar) {
        return (GetMessageHistoryRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static GetMessageHistoryRequest parseFrom(gva gvaVar, aux auxVar) {
        return (GetMessageHistoryRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static GetMessageHistoryRequest parseFrom(byte[] bArr) {
        return (GetMessageHistoryRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetMessageHistoryRequest parseFrom(byte[] bArr, aux auxVar) {
        return (GetMessageHistoryRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static GetMessageHistoryRequest parseFrom(InputStream inputStream) {
        return (GetMessageHistoryRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetMessageHistoryRequest parseFrom(InputStream inputStream, aux auxVar) {
        return (GetMessageHistoryRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetMessageHistoryRequest parseFrom(owe oweVar) {
        return (GetMessageHistoryRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static GetMessageHistoryRequest parseFrom(owe oweVar, aux auxVar) {
        return (GetMessageHistoryRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
