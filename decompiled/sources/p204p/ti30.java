package p204p;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class ti30 extends hjv0 {

    /* JADX INFO: renamed from: d */
    public final sk30 f220543d;

    /* JADX INFO: renamed from: e */
    public final cj30 f220544e;

    /* JADX INFO: renamed from: f */
    public final ui30 f220545f;

    public ti30(sk30 sk30Var, fru0 fru0Var) {
        sk30Var.getClass();
        this.f220543d = sk30Var;
        cj30 cj30Var = new cj30(sk30Var);
        this.f220544e = cj30Var;
        this.f220545f = new ui30(cj30Var);
        m47720w(true);
        mo47719v(cj30Var.f38490e);
    }

    /* JADX INFO: renamed from: C */
    public static lt30 m80897C(dkv0 dkv0Var) {
        if (dkv0Var instanceof si30) {
            return ((si30) dkv0Var).f209350S0;
        }
        throw new IllegalArgumentException("Not a HubsAdapter view holder");
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public si30 mo1620p(int i, ViewGroup viewGroup) {
        return new si30(lt30.m59863b(i, viewGroup, this.f220543d));
    }

    /* JADX INFO: renamed from: B */
    public final void m80898B(List list) {
        if (list == null || list.isEmpty()) {
            ((WeakHashMap) this.f220545f.f146343b).clear();
        }
        cj30 cj30Var = this.f220544e;
        if (list == null) {
            cj30Var.getClass();
            cj30Var.f38487b = Collections.EMPTY_LIST;
            et30 et30Var = et30.f62611d;
            return;
        }
        cj30Var.f38487b = list;
        ys30 ys30Var = cj30Var.f38486a.f209994g;
        if (list == et30.f62611d || list == Collections.EMPTY_LIST) {
            return;
        }
        kf40 kf40Var = pf40.f176960b;
        if (list == wsv0.f254763e) {
            return;
        }
        if ((list instanceof et30) && ((et30) list).f62614c == ys30Var) {
            return;
        }
        new et30(ys30Var, list);
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: e */
    public final int mo1617e() {
        return this.f220544e.f38487b.size();
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: f */
    public final long mo1618f(int i) {
        cj30 cj30Var = this.f220544e;
        rb5 rb5Var = cj30Var.f38488c;
        fk30 fk30Var = (fk30) cj30Var.f38487b.get(i);
        fk30Var.getClass();
        fk30 fk30Var2 = rb5Var.m75154v(fk30Var).f73100a;
        String strMo41867id = fk30Var2.mo41867id();
        if (strMo41867id != null) {
            fk30Var2 = strMo41867id;
        }
        return fk30Var2.hashCode();
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: g */
    public final int mo28437g(int i) {
        cj30 cj30Var = this.f220544e;
        rb5 rb5Var = cj30Var.f38488c;
        fk30 fk30Var = (fk30) cj30Var.f38487b.get(i);
        fk30Var.getClass();
        return rb5Var.m75154v(fk30Var).f73101b;
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: n */
    public final void mo1619n(int i, dkv0 dkv0Var) {
        cj30 cj30Var = this.f220544e;
        rb5 rb5Var = cj30Var.f38488c;
        fk30 fk30Var = (fk30) cj30Var.f38487b.get(i);
        fk30Var.getClass();
        ((si30) dkv0Var).f209350S0.m59864a(i, rb5Var.m75154v(fk30Var).f73100a, this.f220545f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ti30(sk30 sk30Var) {
        this(sk30Var, null);
        sk30Var.getClass();
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: m */
    public final void mo28858m(RecyclerView recyclerView) {
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: q */
    public final void mo28696q(RecyclerView recyclerView) {
    }
}
