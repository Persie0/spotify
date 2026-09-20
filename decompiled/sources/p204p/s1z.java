package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class s1z {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ s1z[] f204857a = {new s1z("VideosOnly", 0), new s1z("ExcludeVideos", 1), new s1z("UnplayedOnly", 2), new s1z("NotLocalTrack", 3), new s1z("ExcludeBanned", 4), new s1z("InProgressOnly", 5), new s1z("ExcludeEpisodes", 6), new s1z("ExcludeExplicit", 7), new s1z("ExcludeUnavailable", 8), new s1z("ExcludeEpisodeTrailers", 9), new s1z("FullyPlayedOnly", 10), new s1z("NotFullyPlayedOnly", 11), new s1z("AvailableOfflineOnly", 12), new s1z("ExcludeItemsWithBannedArtist", 13), new s1z("ExcludeInjectedRecommendations", 14), new s1z("OnlyInjectedRecommendations", 15), new s1z("RowId", 16), new s1z("Text", 17), new s1z("Descriptor", 18), new s1z("FormatListAttributeKeys", 19)};

    /* JADX INFO: Fake field, exist only in values array */
    s1z EF5;

    public static s1z valueOf(String str) {
        return (s1z) Enum.valueOf(s1z.class, str);
    }

    public static s1z[] values() {
        return (s1z[]) f204857a.clone();
    }
}
