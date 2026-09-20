package com.spotify.campfire.datasource.impl.proto;

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

/* JADX INFO: loaded from: classes.dex */
public final class RetrieveLatestNodeResponse extends AbstractC0269h implements RetrieveLatestNodeResponseOrBuilder {
    private static final RetrieveLatestNodeResponse DEFAULT_INSTANCE;
    public static final int LATEST_NODE_RESPONSE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ae50 latestNodeResponse_ = AbstractC0269h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeResponse$1 */
    /* JADX INFO: loaded from: classes5.dex */
    public static /* synthetic */ class C04461 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3257xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3257xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3257xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3257xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3257xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3257xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3257xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3257xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder extends AbstractC0268g implements RetrieveLatestNodeResponseOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addAllLatestNodeResponse(Iterable<? extends LatestNodeResponse> iterable) {
            copyOnWrite();
            ((RetrieveLatestNodeResponse) this.instance).addAllLatestNodeResponse(iterable);
            return this;
        }

        public Builder addLatestNodeResponse(LatestNodeResponse latestNodeResponse) {
            copyOnWrite();
            ((RetrieveLatestNodeResponse) this.instance).addLatestNodeResponse(latestNodeResponse);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public /* bridge */ /* synthetic */ pre0 build() {
            return build();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public /* bridge */ /* synthetic */ pre0 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clear */
        public /* bridge */ /* synthetic */ ore0 mo98325clear() {
            return mo98325clear();
        }

        public Builder clearLatestNodeResponse() {
            copyOnWrite();
            ((RetrieveLatestNodeResponse) this.instance).clearLatestNodeResponse();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeResponseOrBuilder
        public LatestNodeResponse getLatestNodeResponse(int i) {
            return ((RetrieveLatestNodeResponse) this.instance).getLatestNodeResponse(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeResponseOrBuilder
        public int getLatestNodeResponseCount() {
            return ((RetrieveLatestNodeResponse) this.instance).getLatestNodeResponseCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeResponseOrBuilder
        public List<LatestNodeResponse> getLatestNodeResponseList() {
            return Collections.unmodifiableList(((RetrieveLatestNodeResponse) this.instance).getLatestNodeResponseList());
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder removeLatestNodeResponse(int i) {
            copyOnWrite();
            ((RetrieveLatestNodeResponse) this.instance).removeLatestNodeResponse(i);
            return this;
        }

        public Builder setLatestNodeResponse(int i, LatestNodeResponse latestNodeResponse) {
            copyOnWrite();
            ((RetrieveLatestNodeResponse) this.instance).setLatestNodeResponse(i, latestNodeResponse);
            return this;
        }

        private Builder() {
            super(RetrieveLatestNodeResponse.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        public Builder addLatestNodeResponse(int i, LatestNodeResponse latestNodeResponse) {
            copyOnWrite();
            ((RetrieveLatestNodeResponse) this.instance).addLatestNodeResponse(i, latestNodeResponse);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ ore0 mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        public Builder setLatestNodeResponse(int i, LatestNodeResponse.Builder builder) {
            copyOnWrite();
            ((RetrieveLatestNodeResponse) this.instance).setLatestNodeResponse(i, (LatestNodeResponse) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        public Builder addLatestNodeResponse(LatestNodeResponse.Builder builder) {
            copyOnWrite();
            ((RetrieveLatestNodeResponse) this.instance).addLatestNodeResponse((LatestNodeResponse) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
            return super.mo98372mergeFrom(inputStream, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
            return super.mo98373mergeFrom(gvaVar);
        }

        public Builder addLatestNodeResponse(int i, LatestNodeResponse.Builder builder) {
            copyOnWrite();
            ((RetrieveLatestNodeResponse) this.instance).addLatestNodeResponse(i, (LatestNodeResponse) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
            return super.mo98374mergeFrom(gvaVar, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
            return super.mo98375mergeFrom(oweVar);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        @Override // p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
            return super.mergeFrom(pre0Var);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
            return super.mo98376mergeFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
            return super.mo98377mergeFrom(bArr, auxVar);
        }
    }

    static {
        RetrieveLatestNodeResponse retrieveLatestNodeResponse = new RetrieveLatestNodeResponse();
        DEFAULT_INSTANCE = retrieveLatestNodeResponse;
        AbstractC0269h.registerDefaultInstance(RetrieveLatestNodeResponse.class, retrieveLatestNodeResponse);
    }

    private RetrieveLatestNodeResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLatestNodeResponse(Iterable<? extends LatestNodeResponse> iterable) {
        ensureLatestNodeResponseIsMutable();
        AbstractC2118m8.addAll(iterable, this.latestNodeResponse_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLatestNodeResponse(LatestNodeResponse latestNodeResponse) {
        latestNodeResponse.getClass();
        ensureLatestNodeResponseIsMutable();
        this.latestNodeResponse_.add(latestNodeResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatestNodeResponse() {
        this.latestNodeResponse_ = AbstractC0269h.emptyProtobufList();
    }

    private void ensureLatestNodeResponseIsMutable() {
        ae50 ae50Var = this.latestNodeResponse_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.latestNodeResponse_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    public static RetrieveLatestNodeResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static RetrieveLatestNodeResponse parseDelimitedFrom(InputStream inputStream) {
        return (RetrieveLatestNodeResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RetrieveLatestNodeResponse parseFrom(ByteBuffer byteBuffer) {
        return (RetrieveLatestNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLatestNodeResponse(int i) {
        ensureLatestNodeResponseIsMutable();
        this.latestNodeResponse_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatestNodeResponse(int i, LatestNodeResponse latestNodeResponse) {
        latestNodeResponse.getClass();
        ensureLatestNodeResponseIsMutable();
        this.latestNodeResponse_.set(i, latestNodeResponse);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"latestNodeResponse_", LatestNodeResponse.class});
        }
        if (iOrdinal == 3) {
            return new RetrieveLatestNodeResponse();
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
        synchronized (RetrieveLatestNodeResponse.class) {
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
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeResponseOrBuilder
    public LatestNodeResponse getLatestNodeResponse(int i) {
        return (LatestNodeResponse) this.latestNodeResponse_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeResponseOrBuilder
    public int getLatestNodeResponseCount() {
        return this.latestNodeResponse_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeResponseOrBuilder
    public List<LatestNodeResponse> getLatestNodeResponseList() {
        return this.latestNodeResponse_;
    }

    public LatestNodeResponseOrBuilder getLatestNodeResponseOrBuilder(int i) {
        return (LatestNodeResponseOrBuilder) this.latestNodeResponse_.get(i);
    }

    public List<? extends LatestNodeResponseOrBuilder> getLatestNodeResponseOrBuilderList() {
        return this.latestNodeResponse_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(RetrieveLatestNodeResponse retrieveLatestNodeResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(retrieveLatestNodeResponse);
    }

    public static RetrieveLatestNodeResponse parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (RetrieveLatestNodeResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static RetrieveLatestNodeResponse parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (RetrieveLatestNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static RetrieveLatestNodeResponse parseFrom(gva gvaVar) {
        return (RetrieveLatestNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLatestNodeResponse(int i, LatestNodeResponse latestNodeResponse) {
        latestNodeResponse.getClass();
        ensureLatestNodeResponseIsMutable();
        this.latestNodeResponse_.add(i, latestNodeResponse);
    }

    public static RetrieveLatestNodeResponse parseFrom(gva gvaVar, aux auxVar) {
        return (RetrieveLatestNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static RetrieveLatestNodeResponse parseFrom(byte[] bArr) {
        return (RetrieveLatestNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RetrieveLatestNodeResponse parseFrom(byte[] bArr, aux auxVar) {
        return (RetrieveLatestNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static RetrieveLatestNodeResponse parseFrom(InputStream inputStream) {
        return (RetrieveLatestNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RetrieveLatestNodeResponse parseFrom(InputStream inputStream, aux auxVar) {
        return (RetrieveLatestNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static RetrieveLatestNodeResponse parseFrom(owe oweVar) {
        return (RetrieveLatestNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static RetrieveLatestNodeResponse parseFrom(owe oweVar, aux auxVar) {
        return (RetrieveLatestNodeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
