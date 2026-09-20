package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class i4j0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f98535a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ j4j0 f98536b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i4j0(j4j0 j4j0Var, int i) {
        super(0);
        this.f98535a = i;
        this.f98536b = j4j0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f98535a) {
            case 0:
                return Integer.valueOf(this.f98536b.f108712b.getResources().getDimensionPixelSize(R.dimen.main_layout_large_floating_margin));
            default:
                return Float.valueOf(u1x0.m82232a(R.dimen.main_layout_large_navigation_bar_width_fragment_fraction, this.f98536b.f108712b.getResources()));
        }
    }
}
