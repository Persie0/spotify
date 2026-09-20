package com.spotify.p060dj.interactionmanager.p061v0;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p204p.AbstractC1733c9;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.aux;
import p204p.gva;
import p204p.ihc0;
import p204p.jyd1;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.vgc0;
import p204p.vyd1;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ContextPage extends AbstractC0269h implements ContextPageOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final ContextPage DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int METADATA_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private ihc0 metadata_ = ihc0.f102235b;
    private String id_ = "";
    private ae50 content_ = AbstractC0269h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.dj.interactionmanager.v0.ContextPage$1 */
    public static /* synthetic */ class C06891 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3569xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3569xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3569xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3569xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3569xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3569xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3569xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3569xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ContextPageOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public final Builder addAllContent(Iterable<? extends ContentElement> iterable) {
            copyOnWrite();
            ((ContextPage) this.instance).addAllContent(iterable);
            return this;
        }

        public final Builder addContent(ContentElement contentElement) {
            copyOnWrite();
            ((ContextPage) this.instance).addContent(contentElement);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public final /* bridge */ /* synthetic */ pre0 build() {
            return build();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public final /* bridge */ /* synthetic */ pre0 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clear */
        public final /* bridge */ /* synthetic */ ore0 mo98325clear() {
            return mo98325clear();
        }

        public final Builder clearContent() {
            copyOnWrite();
            ((ContextPage) this.instance).clearContent();
            return this;
        }

        public final Builder clearId() {
            copyOnWrite();
            ((ContextPage) this.instance).clearId();
            return this;
        }

        public final Builder clearMetadata() {
            copyOnWrite();
            ContextPage.m9330s((ContextPage) this.instance).clear();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public final /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ContextPageOrBuilder
        public final boolean containsMetadata(String str) {
            str.getClass();
            return ((ContextPage) this.instance).getMetadataMap().containsKey(str);
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ContextPageOrBuilder
        public final ContentElement getContent(int i) {
            return ((ContextPage) this.instance).getContent(i);
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ContextPageOrBuilder
        public final int getContentCount() {
            return ((ContextPage) this.instance).getContentCount();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ContextPageOrBuilder
        public final List<ContentElement> getContentList() {
            return Collections.unmodifiableList(((ContextPage) this.instance).getContentList());
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ContextPageOrBuilder
        public final String getId() {
            return ((ContextPage) this.instance).getId();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ContextPageOrBuilder
        public final gva getIdBytes() {
            return ((ContextPage) this.instance).getIdBytes();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ContextPageOrBuilder
        @Deprecated
        public final Map<String, String> getMetadata() {
            return getMetadataMap();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ContextPageOrBuilder
        public final int getMetadataCount() {
            return ((ContextPage) this.instance).getMetadataMap().size();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ContextPageOrBuilder
        public final Map<String, String> getMetadataMap() {
            return Collections.unmodifiableMap(((ContextPage) this.instance).getMetadataMap());
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ContextPageOrBuilder
        public final String getMetadataOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> metadataMap = ((ContextPage) this.instance).getMetadataMap();
            return metadataMap.containsKey(str) ? metadataMap.get(str) : str2;
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ContextPageOrBuilder
        public final String getMetadataOrThrow(String str) {
            str.getClass();
            Map<String, String> metadataMap = ((ContextPage) this.instance).getMetadataMap();
            if (metadataMap.containsKey(str)) {
                return metadataMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public final /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public final Builder putAllMetadata(Map<String, String> map) {
            copyOnWrite();
            ContextPage.m9330s((ContextPage) this.instance).putAll(map);
            return this;
        }

        public final Builder putMetadata(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ContextPage.m9330s((ContextPage) this.instance).put(str, str2);
            return this;
        }

        public final Builder removeContent(int i) {
            copyOnWrite();
            ((ContextPage) this.instance).removeContent(i);
            return this;
        }

        public final Builder removeMetadata(String str) {
            str.getClass();
            copyOnWrite();
            ContextPage.m9330s((ContextPage) this.instance).remove(str);
            return this;
        }

        public final Builder setContent(int i, ContentElement contentElement) {
            copyOnWrite();
            ((ContextPage) this.instance).setContent(i, contentElement);
            return this;
        }

        public final Builder setId(String str) {
            copyOnWrite();
            ((ContextPage) this.instance).setId(str);
            return this;
        }

        public final Builder setIdBytes(gva gvaVar) {
            copyOnWrite();
            ((ContextPage) this.instance).setIdBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(ContextPage.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        public final Builder addContent(int i, ContentElement contentElement) {
            copyOnWrite();
            ((ContextPage) this.instance).addContent(i, contentElement);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public final /* bridge */ /* synthetic */ ore0 mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        public final Builder setContent(int i, ContentElement.Builder builder) {
            copyOnWrite();
            ((ContextPage) this.instance).setContent(i, (ContentElement) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        public final Builder addContent(ContentElement.Builder builder) {
            copyOnWrite();
            ((ContextPage) this.instance).addContent((ContentElement) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
            return super.mo98372mergeFrom(inputStream, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
            return super.mo98373mergeFrom(gvaVar);
        }

        public final Builder addContent(int i, ContentElement.Builder builder) {
            copyOnWrite();
            ((ContextPage) this.instance).addContent(i, (ContentElement) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
            return super.mo98374mergeFrom(gvaVar, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
            return super.mo98375mergeFrom(oweVar);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public final /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        @Override // p204p.AbstractC2081l8, p204p.ore0
        public final /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
            return super.mergeFrom(pre0Var);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
            return super.mo98376mergeFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
            return super.mo98377mergeFrom(bArr, auxVar);
        }
    }

    public static final class MetadataDefaultEntryHolder {
        static final vgc0 defaultEntry;

        static {
            jyd1 jyd1Var = vyd1.f246078g;
            defaultEntry = new vgc0(jyd1Var, "", jyd1Var, "");
        }

        private MetadataDefaultEntryHolder() {
        }
    }

    static {
        ContextPage contextPage = new ContextPage();
        DEFAULT_INSTANCE = contextPage;
        AbstractC0269h.registerDefaultInstance(ContextPage.class, contextPage);
    }

    private ContextPage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllContent(Iterable<? extends ContentElement> iterable) {
        ensureContentIsMutable();
        AbstractC2118m8.addAll(iterable, this.content_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addContent(ContentElement contentElement) {
        contentElement.getClass();
        ensureContentIsMutable();
        this.content_.add(contentElement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = DEFAULT_INSTANCE.id_;
    }

    private void ensureContentIsMutable() {
        ae50 ae50Var = this.content_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.content_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    public static ContextPage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map<String, String> getMutableMetadataMap() {
        return internalGetMutableMetadata();
    }

    private ihc0 internalGetMetadata() {
        return this.metadata_;
    }

    private ihc0 internalGetMutableMetadata() {
        ihc0 ihc0Var = this.metadata_;
        if (!ihc0Var.f102236a) {
            this.metadata_ = ihc0Var.m50613h();
        }
        return this.metadata_;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ContextPage parseDelimitedFrom(InputStream inputStream) {
        return (ContextPage) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContextPage parseFrom(ByteBuffer byteBuffer) {
        return (ContextPage) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeContent(int i) {
        ensureContentIsMutable();
        this.content_.remove(i);
    }

    /* JADX INFO: renamed from: s */
    public static ihc0 m9330s(ContextPage contextPage) {
        return contextPage.internalGetMutableMetadata();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(int i, ContentElement contentElement) {
        contentElement.getClass();
        ensureContentIsMutable();
        this.content_.set(i, contentElement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.id_ = gvaVar.m45892u();
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ContextPageOrBuilder
    public final boolean containsMetadata(String str) {
        str.getClass();
        return this.metadata_.containsKey(str);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0001\u0000\u0001Ȉ\u0002\u001b\u00032", new Object[]{"id_", "content_", ContentElement.class, "metadata_", MetadataDefaultEntryHolder.defaultEntry});
        }
        if (iOrdinal == 3) {
            return new ContextPage();
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
        synchronized (ContextPage.class) {
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

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ContextPageOrBuilder
    public final ContentElement getContent(int i) {
        return (ContentElement) this.content_.get(i);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ContextPageOrBuilder
    public final int getContentCount() {
        return this.content_.size();
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ContextPageOrBuilder
    public final List<ContentElement> getContentList() {
        return this.content_;
    }

    public final ContentElementOrBuilder getContentOrBuilder(int i) {
        return (ContentElementOrBuilder) this.content_.get(i);
    }

    public final List<? extends ContentElementOrBuilder> getContentOrBuilderList() {
        return this.content_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ContextPageOrBuilder
    public final String getId() {
        return this.id_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ContextPageOrBuilder
    public final gva getIdBytes() {
        return gva.m45888f(this.id_);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ContextPageOrBuilder
    @Deprecated
    public final Map<String, String> getMetadata() {
        return Collections.unmodifiableMap(this.metadata_);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ContextPageOrBuilder
    public final int getMetadataCount() {
        return this.metadata_.size();
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ContextPageOrBuilder
    public final Map<String, String> getMetadataMap() {
        return Collections.unmodifiableMap(this.metadata_);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ContextPageOrBuilder
    public final String getMetadataOrDefault(String str, String str2) {
        str.getClass();
        ihc0 ihc0Var = this.metadata_;
        return ihc0Var.containsKey(str) ? (String) ihc0Var.get(str) : str2;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ContextPageOrBuilder
    public final String getMetadataOrThrow(String str) {
        str.getClass();
        ihc0 ihc0Var = this.metadata_;
        if (ihc0Var.containsKey(str)) {
            return (String) ihc0Var.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ContextPage contextPage) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(contextPage);
    }

    public static ContextPage parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ContextPage) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ContextPage parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ContextPage) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ContextPage parseFrom(gva gvaVar) {
        return (ContextPage) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addContent(int i, ContentElement contentElement) {
        contentElement.getClass();
        ensureContentIsMutable();
        this.content_.add(i, contentElement);
    }

    public static ContextPage parseFrom(gva gvaVar, aux auxVar) {
        return (ContextPage) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ContextPage parseFrom(byte[] bArr) {
        return (ContextPage) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ContextPage parseFrom(byte[] bArr, aux auxVar) {
        return (ContextPage) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ContextPage parseFrom(InputStream inputStream) {
        return (ContextPage) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContextPage parseFrom(InputStream inputStream, aux auxVar) {
        return (ContextPage) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ContextPage parseFrom(owe oweVar) {
        return (ContextPage) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ContextPage parseFrom(owe oweVar, aux auxVar) {
        return (ContextPage) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
