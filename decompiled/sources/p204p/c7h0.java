package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class c7h0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m31712a(int i) {
        switch (i) {
            case 1:
                return "blends";
            case 2:
                return "collaborative_playlists";
            case 3:
                return "content_sharing";
            case 4:
                return "family";
            case 5:
                return "following";
            case 6:
                return "group_sessions";
            case 7:
                return "messaging";
            case 8:
                return "unspecified";
            case 9:
                return "wrapped_party";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m31713b(int i) {
        switch (i) {
            case 1:
                return "audio_quality";
            case 2:
                return "download";
            case 3:
                return "music_video";
            case 4:
                return "queue_reorder";
            case 5:
                return "shuffle";
            case 6:
                return "skip_next";
            case 7:
                return "track_select";
            case 8:
                return "track_select_search";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m31714c(int i) {
        if (i == 1) {
            return "capped_drag_handle";
        }
        if (i == 2) {
            return "capped_tap_to_play";
        }
        if (i == 3) {
            return "play_modes_button";
        }
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static int m31715d(Parcelable.Creator creator, Parcel parcel, ArrayList arrayList, int i, int i2) {
        arrayList.add(creator.createFromParcel(parcel));
        return i + i2;
    }
}
