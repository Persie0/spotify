package com.spotify.graduation.p073v1;

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

/* JADX INFO: loaded from: classes7.dex */
public final class GetDownloadsResponse extends AbstractC0269h implements GetDownloadsResponseOrBuilder {
    private static final GetDownloadsResponse DEFAULT_INSTANCE;
    public static final int DOWNLOADS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ae50 downloads_ = AbstractC0269h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.graduation.v1.GetDownloadsResponse$1 */
    public static /* synthetic */ class C07781 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f4146xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f4146xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4146xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4146xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4146xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4146xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4146xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4146xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements GetDownloadsResponseOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final Builder addAllDownloads(Iterable<? extends Download> iterable) {
            copyOnWrite();
            ((GetDownloadsResponse) this.instance).addAllDownloads(iterable);
            return this;
        }

        public final Builder addDownloads(Download download) {
            copyOnWrite();
            ((GetDownloadsResponse) this.instance).addDownloads(download);
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

        public final Builder clearDownloads() {
            copyOnWrite();
            ((GetDownloadsResponse) this.instance).clearDownloads();
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

        @Override // com.spotify.graduation.p073v1.GetDownloadsResponseOrBuilder
        public final Download getDownloads(int i) {
            return ((GetDownloadsResponse) this.instance).getDownloads(i);
        }

        @Override // com.spotify.graduation.p073v1.GetDownloadsResponseOrBuilder
        public final int getDownloadsCount() {
            return ((GetDownloadsResponse) this.instance).getDownloadsCount();
        }

        @Override // com.spotify.graduation.p073v1.GetDownloadsResponseOrBuilder
        public final List<Download> getDownloadsList() {
            return Collections.unmodifiableList(((GetDownloadsResponse) this.instance).getDownloadsList());
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public final /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public final Builder removeDownloads(int i) {
            copyOnWrite();
            ((GetDownloadsResponse) this.instance).removeDownloads(i);
            return this;
        }

        public final Builder setDownloads(int i, Download download) {
            copyOnWrite();
            ((GetDownloadsResponse) this.instance).setDownloads(i, download);
            return this;
        }

        private Builder() {
            super(GetDownloadsResponse.DEFAULT_INSTANCE);
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

        public final Builder addDownloads(int i, Download download) {
            copyOnWrite();
            ((GetDownloadsResponse) this.instance).addDownloads(i, download);
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

        public final Builder setDownloads(int i, Download.Builder builder) {
            copyOnWrite();
            ((GetDownloadsResponse) this.instance).setDownloads(i, (Download) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        public final Builder addDownloads(Download.Builder builder) {
            copyOnWrite();
            ((GetDownloadsResponse) this.instance).addDownloads((Download) builder.build());
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

        public final Builder addDownloads(int i, Download.Builder builder) {
            copyOnWrite();
            ((GetDownloadsResponse) this.instance).addDownloads(i, (Download) builder.build());
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
        GetDownloadsResponse getDownloadsResponse = new GetDownloadsResponse();
        DEFAULT_INSTANCE = getDownloadsResponse;
        AbstractC0269h.registerDefaultInstance(GetDownloadsResponse.class, getDownloadsResponse);
    }

    private GetDownloadsResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDownloads(Iterable<? extends Download> iterable) {
        ensureDownloadsIsMutable();
        AbstractC2118m8.addAll(iterable, this.downloads_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDownloads(Download download) {
        download.getClass();
        ensureDownloadsIsMutable();
        this.downloads_.add(download);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDownloads() {
        this.downloads_ = AbstractC0269h.emptyProtobufList();
    }

    private void ensureDownloadsIsMutable() {
        ae50 ae50Var = this.downloads_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.downloads_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    public static GetDownloadsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetDownloadsResponse parseDelimitedFrom(InputStream inputStream) {
        return (GetDownloadsResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetDownloadsResponse parseFrom(ByteBuffer byteBuffer) {
        return (GetDownloadsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDownloads(int i) {
        ensureDownloadsIsMutable();
        this.downloads_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownloads(int i, Download download) {
        download.getClass();
        ensureDownloadsIsMutable();
        this.downloads_.set(i, download);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"downloads_", Download.class});
        }
        if (iOrdinal == 3) {
            return new GetDownloadsResponse();
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
        synchronized (GetDownloadsResponse.class) {
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

    @Override // com.spotify.graduation.p073v1.GetDownloadsResponseOrBuilder
    public final Download getDownloads(int i) {
        return (Download) this.downloads_.get(i);
    }

    @Override // com.spotify.graduation.p073v1.GetDownloadsResponseOrBuilder
    public final int getDownloadsCount() {
        return this.downloads_.size();
    }

    @Override // com.spotify.graduation.p073v1.GetDownloadsResponseOrBuilder
    public final List<Download> getDownloadsList() {
        return this.downloads_;
    }

    public final DownloadOrBuilder getDownloadsOrBuilder(int i) {
        return (DownloadOrBuilder) this.downloads_.get(i);
    }

    public final List<? extends DownloadOrBuilder> getDownloadsOrBuilderList() {
        return this.downloads_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(GetDownloadsResponse getDownloadsResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getDownloadsResponse);
    }

    public static GetDownloadsResponse parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (GetDownloadsResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetDownloadsResponse parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (GetDownloadsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static GetDownloadsResponse parseFrom(gva gvaVar) {
        return (GetDownloadsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDownloads(int i, Download download) {
        download.getClass();
        ensureDownloadsIsMutable();
        this.downloads_.add(i, download);
    }

    public static GetDownloadsResponse parseFrom(gva gvaVar, aux auxVar) {
        return (GetDownloadsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static GetDownloadsResponse parseFrom(byte[] bArr) {
        return (GetDownloadsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetDownloadsResponse parseFrom(byte[] bArr, aux auxVar) {
        return (GetDownloadsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static GetDownloadsResponse parseFrom(InputStream inputStream) {
        return (GetDownloadsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetDownloadsResponse parseFrom(InputStream inputStream, aux auxVar) {
        return (GetDownloadsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetDownloadsResponse parseFrom(owe oweVar) {
        return (GetDownloadsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static GetDownloadsResponse parseFrom(owe oweVar, aux auxVar) {
        return (GetDownloadsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
