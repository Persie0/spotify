package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes3.dex */
public final class xga {

    /* JADX INFO: renamed from: a */
    public final gd11 f261250a;

    /* JADX INFO: renamed from: b */
    public final c791 f261251b;

    /* JADX INFO: renamed from: c */
    public final eh00 f261252c;

    /* JADX INFO: renamed from: d */
    public final yum0 f261253d;

    /* JADX INFO: renamed from: e */
    public final yum0 f261254e = sam.m77645B(z8g1.f280475a);

    /* JADX INFO: renamed from: f */
    public w9z f261255f = yga.f272523a;

    /* JADX INFO: renamed from: g */
    public final yum0 f261256g = sam.m77645B(null);

    public xga(gd11 gd11Var, c791 c791Var, q691 q691Var, eh00 eh00Var) {
        this.f261250a = gd11Var;
        this.f261251b = c791Var;
        this.f261252c = eh00Var;
        this.f261253d = sam.m77645B(q691Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m90560a(tiv0 tiv0Var, tiv0 tiv0Var2, y811 y811Var) {
        pg41 pg41VarM53286y;
        if (this.f261250a.m44329c()) {
            yum0 yum0Var = this.f261256g;
            if (((rv41) yum0Var.getValue()) == null) {
                if (y811Var == null) {
                    y811Var = (y811) this.f261254e.getValue();
                }
                switch (y811Var.f270172a) {
                    case 0:
                        pg41VarM53286y = jg31.m53286y(0.0f, 0.0f, iqc1.f104728a, 3);
                        break;
                    default:
                        pg41VarM53286y = ld11.f132027a;
                        break;
                }
                this.f261255f = pg41VarM53286y;
            }
            yum0Var.setValue(((q691) this.f261253d.getValue()).m72224a(new wga(this, 0), new vy5(this, tiv0Var2, tiv0Var, 14)));
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m90561b() {
        return ((Boolean) this.f261251b.f34830d.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public final tiv0 m90562c() {
        rv41 rv41Var;
        tiv0 tiv0Var;
        if (!this.f261250a.m44329c() || (rv41Var = (rv41) this.f261256g.getValue()) == null || (tiv0Var = (tiv0) rv41Var.getValue()) == null) {
            return null;
        }
        long j = ((Offset) this.f261252c.invoke()).f493a;
        return !Offset.m253c(j, 0L) ? tiv0Var.m80941m(j) : tiv0Var;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m90563d() {
        c791 c791Var = this.f261251b;
        while (true) {
            c791 c791Var2 = c791Var.f34828b;
            if (c791Var2 == null) {
                return !wj50.m88271j(c791Var.f34827a.mo38160Z0(), c791Var.f34830d.getValue());
            }
            c791Var = c791Var2;
        }
    }
}
