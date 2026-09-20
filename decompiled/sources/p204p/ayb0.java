package p204p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ayb0 {

    /* JADX INFO: renamed from: e */
    public static final fv31 f21183e = fv31.f73628b.m78182S("MainLayout_nowPlayingViewMode");

    /* JADX INFO: renamed from: f */
    public static final uek0 f21184f;

    /* JADX INFO: renamed from: g */
    public static final Object f21185g;

    /* JADX INFO: renamed from: a */
    public final er70 f21186a;

    /* JADX INFO: renamed from: b */
    public final boolean f21187b;

    /* JADX INFO: renamed from: c */
    public final wg61 f21188c = new wg61(new vmb0(this, 8));

    /* JADX INFO: renamed from: d */
    public final wg61 f21189d = new wg61(new ye90(this, 3));

    static {
        uek0 uek0Var = uek0.f229554b;
        f21184f = uek0Var;
        f21185g = kkc0.m56695h0(pft0.m69840u(0, uek0.f229553a), pft0.m69840u(1, uek0Var));
    }

    public ayb0(er70 er70Var, boolean z) {
        this.f21186a = er70Var;
        this.f21187b = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public final void m27510a(uek0 uek0Var) {
        Integer numValueOf;
        Iterator it = f21185g.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                numValueOf = null;
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            uek0 uek0Var2 = (uek0) entry.getValue();
            numValueOf = Integer.valueOf(iIntValue);
            if (uek0Var2 != uek0Var) {
                numValueOf = null;
            }
        } while (numValueOf == null);
        if (numValueOf != null) {
            int iIntValue2 = numValueOf.intValue();
            lv31 lv31VarEdit = ((hv31) this.f21186a.get()).edit();
            lv31VarEdit.m60049b(f21183e, iIntValue2);
            lv31VarEdit.m60054g();
        }
        zv41 zv41Var = (zv41) ((lqi0) this.f21188c.getValue());
        zv41Var.getClass();
        zv41Var.m97091m(null, uek0Var);
    }
}
