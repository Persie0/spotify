package p204p;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public abstract class pj30 implements qj30 {
    @Override // p204p.qj30
    /* JADX INFO: renamed from: b */
    public final View mo34548b(ViewGroup viewGroup, sk30 sk30Var) {
        oj30 oj30VarMo26369f = mo26369f(viewGroup, sk30Var);
        View view = oj30VarMo26369f.f165949a;
        view.setTag(R.id.hub_framework_view_holder_tag, oj30VarMo26369f);
        return view;
    }

    @Override // p204p.qj30
    /* JADX INFO: renamed from: d */
    public final void mo34549d(View view, fk30 fk30Var, sk30 sk30Var, mqr mqrVar) {
        Object tag = view.getTag(R.id.hub_framework_view_holder_tag);
        tag.getClass();
        ((oj30) tag).mo32903a(fk30Var, sk30Var, mqrVar);
    }

    @Override // p204p.qj30
    /* JADX INFO: renamed from: e */
    public void mo34550e(View view, fk30 fk30Var, int... iArr) {
        Object tag = view.getTag(R.id.hub_framework_view_holder_tag);
        tag.getClass();
        ((oj30) tag).mo32904b(iArr);
    }

    /* JADX INFO: renamed from: f */
    public abstract oj30 mo26369f(ViewGroup viewGroup, sk30 sk30Var);
}
