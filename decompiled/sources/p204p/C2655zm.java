package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: p.zm */
/* JADX INFO: loaded from: classes7.dex */
public final class C2655zm extends hjv0 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f284108d;

    /* JADX INFO: renamed from: e */
    public Object f284109e;

    /* JADX INFO: renamed from: f */
    public final Object f284110f;

    /* JADX INFO: renamed from: g */
    public Object f284111g;

    public /* synthetic */ C2655zm(Object obj, Object obj2, Object obj3, int i) {
        this.f284108d = i;
        this.f284109e = obj;
        this.f284110f = obj2;
        this.f284111g = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    @Override // p204p.hjv0
    /* JADX INFO: renamed from: e */
    public final int mo1617e() {
        switch (this.f284108d) {
            case 0:
                return ((List) this.f284109e).size();
            case 1:
                return ((List) this.f284109e).size();
            case 2:
                return this.f284109e.size();
            case 3:
                return ((List) this.f284109e).size();
            case 4:
                return ((List) this.f284109e).size();
            case 5:
                return ((ArrayList) ((e60) this.f284109e).f56509f).size();
            default:
                return ((List) this.f284109e).size();
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: g */
    public int mo28437g(int i) {
        switch (this.f284108d) {
            case 1:
                return !wj50.m88271j(((ypy) ((List) this.f284109e).get(i)).f275091a, "opt_out_confirm") ? 1 : 0;
            case 5:
                return ((e60) this.f284109e).m37854l(i);
            default:
                return super.mo28437g(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.List] */
    @Override // p204p.hjv0
    /* JADX INFO: renamed from: n */
    public final void mo1619n(int i, dkv0 dkv0Var) {
        String string;
        switch (this.f284108d) {
            case 0:
                C2618ym c2618ym = (C2618ym) dkv0Var;
                InterfaceC1821eo interfaceC1821eo = (InterfaceC1821eo) ((List) this.f284109e).get(i);
                ovf ovfVar = c2618ym.f274125S0;
                ovfVar.mo2820d(new C1987ip(interfaceC1821eo.getColor(), interfaceC1821eo.getName(), interfaceC1821eo.getAvatar()));
                ovfVar.mo2821c(new C2580xm(c2618ym.f274126T0, i, 0));
                break;
            case 1:
                hly hlyVar = (hly) dkv0Var;
                ypy ypyVar = (ypy) ((List) this.f284109e).get(i);
                TextView textView = hlyVar.f92766T0;
                textView.setText(ypyVar.f275092b);
                textView.setOnClickListener(new ndp(28, hlyVar, ypyVar));
                break;
            case 2:
                bbc0 bbc0Var = (bbc0) dkv0Var;
                k8e0 k8e0Var = (k8e0) this.f284109e.get(i);
                xzo xzoVar = bbc0Var.f25532S0;
                xzoVar.mo2820d(new nce0(k8e0Var));
                xzoVar.mo2821c(new abc0(0, bbc0Var.f25533T0, k8e0Var));
                break;
            case 3:
                ((u4i0) dkv0Var).f226733S0.mo2820d(new m66(new h66((String) ((List) this.f284109e).get(i)), false));
                break;
            case 4:
                faw fawVar = (faw) dkv0Var;
                fh0 fh0Var = (fh0) ((List) this.f284109e).get(i);
                int size = ((List) this.f284109e).size();
                ovf ovfVar2 = fawVar.f67643S0;
                String str = fh0Var.f69509c;
                String str2 = fh0Var.f69493Q0;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = fh0Var.f69494R0;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = fh0Var.f69495S0;
                String str5 = str4 == null ? "" : str4;
                String str6 = fh0Var.f69492P0;
                if (str6 == null) {
                    str6 = "";
                }
                ovfVar2.mo2820d(new uyl(str, str2, str3, str6, str5, fh0Var.mo29281g(), null, 64));
                ovfVar2.mo2821c(new tsv(14, fawVar, fh0Var));
                String string2 = fawVar.f67644T0.getContext().getString(R.string.leavebehind_ads_position, Integer.valueOf(i + 1), Integer.valueOf(size));
                CharSequence contentDescription = ovfVar2.getView().getContentDescription();
                String str7 = null;
                if (contentDescription != null && (string = contentDescription.toString()) != null && !wl51.m88460J0(string)) {
                    str7 = string;
                }
                ovfVar2.getView().setContentDescription(g6f.m43753y0(bk5.m29582E0(new String[]{str7, string2}), ", ", null, null, null, 62));
                break;
            case 5:
                ((e60) this.f284109e).m37846d((rxf) dkv0Var, i, null);
                ((w9r0) this.f284110f).m87547O(i);
                break;
            default:
                int iIntValue = ((Number) ((List) this.f284109e).get(i)).intValue();
                Button button = ((kz31) dkv0Var).f128007S0;
                button.setText((CharSequence) ((aaq) this.f284110f).invoke(Integer.valueOf(iIntValue)));
                button.setOnClickListener(new f79(this, iIntValue, 4));
                break;
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: o */
    public void mo47717o(dkv0 dkv0Var, int i, List list) {
        switch (this.f284108d) {
            case 5:
                ((e60) this.f284109e).m37846d((rxf) dkv0Var, i, g6f.m43745s0(list));
                ((w9r0) this.f284110f).m87547O(i);
                break;
            default:
                super.mo47717o(dkv0Var, i, list);
                break;
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: p */
    public final dkv0 mo1620p(int i, ViewGroup viewGroup) {
        View viewInflate;
        int i2 = this.f284108d;
        Object obj = this.f284110f;
        switch (i2) {
            case 0:
                return new C2618ym(this, ((C2098lp) obj).mo26174a(null));
            case 1:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                if (i == 0) {
                    viewInflate = layoutInflater.inflate(R.layout.left_aligned_menu_item_bold, viewGroup, false);
                } else {
                    if (i != 1) {
                        throw new IllegalArgumentException("Unknown view type");
                    }
                    viewInflate = layoutInflater.inflate(R.layout.left_aligned_menu_item, viewGroup, false);
                }
                wj50.m88279p(viewInflate);
                return new hly(viewInflate, (gly) this.f284111g);
            case 2:
                return new bbc0(this, (xzo) ((fju) obj).mo26174a(null));
            case 3:
                int i3 = u4i0.f226732T0;
                LayoutInflater layoutInflaterFrom = LayoutInflater.from((Context) obj);
                r96 r96Var = (r96) this.f284111g;
                View viewInflate2 = layoutInflaterFrom.inflate(R.layout.avatar_item_layout, viewGroup, false);
                ((ArtworkView) mec1.m61562n(viewInflate2, R.id.artwork_item)).setViewContext(r96Var);
                wj50.m88279p(viewInflate2);
                return new u4i0(viewInflate2);
            case 4:
                ovf ovfVarMo26174a = ((uwa) obj).mo26174a(ryl.f203934a);
                Context context = viewGroup.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                FrameLayout.LayoutParams layoutParams = ((List) this.f284109e).size() > 1 ? new FrameLayout.LayoutParams(context.getResources().getDimensionPixelSize(R.dimen.episode_page_multiple_card_max_width_logo_and_button), -2) : new FrameLayout.LayoutParams(-1, -2);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.spacer_8);
                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.spacer_12);
                layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
                frameLayout.setLayoutParams(layoutParams);
                frameLayout.addView(ovfVarMo26174a.getView());
                k5k0 k5k0Var = (k5k0) this.f284111g;
                if (k5k0Var != null) {
                    return new faw(ovfVarMo26174a, frameLayout, k5k0Var);
                }
                wj50.m88260d0("episodeSponsorClickListener");
                throw null;
            case 5:
                return ((e60) this.f284109e).m37848f(i, viewGroup, (w8j) this.f284111g);
            default:
                View viewM25591c = adn.m25591c(viewGroup, R.layout.speed_control_quick_options_chip, viewGroup, false);
                if (viewM25591c == null) {
                    throw new NullPointerException("rootView");
                }
                Button button = (Button) viewM25591c;
                return new kz31(new khy0(29, button, button));
        }
    }

    public C2655zm(List list, aaq aaqVar) {
        this.f284108d = 6;
        this.f284109e = list;
        this.f284110f = aaqVar;
    }

    public C2655zm(fju fjuVar) {
        this.f284108d = 2;
        this.f284109e = lau.f131415a;
        this.f284110f = fjuVar;
    }

    public C2655zm(Context context, List list, r96 r96Var) {
        this.f284108d = 3;
        this.f284110f = context;
        this.f284109e = list;
        this.f284111g = r96Var;
    }

    public C2655zm(uwa uwaVar) {
        this.f284108d = 4;
        this.f284110f = uwaVar;
        this.f284109e = lau.f131415a;
    }
}
