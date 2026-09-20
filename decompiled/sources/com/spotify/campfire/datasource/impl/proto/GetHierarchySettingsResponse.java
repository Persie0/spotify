package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.aux;
import p204p.gva;
import p204p.n350;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.ud50;
import p204p.vd50;
import p204p.wd50;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class GetHierarchySettingsResponse extends AbstractC0269h implements GetHierarchySettingsResponseOrBuilder {
    private static final GetHierarchySettingsResponse DEFAULT_INSTANCE;
    public static final int DISABLED_RECEIPT_TYPES_FIELD_NUMBER = 2;
    public static final int MUTED_FOR_CURRENT_USER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private static final vd50 disabledReceiptTypes_converter_ = new vd50() { // from class: com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponse.1
        @Override // p204p.vd50
        public ReceiptType convert(int i) {
            ReceiptType receiptTypeForNumber = ReceiptType.forNumber(i);
            return receiptTypeForNumber == null ? ReceiptType.UNRECOGNIZED : receiptTypeForNumber;
        }
    };
    private int disabledReceiptTypesMemoizedSerializedSize;
    private ud50 disabledReceiptTypes_ = AbstractC0269h.emptyIntList();
    private boolean mutedForCurrentUser_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponse$2 */
    public static /* synthetic */ class C03742 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3199xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3199xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3199xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3199xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3199xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3199xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3199xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3199xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements GetHierarchySettingsResponseOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addAllDisabledReceiptTypes(Iterable<? extends ReceiptType> iterable) {
            copyOnWrite();
            ((GetHierarchySettingsResponse) this.instance).addAllDisabledReceiptTypes(iterable);
            return this;
        }

        public Builder addAllDisabledReceiptTypesValue(Iterable<Integer> iterable) {
            copyOnWrite();
            ((GetHierarchySettingsResponse) this.instance).addAllDisabledReceiptTypesValue(iterable);
            return this;
        }

        public Builder addDisabledReceiptTypes(ReceiptType receiptType) {
            copyOnWrite();
            ((GetHierarchySettingsResponse) this.instance).addDisabledReceiptTypes(receiptType);
            return this;
        }

        public Builder addDisabledReceiptTypesValue(int i) {
            copyOnWrite();
            ((GetHierarchySettingsResponse) this.instance).addDisabledReceiptTypesValue(i);
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

        public Builder clearDisabledReceiptTypes() {
            copyOnWrite();
            ((GetHierarchySettingsResponse) this.instance).clearDisabledReceiptTypes();
            return this;
        }

        public Builder clearMutedForCurrentUser() {
            copyOnWrite();
            ((GetHierarchySettingsResponse) this.instance).clearMutedForCurrentUser();
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

        @Override // com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponseOrBuilder
        public ReceiptType getDisabledReceiptTypes(int i) {
            return ((GetHierarchySettingsResponse) this.instance).getDisabledReceiptTypes(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponseOrBuilder
        public int getDisabledReceiptTypesCount() {
            return ((GetHierarchySettingsResponse) this.instance).getDisabledReceiptTypesCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponseOrBuilder
        public List<ReceiptType> getDisabledReceiptTypesList() {
            return ((GetHierarchySettingsResponse) this.instance).getDisabledReceiptTypesList();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponseOrBuilder
        public int getDisabledReceiptTypesValue(int i) {
            return ((GetHierarchySettingsResponse) this.instance).getDisabledReceiptTypesValue(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponseOrBuilder
        public List<Integer> getDisabledReceiptTypesValueList() {
            return Collections.unmodifiableList(((GetHierarchySettingsResponse) this.instance).getDisabledReceiptTypesValueList());
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponseOrBuilder
        public boolean getMutedForCurrentUser() {
            return ((GetHierarchySettingsResponse) this.instance).getMutedForCurrentUser();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setDisabledReceiptTypes(int i, ReceiptType receiptType) {
            copyOnWrite();
            ((GetHierarchySettingsResponse) this.instance).setDisabledReceiptTypes(i, receiptType);
            return this;
        }

        public Builder setDisabledReceiptTypesValue(int i, int i2) {
            copyOnWrite();
            ((GetHierarchySettingsResponse) this.instance).setDisabledReceiptTypesValue(i, i2);
            return this;
        }

        public Builder setMutedForCurrentUser(boolean z) {
            copyOnWrite();
            ((GetHierarchySettingsResponse) this.instance).setMutedForCurrentUser(z);
            return this;
        }

        private Builder() {
            super(GetHierarchySettingsResponse.DEFAULT_INSTANCE);
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
        GetHierarchySettingsResponse getHierarchySettingsResponse = new GetHierarchySettingsResponse();
        DEFAULT_INSTANCE = getHierarchySettingsResponse;
        AbstractC0269h.registerDefaultInstance(GetHierarchySettingsResponse.class, getHierarchySettingsResponse);
    }

    private GetHierarchySettingsResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDisabledReceiptTypes(Iterable<? extends ReceiptType> iterable) {
        ensureDisabledReceiptTypesIsMutable();
        for (ReceiptType receiptType : iterable) {
            ((n350) this.disabledReceiptTypes_).m63581b(receiptType.getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDisabledReceiptTypesValue(Iterable<Integer> iterable) {
        ensureDisabledReceiptTypesIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            ((n350) this.disabledReceiptTypes_).m63581b(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDisabledReceiptTypes(ReceiptType receiptType) {
        receiptType.getClass();
        ensureDisabledReceiptTypesIsMutable();
        ((n350) this.disabledReceiptTypes_).m63581b(receiptType.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDisabledReceiptTypesValue(int i) {
        ensureDisabledReceiptTypesIsMutable();
        ((n350) this.disabledReceiptTypes_).m63581b(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisabledReceiptTypes() {
        this.disabledReceiptTypes_ = AbstractC0269h.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMutedForCurrentUser() {
        this.mutedForCurrentUser_ = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureDisabledReceiptTypesIsMutable() {
        ud50 ud50Var = this.disabledReceiptTypes_;
        if (((AbstractC1733c9) ud50Var).f35342a) {
            return;
        }
        this.disabledReceiptTypes_ = AbstractC0269h.mutableCopy(ud50Var);
    }

    public static GetHierarchySettingsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetHierarchySettingsResponse parseDelimitedFrom(InputStream inputStream) {
        return (GetHierarchySettingsResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetHierarchySettingsResponse parseFrom(ByteBuffer byteBuffer) {
        return (GetHierarchySettingsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisabledReceiptTypes(int i, ReceiptType receiptType) {
        receiptType.getClass();
        ensureDisabledReceiptTypesIsMutable();
        ((n350) this.disabledReceiptTypes_).m63585i(i, receiptType.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisabledReceiptTypesValue(int i, int i2) {
        ensureDisabledReceiptTypesIsMutable();
        ((n350) this.disabledReceiptTypes_).m63585i(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMutedForCurrentUser(boolean z) {
        this.mutedForCurrentUser_ = z;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0007\u0002,", new Object[]{"mutedForCurrentUser_", "disabledReceiptTypes_"});
        }
        if (iOrdinal == 3) {
            return new GetHierarchySettingsResponse();
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
        synchronized (GetHierarchySettingsResponse.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponseOrBuilder
    public ReceiptType getDisabledReceiptTypes(int i) {
        ReceiptType receiptTypeForNumber = ReceiptType.forNumber(((n350) this.disabledReceiptTypes_).m63583e(i));
        return receiptTypeForNumber == null ? ReceiptType.UNRECOGNIZED : receiptTypeForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponseOrBuilder
    public int getDisabledReceiptTypesCount() {
        return ((n350) this.disabledReceiptTypes_).size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponseOrBuilder
    public List<ReceiptType> getDisabledReceiptTypesList() {
        return new wd50(this.disabledReceiptTypes_, disabledReceiptTypes_converter_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponseOrBuilder
    public int getDisabledReceiptTypesValue(int i) {
        return ((n350) this.disabledReceiptTypes_).m63583e(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponseOrBuilder
    public List<Integer> getDisabledReceiptTypesValueList() {
        return this.disabledReceiptTypes_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GetHierarchySettingsResponseOrBuilder
    public boolean getMutedForCurrentUser() {
        return this.mutedForCurrentUser_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(GetHierarchySettingsResponse getHierarchySettingsResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getHierarchySettingsResponse);
    }

    public static GetHierarchySettingsResponse parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (GetHierarchySettingsResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetHierarchySettingsResponse parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (GetHierarchySettingsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static GetHierarchySettingsResponse parseFrom(gva gvaVar) {
        return (GetHierarchySettingsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static GetHierarchySettingsResponse parseFrom(gva gvaVar, aux auxVar) {
        return (GetHierarchySettingsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static GetHierarchySettingsResponse parseFrom(byte[] bArr) {
        return (GetHierarchySettingsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetHierarchySettingsResponse parseFrom(byte[] bArr, aux auxVar) {
        return (GetHierarchySettingsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static GetHierarchySettingsResponse parseFrom(InputStream inputStream) {
        return (GetHierarchySettingsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetHierarchySettingsResponse parseFrom(InputStream inputStream, aux auxVar) {
        return (GetHierarchySettingsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetHierarchySettingsResponse parseFrom(owe oweVar) {
        return (GetHierarchySettingsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static GetHierarchySettingsResponse parseFrom(owe oweVar, aux auxVar) {
        return (GetHierarchySettingsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
