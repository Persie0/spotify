package p204p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes10.dex */
public final class ilh implements ir91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f103381a;

    /* JADX INFO: renamed from: b */
    public final Object f103382b;

    public /* synthetic */ ilh(Object obj, int i) {
        this.f103381a = i;
        this.f103382b = obj;
    }

    @Override // p204p.ir91
    /* JADX INFO: renamed from: a */
    public final hr91 mo34693a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        switch (this.f103381a) {
            case 0:
                return new poh(context, R.id.not_found_compose_view, new fyf(new tvb(6, (th00) this.f103382b, false), true, -1171263788));
            case 1:
                return new efe(1, context, (z9j0) this.f103382b);
            case 2:
                t2n t2nVar = (t2n) ((s2n) this.f103382b).f205033a.f33427c;
                v170 v170Var = (v170) ((y170) t2nVar.f216596e).f268191a.get();
                jg31.m53271i(v170Var);
                oui0 oui0Var = (oui0) t2nVar.f216597f;
                nui0 nui0Var = (nui0) ((h4t0) t2nVar.f216594c).get();
                y170 y170Var = (y170) t2nVar.f216596e;
                ao80 ao80Var = (ao80) y170Var.f268195e.get();
                jg31.m53271i(ao80Var);
                InterfaceC2609yd interfaceC2609yd = (InterfaceC2609yd) y170Var.f268194d.get();
                jg31.m53271i(interfaceC2609yd);
                z9j0 z9j0Var = (z9j0) y170Var.f268197g.get();
                jg31.m53271i(z9j0Var);
                hui0 hui0Var = (hui0) y170Var.f268193c.get();
                jg31.m53271i(hui0Var);
                m500 m500Var = (m500) y170Var.f268196f.get();
                jg31.m53271i(m500Var);
                return new lyz(layoutInflater, bundle, v170Var, oui0Var, nui0Var, ao80Var, interfaceC2609yd, z9j0Var, hui0Var, m500Var);
            case 3:
                u9m0 u9m0Var = (u9m0) ((h5a0) this.f103382b).invoke();
                u9m0Var.mo24481c(context, layoutInflater, viewGroup);
                if (bundle != null) {
                    kx41 kx41Var = u9m0Var instanceof kx41 ? (kx41) u9m0Var : null;
                    if (kx41Var != null) {
                        kx41Var.mo57584d(bundle);
                    }
                }
                return new g5a0(u9m0Var);
            case 4:
                return ((lph0) this.f103382b).f135770a.mo34319a(context, bundle != null ? bundle.getBundle("delegate-state") : null, layoutInflater, viewGroup);
            case 5:
                return new efe((ndk0) ((i4t0) this.f103382b).get(), context, layoutInflater, viewGroup);
            default:
                z9j0 z9j0Var2 = (z9j0) ((itr0) ((aim) ((qtr0) this.f103382b).f192452h.f203938a.f171807c).f16030t).f105715m.get();
                jg31.m53271i(z9j0Var2);
                return new efe(3, context, z9j0Var2);
        }
    }
}
