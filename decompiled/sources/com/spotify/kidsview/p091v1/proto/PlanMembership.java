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
public final class PlanMembership extends AbstractC0269h implements PlanMembershipOrBuilder {
    public static final int ADD_ACTION_FIELD_NUMBER = 3;
    private static final PlanMembership DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAN_LABEL_FIELD_NUMBER = 1;
    public static final int REMOVE_ACTION_FIELD_NUMBER = 2;
    private AddToPlanAction addAction_;
    private int bitField0_;
    private String planLabel_ = "";
    private RemoveFromPlanAction removeAction_;

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.PlanMembership$1 */
    public static /* synthetic */ class C08221 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f4997xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f4997xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4997xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4997xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4997xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4997xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4997xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4997xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements PlanMembershipOrBuilder {
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

        public Builder clearAddAction() {
            copyOnWrite();
            ((PlanMembership) this.instance).clearAddAction();
            return this;
        }

        public Builder clearPlanLabel() {
            copyOnWrite();
            ((PlanMembership) this.instance).clearPlanLabel();
            return this;
        }

        public Builder clearRemoveAction() {
            copyOnWrite();
            ((PlanMembership) this.instance).clearRemoveAction();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.kidsview.p091v1.proto.PlanMembershipOrBuilder
        public AddToPlanAction getAddAction() {
            return ((PlanMembership) this.instance).getAddAction();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.kidsview.p091v1.proto.PlanMembershipOrBuilder
        public String getPlanLabel() {
            return ((PlanMembership) this.instance).getPlanLabel();
        }

        @Override // com.spotify.kidsview.p091v1.proto.PlanMembershipOrBuilder
        public gva getPlanLabelBytes() {
            return ((PlanMembership) this.instance).getPlanLabelBytes();
        }

        @Override // com.spotify.kidsview.p091v1.proto.PlanMembershipOrBuilder
        public RemoveFromPlanAction getRemoveAction() {
            return ((PlanMembership) this.instance).getRemoveAction();
        }

        @Override // com.spotify.kidsview.p091v1.proto.PlanMembershipOrBuilder
        public boolean hasAddAction() {
            return ((PlanMembership) this.instance).hasAddAction();
        }

        @Override // com.spotify.kidsview.p091v1.proto.PlanMembershipOrBuilder
        public boolean hasRemoveAction() {
            return ((PlanMembership) this.instance).hasRemoveAction();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeAddAction(AddToPlanAction addToPlanAction) {
            copyOnWrite();
            ((PlanMembership) this.instance).mergeAddAction(addToPlanAction);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeRemoveAction(RemoveFromPlanAction removeFromPlanAction) {
            copyOnWrite();
            ((PlanMembership) this.instance).mergeRemoveAction(removeFromPlanAction);
            return this;
        }

        public Builder setAddAction(AddToPlanAction addToPlanAction) {
            copyOnWrite();
            ((PlanMembership) this.instance).setAddAction(addToPlanAction);
            return this;
        }

        public Builder setPlanLabel(String str) {
            copyOnWrite();
            ((PlanMembership) this.instance).setPlanLabel(str);
            return this;
        }

        public Builder setPlanLabelBytes(gva gvaVar) {
            copyOnWrite();
            ((PlanMembership) this.instance).setPlanLabelBytes(gvaVar);
            return this;
        }

        public Builder setRemoveAction(RemoveFromPlanAction removeFromPlanAction) {
            copyOnWrite();
            ((PlanMembership) this.instance).setRemoveAction(removeFromPlanAction);
            return this;
        }

        private Builder() {
            super(PlanMembership.DEFAULT_INSTANCE);
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

        public Builder setAddAction(AddToPlanAction.Builder builder) {
            copyOnWrite();
            ((PlanMembership) this.instance).setAddAction((AddToPlanAction) builder.build());
            return this;
        }

        public Builder setRemoveAction(RemoveFromPlanAction.Builder builder) {
            copyOnWrite();
            ((PlanMembership) this.instance).setRemoveAction((RemoveFromPlanAction) builder.build());
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
        PlanMembership planMembership = new PlanMembership();
        DEFAULT_INSTANCE = planMembership;
        AbstractC0269h.registerDefaultInstance(PlanMembership.class, planMembership);
    }

    private PlanMembership() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddAction() {
        this.addAction_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlanLabel() {
        this.planLabel_ = getDefaultInstance().getPlanLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemoveAction() {
        this.removeAction_ = null;
        this.bitField0_ &= -2;
    }

    public static PlanMembership getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddAction(AddToPlanAction addToPlanAction) {
        addToPlanAction.getClass();
        AddToPlanAction addToPlanAction2 = this.addAction_;
        if (addToPlanAction2 == null || addToPlanAction2 == AddToPlanAction.getDefaultInstance()) {
            this.addAction_ = addToPlanAction;
        } else {
            this.addAction_ = (AddToPlanAction) ((AddToPlanAction.Builder) AddToPlanAction.newBuilder(this.addAction_).mergeFrom((AbstractC0269h) addToPlanAction)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRemoveAction(RemoveFromPlanAction removeFromPlanAction) {
        removeFromPlanAction.getClass();
        RemoveFromPlanAction removeFromPlanAction2 = this.removeAction_;
        if (removeFromPlanAction2 == null || removeFromPlanAction2 == RemoveFromPlanAction.getDefaultInstance()) {
            this.removeAction_ = removeFromPlanAction;
        } else {
            this.removeAction_ = (RemoveFromPlanAction) ((RemoveFromPlanAction.Builder) RemoveFromPlanAction.newBuilder(this.removeAction_).mergeFrom((AbstractC0269h) removeFromPlanAction)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static PlanMembership parseDelimitedFrom(InputStream inputStream) {
        return (PlanMembership) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlanMembership parseFrom(ByteBuffer byteBuffer) {
        return (PlanMembership) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddAction(AddToPlanAction addToPlanAction) {
        addToPlanAction.getClass();
        this.addAction_ = addToPlanAction;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlanLabel(String str) {
        str.getClass();
        this.planLabel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlanLabelBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.planLabel_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoveAction(RemoveFromPlanAction removeFromPlanAction) {
        removeFromPlanAction.getClass();
        this.removeAction_ = removeFromPlanAction;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "planLabel_", "removeAction_", "addAction_"});
        }
        if (iOrdinal == 3) {
            return new PlanMembership();
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
        synchronized (PlanMembership.class) {
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

    @Override // com.spotify.kidsview.p091v1.proto.PlanMembershipOrBuilder
    public AddToPlanAction getAddAction() {
        AddToPlanAction addToPlanAction = this.addAction_;
        return addToPlanAction == null ? AddToPlanAction.getDefaultInstance() : addToPlanAction;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.kidsview.p091v1.proto.PlanMembershipOrBuilder
    public String getPlanLabel() {
        return this.planLabel_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.PlanMembershipOrBuilder
    public gva getPlanLabelBytes() {
        return gva.m45888f(this.planLabel_);
    }

    @Override // com.spotify.kidsview.p091v1.proto.PlanMembershipOrBuilder
    public RemoveFromPlanAction getRemoveAction() {
        RemoveFromPlanAction removeFromPlanAction = this.removeAction_;
        return removeFromPlanAction == null ? RemoveFromPlanAction.getDefaultInstance() : removeFromPlanAction;
    }

    @Override // com.spotify.kidsview.p091v1.proto.PlanMembershipOrBuilder
    public boolean hasAddAction() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.kidsview.p091v1.proto.PlanMembershipOrBuilder
    public boolean hasRemoveAction() {
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

    public static Builder newBuilder(PlanMembership planMembership) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(planMembership);
    }

    public static PlanMembership parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (PlanMembership) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static PlanMembership parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (PlanMembership) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static PlanMembership parseFrom(gva gvaVar) {
        return (PlanMembership) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static PlanMembership parseFrom(gva gvaVar, aux auxVar) {
        return (PlanMembership) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static PlanMembership parseFrom(byte[] bArr) {
        return (PlanMembership) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlanMembership parseFrom(byte[] bArr, aux auxVar) {
        return (PlanMembership) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static PlanMembership parseFrom(InputStream inputStream) {
        return (PlanMembership) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlanMembership parseFrom(InputStream inputStream, aux auxVar) {
        return (PlanMembership) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static PlanMembership parseFrom(owe oweVar) {
        return (PlanMembership) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static PlanMembership parseFrom(owe oweVar, aux auxVar) {
        return (PlanMembership) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
