package com.spotify.cosmos.util.proto;

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

/* JADX INFO: loaded from: classes.dex */
public final class EpisodePlayState extends AbstractC0269h implements EpisodePlayStateOrBuilder {
    private static final EpisodePlayState DEFAULT_INSTANCE;
    public static final int IS_PLAYABLE_FIELD_NUMBER = 2;
    public static final int IS_PLAYED_FIELD_NUMBER = 3;
    public static final int LAST_PLAYED_AT_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYABILITY_RESTRICTION_FIELD_NUMBER = 5;
    public static final int TIME_LEFT_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean isPlayable_;
    private boolean isPlayed_;
    private int lastPlayedAt_;
    private int playabilityRestriction_;
    private int timeLeft_;

    /* JADX INFO: renamed from: com.spotify.cosmos.util.proto.EpisodePlayState$1 */
    /* JADX INFO: loaded from: classes6.dex */
    public static /* synthetic */ class C06681 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3516xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3516xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3516xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3516xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3516xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3516xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3516xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3516xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder extends AbstractC0268g implements EpisodePlayStateOrBuilder {
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

        public Builder clearIsPlayable() {
            copyOnWrite();
            ((EpisodePlayState) this.instance).clearIsPlayable();
            return this;
        }

        public Builder clearIsPlayed() {
            copyOnWrite();
            ((EpisodePlayState) this.instance).clearIsPlayed();
            return this;
        }

        public Builder clearLastPlayedAt() {
            copyOnWrite();
            ((EpisodePlayState) this.instance).clearLastPlayedAt();
            return this;
        }

        public Builder clearPlayabilityRestriction() {
            copyOnWrite();
            ((EpisodePlayState) this.instance).clearPlayabilityRestriction();
            return this;
        }

        public Builder clearTimeLeft() {
            copyOnWrite();
            ((EpisodePlayState) this.instance).clearTimeLeft();
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

        @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
        public boolean getIsPlayable() {
            return ((EpisodePlayState) this.instance).getIsPlayable();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
        public boolean getIsPlayed() {
            return ((EpisodePlayState) this.instance).getIsPlayed();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
        public int getLastPlayedAt() {
            return ((EpisodePlayState) this.instance).getLastPlayedAt();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
        public PlayabilityRestriction getPlayabilityRestriction() {
            return ((EpisodePlayState) this.instance).getPlayabilityRestriction();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
        public int getTimeLeft() {
            return ((EpisodePlayState) this.instance).getTimeLeft();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
        public boolean hasIsPlayable() {
            return ((EpisodePlayState) this.instance).hasIsPlayable();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
        public boolean hasIsPlayed() {
            return ((EpisodePlayState) this.instance).hasIsPlayed();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
        public boolean hasLastPlayedAt() {
            return ((EpisodePlayState) this.instance).hasLastPlayedAt();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
        public boolean hasPlayabilityRestriction() {
            return ((EpisodePlayState) this.instance).hasPlayabilityRestriction();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
        public boolean hasTimeLeft() {
            return ((EpisodePlayState) this.instance).hasTimeLeft();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setIsPlayable(boolean z) {
            copyOnWrite();
            ((EpisodePlayState) this.instance).setIsPlayable(z);
            return this;
        }

        public Builder setIsPlayed(boolean z) {
            copyOnWrite();
            ((EpisodePlayState) this.instance).setIsPlayed(z);
            return this;
        }

        public Builder setLastPlayedAt(int i) {
            copyOnWrite();
            ((EpisodePlayState) this.instance).setLastPlayedAt(i);
            return this;
        }

        public Builder setPlayabilityRestriction(PlayabilityRestriction playabilityRestriction) {
            copyOnWrite();
            ((EpisodePlayState) this.instance).setPlayabilityRestriction(playabilityRestriction);
            return this;
        }

        public Builder setTimeLeft(int i) {
            copyOnWrite();
            ((EpisodePlayState) this.instance).setTimeLeft(i);
            return this;
        }

        private Builder() {
            super(EpisodePlayState.DEFAULT_INSTANCE);
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
        EpisodePlayState episodePlayState = new EpisodePlayState();
        DEFAULT_INSTANCE = episodePlayState;
        AbstractC0269h.registerDefaultInstance(EpisodePlayState.class, episodePlayState);
    }

    private EpisodePlayState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPlayable() {
        this.bitField0_ &= -3;
        this.isPlayable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPlayed() {
        this.bitField0_ &= -5;
        this.isPlayed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastPlayedAt() {
        this.bitField0_ &= -9;
        this.lastPlayedAt_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayabilityRestriction() {
        this.bitField0_ &= -17;
        this.playabilityRestriction_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeLeft() {
        this.bitField0_ &= -2;
        this.timeLeft_ = 0;
    }

    public static EpisodePlayState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static EpisodePlayState parseDelimitedFrom(InputStream inputStream) {
        return (EpisodePlayState) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodePlayState parseFrom(ByteBuffer byteBuffer) {
        return (EpisodePlayState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPlayable(boolean z) {
        this.bitField0_ |= 2;
        this.isPlayable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPlayed(boolean z) {
        this.bitField0_ |= 4;
        this.isPlayed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastPlayedAt(int i) {
        this.bitField0_ |= 8;
        this.lastPlayedAt_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayabilityRestriction(PlayabilityRestriction playabilityRestriction) {
        this.playabilityRestriction_ = playabilityRestriction.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeLeft(int i) {
        this.bitField0_ |= 1;
        this.timeLeft_ = i;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဋ\u0003\u0005᠌\u0004", new Object[]{"bitField0_", "timeLeft_", "isPlayable_", "isPlayed_", "lastPlayedAt_", "playabilityRestriction_", PlayabilityRestriction.internalGetVerifier()});
        }
        if (iOrdinal == 3) {
            return new EpisodePlayState();
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
        synchronized (EpisodePlayState.class) {
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

    @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
    public boolean getIsPlayable() {
        return this.isPlayable_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
    public boolean getIsPlayed() {
        return this.isPlayed_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
    public int getLastPlayedAt() {
        return this.lastPlayedAt_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
    public PlayabilityRestriction getPlayabilityRestriction() {
        PlayabilityRestriction playabilityRestrictionForNumber = PlayabilityRestriction.forNumber(this.playabilityRestriction_);
        return playabilityRestrictionForNumber == null ? PlayabilityRestriction.UNKNOWN : playabilityRestrictionForNumber;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
    public int getTimeLeft() {
        return this.timeLeft_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
    public boolean hasIsPlayable() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
    public boolean hasIsPlayed() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
    public boolean hasLastPlayedAt() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
    public boolean hasPlayabilityRestriction() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodePlayStateOrBuilder
    public boolean hasTimeLeft() {
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

    public static Builder newBuilder(EpisodePlayState episodePlayState) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(episodePlayState);
    }

    public static EpisodePlayState parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (EpisodePlayState) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static EpisodePlayState parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (EpisodePlayState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static EpisodePlayState parseFrom(gva gvaVar) {
        return (EpisodePlayState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static EpisodePlayState parseFrom(gva gvaVar, aux auxVar) {
        return (EpisodePlayState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static EpisodePlayState parseFrom(byte[] bArr) {
        return (EpisodePlayState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EpisodePlayState parseFrom(byte[] bArr, aux auxVar) {
        return (EpisodePlayState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static EpisodePlayState parseFrom(InputStream inputStream) {
        return (EpisodePlayState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodePlayState parseFrom(InputStream inputStream, aux auxVar) {
        return (EpisodePlayState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static EpisodePlayState parseFrom(owe oweVar) {
        return (EpisodePlayState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static EpisodePlayState parseFrom(owe oweVar, aux auxVar) {
        return (EpisodePlayState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
