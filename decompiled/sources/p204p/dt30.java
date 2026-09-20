package p204p;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class dt30 {

    /* JADX INFO: renamed from: a */
    public final ti30 f52715a;

    /* JADX INFO: renamed from: b */
    public final ti30 f52716b;

    /* JADX INFO: renamed from: c */
    public final b9k f52717c;

    /* JADX INFO: renamed from: d */
    public final xi30 f52718d;

    /* JADX INFO: renamed from: e */
    public final HashSet f52719e;

    public dt30(sk30 sk30Var, xi30 xi30Var) {
        ti30 ti30Var = new ti30(sk30Var);
        ti30 ti30Var2 = new ti30(sk30Var, null);
        b9k b9kVar = new b9k(sk30Var);
        xi30Var.getClass();
        this.f52718d = xi30Var;
        this.f52715a = ti30Var;
        this.f52716b = ti30Var2;
        this.f52717c = b9kVar;
        this.f52719e = new HashSet();
        xi30Var.mo57294d().setAdapter(ti30Var2);
        xi30Var.mo57299i(b9kVar);
        hs30 hs30Var = ks30.Companion;
    }

    /* JADX INFO: renamed from: a */
    public final void m36799a(Parcelable parcelable) {
        if (parcelable instanceof ct30) {
            ct30 ct30Var = (ct30) parcelable;
            this.f52718d.mo57297g(ct30Var.f41759a);
            Parcelable parcelable2 = ct30Var.f41760b;
            ui30 ui30Var = this.f52715a.f220545f;
            ui30Var.m83175r(parcelable2, (WeakHashMap) ui30Var.f146343b);
            Parcelable parcelable3 = ct30Var.f41761c;
            ui30 ui30Var2 = this.f52716b.f220545f;
            ui30Var2.m83175r(parcelable3, (WeakHashMap) ui30Var2.f146343b);
            Parcelable parcelable4 = ct30Var.f41762d;
            ui30 ui30Var3 = (ui30) this.f52717c.f24956b;
            ui30Var3.m83175r(parcelable4, (WeakHashMap) ui30Var3.f146343b);
        }
    }

    /* JADX INFO: renamed from: b */
    public final ct30 m36800b() {
        Bundle bundle;
        Parcelable parcelable;
        Bundle bundle2;
        Parcelable parcelable2;
        Parcelable parcelableMo57298h = this.f52718d.mo57298h();
        ui30 ui30Var = this.f52715a.f220545f;
        WeakHashMap weakHashMap = (WeakHashMap) ui30Var.f146343b;
        Parcelable parcelable3 = null;
        if (weakHashMap.isEmpty()) {
            bundle = null;
        } else {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            mk30 mk30Var = ((cj30) ui30Var.f230591e).f38489d;
            for (int i = 0; i < mk30Var.size(); i++) {
                fk30 fk30Var = (fk30) ((cj30) mk30Var.f144485b).f38487b.get(i);
                fk30Var.getClass();
                String strMo41867id = fk30Var.mo41867id();
                if (strMo41867id != null && (parcelable = (Parcelable) weakHashMap.get(strMo41867id)) != null) {
                    sparseArray.put(i, parcelable);
                }
            }
            bundle = new Bundle();
            bundle.putSparseParcelableArray("hubs_adapter_states", sparseArray);
        }
        ui30 ui30Var2 = this.f52716b.f220545f;
        WeakHashMap weakHashMap2 = (WeakHashMap) ui30Var2.f146343b;
        if (weakHashMap2.isEmpty()) {
            bundle2 = null;
        } else {
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            mk30 mk30Var2 = ((cj30) ui30Var2.f230591e).f38489d;
            for (int i2 = 0; i2 < mk30Var2.size(); i2++) {
                fk30 fk30Var2 = (fk30) ((cj30) mk30Var2.f144485b).f38487b.get(i2);
                fk30Var2.getClass();
                String strMo41867id2 = fk30Var2.mo41867id();
                if (strMo41867id2 != null && (parcelable2 = (Parcelable) weakHashMap2.get(strMo41867id2)) != null) {
                    sparseArray2.put(i2, parcelable2);
                }
            }
            bundle2 = new Bundle();
            bundle2.putSparseParcelableArray("hubs_adapter_states", sparseArray2);
        }
        ui30 ui30Var3 = (ui30) this.f52717c.f24956b;
        WeakHashMap weakHashMap3 = (WeakHashMap) ui30Var3.f146343b;
        b9k b9kVar = (b9k) ui30Var3.f230591e;
        fk30 fk30Var3 = (fk30) b9kVar.f24961g;
        if (fk30Var3 != null && fk30Var3.mo41867id() != null) {
            parcelable3 = (Parcelable) weakHashMap3.get(((fk30) b9kVar.f24961g).mo41867id());
        }
        return new ct30(parcelableMo57298h, bundle, bundle2, parcelable3);
    }

    /* JADX INFO: renamed from: c */
    public final void m36801c(nt30 nt30Var) {
        boolean zIsEmpty = nt30Var.body().isEmpty();
        ti30 ti30Var = this.f52715a;
        xi30 xi30Var = this.f52718d;
        if (!zIsEmpty && xi30Var.mo57293c().getAdapter() == null) {
            xi30Var.mo57293c().setAdapter(ti30Var);
        }
        ti30Var.m80898B(nt30Var.body());
        fk30 fk30VarHeader = nt30Var.header();
        b9k b9kVar = this.f52717c;
        if (fk30VarHeader == null) {
            rb5 rb5Var = (rb5) b9kVar.f24957c;
            ((IdentityHashMap) rb5Var.f197472c).clear();
            ((IdentityHashMap) rb5Var.f197473d).clear();
            ((WeakHashMap) ((ui30) b9kVar.f24956b).f146343b).clear();
            lt30 lt30Var = (lt30) b9kVar.f24960f;
            if (lt30Var != null) {
                ((x4b) b9kVar.f24955a).m89858H(lt30Var);
                b9kVar.f24960f = null;
            }
        }
        b9kVar.f24961g = fk30VarHeader;
        List listOverlays = nt30Var.overlays();
        ti30 ti30Var2 = this.f52716b;
        ti30Var2.m80898B(listOverlays);
        xi30Var.mo57296f(nt30Var);
        ti30Var.m47712h();
        ti30Var2.m47712h();
        rb5 rb5Var2 = (rb5) ((x4b) b9kVar.f24955a).f258039d;
        ((IdentityHashMap) rb5Var2.f197472c).clear();
        ((IdentityHashMap) rb5Var2.f197473d).clear();
        ((uq30) b9kVar.f24958d).m83758a();
        Iterator it = this.f52719e.iterator();
        if (it.hasNext()) {
            throw ikc0.m50937i(it);
        }
    }
}
