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
public final class DeletePlanDetails extends AbstractC0269h implements DeletePlanDetailsOrBuilder {
    private static final DeletePlanDetails DEFAULT_INSTANCE;
    public static final int IS_EXPIRING_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PLAN_NAME_FIELD_NUMBER = 1;
    private boolean isExpiring_;
    private String planName_ = "";

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.DeletePlanDetails$1 */
    public static /* synthetic */ class C08111 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f4986xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f4986xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4986xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4986xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4986xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4986xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4986xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4986xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements DeletePlanDetailsOrBuilder {
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

        public Builder clearIsExpiring() {
            copyOnWrite();
            ((DeletePlanDetails) this.instance).clearIsExpiring();
            return this;
        }

        public Builder clearPlanName() {
            copyOnWrite();
            ((DeletePlanDetails) this.instance).clearPlanName();
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

        @Override // com.spotify.kidsview.p091v1.proto.DeletePlanDetailsOrBuilder
        public boolean getIsExpiring() {
            return ((DeletePlanDetails) this.instance).getIsExpiring();
        }

        @Override // com.spotify.kidsview.p091v1.proto.DeletePlanDetailsOrBuilder
        public String getPlanName() {
            return ((DeletePlanDetails) this.instance).getPlanName();
        }

        @Override // com.spotify.kidsview.p091v1.proto.DeletePlanDetailsOrBuilder
        public gva getPlanNameBytes() {
            return ((DeletePlanDetails) this.instance).getPlanNameBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setIsExpiring(boolean z) {
            copyOnWrite();
            ((DeletePlanDetails) this.instance).setIsExpiring(z);
            return this;
        }

        public Builder setPlanName(String str) {
            copyOnWrite();
            ((DeletePlanDetails) this.instance).setPlanName(str);
            return this;
        }

        public Builder setPlanNameBytes(gva gvaVar) {
            copyOnWrite();
            ((DeletePlanDetails) this.instance).setPlanNameBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(DeletePlanDetails.DEFAULT_INSTANCE);
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

    static {
        DeletePlanDetails deletePlanDetails = new DeletePlanDetails();
        DEFAULT_INSTANCE = deletePlanDetails;
        AbstractC0269h.registerDefaultInstance(DeletePlanDetails.class, deletePlanDetails);
    }

    private DeletePlanDetails() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsExpiring() {
        this.isExpiring_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlanName() {
        this.planName_ = getDefaultInstance().getPlanName();
    }

    public static DeletePlanDetails getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DeletePlanDetails parseDelimitedFrom(InputStream inputStream) {
        return (DeletePlanDetails) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeletePlanDetails parseFrom(ByteBuffer byteBuffer) {
        return (DeletePlanDetails) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsExpiring(boolean z) {
        this.isExpiring_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlanName(String str) {
        str.getClass();
        this.planName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlanNameBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.planName_ = gvaVar.m45892u();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"planName_", "isExpiring_"});
        }
        if (iOrdinal == 3) {
            return new DeletePlanDetails();
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
        synchronized (DeletePlanDetails.class) {
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

    @Override // com.spotify.kidsview.p091v1.proto.DeletePlanDetailsOrBuilder
    public boolean getIsExpiring() {
        return this.isExpiring_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.DeletePlanDetailsOrBuilder
    public String getPlanName() {
        return this.planName_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.DeletePlanDetailsOrBuilder
    public gva getPlanNameBytes() {
        return gva.m45888f(this.planName_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(DeletePlanDetails deletePlanDetails) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(deletePlanDetails);
    }

    public static DeletePlanDetails parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (DeletePlanDetails) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static DeletePlanDetails parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (DeletePlanDetails) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static DeletePlanDetails parseFrom(gva gvaVar) {
        return (DeletePlanDetails) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static DeletePlanDetails parseFrom(gva gvaVar, aux auxVar) {
        return (DeletePlanDetails) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static DeletePlanDetails parseFrom(byte[] bArr) {
        return (DeletePlanDetails) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DeletePlanDetails parseFrom(byte[] bArr, aux auxVar) {
        return (DeletePlanDetails) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static DeletePlanDetails parseFrom(InputStream inputStream) {
        return (DeletePlanDetails) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeletePlanDetails parseFrom(InputStream inputStream, aux auxVar) {
        return (DeletePlanDetails) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static DeletePlanDetails parseFrom(owe oweVar) {
        return (DeletePlanDetails) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static DeletePlanDetails parseFrom(owe oweVar, aux auxVar) {
        return (DeletePlanDetails) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
