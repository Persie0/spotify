package com.spotify.playlist4.proto;

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

/* JADX INFO: loaded from: classes9.dex */
public final class PlaylistSyncReasonProto {

    /* JADX INFO: renamed from: com.spotify.playlist4.proto.PlaylistSyncReasonProto$1 */
    public static /* synthetic */ class C12181 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f6458xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f6458xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6458xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6458xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6458xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6458xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6458xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6458xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public enum PlaylistSyncCaller implements od50 {
        UNKNOWN(0),
        ESPERANTO(1),
        REMOTE(2),
        ROOTLIST(3),
        OFFLINE(4),
        RELOGIN(5),
        RECENTLY_PLAYED(6),
        PERMISSIONS(7),
        PLAYBACK(8),
        LOCAL_CHANGES(9),
        TEST(10),
        FULL_RESET(11),
        SYNC_POLICY(12),
        USER_INTERACTION(13),
        REVERSE_INDEX_BUILDER(14),
        SIGNAL(15),
        APPLY_LENSES(16),
        YOUR_LIBRARY_TAGS(17),
        PLAYER_CONTEXT_UPDATE(18),
        CURATION_STATE(19),
        EPISODE_LIST_LOADER(20),
        AUDIOBOOK_SEQUENCE_PROVIDER(21),
        COLLECTION_DECORATE_REQUEST(22),
        COLLECTION_GET_UNPLAYED_EPISODES_REQUEST(23),
        COLLECTION_SHOW_OFFLINE_CONTROLLER(24),
        EPISODE_PUBLISH_DATE_INDEX_WRITE_HOOK(25),
        PODCAST_PAYWALLS(26),
        SHOW_ACCESS_SUBSCRIBER(27),
        SHOW_CONTEXT_LOADER(28),
        SHOW_COSMOS_DECORATE_REQUEST(29),
        SHOW_COSMOS_MARK_AS_PLAYED(30),
        SHOW_COSMOS_SHOW_REQUEST(31),
        YOUR_LIBRARY_CLEANUP_SUGGESTIONS_HACK(32),
        YOUR_EPISODES_LOCAL_STATE_UPDATER(33),
        TAG_PLAYLIST_GENERATOR(34),
        YOUR_LIBRARY(35),
        RESUMPTION_PROGRESS(36),
        SAVED_ALBUMS(37),
        DSA_STATE_CHANGE(38),
        SHOW_RESUME_EPISODE_PROVIDER(39),
        AUTOPLAY_LENS_OBSERVER(40),
        LIST_PLAYER_DECORATOR(41),
        LIST_PLAYER_PLAY_REQUEST_ADAPTER(42),
        PREDEFINED_LISTS(43),
        JAM_LENS_MANAGER(44),
        LIST_PLAYER_QUEUED_ITEMS_FILTER(45),
        LIST_PLAYER_REC_POOL_FILTER(46),
        VOLATILE_CONTEXT(47),
        MULTIGET_ADDITIONAL_RESPONSE(48),
        TRACK_LIST_FACTORY(49),
        LIST_PLAYER_KEEP_PLAYING_FILTER(50),
        LIST_CLIENT(51),
        INTERACTIVE_PLAY_SOURCE(52),
        LIST_PLAYER_RESOLVED_LIST(53),
        UNRECOGNIZED(-1);

        public static final int APPLY_LENSES_VALUE = 16;
        public static final int AUDIOBOOK_SEQUENCE_PROVIDER_VALUE = 21;
        public static final int AUTOPLAY_LENS_OBSERVER_VALUE = 40;
        public static final int COLLECTION_DECORATE_REQUEST_VALUE = 22;
        public static final int COLLECTION_GET_UNPLAYED_EPISODES_REQUEST_VALUE = 23;
        public static final int COLLECTION_SHOW_OFFLINE_CONTROLLER_VALUE = 24;
        public static final int CURATION_STATE_VALUE = 19;
        public static final int DSA_STATE_CHANGE_VALUE = 38;
        public static final int EPISODE_LIST_LOADER_VALUE = 20;
        public static final int EPISODE_PUBLISH_DATE_INDEX_WRITE_HOOK_VALUE = 25;
        public static final int ESPERANTO_VALUE = 1;
        public static final int FULL_RESET_VALUE = 11;
        public static final int INTERACTIVE_PLAY_SOURCE_VALUE = 52;
        public static final int JAM_LENS_MANAGER_VALUE = 44;
        public static final int LIST_CLIENT_VALUE = 51;
        public static final int LIST_PLAYER_DECORATOR_VALUE = 41;
        public static final int LIST_PLAYER_KEEP_PLAYING_FILTER_VALUE = 50;
        public static final int LIST_PLAYER_PLAY_REQUEST_ADAPTER_VALUE = 42;
        public static final int LIST_PLAYER_QUEUED_ITEMS_FILTER_VALUE = 45;
        public static final int LIST_PLAYER_REC_POOL_FILTER_VALUE = 46;
        public static final int LIST_PLAYER_RESOLVED_LIST_VALUE = 53;
        public static final int LOCAL_CHANGES_VALUE = 9;
        public static final int MULTIGET_ADDITIONAL_RESPONSE_VALUE = 48;
        public static final int OFFLINE_VALUE = 4;
        public static final int PERMISSIONS_VALUE = 7;
        public static final int PLAYBACK_VALUE = 8;
        public static final int PLAYER_CONTEXT_UPDATE_VALUE = 18;
        public static final int PODCAST_PAYWALLS_VALUE = 26;
        public static final int PREDEFINED_LISTS_VALUE = 43;
        public static final int RECENTLY_PLAYED_VALUE = 6;
        public static final int RELOGIN_VALUE = 5;
        public static final int REMOTE_VALUE = 2;
        public static final int RESUMPTION_PROGRESS_VALUE = 36;
        public static final int REVERSE_INDEX_BUILDER_VALUE = 14;
        public static final int ROOTLIST_VALUE = 3;
        public static final int SAVED_ALBUMS_VALUE = 37;
        public static final int SHOW_ACCESS_SUBSCRIBER_VALUE = 27;
        public static final int SHOW_CONTEXT_LOADER_VALUE = 28;
        public static final int SHOW_COSMOS_DECORATE_REQUEST_VALUE = 29;
        public static final int SHOW_COSMOS_MARK_AS_PLAYED_VALUE = 30;
        public static final int SHOW_COSMOS_SHOW_REQUEST_VALUE = 31;
        public static final int SHOW_RESUME_EPISODE_PROVIDER_VALUE = 39;
        public static final int SIGNAL_VALUE = 15;
        public static final int SYNC_POLICY_VALUE = 12;
        public static final int TAG_PLAYLIST_GENERATOR_VALUE = 34;
        public static final int TEST_VALUE = 10;
        public static final int TRACK_LIST_FACTORY_VALUE = 49;
        public static final int UNKNOWN_VALUE = 0;
        public static final int USER_INTERACTION_VALUE = 13;
        public static final int VOLATILE_CONTEXT_VALUE = 47;
        public static final int YOUR_EPISODES_LOCAL_STATE_UPDATER_VALUE = 33;
        public static final int YOUR_LIBRARY_CLEANUP_SUGGESTIONS_HACK_VALUE = 32;
        public static final int YOUR_LIBRARY_TAGS_VALUE = 17;
        public static final int YOUR_LIBRARY_VALUE = 35;
        private static final rd50 internalValueMap = new C12191();
        private final int value;

        /* JADX INFO: renamed from: com.spotify.playlist4.proto.PlaylistSyncReasonProto$PlaylistSyncCaller$1 */
        public class C12191 implements rd50 {
            @Override // p204p.rd50
            public final PlaylistSyncCaller findValueByNumber(int i) {
                return PlaylistSyncCaller.forNumber(i);
            }

            @Override // p204p.rd50
            public final od50 findValueByNumber(int i) {
                return PlaylistSyncCaller.forNumber(i);
            }
        }

        public static final class PlaylistSyncCallerVerifier implements sd50 {
            static final sd50 INSTANCE = new PlaylistSyncCallerVerifier();

            private PlaylistSyncCallerVerifier() {
            }

            @Override // p204p.sd50
            public final boolean isInRange(int i) {
                return PlaylistSyncCaller.forNumber(i) != null;
            }
        }

        PlaylistSyncCaller(int i) {
            this.value = i;
        }

        public static PlaylistSyncCaller forNumber(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return ESPERANTO;
                case 2:
                    return REMOTE;
                case 3:
                    return ROOTLIST;
                case 4:
                    return OFFLINE;
                case 5:
                    return RELOGIN;
                case 6:
                    return RECENTLY_PLAYED;
                case 7:
                    return PERMISSIONS;
                case 8:
                    return PLAYBACK;
                case 9:
                    return LOCAL_CHANGES;
                case 10:
                    return TEST;
                case 11:
                    return FULL_RESET;
                case 12:
                    return SYNC_POLICY;
                case 13:
                    return USER_INTERACTION;
                case 14:
                    return REVERSE_INDEX_BUILDER;
                case 15:
                    return SIGNAL;
                case 16:
                    return APPLY_LENSES;
                case 17:
                    return YOUR_LIBRARY_TAGS;
                case 18:
                    return PLAYER_CONTEXT_UPDATE;
                case 19:
                    return CURATION_STATE;
                case 20:
                    return EPISODE_LIST_LOADER;
                case 21:
                    return AUDIOBOOK_SEQUENCE_PROVIDER;
                case 22:
                    return COLLECTION_DECORATE_REQUEST;
                case 23:
                    return COLLECTION_GET_UNPLAYED_EPISODES_REQUEST;
                case 24:
                    return COLLECTION_SHOW_OFFLINE_CONTROLLER;
                case 25:
                    return EPISODE_PUBLISH_DATE_INDEX_WRITE_HOOK;
                case 26:
                    return PODCAST_PAYWALLS;
                case 27:
                    return SHOW_ACCESS_SUBSCRIBER;
                case 28:
                    return SHOW_CONTEXT_LOADER;
                case 29:
                    return SHOW_COSMOS_DECORATE_REQUEST;
                case 30:
                    return SHOW_COSMOS_MARK_AS_PLAYED;
                case 31:
                    return SHOW_COSMOS_SHOW_REQUEST;
                case 32:
                    return YOUR_LIBRARY_CLEANUP_SUGGESTIONS_HACK;
                case 33:
                    return YOUR_EPISODES_LOCAL_STATE_UPDATER;
                case 34:
                    return TAG_PLAYLIST_GENERATOR;
                case 35:
                    return YOUR_LIBRARY;
                case 36:
                    return RESUMPTION_PROGRESS;
                case 37:
                    return SAVED_ALBUMS;
                case 38:
                    return DSA_STATE_CHANGE;
                case 39:
                    return SHOW_RESUME_EPISODE_PROVIDER;
                case 40:
                    return AUTOPLAY_LENS_OBSERVER;
                case 41:
                    return LIST_PLAYER_DECORATOR;
                case 42:
                    return LIST_PLAYER_PLAY_REQUEST_ADAPTER;
                case 43:
                    return PREDEFINED_LISTS;
                case 44:
                    return JAM_LENS_MANAGER;
                case 45:
                    return LIST_PLAYER_QUEUED_ITEMS_FILTER;
                case 46:
                    return LIST_PLAYER_REC_POOL_FILTER;
                case 47:
                    return VOLATILE_CONTEXT;
                case 48:
                    return MULTIGET_ADDITIONAL_RESPONSE;
                case 49:
                    return TRACK_LIST_FACTORY;
                case 50:
                    return LIST_PLAYER_KEEP_PLAYING_FILTER;
                case 51:
                    return LIST_CLIENT;
                case 52:
                    return INTERACTIVE_PLAY_SOURCE;
                case 53:
                    return LIST_PLAYER_RESOLVED_LIST;
                default:
                    return null;
            }
        }

