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
public final class Reaction extends AbstractC0269h implements ReactionOrBuilder {
    private static final Reaction DEFAULT_INSTANCE;
    public static final int EMOJI_UTF8_FIELD_NUMBER = 3;
    public static final int INITIATOR_USERNAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int REACTION_EMOTI_FIELD_NUMBER = 1;
    private int reactionEmoti_;
    private String initiatorUsername_ = "";
    private String emojiUtf8_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.Reaction$1 */
    public static /* synthetic */ class C04301 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3244xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3244xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3244xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3244xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3244xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3244xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3244xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3244xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ReactionOrBuilder {
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

        public Builder clearEmojiUtf8() {
            copyOnWrite();
            ((Reaction) this.instance).clearEmojiUtf8();
            return this;
        }

        public Builder clearInitiatorUsername() {
            copyOnWrite();
            ((Reaction) this.instance).clearInitiatorUsername();
            return this;
        }

        public Builder clearReactionEmoti() {
            copyOnWrite();
            ((Reaction) this.instance).clearReactionEmoti();
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

        @Override // com.spotify.campfire.datasource.impl.proto.ReactionOrBuilder
        public String getEmojiUtf8() {
            return ((Reaction) this.instance).getEmojiUtf8();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ReactionOrBuilder
        public gva getEmojiUtf8Bytes() {
            return ((Reaction) this.instance).getEmojiUtf8Bytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ReactionOrBuilder
        public String getInitiatorUsername() {
            return ((Reaction) this.instance).getInitiatorUsername();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ReactionOrBuilder
        public gva getInitiatorUsernameBytes() {
            return ((Reaction) this.instance).getInitiatorUsernameBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ReactionOrBuilder
        public ReactionEmoti getReactionEmoti() {
            return ((Reaction) this.instance).getReactionEmoti();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ReactionOrBuilder
        public int getReactionEmotiValue() {
            return ((Reaction) this.instance).getReactionEmotiValue();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setEmojiUtf8(String str) {
            copyOnWrite();
            ((Reaction) this.instance).setEmojiUtf8(str);
            return this;
        }

        public Builder setEmojiUtf8Bytes(gva gvaVar) {
            copyOnWrite();
            ((Reaction) this.instance).setEmojiUtf8Bytes(gvaVar);
            return this;
        }

        public Builder setInitiatorUsername(String str) {
            copyOnWrite();
            ((Reaction) this.instance).setInitiatorUsername(str);
            return this;
        }

        public Builder setInitiatorUsernameBytes(gva gvaVar) {
            copyOnWrite();
            ((Reaction) this.instance).setInitiatorUsernameBytes(gvaVar);
            return this;
        }

        public Builder setReactionEmoti(ReactionEmoti reactionEmoti) {
            copyOnWrite();
            ((Reaction) this.instance).setReactionEmoti(reactionEmoti);
            return this;
        }

        public Builder setReactionEmotiValue(int i) {
            copyOnWrite();
            ((Reaction) this.instance).setReactionEmotiValue(i);
            return this;
        }

        private Builder() {
            super(Reaction.DEFAULT_INSTANCE);
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
        Reaction reaction = new Reaction();
        DEFAULT_INSTANCE = reaction;
        AbstractC0269h.registerDefaultInstance(Reaction.class, reaction);
    }

    private Reaction() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmojiUtf8() {
        this.emojiUtf8_ = getDefaultInstance().getEmojiUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInitiatorUsername() {
        this.initiatorUsername_ = getDefaultInstance().getInitiatorUsername();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReactionEmoti() {
        this.reactionEmoti_ = 0;
    }

    public static Reaction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Reaction parseDelimitedFrom(InputStream inputStream) {
        return (Reaction) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Reaction parseFrom(ByteBuffer byteBuffer) {
        return (Reaction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmojiUtf8(String str) {
        str.getClass();
        this.emojiUtf8_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmojiUtf8Bytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.emojiUtf8_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInitiatorUsername(String str) {
        str.getClass();
        this.initiatorUsername_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInitiatorUsernameBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.initiatorUsername_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReactionEmoti(ReactionEmoti reactionEmoti) {
        this.reactionEmoti_ = reactionEmoti.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReactionEmotiValue(int i) {
        this.reactionEmoti_ = i;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ", new Object[]{"reactionEmoti_", "initiatorUsername_", "emojiUtf8_"});
        }
        if (iOrdinal == 3) {
            return new Reaction();
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
        synchronized (Reaction.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.ReactionOrBuilder
    public String getEmojiUtf8() {
        return this.emojiUtf8_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ReactionOrBuilder
    public gva getEmojiUtf8Bytes() {
        return gva.m45888f(this.emojiUtf8_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ReactionOrBuilder
    public String getInitiatorUsername() {
        return this.initiatorUsername_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ReactionOrBuilder
    public gva getInitiatorUsernameBytes() {
        return gva.m45888f(this.initiatorUsername_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ReactionOrBuilder
    public ReactionEmoti getReactionEmoti() {
        ReactionEmoti reactionEmotiForNumber = ReactionEmoti.forNumber(this.reactionEmoti_);
        return reactionEmotiForNumber == null ? ReactionEmoti.UNRECOGNIZED : reactionEmotiForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ReactionOrBuilder
    public int getReactionEmotiValue() {
        return this.reactionEmoti_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(Reaction reaction) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(reaction);
    }

    public static Reaction parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (Reaction) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static Reaction parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (Reaction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static Reaction parseFrom(gva gvaVar) {
        return (Reaction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static Reaction parseFrom(gva gvaVar, aux auxVar) {
        return (Reaction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static Reaction parseFrom(byte[] bArr) {
        return (Reaction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Reaction parseFrom(byte[] bArr, aux auxVar) {
        return (Reaction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static Reaction parseFrom(InputStream inputStream) {
        return (Reaction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Reaction parseFrom(InputStream inputStream, aux auxVar) {
        return (Reaction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static Reaction parseFrom(owe oweVar) {
        return (Reaction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static Reaction parseFrom(owe oweVar, aux auxVar) {
        return (Reaction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
