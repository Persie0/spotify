package p204p;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class yj30 implements jk30, lk30 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f273281a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f273282b;

    /* JADX INFO: renamed from: c */
    public final Cloneable f273283c;

    public yj30(xf40 xf40Var) {
        this.f273282b = new HashMap(xf40Var.size());
        this.f273283c = new HashMap(xf40Var.size());
        for (Map.Entry entry : xf40Var.entrySet()) {
            String str = (String) entry.getKey();
            rj30 rj30Var = (rj30) entry.getValue();
            HashMap map = (HashMap) this.f273283c;
            Integer numValueOf = Integer.valueOf(rj30Var.mo26367a());
            Object obj = map.get(numValueOf);
            if (obj == null) {
                map.put(numValueOf, rj30Var);
                obj = rj30Var;
            }
            if (!obj.getClass().equals(rj30Var.getClass())) {
                rj30 rj30Var2 = (rj30) ((HashMap) this.f273283c).get(Integer.valueOf(rj30Var.mo26367a()));
                throw new IllegalArgumentException(("Binder ID " + rj30Var.mo26367a() + " has multiple binders: " + rj30Var.getClass() + " and " + (rj30Var2 != null ? rj30Var2.getClass() : null)).toString());
            }
            ((HashMap) this.f273282b).put(str, Integer.valueOf(rj30Var.mo26367a()));
        }
    }

    @Override // p204p.jk30
    /* JADX INFO: renamed from: a */
    public final qj30 mo45025a(int i) {
        switch (this.f273281a) {
            case 0:
                return (qj30) ((HashMap) this.f273283c).get(Integer.valueOf(i));
            default:
                do30 do30Var = (do30) ((SparseArray) this.f273283c).get(i);
                if (do30Var != null) {
                    return do30Var.mo26264a((at30) this.f273282b);
                }
                return null;
        }
    }

    @Override // p204p.lk30
    /* JADX INFO: renamed from: k */
    public int mo25406k(fk30 fk30Var) {
        Integer num = (Integer) ((HashMap) this.f273282b).get(fk30Var.componentId().mo29575id());
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public yj30(at30 at30Var, do30[] do30VarArr) {
        at30Var.getClass();
        this.f273282b = at30Var;
        this.f273283c = new SparseArray(do30VarArr.length);
        for (do30 do30Var : do30VarArr) {
            ((SparseArray) this.f273283c).append(do30Var.getId(), do30Var);
        }
    }
}
