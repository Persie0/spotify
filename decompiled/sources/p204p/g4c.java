package p204p;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class g4c extends ti30 {

    /* JADX INFO: renamed from: g */
    public final int f76386g;

    public g4c(sk30 sk30Var, int i) {
        super(sk30Var);
        this.f76386g = i;
    }

    @Override // p204p.ti30, p204p.hjv0
    /* JADX INFO: renamed from: A */
    public final si30 mo1620p(int i, ViewGroup viewGroup) {
        si30 si30VarMo1620p = super.mo1620p(i, viewGroup);
        View view = si30VarMo1620p.f50039a;
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View viewFindViewById = view.findViewById(R.id.hero_area);
        if (viewFindViewById != null) {
            h6j h6jVar = new h6j(-1, -2);
            h6jVar.f88119Q = this.f76386g;
            viewFindViewById.setLayoutParams(h6jVar);
        }
        return si30VarMo1620p;
    }
}
