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
public final class TrackedShareContext extends AbstractC0269h implements TrackedShareContextOrBuilder {
    private static final TrackedShareContext DEFAULT_INSTANCE;
    public static final int LISTENING_ACTIVITY_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_INVITATION_FIELD_NUMBER = 5;
    public static final int PLAYLIST_MESSAGE_FIELD_NUMBER = 4;
    public static final int PLAYLIST_REACTION_FIELD_NUMBER = 2;
    public static final int PLAYLIST_REPLY_FIELD_NUMBER = 3;
    private int typeCase_ = 0;
    private Object type_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.TrackedShareContext$1 */
    public static /* synthetic */ class C04601 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3269xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3269xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3269xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3269xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3269xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3269xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3269xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3269xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements TrackedShareContextOrBuilder {
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

        public Builder clearListeningActivity() {
            copyOnWrite();
            ((TrackedShareContext) this.instance).clearListeningActivity();
            return this;
        }

        public Builder clearPlaylistInvitation() {
            copyOnWrite();
            ((TrackedShareContext) this.instance).clearPlaylistInvitation();
            return this;
        }

        public Builder clearPlaylistMessage() {
            copyOnWrite();
            ((TrackedShareContext) this.instance).clearPlaylistMessage();
            return this;
        }

        public Builder clearPlaylistReaction() {
            copyOnWrite();
            ((TrackedShareContext) this.instance).clearPlaylistReaction();
            return this;
        }

        public Builder clearPlaylistReply() {
            copyOnWrite();
            ((TrackedShareContext) this.instance).clearPlaylistReply();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((TrackedShareContext) this.instance).clearType();
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

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
        public ListeningActivity getListeningActivity() {
            return ((TrackedShareContext) this.instance).getListeningActivity();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
        public PlaylistInvitation getPlaylistInvitation() {
            return ((TrackedShareContext) this.instance).getPlaylistInvitation();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
        public PlaylistMessage getPlaylistMessage() {
            return ((TrackedShareContext) this.instance).getPlaylistMessage();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
        public PlaylistReaction getPlaylistReaction() {
            return ((TrackedShareContext) this.instance).getPlaylistReaction();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
        public PlaylistReply getPlaylistReply() {
            return ((TrackedShareContext) this.instance).getPlaylistReply();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
        public TypeCase getTypeCase() {
            return ((TrackedShareContext) this.instance).getTypeCase();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
        public boolean hasListeningActivity() {
            return ((TrackedShareContext) this.instance).hasListeningActivity();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
        public boolean hasPlaylistInvitation() {
            return ((TrackedShareContext) this.instance).hasPlaylistInvitation();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
        public boolean hasPlaylistMessage() {
            return ((TrackedShareContext) this.instance).hasPlaylistMessage();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
        public boolean hasPlaylistReaction() {
            return ((TrackedShareContext) this.instance).hasPlaylistReaction();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
        public boolean hasPlaylistReply() {
            return ((TrackedShareContext) this.instance).hasPlaylistReply();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeListeningActivity(ListeningActivity listeningActivity) {
            copyOnWrite();
            ((TrackedShareContext) this.instance).mergeListeningActivity(listeningActivity);
            return this;
        }

        public Builder mergePlaylistInvitation(PlaylistInvitation playlistInvitation) {
            copyOnWrite();
            ((TrackedShareContext) this.instance).mergePlaylistInvitation(playlistInvitation);
            return this;
        }

        public Builder mergePlaylistMessage(PlaylistMessage playlistMessage) {
            copyOnWrite();
            ((TrackedShareContext) this.instance).mergePlaylistMessage(playlistMessage);
            return this;
        }

        public Builder mergePlaylistReaction(PlaylistReaction playlistReaction) {
            copyOnWrite();
            ((TrackedShareContext) this.instance).mergePlaylistReaction(playlistReaction);
            return this;
        }

        public Builder mergePlaylistReply(PlaylistReply playlistReply) {
            copyOnWrite();
            ((TrackedShareContext) this.instance).mergePlaylistReply(playlistReply);
            return this;
        }

        public Builder setListeningActivity(ListeningActivity listeningActivity) {
            copyOnWrite();
            ((TrackedShareContext) this.instance).setListeningActivity(listeningActivity);
            return this;
        }

        public Builder setPlaylistInvitation(PlaylistInvitation playlistInvitation) {
            copyOnWrite();
            ((TrackedShareContext) this.instance).setPlaylistInvitation(playlistInvitation);
            return this;
        }

        public Builder setPlaylistMessage(PlaylistMessage playlistMessage) {
            copyOnWrite();
            ((TrackedShareContext) this.instance).setPlaylistMessage(playlistMessage);
            return this;
        }

        public Builder setPlaylistReaction(PlaylistReaction playlistReaction) {
            copyOnWrite();
            ((TrackedShareContext) this.instance).setPlaylistReaction(playlistReaction);
            return this;
        }

        public Builder setPlaylistReply(PlaylistReply playlistReply) {
            copyOnWrite();
            ((TrackedShareContext) this.instance).setPlaylistReply(playlistReply);
            return this;
        }

        private Builder() {
            super(TrackedShareContext.DEFAULT_INSTANCE);
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

        public Builder setListeningActivity(ListeningActivity.Builder builder) {
            copyOnWrite();
            ((TrackedShareContext) this.instance).setListeningActivity((ListeningActivity) builder.build());
            return this;
        }

        public Builder setPlaylistInvitation(PlaylistInvitation.Builder builder) {
            copyOnWrite();
            ((TrackedShareContext) this.instance).setPlaylistInvitation((PlaylistInvitation) builder.build());
            return this;
        }

        public Builder setPlaylistMessage(PlaylistMessage.Builder builder) {
            copyOnWrite();
            ((TrackedShareContext) this.instance).setPlaylistMessage((PlaylistMessage) builder.build());
            return this;
        }

        public Builder setPlaylistReaction(PlaylistReaction.Builder builder) {
            copyOnWrite();
            ((TrackedShareContext) this.instance).setPlaylistReaction((PlaylistReaction) builder.build());
            return this;
        }

        public Builder setPlaylistReply(PlaylistReply.Builder builder) {
            copyOnWrite();
            ((TrackedShareContext) this.instance).setPlaylistReply((PlaylistReply) builder.build());
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

    public enum TypeCase {
        LISTENING_ACTIVITY(1),
        PLAYLIST_REACTION(2),
        PLAYLIST_REPLY(3),
        PLAYLIST_MESSAGE(4),
        PLAYLIST_INVITATION(5),
        TYPE_NOT_SET(0);

        private final int value;

        TypeCase(int i) {
            this.value = i;
        }

        public static TypeCase forNumber(int i) {
            if (i == 0) {
                return TYPE_NOT_SET;
            }
            if (i == 1) {
                return LISTENING_ACTIVITY;
            }
            if (i == 2) {
                return PLAYLIST_REACTION;
            }
            if (i == 3) {
                return PLAYLIST_REPLY;
            }
            if (i == 4) {
                return PLAYLIST_MESSAGE;
            }
            if (i != 5) {
                return null;
            }
            return PLAYLIST_INVITATION;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static TypeCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        TrackedShareContext trackedShareContext = new TrackedShareContext();
        DEFAULT_INSTANCE = trackedShareContext;
        AbstractC0269h.registerDefaultInstance(TrackedShareContext.class, trackedShareContext);
    }

    private TrackedShareContext() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearListeningActivity() {
        if (this.typeCase_ == 1) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaylistInvitation() {
        if (this.typeCase_ == 5) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaylistMessage() {
        if (this.typeCase_ == 4) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaylistReaction() {
        if (this.typeCase_ == 2) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaylistReply() {
        if (this.typeCase_ == 3) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.typeCase_ = 0;
        this.type_ = null;
    }

    public static TrackedShareContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeListeningActivity(ListeningActivity listeningActivity) {
        listeningActivity.getClass();
        if (this.typeCase_ != 1 || this.type_ == ListeningActivity.getDefaultInstance()) {
            this.type_ = listeningActivity;
        } else {
            this.type_ = ((ListeningActivity.Builder) ListeningActivity.newBuilder((ListeningActivity) this.type_).mergeFrom((AbstractC0269h) listeningActivity)).buildPartial();
        }
        this.typeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlaylistInvitation(PlaylistInvitation playlistInvitation) {
        playlistInvitation.getClass();
        if (this.typeCase_ != 5 || this.type_ == PlaylistInvitation.getDefaultInstance()) {
            this.type_ = playlistInvitation;
        } else {
            this.type_ = ((PlaylistInvitation.Builder) PlaylistInvitation.newBuilder((PlaylistInvitation) this.type_).mergeFrom((AbstractC0269h) playlistInvitation)).buildPartial();
        }
        this.typeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlaylistMessage(PlaylistMessage playlistMessage) {
        playlistMessage.getClass();
        if (this.typeCase_ != 4 || this.type_ == PlaylistMessage.getDefaultInstance()) {
            this.type_ = playlistMessage;
        } else {
            this.type_ = ((PlaylistMessage.Builder) PlaylistMessage.newBuilder((PlaylistMessage) this.type_).mergeFrom((AbstractC0269h) playlistMessage)).buildPartial();
        }
        this.typeCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlaylistReaction(PlaylistReaction playlistReaction) {
        playlistReaction.getClass();
        if (this.typeCase_ != 2 || this.type_ == PlaylistReaction.getDefaultInstance()) {
            this.type_ = playlistReaction;
        } else {
            this.type_ = ((PlaylistReaction.Builder) PlaylistReaction.newBuilder((PlaylistReaction) this.type_).mergeFrom((AbstractC0269h) playlistReaction)).buildPartial();
        }
        this.typeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlaylistReply(PlaylistReply playlistReply) {
        playlistReply.getClass();
        if (this.typeCase_ != 3 || this.type_ == PlaylistReply.getDefaultInstance()) {
            this.type_ = playlistReply;
        } else {
            this.type_ = ((PlaylistReply.Builder) PlaylistReply.newBuilder((PlaylistReply) this.type_).mergeFrom((AbstractC0269h) playlistReply)).buildPartial();
        }
        this.typeCase_ = 3;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TrackedShareContext parseDelimitedFrom(InputStream inputStream) {
        return (TrackedShareContext) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackedShareContext parseFrom(ByteBuffer byteBuffer) {
        return (TrackedShareContext) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListeningActivity(ListeningActivity listeningActivity) {
        listeningActivity.getClass();
        this.type_ = listeningActivity;
        this.typeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaylistInvitation(PlaylistInvitation playlistInvitation) {
        playlistInvitation.getClass();
        this.type_ = playlistInvitation;
        this.typeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaylistMessage(PlaylistMessage playlistMessage) {
        playlistMessage.getClass();
        this.type_ = playlistMessage;
        this.typeCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaylistReaction(PlaylistReaction playlistReaction) {
        playlistReaction.getClass();
        this.type_ = playlistReaction;
        this.typeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaylistReply(PlaylistReply playlistReply) {
        playlistReply.getClass();
        this.type_ = playlistReply;
        this.typeCase_ = 3;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"type_", "typeCase_", ListeningActivity.class, PlaylistReaction.class, PlaylistReply.class, PlaylistMessage.class, PlaylistInvitation.class});
        }
        if (iOrdinal == 3) {
            return new TrackedShareContext();
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
        synchronized (TrackedShareContext.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
    public ListeningActivity getListeningActivity() {
        return this.typeCase_ == 1 ? (ListeningActivity) this.type_ : ListeningActivity.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
    public PlaylistInvitation getPlaylistInvitation() {
        return this.typeCase_ == 5 ? (PlaylistInvitation) this.type_ : PlaylistInvitation.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
    public PlaylistMessage getPlaylistMessage() {
        return this.typeCase_ == 4 ? (PlaylistMessage) this.type_ : PlaylistMessage.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
    public PlaylistReaction getPlaylistReaction() {
        return this.typeCase_ == 2 ? (PlaylistReaction) this.type_ : PlaylistReaction.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
    public PlaylistReply getPlaylistReply() {
        return this.typeCase_ == 3 ? (PlaylistReply) this.type_ : PlaylistReply.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
    public TypeCase getTypeCase() {
        return TypeCase.forNumber(this.typeCase_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
    public boolean hasListeningActivity() {
        return this.typeCase_ == 1;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
    public boolean hasPlaylistInvitation() {
        return this.typeCase_ == 5;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
    public boolean hasPlaylistMessage() {
        return this.typeCase_ == 4;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
    public boolean hasPlaylistReaction() {
        return this.typeCase_ == 2;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.TrackedShareContextOrBuilder
    public boolean hasPlaylistReply() {
        return this.typeCase_ == 3;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(TrackedShareContext trackedShareContext) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(trackedShareContext);
    }

    public static TrackedShareContext parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (TrackedShareContext) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static TrackedShareContext parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (TrackedShareContext) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static TrackedShareContext parseFrom(gva gvaVar) {
        return (TrackedShareContext) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static TrackedShareContext parseFrom(gva gvaVar, aux auxVar) {
        return (TrackedShareContext) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static TrackedShareContext parseFrom(byte[] bArr) {
        return (TrackedShareContext) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TrackedShareContext parseFrom(byte[] bArr, aux auxVar) {
        return (TrackedShareContext) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static TrackedShareContext parseFrom(InputStream inputStream) {
        return (TrackedShareContext) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrackedShareContext parseFrom(InputStream inputStream, aux auxVar) {
        return (TrackedShareContext) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static TrackedShareContext parseFrom(owe oweVar) {
        return (TrackedShareContext) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static TrackedShareContext parseFrom(owe oweVar, aux auxVar) {
        return (TrackedShareContext) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
