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
public final class ShowDecorationPolicy extends AbstractC0269h implements ShowDecorationPolicyOrBuilder {
    public static final int CONSUMPTION_ORDER_FIELD_NUMBER = 10;
    public static final int COPYRIGHTS_FIELD_NUMBER = 12;
    public static final int COVERS_FIELD_NUMBER = 8;
    private static final ShowDecorationPolicy DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int EXTENSION_FIELD_NUMBER = 16;
    public static final int FORMAT_LIST_ATTRIBUTES_FIELD_NUMBER = 19;
    public static final int IS_BOOK_FIELD_NUMBER = 17;
    public static final int IS_CREATOR_CHANNEL_FIELD_NUMBER = 18;
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
    private static final vd50 extension_converter_ = new vd50() { // from class: com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy.1
        @Override // p204p.vd50
        public ntx convert(int i) {
            ntx ntxVarM65644b = ntx.m65644b(i);
            return ntxVarM65644b == null ? ntx.UNRECOGNIZED : ntxVarM65644b;
        }
    };
    private boolean consumptionOrder_;
    private boolean copyrights_;
    private boolean covers_;
    private boolean description_;
    private int extensionMemoizedSerializedSize;
    private ud50 extension_ = AbstractC0269h.emptyIntList();
    private boolean formatListAttributes_;
    private boolean isBook_;
    private boolean isCreatorChannel_;
    private boolean isExplicit_;
    private boolean isMusicAndTalk_;
    private boolean language_;
    private boolean link_;
    private boolean mediaTypeEnum_;
    private boolean name_;
    private boolean numEpisodes_;
    private boolean popularity_;
    private boolean publisher_;
    private boolean trailerUri_;

