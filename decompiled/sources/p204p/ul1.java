package p204p;

import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class ul1 implements kj30 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f231404a;

    /* JADX INFO: renamed from: b */
    public final kv91 f231405b;

    /* JADX INFO: renamed from: c */
    public final Object f231406c;

    /* JADX INFO: renamed from: d */
    public final Object f231407d;

    public ul1(lr1 lr1Var, kv91 kv91Var) {
        this.f231404a = 0;
        this.f231407d = new cbh0(20, (byte) 0);
        this.f231406c = lr1Var;
        this.f231405b = kv91Var;
    }

    @Override // p204p.kj30
    /* JADX INFO: renamed from: a */
    public final void mo44172a(mj30 mj30Var, zj30 zj30Var) {
        d850 d850VarMo57453r;
        int i = this.f231404a;
        kv91 kv91Var = this.f231405b;
        Object obj = this.f231407d;
        Object obj2 = this.f231406c;
        switch (i) {
            case 0:
                String strString = mj30Var.data().string("uri");
                if (strString == null) {
                    na6.m63957e("URI for track cannot be null.");
                } else {
                    cbh0 cbh0Var = (cbh0) obj;
                    cbh0Var.getClass();
                    yt91 yt91VarM96903c = cbh0Var.f36128b.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("add_to_playlist_button", null, null, null, null));
                    yt91VarM96903c.f276056j = true;
                    zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                    String str = xoc1.f263872E1.f243453a;
                    dv91 dv91Var = new dv91("hit", 1);
                    String string = str != null ? str.toString() : null;
                    ((lr1) obj2).m59782a(Collections.singletonList(strString), "freetiertrack", strString, kv91Var.mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null), wt1.f254795a, false);
                }
                break;
            default:
                z9j0 z9j0Var = (z9j0) obj2;
                csy csyVar = (csy) obj;
                String strString2 = mj30Var.data().string("uri", "");
                if (!TextUtils.isEmpty(strString2)) {
                    Iterator it = csy.m33785F(zj30Var).keySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            d850VarMo57453r = null;
                        } else if (((String) it.next()).startsWith("ubi:")) {
                            Set set = dd41.f47702f;
                            d850VarMo57453r = kv91Var.mo57453r(r46.m74723R(strString2) ? csyVar.m33789E(zj30Var).m91841u(strString2) : csyVar.m33789E(zj30Var).m91833m(strString2), null);
                        }
                    }
                    if (d850VarMo57453r == null) {
                        z9j0Var.mo47346g(strString2);
                    } else {
                        z9j0Var.mo47342b(strString2, d850VarMo57453r, null);
                    }
                }
                break;
        }
    }

    public ul1(z9j0 z9j0Var, csy csyVar, kv91 kv91Var) {
        this.f231404a = 1;
        this.f231406c = z9j0Var;
        this.f231407d = csyVar;
        this.f231405b = kv91Var;
    }
}
