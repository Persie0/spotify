package com.spotify.kidsview.p091v1.proto;

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

/* JADX INFO: loaded from: classes7.dex */
public final class GetDeleteManagedAccountViewResponse extends AbstractC0269h implements GetDeleteManagedAccountViewResponseOrBuilder {
    public static final int ACCOUNT_TYPE_FIELD_NUMBER = 1;
    private static final GetDeleteManagedAccountViewResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAN_DETAILS_FIELD_NUMBER = 2;
    private int accountType_;
    private int bitField0_;
    private DeletePlanDetails planDetails_;

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.GetDeleteManagedAccountViewResponse$1 */
    public static /* synthetic */ class C08141 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f4989xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f4989xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4989xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4989xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4989xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4989xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4989xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4989xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements GetDeleteManagedAccountViewResponseOrBuilder {
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

        public Builder clearAccountType() {
            copyOnWrite();
            ((GetDeleteManagedAccountViewResponse) this.instance).clearAccountType();
            return this;
        }

        public Builder clearPlanDetails() {
            copyOnWrite();
            ((GetDeleteManagedAccountViewResponse) this.instance).clearPlanDetails();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetDeleteManagedAccountViewResponseOrBuilder
        public AccountType getAccountType() {
            return ((GetDeleteManagedAccountViewResponse) this.instance).getAccountType();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetDeleteManagedAccountViewResponseOrBuilder
        public int getAccountTypeValue() {
            return ((GetDeleteManagedAccountViewResponse) this.instance).getAccountTypeValue();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetDeleteManagedAccountViewResponseOrBuilder
        public DeletePlanDetails getPlanDetails() {
            return ((GetDeleteManagedAccountViewResponse) this.instance).getPlanDetails();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetDeleteManagedAccountViewResponseOrBuilder
        public boolean hasPlanDetails() {
            return ((GetDeleteManagedAccountViewResponse) this.instance).hasPlanDetails();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergePlanDetails(DeletePlanDetails deletePlanDetails) {
            copyOnWrite();
            ((GetDeleteManagedAccountViewResponse) this.instance).mergePlanDetails(deletePlanDetails);
            return this;
        }

        public Builder setAccountType(AccountType accountType) {
            copyOnWrite();
            ((GetDeleteManagedAccountViewResponse) this.instance).setAccountType(accountType);
            return this;
        }

        public Builder setAccountTypeValue(int i) {
            copyOnWrite();
            ((GetDeleteManagedAccountViewResponse) this.instance).setAccountTypeValue(i);
            return this;
        }

        public Builder setPlanDetails(DeletePlanDetails deletePlanDetails) {
            copyOnWrite();
            ((GetDeleteManagedAccountViewResponse) this.instance).setPlanDetails(deletePlanDetails);
            return this;
        }

        private Builder() {
            super(GetDeleteManagedAccountViewResponse.DEFAULT_INSTANCE);
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

        public Builder setPlanDetails(DeletePlanDetails.Builder builder) {
            copyOnWrite();
            ((GetDeleteManagedAccountViewResponse) this.instance).setPlanDetails((DeletePlanDetails) builder.build());
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
        GetDeleteManagedAccountViewResponse getDeleteManagedAccountViewResponse = new GetDeleteManagedAccountViewResponse();
        DEFAULT_INSTANCE = getDeleteManagedAccountViewResponse;
        AbstractC0269h.registerDefaultInstance(GetDeleteManagedAccountViewResponse.class, getDeleteManagedAccountViewResponse);
    }

    private GetDeleteManagedAccountViewResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountType() {
        this.accountType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlanDetails() {
        this.planDetails_ = null;
        this.bitField0_ &= -2;
    }

    public static GetDeleteManagedAccountViewResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlanDetails(DeletePlanDetails deletePlanDetails) {
        deletePlanDetails.getClass();
        DeletePlanDetails deletePlanDetails2 = this.planDetails_;
        if (deletePlanDetails2 == null || deletePlanDetails2 == DeletePlanDetails.getDefaultInstance()) {
            this.planDetails_ = deletePlanDetails;
        } else {
            this.planDetails_ = (DeletePlanDetails) ((DeletePlanDetails.Builder) DeletePlanDetails.newBuilder(this.planDetails_).mergeFrom((AbstractC0269h) deletePlanDetails)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetDeleteManagedAccountViewResponse parseDelimitedFrom(InputStream inputStream) {
        return (GetDeleteManagedAccountViewResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetDeleteManagedAccountViewResponse parseFrom(ByteBuffer byteBuffer) {
        return (GetDeleteManagedAccountViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountType(AccountType accountType) {
        this.accountType_ = accountType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountTypeValue(int i) {
        this.accountType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlanDetails(DeletePlanDetails deletePlanDetails) {
        deletePlanDetails.getClass();
        this.planDetails_ = deletePlanDetails;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "accountType_", "planDetails_"});
        }
        if (iOrdinal == 3) {
            return new GetDeleteManagedAccountViewResponse();
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
        synchronized (GetDeleteManagedAccountViewResponse.class) {
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

    @Override // com.spotify.kidsview.p091v1.proto.GetDeleteManagedAccountViewResponseOrBuilder
    public AccountType getAccountType() {
        AccountType accountTypeForNumber = AccountType.forNumber(this.accountType_);
        return accountTypeForNumber == null ? AccountType.UNRECOGNIZED : accountTypeForNumber;
    }

    @Override // com.spotify.kidsview.p091v1.proto.GetDeleteManagedAccountViewResponseOrBuilder
    public int getAccountTypeValue() {
        return this.accountType_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.kidsview.p091v1.proto.GetDeleteManagedAccountViewResponseOrBuilder
    public DeletePlanDetails getPlanDetails() {
        DeletePlanDetails deletePlanDetails = this.planDetails_;
        return deletePlanDetails == null ? DeletePlanDetails.getDefaultInstance() : deletePlanDetails;
    }

    @Override // com.spotify.kidsview.p091v1.proto.GetDeleteManagedAccountViewResponseOrBuilder
    public boolean hasPlanDetails() {
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

    public static Builder newBuilder(GetDeleteManagedAccountViewResponse getDeleteManagedAccountViewResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getDeleteManagedAccountViewResponse);
    }

    public static GetDeleteManagedAccountViewResponse parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (GetDeleteManagedAccountViewResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetDeleteManagedAccountViewResponse parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (GetDeleteManagedAccountViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static GetDeleteManagedAccountViewResponse parseFrom(gva gvaVar) {
        return (GetDeleteManagedAccountViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static GetDeleteManagedAccountViewResponse parseFrom(gva gvaVar, aux auxVar) {
        return (GetDeleteManagedAccountViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static GetDeleteManagedAccountViewResponse parseFrom(byte[] bArr) {
        return (GetDeleteManagedAccountViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetDeleteManagedAccountViewResponse parseFrom(byte[] bArr, aux auxVar) {
        return (GetDeleteManagedAccountViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static GetDeleteManagedAccountViewResponse parseFrom(InputStream inputStream) {
        return (GetDeleteManagedAccountViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetDeleteManagedAccountViewResponse parseFrom(InputStream inputStream, aux auxVar) {
        return (GetDeleteManagedAccountViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetDeleteManagedAccountViewResponse parseFrom(owe oweVar) {
        return (GetDeleteManagedAccountViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static GetDeleteManagedAccountViewResponse parseFrom(owe oweVar, aux auxVar) {
        return (GetDeleteManagedAccountViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
