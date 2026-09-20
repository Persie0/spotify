package com.spotify.campfire.datasource.impl.proto;

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

/* JADX INFO: loaded from: classes5.dex */
public final class PlaylistReaction extends AbstractC0269h implements PlaylistReactionOrBuilder {
    private static final PlaylistReaction DEFAULT_INSTANCE;
    public static final int ITEM_ID_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_URI_FIELD_NUMBER = 2;
    public static final int REACTION_FIELD_NUMBER = 1;
    private String reaction_ = "";
    private String playlistUri_ = "";
    private gva itemId_ = gva.f84678b;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.PlaylistReaction$1 */
    public static /* synthetic */ class C04271 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3241xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3241xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3241xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3241xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3241xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3241xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3241xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3241xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements PlaylistReactionOrBuilder {
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

        public Builder clearItemId() {
            copyOnWrite();
            ((PlaylistReaction) this.instance).clearItemId();
            return this;
        }

        public Builder clearPlaylistUri() {
            copyOnWrite();
            ((PlaylistReaction) this.instance).clearPlaylistUri();
            return this;
        }

        public Builder clearReaction() {
            copyOnWrite();
            ((PlaylistReaction) this.instance).clearReaction();
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

        @Override // com.spotify.campfire.datasource.impl.proto.PlaylistReactionOrBuilder
        public gva getItemId() {
            return ((PlaylistReaction) this.instance).getItemId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.PlaylistReactionOrBuilder
        public String getPlaylistUri() {
            return ((PlaylistReaction) this.instance).getPlaylistUri();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.PlaylistReactionOrBuilder
        public gva getPlaylistUriBytes() {
            return ((PlaylistReaction) this.instance).getPlaylistUriBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.PlaylistReactionOrBuilder
        public String getReaction() {
            return ((PlaylistReaction) this.instance).getReaction();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.PlaylistReactionOrBuilder
        public gva getReactionBytes() {
            return ((PlaylistReaction) this.instance).getReactionBytes();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setItemId(gva gvaVar) {
            copyOnWrite();
            ((PlaylistReaction) this.instance).setItemId(gvaVar);
            return this;
        }

        public Builder setPlaylistUri(String str) {
            copyOnWrite();
            ((PlaylistReaction) this.instance).setPlaylistUri(str);
            return this;
        }

        public Builder setPlaylistUriBytes(gva gvaVar) {
            copyOnWrite();
            ((PlaylistReaction) this.instance).setPlaylistUriBytes(gvaVar);
            return this;
        }

        public Builder setReaction(String str) {
            copyOnWrite();
            ((PlaylistReaction) this.instance).setReaction(str);
            return this;
        }

        public Builder setReactionBytes(gva gvaVar) {
            copyOnWrite();
            ((PlaylistReaction) this.instance).setReactionBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(PlaylistReaction.DEFAULT_INSTANCE);
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
        PlaylistReaction playlistReaction = new PlaylistReaction();
        DEFAULT_INSTANCE = playlistReaction;
        AbstractC0269h.registerDefaultInstance(PlaylistReaction.class, playlistReaction);
    }

    private PlaylistReaction() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItemId() {
        this.itemId_ = getDefaultInstance().getItemId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaylistUri() {
        this.playlistUri_ = getDefaultInstance().getPlaylistUri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReaction() {
        this.reaction_ = getDefaultInstance().getReaction();
    }

    public static PlaylistReaction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static PlaylistReaction parseDelimitedFrom(InputStream inputStream) {
        return (PlaylistReaction) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlaylistReaction parseFrom(ByteBuffer byteBuffer) {
        return (PlaylistReaction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemId(gva gvaVar) {
        gvaVar.getClass();
        this.itemId_ = gvaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaylistUri(String str) {
        str.getClass();
        this.playlistUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaylistUriBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.playlistUri_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReaction(String str) {
        str.getClass();
        this.reaction_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReactionBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.reaction_ = gvaVar.m45892u();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0004\n", new Object[]{"reaction_", "playlistUri_", "itemId_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistReaction();
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
        synchronized (PlaylistReaction.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.PlaylistReactionOrBuilder
    public gva getItemId() {
        return this.itemId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.PlaylistReactionOrBuilder
    public String getPlaylistUri() {
        return this.playlistUri_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.PlaylistReactionOrBuilder
    public gva getPlaylistUriBytes() {
        return gva.m45888f(this.playlistUri_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.PlaylistReactionOrBuilder
    public String getReaction() {
        return this.reaction_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.PlaylistReactionOrBuilder
    public gva getReactionBytes() {
        return gva.m45888f(this.reaction_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(PlaylistReaction playlistReaction) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(playlistReaction);
    }

    public static PlaylistReaction parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (PlaylistReaction) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static PlaylistReaction parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (PlaylistReaction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static PlaylistReaction parseFrom(gva gvaVar) {
        return (PlaylistReaction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static PlaylistReaction parseFrom(gva gvaVar, aux auxVar) {
        return (PlaylistReaction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static PlaylistReaction parseFrom(byte[] bArr) {
        return (PlaylistReaction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlaylistReaction parseFrom(byte[] bArr, aux auxVar) {
        return (PlaylistReaction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static PlaylistReaction parseFrom(InputStream inputStream) {
        return (PlaylistReaction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlaylistReaction parseFrom(InputStream inputStream, aux auxVar) {
        return (PlaylistReaction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static PlaylistReaction parseFrom(owe oweVar) {
        return (PlaylistReaction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static PlaylistReaction parseFrom(owe oweVar, aux auxVar) {
        return (PlaylistReaction) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
