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
public final class ActivityRequest extends AbstractC0269h implements ActivityRequestOrBuilder {
    public static final int ACK_TYPE_FIELD_NUMBER = 3;
    private static final ActivityRequest DEFAULT_INSTANCE;
    public static final int EMOJI_REACTION_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int REACTION_EMOTI_FIELD_NUMBER = 1;
    public static final int RECEIPT_TYPE_FIELD_NUMBER = 2;
    private int arCase_ = 0;
    private Object ar_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.ActivityRequest$1 */
    public static /* synthetic */ class C03241 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3152xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3152xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3152xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3152xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3152xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3152xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3152xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3152xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public enum ArCase {
        REACTION_EMOTI(1),
        RECEIPT_TYPE(2),
        ACK_TYPE(3),
        EMOJI_REACTION(4),
        AR_NOT_SET(0);

        private final int value;

        ArCase(int i) {
            this.value = i;
        }

        public static ArCase forNumber(int i) {
            if (i == 0) {
                return AR_NOT_SET;
            }
            if (i == 1) {
                return REACTION_EMOTI;
            }
            if (i == 2) {
                return RECEIPT_TYPE;
            }
            if (i == 3) {
                return ACK_TYPE;
            }
            if (i != 4) {
                return null;
            }
            return EMOJI_REACTION;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ArCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class Builder extends AbstractC0268g implements ActivityRequestOrBuilder {
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

        public Builder clearAckType() {
            copyOnWrite();
            ((ActivityRequest) this.instance).clearAckType();
            return this;
        }

        public Builder clearAr() {
            copyOnWrite();
            ((ActivityRequest) this.instance).clearAr();
            return this;
        }

        public Builder clearEmojiReaction() {
            copyOnWrite();
            ((ActivityRequest) this.instance).clearEmojiReaction();
            return this;
        }

        public Builder clearReactionEmoti() {
            copyOnWrite();
            ((ActivityRequest) this.instance).clearReactionEmoti();
            return this;
        }

        public Builder clearReceiptType() {
            copyOnWrite();
            ((ActivityRequest) this.instance).clearReceiptType();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
        public AckType getAckType() {
            return ((ActivityRequest) this.instance).getAckType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
        public int getAckTypeValue() {
            return ((ActivityRequest) this.instance).getAckTypeValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
        public ArCase getArCase() {
            return ((ActivityRequest) this.instance).getArCase();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
        public EmojiReaction getEmojiReaction() {
            return ((ActivityRequest) this.instance).getEmojiReaction();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
        public ReactionEmoti getReactionEmoti() {
            return ((ActivityRequest) this.instance).getReactionEmoti();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
        public int getReactionEmotiValue() {
            return ((ActivityRequest) this.instance).getReactionEmotiValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
        public ReceiptType getReceiptType() {
            return ((ActivityRequest) this.instance).getReceiptType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
        public int getReceiptTypeValue() {
            return ((ActivityRequest) this.instance).getReceiptTypeValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
        public boolean hasAckType() {
            return ((ActivityRequest) this.instance).hasAckType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
        public boolean hasEmojiReaction() {
            return ((ActivityRequest) this.instance).hasEmojiReaction();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
        public boolean hasReactionEmoti() {
            return ((ActivityRequest) this.instance).hasReactionEmoti();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
        public boolean hasReceiptType() {
            return ((ActivityRequest) this.instance).hasReceiptType();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeEmojiReaction(EmojiReaction emojiReaction) {
            copyOnWrite();
            ((ActivityRequest) this.instance).mergeEmojiReaction(emojiReaction);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setAckType(AckType ackType) {
            copyOnWrite();
            ((ActivityRequest) this.instance).setAckType(ackType);
            return this;
        }

        public Builder setAckTypeValue(int i) {
            copyOnWrite();
            ((ActivityRequest) this.instance).setAckTypeValue(i);
            return this;
        }

        public Builder setEmojiReaction(EmojiReaction emojiReaction) {
            copyOnWrite();
            ((ActivityRequest) this.instance).setEmojiReaction(emojiReaction);
            return this;
        }

        public Builder setReactionEmoti(ReactionEmoti reactionEmoti) {
            copyOnWrite();
            ((ActivityRequest) this.instance).setReactionEmoti(reactionEmoti);
            return this;
        }

        public Builder setReactionEmotiValue(int i) {
            copyOnWrite();
            ((ActivityRequest) this.instance).setReactionEmotiValue(i);
            return this;
        }

        public Builder setReceiptType(ReceiptType receiptType) {
            copyOnWrite();
            ((ActivityRequest) this.instance).setReceiptType(receiptType);
            return this;
        }

        public Builder setReceiptTypeValue(int i) {
            copyOnWrite();
            ((ActivityRequest) this.instance).setReceiptTypeValue(i);
            return this;
        }

        private Builder() {
            super(ActivityRequest.DEFAULT_INSTANCE);
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

        public Builder setEmojiReaction(EmojiReaction.Builder builder) {
            copyOnWrite();
            ((ActivityRequest) this.instance).setEmojiReaction((EmojiReaction) builder.build());
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
        ActivityRequest activityRequest = new ActivityRequest();
        DEFAULT_INSTANCE = activityRequest;
        AbstractC0269h.registerDefaultInstance(ActivityRequest.class, activityRequest);
    }

    private ActivityRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAckType() {
        if (this.arCase_ == 3) {
            this.arCase_ = 0;
            this.ar_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAr() {
        this.arCase_ = 0;
        this.ar_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmojiReaction() {
        if (this.arCase_ == 4) {
            this.arCase_ = 0;
            this.ar_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReactionEmoti() {
        if (this.arCase_ == 1) {
            this.arCase_ = 0;
            this.ar_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReceiptType() {
        if (this.arCase_ == 2) {
            this.arCase_ = 0;
            this.ar_ = null;
        }
    }

    public static ActivityRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEmojiReaction(EmojiReaction emojiReaction) {
        emojiReaction.getClass();
        if (this.arCase_ != 4 || this.ar_ == EmojiReaction.getDefaultInstance()) {
            this.ar_ = emojiReaction;
        } else {
            this.ar_ = ((EmojiReaction.Builder) EmojiReaction.newBuilder((EmojiReaction) this.ar_).mergeFrom((AbstractC0269h) emojiReaction)).buildPartial();
        }
        this.arCase_ = 4;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ActivityRequest parseDelimitedFrom(InputStream inputStream) {
        return (ActivityRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ActivityRequest parseFrom(ByteBuffer byteBuffer) {
        return (ActivityRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAckType(AckType ackType) {
        this.ar_ = Integer.valueOf(ackType.getNumber());
        this.arCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAckTypeValue(int i) {
        this.arCase_ = 3;
        this.ar_ = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmojiReaction(EmojiReaction emojiReaction) {
        emojiReaction.getClass();
        this.ar_ = emojiReaction;
        this.arCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReactionEmoti(ReactionEmoti reactionEmoti) {
        this.ar_ = Integer.valueOf(reactionEmoti.getNumber());
        this.arCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReactionEmotiValue(int i) {
        this.arCase_ = 1;
        this.ar_ = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReceiptType(ReceiptType receiptType) {
        this.ar_ = Integer.valueOf(receiptType.getNumber());
        this.arCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReceiptTypeValue(int i) {
        this.arCase_ = 2;
        this.ar_ = Integer.valueOf(i);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001?\u0000\u0002?\u0000\u0003?\u0000\u0004<\u0000", new Object[]{"ar_", "arCase_", EmojiReaction.class});
        }
        if (iOrdinal == 3) {
            return new ActivityRequest();
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
        synchronized (ActivityRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
    public AckType getAckType() {
        if (this.arCase_ != 3) {
            return AckType.ACKTYPE_UNDEFINED;
        }
        AckType ackTypeForNumber = AckType.forNumber(((Integer) this.ar_).intValue());
        return ackTypeForNumber == null ? AckType.UNRECOGNIZED : ackTypeForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
    public int getAckTypeValue() {
        if (this.arCase_ == 3) {
            return ((Integer) this.ar_).intValue();
        }
        return 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
    public ArCase getArCase() {
        return ArCase.forNumber(this.arCase_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
    public EmojiReaction getEmojiReaction() {
        return this.arCase_ == 4 ? (EmojiReaction) this.ar_ : EmojiReaction.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
    public ReactionEmoti getReactionEmoti() {
        if (this.arCase_ != 1) {
            return ReactionEmoti.REACTION_EMOTI_UNSPECIFIED;
        }
        ReactionEmoti reactionEmotiForNumber = ReactionEmoti.forNumber(((Integer) this.ar_).intValue());
        return reactionEmotiForNumber == null ? ReactionEmoti.UNRECOGNIZED : reactionEmotiForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
    public int getReactionEmotiValue() {
        if (this.arCase_ == 1) {
            return ((Integer) this.ar_).intValue();
        }
        return 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
    public ReceiptType getReceiptType() {
        if (this.arCase_ != 2) {
            return ReceiptType.RECEIPT_TYPE_UNDEFINED;
        }
        ReceiptType receiptTypeForNumber = ReceiptType.forNumber(((Integer) this.ar_).intValue());
        return receiptTypeForNumber == null ? ReceiptType.UNRECOGNIZED : receiptTypeForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
    public int getReceiptTypeValue() {
        if (this.arCase_ == 2) {
            return ((Integer) this.ar_).intValue();
        }
        return 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
    public boolean hasAckType() {
        return this.arCase_ == 3;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
    public boolean hasEmojiReaction() {
        return this.arCase_ == 4;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
    public boolean hasReactionEmoti() {
        return this.arCase_ == 1;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ActivityRequestOrBuilder
    public boolean hasReceiptType() {
        return this.arCase_ == 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ActivityRequest activityRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(activityRequest);
    }

    public static ActivityRequest parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ActivityRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ActivityRequest parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ActivityRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ActivityRequest parseFrom(gva gvaVar) {
        return (ActivityRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static ActivityRequest parseFrom(gva gvaVar, aux auxVar) {
        return (ActivityRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ActivityRequest parseFrom(byte[] bArr) {
        return (ActivityRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ActivityRequest parseFrom(byte[] bArr, aux auxVar) {
        return (ActivityRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ActivityRequest parseFrom(InputStream inputStream) {
        return (ActivityRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ActivityRequest parseFrom(InputStream inputStream, aux auxVar) {
        return (ActivityRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ActivityRequest parseFrom(owe oweVar) {
        return (ActivityRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ActivityRequest parseFrom(owe oweVar, aux auxVar) {
        return (ActivityRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
