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

/* JADX INFO: loaded from: classes5.dex */
public final class Hierarchy extends AbstractC0269h implements HierarchyOrBuilder {
    private static final Hierarchy DEFAULT_INSTANCE;
    public static final int GROUP_FIELD_NUMBER = 5;
    public static final int HIERARCHY_IDENTIFIER_FIELD_NUMBER = 1;
    public static final int HIERARCHY_METADATA_FIELD_NUMBER = 4;
    public static final int HIERARCHY_STATISTIC_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private Group group_;
    private HierarchyIdentifier hierarchyIdentifier_;
    private HierarchyMetadata hierarchyMetadata_;
    private HierarchyStatistic hierarchyStatistic_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.Hierarchy$1 */
    public static /* synthetic */ class C03821 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3205xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3205xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3205xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3205xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3205xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3205xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3205xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3205xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements HierarchyOrBuilder {
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

        public Builder clearGroup() {
            copyOnWrite();
            ((Hierarchy) this.instance).clearGroup();
            return this;
        }

        public Builder clearHierarchyIdentifier() {
            copyOnWrite();
            ((Hierarchy) this.instance).clearHierarchyIdentifier();
            return this;
        }

        public Builder clearHierarchyMetadata() {
            copyOnWrite();
            ((Hierarchy) this.instance).clearHierarchyMetadata();
            return this;
        }

        public Builder clearHierarchyStatistic() {
            copyOnWrite();
            ((Hierarchy) this.instance).clearHierarchyStatistic();
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

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
        public Group getGroup() {
            return ((Hierarchy) this.instance).getGroup();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
        public HierarchyIdentifier getHierarchyIdentifier() {
            return ((Hierarchy) this.instance).getHierarchyIdentifier();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
        public HierarchyMetadata getHierarchyMetadata() {
            return ((Hierarchy) this.instance).getHierarchyMetadata();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
        public HierarchyStatistic getHierarchyStatistic() {
            return ((Hierarchy) this.instance).getHierarchyStatistic();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
        public boolean hasGroup() {
            return ((Hierarchy) this.instance).hasGroup();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
        public boolean hasHierarchyIdentifier() {
            return ((Hierarchy) this.instance).hasHierarchyIdentifier();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
        public boolean hasHierarchyMetadata() {
            return ((Hierarchy) this.instance).hasHierarchyMetadata();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
        public boolean hasHierarchyStatistic() {
            return ((Hierarchy) this.instance).hasHierarchyStatistic();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeGroup(Group group) {
            copyOnWrite();
            ((Hierarchy) this.instance).mergeGroup(group);
            return this;
        }

        public Builder mergeHierarchyIdentifier(HierarchyIdentifier hierarchyIdentifier) {
            copyOnWrite();
            ((Hierarchy) this.instance).mergeHierarchyIdentifier(hierarchyIdentifier);
            return this;
        }

        public Builder mergeHierarchyMetadata(HierarchyMetadata hierarchyMetadata) {
            copyOnWrite();
            ((Hierarchy) this.instance).mergeHierarchyMetadata(hierarchyMetadata);
            return this;
        }

        public Builder mergeHierarchyStatistic(HierarchyStatistic hierarchyStatistic) {
            copyOnWrite();
            ((Hierarchy) this.instance).mergeHierarchyStatistic(hierarchyStatistic);
            return this;
        }

        public Builder setGroup(Group group) {
            copyOnWrite();
            ((Hierarchy) this.instance).setGroup(group);
            return this;
        }

        public Builder setHierarchyIdentifier(HierarchyIdentifier hierarchyIdentifier) {
            copyOnWrite();
            ((Hierarchy) this.instance).setHierarchyIdentifier(hierarchyIdentifier);
            return this;
        }

        public Builder setHierarchyMetadata(HierarchyMetadata hierarchyMetadata) {
            copyOnWrite();
            ((Hierarchy) this.instance).setHierarchyMetadata(hierarchyMetadata);
            return this;
        }

        public Builder setHierarchyStatistic(HierarchyStatistic hierarchyStatistic) {
            copyOnWrite();
            ((Hierarchy) this.instance).setHierarchyStatistic(hierarchyStatistic);
            return this;
        }

        private Builder() {
            super(Hierarchy.DEFAULT_INSTANCE);
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

        public Builder setGroup(Group.Builder builder) {
            copyOnWrite();
            ((Hierarchy) this.instance).setGroup((Group) builder.build());
            return this;
        }

        public Builder setHierarchyIdentifier(HierarchyIdentifier.Builder builder) {
            copyOnWrite();
            ((Hierarchy) this.instance).setHierarchyIdentifier((HierarchyIdentifier) builder.build());
            return this;
        }

        public Builder setHierarchyMetadata(HierarchyMetadata.Builder builder) {
            copyOnWrite();
            ((Hierarchy) this.instance).setHierarchyMetadata((HierarchyMetadata) builder.build());
            return this;
        }

        public Builder setHierarchyStatistic(HierarchyStatistic.Builder builder) {
            copyOnWrite();
            ((Hierarchy) this.instance).setHierarchyStatistic((HierarchyStatistic) builder.build());
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
        Hierarchy hierarchy = new Hierarchy();
        DEFAULT_INSTANCE = hierarchy;
        AbstractC0269h.registerDefaultInstance(Hierarchy.class, hierarchy);
    }

    private Hierarchy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroup() {
        this.group_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyIdentifier() {
        this.hierarchyIdentifier_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyMetadata() {
        this.hierarchyMetadata_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyStatistic() {
        this.hierarchyStatistic_ = null;
        this.bitField0_ &= -3;
    }

    public static Hierarchy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGroup(Group group) {
        group.getClass();
        Group group2 = this.group_;
        if (group2 == null || group2 == Group.getDefaultInstance()) {
            this.group_ = group;
        } else {
            this.group_ = (Group) ((Group.Builder) Group.newBuilder(this.group_).mergeFrom((AbstractC0269h) group)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHierarchyIdentifier(HierarchyIdentifier hierarchyIdentifier) {
        hierarchyIdentifier.getClass();
        HierarchyIdentifier hierarchyIdentifier2 = this.hierarchyIdentifier_;
        if (hierarchyIdentifier2 == null || hierarchyIdentifier2 == HierarchyIdentifier.getDefaultInstance()) {
            this.hierarchyIdentifier_ = hierarchyIdentifier;
        } else {
            this.hierarchyIdentifier_ = (HierarchyIdentifier) ((HierarchyIdentifier.Builder) HierarchyIdentifier.newBuilder(this.hierarchyIdentifier_).mergeFrom((AbstractC0269h) hierarchyIdentifier)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHierarchyMetadata(HierarchyMetadata hierarchyMetadata) {
        hierarchyMetadata.getClass();
        HierarchyMetadata hierarchyMetadata2 = this.hierarchyMetadata_;
        if (hierarchyMetadata2 == null || hierarchyMetadata2 == HierarchyMetadata.getDefaultInstance()) {
            this.hierarchyMetadata_ = hierarchyMetadata;
        } else {
            this.hierarchyMetadata_ = (HierarchyMetadata) ((HierarchyMetadata.Builder) HierarchyMetadata.newBuilder(this.hierarchyMetadata_).mergeFrom((AbstractC0269h) hierarchyMetadata)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHierarchyStatistic(HierarchyStatistic hierarchyStatistic) {
        hierarchyStatistic.getClass();
        HierarchyStatistic hierarchyStatistic2 = this.hierarchyStatistic_;
        if (hierarchyStatistic2 == null || hierarchyStatistic2 == HierarchyStatistic.getDefaultInstance()) {
            this.hierarchyStatistic_ = hierarchyStatistic;
        } else {
            this.hierarchyStatistic_ = (HierarchyStatistic) ((HierarchyStatistic.Builder) HierarchyStatistic.newBuilder(this.hierarchyStatistic_).mergeFrom((AbstractC0269h) hierarchyStatistic)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Hierarchy parseDelimitedFrom(InputStream inputStream) {
        return (Hierarchy) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Hierarchy parseFrom(ByteBuffer byteBuffer) {
        return (Hierarchy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroup(Group group) {
        group.getClass();
        this.group_ = group;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyIdentifier(HierarchyIdentifier hierarchyIdentifier) {
        hierarchyIdentifier.getClass();
        this.hierarchyIdentifier_ = hierarchyIdentifier;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyMetadata(HierarchyMetadata hierarchyMetadata) {
        hierarchyMetadata.getClass();
        this.hierarchyMetadata_ = hierarchyMetadata;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyStatistic(HierarchyStatistic hierarchyStatistic) {
        hierarchyStatistic.getClass();
        this.hierarchyStatistic_ = hierarchyStatistic;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"bitField0_", "hierarchyIdentifier_", "hierarchyStatistic_", "hierarchyMetadata_", "group_"});
        }
        if (iOrdinal == 3) {
            return new Hierarchy();
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
        synchronized (Hierarchy.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
    public Group getGroup() {
        Group group = this.group_;
        return group == null ? Group.getDefaultInstance() : group;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
    public HierarchyIdentifier getHierarchyIdentifier() {
        HierarchyIdentifier hierarchyIdentifier = this.hierarchyIdentifier_;
        return hierarchyIdentifier == null ? HierarchyIdentifier.getDefaultInstance() : hierarchyIdentifier;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
    public HierarchyMetadata getHierarchyMetadata() {
        HierarchyMetadata hierarchyMetadata = this.hierarchyMetadata_;
        return hierarchyMetadata == null ? HierarchyMetadata.getDefaultInstance() : hierarchyMetadata;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
    public HierarchyStatistic getHierarchyStatistic() {
        HierarchyStatistic hierarchyStatistic = this.hierarchyStatistic_;
        return hierarchyStatistic == null ? HierarchyStatistic.getDefaultInstance() : hierarchyStatistic;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
    public boolean hasGroup() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
    public boolean hasHierarchyIdentifier() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
    public boolean hasHierarchyMetadata() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyOrBuilder
    public boolean hasHierarchyStatistic() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(Hierarchy hierarchy) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(hierarchy);
    }

    public static Hierarchy parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (Hierarchy) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static Hierarchy parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (Hierarchy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static Hierarchy parseFrom(gva gvaVar) {
        return (Hierarchy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static Hierarchy parseFrom(gva gvaVar, aux auxVar) {
        return (Hierarchy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static Hierarchy parseFrom(byte[] bArr) {
        return (Hierarchy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Hierarchy parseFrom(byte[] bArr, aux auxVar) {
        return (Hierarchy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static Hierarchy parseFrom(InputStream inputStream) {
        return (Hierarchy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Hierarchy parseFrom(InputStream inputStream, aux auxVar) {
        return (Hierarchy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static Hierarchy parseFrom(owe oweVar) {
        return (Hierarchy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static Hierarchy parseFrom(owe oweVar, aux auxVar) {
        return (Hierarchy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
