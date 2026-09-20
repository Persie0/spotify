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

/* JADX INFO: loaded from: classes5.dex */
public final class SharedHierarchies extends AbstractC0269h implements SharedHierarchiesOrBuilder {
    private static final SharedHierarchies DEFAULT_INSTANCE;
    public static final int HIERARCHIES_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ae50 hierarchies_ = AbstractC0269h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.SharedHierarchies$1 */
    public static /* synthetic */ class C04551 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3265xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3265xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3265xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3265xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3265xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3265xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3265xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3265xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements SharedHierarchiesOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addAllHierarchies(Iterable<? extends SharedHierarchyEntry> iterable) {
            copyOnWrite();
            ((SharedHierarchies) this.instance).addAllHierarchies(iterable);
            return this;
        }

        public Builder addHierarchies(SharedHierarchyEntry sharedHierarchyEntry) {
            copyOnWrite();
            ((SharedHierarchies) this.instance).addHierarchies(sharedHierarchyEntry);
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

        public Builder clearHierarchies() {
            copyOnWrite();
            ((SharedHierarchies) this.instance).clearHierarchies();
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

        @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchiesOrBuilder
        public SharedHierarchyEntry getHierarchies(int i) {
            return ((SharedHierarchies) this.instance).getHierarchies(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchiesOrBuilder
        public int getHierarchiesCount() {
            return ((SharedHierarchies) this.instance).getHierarchiesCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchiesOrBuilder
        public List<SharedHierarchyEntry> getHierarchiesList() {
            return Collections.unmodifiableList(((SharedHierarchies) this.instance).getHierarchiesList());
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder removeHierarchies(int i) {
            copyOnWrite();
            ((SharedHierarchies) this.instance).removeHierarchies(i);
            return this;
        }

        public Builder setHierarchies(int i, SharedHierarchyEntry sharedHierarchyEntry) {
            copyOnWrite();
            ((SharedHierarchies) this.instance).setHierarchies(i, sharedHierarchyEntry);
            return this;
        }

        private Builder() {
            super(SharedHierarchies.DEFAULT_INSTANCE);
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

        public Builder addHierarchies(int i, SharedHierarchyEntry sharedHierarchyEntry) {
            copyOnWrite();
            ((SharedHierarchies) this.instance).addHierarchies(i, sharedHierarchyEntry);
            return this;
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

        public Builder setHierarchies(int i, SharedHierarchyEntry.Builder builder) {
            copyOnWrite();
            ((SharedHierarchies) this.instance).setHierarchies(i, (SharedHierarchyEntry) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        public Builder addHierarchies(SharedHierarchyEntry.Builder builder) {
            copyOnWrite();
            ((SharedHierarchies) this.instance).addHierarchies((SharedHierarchyEntry) builder.build());
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

        public Builder addHierarchies(int i, SharedHierarchyEntry.Builder builder) {
            copyOnWrite();
            ((SharedHierarchies) this.instance).addHierarchies(i, (SharedHierarchyEntry) builder.build());
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
        SharedHierarchies sharedHierarchies = new SharedHierarchies();
        DEFAULT_INSTANCE = sharedHierarchies;
        AbstractC0269h.registerDefaultInstance(SharedHierarchies.class, sharedHierarchies);
    }

    private SharedHierarchies() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllHierarchies(Iterable<? extends SharedHierarchyEntry> iterable) {
        ensureHierarchiesIsMutable();
        AbstractC2118m8.addAll(iterable, this.hierarchies_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHierarchies(SharedHierarchyEntry sharedHierarchyEntry) {
        sharedHierarchyEntry.getClass();
        ensureHierarchiesIsMutable();
        this.hierarchies_.add(sharedHierarchyEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHierarchies() {
        this.hierarchies_ = AbstractC0269h.emptyProtobufList();
    }

    private void ensureHierarchiesIsMutable() {
        ae50 ae50Var = this.hierarchies_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.hierarchies_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    public static SharedHierarchies getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static SharedHierarchies parseDelimitedFrom(InputStream inputStream) {
        return (SharedHierarchies) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SharedHierarchies parseFrom(ByteBuffer byteBuffer) {
        return (SharedHierarchies) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeHierarchies(int i) {
        ensureHierarchiesIsMutable();
        this.hierarchies_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHierarchies(int i, SharedHierarchyEntry sharedHierarchyEntry) {
        sharedHierarchyEntry.getClass();
        ensureHierarchiesIsMutable();
        this.hierarchies_.set(i, sharedHierarchyEntry);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"hierarchies_", SharedHierarchyEntry.class});
        }
        if (iOrdinal == 3) {
            return new SharedHierarchies();
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
        synchronized (SharedHierarchies.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchiesOrBuilder
    public SharedHierarchyEntry getHierarchies(int i) {
        return (SharedHierarchyEntry) this.hierarchies_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchiesOrBuilder
    public int getHierarchiesCount() {
        return this.hierarchies_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.SharedHierarchiesOrBuilder
    public List<SharedHierarchyEntry> getHierarchiesList() {
        return this.hierarchies_;
    }

    public SharedHierarchyEntryOrBuilder getHierarchiesOrBuilder(int i) {
        return (SharedHierarchyEntryOrBuilder) this.hierarchies_.get(i);
    }

    public List<? extends SharedHierarchyEntryOrBuilder> getHierarchiesOrBuilderList() {
        return this.hierarchies_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(SharedHierarchies sharedHierarchies) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(sharedHierarchies);
    }

    public static SharedHierarchies parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (SharedHierarchies) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static SharedHierarchies parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (SharedHierarchies) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static SharedHierarchies parseFrom(gva gvaVar) {
        return (SharedHierarchies) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHierarchies(int i, SharedHierarchyEntry sharedHierarchyEntry) {
        sharedHierarchyEntry.getClass();
        ensureHierarchiesIsMutable();
        this.hierarchies_.add(i, sharedHierarchyEntry);
    }

    public static SharedHierarchies parseFrom(gva gvaVar, aux auxVar) {
        return (SharedHierarchies) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static SharedHierarchies parseFrom(byte[] bArr) {
        return (SharedHierarchies) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SharedHierarchies parseFrom(byte[] bArr, aux auxVar) {
        return (SharedHierarchies) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static SharedHierarchies parseFrom(InputStream inputStream) {
        return (SharedHierarchies) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SharedHierarchies parseFrom(InputStream inputStream, aux auxVar) {
        return (SharedHierarchies) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static SharedHierarchies parseFrom(owe oweVar) {
        return (SharedHierarchies) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static SharedHierarchies parseFrom(owe oweVar, aux auxVar) {
        return (SharedHierarchies) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
