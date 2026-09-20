package p204p;

import android.widget.FrameLayout;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes5.dex */
public final class noa implements q9d1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f156634a;

    /* JADX INFO: renamed from: b */
    public final ao20 f156635b;

    public /* synthetic */ noa(ao20 ao20Var, int i) {
        this.f156634a = i;
        this.f156635b = ao20Var;
    }

    @Override // p204p.q9d1
    /* JADX INFO: renamed from: a */
    public final void mo60937a(Object obj, FrameLayout frameLayout) {
        switch (this.f156634a) {
            case 0:
                un20 un20Var = (un20) obj;
                if (un20Var != null) {
                    frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), frameLayout.getContext().getResources().getDimensionPixelSize(R.dimen.spacer_16));
                } else {
                    frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), 0);
                }
                this.f156635b.mo26555a(un20Var, frameLayout);
                break;
            default:
                un20 un20Var2 = (un20) obj;
                if (un20Var2 != null) {
                    frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getContext().getResources().getDimensionPixelSize(R.dimen.spacer_8), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
                } else {
                    frameLayout.setPadding(frameLayout.getPaddingLeft(), 0, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
                }
                this.f156635b.mo26555a(un20Var2, frameLayout);
                break;
        }
    }
}
