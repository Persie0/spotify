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
public final class RemoveFromPlanAction extends AbstractC0269h implements RemoveFromPlanActionOrBuilder {
    private static final RemoveFromPlanAction DEFAULT_INSTANCE;
    public static final int MEMBER_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int STATE_FIELD_NUMBER = 1;
    private String memberId_ = "";
    private int state_;

    /* JADX INFO: renamed from: com.spotify.kidsview.v1.proto.RemoveFromPlanAction$1 */
    public static /* synthetic */ class C08241 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f4999xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f4999xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4999xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4999xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4999xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4999xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4999xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4999xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements RemoveFromPlanActionOrBuilder {
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

        public Builder clearMemberId() {
            copyOnWrite();
            ((RemoveFromPlanAction) this.instance).clearMemberId();
            return this;
        }

        public Builder clearState() {
            copyOnWrite();
            ((RemoveFromPlanAction) this.instance).clearState();
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

        @Override // com.spotify.kidsview.p091v1.proto.RemoveFromPlanActionOrBuilder
        public String getMemberId() {
            return ((RemoveFromPlanAction) this.instance).getMemberId();
        }

        @Override // com.spotify.kidsview.p091v1.proto.RemoveFromPlanActionOrBuilder
        public gva getMemberIdBytes() {
            return ((RemoveFromPlanAction) this.instance).getMemberIdBytes();
        }

        @Override // com.spotify.kidsview.p091v1.proto.RemoveFromPlanActionOrBuilder
        public RemoveFromPlanActionState getState() {
            return ((RemoveFromPlanAction) this.instance).getState();
        }

        @Override // com.spotify.kidsview.p091v1.proto.RemoveFromPlanActionOrBuilder
        public int getStateValue() {
            return ((RemoveFromPlanAction) this.instance).getStateValue();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setMemberId(String str) {
            copyOnWrite();
            ((RemoveFromPlanAction) this.instance).setMemberId(str);
            return this;
        }

        public Builder setMemberIdBytes(gva gvaVar) {
            copyOnWrite();
            ((RemoveFromPlanAction) this.instance).setMemberIdBytes(gvaVar);
            return this;
        }

        public Builder setState(RemoveFromPlanActionState removeFromPlanActionState) {
            copyOnWrite();
            ((RemoveFromPlanAction) this.instance).setState(removeFromPlanActionState);
            return this;
        }

        public Builder setStateValue(int i) {
            copyOnWrite();
            ((RemoveFromPlanAction) this.instance).setStateValue(i);
            return this;
        }

        private Builder() {
            super(RemoveFromPlanAction.DEFAULT_INSTANCE);
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
        RemoveFromPlanAction removeFromPlanAction = new RemoveFromPlanAction();
        DEFAULT_INSTANCE = removeFromPlanAction;
        AbstractC0269h.registerDefaultInstance(RemoveFromPlanAction.class, removeFromPlanAction);
    }

    private RemoveFromPlanAction() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemberId() {
        this.memberId_ = getDefaultInstance().getMemberId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    public static RemoveFromPlanAction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static RemoveFromPlanAction parseDelimitedFrom(InputStream inputStream) {
        return (RemoveFromPlanAction) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RemoveFromPlanAction parseFrom(ByteBuffer byteBuffer) {
        return (RemoveFromPlanAction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemberId(String str) {
        str.getClass();
        this.memberId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemberIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.memberId_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(RemoveFromPlanActionState removeFromPlanActionState) {
        this.state_ = removeFromPlanActionState.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateValue(int i) {
        this.state_ = i;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"state_", "memberId_"});
        }
        if (iOrdinal == 3) {
            return new RemoveFromPlanAction();
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
        synchronized (RemoveFromPlanAction.class) {
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

    @Override // com.spotify.kidsview.p091v1.proto.RemoveFromPlanActionOrBuilder
    public String getMemberId() {
        return this.memberId_;
    }

    @Override // com.spotify.kidsview.p091v1.proto.RemoveFromPlanActionOrBuilder
    public gva getMemberIdBytes() {
        return gva.m45888f(this.memberId_);
    }

    @Override // com.spotify.kidsview.p091v1.proto.RemoveFromPlanActionOrBuilder
    public RemoveFromPlanActionState getState() {
        RemoveFromPlanActionState removeFromPlanActionStateForNumber = RemoveFromPlanActionState.forNumber(this.state_);
        return removeFromPlanActionStateForNumber == null ? RemoveFromPlanActionState.UNRECOGNIZED : removeFromPlanActionStateForNumber;
    }

    @Override // com.spotify.kidsview.p091v1.proto.RemoveFromPlanActionOrBuilder
    public int getStateValue() {
        return this.state_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(RemoveFromPlanAction removeFromPlanAction) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(removeFromPlanAction);
    }

    public static RemoveFromPlanAction parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (RemoveFromPlanAction) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static RemoveFromPlanAction parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (RemoveFromPlanAction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static RemoveFromPlanAction parseFrom(gva gvaVar) {
        return (RemoveFromPlanAction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static RemoveFromPlanAction parseFrom(gva gvaVar, aux auxVar) {
        return (RemoveFromPlanAction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static RemoveFromPlanAction parseFrom(byte[] bArr) {
        return (RemoveFromPlanAction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RemoveFromPlanAction parseFrom(byte[] bArr, aux auxVar) {
        return (RemoveFromPlanAction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static RemoveFromPlanAction parseFrom(InputStream inputStream) {
        return (RemoveFromPlanAction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RemoveFromPlanAction parseFrom(InputStream inputStream, aux auxVar) {
        return (RemoveFromPlanAction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static RemoveFromPlanAction parseFrom(owe oweVar) {
        return (RemoveFromPlanAction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static RemoveFromPlanAction parseFrom(owe oweVar, aux auxVar) {
        return (RemoveFromPlanAction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
