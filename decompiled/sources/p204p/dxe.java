package p204p;

import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes7.dex */
public final class dxe implements ub40 {

    /* JADX INFO: renamed from: a */
    public final a350 f53936a;

    /* JADX INFO: renamed from: b */
    public final mu61 f53937b;

    /* JADX INFO: renamed from: c */
    public final Map f53938c;

    /* JADX INFO: renamed from: d */
    public final String f53939d;

    public dxe(a350 a350Var, mu61 mu61Var, Map map, String str) {
        this.f53936a = a350Var;
        this.f53937b = mu61Var;
        this.f53938c = map;
        this.f53939d = str;
    }

    @Override // p204p.ub40
    /* JADX INFO: renamed from: a */
    public final void mo37207a(vb40 vb40Var, ny51 ny51Var) {
        a350 a350Var = this.f53936a;
        if (a350Var != null) {
            a350Var.m24612i(this.f53939d, vb40Var.f239400b.toString(), ny51Var);
        }
        mu61 mu61Var = this.f53937b;
        if (mu61Var != null) {
            mu61Var.onSuccess();
        }
    }

    @Override // p204p.ub40
    /* JADX INFO: renamed from: b */
    public final void mo37208b() {
        a350 a350Var = this.f53936a;
        if (a350Var != null) {
            a350Var.m24611h(this.f53939d, this.f53938c);
        }
    }

    @Override // p204p.ub40
    /* JADX INFO: renamed from: c */
    public final void mo37209c(vb40 vb40Var, fgw fgwVar) {
        a350 a350Var = this.f53936a;
        if (a350Var != null) {
            a350Var.m24610g(this.f53939d, vb40Var.f239400b.toString(), fgwVar);
        }
        mu61 mu61Var = this.f53937b;
        if (mu61Var != null) {
            mu61Var.mo25096p(new Exception(fgwVar.f69412c));
        }
    }

    @Override // p204p.ub40
    /* JADX INFO: renamed from: d */
    public final void mo37210d(vb40 vb40Var) {
        if (this.f53936a != null) {
            vb40Var.f239400b.toString();
        }
        mu61 mu61Var = this.f53937b;
        if (mu61Var != null) {
            mu61Var.mo25096p(new CancellationException());
        }
    }
}
