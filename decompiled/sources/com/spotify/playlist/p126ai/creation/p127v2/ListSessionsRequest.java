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
public final class ListSessionsRequest extends AbstractC0269h implements ListSessionsRequestOrBuilder {
    private static final ListSessionsRequest DEFAULT_INSTANCE;
    public static final int MESSAGE_LIMIT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SESSION_LIMIT_FIELD_NUMBER = 1;
    private int messageLimit_;
    private int sessionLimit_;

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.ListSessionsRequest$1 */
    public static /* synthetic */ class C11871 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f6442xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f6442xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6442xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6442xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6442xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6442xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6442xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6442xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ListSessionsRequestOrBuilder {
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

        public final Builder clearMessageLimit() {
            copyOnWrite();
            ListSessionsRequest.m18178n((ListSessionsRequest) this.instance);
            return this;
        }

        public final Builder clearSessionLimit() {
            copyOnWrite();
            ListSessionsRequest.m18179o((ListSessionsRequest) this.instance);
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

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ListSessionsRequestOrBuilder
        public final int getMessageLimit() {
            return ((ListSessionsRequest) this.instance).getMessageLimit();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ListSessionsRequestOrBuilder
        public final int getSessionLimit() {
            return ((ListSessionsRequest) this.instance).getSessionLimit();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public final /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public final Builder setMessageLimit(int i) {
            copyOnWrite();
            ListSessionsRequest.m18180p((ListSessionsRequest) this.instance, i);
            return this;
        }

        public final Builder setSessionLimit(int i) {
            copyOnWrite();
            ListSessionsRequest.m18181q((ListSessionsRequest) this.instance, i);
            return this;
        }

        private Builder() {
            super(ListSessionsRequest.DEFAULT_INSTANCE);
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
        ListSessionsRequest listSessionsRequest = new ListSessionsRequest();
        DEFAULT_INSTANCE = listSessionsRequest;
        AbstractC0269h.registerDefaultInstance(ListSessionsRequest.class, listSessionsRequest);
    }

    private ListSessionsRequest() {
    }

    private void clearMessageLimit() {
        this.messageLimit_ = 0;
    }

    private void clearSessionLimit() {
        this.sessionLimit_ = 0;
    }

    public static ListSessionsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static void m18178n(ListSessionsRequest listSessionsRequest) {
        listSessionsRequest.messageLimit_ = 0;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: o */
    public static void m18179o(ListSessionsRequest listSessionsRequest) {
        listSessionsRequest.sessionLimit_ = 0;
    }

    /* JADX INFO: renamed from: p */
    public static void m18180p(ListSessionsRequest listSessionsRequest, int i) {
        listSessionsRequest.messageLimit_ = i;
    }

    public static ListSessionsRequest parseDelimitedFrom(InputStream inputStream) {
        return (ListSessionsRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListSessionsRequest parseFrom(ByteBuffer byteBuffer) {
        return (ListSessionsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m18181q(ListSessionsRequest listSessionsRequest, int i) {
        listSessionsRequest.sessionLimit_ = i;
    }

    private void setMessageLimit(int i) {
        this.messageLimit_ = i;
    }

    private void setSessionLimit(int i) {
        this.sessionLimit_ = i;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"sessionLimit_", "messageLimit_"});
        }
        if (iOrdinal == 3) {
            return new ListSessionsRequest();
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
        synchronized (ListSessionsRequest.class) {
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

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ListSessionsRequestOrBuilder
    public final int getMessageLimit() {
        return this.messageLimit_;
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ListSessionsRequestOrBuilder
    public final int getSessionLimit() {
        return this.sessionLimit_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ListSessionsRequest listSessionsRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(listSessionsRequest);
    }

    public static ListSessionsRequest parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ListSessionsRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ListSessionsRequest parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ListSessionsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ListSessionsRequest parseFrom(gva gvaVar) {
        return (ListSessionsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static ListSessionsRequest parseFrom(gva gvaVar, aux auxVar) {
        return (ListSessionsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ListSessionsRequest parseFrom(byte[] bArr) {
        return (ListSessionsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListSessionsRequest parseFrom(byte[] bArr, aux auxVar) {
        return (ListSessionsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ListSessionsRequest parseFrom(InputStream inputStream) {
        return (ListSessionsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListSessionsRequest parseFrom(InputStream inputStream, aux auxVar) {
        return (ListSessionsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ListSessionsRequest parseFrom(owe oweVar) {
        return (ListSessionsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ListSessionsRequest parseFrom(owe oweVar, aux auxVar) {
        return (ListSessionsRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
