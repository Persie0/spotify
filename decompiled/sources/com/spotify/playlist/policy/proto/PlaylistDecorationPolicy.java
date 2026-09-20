package com.spotify.playlist.policy.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import java.util.Iterator;
import p204p.AbstractC1733c9;
import p204p.ajp0;
import p204p.bjp0;
import p204p.n350;
import p204p.ntx;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaylistDecorationPolicy extends AbstractC0269h implements sre0 {
    public static final int AI_CURATION_REFERENCE_ID_FIELD_NUMBER = 48;
    public static final int ALLOWS_FIELD_NUMBER = 35;
    public static final int AVAILABLE_CONCEPTS_FIELD_NUMBER = 52;
    public static final int AVAILABLE_LANGUAGES_FIELD_NUMBER = 56;
    public static final int AVAILABLE_SIGNALS_FIELD_NUMBER = 47;
    public static final int BASE_PERMISSION_FIELD_NUMBER = 41;
    public static final int BROWSABLE_OFFLINE_FIELD_NUMBER = 23;
    public static final int CAN_REPORT_ANNOTATION_ABUSE_FIELD_NUMBER = 16;
    public static final int COLLABORATING_USERS_FIELD_NUMBER = 40;
    public static final int COLLABORATIVE_FIELD_NUMBER = 6;
    public static final int CONTAINS_AUDIO_EPISODES_FIELD_NUMBER = 30;
    public static final int CONTAINS_EPISODES_FIELD_NUMBER = 29;
    public static final int CONTAINS_MUSIC_VIDEOS_FIELD_NUMBER = 58;
    public static final int CONTAINS_SPOTIFY_TRACKS_FIELD_NUMBER = 27;
    public static final int CONTAINS_TRACKS_FIELD_NUMBER = 28;
    public static final int CONTENT_SIGNATURE_FIELD_NUMBER = 53;
    public static final int CREATED_AT_FIELD_NUMBER = 51;
    private static final PlaylistDecorationPolicy DEFAULT_INSTANCE;
    public static final int DELETED_BY_OWNER_FIELD_NUMBER = 54;
    public static final int DESCRIPTION_FIELD_NUMBER = 11;
    public static final int DESCRIPTION_FROM_ANNOTATE_FIELD_NUMBER = 14;
    public static final int DURATION_FIELD_NUMBER = 10;
    public static final int EXTENSION_FIELD_NUMBER = 43;
    public static final int FOLLOWED_FIELD_NUMBER = 17;
    public static final int FOLLOWERS_FIELD_NUMBER = 18;
    public static final int FORMAT_LIST_ATTRIBUTES_FIELD_NUMBER = 25;
    public static final int FORMAT_LIST_TYPE_FIELD_NUMBER = 24;
    public static final int HAS_EXPLICIT_CONTENT_FIELD_NUMBER = 26;
    public static final int IS_ON_DEMAND_IN_FREE_FIELD_NUMBER = 32;
    public static final int LAST_MODIFICATION_FIELD_NUMBER = 8;
    public static final int LENGTH_FIELD_NUMBER = 7;
    public static final int LENGTH_IGNORING_TEXT_FILTER_FIELD_NUMBER = 45;
    public static final int LENSES_FIELD_NUMBER = 44;
    public static final int LINK_FIELD_NUMBER = 2;
    public static final int LOADED_FIELD_NUMBER = 5;
    public static final int LOAD_STATE_FIELD_NUMBER = 4;
    public static final int MADE_FOR_FIELD_NUMBER = 34;
    public static final int NAME_FIELD_NUMBER = 3;
    public static final int NUMBER_OF_EPISODES_FIELD_NUMBER = 36;
    public static final int NUMBER_OF_ITEMS_PER_LINK_TYPE_FIELD_NUMBER = 46;
    public static final int NUMBER_OF_TRACKS_FIELD_NUMBER = 37;
    public static final int OFFLINE_FIELD_NUMBER = 20;
    public static final int ONLY_CONTAINS_EXPLICIT_FIELD_NUMBER = 31;
    public static final int ON_DEMAND_IN_FREE_REASON_FIELD_NUMBER = 39;
    public static final int OWNED_BY_SELF_FIELD_NUMBER = 19;
    public static final int OWNER_FIELD_NUMBER = 33;
    private static volatile r2n0 PARSER = null;
    public static final int PICTURE_FIELD_NUMBER = 12;
    public static final int PICTURE_FROM_ANNOTATE_FIELD_NUMBER = 15;
    public static final int PLAYABLE_FIELD_NUMBER = 13;
    public static final int PREFER_LINEAR_PLAYBACK_FIELD_NUMBER = 38;
    public static final int PUBLISHED_FIELD_NUMBER = 22;
    public static final int ROW_ID_FIELD_NUMBER = 1;
    public static final int SORT_MANIFEST_FIELD_NUMBER = 57;
    public static final int SYNC_PROGRESS_FIELD_NUMBER = 21;
    public static final int TAG_MANIFEST_FIELD_NUMBER = 59;
    public static final int TOTAL_LENGTH_FIELD_NUMBER = 9;
    public static final int UNFILTERED_LENGTH_FIELD_NUMBER = 50;
    public static final int UNRANGED_LENGTH_FIELD_NUMBER = 49;
    public static final int USER_CAPABILITIES_FIELD_NUMBER = 42;
    public static final int USER_CREATED_FIELD_NUMBER = 55;
    private static final vd50 extension_converter_ = new ajp0();
    private boolean aiCurationReferenceId_;
    private PlaylistAllowsDecorationPolicy allows_;
    private AvailableConcepts availableConcepts_;
    private AvailableLanguages availableLanguages_;
    private boolean availableSignals_;
    private boolean basePermission_;
    private int bitField0_;
    private boolean browsableOffline_;
    private boolean canReportAnnotationAbuse_;
    private CollaboratingUsersDecorationPolicy collaboratingUsers_;
    private boolean collaborative_;
    private boolean containsAudioEpisodes_;
    private boolean containsEpisodes_;
    private boolean containsMusicVideos_;
    private boolean containsSpotifyTracks_;
    private boolean containsTracks_;
    private boolean contentSignature_;
    private boolean createdAt_;
    private boolean deletedByOwner_;
    private boolean descriptionFromAnnotate_;
    private boolean description_;
    private boolean duration_;
    private int extensionMemoizedSerializedSize;
    private ud50 extension_ = AbstractC0269h.emptyIntList();
    private boolean followed_;
    private boolean followers_;
    private boolean formatListAttributes_;
    private boolean formatListType_;
    private boolean hasExplicitContent_;
    private boolean isOnDemandInFree_;
    private boolean lastModification_;
    private boolean lengthIgnoringTextFilter_;
    private boolean length_;
    private boolean lenses_;
    private boolean link_;
    private boolean loadState_;
    private boolean loaded_;
    private UserDecorationPolicy madeFor_;
    private boolean name_;
    private boolean numberOfEpisodes_;
    private boolean numberOfItemsPerLinkType_;
    private boolean numberOfTracks_;
    private boolean offline_;
    private boolean onDemandInFreeReason_;
    private boolean onlyContainsExplicit_;
    private boolean ownedBySelf_;
    private UserDecorationPolicy owner_;
    private boolean pictureFromAnnotate_;
    private boolean picture_;
    private boolean playable_;
    private boolean preferLinearPlayback_;
    private boolean published_;
    private boolean rowId_;
    private boolean sortManifest_;
    private boolean syncProgress_;
    private boolean tagManifest_;
    private boolean totalLength_;
    private boolean unfilteredLength_;
    private boolean unrangedLength_;
    private boolean userCapabilities_;
    private boolean userCreated_;

    static {
        PlaylistDecorationPolicy playlistDecorationPolicy = new PlaylistDecorationPolicy();
        DEFAULT_INSTANCE = playlistDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(PlaylistDecorationPolicy.class, playlistDecorationPolicy);
    }

    private PlaylistDecorationPolicy() {
    }

    /* JADX INFO: renamed from: A */
    public static void m18332A(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.duration_ = true;
    }

    /* JADX INFO: renamed from: B */
    public static void m18333B(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.followed_ = true;
    }

    /* JADX INFO: renamed from: C */
    public static void m18334C(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.followers_ = true;
    }

    /* JADX INFO: renamed from: D */
    public static void m18335D(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.formatListAttributes_ = true;
    }

    /* JADX INFO: renamed from: E */
    public static void m18336E(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.formatListType_ = true;
    }

    /* JADX INFO: renamed from: F */
    public static void m18337F(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.hasExplicitContent_ = true;
    }

    /* JADX INFO: renamed from: G */
    public static void m18338G(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.lastModification_ = true;
    }

    /* JADX INFO: renamed from: H */
    public static void m18339H(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.length_ = true;
    }

    /* JADX INFO: renamed from: I */
    public static void m18340I(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.lengthIgnoringTextFilter_ = true;
    }

    /* JADX INFO: renamed from: J */
    public static void m18341J(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.lenses_ = true;
    }

    /* JADX INFO: renamed from: K */
    public static void m18342K(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.link_ = true;
    }

    /* JADX INFO: renamed from: L */
    public static void m18343L(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.loaded_ = true;
    }

    /* JADX INFO: renamed from: M */
    public static void m18344M(PlaylistDecorationPolicy playlistDecorationPolicy, UserDecorationPolicy userDecorationPolicy) {
        playlistDecorationPolicy.getClass();
        userDecorationPolicy.getClass();
        playlistDecorationPolicy.madeFor_ = userDecorationPolicy;
        playlistDecorationPolicy.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: N */
    public static void m18345N(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.name_ = true;
    }

    /* JADX INFO: renamed from: O */
    public static void m18346O(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.numberOfItemsPerLinkType_ = true;
    }

    /* JADX INFO: renamed from: P */
    public static void m18347P(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.offline_ = true;
    }

    /* JADX INFO: renamed from: Q */
    public static void m18348Q(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.onDemandInFreeReason_ = true;
    }

    /* JADX INFO: renamed from: R */
    public static void m18349R(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.onlyContainsExplicit_ = true;
    }

    /* JADX INFO: renamed from: S */
    public static void m18350S(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.ownedBySelf_ = true;
    }

    /* JADX INFO: renamed from: T */
    public static void m18351T(PlaylistDecorationPolicy playlistDecorationPolicy, UserDecorationPolicy userDecorationPolicy) {
        playlistDecorationPolicy.getClass();
        userDecorationPolicy.getClass();
        playlistDecorationPolicy.owner_ = userDecorationPolicy;
        playlistDecorationPolicy.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: U */
    public static void m18352U(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.picture_ = true;
    }

    /* JADX INFO: renamed from: V */
    public static void m18353V(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.pictureFromAnnotate_ = true;
    }

    /* JADX INFO: renamed from: W */
    public static void m18354W(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.playable_ = true;
    }

    /* JADX INFO: renamed from: X */
    public static void m18355X(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.published_ = true;
    }

    /* JADX INFO: renamed from: Y */
    public static void m18356Y(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.rowId_ = true;
    }

    /* JADX INFO: renamed from: Z */
    public static void m18357Z(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.sortManifest_ = true;
    }

    /* JADX INFO: renamed from: a0 */
    public static void m18358a0(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.syncProgress_ = true;
    }

    /* JADX INFO: renamed from: b0 */
    public static void m18359b0(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.tagManifest_ = true;
    }

    /* JADX INFO: renamed from: c0 */
    public static void m18360c0(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.totalLength_ = true;
    }

    /* JADX INFO: renamed from: d0 */
    public static void m18361d0(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.unrangedLength_ = true;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m18362e0(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.userCapabilities_ = true;
    }

    /* JADX INFO: renamed from: f0 */
    public static void m18363f0(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.userCreated_ = true;
    }

    /* JADX INFO: renamed from: g0 */
    public static PlaylistDecorationPolicy m18364g0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: h0 */
    public static bjp0 m18365h0() {
        return (bjp0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m18366n(PlaylistDecorationPolicy playlistDecorationPolicy, ArrayList arrayList) {
        ud50 ud50Var = playlistDecorationPolicy.extension_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            playlistDecorationPolicy.extension_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((n350) playlistDecorationPolicy.extension_).m63581b(((Integer) it.next()).intValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static void m18367o(PlaylistDecorationPolicy playlistDecorationPolicy, ntx ntxVar) {
        playlistDecorationPolicy.getClass();
        ud50 ud50Var = playlistDecorationPolicy.extension_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            playlistDecorationPolicy.extension_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        ((n350) playlistDecorationPolicy.extension_).m63581b(ntxVar.getNumber());
    }

    /* JADX INFO: renamed from: p */
    public static void m18368p(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.aiCurationReferenceId_ = true;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m18369q(PlaylistDecorationPolicy playlistDecorationPolicy, AvailableConcepts availableConcepts) {
        playlistDecorationPolicy.getClass();
        availableConcepts.getClass();
        playlistDecorationPolicy.availableConcepts_ = availableConcepts;
        playlistDecorationPolicy.bitField0_ |= 16;
    }

    /* JADX INFO: renamed from: r */
    public static void m18370r(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.availableSignals_ = true;
    }

    /* JADX INFO: renamed from: s */
    public static void m18371s(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.basePermission_ = true;
    }

    /* JADX INFO: renamed from: t */
    public static void m18372t(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.canReportAnnotationAbuse_ = true;
    }

    /* JADX INFO: renamed from: u */
    public static void m18373u(PlaylistDecorationPolicy playlistDecorationPolicy, CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy) {
        playlistDecorationPolicy.getClass();
        collaboratingUsersDecorationPolicy.getClass();
        playlistDecorationPolicy.collaboratingUsers_ = collaboratingUsersDecorationPolicy;
        playlistDecorationPolicy.bitField0_ |= 8;
    }

    /* JADX INFO: renamed from: v */
    public static void m18374v(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.collaborative_ = true;
    }

    /* JADX INFO: renamed from: w */
    public static void m18375w(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.containsMusicVideos_ = true;
    }

    /* JADX INFO: renamed from: x */
    public static void m18376x(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.createdAt_ = true;
    }

    /* JADX INFO: renamed from: y */
    public static void m18377y(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.deletedByOwner_ = true;
    }

    /* JADX INFO: renamed from: z */
    public static void m18378z(PlaylistDecorationPolicy playlistDecorationPolicy) {
        playlistDecorationPolicy.description_ = true;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000;\u0000\u0001\u0001;;\u0000\u0001\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007\u000b\u0007\f\u0007\r\u0007\u000e\u0007\u000f\u0007\u0010\u0007\u0011\u0007\u0012\u0007\u0013\u0007\u0014\u0007\u0015\u0007\u0016\u0007\u0017\u0007\u0018\u0007\u0019\u0007\u001a\u0007\u001b\u0007\u001c\u0007\u001d\u0007\u001e\u0007\u001f\u0007 \u0007!ဉ\u0000\"ဉ\u0001#ဉ\u0002$\u0007%\u0007&\u0007'\u0007(ဉ\u0003)\u0007*\u0007+,,\u0007-\u0007.\u0007/\u00070\u00071\u00072\u00073\u00074ဉ\u00045\u00076\u00077\u00078ဉ\u00059\u0007:\u0007;\u0007", new Object[]{"bitField0_", "rowId_", "link_", "name_", "loadState_", "loaded_", "collaborative_", "length_", "lastModification_", "totalLength_", "duration_", "description_", "picture_", "playable_", "descriptionFromAnnotate_", "pictureFromAnnotate_", "canReportAnnotationAbuse_", "followed_", "followers_", "ownedBySelf_", "offline_", "syncProgress_", "published_", "browsableOffline_", "formatListType_", "formatListAttributes_", "hasExplicitContent_", "containsSpotifyTracks_", "containsTracks_", "containsEpisodes_", "containsAudioEpisodes_", "onlyContainsExplicit_", "isOnDemandInFree_", "owner_", "madeFor_", "allows_", "numberOfEpisodes_", "numberOfTracks_", "preferLinearPlayback_", "onDemandInFreeReason_", "collaboratingUsers_", "basePermission_", "userCapabilities_", "extension_", "lenses_", "lengthIgnoringTextFilter_", "numberOfItemsPerLinkType_", "availableSignals_", "aiCurationReferenceId_", "unrangedLength_", "unfilteredLength_", "createdAt_", "availableConcepts_", "contentSignature_", "deletedByOwner_", "userCreated_", "availableLanguages_", "sortManifest_", "containsMusicVideos_", "tagManifest_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new bjp0(DEFAULT_INSTANCE);
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
        synchronized (PlaylistDecorationPolicy.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
