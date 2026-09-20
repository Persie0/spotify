package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class dx00 implements fka1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53815a;

    public /* synthetic */ dx00(int i) {
        this.f53815a = i;
    }

    /* JADX INFO: renamed from: a */
    public static ktn0 m37177a(String str) {
        eka1 eka1Var = (eka1) gtn0.f84245d.getValue();
        Set set = ff41.f68906e;
        ff41 ff41VarM44796g = gif1.m44796g(str);
        he41 he41VarM39275a = ff41VarM44796g == null ? null : eka1Var.m39275a(ff41VarM44796g);
        if (he41VarM39275a instanceof ktn0) {
            return (ktn0) he41VarM39275a;
        }
        return null;
    }

    @Override // p204p.fka1
    public final String getKey() {
        switch (this.f53815a) {
            case 0:
                return "GenAlphaAccountLinkingUris.ManagedAccountLinkingTeenEducation";
            case 1:
                return "LiveroomUris.LiveroomErrorDialog";
            case 2:
                return "LyricsUris.LyricsLanguagePicker";
            case 3:
                return "MarketingUris.WrappedCustomizeShareCard";
            case 4:
                return "MultiSongTrackUris.MultiSongTrack";
            case 5:
                return "ParentalControl.ManagedAccountDetailsProfileVisibilitySettingsTeen";
            case 6:
                return "ParentalControl.ParentalControlRemoveParent";
            case 7:
                return "PersonalPodcast.PersonalPodcastCreate";
            case 8:
                return "PersonalPodcast.PersonalPodcastLocationPicker";
            case 9:
                return "PersonalPodcast.PersonalPodcastPresetPreview";
            case 10:
                return "PersonalPodcastOnboarding.PersonalPodcastOnboardingCustomPrompt";
            case 11:
                return "PersonalPodcastOnboarding.PersonalPodcastOnboardingHost";
            case 12:
                return "PersonalPodcastOnboarding.PersonalPodcastOnboardingPersonalization";
            case 13:
                return "PersonalPodcastOnboarding.PersonalPodcastOnboardingPersonalizationLocationPicker";
            case 14:
                return "PersonalPodcastOnboarding.PersonalPodcastOnboardingPersonalizationQuestionnaire";
            case 15:
                return "PersonalPodcastOnboarding.PersonalPodcastOnboardingPresetPicker";
            case 16:
                return "PersonalPodcastOnboarding.PersonalPodcastOnboardingPresetPreview";
            case 17:
                return "PersonalPodcastOnboarding.PersonalPodcastOnboardingPresetSubmit";
            case 18:
                return "PlayUris.PlayNowplayingQueuePeek";
            case 19:
                return "PlaylistUris.AddToPlaylist";
            case 20:
                return "PlaylistUris.CoverArtSnake";
            case 21:
                return "PlaylistUris.FolderRename";
            case 22:
                return "PlaylistUris.ListCreationMenu";
            case 23:
                return "PlaylistUris.NewPlaylist";
            case 24:
                return "PlaylistUris.ParametrizedPlaylistFormat";
            case 25:
                return "PlaylistUris.PlaylistAllSongs";
            case 26:
                return "PlaylistUris.PlaylistEdit";
            case 27:
                return "PlaylistUris.PlaylistEditCoverart";
            case 28:
                return "PlaylistUris.PlaylistEditItems";
            default:
                return "PlaylistUris.PlaylistEditMetadata";
        }
    }
}
