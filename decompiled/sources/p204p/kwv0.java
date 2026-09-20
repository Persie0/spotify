package p204p;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes10.dex */
public final class kwv0 extends n09 {

    /* JADX INFO: renamed from: h */
    public final m500 f127251h;

    /* JADX INFO: renamed from: i */
    public final iwv0 f127252i;

    public kwv0(m500 m500Var, iwv0 iwv0Var) {
        super(m500Var);
        this.f127251h = m500Var;
        this.f127252i = iwv0Var;
    }

    @Override // p204p.n09, p204p.z281
    /* JADX INFO: renamed from: a */
    public final Integer mo57572a() {
        Resources resources = this.f127251h.getResources();
        this.f127252i.getClass();
        return Integer.valueOf(resources.getDimensionPixelOffset(R.dimen.tooltip_distance_from_view));
    }

    @Override // p204p.n09
    /* JADX INFO: renamed from: g */
    public final int mo57573g() {
        return R.layout.reinvent_free_tooltip_with_arrow;
    }

    @Override // p204p.n09
    /* JADX INFO: renamed from: j */
    public final void mo57574j(View view) {
        ((TextView) view.findViewById(R.id.title)).setText(this.f127252i.f106519b);
        ((TextView) view.findViewById(R.id.action)).setText(R.string.reinvent_free_explore_premium);
    }
}