    /* JADX INFO: renamed from: com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy$2 */
    /* JADX INFO: loaded from: classes6.dex */
    public static /* synthetic */ class C06472 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3499xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3499xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3499xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3499xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3499xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3499xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3499xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3499xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ShowDecorationPolicyOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addAllExtension(Iterable<? extends ntx> iterable) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).addAllExtension(iterable);
            return this;
        }

        public Builder addAllExtensionValue(Iterable<Integer> iterable) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).addAllExtensionValue(iterable);
            return this;
        }

        public Builder addExtension(ntx ntxVar) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).addExtension(ntxVar);
            return this;
        }

        public Builder addExtensionValue(int i) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).addExtensionValue(i);
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
            ((ShowDecorationPolicy) this.instance).clearConsumptionOrder();
            return this;
        }

        public Builder clearCopyrights() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearCopyrights();
            return this;
        }

        public Builder clearCovers() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearCovers();
            return this;
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearDescription();
            return this;
        }

        public Builder clearExtension() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearExtension();
            return this;
        }

        public Builder clearFormatListAttributes() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearFormatListAttributes();
            return this;
        }

        public Builder clearIsBook() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearIsBook();
            return this;
        }

        public Builder clearIsCreatorChannel() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearIsCreatorChannel();
            return this;
        }

        public Builder clearIsExplicit() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearIsExplicit();
            return this;
        }

        public Builder clearIsMusicAndTalk() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearIsMusicAndTalk();
            return this;
        }

        public Builder clearLanguage() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearLanguage();
            return this;
        }

        public Builder clearLink() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearLink();
            return this;
        }

        public Builder clearMediaTypeEnum() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearMediaTypeEnum();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearName();
            return this;
        }

        public Builder clearNumEpisodes() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearNumEpisodes();
            return this;
        }

        public Builder clearPopularity() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearPopularity();
            return this;
        }

        public Builder clearPublisher() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearPublisher();
            return this;
        }

        public Builder clearTrailerUri() {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).clearTrailerUri();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
        public boolean getConsumptionOrder() {
            return ((ShowDecorationPolicy) this.instance).getConsumptionOrder();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
        public boolean getCopyrights() {
            return ((ShowDecorationPolicy) this.instance).getCopyrights();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
        public boolean getCovers() {
            return ((ShowDecorationPolicy) this.instance).getCovers();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
        public boolean getDescription() {
            return ((ShowDecorationPolicy) this.instance).getDescription();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
        public ntx getExtension(int i) {
            return ((ShowDecorationPolicy) this.instance).getExtension(i);
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
        public int getExtensionCount() {
            return ((ShowDecorationPolicy) this.instance).getExtensionCount();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
        public List<ntx> getExtensionList() {
            return ((ShowDecorationPolicy) this.instance).getExtensionList();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
        public int getExtensionValue(int i) {
            return ((ShowDecorationPolicy) this.instance).getExtensionValue(i);
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
        public List<Integer> getExtensionValueList() {
            return Collections.unmodifiableList(((ShowDecorationPolicy) this.instance).getExtensionValueList());
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
        public boolean getFormatListAttributes() {
            return ((ShowDecorationPolicy) this.instance).getFormatListAttributes();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
        public boolean getIsBook() {
            return ((ShowDecorationPolicy) this.instance).getIsBook();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
        public boolean getIsCreatorChannel() {
            return ((ShowDecorationPolicy) this.instance).getIsCreatorChannel();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
        public boolean getIsExplicit() {
            return ((ShowDecorationPolicy) this.instance).getIsExplicit();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
        public boolean getIsMusicAndTalk() {
            return ((ShowDecorationPolicy) this.instance).getIsMusicAndTalk();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
        public boolean getLanguage() {
            return ((ShowDecorationPolicy) this.instance).getLanguage();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
        public boolean getLink() {
            return ((ShowDecorationPolicy) this.instance).getLink();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
        public boolean getMediaTypeEnum() {
            return ((ShowDecorationPolicy) this.instance).getMediaTypeEnum();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
        public boolean getName() {
            return ((ShowDecorationPolicy) this.instance).getName();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
        public boolean getNumEpisodes() {
            return ((ShowDecorationPolicy) this.instance).getNumEpisodes();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
        public boolean getPopularity() {
            return ((ShowDecorationPolicy) this.instance).getPopularity();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
        public boolean getPublisher() {
            return ((ShowDecorationPolicy) this.instance).getPublisher();
        }

        @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
        public boolean getTrailerUri() {
            return ((ShowDecorationPolicy) this.instance).getTrailerUri();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setConsumptionOrder(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setConsumptionOrder(z);
            return this;
        }

        public Builder setCopyrights(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setCopyrights(z);
            return this;
        }

        public Builder setCovers(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setCovers(z);
            return this;
        }

        public Builder setDescription(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setDescription(z);
            return this;
        }

        public Builder setExtension(int i, ntx ntxVar) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setExtension(i, ntxVar);
            return this;
        }

        public Builder setExtensionValue(int i, int i2) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setExtensionValue(i, i2);
            return this;
        }

        public Builder setFormatListAttributes(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setFormatListAttributes(z);
            return this;
        }

        public Builder setIsBook(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setIsBook(z);
            return this;
        }

        public Builder setIsCreatorChannel(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setIsCreatorChannel(z);
            return this;
        }

        public Builder setIsExplicit(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setIsExplicit(z);
            return this;
        }

        public Builder setIsMusicAndTalk(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setIsMusicAndTalk(z);
            return this;
        }

        public Builder setLanguage(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setLanguage(z);
            return this;
        }

        public Builder setLink(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setLink(z);
            return this;
        }

        public Builder setMediaTypeEnum(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setMediaTypeEnum(z);
            return this;
        }

        public Builder setName(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setName(z);
            return this;
        }

        public Builder setNumEpisodes(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setNumEpisodes(z);
            return this;
        }

        public Builder setPopularity(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setPopularity(z);
            return this;
        }

        public Builder setPublisher(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setPublisher(z);
            return this;
        }

        public Builder setTrailerUri(boolean z) {
            copyOnWrite();
            ((ShowDecorationPolicy) this.instance).setTrailerUri(z);
            return this;
        }

        private Builder() {
            super(ShowDecorationPolicy.DEFAULT_INSTANCE);
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
        ShowDecorationPolicy showDecorationPolicy = new ShowDecorationPolicy();
        DEFAULT_INSTANCE = showDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(ShowDecorationPolicy.class, showDecorationPolicy);
    }

    private ShowDecorationPolicy() {
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
    public void clearConsumptionOrder() {
        this.consumptionOrder_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCopyrights() {
        this.copyrights_ = false;
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
    public void clearFormatListAttributes() {
        this.formatListAttributes_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsBook() {
        this.isBook_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCreatorChannel() {
        this.isCreatorChannel_ = false;
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
    public void clearLanguage() {
        this.language_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLink() {
        this.link_ = false;
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
    public void clearNumEpisodes() {
        this.numEpisodes_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopularity() {
        this.popularity_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublisher() {
        this.publisher_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrailerUri() {
        this.trailerUri_ = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureExtensionIsMutable() {
        ud50 ud50Var = this.extension_;
        if (((AbstractC1733c9) ud50Var).f35342a) {
            return;
        }
        this.extension_ = AbstractC0269h.mutableCopy(ud50Var);
    }

    public static ShowDecorationPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ShowDecorationPolicy parseDelimitedFrom(InputStream inputStream) {
        return (ShowDecorationPolicy) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowDecorationPolicy parseFrom(ByteBuffer byteBuffer) {
        return (ShowDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConsumptionOrder(boolean z) {
        this.consumptionOrder_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCopyrights(boolean z) {
        this.copyrights_ = z;
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
    public void setFormatListAttributes(boolean z) {
        this.formatListAttributes_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsBook(boolean z) {
        this.isBook_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCreatorChannel(boolean z) {
        this.isCreatorChannel_ = z;
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
    public void setLanguage(boolean z) {
        this.language_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLink(boolean z) {
        this.link_ = z;
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
    public void setNumEpisodes(boolean z) {
        this.numEpisodes_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopularity(boolean z) {
        this.popularity_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublisher(boolean z) {
        this.publisher_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrailerUri(boolean z) {
        this.trailerUri_ = z;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0012\u0000\u0000\u0001\u0013\u0012\u0000\u0001\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007\u000b\u0007\f\u0007\r\u0007\u000e\u0007\u0010,\u0011\u0007\u0012\u0007\u0013\u0007", new Object[]{"link_", "name_", "description_", "popularity_", "publisher_", "language_", "isExplicit_", "covers_", "numEpisodes_", "consumptionOrder_", "mediaTypeEnum_", "copyrights_", "trailerUri_", "isMusicAndTalk_", "extension_", "isBook_", "isCreatorChannel_", "formatListAttributes_"});
        }
        if (iOrdinal == 3) {
            return new ShowDecorationPolicy();
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
        synchronized (ShowDecorationPolicy.class) {
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

    @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
    public boolean getConsumptionOrder() {
        return this.consumptionOrder_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
    public boolean getCopyrights() {
        return this.copyrights_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
    public boolean getCovers() {
        return this.covers_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
    public boolean getDescription() {
        return this.description_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
    public ntx getExtension(int i) {
        ntx ntxVarM65644b = ntx.m65644b(((n350) this.extension_).m63583e(i));
        return ntxVarM65644b == null ? ntx.UNRECOGNIZED : ntxVarM65644b;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
    public int getExtensionCount() {
        return ((n350) this.extension_).size();
    }

    @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
    public List<ntx> getExtensionList() {
        return new wd50(this.extension_, extension_converter_);
    }

    @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
    public int getExtensionValue(int i) {
        return ((n350) this.extension_).m63583e(i);
    }

    @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
    public List<Integer> getExtensionValueList() {
        return this.extension_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
    public boolean getFormatListAttributes() {
        return this.formatListAttributes_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
    public boolean getIsBook() {
        return this.isBook_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
    public boolean getIsCreatorChannel() {
        return this.isCreatorChannel_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
    public boolean getIsExplicit() {
        return this.isExplicit_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
    public boolean getIsMusicAndTalk() {
        return this.isMusicAndTalk_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
    public boolean getLanguage() {
        return this.language_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
    public boolean getLink() {
        return this.link_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
    public boolean getMediaTypeEnum() {
        return this.mediaTypeEnum_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
    public boolean getName() {
        return this.name_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
    public boolean getNumEpisodes() {
        return this.numEpisodes_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
    public boolean getPopularity() {
        return this.popularity_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
    public boolean getPublisher() {
        return this.publisher_;
    }

    @Override // com.spotify.cosmos.util.policy.proto.ShowDecorationPolicyOrBuilder
    public boolean getTrailerUri() {
        return this.trailerUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ShowDecorationPolicy showDecorationPolicy) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(showDecorationPolicy);
    }

    public static ShowDecorationPolicy parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ShowDecorationPolicy) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ShowDecorationPolicy parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ShowDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ShowDecorationPolicy parseFrom(gva gvaVar) {
        return (ShowDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static ShowDecorationPolicy parseFrom(gva gvaVar, aux auxVar) {
        return (ShowDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ShowDecorationPolicy parseFrom(byte[] bArr) {
        return (ShowDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ShowDecorationPolicy parseFrom(byte[] bArr, aux auxVar) {
        return (ShowDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ShowDecorationPolicy parseFrom(InputStream inputStream) {
        return (ShowDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShowDecorationPolicy parseFrom(InputStream inputStream, aux auxVar) {
        return (ShowDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ShowDecorationPolicy parseFrom(owe oweVar) {
        return (ShowDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ShowDecorationPolicy parseFrom(owe oweVar, aux auxVar) {
        return (ShowDecorationPolicy) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
