package p204p;

import android.util.TypedValue;
import android.view.View;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Observable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class g5m0 implements b600, b7j0, o7m, e3j0 {

    /* JADX INFO: renamed from: a */
    public final m500 f76701a;

    /* JADX INFO: renamed from: b */
    public final int f76702b;

    /* JADX INFO: renamed from: c */
    public final ica f76703c;

    /* JADX INFO: renamed from: d */
    public final l5j0 f76704d;

    /* JADX INFO: renamed from: e */
    public final wvp f76705e;

    /* JADX INFO: renamed from: f */
    public final m8j0 f76706f;

    /* JADX INFO: renamed from: g */
    public final c700 f76707g;

    /* JADX INFO: renamed from: h */
    public final m05 f76708h;

    /* JADX INFO: renamed from: i */
    public final xoi0 f76709i;

    public g5m0(m500 m500Var, int i, ica icaVar, l5j0 l5j0Var, wvp wvpVar, m8j0 m8j0Var) {
        this.f76701a = m500Var;
        this.f76702b = i;
        this.f76703c = icaVar;
        this.f76704d = l5j0Var;
        this.f76705e = wvpVar;
        this.f76706f = m8j0Var;
        c700 c700VarMo15683g0 = m500Var.mo15683g0();
        this.f76707g = c700VarMo15683g0;
        this.f76708h = new m05(R.anim.fade_in_hard, R.anim.fade_out_hard, true);
        c700VarMo15683g0.f34680o.add(new b5m0(this));
        this.f76709i = new xoi0();
    }

    @Override // p204p.o7m
    /* JADX INFO: renamed from: a */
    public final void mo31747a(String str, i500 i500Var) {
        if (mo31748c() == i500Var) {
            this.f76709i.mo33104m(str);
        }
    }

    @Override // p204p.b7j0
    /* JADX INFO: renamed from: b */
    public final void mo28380b() {
        this.f76704d.mo58246i().clear();
    }

    @Override // p204p.o7m
    /* JADX INFO: renamed from: c */
    public final i500 mo31748c() {
        Object next;
        Iterator it = this.f76707g.f34668c.m89877x().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((i500) next).m49727z0()) {
                return (i500) next;
            }
        }
        next = null;
        return (i500) next;
    }

    @Override // p204p.o7m
    /* JADX INFO: renamed from: d */
    public final xoi0 mo31749d() {
        return this.f76709i;
    }

    @Override // p204p.b7j0
    /* JADX INFO: renamed from: e */
    public final void mo28381e(String str, String str2, String str3, m05 m05Var, i500 i500Var, zzq0 zzq0Var, boolean z) {
        m43616q(str3, str2, str, m05Var, i500Var, zzq0Var, false);
    }

    @Override // p204p.b7j0
    /* JADX INFO: renamed from: f */
    public final void mo28382f() {
        rlv0 rlv0Var = new rlv0();
        rlv0Var.f200373a = ytl0.f276158X;
        if ((mo31750k() instanceof wzq0) && !mo37646j() && ((x0p) this.f76703c).f256938t.isEmpty()) {
            this.f76701a.finish();
        } else {
            c700 c700Var = this.f76707g;
            if (c700Var.m31611T()) {
                return;
            }
            l5j0 l5j0Var = this.f76704d;
            if (l5j0Var.mo58246i().isEmpty() && l5j0Var.mo58245h() == null) {
                return;
            }
            m43614o(c700Var, "popFragment:commit", new e0m0(c700Var, this, rlv0Var, 1));
            m43614o(c700Var, "popFragment:executePendingTransactions", new f5m0(c700Var, 0));
        }
        ((eh00) rlv0Var.f200373a).invoke();
        m43613n();
    }

    @Override // p204p.e3j0
    /* JADX INFO: renamed from: g */
    public final boolean mo37645g() {
        return mo37646j() || this.f76704d.mo58245h() != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.b7j0
    /* JADX INFO: renamed from: h */
    public final void mo28383h(i500 i500Var, String str, String str2, String str3, boolean z, zzq0 zzq0Var) {
        String strMo24332k;
        m43616q(str3, str2, str, z ? this.f76708h : null, i500Var, zzq0Var, true);
        l5j0 l5j0Var = this.f76704d;
        l5j0Var.mo58247j();
        if (str == null) {
            e600 e600Var = i500Var instanceof e600 ? (e600) i500Var : null;
            strMo24332k = e600Var != null ? e600Var.mo24332k(this.f76701a) : null;
        } else {
            strMo24332k = str;
        }
        l5j0Var.mo58240c(new i5j0(i500Var, new h600(strMo24332k, str2, str3, zzq0Var, null)));
        this.f76705e.m89135a();
    }

    @Override // p204p.b7j0
    /* JADX INFO: renamed from: i */
    public final void mo28384i(String str, i500 i500Var, String str2, String str3, String str4, boolean z, zzq0 zzq0Var) {
        throw new UnsupportedOperationException("Haven't got around to implementing yet");
    }

    @Override // p204p.e3j0
    /* JADX INFO: renamed from: j */
    public final boolean mo37646j() {
        return this.f76704d.mo58243f() > 0;
    }

    @Override // p204p.o7m
    /* JADX INFO: renamed from: k */
    public final zzq0 mo31750k() {
        h600 h600VarMo49777a;
        k5j0 k5j0VarMo58245h = this.f76704d.mo58245h();
        if (k5j0VarMo58245h == null || (h600VarMo49777a = k5j0VarMo58245h.mo49777a()) == null) {
            return null;
        }
        return h600VarMo49777a.f87943d;
    }

    @Override // p204p.b600
    /* JADX INFO: renamed from: l */
    public final Observable mo28243l(i500 i500Var) {
        return Observable.create(new mcu(i500Var, this.f76704d, (Object) null, this.f76707g, 13)).map(r2z.f195269U0).distinctUntilChanged();
    }

    /* JADX INFO: renamed from: m */
    public final void m43612m() {
        if (!(mo31750k() instanceof wzq0) || mo37646j()) {
            this.f76701a.finish();
            return;
        }
        d5m0 d5m0Var = new d5m0(this, 0);
        x0p x0pVar = (x0p) this.f76703c;
        x0pVar.f256931m = d5m0Var;
        x0pVar.f256941w = new zca(2);
        x0pVar.f256943y.add(x0pVar.f256923e.m83914b());
        x0pVar.m89597l(5);
    }

    /* JADX INFO: renamed from: n */
    public final void m43613n() {
        int i = this.f76702b;
        m500 m500Var = this.f76701a;
        View viewFindViewById = m500Var.findViewById(i);
        wj50.m88279p(viewFindViewById);
        viewFindViewById.setVisibility(((mo31750k() instanceof wzq0) && this.f76704d.mo58250m() == null) ? 8 : 0);
        zzq0 zzq0VarMo31750k = mo31750k();
        xzq0 xzq0Var = zzq0VarMo31750k instanceof xzq0 ? (xzq0) zzq0VarMo31750k : null;
        int i2 = xzq0Var != null ? xzq0Var.f267735b : 0;
        int i3 = i2 == 0 ? -1 : c5m0.f34219a[edb.m38547C(i2)];
        if (i3 == 1 || i3 == 2) {
            viewFindViewById.setBackgroundColor(0);
            return;
        }
        TypedValue typedValue = new TypedValue();
        m500Var.getTheme().resolveAttribute(R.attr.baseBackgroundBase, typedValue, true);
        viewFindViewById.setBackgroundResource(typedValue.resourceId);
    }

    /* JADX INFO: renamed from: o */
    public final void m43614o(c700 c700Var, String str, eh00 eh00Var) {
        if (!c700Var.f34659L && !c700Var.m31611T()) {
            eh00Var.invoke();
            return;
        }
        na6.m63957e("Cannot perform action: " + str + " when fragment manager is in invalid state. \n\nFragmentManager={isDestroyed=" + c700Var.f34659L + ", isStateSaved=" + c700Var.m31611T() + "} \n\n Lifecycle={currentState=" + this.f76701a.f31643a.f163857d.name() + "}");
    }

    /* JADX INFO: renamed from: p */
    public final void m43615p() {
        this.f76704d.mo58247j();
        this.f76705e.m89135a();
    }

    /* JADX INFO: renamed from: q */
    public final void m43616q(String str, String str2, String str3, m05 m05Var, i500 i500Var, zzq0 zzq0Var, boolean z) {
        eh00 ha40Var = new ha40(this, i500Var, str3, str2, str, zzq0Var, m05Var, 13);
        c700 c700Var = this.f76707g;
        c700Var.getClass();
        xi8 xi8Var = new xi8(c700Var);
        l5j0 l5j0Var = this.f76704d;
        ica icaVar = this.f76703c;
        l5j0Var.mo58249l(xi8Var, zzq0Var, c700Var, icaVar);
        if (zzq0Var instanceof wzq0) {
            ytl0 ytl0Var = ytl0.f276160Y;
            ((x0p) icaVar).m89594h(i500Var, str, new d5m0(this, 1), ha40Var);
            ha40Var = ytl0Var;
        } else {
            if (m05Var != null) {
                xi8Var.m91104o(m05Var.f138516d, m05Var.f138517e, 0, 0);
            }
            xi8Var.m91103n(this.f76702b, i500Var, null);
            if (!z) {
                xi8Var.m91092c(c700Var.m31606K() == 0 ? "initial_backstack" : null);
            }
        }
        m43614o(c700Var, "pushInternal:commit", new vvk0(xi8Var, 19));
        m43614o(c700Var, "pushInternal:executePendingTransactions", new f5m0(c700Var, 1));
        ha40Var.invoke();
    }
}
