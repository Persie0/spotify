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
public final class AddMembersRequest extends AbstractC0269h implements AddMembersRequestOrBuilder {
    public static final int ADD_MEMBERS_FIELD_NUMBER = 1;
    private static final AddMembersRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private AddMembers addMembers_;
    private int bitField0_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.AddMembersRequest$1 */
    /* JADX INFO: loaded from: classes5.dex */
    public static /* synthetic */ class C03301 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3158xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3158xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3158xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3158xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3158xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3158xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3158xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3158xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder extends AbstractC0268g implements AddMembersRequestOrBuilder {
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

        public Builder clearAddMembers() {
            copyOnWrite();
            ((AddMembersRequest) this.instance).clearAddMembers();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddMembersRequestOrBuilder
        public AddMembers getAddMembers() {
            return ((AddMembersRequest) this.instance).getAddMembers();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddMembersRequestOrBuilder
        public boolean hasAddMembers() {
            return ((AddMembersRequest) this.instance).hasAddMembers();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeAddMembers(AddMembers addMembers) {
            copyOnWrite();
            ((AddMembersRequest) this.instance).mergeAddMembers(addMembers);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setAddMembers(AddMembers addMembers) {
            copyOnWrite();
            ((AddMembersRequest) this.instance).setAddMembers(addMembers);
            return this;
        }

        private Builder() {
            super(AddMembersRequest.DEFAULT_INSTANCE);
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

        public Builder setAddMembers(AddMembers.Builder builder) {
            copyOnWrite();
            ((AddMembersRequest) this.instance).setAddMembers((AddMembers) builder.build());
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
        AddMembersRequest addMembersRequest = new AddMembersRequest();
        DEFAULT_INSTANCE = addMembersRequest;
        AbstractC0269h.registerDefaultInstance(AddMembersRequest.class, addMembersRequest);
    }

    private AddMembersRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddMembers() {
        this.addMembers_ = null;
        this.bitField0_ &= -2;
    }

    public static AddMembersRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddMembers(AddMembers addMembers) {
        addMembers.getClass();
        AddMembers addMembers2 = this.addMembers_;
        if (addMembers2 == null || addMembers2 == AddMembers.getDefaultInstance()) {
            this.addMembers_ = addMembers;
        } else {
            this.addMembers_ = (AddMembers) ((AddMembers.Builder) AddMembers.newBuilder(this.addMembers_).mergeFrom((AbstractC0269h) addMembers)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AddMembersRequest parseDelimitedFrom(InputStream inputStream) {
        return (AddMembersRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AddMembersRequest parseFrom(ByteBuffer byteBuffer) {
        return (AddMembersRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddMembers(AddMembers addMembers) {
        addMembers.getClass();
        this.addMembers_ = addMembers;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "addMembers_"});
        }
        if (iOrdinal == 3) {
            return new AddMembersRequest();
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
        synchronized (AddMembersRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.AddMembersRequestOrBuilder
    public AddMembers getAddMembers() {
        AddMembers addMembers = this.addMembers_;
        return addMembers == null ? AddMembers.getDefaultInstance() : addMembers;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddMembersRequestOrBuilder
    public boolean hasAddMembers() {
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

    public static Builder newBuilder(AddMembersRequest addMembersRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(addMembersRequest);
    }

    public static AddMembersRequest parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (AddMembersRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static AddMembersRequest parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (AddMembersRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static AddMembersRequest parseFrom(gva gvaVar) {
        return (AddMembersRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static AddMembersRequest parseFrom(gva gvaVar, aux auxVar) {
        return (AddMembersRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static AddMembersRequest parseFrom(byte[] bArr) {
        return (AddMembersRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AddMembersRequest parseFrom(byte[] bArr, aux auxVar) {
        return (AddMembersRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static AddMembersRequest parseFrom(InputStream inputStream) {
        return (AddMembersRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AddMembersRequest parseFrom(InputStream inputStream, aux auxVar) {
        return (AddMembersRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static AddMembersRequest parseFrom(owe oweVar) {
        return (AddMembersRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static AddMembersRequest parseFrom(owe oweVar, aux auxVar) {
        return (AddMembersRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
