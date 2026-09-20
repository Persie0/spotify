package com.spotify.cosmos.util.policy.proto;

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
public final class EpisodePlayedStateDecorationPolicy extends AbstractC0269h implements EpisodePlayedStateDecorationPolicyOrBuilder {
    private static final EpisodePlayedStateDecorationPolicy DEFAULT_INSTANCE;
    public static final int IS_PLAYED_FIELD_NUMBER = 2;
    public static final int LAST_PLAYED_AT_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYABILITY_RESTRICTION_FIELD_NUMBER = 4;
    public static final int PLAYABLE_FIELD_NUMBER = 3;
    public static final int TIME_LEFT_FIELD_NUMBER = 1;
    private boolean isPlayed_;
    private boolean lastPlayedAt_;
    private boolean playabilityRestriction_;
    private boolean playable_;
    private boolean timeLeft_;

    /* JADX INFO: renamed from: com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicy$1 */
    /* JADX INFO: loaded from: classes6.dex */
    public static /* synthetic */ class C06431 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3496xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3496xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3496xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3496xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3496xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3496xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3496xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3496xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements EpisodePlayedStateDecorationPolicyOrBuilder {
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

        public Builder clearIsPlayed() {
            copyOnWrite();
            ((EpisodePlayedStateDecorationPolicy) this.instance).clearIsPlayed();
            return this;
        }

        public Builder clearLastPlayedAt() {
            copyOnWrite();
            ((EpisodePlayedStateDecorationPolicy) this.instance).clearLastPlayedAt();
            return this;
        }

        public Builder clearPlayabilityRestriction() {
            copyOnWrite();
            ((EpisodePlayedStateDecorationPolicy) this.instance).clearPlayabilityRestriction();
            return this;
        }

        public Builder clearPlayable() {
            copyOnWrite();
            ((EpisodePlayedStateDecorationPolicy) this.instance).clearPlayable();
            return this;
        }

        public Builder clearTimeLeft() {
            copyOnWrite();
            ((EpisodePlayedStateDecorationPolicy) this.instance).clearTimeLeft();
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

        @Override // com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicyOrBuilder
        public boolean getIsPlayed() {
            return ((EpisodePlayedStateDecorationPolicy) this.instance).getIsPlayed();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicyOrBuilder
        public boolean getLastPlayedAt() {
            return ((EpisodePlayedStateDecorationPolicy) this.instance).getLastPlayedAt();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicyOrBuilder
        public boolean getPlayabilityRestriction() {
            return ((EpisodePlayedStateDecorationPolicy) this.instance).getPlayabilityRestriction();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicyOrBuilder
        public boolean getPlayable() {
            return ((EpisodePlayedStateDecorationPolicy) this.instance).getPlayable();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicyOrBuilder
        public boolean getTimeLeft() {
            return ((EpisodePlayedStateDecorationPolicy) this.instance).getTimeLeft();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setIsPlayed(boolean z) {
            copyOnWrite();
            ((EpisodePlayedStateDecorationPolicy) this.instance).setIsPlayed(z);
            return this;
        }

        public Builder setLastPlayedAt(boolean z) {
            copyOnWrite();
            ((EpisodePlayedStateDecorationPolicy) this.instance).setLastPlayedAt(z);
            return this;
        }

        public Builder setPlayabilityRestriction(boolean z) {
            copyOnWrite();
            ((EpisodePlayedStateDecorationPolicy) this.instance).setPlayabilityRestriction(z);
            return this;
        }

        public Builder setPlayable(boolean z) {
            copyOnWrite();
            ((EpisodePlayedStateDecorationPolicy) this.instance).setPlayable(z);
            return this;
        }

        public Builder setTimeLeft(boolean z) {
            copyOnWrite();
            ((EpisodePlayedStateDecorationPolicy) this.instance).setTimeLeft(z);
            return this;
        }

        private Builder() {
            super(EpisodePlayedStateDecorationPolicy.DEFAULT_INSTANCE);
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
        EpisodePlayedStateDecorationPolicy episodePlayedStateDecorationPolicy = new EpisodePlayedStateDecorationPolicy();
        DEFAULT_INSTANCE = episodePlayedStateDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(EpisodePlayedStateDecorationPolicy.class, episodePlayedStateDecorationPolicy);
    }

    private EpisodePlayedStateDecorationPolicy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPlayed() {
        this.isPlayed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastPlayedAt() {
        this.lastPlayedAt_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayabilityRestriction() {
        this.playabilityRestriction_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayable() {
        this.playable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeLeft() {
        this.timeLeft_ = false;
    }

    public static EpisodePlayedStateDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static EpisodePlayedStateDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (EpisodePlayedStateDecorationPolicy) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodePlayedStateDecorationPolicy parseFrom(ByteBuffer byteBuffer) {
        return (EpisodePlayedStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPlayed(boolean z) {
        this.isPlayed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastPlayedAt(boolean z) {
        this.lastPlayedAt_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayabilityRestriction(boolean z) {
        this.playabilityRestriction_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayable(boolean z) {
        this.playable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeLeft(boolean z) {
        this.timeLeft_ = z;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007", new Object[]{"timeLeft_", "isPlayed_", "playable_", "playabilityRestriction_", "lastPlayedAt_"});
        }
        if (iOrdinal == 3) {
            return new EpisodePlayedStateDecorationPolicy();
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
        synchronized (EpisodePlayedStateDecorationPolicy.class) {
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

    @Override // com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicyOrBuilder
    public boolean getIsPlayed() {
        return this.isPlayed_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicyOrBuilder
    public boolean getLastPlayedAt() {
        return this.lastPlayedAt_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicyOrBuilder
    public boolean getPlayabilityRestriction() {
        return this.playabilityRestriction_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicyOrBuilder
    public boolean getPlayable() {
        return this.playable_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicyOrBuilder
    public boolean getTimeLeft() {
        return this.timeLeft_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(EpisodePlayedStateDecorationPolicy episodePlayedStateDecorationPolicy) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(episodePlayedStateDecorationPolicy);
    }

    public static EpisodePlayedStateDecorationPolicy parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (EpisodePlayedStateDecorationPolicy) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static EpisodePlayedStateDecorationPolicy parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (EpisodePlayedStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static EpisodePlayedStateDecorationPolicy parseFrom(gva gvaVar) {
        return (EpisodePlayedStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static EpisodePlayedStateDecorationPolicy parseFrom(gva gvaVar, aux auxVar) {
        return (EpisodePlayedStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static EpisodePlayedStateDecorationPolicy parseFrom(byte[] bArr) {
        return (EpisodePlayedStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EpisodePlayedStateDecorationPolicy parseFrom(byte[] bArr, aux auxVar) {
        return (EpisodePlayedStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static EpisodePlayedStateDecorationPolicy parseFrom(InputStream inputStream) {
        return (EpisodePlayedStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodePlayedStateDecorationPolicy parseFrom(InputStream inputStream, aux auxVar) {
        return (EpisodePlayedStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static EpisodePlayedStateDecorationPolicy parseFrom(owe oweVar) {
        return (EpisodePlayedStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static EpisodePlayedStateDecorationPolicy parseFrom(owe oweVar, aux auxVar) {
        return (EpisodePlayedStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
