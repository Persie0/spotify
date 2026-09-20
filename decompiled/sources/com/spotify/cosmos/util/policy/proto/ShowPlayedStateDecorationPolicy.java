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
public final class ShowPlayedStateDecorationPolicy extends AbstractC0269h implements ShowPlayedStateDecorationPolicyOrBuilder {
    private static final ShowPlayedStateDecorationPolicy DEFAULT_INSTANCE;
    public static final int IS_PLAYABLE_FIELD_NUMBER = 3;
    public static final int LABEL_FIELD_NUMBER = 5;
    public static final int LATEST_PLAYED_EPISODE_LINK_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYABILITY_RESTRICTION_FIELD_NUMBER = 4;
    public static final int PLAYED_TIME_FIELD_NUMBER = 2;
    public static final int RESUME_EPISODE_LINK_FIELD_NUMBER = 7;
    private boolean isPlayable_;
    private boolean label_;
    private boolean latestPlayedEpisodeLink_;
    private boolean playabilityRestriction_;
    private boolean playedTime_;
    private boolean resumeEpisodeLink_;

    /* JADX INFO: renamed from: com.spotify.cosmos.util.policy.proto.ShowPlayedStateDecorationPolicy$1 */
    /* JADX INFO: loaded from: classes6.dex */
    public static /* synthetic */ class C06491 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3501xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3501xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3501xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3501xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3501xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3501xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3501xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3501xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ShowPlayedStateDecorationPolicyOrBuilder {
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
            ((ShowPlayedStateDecorationPolicy) this.instance).clearIsPlayable();
            return this;
        }

        public Builder clearLabel() {
            copyOnWrite();
            ((ShowPlayedStateDecorationPolicy) this.instance).clearLabel();
            return this;
        }

        public Builder clearLatestPlayedEpisodeLink() {
            copyOnWrite();
            ((ShowPlayedStateDecorationPolicy) this.instance).clearLatestPlayedEpisodeLink();
            return this;
        }

        public Builder clearPlayabilityRestriction() {
            copyOnWrite();
            ((ShowPlayedStateDecorationPolicy) this.instance).clearPlayabilityRestriction();
            return this;
        }

        public Builder clearPlayedTime() {
            copyOnWrite();
            ((ShowPlayedStateDecorationPolicy) this.instance).clearPlayedTime();
            return this;
        }

