package p204p;

import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class xie1 extends hjv0 {

    /* JADX INFO: renamed from: d */
    public final f3d0 f261860d;

    public xie1(f3d0 f3d0Var) {
        this.f261860d = f3d0Var;
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: e */
    public final int mo1617e() {
        return this.f261860d.f65474C1.f162759e;
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: n */
    public final void mo1619n(int i, dkv0 dkv0Var) {
        wie1 wie1Var = (wie1) dkv0Var;
        f3d0 f3d0Var = this.f261860d;
        int i2 = f3d0Var.f65474C1.f162755a.f74747c + i;
        String string = wie1Var.f251618S0.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        TextView textView = wie1Var.f251618S0;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        textView.setContentDescription(String.format(string, Integer.valueOf(i2)));
        i26 i26Var = f3d0Var.f65477F1;
        if (kza1.m57747b().get(1) == i2) {
            Object obj = i26Var.f97753c;
        } else {
            Object obj2 = i26Var.f97752b;
        }
        throw null;
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: p */
    public final dkv0 mo1620p(int i, ViewGroup viewGroup) {
        return new wie1((TextView) adn.m25591c(viewGroup, R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
