package p204p;

import com.spotify.allboarding.allboardingimpl.presentation.summary.SummaryFragment;
import com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import com.spotify.allboarding.allboardingimpl.skip.SkipDialogFragment;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class k3q0 implements a800 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f118958a;

    /* JADX INFO: renamed from: b */
    public final Object f118959b;

    public /* synthetic */ k3q0(Object obj, int i) {
        this.f118958a = i;
        this.f118959b = obj;
    }

    @Override // p204p.a800
    /* JADX INFO: renamed from: a */
    public final i500 mo25006a() {
        switch (this.f118958a) {
            case 0:
                return new h3q0(new g4n0(this, 17));
            case 1:
                return new umr0(new g4n0(this, 22));
            case 2:
                return new vas0(new g4n0(this, 26));
            case 3:
                return new sku0(new nrs0(this, 19));
            case 4:
                return new ipu0(new nrs0(this, 20));
            case 5:
                return new afw0(new nrs0(this, 27));
            case 6:
                return new arw0(new nrs0(this, 28));
            case 7:
                return new zsw0(new nrs0(this, 29));
            case 8:
                return new wby0(new pvw0(this, 6));
            case 9:
                return new SearchFragment(new pvw0(this, 7));
            case 10:
                return new qs01(new pvw0(this, 17));
            case 11:
                return new k021(new pvw0(this, 20));
            case 12:
                return new z021(new pvw0(this, 21));
            case 13:
                return new f121(new pvw0(this, 22));
            case 14:
                return new b621(new pvw0(this, 24));
            case 15:
                return new SkipDialogFragment(new pvw0(this, 25));
            case 16:
                return new dq21(new pvw0(this, 26));
            case 17:
                return new u231(new pvw0(this, 29));
            case 18:
                return new s531(new t531(this, 0));
            case 19:
                return new gq31(new t531(this, 3));
            case 20:
                return new iz31(new t531(this, 5));
            case 21:
                return new y341(new t531(this, 6));
            case 22:
                return new lp41(new t531(this, 28));
            case 23:
                return new SummaryFragment(new f151(this, 8));
            case 24:
                return new z461(new f151(this, 9));
            case 25:
                f151 f151Var = new f151(this, 12);
                yz61 yz61Var = new yz61();
                yz61Var.f277707W1 = f151Var;
                return yz61Var;
            case 26:
                return new oxa1(new zga1(this, 2));
            case 27:
                return new u7d1(new zga1(this, 10));
            default:
                qyy0 qyy0Var = (qyy0) this.f118959b;
                return new tfi0((Map) qyy0Var.f194060c, (kgm0) qyy0Var.f194062e, (jgm0) qyy0Var.f194063f, (hgm0) qyy0Var.f194064g, (ggm0) qyy0Var.f194065h, (b8x0) qyy0Var.f194066i, (nqc1) qyy0Var.f194055X, (acm0) qyy0Var.f194061d, (i4t0) qyy0Var.f194057Z, (b600) qyy0Var.f194067t, (z9j0) qyy0Var.f194059b, ((yr4) ((i4t0) qyy0Var.f194056Y).get()).m94409a());
        }
    }
}
