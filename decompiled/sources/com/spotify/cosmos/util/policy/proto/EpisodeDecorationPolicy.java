package com.spotify.cosmos.util.policy.proto;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.aux;
import p204p.gva;
import p204p.n350;
import p204p.ntx;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.ud50;
import p204p.vd50;
import p204p.wd50;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EpisodeDecorationPolicy extends AbstractC0269h implements EpisodeDecorationPolicyOrBuilder {
    public static final int AVAILABLE_FIELD_NUMBER = 12;
    public static final int BACKGROUNDABLE_FIELD_NUMBER = 15;
    public static final int COVERS_FIELD_NUMBER = 9;
    private static final EpisodeDecorationPolicy DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 7;
    public static final int EXTENSION_FIELD_NUMBER = 21;
    public static final int FREEZE_FRAMES_FIELD_NUMBER = 10;
    public static final int IS_19_PLUS_ONLY_FIELD_NUMBER = 22;
    public static final int IS_BOOK_CHAPTER_FIELD_NUMBER = 23;
    public static final int IS_CURATED_FIELD_NUMBER = 25;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 16;
    public static final int IS_MUSIC_AND_TALK_FIELD_NUMBER = 18;
    public static final int IS_PODCAST_SHORT_FIELD_NUMBER = 24;
    public static final int LANGUAGE_FIELD_NUMBER = 11;
    public static final int LENGTH_FIELD_NUMBER = 2;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int MANIFEST_ID_FIELD_NUMBER = 4;
    public static final int MEDIA_TYPE_ENUM_FIELD_NUMBER = 13;
    public static final int NAME_FIELD_NUMBER = 3;
    public static final int NUMBER_FIELD_NUMBER = 14;
    private static volatile r2n0 PARSER = null;
    public static final int PREVIEW_ID_FIELD_NUMBER = 5;
    public static final int PREVIEW_MANIFEST_ID_FIELD_NUMBER = 6;
    public static final int PUBLISH_DATE_FIELD_NUMBER = 8;
    public static final int TYPE_FIELD_NUMBER = 17;
    private static final vd50 extension_converter_ = new vd50() { // from class: com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy.1
        @Override // p204p.vd50
        public ntx convert(int i) {
            ntx ntxVarM65644b = ntx.m65644b(i);
            return ntxVarM65644b == null ? ntx.UNRECOGNIZED : ntxVarM65644b;
        }
    };
    private boolean available_;
    private boolean backgroundable_;
    private boolean covers_;
    private boolean description_;
    private int extensionMemoizedSerializedSize;
    private ud50 extension_ = AbstractC0269h.emptyIntList();
    private boolean freezeFrames_;
    private boolean is19PlusOnly_;
    private boolean isBookChapter_;
    private boolean isCurated_;
    private boolean isExplicit_;
    private boolean isMusicAndTalk_;
    private boolean isPodcastShort_;
    private boolean language_;
    private boolean length_;
    private boolean link_;
    private boolean manifestId_;
    private boolean mediaTypeEnum_;
    private boolean name_;
    private boolean number_;
    private boolean previewId_;
    private boolean previewManifestId_;
    private boolean publishDate_;
    private boolean type_;

    /* JADX INFO: renamed from: com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy$2 */
    /* JADX INFO: loaded from: classes6.dex */
    public static /* synthetic */ class C06422 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3495xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3495xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3495xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3495xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3495xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3495xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3495xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3495xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements EpisodeDecorationPolicyOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addAllExtension(Iterable<? extends ntx> iterable) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).addAllExtension(iterable);
            return this;
        }

        public Builder addAllExtensionValue(Iterable<Integer> iterable) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).addAllExtensionValue(iterable);
            return this;
        }

        public Builder addExtension(ntx ntxVar) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).addExtension(ntxVar);
            return this;
        }

        public Builder addExtensionValue(int i) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).addExtensionValue(i);
            return this;
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

        public Builder clearAvailable() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearAvailable();
            return this;
        }

        public Builder clearBackgroundable() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearBackgroundable();
            return this;
        }

        public Builder clearCovers() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearCovers();
            return this;
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearDescription();
            return this;
        }

        public Builder clearExtension() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearExtension();
            return this;
        }

        public Builder clearFreezeFrames() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearFreezeFrames();
            return this;
        }

        public Builder clearIs19PlusOnly() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearIs19PlusOnly();
            return this;
        }

        public Builder clearIsBookChapter() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearIsBookChapter();
            return this;
        }

        public Builder clearIsCurated() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearIsCurated();
            return this;
        }

        public Builder clearIsExplicit() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearIsExplicit();
            return this;
        }

        public Builder clearIsMusicAndTalk() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearIsMusicAndTalk();
            return this;
        }

        public Builder clearIsPodcastShort() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearIsPodcastShort();
            return this;
        }

        public Builder clearLanguage() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearLanguage();
            return this;
        }

        public Builder clearLength() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearLength();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearLink();
            return this;
        }

        public Builder clearManifestId() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearManifestId();
            return this;
        }

        public Builder clearMediaTypeEnum() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearMediaTypeEnum();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearName();
            return this;
        }

        public Builder clearNumber() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearNumber();
            return this;
        }

        public Builder clearPreviewId() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearPreviewId();
            return this;
        }

        public Builder clearPreviewManifestId() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearPreviewManifestId();
            return this;
        }

        public Builder clearPublishDate() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearPublishDate();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).clearType();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getAvailable() {
            return ((EpisodeDecorationPolicy) this.instance).getAvailable();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getBackgroundable() {
            return ((EpisodeDecorationPolicy) this.instance).getBackgroundable();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getCovers() {
            return ((EpisodeDecorationPolicy) this.instance).getCovers();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getDescription() {
            return ((EpisodeDecorationPolicy) this.instance).getDescription();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
        public ntx getExtension(int i) {
            return ((EpisodeDecorationPolicy) this.instance).getExtension(i);
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
        public int getExtensionCount() {
            return ((EpisodeDecorationPolicy) this.instance).getExtensionCount();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
        public List<ntx> getExtensionList() {
            return ((EpisodeDecorationPolicy) this.instance).getExtensionList();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
        public int getExtensionValue(int i) {
            return ((EpisodeDecorationPolicy) this.instance).getExtensionValue(i);
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
        public List<Integer> getExtensionValueList() {
            return Collections.unmodifiableList(((EpisodeDecorationPolicy) this.instance).getExtensionValueList());
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getFreezeFrames() {
            return ((EpisodeDecorationPolicy) this.instance).getFreezeFrames();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getIs19PlusOnly() {
            return ((EpisodeDecorationPolicy) this.instance).getIs19PlusOnly();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getIsBookChapter() {
            return ((EpisodeDecorationPolicy) this.instance).getIsBookChapter();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getIsCurated() {
            return ((EpisodeDecorationPolicy) this.instance).getIsCurated();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getIsExplicit() {
            return ((EpisodeDecorationPolicy) this.instance).getIsExplicit();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getIsMusicAndTalk() {
            return ((EpisodeDecorationPolicy) this.instance).getIsMusicAndTalk();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getIsPodcastShort() {
            return ((EpisodeDecorationPolicy) this.instance).getIsPodcastShort();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getLanguage() {
            return ((EpisodeDecorationPolicy) this.instance).getLanguage();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getLength() {
            return ((EpisodeDecorationPolicy) this.instance).getLength();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getLink() {
            return ((EpisodeDecorationPolicy) this.instance).getLink();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getManifestId() {
            return ((EpisodeDecorationPolicy) this.instance).getManifestId();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getMediaTypeEnum() {
            return ((EpisodeDecorationPolicy) this.instance).getMediaTypeEnum();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getName() {
            return ((EpisodeDecorationPolicy) this.instance).getName();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getNumber() {
            return ((EpisodeDecorationPolicy) this.instance).getNumber();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getPreviewId() {
            return ((EpisodeDecorationPolicy) this.instance).getPreviewId();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getPreviewManifestId() {
            return ((EpisodeDecorationPolicy) this.instance).getPreviewManifestId();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getPublishDate() {
            return ((EpisodeDecorationPolicy) this.instance).getPublishDate();
        }

        @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
        public boolean getType() {
            return ((EpisodeDecorationPolicy) this.instance).getType();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setAvailable(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setAvailable(z);
            return this;
        }

        public Builder setBackgroundable(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setBackgroundable(z);
            return this;
        }

        public Builder setCovers(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setCovers(z);
            return this;
        }

        public Builder setDescription(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setDescription(z);
            return this;
        }

        public Builder setExtension(int i, ntx ntxVar) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setExtension(i, ntxVar);
            return this;
        }

        public Builder setExtensionValue(int i, int i2) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setExtensionValue(i, i2);
            return this;
        }

        public Builder setFreezeFrames(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setFreezeFrames(z);
            return this;
        }

        public Builder setIs19PlusOnly(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setIs19PlusOnly(z);
            return this;
        }

        public Builder setIsBookChapter(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setIsBookChapter(z);
            return this;
        }

        public Builder setIsCurated(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setIsCurated(z);
            return this;
        }

        public Builder setIsExplicit(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setIsExplicit(z);
            return this;
        }

        public Builder setIsMusicAndTalk(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setIsMusicAndTalk(z);
            return this;
        }

        public Builder setIsPodcastShort(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setIsPodcastShort(z);
            return this;
        }

        public Builder setLanguage(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setLanguage(z);
            return this;
        }

        public Builder setLength(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setLength(z);
            return this;
        }

        public Builder setLink(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setLink(z);
            return this;
        }

        public Builder setManifestId(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setManifestId(z);
            return this;
        }

        public Builder setMediaTypeEnum(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setMediaTypeEnum(z);
            return this;
        }

        public Builder setName(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setName(z);
            return this;
        }

        public Builder setNumber(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setNumber(z);
            return this;
        }

        public Builder setPreviewId(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setPreviewId(z);
            return this;
        }

        public Builder setPreviewManifestId(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setPreviewManifestId(z);
            return this;
        }

        public Builder setPublishDate(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setPublishDate(z);
            return this;
        }

        public Builder setType(boolean z) {
            copyOnWrite();
            ((EpisodeDecorationPolicy) this.instance).setType(z);
            return this;
        }

        private Builder() {
            super(EpisodeDecorationPolicy.DEFAULT_INSTANCE);
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
        EpisodeDecorationPolicy episodeDecorationPolicy = new EpisodeDecorationPolicy();
        DEFAULT_INSTANCE = episodeDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(EpisodeDecorationPolicy.class, episodeDecorationPolicy);
    }

    private EpisodeDecorationPolicy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtension(Iterable<? extends ntx> iterable) {
        ensureExtensionIsMutable();
        for (ntx ntxVar : iterable) {
            ((n350) this.extension_).m63581b(ntxVar.getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtensionValue(Iterable<Integer> iterable) {
        ensureExtensionIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            ((n350) this.extension_).m63581b(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtension(ntx ntxVar) {
        ntxVar.getClass();
        ensureExtensionIsMutable();
        ((n350) this.extension_).m63581b(ntxVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtensionValue(int i) {
        ensureExtensionIsMutable();
        ((n350) this.extension_).m63581b(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailable() {
        this.available_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackgroundable() {
        this.backgroundable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCovers() {
        this.covers_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtension() {
        this.extension_ = AbstractC0269h.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFreezeFrames() {
        this.freezeFrames_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIs19PlusOnly() {
        this.is19PlusOnly_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsBookChapter() {
        this.isBookChapter_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCurated() {
        this.isCurated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsExplicit() {
        this.isExplicit_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsMusicAndTalk() {
        this.isMusicAndTalk_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPodcastShort() {
        this.isPodcastShort_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguage() {
        this.language_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLength() {
        this.length_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.link_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearManifestId() {
        this.manifestId_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMediaTypeEnum() {
        this.mediaTypeEnum_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.number_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviewId() {
        this.previewId_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviewManifestId() {
        this.previewManifestId_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublishDate() {
        this.publishDate_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureExtensionIsMutable() {
        ud50 ud50Var = this.extension_;
        if (((AbstractC1733c9) ud50Var).f35342a) {
            return;
        }
        this.extension_ = AbstractC0269h.mutableCopy(ud50Var);
    }

    public static EpisodeDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static EpisodeDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (EpisodeDecorationPolicy) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeDecorationPolicy parseFrom(ByteBuffer byteBuffer) {
        return (EpisodeDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailable(boolean z) {
        this.available_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundable(boolean z) {
        this.backgroundable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCovers(boolean z) {
        this.covers_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(boolean z) {
        this.description_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtension(int i, ntx ntxVar) {
        ntxVar.getClass();
        ensureExtensionIsMutable();
        ((n350) this.extension_).m63585i(i, ntxVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtensionValue(int i, int i2) {
        ensureExtensionIsMutable();
        ((n350) this.extension_).m63585i(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreezeFrames(boolean z) {
        this.freezeFrames_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIs19PlusOnly(boolean z) {
        this.is19PlusOnly_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsBookChapter(boolean z) {
        this.isBookChapter_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCurated(boolean z) {
        this.isCurated_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsExplicit(boolean z) {
        this.isExplicit_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsMusicAndTalk(boolean z) {
        this.isMusicAndTalk_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPodcastShort(boolean z) {
        this.isPodcastShort_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguage(boolean z) {
        this.language_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLength(boolean z) {
        this.length_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLink(boolean z) {
        this.link_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManifestId(boolean z) {
        this.manifestId_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaTypeEnum(boolean z) {
        this.mediaTypeEnum_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(boolean z) {
        this.name_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumber(boolean z) {
        this.number_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewId(boolean z) {
        this.previewId_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewManifestId(boolean z) {
        this.previewManifestId_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublishDate(boolean z) {
        this.publishDate_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(boolean z) {
        this.type_ = z;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0017\u0000\u0000\u0001\u0019\u0017\u0000\u0001\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007\u000b\u0007\f\u0007\r\u0007\u000e\u0007\u000f\u0007\u0010\u0007\u0011\u0007\u0012\u0007\u0015,\u0016\u0007\u0017\u0007\u0018\u0007\u0019\u0007", new Object[]{"link_", "length_", "name_", "manifestId_", "previewId_", "previewManifestId_", "description_", "publishDate_", "covers_", "freezeFrames_", "language_", "available_", "mediaTypeEnum_", "number_", "backgroundable_", "isExplicit_", "type_", "isMusicAndTalk_", "extension_", "is19PlusOnly_", "isBookChapter_", "isPodcastShort_", "isCurated_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeDecorationPolicy();
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
        synchronized (EpisodeDecorationPolicy.class) {
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

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getAvailable() {
        return this.available_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getBackgroundable() {
        return this.backgroundable_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getCovers() {
        return this.covers_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getDescription() {
        return this.description_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
    public ntx getExtension(int i) {
        ntx ntxVarM65644b = ntx.m65644b(((n350) this.extension_).m63583e(i));
        return ntxVarM65644b == null ? ntx.UNRECOGNIZED : ntxVarM65644b;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
    public int getExtensionCount() {
        return ((n350) this.extension_).size();
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
    public List<ntx> getExtensionList() {
        return new wd50(this.extension_, extension_converter_);
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
    public int getExtensionValue(int i) {
        return ((n350) this.extension_).m63583e(i);
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
    public List<Integer> getExtensionValueList() {
        return this.extension_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getFreezeFrames() {
        return this.freezeFrames_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getIs19PlusOnly() {
        return this.is19PlusOnly_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getIsBookChapter() {
        return this.isBookChapter_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getIsCurated() {
        return this.isCurated_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getIsExplicit() {
        return this.isExplicit_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getIsMusicAndTalk() {
        return this.isMusicAndTalk_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getIsPodcastShort() {
        return this.isPodcastShort_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getLanguage() {
        return this.language_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getLength() {
        return this.length_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getManifestId() {
        return this.manifestId_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getMediaTypeEnum() {
        return this.mediaTypeEnum_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getNumber() {
        return this.number_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getPreviewId() {
        return this.previewId_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getPreviewManifestId() {
        return this.previewManifestId_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getPublishDate() {
        return this.publishDate_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicyOrBuilder
    public boolean getType() {
        return this.type_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(EpisodeDecorationPolicy episodeDecorationPolicy) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(episodeDecorationPolicy);
    }

    public static EpisodeDecorationPolicy parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (EpisodeDecorationPolicy) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static EpisodeDecorationPolicy parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (EpisodeDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static EpisodeDecorationPolicy parseFrom(gva gvaVar) {
        return (EpisodeDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static EpisodeDecorationPolicy parseFrom(gva gvaVar, aux auxVar) {
        return (EpisodeDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static EpisodeDecorationPolicy parseFrom(byte[] bArr) {
        return (EpisodeDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EpisodeDecorationPolicy parseFrom(byte[] bArr, aux auxVar) {
        return (EpisodeDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static EpisodeDecorationPolicy parseFrom(InputStream inputStream) {
        return (EpisodeDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeDecorationPolicy parseFrom(InputStream inputStream, aux auxVar) {
        return (EpisodeDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static EpisodeDecorationPolicy parseFrom(owe oweVar) {
        return (EpisodeDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static EpisodeDecorationPolicy parseFrom(owe oweVar, aux auxVar) {
        return (EpisodeDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
