package p204p;

import android.content.Context;
import android.content.res.Resources;
import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class dse1 {

    /* JADX INFO: renamed from: a */
    public final oa81 f52555a;

    /* JADX INFO: renamed from: b */
    public final Resources f52556b;

    public dse1(Context context, oa81 oa81Var) {
        this.f52555a = oa81Var;
        this.f52556b = context.getResources();
    }

    /* JADX INFO: renamed from: a */
    public final String m36759a(String str, boolean z) {
        if (!z) {
            return str;
        }
        Resources resources = this.f52556b;
        return str == null ? resources.getString(R.string.item_description_album_empty_creator) : resources.getString(R.string.item_description_album, str);
    }

    /* JADX INFO: renamed from: b */
    public final String m36760b(int i, int i2) {
        Resources resources = this.f52556b;
        if (i == 0 && i2 == 0) {
            return resources.getString(R.string.item_description_folder_empty);
        }
        if (i2 == 0) {
            return resources.getQuantityString(R.plurals.item_description_folder_playlists_count, i, Integer.valueOf(i));
        }
        return i == 0 ? resources.getQuantityString(R.plurals.item_description_folder_folders_count, i2, Integer.valueOf(i2)) : resources.getString(R.string.item_description_folder_combined, resources.getQuantityString(R.plurals.item_description_folder_playlists_count, i, Integer.valueOf(i)), resources.getQuantityString(R.plurals.item_description_folder_folders_count, i2, Integer.valueOf(i2)));
    }

    /* JADX INFO: renamed from: c */
    public final String m36761c() {
        return this.f52556b.getString(R.string.item_name_liked_songs);
    }

    /* JADX INFO: renamed from: d */
    public final String m36762d() {
        return this.f52556b.getString(R.string.item_name_local_files);
    }

    /* JADX INFO: renamed from: e */
    public final String m36763e() {
        return this.f52556b.getString(R.string.item_name_new_episodes);
    }

    /* JADX INFO: renamed from: f */
    public final String m36764f(String str, boolean z, String str2, boolean z2) {
        Resources resources = this.f52556b;
        if (z && str2.length() == 0 && (str == null || str.length() == 0)) {
            return resources.getString(R.string.item_description_playlist_empty_creator);
        }
        if (z && str2.length() == 0 && str != null) {
            return resources.getString(z2 ? R.string.item_description_mixed_playlist : R.string.item_description_playlist, str);
        }
        if (z && str2.length() > 0) {
            return resources.getString(R.string.item_description_playlist_made_for_subtitle_with_type, str2);
        }
        if (z || str2.length() <= 0) {
            return z2 ? resources.getString(R.string.item_description_playlist_mixed_by, str) : str;
        }
        return resources.getString(R.string.item_description_playlist_made_for_subtitle_without_type, str2);
    }

    /* JADX INFO: renamed from: g */
    public final String m36765g(int i, String str) {
        int iM38547C = edb.m38547C(i);
        Resources resources = this.f52556b;
        if (iM38547C == 0) {
            if (str == null || str.length() == 0) {
                String string = resources.getString(R.string.item_description_album_prerelease_empty_creator);
                wj50.m88279p(string);
                return string;
            }
            String string2 = resources.getString(R.string.item_description_album_prerelease, str);
            wj50.m88279p(string2);
            return string2;
        }
        if (iM38547C != 1) {
            if (iM38547C == 2) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }
        if (str == null || str.length() == 0) {
            String string3 = resources.getString(R.string.item_description_audiobook_prerelease_empty_creator);
            wj50.m88279p(string3);
            return string3;
        }
        String string4 = resources.getString(R.string.item_description_audiobook_prerelease, str);
        wj50.m88279p(string4);
        return string4;
    }

    /* JADX INFO: renamed from: h */
    public final String m36766h(String str, Long l, boolean z) {
        boolean z2 = str != null;
        Resources resources = this.f52556b;
        if (z) {
            return z2 ? resources.getString(R.string.item_description_show, str) : resources.getString(R.string.item_description_show_empty_creator);
        }
        boolean z3 = l != null;
        oa81 oa81Var = this.f52555a;
        if (z2 && z3) {
            return resources.getString(R.string.item_description_show_date_and_creator, oa81Var.m66529e(l.longValue()), str);
        }
        if (z3) {
            return oa81Var.m66529e(l.longValue());
        }
        if (z2) {
            return str;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final String m36767i() {
        return this.f52556b.getString(R.string.item_name_your_episodes);
    }

    /* JADX INFO: renamed from: j */
    public final String m36768j() {
        return this.f52556b.getString(R.string.item_name_your_library);
    }
}
