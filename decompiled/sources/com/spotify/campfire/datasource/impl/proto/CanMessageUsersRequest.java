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
public final class CanMessageUsersRequest extends AbstractC0269h implements CanMessageUsersRequestOrBuilder {
    private static final CanMessageUsersRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SHARED_HIERARCHY_TYPE_FILTER_FIELD_NUMBER = 2;
    public static final int TARGET_USERNAMES_FIELD_NUMBER = 1;
    private int bitField0_;
    private int sharedHierarchyTypeFilter_;
    private ae50 targetUsernames_ = AbstractC0269h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.CanMessageUsersRequest$1 */
    /* JADX INFO: loaded from: classes5.dex */
    public static /* synthetic */ class C03361 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3164xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3164xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3164xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3164xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3164xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3164xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3164xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3164xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder extends AbstractC0268g implements CanMessageUsersRequestOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addAllTargetUsernames(Iterable<String> iterable) {
            copyOnWrite();
            ((CanMessageUsersRequest) this.instance).addAllTargetUsernames(iterable);
            return this;
        }

        public Builder addTargetUsernames(String str) {
            copyOnWrite();
            ((CanMessageUsersRequest) this.instance).addTargetUsernames(str);
            return this;
        }

        public Builder addTargetUsernamesBytes(gva gvaVar) {
            copyOnWrite();
            ((CanMessageUsersRequest) this.instance).addTargetUsernamesBytes(gvaVar);
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

        public Builder clearSharedHierarchyTypeFilter() {
            copyOnWrite();
            ((CanMessageUsersRequest) this.instance).clearSharedHierarchyTypeFilter();
            return this;
        }

        public Builder clearTargetUsernames() {
            copyOnWrite();
            ((CanMessageUsersRequest) this.instance).clearTargetUsernames();
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

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersRequestOrBuilder
        public HierarchyType getSharedHierarchyTypeFilter() {
            return ((CanMessageUsersRequest) this.instance).getSharedHierarchyTypeFilter();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersRequestOrBuilder
        public int getSharedHierarchyTypeFilterValue() {
            return ((CanMessageUsersRequest) this.instance).getSharedHierarchyTypeFilterValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersRequestOrBuilder
        public String getTargetUsernames(int i) {
            return ((CanMessageUsersRequest) this.instance).getTargetUsernames(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersRequestOrBuilder
        public gva getTargetUsernamesBytes(int i) {
            return ((CanMessageUsersRequest) this.instance).getTargetUsernamesBytes(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersRequestOrBuilder
        public int getTargetUsernamesCount() {
            return ((CanMessageUsersRequest) this.instance).getTargetUsernamesCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersRequestOrBuilder
        public List<String> getTargetUsernamesList() {
            return Collections.unmodifiableList(((CanMessageUsersRequest) this.instance).getTargetUsernamesList());
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersRequestOrBuilder
        public boolean hasSharedHierarchyTypeFilter() {
            return ((CanMessageUsersRequest) this.instance).hasSharedHierarchyTypeFilter();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setSharedHierarchyTypeFilter(HierarchyType hierarchyType) {
            copyOnWrite();
            ((CanMessageUsersRequest) this.instance).setSharedHierarchyTypeFilter(hierarchyType);
            return this;
        }

        public Builder setSharedHierarchyTypeFilterValue(int i) {
            copyOnWrite();
            ((CanMessageUsersRequest) this.instance).setSharedHierarchyTypeFilterValue(i);
            return this;
        }

        public Builder setTargetUsernames(int i, String str) {
            copyOnWrite();
            ((CanMessageUsersRequest) this.instance).setTargetUsernames(i, str);
            return this;
        }

        private Builder() {
            super(CanMessageUsersRequest.DEFAULT_INSTANCE);
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
        CanMessageUsersRequest canMessageUsersRequest = new CanMessageUsersRequest();
        DEFAULT_INSTANCE = canMessageUsersRequest;
        AbstractC0269h.registerDefaultInstance(CanMessageUsersRequest.class, canMessageUsersRequest);
    }

    private CanMessageUsersRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTargetUsernames(Iterable<String> iterable) {
        ensureTargetUsernamesIsMutable();
        AbstractC2118m8.addAll(iterable, this.targetUsernames_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTargetUsernames(String str) {
        str.getClass();
        ensureTargetUsernamesIsMutable();
        this.targetUsernames_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTargetUsernamesBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        ensureTargetUsernamesIsMutable();
        this.targetUsernames_.add(gvaVar.m45892u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSharedHierarchyTypeFilter() {
        this.bitField0_ &= -2;
        this.sharedHierarchyTypeFilter_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetUsernames() {
        this.targetUsernames_ = AbstractC0269h.emptyProtobufList();
    }

    private void ensureTargetUsernamesIsMutable() {
        ae50 ae50Var = this.targetUsernames_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.targetUsernames_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    public static CanMessageUsersRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static CanMessageUsersRequest parseDelimitedFrom(InputStream inputStream) {
        return (CanMessageUsersRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CanMessageUsersRequest parseFrom(ByteBuffer byteBuffer) {
        return (CanMessageUsersRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSharedHierarchyTypeFilter(HierarchyType hierarchyType) {
        this.sharedHierarchyTypeFilter_ = hierarchyType.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSharedHierarchyTypeFilterValue(int i) {
        this.bitField0_ |= 1;
        this.sharedHierarchyTypeFilter_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetUsernames(int i, String str) {
        str.getClass();
        ensureTargetUsernamesIsMutable();
        this.targetUsernames_.set(i, str);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002ဌ\u0000", new Object[]{"bitField0_", "targetUsernames_", "sharedHierarchyTypeFilter_"});
        }
        if (iOrdinal == 3) {
            return new CanMessageUsersRequest();
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
        synchronized (CanMessageUsersRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersRequestOrBuilder
    public HierarchyType getSharedHierarchyTypeFilter() {
        HierarchyType hierarchyTypeForNumber = HierarchyType.forNumber(this.sharedHierarchyTypeFilter_);
        return hierarchyTypeForNumber == null ? HierarchyType.UNRECOGNIZED : hierarchyTypeForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersRequestOrBuilder
    public int getSharedHierarchyTypeFilterValue() {
        return this.sharedHierarchyTypeFilter_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersRequestOrBuilder
    public String getTargetUsernames(int i) {
        return (String) this.targetUsernames_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersRequestOrBuilder
    public gva getTargetUsernamesBytes(int i) {
        return gva.m45888f((String) this.targetUsernames_.get(i));
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersRequestOrBuilder
    public int getTargetUsernamesCount() {
        return this.targetUsernames_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersRequestOrBuilder
    public List<String> getTargetUsernamesList() {
        return this.targetUsernames_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CanMessageUsersRequestOrBuilder
    public boolean hasSharedHierarchyTypeFilter() {
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

    public static Builder newBuilder(CanMessageUsersRequest canMessageUsersRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(canMessageUsersRequest);
    }

    public static CanMessageUsersRequest parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (CanMessageUsersRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static CanMessageUsersRequest parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (CanMessageUsersRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static CanMessageUsersRequest parseFrom(gva gvaVar) {
        return (CanMessageUsersRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static CanMessageUsersRequest parseFrom(gva gvaVar, aux auxVar) {
        return (CanMessageUsersRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static CanMessageUsersRequest parseFrom(byte[] bArr) {
        return (CanMessageUsersRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CanMessageUsersRequest parseFrom(byte[] bArr, aux auxVar) {
        return (CanMessageUsersRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static CanMessageUsersRequest parseFrom(InputStream inputStream) {
        return (CanMessageUsersRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CanMessageUsersRequest parseFrom(InputStream inputStream, aux auxVar) {
        return (CanMessageUsersRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static CanMessageUsersRequest parseFrom(owe oweVar) {
        return (CanMessageUsersRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static CanMessageUsersRequest parseFrom(owe oweVar, aux auxVar) {
        return (CanMessageUsersRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
