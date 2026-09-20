package p204p;

import android.content.res.Resources;
import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class cz00 {

    /* JADX INFO: renamed from: a */
    public final Resources f43412a;

    public /* synthetic */ cz00(Resources resources) {
        this.f43412a = resources;
    }

    /* JADX INFO: renamed from: a */
    public String m34404a(qy00 qy00Var) {
        String string;
        int iM38547C = edb.m38547C(qy00Var.f193777b);
        Resources resources = this.f43412a;
        if (iM38547C == 0) {
            string = resources.getString(R.string.gen_alpha_blocking_track_subheading_inverted, resources.getString(R.string.gen_alpha_blocking_artist_subheading_safety_center_label));
        } else {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            string = resources.getString(R.string.gen_alpha_blocking_artist_subheading_inverted, resources.getString(R.string.gen_alpha_blocking_artist_subheading_safety_center_label));
        }
        wj50.m88279p(string);
        return string;
    }

    /* JADX INFO: renamed from: b */
    public String m34405b(qy00 qy00Var) {
        String string;
        int iM38547C = edb.m38547C(qy00Var.f193777b);
        Resources resources = this.f43412a;
        if (iM38547C == 0) {
            string = resources.getString(R.string.gen_alpha_blocking_track_title);
        } else {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            string = resources.getString(R.string.gen_alpha_blocking_artist_title);
        }
        wj50.m88279p(string);
        return string;
    }
}
