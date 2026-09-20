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
public final class SharedHierarchyEntry extends AbstractC0269h implements SharedHierarchyEntryOrBuilder {
    private static final SharedHierarchyEntry DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private HierarchyIdentifier identifier_;
    private int type_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.SharedHierarchyEntry$1 */
    public static /* synthetic */ class C04561 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3266xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3266xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3266xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3266xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3266xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3266xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3266xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3266xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements SharedHierarchyEntryOrBuilder {
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

        public Builder clearIdentifier() {
            copyOnWrite();
            ((SharedHierarchyEntry) this.instance).clearIdentifier();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((SharedHierarchyEntry) this.instance).clearType();
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

        @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchyEntryOrBuilder
        public HierarchyIdentifier getIdentifier() {
            return ((SharedHierarchyEntry) this.instance).getIdentifier();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchyEntryOrBuilder
        public HierarchyType getType() {
            return ((SharedHierarchyEntry) this.instance).getType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchyEntryOrBuilder
        public int getTypeValue() {
            return ((SharedHierarchyEntry) this.instance).getTypeValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchyEntryOrBuilder
        public boolean hasIdentifier() {
            return ((SharedHierarchyEntry) this.instance).hasIdentifier();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeIdentifier(HierarchyIdentifier hierarchyIdentifier) {
            copyOnWrite();
            ((SharedHierarchyEntry) this.instance).mergeIdentifier(hierarchyIdentifier);
            return this;
        }

        public Builder setIdentifier(HierarchyIdentifier hierarchyIdentifier) {
            copyOnWrite();
            ((SharedHierarchyEntry) this.instance).setIdentifier(hierarchyIdentifier);
            return this;
        }

        public Builder setType(HierarchyType hierarchyType) {
            copyOnWrite();
            ((SharedHierarchyEntry) this.instance).setType(hierarchyType);
            return this;
        }

        public Builder setTypeValue(int i) {
            copyOnWrite();
            ((SharedHierarchyEntry) this.instance).setTypeValue(i);
            return this;
        }

        private Builder() {
            super(SharedHierarchyEntry.DEFAULT_INSTANCE);
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

        public Builder setIdentifier(HierarchyIdentifier.Builder builder) {
            copyOnWrite();
            ((SharedHierarchyEntry) this.instance).setIdentifier((HierarchyIdentifier) builder.build());
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
        SharedHierarchyEntry sharedHierarchyEntry = new SharedHierarchyEntry();
        DEFAULT_INSTANCE = sharedHierarchyEntry;
        AbstractC0269h.registerDefaultInstance(SharedHierarchyEntry.class, sharedHierarchyEntry);
    }

    private SharedHierarchyEntry() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdentifier() {
        this.identifier_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static SharedHierarchyEntry getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIdentifier(HierarchyIdentifier hierarchyIdentifier) {
        hierarchyIdentifier.getClass();
        HierarchyIdentifier hierarchyIdentifier2 = this.identifier_;
        if (hierarchyIdentifier2 == null || hierarchyIdentifier2 == HierarchyIdentifier.getDefaultInstance()) {
            this.identifier_ = hierarchyIdentifier;
        } else {
            this.identifier_ = (HierarchyIdentifier) ((HierarchyIdentifier.Builder) HierarchyIdentifier.newBuilder(this.identifier_).mergeFrom((AbstractC0269h) hierarchyIdentifier)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static SharedHierarchyEntry parseDelimitedFrom(InputStream inputStream) {
        return (SharedHierarchyEntry) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SharedHierarchyEntry parseFrom(ByteBuffer byteBuffer) {
        return (SharedHierarchyEntry) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentifier(HierarchyIdentifier hierarchyIdentifier) {
        hierarchyIdentifier.getClass();
        this.identifier_ = hierarchyIdentifier;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(HierarchyType hierarchyType) {
        this.type_ = hierarchyType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "identifier_", "type_"});
        }
        if (iOrdinal == 3) {
            return new SharedHierarchyEntry();
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
        synchronized (SharedHierarchyEntry.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchyEntryOrBuilder
    public HierarchyIdentifier getIdentifier() {
        HierarchyIdentifier hierarchyIdentifier = this.identifier_;
        return hierarchyIdentifier == null ? HierarchyIdentifier.getDefaultInstance() : hierarchyIdentifier;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchyEntryOrBuilder
    public HierarchyType getType() {
        HierarchyType hierarchyTypeForNumber = HierarchyType.forNumber(this.type_);
        return hierarchyTypeForNumber == null ? HierarchyType.UNRECOGNIZED : hierarchyTypeForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchyEntryOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchyEntryOrBuilder
    public boolean hasIdentifier() {
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

    public static Builder newBuilder(SharedHierarchyEntry sharedHierarchyEntry) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(sharedHierarchyEntry);
    }

    public static SharedHierarchyEntry parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (SharedHierarchyEntry) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static SharedHierarchyEntry parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (SharedHierarchyEntry) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static SharedHierarchyEntry parseFrom(gva gvaVar) {
        return (SharedHierarchyEntry) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static SharedHierarchyEntry parseFrom(gva gvaVar, aux auxVar) {
        return (SharedHierarchyEntry) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static SharedHierarchyEntry parseFrom(byte[] bArr) {
        return (SharedHierarchyEntry) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SharedHierarchyEntry parseFrom(byte[] bArr, aux auxVar) {
        return (SharedHierarchyEntry) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static SharedHierarchyEntry parseFrom(InputStream inputStream) {
        return (SharedHierarchyEntry) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SharedHierarchyEntry parseFrom(InputStream inputStream, aux auxVar) {
        return (SharedHierarchyEntry) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static SharedHierarchyEntry parseFrom(owe oweVar) {
        return (SharedHierarchyEntry) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static SharedHierarchyEntry parseFrom(owe oweVar, aux auxVar) {
        return (SharedHierarchyEntry) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
