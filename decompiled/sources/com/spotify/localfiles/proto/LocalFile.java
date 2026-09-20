package com.spotify.localfiles.proto;

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
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class LocalFile extends AbstractC0269h implements LocalFileOrBuilder {
    private static final LocalFile DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PATH_FIELD_NUMBER = 1;
    private int bitField0_;
    private Metadata metadata_;
    private String path_ = "";

    /* JADX INFO: renamed from: com.spotify.localfiles.proto.LocalFile$1 */
    public static /* synthetic */ class C08571 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f5282xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f5282xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5282xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5282xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5282xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5282xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5282xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5282xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements LocalFileOrBuilder {
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

        public Builder clearMetadata() {
            copyOnWrite();
            ((LocalFile) this.instance).clearMetadata();
            return this;
        }

        public Builder clearPath() {
            copyOnWrite();
            ((LocalFile) this.instance).clearPath();
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

        @Override // com.spotify.localfiles.proto.LocalFileOrBuilder
        public Metadata getMetadata() {
            return ((LocalFile) this.instance).getMetadata();
        }

        @Override // com.spotify.localfiles.proto.LocalFileOrBuilder
        public String getPath() {
            return ((LocalFile) this.instance).getPath();
        }

        @Override // com.spotify.localfiles.proto.LocalFileOrBuilder
        public gva getPathBytes() {
            return ((LocalFile) this.instance).getPathBytes();
        }

        @Override // com.spotify.localfiles.proto.LocalFileOrBuilder
        public boolean hasMetadata() {
            return ((LocalFile) this.instance).hasMetadata();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeMetadata(Metadata metadata) {
            copyOnWrite();
            ((LocalFile) this.instance).mergeMetadata(metadata);
            return this;
        }

        public Builder setMetadata(Metadata metadata) {
            copyOnWrite();
            ((LocalFile) this.instance).setMetadata(metadata);
            return this;
        }

        public Builder setPath(String str) {
            copyOnWrite();
            ((LocalFile) this.instance).setPath(str);
            return this;
        }

        public Builder setPathBytes(gva gvaVar) {
            copyOnWrite();
            ((LocalFile) this.instance).setPathBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(LocalFile.DEFAULT_INSTANCE);
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

        public Builder setMetadata(Metadata.Builder builder) {
            copyOnWrite();
            ((LocalFile) this.instance).setMetadata((Metadata) builder.build());
            return this;
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

    public static final class Metadata extends AbstractC0269h implements MetadataOrBuilder {
        public static final int ALBUM_FIELD_NUMBER = 2;
        public static final int ARTIST_FIELD_NUMBER = 3;
        private static final Metadata DEFAULT_INSTANCE;
        public static final int DURATION_FIELD_NUMBER = 4;
        public static final int IMAGE_STATE_FIELD_NUMBER = 5;
        private static volatile r2n0 PARSER = null;
        public static final int TITLE_FIELD_NUMBER = 1;
        private int duration_;
        private int imageState_;
        private String title_ = "";
        private String album_ = "";
        private String artist_ = "";

        public static final class Builder extends AbstractC0268g implements MetadataOrBuilder {
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

            public Builder clearAlbum() {
                copyOnWrite();
                ((Metadata) this.instance).clearAlbum();
                return this;
            }

            public Builder clearArtist() {
                copyOnWrite();
                ((Metadata) this.instance).clearArtist();
                return this;
            }

            public Builder clearDuration() {
                copyOnWrite();
                ((Metadata) this.instance).clearDuration();
                return this;
            }

            public Builder clearImageState() {
                copyOnWrite();
                ((Metadata) this.instance).clearImageState();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((Metadata) this.instance).clearTitle();
                return this;
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public /* bridge */ /* synthetic */ Object mo98327clone() {
                return super.mo98326clone();
            }

            @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
            public String getAlbum() {
                return ((Metadata) this.instance).getAlbum();
            }

            @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
            public gva getAlbumBytes() {
                return ((Metadata) this.instance).getAlbumBytes();
            }

            @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
            public String getArtist() {
                return ((Metadata) this.instance).getArtist();
            }

            @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
            public gva getArtistBytes() {
                return ((Metadata) this.instance).getArtistBytes();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
            public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
            public int getDuration() {
                return ((Metadata) this.instance).getDuration();
            }

            @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
            public ImageState getImageState() {
                return ((Metadata) this.instance).getImageState();
            }

            @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
            public int getImageStateValue() {
                return ((Metadata) this.instance).getImageStateValue();
            }

            @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
            public String getTitle() {
                return ((Metadata) this.instance).getTitle();
            }

            @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
            public gva getTitleBytes() {
                return ((Metadata) this.instance).getTitleBytes();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
                return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
            public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            public Builder setAlbum(String str) {
                copyOnWrite();
                ((Metadata) this.instance).setAlbum(str);
                return this;
            }

            public Builder setAlbumBytes(gva gvaVar) {
                copyOnWrite();
                ((Metadata) this.instance).setAlbumBytes(gvaVar);
                return this;
            }

            public Builder setArtist(String str) {
                copyOnWrite();
                ((Metadata) this.instance).setArtist(str);
                return this;
            }

            public Builder setArtistBytes(gva gvaVar) {
                copyOnWrite();
                ((Metadata) this.instance).setArtistBytes(gvaVar);
                return this;
            }

            public Builder setDuration(int i) {
                copyOnWrite();
                ((Metadata) this.instance).setDuration(i);
                return this;
            }

            public Builder setImageState(ImageState imageState) {
                copyOnWrite();
                ((Metadata) this.instance).setImageState(imageState);
                return this;
            }

            public Builder setImageStateValue(int i) {
                copyOnWrite();
                ((Metadata) this.instance).setImageStateValue(i);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((Metadata) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(gva gvaVar) {
                copyOnWrite();
                ((Metadata) this.instance).setTitleBytes(gvaVar);
                return this;
            }

            private Builder() {
                super(Metadata.DEFAULT_INSTANCE);
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

        public enum ImageState implements od50 {
            UNKNOWN(0),
            AVAILABLE(1),
            UNAVAILABLE(2),
            UNRECOGNIZED(-1);

            public static final int AVAILABLE_VALUE = 1;
            public static final int UNAVAILABLE_VALUE = 2;
            public static final int UNKNOWN_VALUE = 0;
            private static final rd50 internalValueMap = new rd50() { // from class: com.spotify.localfiles.proto.LocalFile.Metadata.ImageState.1
                @Override // p204p.rd50
                public ImageState findValueByNumber(int i) {
                    return ImageState.forNumber(i);
                }
            };
            private final int value;

            public static final class ImageStateVerifier implements sd50 {
                static final sd50 INSTANCE = new ImageStateVerifier();

                private ImageStateVerifier() {
                }

                @Override // p204p.sd50
                public boolean isInRange(int i) {
                    return ImageState.forNumber(i) != null;
                }
            }

            ImageState(int i) {
                this.value = i;
            }

            public static ImageState forNumber(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return AVAILABLE;
                }
                if (i != 2) {
                    return null;
                }
                return UNAVAILABLE;
            }

            public static rd50 internalGetValueMap() {
                return internalValueMap;
            }

            public static sd50 internalGetVerifier() {
                return ImageStateVerifier.INSTANCE;
            }

            @Override // p204p.od50
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static ImageState valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            Metadata metadata = new Metadata();
            DEFAULT_INSTANCE = metadata;
            AbstractC0269h.registerDefaultInstance(Metadata.class, metadata);
        }

        private Metadata() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlbum() {
            this.album_ = getDefaultInstance().getAlbum();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearArtist() {
            this.artist_ = getDefaultInstance().getArtist();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDuration() {
            this.duration_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImageState() {
            this.imageState_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        public static Metadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Metadata parseDelimitedFrom(InputStream inputStream) {
            return (Metadata) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Metadata parseFrom(ByteBuffer byteBuffer) {
            return (Metadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlbum(String str) {
            str.getClass();
            this.album_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlbumBytes(gva gvaVar) {
            AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
            this.album_ = gvaVar.m45892u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setArtist(String str) {
            str.getClass();
            this.artist_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setArtistBytes(gva gvaVar) {
            AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
            this.artist_ = gvaVar.m45892u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDuration(int i) {
            this.duration_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageState(ImageState imageState) {
            this.imageState_ = imageState.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageStateValue(int i) {
            this.imageState_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(String str) {
            str.getClass();
            this.title_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleBytes(gva gvaVar) {
            AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
            this.title_ = gvaVar.m45892u();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005\f", new Object[]{"title_", "album_", "artist_", "duration_", "imageState_"});
            }
            if (iOrdinal == 3) {
                return new Metadata();
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
            synchronized (Metadata.class) {
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

        @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
        public String getAlbum() {
            return this.album_;
        }

        @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
        public gva getAlbumBytes() {
            return gva.m45888f(this.album_);
        }

        @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
        public String getArtist() {
            return this.artist_;
        }

        @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
        public gva getArtistBytes() {
            return gva.m45888f(this.artist_);
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
        public int getDuration() {
            return this.duration_;
        }

        @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
        public ImageState getImageState() {
            ImageState imageStateForNumber = ImageState.forNumber(this.imageState_);
            return imageStateForNumber == null ? ImageState.UNRECOGNIZED : imageStateForNumber;
        }

        @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
        public int getImageStateValue() {
            return this.imageState_;
        }

        @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
        public String getTitle() {
            return this.title_;
        }

        @Override // com.spotify.localfiles.proto.LocalFile.MetadataOrBuilder
        public gva getTitleBytes() {
            return gva.m45888f(this.title_);
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        public static Builder newBuilder(Metadata metadata) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(metadata);
        }

        public static Metadata parseDelimitedFrom(InputStream inputStream, aux auxVar) {
            return (Metadata) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static Metadata parseFrom(ByteBuffer byteBuffer, aux auxVar) {
            return (Metadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
        }

        public static Metadata parseFrom(gva gvaVar) {
            return (Metadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
        }

        public static Metadata parseFrom(gva gvaVar, aux auxVar) {
            return (Metadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
        }

        public static Metadata parseFrom(byte[] bArr) {
            return (Metadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Metadata parseFrom(byte[] bArr, aux auxVar) {
            return (Metadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
        }

        public static Metadata parseFrom(InputStream inputStream) {
            return (Metadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Metadata parseFrom(InputStream inputStream, aux auxVar) {
            return (Metadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static Metadata parseFrom(owe oweVar) {
            return (Metadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
        }

        public static Metadata parseFrom(owe oweVar, aux auxVar) {
            return (Metadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
        }
    }

    public interface MetadataOrBuilder extends sre0 {
        String getAlbum();

        gva getAlbumBytes();

        String getArtist();

        gva getArtistBytes();

        @Override // p204p.sre0
        /* synthetic */ pre0 getDefaultInstanceForType();

        int getDuration();

        Metadata.ImageState getImageState();

        int getImageStateValue();

        String getTitle();

        gva getTitleBytes();

        @Override // p204p.sre0
        /* synthetic */ boolean isInitialized();
    }

    static {
        LocalFile localFile = new LocalFile();
        DEFAULT_INSTANCE = localFile;
        AbstractC0269h.registerDefaultInstance(LocalFile.class, localFile);
    }

    private LocalFile() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPath() {
        this.path_ = getDefaultInstance().getPath();
    }

    public static LocalFile getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(Metadata metadata) {
        metadata.getClass();
        Metadata metadata2 = this.metadata_;
        if (metadata2 == null || metadata2 == Metadata.getDefaultInstance()) {
            this.metadata_ = metadata;
        } else {
            this.metadata_ = (Metadata) ((Metadata.Builder) Metadata.newBuilder(this.metadata_).mergeFrom((AbstractC0269h) metadata)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static LocalFile parseDelimitedFrom(InputStream inputStream) {
        return (LocalFile) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LocalFile parseFrom(ByteBuffer byteBuffer) {
        return (LocalFile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(Metadata metadata) {
        metadata.getClass();
        this.metadata_ = metadata;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPath(String str) {
        str.getClass();
        this.path_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPathBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.path_ = gvaVar.m45892u();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "path_", "metadata_"});
        }
        if (iOrdinal == 3) {
            return new LocalFile();
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
        synchronized (LocalFile.class) {
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

    @Override // com.spotify.localfiles.proto.LocalFileOrBuilder
    public Metadata getMetadata() {
        Metadata metadata = this.metadata_;
        return metadata == null ? Metadata.getDefaultInstance() : metadata;
    }

    @Override // com.spotify.localfiles.proto.LocalFileOrBuilder
    public String getPath() {
        return this.path_;
    }

    @Override // com.spotify.localfiles.proto.LocalFileOrBuilder
    public gva getPathBytes() {
        return gva.m45888f(this.path_);
    }

    @Override // com.spotify.localfiles.proto.LocalFileOrBuilder
    public boolean hasMetadata() {
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

    public static Builder newBuilder(LocalFile localFile) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(localFile);
    }

    public static LocalFile parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (LocalFile) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static LocalFile parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (LocalFile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static LocalFile parseFrom(gva gvaVar) {
        return (LocalFile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static LocalFile parseFrom(gva gvaVar, aux auxVar) {
        return (LocalFile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static LocalFile parseFrom(byte[] bArr) {
        return (LocalFile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LocalFile parseFrom(byte[] bArr, aux auxVar) {
        return (LocalFile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static LocalFile parseFrom(InputStream inputStream) {
        return (LocalFile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LocalFile parseFrom(InputStream inputStream, aux auxVar) {
        return (LocalFile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static LocalFile parseFrom(owe oweVar) {
        return (LocalFile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static LocalFile parseFrom(owe oweVar, aux auxVar) {
        return (LocalFile) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
