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
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ShowMetadata extends AbstractC0269h implements ShowMetadataOrBuilder {
    public static final int CONSUMPTION_ORDER_FIELD_NUMBER = 10;
    public static final int COPYRIGHT_FIELD_NUMBER = 12;
    public static final int COVERS_FIELD_NUMBER = 8;
    private static final ShowMetadata DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int EXTENSION_FIELD_NUMBER = 15;
    public static final int FORMAT_LIST_ATTRIBUTES_FIELD_NUMBER = 18;
    public static final int IS_BOOK_FIELD_NUMBER = 16;
    public static final int IS_CREATOR_CHANNEL_FIELD_NUMBER = 17;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 7;
    public static final int IS_MUSIC_AND_TALK_FIELD_NUMBER = 14;
    public static final int LANGUAGE_FIELD_NUMBER = 6;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int MEDIA_TYPE_ENUM_FIELD_NUMBER = 11;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NUM_EPISODES_FIELD_NUMBER = 9;
    private static volatile r2n0 PARSER = null;
    public static final int POPULARITY_FIELD_NUMBER = 4;
    public static final int PUBLISHER_FIELD_NUMBER = 5;
    public static final int TRAILER_URI_FIELD_NUMBER = 13;
    private int bitField0_;
    private ImageGroup covers_;
    private boolean isBook_;
    private boolean isCreatorChannel_;
    private boolean isExplicit_;
    private boolean isMusicAndTalk_;
    private int mediaTypeEnum_;
    private int numEpisodes_;
    private int popularity_;
    private String link_ = "";
    private String name_ = "";
    private String description_ = "";
    private String publisher_ = "";
    private String language_ = "";
    private String consumptionOrder_ = "";
    private ae50 copyright_ = AbstractC0269h.emptyProtobufList();
    private String trailerUri_ = "";
    private ae50 extension_ = AbstractC0269h.emptyProtobufList();
    private ae50 formatListAttributes_ = AbstractC0269h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.cosmos.util.proto.ShowMetadata$1 */
    public static /* synthetic */ class C06761 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3523xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3523xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3523xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3523xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3523xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3523xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3523xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3523xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ShowMetadataOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addAllCopyright(Iterable<String> iterable) {
            copyOnWrite();
            ((ShowMetadata) this.instance).addAllCopyright(iterable);
            return this;
        }

        public Builder addAllExtension(Iterable<? extends Extension> iterable) {
            copyOnWrite();
            ((ShowMetadata) this.instance).addAllExtension(iterable);
            return this;
        }

        public Builder addAllFormatListAttributes(Iterable<? extends ShowListAttribute> iterable) {
            copyOnWrite();
            ((ShowMetadata) this.instance).addAllFormatListAttributes(iterable);
            return this;
        }

        public Builder addCopyright(String str) {
            copyOnWrite();
            ((ShowMetadata) this.instance).addCopyright(str);
            return this;
        }

        public Builder addCopyrightBytes(gva gvaVar) {
            copyOnWrite();
            ((ShowMetadata) this.instance).addCopyrightBytes(gvaVar);
            return this;
        }

        public Builder addExtension(Extension extension) {
            copyOnWrite();
            ((ShowMetadata) this.instance).addExtension(extension);
            return this;
        }

        public Builder addFormatListAttributes(ShowListAttribute showListAttribute) {
            copyOnWrite();
            ((ShowMetadata) this.instance).addFormatListAttributes(showListAttribute);
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

        public Builder clearConsumptionOrder() {
            copyOnWrite();
            ((ShowMetadata) this.instance).clearConsumptionOrder();
            return this;
        }

        public Builder clearCopyright() {
            copyOnWrite();
            ((ShowMetadata) this.instance).clearCopyright();
            return this;
        }

        public Builder clearCovers() {
            copyOnWrite();
            ((ShowMetadata) this.instance).clearCovers();
            return this;
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((ShowMetadata) this.instance).clearDescription();
            return this;
        }

        public Builder clearExtension() {
            copyOnWrite();
            ((ShowMetadata) this.instance).clearExtension();
            return this;
        }

        public Builder clearFormatListAttributes() {
            copyOnWrite();
            ((ShowMetadata) this.instance).clearFormatListAttributes();
            return this;
        }

        public Builder clearIsBook() {
            copyOnWrite();
            ((ShowMetadata) this.instance).clearIsBook();
            return this;
        }

        public Builder clearIsCreatorChannel() {
            copyOnWrite();
            ((ShowMetadata) this.instance).clearIsCreatorChannel();
            return this;
        }

        public Builder clearIsExplicit() {
            copyOnWrite();
            ((ShowMetadata) this.instance).clearIsExplicit();
            return this;
        }

        public Builder clearIsMusicAndTalk() {
            copyOnWrite();
            ((ShowMetadata) this.instance).clearIsMusicAndTalk();
            return this;
        }

        public Builder clearLanguage() {
            copyOnWrite();
            ((ShowMetadata) this.instance).clearLanguage();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((ShowMetadata) this.instance).clearLink();
            return this;
        }

        public Builder clearMediaTypeEnum() {
            copyOnWrite();
            ((ShowMetadata) this.instance).clearMediaTypeEnum();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((ShowMetadata) this.instance).clearName();
            return this;
        }

        public Builder clearNumEpisodes() {
            copyOnWrite();
            ((ShowMetadata) this.instance).clearNumEpisodes();
            return this;
        }

        public Builder clearPopularity() {
            copyOnWrite();
            ((ShowMetadata) this.instance).clearPopularity();
            return this;
        }

        public Builder clearPublisher() {
            copyOnWrite();
            ((ShowMetadata) this.instance).clearPublisher();
            return this;
        }

        public Builder clearTrailerUri() {
            copyOnWrite();
            ((ShowMetadata) this.instance).clearTrailerUri();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public String getConsumptionOrder() {
            return ((ShowMetadata) this.instance).getConsumptionOrder();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public gva getConsumptionOrderBytes() {
            return ((ShowMetadata) this.instance).getConsumptionOrderBytes();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public String getCopyright(int i) {
            return ((ShowMetadata) this.instance).getCopyright(i);
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public gva getCopyrightBytes(int i) {
            return ((ShowMetadata) this.instance).getCopyrightBytes(i);
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public int getCopyrightCount() {
            return ((ShowMetadata) this.instance).getCopyrightCount();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public List<String> getCopyrightList() {
            return Collections.unmodifiableList(((ShowMetadata) this.instance).getCopyrightList());
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public ImageGroup getCovers() {
            return ((ShowMetadata) this.instance).getCovers();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public String getDescription() {
            return ((ShowMetadata) this.instance).getDescription();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public gva getDescriptionBytes() {
            return ((ShowMetadata) this.instance).getDescriptionBytes();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public Extension getExtension(int i) {
            return ((ShowMetadata) this.instance).getExtension(i);
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public int getExtensionCount() {
            return ((ShowMetadata) this.instance).getExtensionCount();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public List<Extension> getExtensionList() {
            return Collections.unmodifiableList(((ShowMetadata) this.instance).getExtensionList());
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public ShowListAttribute getFormatListAttributes(int i) {
            return ((ShowMetadata) this.instance).getFormatListAttributes(i);
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public int getFormatListAttributesCount() {
            return ((ShowMetadata) this.instance).getFormatListAttributesCount();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public List<ShowListAttribute> getFormatListAttributesList() {
            return Collections.unmodifiableList(((ShowMetadata) this.instance).getFormatListAttributesList());
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean getIsBook() {
            return ((ShowMetadata) this.instance).getIsBook();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean getIsCreatorChannel() {
            return ((ShowMetadata) this.instance).getIsCreatorChannel();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean getIsExplicit() {
            return ((ShowMetadata) this.instance).getIsExplicit();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean getIsMusicAndTalk() {
            return ((ShowMetadata) this.instance).getIsMusicAndTalk();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public String getLanguage() {
            return ((ShowMetadata) this.instance).getLanguage();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public gva getLanguageBytes() {
            return ((ShowMetadata) this.instance).getLanguageBytes();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public String getLink() {
            return ((ShowMetadata) this.instance).getLink();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public gva getLinkBytes() {
            return ((ShowMetadata) this.instance).getLinkBytes();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public int getMediaTypeEnum() {
            return ((ShowMetadata) this.instance).getMediaTypeEnum();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public String getName() {
            return ((ShowMetadata) this.instance).getName();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public gva getNameBytes() {
            return ((ShowMetadata) this.instance).getNameBytes();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public int getNumEpisodes() {
            return ((ShowMetadata) this.instance).getNumEpisodes();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public int getPopularity() {
            return ((ShowMetadata) this.instance).getPopularity();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public String getPublisher() {
            return ((ShowMetadata) this.instance).getPublisher();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public gva getPublisherBytes() {
            return ((ShowMetadata) this.instance).getPublisherBytes();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public String getTrailerUri() {
            return ((ShowMetadata) this.instance).getTrailerUri();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public gva getTrailerUriBytes() {
            return ((ShowMetadata) this.instance).getTrailerUriBytes();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasConsumptionOrder() {
            return ((ShowMetadata) this.instance).hasConsumptionOrder();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasCovers() {
            return ((ShowMetadata) this.instance).hasCovers();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasDescription() {
            return ((ShowMetadata) this.instance).hasDescription();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasIsBook() {
            return ((ShowMetadata) this.instance).hasIsBook();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasIsCreatorChannel() {
            return ((ShowMetadata) this.instance).hasIsCreatorChannel();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasIsExplicit() {
            return ((ShowMetadata) this.instance).hasIsExplicit();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasIsMusicAndTalk() {
            return ((ShowMetadata) this.instance).hasIsMusicAndTalk();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasLanguage() {
            return ((ShowMetadata) this.instance).hasLanguage();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasLink() {
            return ((ShowMetadata) this.instance).hasLink();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasMediaTypeEnum() {
            return ((ShowMetadata) this.instance).hasMediaTypeEnum();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasName() {
            return ((ShowMetadata) this.instance).hasName();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasNumEpisodes() {
            return ((ShowMetadata) this.instance).hasNumEpisodes();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasPopularity() {
            return ((ShowMetadata) this.instance).hasPopularity();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasPublisher() {
            return ((ShowMetadata) this.instance).hasPublisher();
        }

        @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
        public boolean hasTrailerUri() {
            return ((ShowMetadata) this.instance).hasTrailerUri();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeCovers(ImageGroup imageGroup) {
            copyOnWrite();
            ((ShowMetadata) this.instance).mergeCovers(imageGroup);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder removeExtension(int i) {
            copyOnWrite();
            ((ShowMetadata) this.instance).removeExtension(i);
            return this;
        }

        public Builder removeFormatListAttributes(int i) {
            copyOnWrite();
            ((ShowMetadata) this.instance).removeFormatListAttributes(i);
            return this;
        }

        public Builder setConsumptionOrder(String str) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setConsumptionOrder(str);
            return this;
        }

        public Builder setConsumptionOrderBytes(gva gvaVar) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setConsumptionOrderBytes(gvaVar);
            return this;
        }

        public Builder setCopyright(int i, String str) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setCopyright(i, str);
            return this;
        }

        public Builder setCovers(ImageGroup imageGroup) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setCovers(imageGroup);
            return this;
        }

        public Builder setDescription(String str) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setDescription(str);
            return this;
        }

        public Builder setDescriptionBytes(gva gvaVar) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setDescriptionBytes(gvaVar);
            return this;
        }

        public Builder setExtension(int i, Extension extension) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setExtension(i, extension);
            return this;
        }

        public Builder setFormatListAttributes(int i, ShowListAttribute showListAttribute) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setFormatListAttributes(i, showListAttribute);
            return this;
        }

        public Builder setIsBook(boolean z) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setIsBook(z);
            return this;
        }

        public Builder setIsCreatorChannel(boolean z) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setIsCreatorChannel(z);
            return this;
        }

        public Builder setIsExplicit(boolean z) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setIsExplicit(z);
            return this;
        }

        public Builder setIsMusicAndTalk(boolean z) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setIsMusicAndTalk(z);
            return this;
        }

        public Builder setLanguage(String str) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setLanguage(str);
            return this;
        }

        public Builder setLanguageBytes(gva gvaVar) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setLanguageBytes(gvaVar);
            return this;
        }

        public Builder setLink(String str) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setLink(str);
            return this;
        }

        public Builder setLinkBytes(gva gvaVar) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setLinkBytes(gvaVar);
            return this;
        }

        public Builder setMediaTypeEnum(int i) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setMediaTypeEnum(i);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(gva gvaVar) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setNameBytes(gvaVar);
            return this;
        }

        public Builder setNumEpisodes(int i) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setNumEpisodes(i);
            return this;
        }

        public Builder setPopularity(int i) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setPopularity(i);
            return this;
        }

        public Builder setPublisher(String str) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setPublisher(str);
            return this;
        }

        public Builder setPublisherBytes(gva gvaVar) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setPublisherBytes(gvaVar);
            return this;
        }

        public Builder setTrailerUri(String str) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setTrailerUri(str);
            return this;
        }

        public Builder setTrailerUriBytes(gva gvaVar) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setTrailerUriBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(ShowMetadata.DEFAULT_INSTANCE);
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

        public Builder addExtension(int i, Extension extension) {
            copyOnWrite();
            ((ShowMetadata) this.instance).addExtension(i, extension);
            return this;
        }

        public Builder addFormatListAttributes(int i, ShowListAttribute showListAttribute) {
            copyOnWrite();
            ((ShowMetadata) this.instance).addFormatListAttributes(i, showListAttribute);
            return this;
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

        public Builder setCovers(ImageGroup.Builder builder) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setCovers((ImageGroup) builder.build());
            return this;
        }

        public Builder setExtension(int i, Extension.Builder builder) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setExtension(i, (Extension) builder.build());
            return this;
        }

        public Builder setFormatListAttributes(int i, ShowListAttribute.Builder builder) {
            copyOnWrite();
            ((ShowMetadata) this.instance).setFormatListAttributes(i, (ShowListAttribute) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        public Builder addExtension(Extension.Builder builder) {
            copyOnWrite();
            ((ShowMetadata) this.instance).addExtension((Extension) builder.build());
            return this;
        }

        public Builder addFormatListAttributes(ShowListAttribute.Builder builder) {
            copyOnWrite();
            ((ShowMetadata) this.instance).addFormatListAttributes((ShowListAttribute) builder.build());
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
            ((ShowMetadata) this.instance).addExtension(i, (Extension) builder.build());
            return this;
        }

        public Builder addFormatListAttributes(int i, ShowListAttribute.Builder builder) {
            copyOnWrite();
            ((ShowMetadata) this.instance).addFormatListAttributes(i, (ShowListAttribute) builder.build());
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

    static {
        ShowMetadata showMetadata = new ShowMetadata();
        DEFAULT_INSTANCE = showMetadata;
        AbstractC0269h.registerDefaultInstance(ShowMetadata.class, showMetadata);
    }

    private ShowMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCopyright(Iterable<String> iterable) {
        ensureCopyrightIsMutable();
        AbstractC2118m8.addAll(iterable, this.copyright_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtension(Iterable<? extends Extension> iterable) {
        ensureExtensionIsMutable();
        AbstractC2118m8.addAll(iterable, this.extension_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFormatListAttributes(Iterable<? extends ShowListAttribute> iterable) {
        ensureFormatListAttributesIsMutable();
        AbstractC2118m8.addAll(iterable, this.formatListAttributes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCopyright(String str) {
        str.getClass();
        ensureCopyrightIsMutable();
        this.copyright_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCopyrightBytes(gva gvaVar) {
        ensureCopyrightIsMutable();
        this.copyright_.add(gvaVar.m45892u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtension(Extension extension) {
        extension.getClass();
        ensureExtensionIsMutable();
        this.extension_.add(extension);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFormatListAttributes(ShowListAttribute showListAttribute) {
        showListAttribute.getClass();
        ensureFormatListAttributesIsMutable();
        this.formatListAttributes_.add(showListAttribute);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConsumptionOrder() {
        this.bitField0_ &= -513;
        this.consumptionOrder_ = getDefaultInstance().getConsumptionOrder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCopyright() {
        this.copyright_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCovers() {
        this.covers_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.bitField0_ &= -5;
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtension() {
        this.extension_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFormatListAttributes() {
        this.formatListAttributes_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsBook() {
        this.bitField0_ &= -8193;
        this.isBook_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCreatorChannel() {
        this.bitField0_ &= -16385;
        this.isCreatorChannel_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsExplicit() {
        this.bitField0_ &= -65;
        this.isExplicit_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsMusicAndTalk() {
        this.bitField0_ &= -4097;
        this.isMusicAndTalk_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguage() {
        this.bitField0_ &= -33;
        this.language_ = getDefaultInstance().getLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.bitField0_ &= -2;
        this.link_ = getDefaultInstance().getLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMediaTypeEnum() {
        this.bitField0_ &= -1025;
        this.mediaTypeEnum_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -3;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumEpisodes() {
        this.bitField0_ &= -257;
        this.numEpisodes_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopularity() {
        this.bitField0_ &= -9;
        this.popularity_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublisher() {
        this.bitField0_ &= -17;
        this.publisher_ = getDefaultInstance().getPublisher();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrailerUri() {
        this.bitField0_ &= -2049;
        this.trailerUri_ = getDefaultInstance().getTrailerUri();
    }

    private void ensureCopyrightIsMutable() {
        ae50 ae50Var = this.copyright_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.copyright_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    private void ensureExtensionIsMutable() {
        ae50 ae50Var = this.extension_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.extension_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    private void ensureFormatListAttributesIsMutable() {
        ae50 ae50Var = this.formatListAttributes_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.formatListAttributes_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    public static ShowMetadata getDefaultInstance() {
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
        this.bitField0_ |= 128;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ShowMetadata parseDelimitedFrom(InputStream inputStream) {
        return (ShowMetadata) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowMetadata parseFrom(ByteBuffer byteBuffer) {
        return (ShowMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void removeFormatListAttributes(int i) {
        ensureFormatListAttributesIsMutable();
        this.formatListAttributes_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConsumptionOrder(String str) {
        str.getClass();
        this.bitField0_ |= 512;
        this.consumptionOrder_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConsumptionOrderBytes(gva gvaVar) {
        this.consumptionOrder_ = gvaVar.m45892u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCopyright(int i, String str) {
        str.getClass();
        ensureCopyrightIsMutable();
        this.copyright_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCovers(ImageGroup imageGroup) {
        imageGroup.getClass();
        this.covers_ = imageGroup;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(gva gvaVar) {
        this.description_ = gvaVar.m45892u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtension(int i, Extension extension) {
        extension.getClass();
        ensureExtensionIsMutable();
        this.extension_.set(i, extension);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFormatListAttributes(int i, ShowListAttribute showListAttribute) {
        showListAttribute.getClass();
        ensureFormatListAttributesIsMutable();
        this.formatListAttributes_.set(i, showListAttribute);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsBook(boolean z) {
        this.bitField0_ |= 8192;
        this.isBook_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCreatorChannel(boolean z) {
        this.bitField0_ |= 16384;
        this.isCreatorChannel_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsExplicit(boolean z) {
        this.bitField0_ |= 64;
        this.isExplicit_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsMusicAndTalk(boolean z) {
        this.bitField0_ |= 4096;
        this.isMusicAndTalk_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguage(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.language_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageBytes(gva gvaVar) {
        this.language_ = gvaVar.m45892u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLink(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.link_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkBytes(gva gvaVar) {
        this.link_ = gvaVar.m45892u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaTypeEnum(int i) {
        this.bitField0_ |= 1024;
        this.mediaTypeEnum_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(gva gvaVar) {
        this.name_ = gvaVar.m45892u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumEpisodes(int i) {
        this.bitField0_ |= 256;
        this.numEpisodes_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopularity(int i) {
        this.bitField0_ |= 8;
        this.popularity_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublisher(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.publisher_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublisherBytes(gva gvaVar) {
        this.publisher_ = gvaVar.m45892u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrailerUri(String str) {
        str.getClass();
        this.bitField0_ |= 2048;
        this.trailerUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrailerUriBytes(gva gvaVar) {
        this.trailerUri_ = gvaVar.m45892u();
        this.bitField0_ |= 2048;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဋ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဉ\u0007\tဋ\b\nဈ\t\u000bင\n\f\u001a\rဈ\u000b\u000eဇ\f\u000f\u001b\u0010ဇ\r\u0011ဇ\u000e\u0012\u001b", new Object[]{"bitField0_", "link_", "name_", "description_", "popularity_", "publisher_", "language_", "isExplicit_", "covers_", "numEpisodes_", "consumptionOrder_", "mediaTypeEnum_", "copyright_", "trailerUri_", "isMusicAndTalk_", "extension_", Extension.class, "isBook_", "isCreatorChannel_", "formatListAttributes_", ShowListAttribute.class});
        }
        if (iOrdinal == 3) {
            return new ShowMetadata();
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
        synchronized (ShowMetadata.class) {
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

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public String getConsumptionOrder() {
        return this.consumptionOrder_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public gva getConsumptionOrderBytes() {
        return gva.m45888f(this.consumptionOrder_);
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public String getCopyright(int i) {
        return (String) this.copyright_.get(i);
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public gva getCopyrightBytes(int i) {
        return gva.m45888f((String) this.copyright_.get(i));
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public int getCopyrightCount() {
        return this.copyright_.size();
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public List<String> getCopyrightList() {
        return this.copyright_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public ImageGroup getCovers() {
        ImageGroup imageGroup = this.covers_;
        return imageGroup == null ? ImageGroup.getDefaultInstance() : imageGroup;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public String getDescription() {
        return this.description_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public gva getDescriptionBytes() {
        return gva.m45888f(this.description_);
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public Extension getExtension(int i) {
        return (Extension) this.extension_.get(i);
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public int getExtensionCount() {
        return this.extension_.size();
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public List<Extension> getExtensionList() {
        return this.extension_;
    }

    public ExtensionOrBuilder getExtensionOrBuilder(int i) {
        return (ExtensionOrBuilder) this.extension_.get(i);
    }

    public List<? extends ExtensionOrBuilder> getExtensionOrBuilderList() {
        return this.extension_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public ShowListAttribute getFormatListAttributes(int i) {
        return (ShowListAttribute) this.formatListAttributes_.get(i);
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public int getFormatListAttributesCount() {
        return this.formatListAttributes_.size();
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public List<ShowListAttribute> getFormatListAttributesList() {
        return this.formatListAttributes_;
    }

    public ShowListAttributeOrBuilder getFormatListAttributesOrBuilder(int i) {
        return (ShowListAttributeOrBuilder) this.formatListAttributes_.get(i);
    }

    public List<? extends ShowListAttributeOrBuilder> getFormatListAttributesOrBuilderList() {
        return this.formatListAttributes_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean getIsBook() {
        return this.isBook_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean getIsCreatorChannel() {
        return this.isCreatorChannel_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean getIsExplicit() {
        return this.isExplicit_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean getIsMusicAndTalk() {
        return this.isMusicAndTalk_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public String getLanguage() {
        return this.language_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public gva getLanguageBytes() {
        return gva.m45888f(this.language_);
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public String getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public gva getLinkBytes() {
        return gva.m45888f(this.link_);
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public int getMediaTypeEnum() {
        return this.mediaTypeEnum_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public gva getNameBytes() {
        return gva.m45888f(this.name_);
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public int getNumEpisodes() {
        return this.numEpisodes_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public int getPopularity() {
        return this.popularity_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public String getPublisher() {
        return this.publisher_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public gva getPublisherBytes() {
        return gva.m45888f(this.publisher_);
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public String getTrailerUri() {
        return this.trailerUri_;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public gva getTrailerUriBytes() {
        return gva.m45888f(this.trailerUri_);
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasConsumptionOrder() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasCovers() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasDescription() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasIsBook() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasIsCreatorChannel() {
        return (this.bitField0_ & 16384) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasIsExplicit() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasIsMusicAndTalk() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasLanguage() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasLink() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasMediaTypeEnum() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasNumEpisodes() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasPopularity() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasPublisher() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.spotify.cosmos.util.proto.ShowMetadataOrBuilder
    public boolean hasTrailerUri() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ShowMetadata showMetadata) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(showMetadata);
    }

    public static ShowMetadata parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ShowMetadata) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ShowMetadata parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ShowMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ShowMetadata parseFrom(gva gvaVar) {
        return (ShowMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtension(int i, Extension extension) {
        extension.getClass();
        ensureExtensionIsMutable();
        this.extension_.add(i, extension);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFormatListAttributes(int i, ShowListAttribute showListAttribute) {
        showListAttribute.getClass();
        ensureFormatListAttributesIsMutable();
        this.formatListAttributes_.add(i, showListAttribute);
    }

    public static ShowMetadata parseFrom(gva gvaVar, aux auxVar) {
        return (ShowMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ShowMetadata parseFrom(byte[] bArr) {
        return (ShowMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ShowMetadata parseFrom(byte[] bArr, aux auxVar) {
        return (ShowMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ShowMetadata parseFrom(InputStream inputStream) {
        return (ShowMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowMetadata parseFrom(InputStream inputStream, aux auxVar) {
        return (ShowMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ShowMetadata parseFrom(owe oweVar) {
        return (ShowMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ShowMetadata parseFrom(owe oweVar, aux auxVar) {
        return (ShowMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
