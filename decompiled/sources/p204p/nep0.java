package p204p;

import android.content.res.Resources;
import com.spotify.music.R;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class nep0 implements vr2 {

    /* JADX INFO: renamed from: a */
    public final Resources f153048a;

    /* JADX INFO: renamed from: b */
    public final l54 f153049b;

    public nep0(Resources resources, l54 l54Var) {
        this.f153048a = resources;
        this.f153049b = l54Var;
    }

    @Override // p204p.vr2
    /* JADX INFO: renamed from: f */
    public final List mo64267f() {
        Resources resources = this.f153048a;
        return h6f.m46715L(new imr(resources.getString(R.string.ai_disclosure_prompted_playlists_learn_link), "https://www.spotify.com/legal/privacy-policy"), new imr(resources.getString(R.string.ai_disclosure_prompted_playlists_usage_limits_link), this.f153049b.m58192a() ? "spotify:internal:ai-usage-limits" : "https://support.spotify.com/article/prompted-playlists/"));
    }

    @Override // p204p.vr2
    /* JADX INFO: renamed from: i */
    public final String mo64268i() {
        return this.f153048a.getString(R.string.ai_disclosure_prompted_playlists_subtitle);
    }

    @Override // p204p.vr2
    public final String title() {
        return this.f153048a.getString(R.string.ai_disclosure_prompted_playlists_title);
    }
}
