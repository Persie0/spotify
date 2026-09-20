package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class scn {

    /* JADX INFO: renamed from: a */
    public final da80 f207767a;

    /* JADX INFO: renamed from: b */
    public final gb80 f207768b;

    /* JADX INFO: renamed from: c */
    public final h4t0 f207769c;

    /* JADX INFO: renamed from: d */
    public final ihm f207770d;

    public scn(da80 da80Var, gb80 gb80Var) {
        this.f207767a = da80Var;
        this.f207768b = gb80Var;
        int i = 9;
        this.f207769c = b2s.m27972b(new ihm(this, 1, i));
        this.f207770d = new ihm(this, 0, i);
    }

    /* JADX INFO: renamed from: a */
    public final hrw m77807a() {
        er70 er70VarM27971a = b2s.m27971a(this.f207770d);
        msa0 msa0VarM77808b = m77808b();
        bji bjiVarM35409e = this.f207767a.m35409e();
        jg31.m53271i(bjiVarM35409e);
        return r0p0.m74412q(er70VarM27971a, msa0VarM77808b, r0p0.m74403h(new ll4(false, bjiVarM35409e)));
    }

    /* JADX INFO: renamed from: b */
    public final msa0 m77808b() {
        xre xreVarM35408d = this.f207767a.m35408d();
        jg31.m53271i(xreVarM35408d);
        return new msa0(xreVarM35408d);
    }

    /* JADX INFO: renamed from: c */
    public final irw m77809c() {
        return r0p0.m74413r(b2s.m27971a(this.f207770d), m77808b());
    }

    /* JADX INFO: renamed from: d */
    public final uqw m77810d() {
        er70 er70VarM27971a = b2s.m27971a(this.f207770d);
        msa0 msa0VarM77808b = m77808b();
        da80 da80Var = this.f207767a;
        bji bjiVarM35409e = da80Var.m35409e();
        jg31.m53271i(bjiVarM35409e);
        Boolean boolM74403h = r0p0.m74403h(new ll4(false, bjiVarM35409e));
        List listM35422t = da80Var.m35422t();
        jg31.m53271i(listM35422t);
        return r0p0.m74410o(er70VarM27971a, msa0VarM77808b, boolM74403h, listM35422t);
    }

    /* JADX INFO: renamed from: e */
    public final jrw m77811e() {
        return r0p0.m74415t(b2s.m27971a(this.f207770d), m77808b());
    }
}
