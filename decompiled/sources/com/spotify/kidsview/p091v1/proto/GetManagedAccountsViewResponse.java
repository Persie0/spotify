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
public final class GetManagedAccountsViewResponse extends AbstractC0269h implements GetManagedAccountsViewResponseOrBuilder {
    public static final int CREATE_NEW_MANAGED_ACCOUNT_ACTION_FIELD_NUMBER = 5;
    private static final GetManagedAccountsViewResponse DEFAULT_INSTANCE;
    public static final int MANAGED_ACCOUNTS_FIELD_NUMBER = 1;
    public static final int MAX_MANAGED_ACCOUNT_AGE_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private CreateNewManagedAccountAction createNewManagedAccountAction_;
    private ae50 managedAccounts_ = AbstractC0269h.emptyProtobufList();
    private int maxManagedAccountAge_;

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.GetManagedAccountsViewResponse$1 */
    public static /* synthetic */ class C08171 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f4992xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f4992xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4992xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4992xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4992xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4992xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4992xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4992xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements GetManagedAccountsViewResponseOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addAllManagedAccounts(Iterable<? extends ManagedAccount> iterable) {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) this.instance).addAllManagedAccounts(iterable);
            return this;
        }

        public Builder addManagedAccounts(ManagedAccount managedAccount) {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) this.instance).addManagedAccounts(managedAccount);
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

        public Builder clearCreateNewManagedAccountAction() {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) this.instance).clearCreateNewManagedAccountAction();
            return this;
        }

        public Builder clearManagedAccounts() {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) this.instance).clearManagedAccounts();
            return this;
        }

        public Builder clearMaxManagedAccountAge() {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) this.instance).clearMaxManagedAccountAge();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountsViewResponseOrBuilder
        public CreateNewManagedAccountAction getCreateNewManagedAccountAction() {
            return ((GetManagedAccountsViewResponse) this.instance).getCreateNewManagedAccountAction();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountsViewResponseOrBuilder
        public ManagedAccount getManagedAccounts(int i) {
            return ((GetManagedAccountsViewResponse) this.instance).getManagedAccounts(i);
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountsViewResponseOrBuilder
        public int getManagedAccountsCount() {
            return ((GetManagedAccountsViewResponse) this.instance).getManagedAccountsCount();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountsViewResponseOrBuilder
        public List<ManagedAccount> getManagedAccountsList() {
            return Collections.unmodifiableList(((GetManagedAccountsViewResponse) this.instance).getManagedAccountsList());
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountsViewResponseOrBuilder
        public int getMaxManagedAccountAge() {
            return ((GetManagedAccountsViewResponse) this.instance).getMaxManagedAccountAge();
        }

        @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountsViewResponseOrBuilder
        public boolean hasCreateNewManagedAccountAction() {
            return ((GetManagedAccountsViewResponse) this.instance).hasCreateNewManagedAccountAction();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeCreateNewManagedAccountAction(CreateNewManagedAccountAction createNewManagedAccountAction) {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) this.instance).mergeCreateNewManagedAccountAction(createNewManagedAccountAction);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder removeManagedAccounts(int i) {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) this.instance).removeManagedAccounts(i);
            return this;
        }

        public Builder setCreateNewManagedAccountAction(CreateNewManagedAccountAction createNewManagedAccountAction) {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) this.instance).setCreateNewManagedAccountAction(createNewManagedAccountAction);
            return this;
        }

        public Builder setManagedAccounts(int i, ManagedAccount managedAccount) {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) this.instance).setManagedAccounts(i, managedAccount);
            return this;
        }

        public Builder setMaxManagedAccountAge(int i) {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) this.instance).setMaxManagedAccountAge(i);
            return this;
        }

        private Builder() {
            super(GetManagedAccountsViewResponse.DEFAULT_INSTANCE);
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

        public Builder addManagedAccounts(int i, ManagedAccount managedAccount) {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) this.instance).addManagedAccounts(i, managedAccount);
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

        public Builder setCreateNewManagedAccountAction(CreateNewManagedAccountAction.Builder builder) {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) this.instance).setCreateNewManagedAccountAction((CreateNewManagedAccountAction) builder.build());
            return this;
        }

        public Builder setManagedAccounts(int i, ManagedAccount.Builder builder) {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) this.instance).setManagedAccounts(i, (ManagedAccount) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        public Builder addManagedAccounts(ManagedAccount.Builder builder) {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) this.instance).addManagedAccounts((ManagedAccount) builder.build());
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

        public Builder addManagedAccounts(int i, ManagedAccount.Builder builder) {
            copyOnWrite();
            ((GetManagedAccountsViewResponse) this.instance).addManagedAccounts(i, (ManagedAccount) builder.build());
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
        GetManagedAccountsViewResponse getManagedAccountsViewResponse = new GetManagedAccountsViewResponse();
        DEFAULT_INSTANCE = getManagedAccountsViewResponse;
        AbstractC0269h.registerDefaultInstance(GetManagedAccountsViewResponse.class, getManagedAccountsViewResponse);
    }

    private GetManagedAccountsViewResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllManagedAccounts(Iterable<? extends ManagedAccount> iterable) {
        ensureManagedAccountsIsMutable();
        AbstractC2118m8.addAll(iterable, this.managedAccounts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addManagedAccounts(ManagedAccount managedAccount) {
        managedAccount.getClass();
        ensureManagedAccountsIsMutable();
        this.managedAccounts_.add(managedAccount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreateNewManagedAccountAction() {
        this.createNewManagedAccountAction_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearManagedAccounts() {
        this.managedAccounts_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxManagedAccountAge() {
        this.maxManagedAccountAge_ = 0;
    }

    private void ensureManagedAccountsIsMutable() {
        ae50 ae50Var = this.managedAccounts_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.managedAccounts_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    public static GetManagedAccountsViewResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCreateNewManagedAccountAction(CreateNewManagedAccountAction createNewManagedAccountAction) {
        createNewManagedAccountAction.getClass();
        CreateNewManagedAccountAction createNewManagedAccountAction2 = this.createNewManagedAccountAction_;
        if (createNewManagedAccountAction2 == null || createNewManagedAccountAction2 == CreateNewManagedAccountAction.getDefaultInstance()) {
            this.createNewManagedAccountAction_ = createNewManagedAccountAction;
        } else {
            this.createNewManagedAccountAction_ = (CreateNewManagedAccountAction) ((CreateNewManagedAccountAction.Builder) CreateNewManagedAccountAction.newBuilder(this.createNewManagedAccountAction_).mergeFrom((AbstractC0269h) createNewManagedAccountAction)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetManagedAccountsViewResponse parseDelimitedFrom(InputStream inputStream) {
        return (GetManagedAccountsViewResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetManagedAccountsViewResponse parseFrom(ByteBuffer byteBuffer) {
        return (GetManagedAccountsViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeManagedAccounts(int i) {
        ensureManagedAccountsIsMutable();
        this.managedAccounts_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreateNewManagedAccountAction(CreateNewManagedAccountAction createNewManagedAccountAction) {
        createNewManagedAccountAction.getClass();
        this.createNewManagedAccountAction_ = createNewManagedAccountAction;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManagedAccounts(int i, ManagedAccount managedAccount) {
        managedAccount.getClass();
        ensureManagedAccountsIsMutable();
        this.managedAccounts_.set(i, managedAccount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxManagedAccountAge(int i) {
        this.maxManagedAccountAge_ = i;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0000\u0001\u001b\u0005ဉ\u0000\u0006\u000b", new Object[]{"bitField0_", "managedAccounts_", ManagedAccount.class, "createNewManagedAccountAction_", "maxManagedAccountAge_"});
        }
        if (iOrdinal == 3) {
            return new GetManagedAccountsViewResponse();
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
        synchronized (GetManagedAccountsViewResponse.class) {
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

    @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountsViewResponseOrBuilder
    public CreateNewManagedAccountAction getCreateNewManagedAccountAction() {
        CreateNewManagedAccountAction createNewManagedAccountAction = this.createNewManagedAccountAction_;
        return createNewManagedAccountAction == null ? CreateNewManagedAccountAction.getDefaultInstance() : createNewManagedAccountAction;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountsViewResponseOrBuilder
    public ManagedAccount getManagedAccounts(int i) {
        return (ManagedAccount) this.managedAccounts_.get(i);
    }

    @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountsViewResponseOrBuilder
    public int getManagedAccountsCount() {
        return this.managedAccounts_.size();
    }

    @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountsViewResponseOrBuilder
    public List<ManagedAccount> getManagedAccountsList() {
        return this.managedAccounts_;
    }

    public ManagedAccountOrBuilder getManagedAccountsOrBuilder(int i) {
        return (ManagedAccountOrBuilder) this.managedAccounts_.get(i);
    }

    public List<? extends ManagedAccountOrBuilder> getManagedAccountsOrBuilderList() {
        return this.managedAccounts_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountsViewResponseOrBuilder
    public int getMaxManagedAccountAge() {
        return this.maxManagedAccountAge_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.GetManagedAccountsViewResponseOrBuilder
    public boolean hasCreateNewManagedAccountAction() {
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

    public static Builder newBuilder(GetManagedAccountsViewResponse getManagedAccountsViewResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getManagedAccountsViewResponse);
    }

    public static GetManagedAccountsViewResponse parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (GetManagedAccountsViewResponse) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetManagedAccountsViewResponse parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (GetManagedAccountsViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static GetManagedAccountsViewResponse parseFrom(gva gvaVar) {
        return (GetManagedAccountsViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addManagedAccounts(int i, ManagedAccount managedAccount) {
        managedAccount.getClass();
        ensureManagedAccountsIsMutable();
        this.managedAccounts_.add(i, managedAccount);
    }

    public static GetManagedAccountsViewResponse parseFrom(gva gvaVar, aux auxVar) {
        return (GetManagedAccountsViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static GetManagedAccountsViewResponse parseFrom(byte[] bArr) {
        return (GetManagedAccountsViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetManagedAccountsViewResponse parseFrom(byte[] bArr, aux auxVar) {
        return (GetManagedAccountsViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static GetManagedAccountsViewResponse parseFrom(InputStream inputStream) {
        return (GetManagedAccountsViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetManagedAccountsViewResponse parseFrom(InputStream inputStream, aux auxVar) {
        return (GetManagedAccountsViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GetManagedAccountsViewResponse parseFrom(owe oweVar) {
        return (GetManagedAccountsViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static GetManagedAccountsViewResponse parseFrom(owe oweVar, aux auxVar) {
        return (GetManagedAccountsViewResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
