package p204p;

import android.content.Context;
import android.widget.TextView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes5.dex */
public final class v47 implements qir0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f237085a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f237086b;

    public /* synthetic */ v47(Object obj, int i) {
        this.f237085a = i;
        this.f237086b = obj;
    }

    @Override // p204p.qir0
    public final Object get() {
        switch (this.f237085a) {
            case 0:
                return Boolean.valueOf(((w47) this.f237086b).f247725f.get() != null);
            case 1:
                zu0 zu0Var = (zu0) ((ewm) this.f237086b).f63572a.f276419c;
                Context context = (Context) ((e4w) zu0Var.f286300c).f56183b.get();
                jg31.m53271i(context);
                return new si80(context, (qwf) ((h4t0) zu0Var.f286305h).get(), (yjh0) ((h4t0) zu0Var.f286306i).get());
            case 2:
                return ((C2098lp) this.f237086b).mo26174a(null);
            case 3:
                return new pr91((i7o0) this.f237086b);
            case 4:
                return new or91((ir91) this.f237086b);
            case 5:
                return (xzo) ((fju) this.f237086b).mo26174a(null);
            case 6:
                return ((gju) this.f237086b).mo26174a(null);
            case 7:
                return ((hju) this.f237086b).mo26174a(null);
            case 8:
                return ((fju) this.f237086b).mo26174a(null);
            case 9:
                return ((fju) this.f237086b).mo26174a(null);
            case 10:
                g2q g2qVar = ((eju) ((sef0) this.f237086b).f208284a).f60294b;
                return new zoh((Context) g2qVar.f75987b, new fyf(new C1814eh(15, g2qVar, eh90.f59519a), true, -87347330));
            case 11:
                d23 d23Var = (d23) ((l6o) this.f237086b).f130416a.f44953c;
                Context context2 = (Context) ((vb01) d23Var.f44442b).f239356a.get();
                jg31.m53271i(context2);
                return new si80(context2, (qwf) ((h4t0) d23Var.f44446f).get(), (akh0) ((h4t0) d23Var.f44447g).get());
            case 12:
                d23 d23Var2 = (d23) ((m6o) this.f237086b).f140546a.f44953c;
                return new zna((qwf) ((h4t0) d23Var2.f44449i).get(), (fb01) ((h4t0) d23Var2.f44450j).get(), 1);
            case 13:
                d23 d23Var3 = (d23) ((n6o) this.f237086b).f150930a.f44953c;
                return new zna((qwf) ((h4t0) d23Var3.f44452l).get(), (fb01) ((h4t0) d23Var3.f44450j).get(), 2);
            case 14:
                return new yn20((qwf) ((h4t0) ((d23) ((o6o) this.f237086b).f162366a.f44953c).f44454n).get());
            case 15:
                d23 d23Var4 = (d23) ((p6o) this.f237086b).f174444a.f44953c;
                return new zna((qwf) ((h4t0) d23Var4.f44456p).get(), (fb01) ((h4t0) d23Var4.f44450j).get(), 0);
            case 16:
                return ((nju) this.f237086b).mo26174a(null);
            default:
                Context contextM49702X0 = ((bne1) this.f237086b).f28816b.m49702X0();
                TextView textView = new TextView(contextM49702X0);
                int dimensionPixelSize = contextM49702X0.getResources().getDimensionPixelSize(R.dimen.spacer_16);
                textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, contextM49702X0.getResources().getDimensionPixelSize(R.dimen.spacer_8));
                textView.setTextAppearance(R.style.TextAppearance_Encore_BodySmall);
                textView.setTextColor(bug1.m30533v(contextM49702X0, R.attr.baseTextSubdued));
                return new zvo(textView);
        }
    }
}
