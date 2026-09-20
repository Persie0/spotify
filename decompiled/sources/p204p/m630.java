package p204p;

import android.widget.FrameLayout;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes2.dex */
public final class m630 implements q9d1 {

    /* JADX INFO: renamed from: a */
    public final ao20 f140350a;

    public m630(ao20 ao20Var) {
        this.f140350a = ao20Var;
    }

    @Override // p204p.q9d1
    /* JADX INFO: renamed from: a */
    public final void mo60937a(Object obj, FrameLayout frameLayout) {
        un20 un20Var = (un20) obj;
        if (un20Var != null) {
            frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), frameLayout.getContext().getResources().getDimensionPixelSize(R.dimen.spacer_8));
        } else {
            frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), 0);
        }
        this.f140350a.mo26555a(un20Var, frameLayout);
    }
}
