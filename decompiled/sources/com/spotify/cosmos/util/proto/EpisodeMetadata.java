package com.spotify.cosmos.util.proto;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.ae50;
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

/* JADX INFO: loaded from: classes.dex */
public final class EpisodeMetadata extends AbstractC0269h implements EpisodeMetadataOrBuilder {
    public static final int AVAILABLE_FIELD_NUMBER = 11;
    public static final int BACKGROUNDABLE_FIELD_NUMBER = 14;
    public static final int COVERS_FIELD_NUMBER = 5;
    private static final EpisodeMetadata DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 7;
    public static final int EPISODE_TYPE_FIELD_NUMBER = 18;
    public static final int EXTENSION_FIELD_NUMBER = 22;
    public static final int FREEZE_FRAMES_FIELD_NUMBER = 9;
    public static final int IS_19_PLUS_ONLY_FIELD_NUMBER = 23;
    public static final int IS_BOOK_CHAPTER_FIELD_NUMBER = 24;
    public static final int IS_CURATED_FIELD_NUMBER = 26;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 16;
    public static final int IS_MUSIC_AND_TALK_FIELD_NUMBER = 19;
    public static final int IS_PODCAST_SHORT_FIELD_NUMBER = 25;
    public static final int LANGUAGE_FIELD_NUMBER = 10;
    public static final int LENGTH_FIELD_NUMBER = 4;
    public static final int LINK_FIELD_NUMBER = 2;
    public static final int MANIFEST_ID_FIELD_NUMBER = 6;
    public static final int MEDIA_TYPE_ENUM_FIELD_NUMBER = 12;
    public static final int NAME_FIELD_NUMBER = 3;
    public static final int NUMBER_FIELD_NUMBER = 13;
    private static volatile r2n0 PARSER = null;
    public static final int PREVIEW_ID_FIELD_NUMBER = 17;
    public static final int PREVIEW_MANIFEST_ID_FIELD_NUMBER = 15;
    public static final int PUBLISH_DATE_FIELD_NUMBER = 8;
    public static final int SHOW_FIELD_NUMBER = 1;
    private boolean available_;
    private boolean backgroundable_;
    private int bitField0_;
    private ImageGroup covers_;
    private int episodeType_;
    private ImageGroup freezeFrames_;
    private boolean is19PlusOnly_;
    private boolean isBookChapter_;
    private boolean isCurated_;
    private boolean isExplicit_;
    private boolean isMusicAndTalk_;
    private boolean isPodcastShort_;
    private int length_;
    private int mediaTypeEnum_;
    private int number_;
    private long publishDate_;
    private EpisodeShowMetadata show_;
    private String link_ = "";
    private String name_ = "";
    private String manifestId_ = "";
    private String description_ = "";
    private String language_ = "";
    private String previewManifestId_ = "";
    private String previewId_ = "";
    private ae50 extension_ = AbstractC0269h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.cosmos.util.proto.EpisodeMetadata$1 */
    /* JADX INFO: loaded from: classes6.dex */
    public static /* synthetic */ class C06651 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3515xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3515xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3515xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3515xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3515xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3515xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3515xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3515xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class Builder extends AbstractC0268g implements EpisodeMetadataOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addAllExtension(Iterable<? extends Extension> iterable) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).addAllExtension(iterable);
            return this;
        }

        public Builder addExtension(Extension extension) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).addExtension(extension);
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
            ((EpisodeMetadata) this.instance).clearAvailable();
            return this;
        }

        public Builder clearBackgroundable() {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).clearBackgroundable();
            return this;
        }

        public Builder clearCovers() {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).clearCovers();
            return this;
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).clearDescription();
            return this;
        }

        public Builder clearEpisodeType() {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).clearEpisodeType();
            return this;
        }

        public Builder clearExtension() {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).clearExtension();
            return this;
        }

        public Builder clearFreezeFrames() {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).clearFreezeFrames();
            return this;
        }

        public Builder clearIs19PlusOnly() {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).clearIs19PlusOnly();
            return this;
        }

        public Builder clearIsBookChapter() {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).clearIsBookChapter();
            return this;
        }

        public Builder clearIsCurated() {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).clearIsCurated();
            return this;
        }

        public Builder clearIsExplicit() {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).clearIsExplicit();
            return this;
        }

        public Builder clearIsMusicAndTalk() {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).clearIsMusicAndTalk();
            return this;
        }

        public Builder clearIsPodcastShort() {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).clearIsPodcastShort();
            return this;
        }

        public Builder clearLanguage() {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).clearLanguage();
            return this;
        }

        public Builder clearLength() {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).clearLength();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).clearLink();
            return this;
        }

        public Builder clearManifestId() {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).clearManifestId();
            return this;
        }

        public Builder clearMediaTypeEnum() {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).clearMediaTypeEnum();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).clearName();
            return this;
        }

        public Builder clearNumber() {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).clearNumber();
            return this;
        }

        public Builder clearPreviewId() {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).clearPreviewId();
            return this;
        }

        public Builder clearPreviewManifestId() {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).clearPreviewManifestId();
            return this;
        }

        public Builder clearPublishDate() {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).clearPublishDate();
            return this;
        }

        public Builder clearShow() {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).clearShow();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean getAvailable() {
            return ((EpisodeMetadata) this.instance).getAvailable();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean getBackgroundable() {
            return ((EpisodeMetadata) this.instance).getBackgroundable();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public ImageGroup getCovers() {
            return ((EpisodeMetadata) this.instance).getCovers();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public String getDescription() {
            return ((EpisodeMetadata) this.instance).getDescription();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public gva getDescriptionBytes() {
            return ((EpisodeMetadata) this.instance).getDescriptionBytes();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public EpisodeType getEpisodeType() {
            return ((EpisodeMetadata) this.instance).getEpisodeType();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public Extension getExtension(int i) {
            return ((EpisodeMetadata) this.instance).getExtension(i);
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public int getExtensionCount() {
            return ((EpisodeMetadata) this.instance).getExtensionCount();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public List<Extension> getExtensionList() {
            return Collections.unmodifiableList(((EpisodeMetadata) this.instance).getExtensionList());
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public ImageGroup getFreezeFrames() {
            return ((EpisodeMetadata) this.instance).getFreezeFrames();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean getIs19PlusOnly() {
            return ((EpisodeMetadata) this.instance).getIs19PlusOnly();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean getIsBookChapter() {
            return ((EpisodeMetadata) this.instance).getIsBookChapter();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean getIsCurated() {
            return ((EpisodeMetadata) this.instance).getIsCurated();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean getIsExplicit() {
            return ((EpisodeMetadata) this.instance).getIsExplicit();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean getIsMusicAndTalk() {
            return ((EpisodeMetadata) this.instance).getIsMusicAndTalk();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean getIsPodcastShort() {
            return ((EpisodeMetadata) this.instance).getIsPodcastShort();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public String getLanguage() {
            return ((EpisodeMetadata) this.instance).getLanguage();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public gva getLanguageBytes() {
            return ((EpisodeMetadata) this.instance).getLanguageBytes();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public int getLength() {
            return ((EpisodeMetadata) this.instance).getLength();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public String getLink() {
            return ((EpisodeMetadata) this.instance).getLink();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public gva getLinkBytes() {
            return ((EpisodeMetadata) this.instance).getLinkBytes();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public String getManifestId() {
            return ((EpisodeMetadata) this.instance).getManifestId();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public gva getManifestIdBytes() {
            return ((EpisodeMetadata) this.instance).getManifestIdBytes();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public MediaType getMediaTypeEnum() {
            return ((EpisodeMetadata) this.instance).getMediaTypeEnum();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public String getName() {
            return ((EpisodeMetadata) this.instance).getName();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public gva getNameBytes() {
            return ((EpisodeMetadata) this.instance).getNameBytes();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public int getNumber() {
            return ((EpisodeMetadata) this.instance).getNumber();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public String getPreviewId() {
            return ((EpisodeMetadata) this.instance).getPreviewId();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public gva getPreviewIdBytes() {
            return ((EpisodeMetadata) this.instance).getPreviewIdBytes();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public String getPreviewManifestId() {
            return ((EpisodeMetadata) this.instance).getPreviewManifestId();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public gva getPreviewManifestIdBytes() {
            return ((EpisodeMetadata) this.instance).getPreviewManifestIdBytes();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public long getPublishDate() {
            return ((EpisodeMetadata) this.instance).getPublishDate();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public EpisodeShowMetadata getShow() {
            return ((EpisodeMetadata) this.instance).getShow();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean hasAvailable() {
            return ((EpisodeMetadata) this.instance).hasAvailable();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean hasBackgroundable() {
            return ((EpisodeMetadata) this.instance).hasBackgroundable();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean hasCovers() {
            return ((EpisodeMetadata) this.instance).hasCovers();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean hasDescription() {
            return ((EpisodeMetadata) this.instance).hasDescription();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean hasEpisodeType() {
            return ((EpisodeMetadata) this.instance).hasEpisodeType();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean hasFreezeFrames() {
            return ((EpisodeMetadata) this.instance).hasFreezeFrames();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean hasIs19PlusOnly() {
            return ((EpisodeMetadata) this.instance).hasIs19PlusOnly();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean hasIsBookChapter() {
            return ((EpisodeMetadata) this.instance).hasIsBookChapter();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean hasIsCurated() {
            return ((EpisodeMetadata) this.instance).hasIsCurated();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean hasIsExplicit() {
            return ((EpisodeMetadata) this.instance).hasIsExplicit();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean hasIsMusicAndTalk() {
            return ((EpisodeMetadata) this.instance).hasIsMusicAndTalk();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean hasIsPodcastShort() {
            return ((EpisodeMetadata) this.instance).hasIsPodcastShort();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean hasLanguage() {
            return ((EpisodeMetadata) this.instance).hasLanguage();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean hasLength() {
            return ((EpisodeMetadata) this.instance).hasLength();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean hasLink() {
            return ((EpisodeMetadata) this.instance).hasLink();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean hasManifestId() {
            return ((EpisodeMetadata) this.instance).hasManifestId();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean hasMediaTypeEnum() {
            return ((EpisodeMetadata) this.instance).hasMediaTypeEnum();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean hasName() {
            return ((EpisodeMetadata) this.instance).hasName();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean hasNumber() {
            return ((EpisodeMetadata) this.instance).hasNumber();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean hasPreviewId() {
            return ((EpisodeMetadata) this.instance).hasPreviewId();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean hasPreviewManifestId() {
            return ((EpisodeMetadata) this.instance).hasPreviewManifestId();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean hasPublishDate() {
            return ((EpisodeMetadata) this.instance).hasPublishDate();
        }

        @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
        public boolean hasShow() {
            return ((EpisodeMetadata) this.instance).hasShow();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeCovers(ImageGroup imageGroup) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).mergeCovers(imageGroup);
            return this;
        }

        public Builder mergeFreezeFrames(ImageGroup imageGroup) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).mergeFreezeFrames(imageGroup);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeShow(EpisodeShowMetadata episodeShowMetadata) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).mergeShow(episodeShowMetadata);
            return this;
        }

        public Builder removeExtension(int i) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).removeExtension(i);
            return this;
        }

        public Builder setAvailable(boolean z) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setAvailable(z);
            return this;
        }

        public Builder setBackgroundable(boolean z) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setBackgroundable(z);
            return this;
        }

        public Builder setCovers(ImageGroup imageGroup) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setCovers(imageGroup);
            return this;
        }

        public Builder setDescription(String str) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setDescription(str);
            return this;
        }

        public Builder setDescriptionBytes(gva gvaVar) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setDescriptionBytes(gvaVar);
            return this;
        }

        public Builder setEpisodeType(EpisodeType episodeType) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setEpisodeType(episodeType);
            return this;
        }

        public Builder setExtension(int i, Extension extension) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setExtension(i, extension);
            return this;
        }

        public Builder setFreezeFrames(ImageGroup imageGroup) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setFreezeFrames(imageGroup);
            return this;
        }

        public Builder setIs19PlusOnly(boolean z) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setIs19PlusOnly(z);
            return this;
        }

        public Builder setIsBookChapter(boolean z) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setIsBookChapter(z);
            return this;
        }

        public Builder setIsCurated(boolean z) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setIsCurated(z);
            return this;
        }

        public Builder setIsExplicit(boolean z) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setIsExplicit(z);
            return this;
        }

        public Builder setIsMusicAndTalk(boolean z) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setIsMusicAndTalk(z);
            return this;
        }

        public Builder setIsPodcastShort(boolean z) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setIsPodcastShort(z);
            return this;
        }

        public Builder setLanguage(String str) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setLanguage(str);
            return this;
        }

        public Builder setLanguageBytes(gva gvaVar) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setLanguageBytes(gvaVar);
            return this;
        }

        public Builder setLength(int i) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setLength(i);
            return this;
        }

        public Builder setLink(String str) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setLink(str);
            return this;
        }

        public Builder setLinkBytes(gva gvaVar) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setLinkBytes(gvaVar);
            return this;
        }

        public Builder setManifestId(String str) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setManifestId(str);
            return this;
        }

        public Builder setManifestIdBytes(gva gvaVar) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setManifestIdBytes(gvaVar);
            return this;
        }

        public Builder setMediaTypeEnum(MediaType mediaType) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setMediaTypeEnum(mediaType);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(gva gvaVar) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setNameBytes(gvaVar);
            return this;
        }

        public Builder setNumber(int i) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setNumber(i);
            return this;
        }

        public Builder setPreviewId(String str) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setPreviewId(str);
            return this;
        }

        public Builder setPreviewIdBytes(gva gvaVar) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setPreviewIdBytes(gvaVar);
            return this;
        }

        public Builder setPreviewManifestId(String str) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setPreviewManifestId(str);
            return this;
        }

        public Builder setPreviewManifestIdBytes(gva gvaVar) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setPreviewManifestIdBytes(gvaVar);
            return this;
        }

        public Builder setPublishDate(long j) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setPublishDate(j);
            return this;
        }

        public Builder setShow(EpisodeShowMetadata episodeShowMetadata) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setShow(episodeShowMetadata);
            return this;
        }

        private Builder() {
            super(EpisodeMetadata.DEFAULT_INSTANCE);
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

        public Builder addExtension(int i, Extension extension) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).addExtension(i, extension);
            return this;
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

        public Builder setCovers(ImageGroup.Builder builder) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setCovers((ImageGroup) builder.build());
            return this;
        }

        public Builder setExtension(int i, Extension.Builder builder) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setExtension(i, (Extension) builder.build());
            return this;
        }

        public Builder setFreezeFrames(ImageGroup.Builder builder) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setFreezeFrames((ImageGroup) builder.build());
            return this;
        }

        public Builder setShow(EpisodeShowMetadata.Builder builder) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).setShow((EpisodeShowMetadata) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        public Builder addExtension(Extension.Builder builder) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).addExtension((Extension) builder.build());
            return this;
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

        public Builder addExtension(int i, Extension.Builder builder) {
            copyOnWrite();
            ((EpisodeMetadata) this.instance).addExtension(i, (Extension) builder.build());
            return this;
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

    public enum EpisodeType implements od50 {
        UNKNOWN(0),
        FULL(1),
        TRAILER(2),
        BONUS(3);

        public static final int BONUS_VALUE = 3;
        public static final int FULL_VALUE = 1;
        public static final int TRAILER_VALUE = 2;
        public static final int UNKNOWN_VALUE = 0;
        private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.cosmos.util.proto.EpisodeMetadata.EpisodeType.1
            @Override // p204p.rd50
            public EpisodeType findValueByNumber(int i) {
                return EpisodeType.forNumber(i);
            }
        };
        private final int value;

        /* JADX INFO: loaded from: classes6.dex */
        public static final class EpisodeTypeVerifier implements sd50 {
            static final sd50 INSTANCE = new EpisodeTypeVerifier();

            private EpisodeTypeVerifier() {
            }

            @Override // p204p.sd50
            public boolean isInRange(int i) {
                return EpisodeType.forNumber(i) != null;
            }
        }

        EpisodeType(int i) {
            this.value = i;
        }

        public static EpisodeType forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return FULL;
            }
            if (i == 2) {
                return TRAILER;
            }
            if (i != 3) {
                return null;
            }
            return BONUS;
        }

        public static rd50 internalGetValueMap() {
            return internalValueMap;
        }

        public static sd50 internalGetVerifier() {
            return EpisodeTypeVerifier.INSTANCE;
        }

        @Override // p204p.od50
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static EpisodeType valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum MediaType implements od50 {
        VODCAST(0),
        AUDIO(1),
        VIDEO(2);

        public static final int AUDIO_VALUE = 1;
        public static final int VIDEO_VALUE = 2;
        public static final int VODCAST_VALUE = 0;
        private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.cosmos.util.proto.EpisodeMetadata.MediaType.1
            @Override // p204p.rd50
            public MediaType findValueByNumber(int i) {
                return MediaType.forNumber(i);
            }
        };
        private final int value;

        /* JADX INFO: loaded from: classes6.dex */
        public static final class MediaTypeVerifier implements sd50 {
            static final sd50 INSTANCE = new MediaTypeVerifier();

            private MediaTypeVerifier() {
            }

            @Override // p204p.sd50
            public boolean isInRange(int i) {
                return MediaType.forNumber(i) != null;
            }
        }

        MediaType(int i) {
            this.value = i;
        }

        public static MediaType forNumber(int i) {
            if (i == 0) {
                return VODCAST;
            }
            if (i == 1) {
                return AUDIO;
            }
            if (i != 2) {
                return null;
            }
            return VIDEO;
        }

        public static rd50 internalGetValueMap() {
            return internalValueMap;
        }

        public static sd50 internalGetVerifier() {
            return MediaTypeVerifier.INSTANCE;
        }

        @Override // p204p.od50
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static MediaType valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        EpisodeMetadata episodeMetadata = new EpisodeMetadata();
        DEFAULT_INSTANCE = episodeMetadata;
        AbstractC0269h.registerDefaultInstance(EpisodeMetadata.class, episodeMetadata);
    }

    private EpisodeMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtension(Iterable<? extends Extension> iterable) {
        ensureExtensionIsMutable();
        AbstractC2118m8.addAll(iterable, this.extension_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtension(Extension extension) {
        extension.getClass();
        ensureExtensionIsMutable();
        this.extension_.add(extension);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailable() {
        this.bitField0_ &= -1025;
        this.available_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackgroundable() {
        this.bitField0_ &= -8193;
        this.backgroundable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCovers() {
        this.covers_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.bitField0_ &= -65;
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEpisodeType() {
        this.bitField0_ &= -131073;
        this.episodeType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtension() {
        this.extension_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFreezeFrames() {
        this.freezeFrames_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIs19PlusOnly() {
        this.bitField0_ &= -524289;
        this.is19PlusOnly_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsBookChapter() {
        this.bitField0_ &= -1048577;
        this.isBookChapter_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCurated() {
        this.bitField0_ &= -4194305;
        this.isCurated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsExplicit() {
        this.bitField0_ &= -32769;
        this.isExplicit_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsMusicAndTalk() {
        this.bitField0_ &= -262145;
        this.isMusicAndTalk_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPodcastShort() {
        this.bitField0_ &= -2097153;
        this.isPodcastShort_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguage() {
        this.bitField0_ &= -513;
        this.language_ = getDefaultInstance().getLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLength() {
        this.bitField0_ &= -9;
        this.length_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.bitField0_ &= -3;
        this.link_ = getDefaultInstance().getLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearManifestId() {
        this.bitField0_ &= -33;
        this.manifestId_ = getDefaultInstance().getManifestId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMediaTypeEnum() {
        this.bitField0_ &= -2049;
        this.mediaTypeEnum_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -5;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.bitField0_ &= -4097;
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviewId() {
        this.bitField0_ &= -65537;
        this.previewId_ = getDefaultInstance().getPreviewId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviewManifestId() {
        this.bitField0_ &= -16385;
        this.previewManifestId_ = getDefaultInstance().getPreviewManifestId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublishDate() {
        this.bitField0_ &= -129;
        this.publishDate_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShow() {
        this.show_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureExtensionIsMutable() {
        ae50 ae50Var = this.extension_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.extension_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    public static EpisodeMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCovers(ImageGroup imageGroup) {
        imageGroup.getClass();
        ImageGroup imageGroup2 = this.covers_;
        if (imageGroup2 == null || imageGroup2 == ImageGroup.getDefaultInstance()) {
            this.covers_ = imageGroup;
        } else {
            this.covers_ = (ImageGroup) ((ImageGroup.Builder) ImageGroup.newBuilder(this.covers_).mergeFrom((AbstractC0269h) imageGroup)).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFreezeFrames(ImageGroup imageGroup) {
        imageGroup.getClass();
        ImageGroup imageGroup2 = this.freezeFrames_;
        if (imageGroup2 == null || imageGroup2 == ImageGroup.getDefaultInstance()) {
            this.freezeFrames_ = imageGroup;
        } else {
            this.freezeFrames_ = (ImageGroup) ((ImageGroup.Builder) ImageGroup.newBuilder(this.freezeFrames_).mergeFrom((AbstractC0269h) imageGroup)).buildPartial();
        }
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShow(EpisodeShowMetadata episodeShowMetadata) {
        episodeShowMetadata.getClass();
        EpisodeShowMetadata episodeShowMetadata2 = this.show_;
        if (episodeShowMetadata2 == null || episodeShowMetadata2 == EpisodeShowMetadata.getDefaultInstance()) {
            this.show_ = episodeShowMetadata;
        } else {
            this.show_ = (EpisodeShowMetadata) ((EpisodeShowMetadata.Builder) EpisodeShowMetadata.newBuilder(this.show_).mergeFrom((AbstractC0269h) episodeShowMetadata)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static EpisodeMetadata parseDelimitedFrom(InputStream inputStream) {
        return (EpisodeMetadata) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeMetadata parseFrom(ByteBuffer byteBuffer) {
        return (EpisodeMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExtension(int i) {
        ensureExtensionIsMutable();
        this.extension_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailable(boolean z) {
        this.bitField0_ |= 1024;
        this.available_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundable(boolean z) {
        this.bitField0_ |= 8192;
        this.backgroundable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCovers(ImageGroup imageGroup) {
        imageGroup.getClass();
        this.covers_ = imageGroup;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(gva gvaVar) {
        this.description_ = gvaVar.m45892u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEpisodeType(EpisodeType episodeType) {
        this.episodeType_ = episodeType.getNumber();
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtension(int i, Extension extension) {
        extension.getClass();
        ensureExtensionIsMutable();
        this.extension_.set(i, extension);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreezeFrames(ImageGroup imageGroup) {
        imageGroup.getClass();
        this.freezeFrames_ = imageGroup;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIs19PlusOnly(boolean z) {
        this.bitField0_ |= 524288;
        this.is19PlusOnly_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsBookChapter(boolean z) {
        this.bitField0_ |= 1048576;
        this.isBookChapter_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCurated(boolean z) {
        this.bitField0_ |= 4194304;
        this.isCurated_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsExplicit(boolean z) {
        this.bitField0_ |= 32768;
        this.isExplicit_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsMusicAndTalk(boolean z) {
        this.bitField0_ |= 262144;
        this.isMusicAndTalk_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPodcastShort(boolean z) {
        this.bitField0_ |= 2097152;
        this.isPodcastShort_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguage(String str) {
        str.getClass();
        this.bitField0_ |= 512;
        this.language_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageBytes(gva gvaVar) {
        this.language_ = gvaVar.m45892u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLength(int i) {
        this.bitField0_ |= 8;
        this.length_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLink(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.link_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkBytes(gva gvaVar) {
        this.link_ = gvaVar.m45892u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManifestId(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.manifestId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManifestIdBytes(gva gvaVar) {
        this.manifestId_ = gvaVar.m45892u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaTypeEnum(MediaType mediaType) {
        this.mediaTypeEnum_ = mediaType.getNumber();
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(gva gvaVar) {
        this.name_ = gvaVar.m45892u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumber(int i) {
        this.bitField0_ |= 4096;
        this.number_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewId(String str) {
        str.getClass();
        this.bitField0_ |= 65536;
        this.previewId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewIdBytes(gva gvaVar) {
        this.previewId_ = gvaVar.m45892u();
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewManifestId(String str) {
        str.getClass();
        this.bitField0_ |= 16384;
        this.previewManifestId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewManifestIdBytes(gva gvaVar) {
        this.previewManifestId_ = gvaVar.m45892u();
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublishDate(long j) {
        this.bitField0_ |= 128;
        this.publishDate_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShow(EpisodeShowMetadata episodeShowMetadata) {
        episodeShowMetadata.getClass();
        this.show_ = episodeShowMetadata;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0018\u0000\u0001\u0001\u001a\u0018\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဋ\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\tဉ\b\nဈ\t\u000bဇ\n\f᠌\u000b\rင\f\u000eဇ\r\u000fဈ\u000e\u0010ဇ\u000f\u0011ဈ\u0010\u0012᠌\u0011\u0013ဇ\u0012\u0016\u001b\u0017ဇ\u0013\u0018ဇ\u0014\u0019ဇ\u0015\u001aဇ\u0016", new Object[]{"bitField0_", "show_", "link_", "name_", "length_", "covers_", "manifestId_", "description_", "publishDate_", "freezeFrames_", "language_", "available_", "mediaTypeEnum_", MediaType.internalGetVerifier(), "number_", "backgroundable_", "previewManifestId_", "isExplicit_", "previewId_", "episodeType_", EpisodeType.internalGetVerifier(), "isMusicAndTalk_", "extension_", Extension.class, "is19PlusOnly_", "isBookChapter_", "isPodcastShort_", "isCurated_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeMetadata();
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
        synchronized (EpisodeMetadata.class) {
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

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean getAvailable() {
        return this.available_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean getBackgroundable() {
        return this.backgroundable_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public ImageGroup getCovers() {
        ImageGroup imageGroup = this.covers_;
        return imageGroup == null ? ImageGroup.getDefaultInstance() : imageGroup;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public String getDescription() {
        return this.description_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public gva getDescriptionBytes() {
        return gva.m45888f(this.description_);
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public EpisodeType getEpisodeType() {
        EpisodeType episodeTypeForNumber = EpisodeType.forNumber(this.episodeType_);
        return episodeTypeForNumber == null ? EpisodeType.UNKNOWN : episodeTypeForNumber;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public Extension getExtension(int i) {
        return (Extension) this.extension_.get(i);
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public int getExtensionCount() {
        return this.extension_.size();
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public List<Extension> getExtensionList() {
        return this.extension_;
    }

    public ExtensionOrBuilder getExtensionOrBuilder(int i) {
        return (ExtensionOrBuilder) this.extension_.get(i);
    }

    public List<? extends ExtensionOrBuilder> getExtensionOrBuilderList() {
        return this.extension_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public ImageGroup getFreezeFrames() {
        ImageGroup imageGroup = this.freezeFrames_;
        return imageGroup == null ? ImageGroup.getDefaultInstance() : imageGroup;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean getIs19PlusOnly() {
        return this.is19PlusOnly_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean getIsBookChapter() {
        return this.isBookChapter_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean getIsCurated() {
        return this.isCurated_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean getIsExplicit() {
        return this.isExplicit_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean getIsMusicAndTalk() {
        return this.isMusicAndTalk_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean getIsPodcastShort() {
        return this.isPodcastShort_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public String getLanguage() {
        return this.language_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public gva getLanguageBytes() {
        return gva.m45888f(this.language_);
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public int getLength() {
        return this.length_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public String getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public gva getLinkBytes() {
        return gva.m45888f(this.link_);
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public String getManifestId() {
        return this.manifestId_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public gva getManifestIdBytes() {
        return gva.m45888f(this.manifestId_);
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public MediaType getMediaTypeEnum() {
        MediaType mediaTypeForNumber = MediaType.forNumber(this.mediaTypeEnum_);
        return mediaTypeForNumber == null ? MediaType.VODCAST : mediaTypeForNumber;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public gva getNameBytes() {
        return gva.m45888f(this.name_);
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public int getNumber() {
        return this.number_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public String getPreviewId() {
        return this.previewId_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public gva getPreviewIdBytes() {
        return gva.m45888f(this.previewId_);
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public String getPreviewManifestId() {
        return this.previewManifestId_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public gva getPreviewManifestIdBytes() {
        return gva.m45888f(this.previewManifestId_);
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public long getPublishDate() {
        return this.publishDate_;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public EpisodeShowMetadata getShow() {
        EpisodeShowMetadata episodeShowMetadata = this.show_;
        return episodeShowMetadata == null ? EpisodeShowMetadata.getDefaultInstance() : episodeShowMetadata;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasAvailable() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasBackgroundable() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasCovers() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasDescription() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasEpisodeType() {
        return (this.bitField0_ & 131072) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasFreezeFrames() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasIs19PlusOnly() {
        return (this.bitField0_ & 524288) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasIsBookChapter() {
        return (this.bitField0_ & 1048576) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasIsCurated() {
        return (this.bitField0_ & 4194304) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasIsExplicit() {
        return (this.bitField0_ & 32768) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasIsMusicAndTalk() {
        return (this.bitField0_ & 262144) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasIsPodcastShort() {
        return (this.bitField0_ & 2097152) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasLanguage() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasLength() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasLink() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasManifestId() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasMediaTypeEnum() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasNumber() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasPreviewId() {
        return (this.bitField0_ & 65536) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasPreviewManifestId() {
        return (this.bitField0_ & 16384) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasPublishDate() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.EpisodeMetadataOrBuilder
    public boolean hasShow() {
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

    public static Builder newBuilder(EpisodeMetadata episodeMetadata) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(episodeMetadata);
    }

    public static EpisodeMetadata parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (EpisodeMetadata) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static EpisodeMetadata parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (EpisodeMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static EpisodeMetadata parseFrom(gva gvaVar) {
        return (EpisodeMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtension(int i, Extension extension) {
        extension.getClass();
        ensureExtensionIsMutable();
        this.extension_.add(i, extension);
    }

    public static EpisodeMetadata parseFrom(gva gvaVar, aux auxVar) {
        return (EpisodeMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static EpisodeMetadata parseFrom(byte[] bArr) {
        return (EpisodeMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EpisodeMetadata parseFrom(byte[] bArr, aux auxVar) {
        return (EpisodeMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static EpisodeMetadata parseFrom(InputStream inputStream) {
        return (EpisodeMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EpisodeMetadata parseFrom(InputStream inputStream, aux auxVar) {
        return (EpisodeMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static EpisodeMetadata parseFrom(owe oweVar) {
        return (EpisodeMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static EpisodeMetadata parseFrom(owe oweVar, aux auxVar) {
        return (EpisodeMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
