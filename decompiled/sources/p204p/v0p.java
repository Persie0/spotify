package p204p;

import android.view.ViewGroup;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class v0p extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f236094a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x0p f236095b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0p(x0p x0pVar, int i) {
        super(0);
        this.f236094a = i;
        this.f236095b = x0pVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f236094a) {
            case 0:
                x0p x0pVar = this.f236095b;
                return Integer.valueOf(Math.min(x0pVar.f256919a.getResources().getDimensionPixelSize(R.dimen.core_bottom_sheet_max_width), x0pVar.f256919a.getResources().getDisplayMetrics().widthPixels));
            case 1:
                x0p x0pVar2 = this.f236095b;
                if (x0pVar2.m89590d()) {
                    x0pVar2.f256941w = new zca(2);
                    x0pVar2.f256943y.add(x0pVar2.f256923e.m83914b());
                    x0pVar2.m89597l(5);
                }
                return w2a1.f247311a;
            case 2:
                x0p x0pVar3 = this.f236095b;
                if (x0pVar3.m89590d()) {
                    x0pVar3.f256941w = new zca(2);
                    x0pVar3.f256943y.add(x0pVar3.f256923e.m83914b());
                    x0pVar3.m89597l(5);
                }
                return w2a1.f247311a;
            default:
                return (ViewGroup) this.f236095b.f256919a.getWindow().getDecorView();
        }
    }
}
