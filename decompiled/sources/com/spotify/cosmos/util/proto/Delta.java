package com.spotify.cosmos.util.proto;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.aux;
import p204p.gva;
import p204p.od50;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.rd50;
import p204p.sd50;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class Delta extends AbstractC0269h implements DeltaOrBuilder {
    private static final Delta DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 2;
    public static final int LENGTH_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int index_;
    private int length_;
    private byte memoizedIsInitialized = 2;
    private int type_;

    /* JADX INFO: renamed from: com.spotify.cosmos.util.proto.Delta$1 */
    public static /* synthetic */ class C06621 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3513xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3513xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3513xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3513xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3513xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3513xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3513xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3513xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements DeltaOrBuilder {
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

        public Builder clearIndex() {
            copyOnWrite();
            ((Delta) this.instance).clearIndex();
            return this;
        }

        public Builder clearLength() {
            copyOnWrite();
            ((Delta) this.instance).clearLength();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((Delta) this.instance).clearType();
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

        @Override // com.spotify.cosmos.util.proto.DeltaOrBuilder
        public int getIndex() {
            return ((Delta) this.instance).getIndex();
        }

        @Override // com.spotify.cosmos.util.proto.DeltaOrBuilder
        public int getLength() {
            return ((Delta) this.instance).getLength();
        }

        @Override // com.spotify.cosmos.util.proto.DeltaOrBuilder
        public Type getType() {
            return ((Delta) this.instance).getType();
        }

        @Override // com.spotify.cosmos.util.proto.DeltaOrBuilder
        public boolean hasIndex() {
            return ((Delta) this.instance).hasIndex();
        }

        @Override // com.spotify.cosmos.util.proto.DeltaOrBuilder
        public boolean hasLength() {
            return ((Delta) this.instance).hasLength();
        }

        @Override // com.spotify.cosmos.util.proto.DeltaOrBuilder
        public boolean hasType() {
            return ((Delta) this.instance).hasType();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setIndex(int i) {
            copyOnWrite();
            ((Delta) this.instance).setIndex(i);
            return this;
        }

        public Builder setLength(int i) {
            copyOnWrite();
            ((Delta) this.instance).setLength(i);
            return this;
        }

        public Builder setType(Type type) {
            copyOnWrite();
            ((Delta) this.instance).setType(type);
            return this;
        }

        private Builder() {
            super(Delta.DEFAULT_INSTANCE);
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

    public enum Type implements od50 {
        DELETE(0),
        INSERT(1);

        public static final int DELETE_VALUE = 0;
        public static final int INSERT_VALUE = 1;
        private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.cosmos.util.proto.Delta.Type.1
            @Override // p204p.rd50
            public Type findValueByNumber(int i) {
                return Type.forNumber(i);
            }
        };
        private final int value;

        public static final class TypeVerifier implements sd50 {
            static final sd50 INSTANCE = new TypeVerifier();

            private TypeVerifier() {
            }

            @Override // p204p.sd50
            public boolean isInRange(int i) {
                return Type.forNumber(i) != null;
            }
        }

        Type(int i) {
            this.value = i;
        }

        public static Type forNumber(int i) {
            if (i == 0) {
                return DELETE;
            }
            if (i != 1) {
                return null;
            }
            return INSERT;
        }

        public static rd50 internalGetValueMap() {
            return internalValueMap;
        }

        public static sd50 internalGetVerifier() {
            return TypeVerifier.INSTANCE;
        }

        @Override // p204p.od50
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static Type valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Delta delta = new Delta();
        DEFAULT_INSTANCE = delta;
        AbstractC0269h.registerDefaultInstance(Delta.class, delta);
    }

    private Delta() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.bitField0_ &= -3;
        this.index_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLength() {
        this.bitField0_ &= -5;
        this.length_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static Delta getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Delta parseDelimitedFrom(InputStream inputStream) {
        return (Delta) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Delta parseFrom(ByteBuffer byteBuffer) {
        return (Delta) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(int i) {
        this.bitField0_ |= 2;
        this.index_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLength(int i) {
        this.bitField0_ |= 4;
        this.length_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(Type type) {
        this.type_ = type.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int i = 0;
        switch (z110Var.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = (byte) (obj != null ? 1 : 0);
                return null;
            case 2:
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᴌ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002", new Object[]{"bitField0_", "type_", Type.internalGetVerifier(), "index_", "length_"});
            case 3:
                return new Delta();
            case 4:
                return new Builder(i);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                r2n0 r2n0Var = PARSER;
                if (r2n0Var != null) {
                    return r2n0Var;
                }
                synchronized (Delta.class) {
                    try {
                        r110Var = PARSER;
                        if (r110Var == null) {
                            r110Var = new r110(DEFAULT_INSTANCE);
                            PARSER = r110Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return r110Var;
            default:
                throw null;
        }
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.proto.DeltaOrBuilder
    public int getIndex() {
        return this.index_;
    }

    @Override // com.spotify.cosmos.util.proto.DeltaOrBuilder
    public int getLength() {
        return this.length_;
    }

    @Override // com.spotify.cosmos.util.proto.DeltaOrBuilder
    public Type getType() {
        Type typeForNumber = Type.forNumber(this.type_);
        return typeForNumber == null ? Type.DELETE : typeForNumber;
    }

    @Override // com.spotify.cosmos.util.proto.DeltaOrBuilder
    public boolean hasIndex() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.DeltaOrBuilder
    public boolean hasLength() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.DeltaOrBuilder
    public boolean hasType() {
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

    public static Builder newBuilder(Delta delta) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(delta);
    }

    public static Delta parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (Delta) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static Delta parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (Delta) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static Delta parseFrom(gva gvaVar) {
        return (Delta) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static Delta parseFrom(gva gvaVar, aux auxVar) {
        return (Delta) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static Delta parseFrom(byte[] bArr) {
        return (Delta) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Delta parseFrom(byte[] bArr, aux auxVar) {
        return (Delta) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static Delta parseFrom(InputStream inputStream) {
        return (Delta) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Delta parseFrom(InputStream inputStream, aux auxVar) {
        return (Delta) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static Delta parseFrom(owe oweVar) {
        return (Delta) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static Delta parseFrom(owe oweVar, aux auxVar) {
        return (Delta) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
