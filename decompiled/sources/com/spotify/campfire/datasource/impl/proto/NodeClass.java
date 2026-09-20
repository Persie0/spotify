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
public final class NodeClass extends AbstractC0269h implements NodeClassOrBuilder {
    public static final int ACTIVITY_CLASS_FIELD_NUMBER = 3;
    public static final int CONTRIBUTION_CLASS_FIELD_NUMBER = 2;
    private static final NodeClass DEFAULT_INSTANCE;
    public static final int HIERARCHY_CLASS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int typeCase_ = 0;
    private Object type_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.NodeClass$1 */
    public static /* synthetic */ class C04151 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3231xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3231xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3231xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3231xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3231xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3231xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3231xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3231xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements NodeClassOrBuilder {
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

        public Builder clearActivityClass() {
            copyOnWrite();
            ((NodeClass) this.instance).clearActivityClass();
            return this;
        }

        public Builder clearContributionClass() {
            copyOnWrite();
            ((NodeClass) this.instance).clearContributionClass();
            return this;
        }

        public Builder clearHierarchyClass() {
            copyOnWrite();
            ((NodeClass) this.instance).clearHierarchyClass();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((NodeClass) this.instance).clearType();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
        public ActivityClass getActivityClass() {
            return ((NodeClass) this.instance).getActivityClass();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
        public int getActivityClassValue() {
            return ((NodeClass) this.instance).getActivityClassValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
        public ContributionClass getContributionClass() {
            return ((NodeClass) this.instance).getContributionClass();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
        public int getContributionClassValue() {
            return ((NodeClass) this.instance).getContributionClassValue();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
        public HierarchyClass getHierarchyClass() {
            return ((NodeClass) this.instance).getHierarchyClass();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
        public int getHierarchyClassValue() {
            return ((NodeClass) this.instance).getHierarchyClassValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
        public TypeCase getTypeCase() {
            return ((NodeClass) this.instance).getTypeCase();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
        public boolean hasActivityClass() {
            return ((NodeClass) this.instance).hasActivityClass();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
        public boolean hasContributionClass() {
            return ((NodeClass) this.instance).hasContributionClass();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
        public boolean hasHierarchyClass() {
            return ((NodeClass) this.instance).hasHierarchyClass();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setActivityClass(ActivityClass activityClass) {
            copyOnWrite();
            ((NodeClass) this.instance).setActivityClass(activityClass);
            return this;
        }

        public Builder setActivityClassValue(int i) {
            copyOnWrite();
            ((NodeClass) this.instance).setActivityClassValue(i);
            return this;
        }

        public Builder setContributionClass(ContributionClass contributionClass) {
            copyOnWrite();
            ((NodeClass) this.instance).setContributionClass(contributionClass);
            return this;
        }

        public Builder setContributionClassValue(int i) {
            copyOnWrite();
            ((NodeClass) this.instance).setContributionClassValue(i);
            return this;
        }

        public Builder setHierarchyClass(HierarchyClass hierarchyClass) {
            copyOnWrite();
            ((NodeClass) this.instance).setHierarchyClass(hierarchyClass);
            return this;
        }

        public Builder setHierarchyClassValue(int i) {
            copyOnWrite();
            ((NodeClass) this.instance).setHierarchyClassValue(i);
            return this;
        }

        private Builder() {
            super(NodeClass.DEFAULT_INSTANCE);
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

    public enum TypeCase {
        HIERARCHY_CLASS(1),
        CONTRIBUTION_CLASS(2),
        ACTIVITY_CLASS(3),
        TYPE_NOT_SET(0);

        private final int value;

        TypeCase(int i) {
            this.value = i;
        }

        public static TypeCase forNumber(int i) {
            if (i == 0) {
                return TYPE_NOT_SET;
            }
            if (i == 1) {
                return HIERARCHY_CLASS;
            }
            if (i == 2) {
                return CONTRIBUTION_CLASS;
            }
            if (i != 3) {
                return null;
            }
            return ACTIVITY_CLASS;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static TypeCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        NodeClass nodeClass = new NodeClass();
        DEFAULT_INSTANCE = nodeClass;
        AbstractC0269h.registerDefaultInstance(NodeClass.class, nodeClass);
    }

    private NodeClass() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityClass() {
        if (this.typeCase_ == 3) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContributionClass() {
        if (this.typeCase_ == 2) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchyClass() {
        if (this.typeCase_ == 1) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.typeCase_ = 0;
        this.type_ = null;
    }

    public static NodeClass getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NodeClass parseDelimitedFrom(InputStream inputStream) {
        return (NodeClass) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NodeClass parseFrom(ByteBuffer byteBuffer) {
        return (NodeClass) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityClass(ActivityClass activityClass) {
        this.type_ = Integer.valueOf(activityClass.getNumber());
        this.typeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityClassValue(int i) {
        this.typeCase_ = 3;
        this.type_ = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContributionClass(ContributionClass contributionClass) {
        this.type_ = Integer.valueOf(contributionClass.getNumber());
        this.typeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContributionClassValue(int i) {
        this.typeCase_ = 2;
        this.type_ = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyClass(HierarchyClass hierarchyClass) {
        this.type_ = Integer.valueOf(hierarchyClass.getNumber());
        this.typeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchyClassValue(int i) {
        this.typeCase_ = 1;
        this.type_ = Integer.valueOf(i);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001?\u0000\u0002?\u0000\u0003?\u0000", new Object[]{"type_", "typeCase_"});
        }
        if (iOrdinal == 3) {
            return new NodeClass();
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
        synchronized (NodeClass.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
    public ActivityClass getActivityClass() {
        if (this.typeCase_ != 3) {
            return ActivityClass.ACTIVITY_CLASS_UNSPECIFIED;
        }
        ActivityClass activityClassForNumber = ActivityClass.forNumber(((Integer) this.type_).intValue());
        return activityClassForNumber == null ? ActivityClass.UNRECOGNIZED : activityClassForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
    public int getActivityClassValue() {
        if (this.typeCase_ == 3) {
            return ((Integer) this.type_).intValue();
        }
        return 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
    public ContributionClass getContributionClass() {
        if (this.typeCase_ != 2) {
            return ContributionClass.CONTRIBUTION_CLASS_UNSPECIFIED;
        }
        ContributionClass contributionClassForNumber = ContributionClass.forNumber(((Integer) this.type_).intValue());
        return contributionClassForNumber == null ? ContributionClass.UNRECOGNIZED : contributionClassForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
    public int getContributionClassValue() {
        if (this.typeCase_ == 2) {
            return ((Integer) this.type_).intValue();
        }
        return 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
    public HierarchyClass getHierarchyClass() {
        if (this.typeCase_ != 1) {
            return HierarchyClass.HIERARCHY_CLASS_UNSPECIFIED;
        }
        HierarchyClass hierarchyClassForNumber = HierarchyClass.forNumber(((Integer) this.type_).intValue());
        return hierarchyClassForNumber == null ? HierarchyClass.UNRECOGNIZED : hierarchyClassForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
    public int getHierarchyClassValue() {
        if (this.typeCase_ == 1) {
            return ((Integer) this.type_).intValue();
        }
        return 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
    public TypeCase getTypeCase() {
        return TypeCase.forNumber(this.typeCase_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
    public boolean hasActivityClass() {
        return this.typeCase_ == 3;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
    public boolean hasContributionClass() {
        return this.typeCase_ == 2;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.NodeClassOrBuilder
    public boolean hasHierarchyClass() {
        return this.typeCase_ == 1;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(NodeClass nodeClass) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(nodeClass);
    }

    public static NodeClass parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (NodeClass) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static NodeClass parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (NodeClass) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static NodeClass parseFrom(gva gvaVar) {
        return (NodeClass) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static NodeClass parseFrom(gva gvaVar, aux auxVar) {
        return (NodeClass) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static NodeClass parseFrom(byte[] bArr) {
        return (NodeClass) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NodeClass parseFrom(byte[] bArr, aux auxVar) {
        return (NodeClass) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static NodeClass parseFrom(InputStream inputStream) {
        return (NodeClass) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NodeClass parseFrom(InputStream inputStream, aux auxVar) {
        return (NodeClass) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static NodeClass parseFrom(owe oweVar) {
        return (NodeClass) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static NodeClass parseFrom(owe oweVar, aux auxVar) {
        return (NodeClass) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
