package com.spotify.kidsview.p091v1.proto;

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
public final class GetChildrenResponse extends AbstractC0269h implements GetChildrenResponseOrBuilder {
    public static final int CHILDREN_FIELD_NUMBER = 1;
    private static final GetChildrenResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private ae50 children_ = AbstractC0269h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.GetChildrenResponse$1 */
    public static /* synthetic */ class C08131 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f4988xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f4988xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4988xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4988xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4988xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4988xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4988xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4988xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements GetChildrenResponseOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addAllChildren(Iterable<? extends Child> iterable) {
            copyOnWrite();
            ((GetChildrenResponse) this.instance).addAllChildren(iterable);
            return this;
        }

        public Builder addChildren(Child child) {
            copyOnWrite();
            ((GetChildrenResponse) this.instance).addChildren(child);
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

        public Builder clearChildren() {
            copyOnWrite();
            ((GetChildrenResponse) this.instance).clearChildren();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetChildrenResponseOrBuilder
        public Child getChildren(int i) {
            return ((GetChildrenResponse) this.instance).getChildren(i);
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetChildrenResponseOrBuilder
        public int getChildrenCount() {
            return ((GetChildrenResponse) this.instance).getChildrenCount();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetChildrenResponseOrBuilder
        public List<Child> getChildrenList() {
            return Collections.unmodifiableList(((GetChildrenResponse) this.instance).getChildrenList());
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder removeChildren(int i) {
            copyOnWrite();
            ((GetChildrenResponse) this.instance).removeChildren(i);
            return this;
        }

        public Builder setChildren(int i, Child child) {
            copyOnWrite();
            ((GetChildrenResponse) this.instance).setChildren(i, child);
            return this;
        }

        private Builder() {
            super(GetChildrenResponse.DEFAULT_INSTANCE);
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

        public Builder addChildren(int i, Child child) {
            copyOnWrite();
            ((GetChildrenResponse) this.instance).addChildren(i, child);
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

        public Builder setChildren(int i, Child.Builder builder) {
            copyOnWrite();
            ((GetChildrenResponse) this.instance).setChildren(i, (Child) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        public Builder addChildren(Child.Builder builder) {
            copyOnWrite();
            ((GetChildrenResponse) this.instance).addChildren((Child) builder.build());
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

        public Builder addChildren(int i, Child.Builder builder) {
            copyOnWrite();
            ((GetChildrenResponse) this.instance).addChildren(i, (Child) builder.build());
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
        GetChildrenResponse getChildrenResponse = new GetChildrenResponse();
        DEFAULT_INSTANCE = getChildrenResponse;
        AbstractC0269h.registerDefaultInstance(GetChildrenResponse.class, getChildrenResponse);
    }

    private GetChildrenResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllChildren(Iterable<? extends Child> iterable) {
        ensureChildrenIsMutable();
        AbstractC2118m8.addAll(iterable, this.children_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChildren(Child child) {
        child.getClass();
        ensureChildrenIsMutable();
        this.children_.add(child);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChildren() {
        this.children_ = AbstractC0269h.emptyProtobufList();
    }

    private void ensureChildrenIsMutable() {
        ae50 ae50Var = this.children_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.children_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    public static GetChildrenResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetChildrenResponse parseDelimitedFrom(InputStream inputStream) {
        return (GetChildrenResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetChildrenResponse parseFrom(ByteBuffer byteBuffer) {
        return (GetChildrenResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeChildren(int i) {
        ensureChildrenIsMutable();
        this.children_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChildren(int i, Child child) {
        child.getClass();
        ensureChildrenIsMutable();
        this.children_.set(i, child);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"children_", Child.class});
        }
        if (iOrdinal == 3) {
            return new GetChildrenResponse();
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
        synchronized (GetChildrenResponse.class) {
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

    @Override // com.spotify.kidsview.p091v1.proto.GetChildrenResponseOrBuilder
    public Child getChildren(int i) {
        return (Child) this.children_.get(i);
    }

    @Override // com.spotify.kidsview.p091v1.proto.GetChildrenResponseOrBuilder
    public int getChildrenCount() {
        return this.children_.size();
    }

    @Override // com.spotify.kidsview.p091v1.proto.GetChildrenResponseOrBuilder
    public List<Child> getChildrenList() {
        return this.children_;
    }

    public ChildOrBuilder getChildrenOrBuilder(int i) {
        return (ChildOrBuilder) this.children_.get(i);
    }

    public List<? extends ChildOrBuilder> getChildrenOrBuilderList() {
        return this.children_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(GetChildrenResponse getChildrenResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getChildrenResponse);
    }

    public static GetChildrenResponse parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (GetChildrenResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetChildrenResponse parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (GetChildrenResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static GetChildrenResponse parseFrom(gva gvaVar) {
        return (GetChildrenResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChildren(int i, Child child) {
        child.getClass();
        ensureChildrenIsMutable();
        this.children_.add(i, child);
    }

    public static GetChildrenResponse parseFrom(gva gvaVar, aux auxVar) {
        return (GetChildrenResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static GetChildrenResponse parseFrom(byte[] bArr) {
        return (GetChildrenResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetChildrenResponse parseFrom(byte[] bArr, aux auxVar) {
        return (GetChildrenResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static GetChildrenResponse parseFrom(InputStream inputStream) {
        return (GetChildrenResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetChildrenResponse parseFrom(InputStream inputStream, aux auxVar) {
        return (GetChildrenResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetChildrenResponse parseFrom(owe oweVar) {
        return (GetChildrenResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static GetChildrenResponse parseFrom(owe oweVar, aux auxVar) {
        return (GetChildrenResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
