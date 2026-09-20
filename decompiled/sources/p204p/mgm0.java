package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class mgm0 implements p7x0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ a8x0 f143596a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ngm0 f143597b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7x0 f143598c;

    public mgm0(a8x0 a8x0Var, ngm0 ngm0Var, i7x0 i7x0Var) {
        this.f143596a = a8x0Var;
        this.f143597b = ngm0Var;
        this.f143598c = i7x0Var;
    }

    @Override // p204p.p7x0
    /* JADX INFO: renamed from: a */
    public final void mo25060a(Object obj, String str) {
        a8x0 a8x0Var = this.f143596a;
        b8x0 b8x0Var = a8x0Var.f13423a;
        b8x0Var.f24691b.add(a8x0Var.f13424b);
        String str2 = a8x0Var.f13425c;
        String strM28438a = b8x0.m28438a(str2, a8x0Var.f13426d);
        Iterator it = b8x0Var.f24691b.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (!str3.equals(strM28438a) && bm51.m29803n0(str3, str2, false)) {
                it.remove();
            }
        }
        ngm0 ngm0Var = this.f143597b;
        vh50 vh50Var = ngm0Var.f153736a;
        String str4 = ngm0Var.f153739d;
        i7x0 i7x0Var = this.f143598c;
        vh50Var.mo42973c(i7x0Var.mo49883a(obj), str4, (String) i7x0Var.getUri().invoke(obj), str);
    }

    @Override // p204p.p7x0
    public final void unregister() {
        this.f143596a.unregister();
    }
}