        public Builder clearResumeEpisodeLink() {
            copyOnWrite();
            ((ShowPlayedStateDecorationPolicy) this.instance).clearResumeEpisodeLink();
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

        @Override // com.spotify.cosmos.util.policy.proto.ShowPlayedStateDecorationPolicyOrBuilder
        public boolean getIsPlayable() {
            return ((ShowPlayedStateDecorationPolicy) this.instance).getIsPlayable();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowPlayedStateDecorationPolicyOrBuilder
        public boolean getLabel() {
            return ((ShowPlayedStateDecorationPolicy) this.instance).getLabel();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowPlayedStateDecorationPolicyOrBuilder
        public boolean getLatestPlayedEpisodeLink() {
            return ((ShowPlayedStateDecorationPolicy) this.instance).getLatestPlayedEpisodeLink();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowPlayedStateDecorationPolicyOrBuilder
        public boolean getPlayabilityRestriction() {
            return ((ShowPlayedStateDecorationPolicy) this.instance).getPlayabilityRestriction();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowPlayedStateDecorationPolicyOrBuilder
        public boolean getPlayedTime() {
            return ((ShowPlayedStateDecorationPolicy) this.instance).getPlayedTime();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowPlayedStateDecorationPolicyOrBuilder
        public boolean getResumeEpisodeLink() {
            return ((ShowPlayedStateDecorationPolicy) this.instance).getResumeEpisodeLink();
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
            ((ShowPlayedStateDecorationPolicy) this.instance).setIsPlayable(z);
            return this;
        }

        public Builder setLabel(boolean z) {
            copyOnWrite();
            ((ShowPlayedStateDecorationPolicy) this.instance).setLabel(z);
            return this;
        }

        public Builder setLatestPlayedEpisodeLink(boolean z) {
            copyOnWrite();
            ((ShowPlayedStateDecorationPolicy) this.instance).setLatestPlayedEpisodeLink(z);
            return this;
        }

        public Builder setPlayabilityRestriction(boolean z) {
            copyOnWrite();
            ((ShowPlayedStateDecorationPolicy) this.instance).setPlayabilityRestriction(z);
            return this;
        }

        public Builder setPlayedTime(boolean z) {
            copyOnWrite();
            ((ShowPlayedStateDecorationPolicy) this.instance).setPlayedTime(z);
            return this;
        }

        public Builder setResumeEpisodeLink(boolean z) {
            copyOnWrite();
            ((ShowPlayedStateDecorationPolicy) this.instance).setResumeEpisodeLink(z);
            return this;
        }

        private Builder() {
            super(ShowPlayedStateDecorationPolicy.DEFAULT_INSTANCE);
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
        ShowPlayedStateDecorationPolicy showPlayedStateDecorationPolicy = new ShowPlayedStateDecorationPolicy();
        DEFAULT_INSTANCE = showPlayedStateDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(ShowPlayedStateDecorationPolicy.class, showPlayedStateDecorationPolicy);
    }

    private ShowPlayedStateDecorationPolicy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPlayable() {
        this.isPlayable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.label_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatestPlayedEpisodeLink() {
        this.latestPlayedEpisodeLink_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayabilityRestriction() {
        this.playabilityRestriction_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayedTime() {
        this.playedTime_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResumeEpisodeLink() {
        this.resumeEpisodeLink_ = false;
    }

    public static ShowPlayedStateDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ShowPlayedStateDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (ShowPlayedStateDecorationPolicy) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowPlayedStateDecorationPolicy parseFrom(ByteBuffer byteBuffer) {
        return (ShowPlayedStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPlayable(boolean z) {
        this.isPlayable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabel(boolean z) {
        this.label_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatestPlayedEpisodeLink(boolean z) {
        this.latestPlayedEpisodeLink_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayabilityRestriction(boolean z) {
        this.playabilityRestriction_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayedTime(boolean z) {
        this.playedTime_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResumeEpisodeLink(boolean z) {
        this.resumeEpisodeLink_ = z;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0007\u0007", new Object[]{"latestPlayedEpisodeLink_", "playedTime_", "isPlayable_", "playabilityRestriction_", "label_", "resumeEpisodeLink_"});
        }
        if (iOrdinal == 3) {
            return new ShowPlayedStateDecorationPolicy();
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
        synchronized (ShowPlayedStateDecorationPolicy.class) {
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

    @Override // com.spotify.cosmos.util.policy.proto.ShowPlayedStateDecorationPolicyOrBuilder
    public boolean getIsPlayable() {
        return this.isPlayable_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ShowPlayedStateDecorationPolicyOrBuilder
    public boolean getLabel() {
        return this.label_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ShowPlayedStateDecorationPolicyOrBuilder
    public boolean getLatestPlayedEpisodeLink() {
        return this.latestPlayedEpisodeLink_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ShowPlayedStateDecorationPolicyOrBuilder
    public boolean getPlayabilityRestriction() {
        return this.playabilityRestriction_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ShowPlayedStateDecorationPolicyOrBuilder
    public boolean getPlayedTime() {
        return this.playedTime_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ShowPlayedStateDecorationPolicyOrBuilder
    public boolean getResumeEpisodeLink() {
        return this.resumeEpisodeLink_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ShowPlayedStateDecorationPolicy showPlayedStateDecorationPolicy) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(showPlayedStateDecorationPolicy);
    }

    public static ShowPlayedStateDecorationPolicy parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ShowPlayedStateDecorationPolicy) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ShowPlayedStateDecorationPolicy parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ShowPlayedStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ShowPlayedStateDecorationPolicy parseFrom(gva gvaVar) {
        return (ShowPlayedStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static ShowPlayedStateDecorationPolicy parseFrom(gva gvaVar, aux auxVar) {
        return (ShowPlayedStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ShowPlayedStateDecorationPolicy parseFrom(byte[] bArr) {
        return (ShowPlayedStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ShowPlayedStateDecorationPolicy parseFrom(byte[] bArr, aux auxVar) {
        return (ShowPlayedStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ShowPlayedStateDecorationPolicy parseFrom(InputStream inputStream) {
        return (ShowPlayedStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowPlayedStateDecorationPolicy parseFrom(InputStream inputStream, aux auxVar) {
        return (ShowPlayedStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ShowPlayedStateDecorationPolicy parseFrom(owe oweVar) {
        return (ShowPlayedStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ShowPlayedStateDecorationPolicy parseFrom(owe oweVar, aux auxVar) {
        return (ShowPlayedStateDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
