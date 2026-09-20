package com.spotify.p060dj.interactionmanager.p061v0;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
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
public final class ContentElement extends AbstractC0269h implements ContentElementOrBuilder {
    private static final ContentElement DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int UID_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private ihc0 metadata_ = ihc0.f102235b;
    private String uri_ = "";
    private String uid_ = "";

    /* JADX INFO: renamed from: com.spotify.dj.interactionmanager.v0.ContentElement$1 */
    public static /* synthetic */ class C06871 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3567xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3567xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3567xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3567xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3567xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3567xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3567xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3567xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ContentElementOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
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

        public final Builder clearMetadata() {
            copyOnWrite();
            ContentElement.m9308p((ContentElement) this.instance).clear();
            return this;
        }

        public final Builder clearUid() {
            copyOnWrite();
            ((ContentElement) this.instance).clearUid();
            return this;
        }

        public final Builder clearUri() {
            copyOnWrite();
            ((ContentElement) this.instance).clearUri();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public final /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ContentElementOrBuilder
        public final boolean containsMetadata(String str) {
            str.getClass();
            return ((ContentElement) this.instance).getMetadataMap().containsKey(str);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ContentElementOrBuilder
        @Deprecated
        public final Map<String, String> getMetadata() {
            return getMetadataMap();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ContentElementOrBuilder
        public final int getMetadataCount() {
            return ((ContentElement) this.instance).getMetadataMap().size();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ContentElementOrBuilder
        public final Map<String, String> getMetadataMap() {
            return Collections.unmodifiableMap(((ContentElement) this.instance).getMetadataMap());
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ContentElementOrBuilder
        public final String getMetadataOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> metadataMap = ((ContentElement) this.instance).getMetadataMap();
            return metadataMap.containsKey(str) ? metadataMap.get(str) : str2;
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ContentElementOrBuilder
        public final String getMetadataOrThrow(String str) {
            str.getClass();
            Map<String, String> metadataMap = ((ContentElement) this.instance).getMetadataMap();
            if (metadataMap.containsKey(str)) {
                return metadataMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ContentElementOrBuilder
        public final String getUid() {
            return ((ContentElement) this.instance).getUid();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ContentElementOrBuilder
        public final gva getUidBytes() {
            return ((ContentElement) this.instance).getUidBytes();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ContentElementOrBuilder
        public final String getUri() {
            return ((ContentElement) this.instance).getUri();
        }

        @Override // com.spotify.p060dj.interactionmanager.p061v0.ContentElementOrBuilder
        public final gva getUriBytes() {
            return ((ContentElement) this.instance).getUriBytes();
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
            ContentElement.m9308p((ContentElement) this.instance).putAll(map);
            return this;
        }

        public final Builder putMetadata(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ContentElement.m9308p((ContentElement) this.instance).put(str, str2);
            return this;
        }

        public final Builder removeMetadata(String str) {
            str.getClass();
            copyOnWrite();
            ContentElement.m9308p((ContentElement) this.instance).remove(str);
            return this;
        }

        public final Builder setUid(String str) {
            copyOnWrite();
            ((ContentElement) this.instance).setUid(str);
            return this;
        }

        public final Builder setUidBytes(gva gvaVar) {
            copyOnWrite();
            ((ContentElement) this.instance).setUidBytes(gvaVar);
            return this;
        }

        public final Builder setUri(String str) {
            copyOnWrite();
            ((ContentElement) this.instance).setUri(str);
            return this;
        }

        public final Builder setUriBytes(gva gvaVar) {
            copyOnWrite();
            ((ContentElement) this.instance).setUriBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(ContentElement.DEFAULT_INSTANCE);
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

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public final /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
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
        ContentElement contentElement = new ContentElement();
        DEFAULT_INSTANCE = contentElement;
        AbstractC0269h.registerDefaultInstance(ContentElement.class, contentElement);
    }

    private ContentElement() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUid() {
        this.uid_ = DEFAULT_INSTANCE.uid_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUri() {
        this.uri_ = DEFAULT_INSTANCE.uri_;
    }

    public static ContentElement getDefaultInstance() {
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

    /* JADX INFO: renamed from: p */
    public static ihc0 m9308p(ContentElement contentElement) {
        return contentElement.internalGetMutableMetadata();
    }

    public static ContentElement parseDelimitedFrom(InputStream inputStream) {
        return (ContentElement) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContentElement parseFrom(ByteBuffer byteBuffer) {
        return (ContentElement) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUid(String str) {
        str.getClass();
        this.uid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUidBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.uid_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUri(String str) {
        str.getClass();
        this.uri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUriBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.uri_ = gvaVar.m45892u();
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ContentElementOrBuilder
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00032", new Object[]{"uri_", "uid_", "metadata_", MetadataDefaultEntryHolder.defaultEntry});
        }
        if (iOrdinal == 3) {
            return new ContentElement();
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
        synchronized (ContentElement.class) {
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
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ContentElementOrBuilder
    @Deprecated
    public final Map<String, String> getMetadata() {
        return Collections.unmodifiableMap(this.metadata_);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ContentElementOrBuilder
    public final int getMetadataCount() {
        return this.metadata_.size();
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ContentElementOrBuilder
    public final Map<String, String> getMetadataMap() {
        return Collections.unmodifiableMap(this.metadata_);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ContentElementOrBuilder
    public final String getMetadataOrDefault(String str, String str2) {
        str.getClass();
        ihc0 ihc0Var = this.metadata_;
        return ihc0Var.containsKey(str) ? (String) ihc0Var.get(str) : str2;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ContentElementOrBuilder
    public final String getMetadataOrThrow(String str) {
        str.getClass();
        ihc0 ihc0Var = this.metadata_;
        if (ihc0Var.containsKey(str)) {
            return (String) ihc0Var.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ContentElementOrBuilder
    public final String getUid() {
        return this.uid_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ContentElementOrBuilder
    public final gva getUidBytes() {
        return gva.m45888f(this.uid_);
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ContentElementOrBuilder
    public final String getUri() {
        return this.uri_;
    }

    @Override // com.spotify.p060dj.interactionmanager.p061v0.ContentElementOrBuilder
    public final gva getUriBytes() {
        return gva.m45888f(this.uri_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ContentElement contentElement) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(contentElement);
    }

    public static ContentElement parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ContentElement) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ContentElement parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ContentElement) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ContentElement parseFrom(gva gvaVar) {
        return (ContentElement) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static ContentElement parseFrom(gva gvaVar, aux auxVar) {
        return (ContentElement) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ContentElement parseFrom(byte[] bArr) {
        return (ContentElement) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ContentElement parseFrom(byte[] bArr, aux auxVar) {
        return (ContentElement) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ContentElement parseFrom(InputStream inputStream) {
        return (ContentElement) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContentElement parseFrom(InputStream inputStream, aux auxVar) {
        return (ContentElement) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ContentElement parseFrom(owe oweVar) {
        return (ContentElement) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ContentElement parseFrom(owe oweVar, aux auxVar) {
        return (ContentElement) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