        public static rd50 internalGetValueMap() {
            return internalValueMap;
        }

        public static sd50 internalGetVerifier() {
            return PlaylistSyncCallerVerifier.INSTANCE;
        }

        @Override // p204p.od50
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static PlaylistSyncCaller valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class PlaylistSyncReason extends AbstractC0269h implements PlaylistSyncReasonOrBuilder {
        public static final int CALLER_FIELD_NUMBER = 1;
        private static final PlaylistSyncReason DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int PRIORITIZED_FIELD_NUMBER = 2;
        private int caller_;
        private boolean prioritized_;

        public static final class Builder extends AbstractC0268g implements PlaylistSyncReasonOrBuilder {
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

            public final Builder clearCaller() {
                copyOnWrite();
                PlaylistSyncReason.m19337n((PlaylistSyncReason) this.instance);
                return this;
            }

            public final Builder clearPrioritized() {
                copyOnWrite();
                PlaylistSyncReason.m19338o((PlaylistSyncReason) this.instance);
                return this;
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public final /* bridge */ /* synthetic */ Object mo98328clone() {
                return super.mo98326clone();
            }

            @Override // com.spotify.playlist4.proto.PlaylistSyncReasonProto.PlaylistSyncReasonOrBuilder
            public final PlaylistSyncCaller getCaller() {
                return ((PlaylistSyncReason) this.instance).getCaller();
            }

            @Override // com.spotify.playlist4.proto.PlaylistSyncReasonProto.PlaylistSyncReasonOrBuilder
            public final int getCallerValue() {
                return ((PlaylistSyncReason) this.instance).getCallerValue();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
            public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
                return super.getDefaultInstanceForType();
            }

            @Override // com.spotify.playlist4.proto.PlaylistSyncReasonProto.PlaylistSyncReasonOrBuilder
            public final boolean getPrioritized() {
                return ((PlaylistSyncReason) this.instance).getPrioritized();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            public final /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
                return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
            public final /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
                return super.mergeFrom(oweVar, auxVar);
            }

            public final Builder setCaller(PlaylistSyncCaller playlistSyncCaller) {
                copyOnWrite();
                ((PlaylistSyncReason) this.instance).setCaller(playlistSyncCaller);
                return this;
            }

            public final Builder setCallerValue(int i) {
                copyOnWrite();
                PlaylistSyncReason.m19340q((PlaylistSyncReason) this.instance, i);
                return this;
            }

            public final Builder setPrioritized(boolean z) {
                copyOnWrite();
                PlaylistSyncReason.m19341r((PlaylistSyncReason) this.instance, z);
                return this;
            }

            private Builder() {
                super(PlaylistSyncReason.DEFAULT_INSTANCE);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public final /* bridge */ /* synthetic */ AbstractC2081l8 mo98327clone() {
                return super.mo98326clone();
            }

            @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
            /* JADX INFO: renamed from: mergeFrom */
            public final /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
                return super.mo98329mergeFrom(bArr, i, i2);
            }

            @Override // com.google.protobuf.AbstractC0268g
            /* JADX INFO: renamed from: clone */
            public final /* bridge */ /* synthetic */ ore0 mo98327clone() {
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

        static {
            PlaylistSyncReason playlistSyncReason = new PlaylistSyncReason();
            DEFAULT_INSTANCE = playlistSyncReason;
            AbstractC0269h.registerDefaultInstance(PlaylistSyncReason.class, playlistSyncReason);
        }

        private PlaylistSyncReason() {
        }

        private void clearCaller() {
            this.caller_ = 0;
        }

        private void clearPrioritized() {
            this.prioritized_ = false;
        }

        public static PlaylistSyncReason getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: renamed from: n */
        public static void m19337n(PlaylistSyncReason playlistSyncReason) {
            playlistSyncReason.caller_ = 0;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        /* JADX INFO: renamed from: o */
        public static void m19338o(PlaylistSyncReason playlistSyncReason) {
            playlistSyncReason.prioritized_ = false;
        }

        public static PlaylistSyncReason parseDelimitedFrom(InputStream inputStream) {
            return (PlaylistSyncReason) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlaylistSyncReason parseFrom(ByteBuffer byteBuffer) {
            return (PlaylistSyncReason) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static void m19340q(PlaylistSyncReason playlistSyncReason, int i) {
            playlistSyncReason.caller_ = i;
        }

        /* JADX INFO: renamed from: r */
        public static void m19341r(PlaylistSyncReason playlistSyncReason, boolean z) {
            playlistSyncReason.prioritized_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCaller(PlaylistSyncCaller playlistSyncCaller) {
            this.caller_ = playlistSyncCaller.getNumber();
        }

        private void setCallerValue(int i) {
            this.caller_ = i;
        }

        private void setPrioritized(boolean z) {
            this.prioritized_ = z;
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0007", new Object[]{"caller_", "prioritized_"});
            }
            if (iOrdinal == 3) {
                return new PlaylistSyncReason();
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
            synchronized (PlaylistSyncReason.class) {
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

        @Override // com.spotify.playlist4.proto.PlaylistSyncReasonProto.PlaylistSyncReasonOrBuilder
        public final PlaylistSyncCaller getCaller() {
            PlaylistSyncCaller playlistSyncCallerForNumber = PlaylistSyncCaller.forNumber(this.caller_);
            return playlistSyncCallerForNumber == null ? PlaylistSyncCaller.UNRECOGNIZED : playlistSyncCallerForNumber;
        }

        @Override // com.spotify.playlist4.proto.PlaylistSyncReasonProto.PlaylistSyncReasonOrBuilder
        public final int getCallerValue() {
            return this.caller_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
        public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.spotify.playlist4.proto.PlaylistSyncReasonProto.PlaylistSyncReasonOrBuilder
        public final boolean getPrioritized() {
            return this.prioritized_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }

        public static Builder newBuilder(PlaylistSyncReason playlistSyncReason) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(playlistSyncReason);
        }

        public static PlaylistSyncReason parseDelimitedFrom(InputStream inputStream, aux auxVar) {
            return (PlaylistSyncReason) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static PlaylistSyncReason parseFrom(ByteBuffer byteBuffer, aux auxVar) {
            return (PlaylistSyncReason) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
        }

        public static PlaylistSyncReason parseFrom(gva gvaVar) {
            return (PlaylistSyncReason) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
        }

        public static PlaylistSyncReason parseFrom(gva gvaVar, aux auxVar) {
            return (PlaylistSyncReason) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
        }

        public static PlaylistSyncReason parseFrom(byte[] bArr) {
            return (PlaylistSyncReason) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PlaylistSyncReason parseFrom(byte[] bArr, aux auxVar) {
            return (PlaylistSyncReason) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
        }

        public static PlaylistSyncReason parseFrom(InputStream inputStream) {
            return (PlaylistSyncReason) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlaylistSyncReason parseFrom(InputStream inputStream, aux auxVar) {
            return (PlaylistSyncReason) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
        }

        public static PlaylistSyncReason parseFrom(owe oweVar) {
            return (PlaylistSyncReason) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
        }

        public static PlaylistSyncReason parseFrom(owe oweVar, aux auxVar) {
            return (PlaylistSyncReason) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
        }
    }

    public interface PlaylistSyncReasonOrBuilder extends sre0 {
        PlaylistSyncCaller getCaller();

        int getCallerValue();

        @Override // p204p.sre0
        /* synthetic */ pre0 getDefaultInstanceForType();

        boolean getPrioritized();

        @Override // p204p.sre0
        /* synthetic */ boolean isInitialized();
    }

    private PlaylistSyncReasonProto() {
    }

    public static void registerAllExtensions(aux auxVar) {
    }
}
