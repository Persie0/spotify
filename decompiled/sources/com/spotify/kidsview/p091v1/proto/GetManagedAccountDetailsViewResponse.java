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
public final class GetManagedAccountDetailsViewResponse extends AbstractC0269h implements GetManagedAccountDetailsViewResponseOrBuilder {
    public static final int ACCOUNT_TYPE_FIELD_NUMBER = 3;
    public static final int CHILD_ID_FIELD_NUMBER = 1;
    private static final GetManagedAccountDetailsViewResponse DEFAULT_INSTANCE;
    public static final int DELETE_ACTION_FIELD_NUMBER = 7;
    public static final int GRADUATION_BANNER_FIELD_NUMBER = 5;
    public static final int HAS_AUDIOBOOKS_AVAILABLE_FIELD_NUMBER = 8;
    public static final int PARENTAL_CONTROLS_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PLAN_MEMBERSHIP_FIELD_NUMBER = 6;
    public static final int PROFILE_FIELD_NUMBER = 2;
    private int accountType_;
    private int bitField0_;
    private String childId_ = "";
    private DeleteAction deleteAction_;
    private GraduationBanner graduationBanner_;
    private boolean hasAudiobooksAvailable_;
    private ParentalControls parentalControls_;
    private PlanMembership planMembership_;
    private ManagedAccountProfile profile_;

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponse$1 */
    public static /* synthetic */ class C08161 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f4991xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f4991xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4991xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4991xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4991xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4991xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4991xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4991xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements GetManagedAccountDetailsViewResponseOrBuilder {
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
            ((GetManagedAccountDetailsViewResponse) this.instance).clearAccountType();
            return this;
        }

