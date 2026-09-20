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

/* JADX INFO: loaded from: classes5.dex */
public final class ActivityPayload extends AbstractC0269h implements ActivityPayloadOrBuilder {
    public static final int ACK_FIELD_NUMBER = 3;
    private static final ActivityPayload DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REACTION_FIELD_NUMBER = 1;
    public static final int RECEIPT_FIELD_NUMBER = 2;
    private int capCase_ = 0;
    private Object cap_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.ActivityPayload$1 */
    public static /* synthetic */ class C03231 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3151xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3151xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3151xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3151xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3151xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3151xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3151xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3151xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ActivityPayloadOrBuilder {
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

        public Builder clearAck() {
            copyOnWrite();
            ((ActivityPayload) this.instance).clearAck();
            return this;
        }

        public Builder clearCap() {
            copyOnWrite();
            ((ActivityPayload) this.instance).clearCap();
            return this;
        }

        public Builder clearReaction() {
            copyOnWrite();
            ((ActivityPayload) this.instance).clearReaction();
            return this;
        }

        public Builder clearReceipt() {
            copyOnWrite();
            ((ActivityPayload) this.instance).clearReceipt();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
        public Ack getAck() {
            return ((ActivityPayload) this.instance).getAck();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
        public CapCase getCapCase() {
            return ((ActivityPayload) this.instance).getCapCase();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
        public Reaction getReaction() {
            return ((ActivityPayload) this.instance).getReaction();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
        public Receipt getReceipt() {
            return ((ActivityPayload) this.instance).getReceipt();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
        public boolean hasAck() {
            return ((ActivityPayload) this.instance).hasAck();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
        public boolean hasReaction() {
            return ((ActivityPayload) this.instance).hasReaction();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
        public boolean hasReceipt() {
            return ((ActivityPayload) this.instance).hasReceipt();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeAck(Ack ack) {
            copyOnWrite();
            ((ActivityPayload) this.instance).mergeAck(ack);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeReaction(Reaction reaction) {
            copyOnWrite();
            ((ActivityPayload) this.instance).mergeReaction(reaction);
            return this;
        }

        public Builder mergeReceipt(Receipt receipt) {
            copyOnWrite();
            ((ActivityPayload) this.instance).mergeReceipt(receipt);
            return this;
        }

        public Builder setAck(Ack ack) {
            copyOnWrite();
            ((ActivityPayload) this.instance).setAck(ack);
            return this;
        }

        public Builder setReaction(Reaction reaction) {
            copyOnWrite();
            ((ActivityPayload) this.instance).setReaction(reaction);
            return this;
        }

        public Builder setReceipt(Receipt receipt) {
            copyOnWrite();
            ((ActivityPayload) this.instance).setReceipt(receipt);
            return this;
        }

        private Builder() {
            super(ActivityPayload.DEFAULT_INSTANCE);
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

        public Builder setAck(Ack.Builder builder) {
            copyOnWrite();
            ((ActivityPayload) this.instance).setAck((Ack) builder.build());
            return this;
        }

        public Builder setReaction(Reaction.Builder builder) {
            copyOnWrite();
            ((ActivityPayload) this.instance).setReaction((Reaction) builder.build());
            return this;
        }

        public Builder setReceipt(Receipt.Builder builder) {
            copyOnWrite();
            ((ActivityPayload) this.instance).setReceipt((Receipt) builder.build());
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

    public enum CapCase {
        REACTION(1),
        RECEIPT(2),
        ACK(3),
        CAP_NOT_SET(0);

        private final int value;

        CapCase(int i) {
            this.value = i;
        }

        public static CapCase forNumber(int i) {
            if (i == 0) {
                return CAP_NOT_SET;
            }
            if (i == 1) {
                return REACTION;
            }
            if (i == 2) {
                return RECEIPT;
            }
            if (i != 3) {
                return null;
            }
            return ACK;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static CapCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        ActivityPayload activityPayload = new ActivityPayload();
        DEFAULT_INSTANCE = activityPayload;
        AbstractC0269h.registerDefaultInstance(ActivityPayload.class, activityPayload);
    }

    private ActivityPayload() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAck() {
        if (this.capCase_ == 3) {
            this.capCase_ = 0;
            this.cap_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCap() {
        this.capCase_ = 0;
        this.cap_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReaction() {
        if (this.capCase_ == 1) {
            this.capCase_ = 0;
            this.cap_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReceipt() {
        if (this.capCase_ == 2) {
            this.capCase_ = 0;
            this.cap_ = null;
        }
    }

    public static ActivityPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAck(Ack ack) {
        ack.getClass();
        if (this.capCase_ != 3 || this.cap_ == Ack.getDefaultInstance()) {
            this.cap_ = ack;
        } else {
            this.cap_ = ((Ack.Builder) Ack.newBuilder((Ack) this.cap_).mergeFrom((AbstractC0269h) ack)).buildPartial();
        }
        this.capCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReaction(Reaction reaction) {
        reaction.getClass();
        if (this.capCase_ != 1 || this.cap_ == Reaction.getDefaultInstance()) {
            this.cap_ = reaction;
        } else {
            this.cap_ = ((Reaction.Builder) Reaction.newBuilder((Reaction) this.cap_).mergeFrom((AbstractC0269h) reaction)).buildPartial();
        }
        this.capCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReceipt(Receipt receipt) {
        receipt.getClass();
        if (this.capCase_ != 2 || this.cap_ == Receipt.getDefaultInstance()) {
            this.cap_ = receipt;
        } else {
            this.cap_ = ((Receipt.Builder) Receipt.newBuilder((Receipt) this.cap_).mergeFrom((AbstractC0269h) receipt)).buildPartial();
        }
        this.capCase_ = 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ActivityPayload parseDelimitedFrom(InputStream inputStream) {
        return (ActivityPayload) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ActivityPayload parseFrom(ByteBuffer byteBuffer) {
        return (ActivityPayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAck(Ack ack) {
        ack.getClass();
        this.cap_ = ack;
        this.capCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReaction(Reaction reaction) {
        reaction.getClass();
        this.cap_ = reaction;
        this.capCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReceipt(Receipt receipt) {
        receipt.getClass();
        this.cap_ = receipt;
        this.capCase_ = 2;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"cap_", "capCase_", Reaction.class, Receipt.class, Ack.class});
        }
        if (iOrdinal == 3) {
            return new ActivityPayload();
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
        synchronized (ActivityPayload.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
    public Ack getAck() {
        return this.capCase_ == 3 ? (Ack) this.cap_ : Ack.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
    public CapCase getCapCase() {
        return CapCase.forNumber(this.capCase_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
    public Reaction getReaction() {
        return this.capCase_ == 1 ? (Reaction) this.cap_ : Reaction.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
    public Receipt getReceipt() {
        return this.capCase_ == 2 ? (Receipt) this.cap_ : Receipt.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
    public boolean hasAck() {
        return this.capCase_ == 3;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
    public boolean hasReaction() {
        return this.capCase_ == 1;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityPayloadOrBuilder
    public boolean hasReceipt() {
        return this.capCase_ == 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ActivityPayload activityPayload) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(activityPayload);
    }

    public static ActivityPayload parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ActivityPayload) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ActivityPayload parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ActivityPayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ActivityPayload parseFrom(gva gvaVar) {
        return (ActivityPayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static ActivityPayload parseFrom(gva gvaVar, aux auxVar) {
        return (ActivityPayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ActivityPayload parseFrom(byte[] bArr) {
        return (ActivityPayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ActivityPayload parseFrom(byte[] bArr, aux auxVar) {
        return (ActivityPayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ActivityPayload parseFrom(InputStream inputStream) {
        return (ActivityPayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ActivityPayload parseFrom(InputStream inputStream, aux auxVar) {
        return (ActivityPayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ActivityPayload parseFrom(owe oweVar) {
        return (ActivityPayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ActivityPayload parseFrom(owe oweVar, aux auxVar) {
        return (ActivityPayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
