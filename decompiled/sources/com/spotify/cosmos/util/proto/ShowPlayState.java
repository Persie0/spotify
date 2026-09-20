package com.spotify.cosmos.util.proto;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.aux;
import p204p.gva;
import p204p.od50;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.rd50;
import p204p.sd50;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ShowPlayState extends AbstractC0269h implements ShowPlayStateOrBuilder {
    private static final ShowPlayState DEFAULT_INSTANCE;
    public static final int IS_PLAYABLE_FIELD_NUMBER = 3;
    public static final int LABEL_FIELD_NUMBER = 5;
    public static final int LATEST_PLAYED_EPISODE_LINK_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYABILITY_RESTRICTION_FIELD_NUMBER = 4;
    public static final int PLAYED_PERCENTAGE_FIELD_NUMBER = 6;
    public static final int PLAYED_TIME_FIELD_NUMBER = 2;
    public static final int RESUME_EPISODE_LINK_FIELD_NUMBER = 7;
    private int bitField0_;
    private boolean isPlayable_;
    private int label_;
    private int playabilityRestriction_;
    private int playedPercentage_;
    private long playedTime_;
    private String latestPlayedEpisodeLink_ = "";
    private String resumeEpisodeLink_ = "";

    /* JADX INFO: renamed from: com.spotify.cosmos.util.proto.ShowPlayState$1 */
    public static /* synthetic */ class C06771 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3524xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3524xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3524xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3524xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3524xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3524xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3524xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3524xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ShowPlayStateOrBuilder {
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
            ((ShowPlayState) this.instance).clearIsPlayable();
            return this;
        }

        public Builder clearLabel() {
            copyOnWrite();
            ((ShowPlayState) this.instance).clearLabel();
            return this;
        }

        public Builder clearLatestPlayedEpisodeLink() {
            copyOnWrite();
            ((ShowPlayState) this.instance).clearLatestPlayedEpisodeLink();
            return this;
        }

        public Builder clearPlayabilityRestriction() {
            copyOnWrite();
            ((ShowPlayState) this.instance).clearPlayabilityRestriction();
            return this;
        }

        public Builder clearPlayedPercentage() {
            copyOnWrite();
            ((ShowPlayState) this.instance).clearPlayedPercentage();
            return this;
        }

        public Builder clearPlayedTime() {
            copyOnWrite();
            ((ShowPlayState) this.instance).clearPlayedTime();
            return this;
        }

        public Builder clearResumeEpisodeLink() {
            copyOnWrite();
            ((ShowPlayState) this.instance).clearResumeEpisodeLink();
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

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public boolean getIsPlayable() {
            return ((ShowPlayState) this.instance).getIsPlayable();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public Label getLabel() {
            return ((ShowPlayState) this.instance).getLabel();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public String getLatestPlayedEpisodeLink() {
            return ((ShowPlayState) this.instance).getLatestPlayedEpisodeLink();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public gva getLatestPlayedEpisodeLinkBytes() {
            return ((ShowPlayState) this.instance).getLatestPlayedEpisodeLinkBytes();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public PlayabilityRestriction getPlayabilityRestriction() {
            return ((ShowPlayState) this.instance).getPlayabilityRestriction();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public int getPlayedPercentage() {
            return ((ShowPlayState) this.instance).getPlayedPercentage();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public long getPlayedTime() {
            return ((ShowPlayState) this.instance).getPlayedTime();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public String getResumeEpisodeLink() {
            return ((ShowPlayState) this.instance).getResumeEpisodeLink();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public gva getResumeEpisodeLinkBytes() {
            return ((ShowPlayState) this.instance).getResumeEpisodeLinkBytes();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public boolean hasIsPlayable() {
            return ((ShowPlayState) this.instance).hasIsPlayable();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public boolean hasLabel() {
            return ((ShowPlayState) this.instance).hasLabel();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public boolean hasLatestPlayedEpisodeLink() {
            return ((ShowPlayState) this.instance).hasLatestPlayedEpisodeLink();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public boolean hasPlayabilityRestriction() {
            return ((ShowPlayState) this.instance).hasPlayabilityRestriction();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public boolean hasPlayedPercentage() {
            return ((ShowPlayState) this.instance).hasPlayedPercentage();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public boolean hasPlayedTime() {
            return ((ShowPlayState) this.instance).hasPlayedTime();
        }

        @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
        public boolean hasResumeEpisodeLink() {
            return ((ShowPlayState) this.instance).hasResumeEpisodeLink();
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
            ((ShowPlayState) this.instance).setIsPlayable(z);
            return this;
        }

        public Builder setLabel(Label label) {
            copyOnWrite();
            ((ShowPlayState) this.instance).setLabel(label);
            return this;
        }

        public Builder setLatestPlayedEpisodeLink(String str) {
            copyOnWrite();
            ((ShowPlayState) this.instance).setLatestPlayedEpisodeLink(str);
            return this;
        }

        public Builder setLatestPlayedEpisodeLinkBytes(gva gvaVar) {
            copyOnWrite();
            ((ShowPlayState) this.instance).setLatestPlayedEpisodeLinkBytes(gvaVar);
            return this;
        }

        public Builder setPlayabilityRestriction(PlayabilityRestriction playabilityRestriction) {
            copyOnWrite();
            ((ShowPlayState) this.instance).setPlayabilityRestriction(playabilityRestriction);
            return this;
        }

        public Builder setPlayedPercentage(int i) {
            copyOnWrite();
            ((ShowPlayState) this.instance).setPlayedPercentage(i);
            return this;
        }

        public Builder setPlayedTime(long j) {
            copyOnWrite();
            ((ShowPlayState) this.instance).setPlayedTime(j);
            return this;
        }

        public Builder setResumeEpisodeLink(String str) {
            copyOnWrite();
            ((ShowPlayState) this.instance).setResumeEpisodeLink(str);
            return this;
        }

        public Builder setResumeEpisodeLinkBytes(gva gvaVar) {
            copyOnWrite();
            ((ShowPlayState) this.instance).setResumeEpisodeLinkBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(ShowPlayState.DEFAULT_INSTANCE);
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

    public enum Label implements od50 {
        UNKNOWN_LABEL(0),
        NOT_STARTED(1),
        IN_PROGRESS(2),
        COMPLETED(3);

        public static final int COMPLETED_VALUE = 3;
        public static final int IN_PROGRESS_VALUE = 2;
        public static final int NOT_STARTED_VALUE = 1;
        public static final int UNKNOWN_LABEL_VALUE = 0;
        private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.cosmos.util.proto.ShowPlayState.Label.1
            @Override // p204p.rd50
            public Label findValueByNumber(int i) {
                return Label.forNumber(i);
            }
        };
        private final int value;

        public static final class LabelVerifier implements sd50 {
            static final sd50 INSTANCE = new LabelVerifier();

            private LabelVerifier() {
            }

            @Override // p204p.sd50
            public boolean isInRange(int i) {
                return Label.forNumber(i) != null;
            }
        }

        Label(int i) {
            this.value = i;
        }

        public static Label forNumber(int i) {
            if (i == 0) {
                return UNKNOWN_LABEL;
            }
            if (i == 1) {
                return NOT_STARTED;
            }
            if (i == 2) {
                return IN_PROGRESS;
            }
            if (i != 3) {
                return null;
            }
            return COMPLETED;
        }

        public static rd50 internalGetValueMap() {
            return internalValueMap;
        }

        public static sd50 internalGetVerifier() {
            return LabelVerifier.INSTANCE;
        }

        @Override // p204p.od50
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static Label valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        ShowPlayState showPlayState = new ShowPlayState();
        DEFAULT_INSTANCE = showPlayState;
        AbstractC0269h.registerDefaultInstance(ShowPlayState.class, showPlayState);
    }

    private ShowPlayState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPlayable() {
        this.bitField0_ &= -5;
        this.isPlayable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.bitField0_ &= -17;
        this.label_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatestPlayedEpisodeLink() {
        this.bitField0_ &= -2;
        this.latestPlayedEpisodeLink_ = getDefaultInstance().getLatestPlayedEpisodeLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayabilityRestriction() {
        this.bitField0_ &= -9;
        this.playabilityRestriction_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayedPercentage() {
        this.bitField0_ &= -33;
        this.playedPercentage_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayedTime() {
        this.bitField0_ &= -3;
        this.playedTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResumeEpisodeLink() {
        this.bitField0_ &= -65;
        this.resumeEpisodeLink_ = getDefaultInstance().getResumeEpisodeLink();
    }

    public static ShowPlayState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ShowPlayState parseDelimitedFrom(InputStream inputStream) {
        return (ShowPlayState) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowPlayState parseFrom(ByteBuffer byteBuffer) {
        return (ShowPlayState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPlayable(boolean z) {
        this.bitField0_ |= 4;
        this.isPlayable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabel(Label label) {
        this.label_ = label.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatestPlayedEpisodeLink(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.latestPlayedEpisodeLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatestPlayedEpisodeLinkBytes(gva gvaVar) {
        this.latestPlayedEpisodeLink_ = gvaVar.m45892u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayabilityRestriction(PlayabilityRestriction playabilityRestriction) {
        this.playabilityRestriction_ = playabilityRestriction.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayedPercentage(int i) {
        this.bitField0_ |= 32;
        this.playedPercentage_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayedTime(long j) {
        this.bitField0_ |= 2;
        this.playedTime_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResumeEpisodeLink(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.resumeEpisodeLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResumeEpisodeLinkBytes(gva gvaVar) {
        this.resumeEpisodeLink_ = gvaVar.m45892u();
        this.bitField0_ |= 64;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဃ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဋ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "latestPlayedEpisodeLink_", "playedTime_", "isPlayable_", "playabilityRestriction_", PlayabilityRestriction.internalGetVerifier(), "label_", Label.internalGetVerifier(), "playedPercentage_", "resumeEpisodeLink_"});
        }
        if (iOrdinal == 3) {
            return new ShowPlayState();
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
        synchronized (ShowPlayState.class) {
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

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public boolean getIsPlayable() {
        return this.isPlayable_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public Label getLabel() {
        Label labelForNumber = Label.forNumber(this.label_);
        return labelForNumber == null ? Label.UNKNOWN_LABEL : labelForNumber;
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public String getLatestPlayedEpisodeLink() {
        return this.latestPlayedEpisodeLink_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public gva getLatestPlayedEpisodeLinkBytes() {
        return gva.m45888f(this.latestPlayedEpisodeLink_);
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public PlayabilityRestriction getPlayabilityRestriction() {
        PlayabilityRestriction playabilityRestrictionForNumber = PlayabilityRestriction.forNumber(this.playabilityRestriction_);
        return playabilityRestrictionForNumber == null ? PlayabilityRestriction.UNKNOWN : playabilityRestrictionForNumber;
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public int getPlayedPercentage() {
        return this.playedPercentage_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public long getPlayedTime() {
        return this.playedTime_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public String getResumeEpisodeLink() {
        return this.resumeEpisodeLink_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public gva getResumeEpisodeLinkBytes() {
        return gva.m45888f(this.resumeEpisodeLink_);
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public boolean hasIsPlayable() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public boolean hasLabel() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public boolean hasLatestPlayedEpisodeLink() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public boolean hasPlayabilityRestriction() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public boolean hasPlayedPercentage() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public boolean hasPlayedTime() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowPlayStateOrBuilder
    public boolean hasResumeEpisodeLink() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ShowPlayState showPlayState) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(showPlayState);
    }

    public static ShowPlayState parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ShowPlayState) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ShowPlayState parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ShowPlayState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ShowPlayState parseFrom(gva gvaVar) {
        return (ShowPlayState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static ShowPlayState parseFrom(gva gvaVar, aux auxVar) {
        return (ShowPlayState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ShowPlayState parseFrom(byte[] bArr) {
        return (ShowPlayState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ShowPlayState parseFrom(byte[] bArr, aux auxVar) {
        return (ShowPlayState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ShowPlayState parseFrom(InputStream inputStream) {
        return (ShowPlayState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowPlayState parseFrom(InputStream inputStream, aux auxVar) {
        return (ShowPlayState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ShowPlayState parseFrom(owe oweVar) {
        return (ShowPlayState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ShowPlayState parseFrom(owe oweVar, aux auxVar) {
        return (ShowPlayState) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
