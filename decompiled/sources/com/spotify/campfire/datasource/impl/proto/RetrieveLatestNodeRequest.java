package com.spotify.campfire.datasource.impl.proto;

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

/* JADX INFO: loaded from: classes.dex */
public final class RetrieveLatestNodeRequest extends AbstractC0269h implements RetrieveLatestNodeRequestOrBuilder {
    private static final RetrieveLatestNodeRequest DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PRECONDITION_FIELD_NUMBER = 3;
    public static final int SORT_ORDER_FIELD_NUMBER = 1;
    private int bitField0_;
    private int limit_;
    private Precondition precondition_;
    private int sortOrder_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequest$1 */
    /* JADX INFO: loaded from: classes5.dex */
    public static /* synthetic */ class C04451 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3256xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3256xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3256xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3256xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3256xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3256xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3256xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3256xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements RetrieveLatestNodeRequestOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
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

        public Builder clearLimit() {
            copyOnWrite();
            ((RetrieveLatestNodeRequest) this.instance).clearLimit();
            return this;
        }

        public Builder clearPrecondition() {
            copyOnWrite();
            ((RetrieveLatestNodeRequest) this.instance).clearPrecondition();
            return this;
        }

        public Builder clearSortOrder() {
            copyOnWrite();
            ((RetrieveLatestNodeRequest) this.instance).clearSortOrder();
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

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
        public int getLimit() {
            return ((RetrieveLatestNodeRequest) this.instance).getLimit();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
        public Precondition getPrecondition() {
            return ((RetrieveLatestNodeRequest) this.instance).getPrecondition();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
        public SortOrder getSortOrder() {
            return ((RetrieveLatestNodeRequest) this.instance).getSortOrder();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
        public int getSortOrderValue() {
            return ((RetrieveLatestNodeRequest) this.instance).getSortOrderValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
        public boolean hasLimit() {
            return ((RetrieveLatestNodeRequest) this.instance).hasLimit();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
        public boolean hasPrecondition() {
            return ((RetrieveLatestNodeRequest) this.instance).hasPrecondition();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
        public boolean hasSortOrder() {
            return ((RetrieveLatestNodeRequest) this.instance).hasSortOrder();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergePrecondition(Precondition precondition) {
            copyOnWrite();
            ((RetrieveLatestNodeRequest) this.instance).mergePrecondition(precondition);
            return this;
        }

        public Builder setLimit(int i) {
            copyOnWrite();
            ((RetrieveLatestNodeRequest) this.instance).setLimit(i);
            return this;
        }

        public Builder setPrecondition(Precondition precondition) {
            copyOnWrite();
            ((RetrieveLatestNodeRequest) this.instance).setPrecondition(precondition);
            return this;
        }

        public Builder setSortOrder(SortOrder sortOrder) {
            copyOnWrite();
            ((RetrieveLatestNodeRequest) this.instance).setSortOrder(sortOrder);
            return this;
        }

        public Builder setSortOrderValue(int i) {
            copyOnWrite();
            ((RetrieveLatestNodeRequest) this.instance).setSortOrderValue(i);
            return this;
        }

        private Builder() {
            super(RetrieveLatestNodeRequest.DEFAULT_INSTANCE);
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

        public Builder setPrecondition(Precondition.Builder builder) {
            copyOnWrite();
            ((RetrieveLatestNodeRequest) this.instance).setPrecondition((Precondition) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
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
        RetrieveLatestNodeRequest retrieveLatestNodeRequest = new RetrieveLatestNodeRequest();
        DEFAULT_INSTANCE = retrieveLatestNodeRequest;
        AbstractC0269h.registerDefaultInstance(RetrieveLatestNodeRequest.class, retrieveLatestNodeRequest);
    }

    private RetrieveLatestNodeRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLimit() {
        this.bitField0_ &= -3;
        this.limit_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrecondition() {
        this.precondition_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSortOrder() {
        this.bitField0_ &= -2;
        this.sortOrder_ = 0;
    }

    public static RetrieveLatestNodeRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePrecondition(Precondition precondition) {
        precondition.getClass();
        Precondition precondition2 = this.precondition_;
        if (precondition2 == null || precondition2 == Precondition.getDefaultInstance()) {
            this.precondition_ = precondition;
        } else {
            this.precondition_ = (Precondition) ((Precondition.Builder) Precondition.newBuilder(this.precondition_).mergeFrom((AbstractC0269h) precondition)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static RetrieveLatestNodeRequest parseDelimitedFrom(InputStream inputStream) {
        return (RetrieveLatestNodeRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RetrieveLatestNodeRequest parseFrom(ByteBuffer byteBuffer) {
        return (RetrieveLatestNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLimit(int i) {
        this.bitField0_ |= 2;
        this.limit_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrecondition(Precondition precondition) {
        precondition.getClass();
        this.precondition_ = precondition;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSortOrder(SortOrder sortOrder) {
        this.sortOrder_ = sortOrder.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSortOrderValue(int i) {
        this.bitField0_ |= 1;
        this.sortOrder_ = i;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "sortOrder_", "limit_", "precondition_"});
        }
        if (iOrdinal == 3) {
            return new RetrieveLatestNodeRequest();
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
        synchronized (RetrieveLatestNodeRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
    public int getLimit() {
        return this.limit_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
    public Precondition getPrecondition() {
        Precondition precondition = this.precondition_;
        return precondition == null ? Precondition.getDefaultInstance() : precondition;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
    public SortOrder getSortOrder() {
        SortOrder sortOrderForNumber = SortOrder.forNumber(this.sortOrder_);
        return sortOrderForNumber == null ? SortOrder.UNRECOGNIZED : sortOrderForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
    public int getSortOrderValue() {
        return this.sortOrder_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
    public boolean hasLimit() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
    public boolean hasPrecondition() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveLatestNodeRequestOrBuilder
    public boolean hasSortOrder() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(RetrieveLatestNodeRequest retrieveLatestNodeRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(retrieveLatestNodeRequest);
    }

    public static RetrieveLatestNodeRequest parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (RetrieveLatestNodeRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static RetrieveLatestNodeRequest parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (RetrieveLatestNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static RetrieveLatestNodeRequest parseFrom(gva gvaVar) {
        return (RetrieveLatestNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static RetrieveLatestNodeRequest parseFrom(gva gvaVar, aux auxVar) {
        return (RetrieveLatestNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static RetrieveLatestNodeRequest parseFrom(byte[] bArr) {
        return (RetrieveLatestNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RetrieveLatestNodeRequest parseFrom(byte[] bArr, aux auxVar) {
        return (RetrieveLatestNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static RetrieveLatestNodeRequest parseFrom(InputStream inputStream) {
        return (RetrieveLatestNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RetrieveLatestNodeRequest parseFrom(InputStream inputStream, aux auxVar) {
        return (RetrieveLatestNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static RetrieveLatestNodeRequest parseFrom(owe oweVar) {
        return (RetrieveLatestNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static RetrieveLatestNodeRequest parseFrom(owe oweVar, aux auxVar) {
        return (RetrieveLatestNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