        public Builder clearChildId() {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) this.instance).clearChildId();
            return this;
        }

        public Builder clearDeleteAction() {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) this.instance).clearDeleteAction();
            return this;
        }

        public Builder clearGraduationBanner() {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) this.instance).clearGraduationBanner();
            return this;
        }

        public Builder clearHasAudiobooksAvailable() {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) this.instance).clearHasAudiobooksAvailable();
            return this;
        }

        public Builder clearParentalControls() {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) this.instance).clearParentalControls();
            return this;
        }

        public Builder clearPlanMembership() {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) this.instance).clearPlanMembership();
            return this;
        }

        public Builder clearProfile() {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) this.instance).clearProfile();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public AccountType getAccountType() {
            return ((GetManagedAccountDetailsViewResponse) this.instance).getAccountType();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public int getAccountTypeValue() {
            return ((GetManagedAccountDetailsViewResponse) this.instance).getAccountTypeValue();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public String getChildId() {
            return ((GetManagedAccountDetailsViewResponse) this.instance).getChildId();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public gva getChildIdBytes() {
            return ((GetManagedAccountDetailsViewResponse) this.instance).getChildIdBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public DeleteAction getDeleteAction() {
            return ((GetManagedAccountDetailsViewResponse) this.instance).getDeleteAction();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public GraduationBanner getGraduationBanner() {
            return ((GetManagedAccountDetailsViewResponse) this.instance).getGraduationBanner();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public boolean getHasAudiobooksAvailable() {
            return ((GetManagedAccountDetailsViewResponse) this.instance).getHasAudiobooksAvailable();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public ParentalControls getParentalControls() {
            return ((GetManagedAccountDetailsViewResponse) this.instance).getParentalControls();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public PlanMembership getPlanMembership() {
            return ((GetManagedAccountDetailsViewResponse) this.instance).getPlanMembership();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public ManagedAccountProfile getProfile() {
            return ((GetManagedAccountDetailsViewResponse) this.instance).getProfile();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public boolean hasDeleteAction() {
            return ((GetManagedAccountDetailsViewResponse) this.instance).hasDeleteAction();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public boolean hasGraduationBanner() {
            return ((GetManagedAccountDetailsViewResponse) this.instance).hasGraduationBanner();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public boolean hasParentalControls() {
            return ((GetManagedAccountDetailsViewResponse) this.instance).hasParentalControls();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public boolean hasPlanMembership() {
            return ((GetManagedAccountDetailsViewResponse) this.instance).hasPlanMembership();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
        public boolean hasProfile() {
            return ((GetManagedAccountDetailsViewResponse) this.instance).hasProfile();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeDeleteAction(DeleteAction deleteAction) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) this.instance).mergeDeleteAction(deleteAction);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeGraduationBanner(GraduationBanner graduationBanner) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) this.instance).mergeGraduationBanner(graduationBanner);
            return this;
        }

        public Builder mergeParentalControls(ParentalControls parentalControls) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) this.instance).mergeParentalControls(parentalControls);
            return this;
        }

        public Builder mergePlanMembership(PlanMembership planMembership) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) this.instance).mergePlanMembership(planMembership);
            return this;
        }

        public Builder mergeProfile(ManagedAccountProfile managedAccountProfile) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) this.instance).mergeProfile(managedAccountProfile);
            return this;
        }

        public Builder setAccountType(AccountType accountType) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) this.instance).setAccountType(accountType);
            return this;
        }

        public Builder setAccountTypeValue(int i) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) this.instance).setAccountTypeValue(i);
            return this;
        }

        public Builder setChildId(String str) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) this.instance).setChildId(str);
            return this;
        }

        public Builder setChildIdBytes(gva gvaVar) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) this.instance).setChildIdBytes(gvaVar);
            return this;
        }

        public Builder setDeleteAction(DeleteAction deleteAction) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) this.instance).setDeleteAction(deleteAction);
            return this;
        }

        public Builder setGraduationBanner(GraduationBanner graduationBanner) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) this.instance).setGraduationBanner(graduationBanner);
            return this;
        }

        public Builder setHasAudiobooksAvailable(boolean z) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) this.instance).setHasAudiobooksAvailable(z);
            return this;
        }

        public Builder setParentalControls(ParentalControls parentalControls) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) this.instance).setParentalControls(parentalControls);
            return this;
        }

        public Builder setPlanMembership(PlanMembership planMembership) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) this.instance).setPlanMembership(planMembership);
            return this;
        }

        public Builder setProfile(ManagedAccountProfile managedAccountProfile) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) this.instance).setProfile(managedAccountProfile);
            return this;
        }

        private Builder() {
            super(GetManagedAccountDetailsViewResponse.DEFAULT_INSTANCE);
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

        public Builder setDeleteAction(DeleteAction.Builder builder) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) this.instance).setDeleteAction((DeleteAction) builder.build());
            return this;
        }

        public Builder setGraduationBanner(GraduationBanner.Builder builder) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) this.instance).setGraduationBanner((GraduationBanner) builder.build());
            return this;
        }

        public Builder setParentalControls(ParentalControls.Builder builder) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) this.instance).setParentalControls((ParentalControls) builder.build());
            return this;
        }

        public Builder setPlanMembership(PlanMembership.Builder builder) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) this.instance).setPlanMembership((PlanMembership) builder.build());
            return this;
        }

        public Builder setProfile(ManagedAccountProfile.Builder builder) {
            copyOnWrite();
            ((GetManagedAccountDetailsViewResponse) this.instance).setProfile((ManagedAccountProfile) builder.build());
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
        GetManagedAccountDetailsViewResponse getManagedAccountDetailsViewResponse = new GetManagedAccountDetailsViewResponse();
        DEFAULT_INSTANCE = getManagedAccountDetailsViewResponse;
        AbstractC0269h.registerDefaultInstance(GetManagedAccountDetailsViewResponse.class, getManagedAccountDetailsViewResponse);
    }

    private GetManagedAccountDetailsViewResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountType() {
        this.accountType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChildId() {
        this.childId_ = getDefaultInstance().getChildId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeleteAction() {
        this.deleteAction_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGraduationBanner() {
        this.graduationBanner_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasAudiobooksAvailable() {
        this.hasAudiobooksAvailable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParentalControls() {
        this.parentalControls_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlanMembership() {
        this.planMembership_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProfile() {
        this.profile_ = null;
        this.bitField0_ &= -2;
    }

    public static GetManagedAccountDetailsViewResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeleteAction(DeleteAction deleteAction) {
        deleteAction.getClass();
        DeleteAction deleteAction2 = this.deleteAction_;
        if (deleteAction2 == null || deleteAction2 == DeleteAction.getDefaultInstance()) {
            this.deleteAction_ = deleteAction;
        } else {
            this.deleteAction_ = (DeleteAction) ((DeleteAction.Builder) DeleteAction.newBuilder(this.deleteAction_).mergeFrom((AbstractC0269h) deleteAction)).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGraduationBanner(GraduationBanner graduationBanner) {
        graduationBanner.getClass();
        GraduationBanner graduationBanner2 = this.graduationBanner_;
        if (graduationBanner2 == null || graduationBanner2 == GraduationBanner.getDefaultInstance()) {
            this.graduationBanner_ = graduationBanner;
        } else {
            this.graduationBanner_ = (GraduationBanner) ((GraduationBanner.Builder) GraduationBanner.newBuilder(this.graduationBanner_).mergeFrom((AbstractC0269h) graduationBanner)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParentalControls(ParentalControls parentalControls) {
        parentalControls.getClass();
        ParentalControls parentalControls2 = this.parentalControls_;
        if (parentalControls2 == null || parentalControls2 == ParentalControls.getDefaultInstance()) {
            this.parentalControls_ = parentalControls;
        } else {
            this.parentalControls_ = (ParentalControls) ((ParentalControls.Builder) ParentalControls.newBuilder(this.parentalControls_).mergeFrom((AbstractC0269h) parentalControls)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlanMembership(PlanMembership planMembership) {
        planMembership.getClass();
        PlanMembership planMembership2 = this.planMembership_;
        if (planMembership2 == null || planMembership2 == PlanMembership.getDefaultInstance()) {
            this.planMembership_ = planMembership;
        } else {
            this.planMembership_ = (PlanMembership) ((PlanMembership.Builder) PlanMembership.newBuilder(this.planMembership_).mergeFrom((AbstractC0269h) planMembership)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeProfile(ManagedAccountProfile managedAccountProfile) {
        managedAccountProfile.getClass();
        ManagedAccountProfile managedAccountProfile2 = this.profile_;
        if (managedAccountProfile2 == null || managedAccountProfile2 == ManagedAccountProfile.getDefaultInstance()) {
            this.profile_ = managedAccountProfile;
        } else {
            this.profile_ = (ManagedAccountProfile) ((ManagedAccountProfile.Builder) ManagedAccountProfile.newBuilder(this.profile_).mergeFrom((AbstractC0269h) managedAccountProfile)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetManagedAccountDetailsViewResponse parseDelimitedFrom(InputStream inputStream) {
        return (GetManagedAccountDetailsViewResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetManagedAccountDetailsViewResponse parseFrom(ByteBuffer byteBuffer) {
        return (GetManagedAccountDetailsViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setChildId(String str) {
        str.getClass();
        this.childId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChildIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.childId_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeleteAction(DeleteAction deleteAction) {
        deleteAction.getClass();
        this.deleteAction_ = deleteAction;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGraduationBanner(GraduationBanner graduationBanner) {
        graduationBanner.getClass();
        this.graduationBanner_ = graduationBanner;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasAudiobooksAvailable(boolean z) {
        this.hasAudiobooksAvailable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParentalControls(ParentalControls parentalControls) {
        parentalControls.getClass();
        this.parentalControls_ = parentalControls;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlanMembership(PlanMembership planMembership) {
        planMembership.getClass();
        this.planMembership_ = planMembership;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProfile(ManagedAccountProfile managedAccountProfile) {
        managedAccountProfile.getClass();
        this.profile_ = managedAccountProfile;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\f\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\b\u0007", new Object[]{"bitField0_", "childId_", "profile_", "accountType_", "parentalControls_", "graduationBanner_", "planMembership_", "deleteAction_", "hasAudiobooksAvailable_"});
        }
        if (iOrdinal == 3) {
            return new GetManagedAccountDetailsViewResponse();
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
        synchronized (GetManagedAccountDetailsViewResponse.class) {
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

    @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public AccountType getAccountType() {
        AccountType accountTypeForNumber = AccountType.forNumber(this.accountType_);
        return accountTypeForNumber == null ? AccountType.UNRECOGNIZED : accountTypeForNumber;
    }

    @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public int getAccountTypeValue() {
        return this.accountType_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public String getChildId() {
        return this.childId_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public gva getChildIdBytes() {
        return gva.m45888f(this.childId_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public DeleteAction getDeleteAction() {
        DeleteAction deleteAction = this.deleteAction_;
        return deleteAction == null ? DeleteAction.getDefaultInstance() : deleteAction;
    }

    @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public GraduationBanner getGraduationBanner() {
        GraduationBanner graduationBanner = this.graduationBanner_;
        return graduationBanner == null ? GraduationBanner.getDefaultInstance() : graduationBanner;
    }

    @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public boolean getHasAudiobooksAvailable() {
        return this.hasAudiobooksAvailable_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public ParentalControls getParentalControls() {
        ParentalControls parentalControls = this.parentalControls_;
        return parentalControls == null ? ParentalControls.getDefaultInstance() : parentalControls;
    }

    @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public PlanMembership getPlanMembership() {
        PlanMembership planMembership = this.planMembership_;
        return planMembership == null ? PlanMembership.getDefaultInstance() : planMembership;
    }

    @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public ManagedAccountProfile getProfile() {
        ManagedAccountProfile managedAccountProfile = this.profile_;
        return managedAccountProfile == null ? ManagedAccountProfile.getDefaultInstance() : managedAccountProfile;
    }

    @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public boolean hasDeleteAction() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public boolean hasGraduationBanner() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public boolean hasParentalControls() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public boolean hasPlanMembership() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountDetailsViewResponseOrBuilder
    public boolean hasProfile() {
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

    public static Builder newBuilder(GetManagedAccountDetailsViewResponse getManagedAccountDetailsViewResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getManagedAccountDetailsViewResponse);
    }

    public static GetManagedAccountDetailsViewResponse parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (GetManagedAccountDetailsViewResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetManagedAccountDetailsViewResponse parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (GetManagedAccountDetailsViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static GetManagedAccountDetailsViewResponse parseFrom(gva gvaVar) {
        return (GetManagedAccountDetailsViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static GetManagedAccountDetailsViewResponse parseFrom(gva gvaVar, aux auxVar) {
        return (GetManagedAccountDetailsViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static GetManagedAccountDetailsViewResponse parseFrom(byte[] bArr) {
        return (GetManagedAccountDetailsViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetManagedAccountDetailsViewResponse parseFrom(byte[] bArr, aux auxVar) {
        return (GetManagedAccountDetailsViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static GetManagedAccountDetailsViewResponse parseFrom(InputStream inputStream) {
        return (GetManagedAccountDetailsViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetManagedAccountDetailsViewResponse parseFrom(InputStream inputStream, aux auxVar) {
        return (GetManagedAccountDetailsViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetManagedAccountDetailsViewResponse parseFrom(owe oweVar) {
        return (GetManagedAccountDetailsViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static GetManagedAccountDetailsViewResponse parseFrom(owe oweVar, aux auxVar) {
        return (GetManagedAccountDetailsViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
