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
public final class ListSessionsResponse extends AbstractC0269h implements ListSessionsResponseOrBuilder {
    private static final ListSessionsResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SESSIONS_FIELD_NUMBER = 1;
    private ae50 sessions_ = AbstractC0269h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.playlist.ai.creation.v2.ListSessionsResponse$1 */
    public static /* synthetic */ class C11881 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f6443xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f6443xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6443xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6443xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6443xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6443xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6443xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6443xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ListSessionsResponseOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final Builder addAllSessions(Iterable<? extends GetSessionResponse> iterable) {
            copyOnWrite();
            ((ListSessionsResponse) this.instance).addAllSessions(iterable);
            return this;
        }

        public final Builder addSessions(GetSessionResponse getSessionResponse) {
            copyOnWrite();
            ((ListSessionsResponse) this.instance).addSessions(getSessionResponse);
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

        public final Builder clearSessions() {
            copyOnWrite();
            ((ListSessionsResponse) this.instance).clearSessions();
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

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ListSessionsResponseOrBuilder
        public final GetSessionResponse getSessions(int i) {
            return ((ListSessionsResponse) this.instance).getSessions(i);
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ListSessionsResponseOrBuilder
        public final int getSessionsCount() {
            return ((ListSessionsResponse) this.instance).getSessionsCount();
        }

        @Override // com.spotify.playlist.p126ai.creation.p127v2.ListSessionsResponseOrBuilder
        public final List<GetSessionResponse> getSessionsList() {
            return Collections.unmodifiableList(((ListSessionsResponse) this.instance).getSessionsList());
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public final /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public final Builder removeSessions(int i) {
            copyOnWrite();
            ((ListSessionsResponse) this.instance).removeSessions(i);
            return this;
        }

        public final Builder setSessions(int i, GetSessionResponse getSessionResponse) {
            copyOnWrite();
            ((ListSessionsResponse) this.instance).setSessions(i, getSessionResponse);
            return this;
        }

        private Builder() {
            super(ListSessionsResponse.DEFAULT_INSTANCE);
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

        public final Builder addSessions(int i, GetSessionResponse getSessionResponse) {
            copyOnWrite();
            ((ListSessionsResponse) this.instance).addSessions(i, getSessionResponse);
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

        public final Builder setSessions(int i, GetSessionResponse.Builder builder) {
            copyOnWrite();
            ((ListSessionsResponse) this.instance).setSessions(i, (GetSessionResponse) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        public final Builder addSessions(GetSessionResponse.Builder builder) {
            copyOnWrite();
            ((ListSessionsResponse) this.instance).addSessions((GetSessionResponse) builder.build());
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

        public final Builder addSessions(int i, GetSessionResponse.Builder builder) {
            copyOnWrite();
            ((ListSessionsResponse) this.instance).addSessions(i, (GetSessionResponse) builder.build());
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
        ListSessionsResponse listSessionsResponse = new ListSessionsResponse();
        DEFAULT_INSTANCE = listSessionsResponse;
        AbstractC0269h.registerDefaultInstance(ListSessionsResponse.class, listSessionsResponse);
    }

    private ListSessionsResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSessions(Iterable<? extends GetSessionResponse> iterable) {
        ensureSessionsIsMutable();
        AbstractC2118m8.addAll(iterable, this.sessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSessions(GetSessionResponse getSessionResponse) {
        getSessionResponse.getClass();
        ensureSessionsIsMutable();
        this.sessions_.add(getSessionResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessions() {
        this.sessions_ = AbstractC0269h.emptyProtobufList();
    }

    private void ensureSessionsIsMutable() {
        ae50 ae50Var = this.sessions_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.sessions_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    public static ListSessionsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ListSessionsResponse parseDelimitedFrom(InputStream inputStream) {
        return (ListSessionsResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListSessionsResponse parseFrom(ByteBuffer byteBuffer) {
        return (ListSessionsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSessions(int i) {
        ensureSessionsIsMutable();
        this.sessions_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessions(int i, GetSessionResponse getSessionResponse) {
        getSessionResponse.getClass();
        ensureSessionsIsMutable();
        this.sessions_.set(i, getSessionResponse);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"sessions_", GetSessionResponse.class});
        }
        if (iOrdinal == 3) {
            return new ListSessionsResponse();
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
        synchronized (ListSessionsResponse.class) {
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

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ListSessionsResponseOrBuilder
    public final GetSessionResponse getSessions(int i) {
        return (GetSessionResponse) this.sessions_.get(i);
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ListSessionsResponseOrBuilder
    public final int getSessionsCount() {
        return this.sessions_.size();
    }

    @Override // com.spotify.playlist.p126ai.creation.p127v2.ListSessionsResponseOrBuilder
    public final List<GetSessionResponse> getSessionsList() {
        return this.sessions_;
    }

    public final GetSessionResponseOrBuilder getSessionsOrBuilder(int i) {
        return (GetSessionResponseOrBuilder) this.sessions_.get(i);
    }

    public final List<? extends GetSessionResponseOrBuilder> getSessionsOrBuilderList() {
        return this.sessions_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ListSessionsResponse listSessionsResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(listSessionsResponse);
    }

    public static ListSessionsResponse parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ListSessionsResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ListSessionsResponse parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ListSessionsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ListSessionsResponse parseFrom(gva gvaVar) {
        return (ListSessionsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSessions(int i, GetSessionResponse getSessionResponse) {
        getSessionResponse.getClass();
        ensureSessionsIsMutable();
        this.sessions_.add(i, getSessionResponse);
    }

    public static ListSessionsResponse parseFrom(gva gvaVar, aux auxVar) {
        return (ListSessionsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ListSessionsResponse parseFrom(byte[] bArr) {
        return (ListSessionsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListSessionsResponse parseFrom(byte[] bArr, aux auxVar) {
        return (ListSessionsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ListSessionsResponse parseFrom(InputStream inputStream) {
        return (ListSessionsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListSessionsResponse parseFrom(InputStream inputStream, aux auxVar) {
        return (ListSessionsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ListSessionsResponse parseFrom(owe oweVar) {
        return (ListSessionsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ListSessionsResponse parseFrom(owe oweVar, aux auxVar) {
        return (ListSessionsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
