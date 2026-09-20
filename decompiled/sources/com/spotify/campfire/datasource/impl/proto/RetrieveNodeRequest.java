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
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class RetrieveNodeRequest extends AbstractC0269h implements RetrieveNodeRequestOrBuilder {
    private static final RetrieveNodeRequest DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_NUMBER = 10;
    public static final int HIERARCHY_ID_FIELD_NUMBER = 1;
    public static final int NEXT_LIMIT_FIELD_NUMBER = 4;
    public static final int NODE_PATH_ID_FIELD_NUMBER = 2;
    public static final int PAGE_SIZE_FIELD_NUMBER = 9;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int PRECONDITION_FIELD_NUMBER = 6;
    public static final int PREV_LIMIT_FIELD_NUMBER = 3;
    public static final int SHARE_MESSAGE_URI_FIELD_NUMBER = 7;
    public static final int SORT_ORDER_FIELD_NUMBER = 5;
    private int bitField0_;
    private Filter filter_;
    private int nextLimit_;
    private int pageSize_;
    private Precondition precondition_;
    private int prevLimit_;
    private int sortOrder_;
    private String hierarchyId_ = "";
    private String nodePathId_ = "";
    private String shareMessageUri_ = "";
    private String pageToken_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequest$1 */
    /* JADX INFO: loaded from: classes5.dex */
    public static /* synthetic */ class C04471 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3258xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3258xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3258xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3258xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3258xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3258xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3258xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3258xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder extends AbstractC0268g implements RetrieveNodeRequestOrBuilder {
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

        public Builder clearFilter() {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).clearFilter();
            return this;
        }

        public Builder clearHierarchyId() {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).clearHierarchyId();
            return this;
        }

        public Builder clearNextLimit() {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).clearNextLimit();
            return this;
        }

        public Builder clearNodePathId() {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).clearNodePathId();
            return this;
        }

        public Builder clearPageSize() {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).clearPageSize();
            return this;
        }

        public Builder clearPageToken() {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).clearPageToken();
            return this;
        }

        public Builder clearPrecondition() {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).clearPrecondition();
            return this;
        }

        public Builder clearPrevLimit() {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).clearPrevLimit();
            return this;
        }

        public Builder clearShareMessageUri() {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).clearShareMessageUri();
            return this;
        }

        public Builder clearSortOrder() {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).clearSortOrder();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
        public Filter getFilter() {
            return ((RetrieveNodeRequest) this.instance).getFilter();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
        public String getHierarchyId() {
            return ((RetrieveNodeRequest) this.instance).getHierarchyId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
        public gva getHierarchyIdBytes() {
            return ((RetrieveNodeRequest) this.instance).getHierarchyIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
        public int getNextLimit() {
            return ((RetrieveNodeRequest) this.instance).getNextLimit();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
        public String getNodePathId() {
            return ((RetrieveNodeRequest) this.instance).getNodePathId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
        public gva getNodePathIdBytes() {
            return ((RetrieveNodeRequest) this.instance).getNodePathIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
        public int getPageSize() {
            return ((RetrieveNodeRequest) this.instance).getPageSize();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
        public String getPageToken() {
            return ((RetrieveNodeRequest) this.instance).getPageToken();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
        public gva getPageTokenBytes() {
            return ((RetrieveNodeRequest) this.instance).getPageTokenBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
        public Precondition getPrecondition() {
            return ((RetrieveNodeRequest) this.instance).getPrecondition();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
        public int getPrevLimit() {
            return ((RetrieveNodeRequest) this.instance).getPrevLimit();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
        public String getShareMessageUri() {
            return ((RetrieveNodeRequest) this.instance).getShareMessageUri();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
        public gva getShareMessageUriBytes() {
            return ((RetrieveNodeRequest) this.instance).getShareMessageUriBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
        public SortOrder getSortOrder() {
            return ((RetrieveNodeRequest) this.instance).getSortOrder();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
        public int getSortOrderValue() {
            return ((RetrieveNodeRequest) this.instance).getSortOrderValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
        public boolean hasFilter() {
            return ((RetrieveNodeRequest) this.instance).hasFilter();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
        public boolean hasPrecondition() {
            return ((RetrieveNodeRequest) this.instance).hasPrecondition();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
        public boolean hasShareMessageUri() {
            return ((RetrieveNodeRequest) this.instance).hasShareMessageUri();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
        public boolean hasSortOrder() {
            return ((RetrieveNodeRequest) this.instance).hasSortOrder();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeFilter(Filter filter) {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).mergeFilter(filter);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergePrecondition(Precondition precondition) {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).mergePrecondition(precondition);
            return this;
        }

        public Builder setFilter(Filter filter) {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).setFilter(filter);
            return this;
        }

        public Builder setHierarchyId(String str) {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).setHierarchyId(str);
            return this;
        }

        public Builder setHierarchyIdBytes(gva gvaVar) {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).setHierarchyIdBytes(gvaVar);
            return this;
        }

        public Builder setNextLimit(int i) {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).setNextLimit(i);
            return this;
        }

        public Builder setNodePathId(String str) {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).setNodePathId(str);
            return this;
        }

        public Builder setNodePathIdBytes(gva gvaVar) {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).setNodePathIdBytes(gvaVar);
            return this;
        }

        public Builder setPageSize(int i) {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).setPageSize(i);
            return this;
        }

        public Builder setPageToken(String str) {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).setPageToken(str);
            return this;
        }

        public Builder setPageTokenBytes(gva gvaVar) {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).setPageTokenBytes(gvaVar);
            return this;
        }

        public Builder setPrecondition(Precondition precondition) {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).setPrecondition(precondition);
            return this;
        }

        public Builder setPrevLimit(int i) {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).setPrevLimit(i);
            return this;
        }

        public Builder setShareMessageUri(String str) {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).setShareMessageUri(str);
            return this;
        }

        public Builder setShareMessageUriBytes(gva gvaVar) {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).setShareMessageUriBytes(gvaVar);
            return this;
        }

        public Builder setSortOrder(SortOrder sortOrder) {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).setSortOrder(sortOrder);
            return this;
        }

        public Builder setSortOrderValue(int i) {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).setSortOrderValue(i);
            return this;
        }

        private Builder() {
            super(RetrieveNodeRequest.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ ore0 mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        public Builder setFilter(Filter.Builder builder) {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).setFilter((Filter) builder.build());
            return this;
        }

        public Builder setPrecondition(Precondition.Builder builder) {
            copyOnWrite();
            ((RetrieveNodeRequest) this.instance).setPrecondition((Precondition) builder.build());
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

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Filter extends AbstractC0269h implements FilterOrBuilder {
        private static final Filter DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int URI_KINDS_FIELD_NUMBER = 1;
        private ae50 uriKinds_ = AbstractC0269h.emptyProtobufList();

        public static final class Builder extends AbstractC0268g implements FilterOrBuilder {
            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addAllUriKinds(Iterable<String> iterable) {
                copyOnWrite();
                ((Filter) this.instance).addAllUriKinds(iterable);
                return this;
            }

            public Builder addUriKinds(String str) {
                copyOnWrite();
                ((Filter) this.instance).addUriKinds(str);
                return this;
            }

            public Builder addUriKindsBytes(gva gvaVar) {
                copyOnWrite();
                ((Filter) this.instance).addUriKindsBytes(gvaVar);
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

            public Builder clearUriKinds() {
                copyOnWrite();
                ((Filter) this.instance).clearUriKinds();
                return this;
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ Object mo98327clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
            public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequest.FilterOrBuilder
            public String getUriKinds(int i) {
                return ((Filter) this.instance).getUriKinds(i);
            }

            @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequest.FilterOrBuilder
            public gva getUriKindsBytes(int i) {
                return ((Filter) this.instance).getUriKindsBytes(i);
            }

            @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequest.FilterOrBuilder
            public int getUriKindsCount() {
                return ((Filter) this.instance).getUriKindsCount();
            }

            @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequest.FilterOrBuilder
            public List<String> getUriKindsList() {
                return Collections.unmodifiableList(((Filter) this.instance).getUriKindsList());
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
                return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            public Builder setUriKinds(int i, String str) {
                copyOnWrite();
                ((Filter) this.instance).setUriKinds(i, str);
                return this;
            }

            private Builder() {
                super(Filter.DEFAULT_INSTANCE);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ ore0 mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
                return super.mo98330mergeFrom(bArr, i, i2, auxVar);
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
            Filter filter = new Filter();
            DEFAULT_INSTANCE = filter;
            AbstractC0269h.registerDefaultInstance(Filter.class, filter);
        }

        private Filter() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUriKinds(Iterable<String> iterable) {
            ensureUriKindsIsMutable();
            AbstractC2118m8.addAll(iterable, this.uriKinds_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUriKinds(String str) {
            str.getClass();
            ensureUriKindsIsMutable();
            this.uriKinds_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUriKindsBytes(gva gvaVar) {
            AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
            ensureUriKindsIsMutable();
            this.uriKinds_.add(gvaVar.m45892u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUriKinds() {
            this.uriKinds_ = AbstractC0269h.emptyProtobufList();
        }

        private void ensureUriKindsIsMutable() {
            ae50 ae50Var = this.uriKinds_;
            if (((AbstractC1733c9) ae50Var).f35342a) {
                return;
            }
            this.uriKinds_ = AbstractC0269h.mutableCopy(ae50Var);
        }

        public static Filter getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Filter parseDelimitedFrom(InputStream inputStream) {
            return (Filter) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Filter parseFrom(ByteBuffer byteBuffer) {
            return (Filter) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUriKinds(int i, String str) {
            str.getClass();
            ensureUriKindsIsMutable();
            this.uriKinds_.set(i, str);
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"uriKinds_"});
            }
            if (iOrdinal == 3) {
                return new Filter();
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
            synchronized (Filter.class) {
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

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequest.FilterOrBuilder
        public String getUriKinds(int i) {
            return (String) this.uriKinds_.get(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequest.FilterOrBuilder
        public gva getUriKindsBytes(int i) {
            return gva.m45888f((String) this.uriKinds_.get(i));
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequest.FilterOrBuilder
        public int getUriKindsCount() {
            return this.uriKinds_.size();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequest.FilterOrBuilder
        public List<String> getUriKindsList() {
            return this.uriKinds_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        public static Builder newBuilder(Filter filter) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(filter);
        }

        public static Filter parseDelimitedFrom(InputStream inputStream, aux auxVar) {
            return (Filter) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static Filter parseFrom(ByteBuffer byteBuffer, aux auxVar) {
            return (Filter) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
        }

        public static Filter parseFrom(gva gvaVar) {
            return (Filter) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
        }

        public static Filter parseFrom(gva gvaVar, aux auxVar) {
            return (Filter) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
        }

        public static Filter parseFrom(byte[] bArr) {
            return (Filter) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Filter parseFrom(byte[] bArr, aux auxVar) {
            return (Filter) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
        }

        public static Filter parseFrom(InputStream inputStream) {
            return (Filter) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Filter parseFrom(InputStream inputStream, aux auxVar) {
            return (Filter) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static Filter parseFrom(owe oweVar) {
            return (Filter) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
        }

        public static Filter parseFrom(owe oweVar, aux auxVar) {
            return (Filter) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public interface FilterOrBuilder extends sre0 {
        @Override // p204p.sre0
        /* synthetic */ pre0 getDefaultInstanceForType();

        String getUriKinds(int i);

        gva getUriKindsBytes(int i);

        int getUriKindsCount();

        List<String> getUriKindsList();

        @Override // p204p.sre0
        /* synthetic */ boolean isInitialized();
    }

    static {
        RetrieveNodeRequest retrieveNodeRequest = new RetrieveNodeRequest();
        DEFAULT_INSTANCE = retrieveNodeRequest;
        AbstractC0269h.registerDefaultInstance(RetrieveNodeRequest.class, retrieveNodeRequest);
    }

    private RetrieveNodeRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilter() {
        this.filter_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyId() {
        this.hierarchyId_ = getDefaultInstance().getHierarchyId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNextLimit() {
        this.nextLimit_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodePathId() {
        this.nodePathId_ = getDefaultInstance().getNodePathId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageSize() {
        this.pageSize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageToken() {
        this.pageToken_ = getDefaultInstance().getPageToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrecondition() {
        this.precondition_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrevLimit() {
        this.prevLimit_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareMessageUri() {
        this.bitField0_ &= -5;
        this.shareMessageUri_ = getDefaultInstance().getShareMessageUri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSortOrder() {
        this.bitField0_ &= -2;
        this.sortOrder_ = 0;
    }

    public static RetrieveNodeRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFilter(Filter filter) {
        filter.getClass();
        Filter filter2 = this.filter_;
        if (filter2 == null || filter2 == Filter.getDefaultInstance()) {
            this.filter_ = filter;
        } else {
            this.filter_ = (Filter) ((Filter.Builder) Filter.newBuilder(this.filter_).mergeFrom((AbstractC0269h) filter)).buildPartial();
        }
        this.bitField0_ |= 8;
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
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static RetrieveNodeRequest parseDelimitedFrom(InputStream inputStream) {
        return (RetrieveNodeRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RetrieveNodeRequest parseFrom(ByteBuffer byteBuffer) {
        return (RetrieveNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilter(Filter filter) {
        filter.getClass();
        this.filter_ = filter;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyId(String str) {
        str.getClass();
        this.hierarchyId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.hierarchyId_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextLimit(int i) {
        this.nextLimit_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodePathId(String str) {
        str.getClass();
        this.nodePathId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodePathIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.nodePathId_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageSize(int i) {
        this.pageSize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageToken(String str) {
        str.getClass();
        this.pageToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageTokenBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.pageToken_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrecondition(Precondition precondition) {
        precondition.getClass();
        this.precondition_ = precondition;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrevLimit(int i) {
        this.prevLimit_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareMessageUri(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.shareMessageUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareMessageUriBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.shareMessageUri_ = gvaVar.m45892u();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0004\u0005ဌ\u0000\u0006ဉ\u0001\u0007ለ\u0002\bȈ\t\u0004\nဉ\u0003", new Object[]{"bitField0_", "hierarchyId_", "nodePathId_", "prevLimit_", "nextLimit_", "sortOrder_", "precondition_", "shareMessageUri_", "pageToken_", "pageSize_", "filter_"});
        }
        if (iOrdinal == 3) {
            return new RetrieveNodeRequest();
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
        synchronized (RetrieveNodeRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public Filter getFilter() {
        Filter filter = this.filter_;
        return filter == null ? Filter.getDefaultInstance() : filter;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public String getHierarchyId() {
        return this.hierarchyId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public gva getHierarchyIdBytes() {
        return gva.m45888f(this.hierarchyId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public int getNextLimit() {
        return this.nextLimit_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public String getNodePathId() {
        return this.nodePathId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public gva getNodePathIdBytes() {
        return gva.m45888f(this.nodePathId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public int getPageSize() {
        return this.pageSize_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public String getPageToken() {
        return this.pageToken_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public gva getPageTokenBytes() {
        return gva.m45888f(this.pageToken_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public Precondition getPrecondition() {
        Precondition precondition = this.precondition_;
        return precondition == null ? Precondition.getDefaultInstance() : precondition;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public int getPrevLimit() {
        return this.prevLimit_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public String getShareMessageUri() {
        return this.shareMessageUri_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public gva getShareMessageUriBytes() {
        return gva.m45888f(this.shareMessageUri_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public SortOrder getSortOrder() {
        SortOrder sortOrderForNumber = SortOrder.forNumber(this.sortOrder_);
        return sortOrderForNumber == null ? SortOrder.UNRECOGNIZED : sortOrderForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public int getSortOrderValue() {
        return this.sortOrder_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public boolean hasFilter() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public boolean hasPrecondition() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
    public boolean hasShareMessageUri() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.RetrieveNodeRequestOrBuilder
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

    public static Builder newBuilder(RetrieveNodeRequest retrieveNodeRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(retrieveNodeRequest);
    }

    public static RetrieveNodeRequest parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (RetrieveNodeRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static RetrieveNodeRequest parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (RetrieveNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static RetrieveNodeRequest parseFrom(gva gvaVar) {
        return (RetrieveNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static RetrieveNodeRequest parseFrom(gva gvaVar, aux auxVar) {
        return (RetrieveNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static RetrieveNodeRequest parseFrom(byte[] bArr) {
        return (RetrieveNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RetrieveNodeRequest parseFrom(byte[] bArr, aux auxVar) {
        return (RetrieveNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static RetrieveNodeRequest parseFrom(InputStream inputStream) {
        return (RetrieveNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RetrieveNodeRequest parseFrom(InputStream inputStream, aux auxVar) {
        return (RetrieveNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static RetrieveNodeRequest parseFrom(owe oweVar) {
        return (RetrieveNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static RetrieveNodeRequest parseFrom(owe oweVar, aux auxVar) {
        return (RetrieveNodeRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
