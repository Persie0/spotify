package p204p;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class oz5 {

    /* JADX INFO: renamed from: a */
    public final Context f172078a;

    /* JADX INFO: renamed from: b */
    public final k5m0 f172079b;

    /* JADX INFO: renamed from: c */
    public final z9j0 f172080c;

    /* JADX INFO: renamed from: d */
    public final Activity f172081d;

    public oz5(Context context, k5m0 k5m0Var, z9j0 z9j0Var, Activity activity) {
        this.f172078a = context;
        this.f172079b = k5m0Var;
        this.f172080c = z9j0Var;
        this.f172081d = activity;
    }

    /* JADX INFO: renamed from: a */
    public final void m68618a(String str, List list) {
        Bundle bundle = new Bundle();
        bundle.putString("TITLE", str == null ? this.f172078a.getString(R.string.artist_list_bottom_sheet_title) : str);
        bundle.putStringArrayList("ARTIST_URI_LIST", new ArrayList<>(list));
        Activity activity = this.f172081d;
        z9j0 z9j0Var = this.f172080c;
        if (z9j0Var.mo47349j(activity)) {
            z9j0Var.mo47348i(new p6j0("spotify:internal:artist-list", "", false, false, 0, 0, false, null, null, null), bundle);
        } else {
            k5m0.m55541i(this.f172079b, "spotify:internal:artist-list", null, bundle, false, 10);
        }
    }
}
