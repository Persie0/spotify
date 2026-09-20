package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ms3 {

    /* JADX INFO: renamed from: a */
    public Object f146685a;

    /* JADX INFO: renamed from: b */
    public Object f146686b;

    /* JADX INFO: renamed from: c */
    public float f146687c = Float.NaN;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ qs3 f146688d;

    public ms3(qs3 qs3Var) {
        this.f146688d = qs3Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m62695a(float f, float f2) {
        qs3 qs3Var = this.f146688d;
        uum0 uum0Var = qs3Var.f191972j;
        float fM84031v = uum0Var.m84031v();
        uum0Var.m84032w(f);
        qs3Var.f191973k.m84032w(f2);
        if (Float.isNaN(fM84031v)) {
            return;
        }
        boolean z = f >= fM84031v;
        eep eepVarM73664c = qs3Var.m73664c();
        yum0 yum0Var = qs3Var.f191969g;
        if (uum0Var.m84031v() == eepVarM73664c.m38702f(yum0Var.getValue())) {
            Object objM38698b = qs3Var.m73664c().m38698b(uum0Var.m84031v() + (z ? 1.0f : -1.0f), z);
            if (objM38698b == null) {
                objM38698b = yum0Var.getValue();
            }
            if (z) {
                this.f146685a = yum0Var.getValue();
                this.f146686b = objM38698b;
            } else {
                this.f146685a = objM38698b;
                this.f146686b = yum0Var.getValue();
            }
        } else {
            Object objM38698b2 = qs3Var.m73664c().m38698b(uum0Var.m84031v(), false);
            if (objM38698b2 == null) {
                objM38698b2 = yum0Var.getValue();
            }
            Object objM38698b3 = qs3Var.m73664c().m38698b(uum0Var.m84031v(), true);
            if (objM38698b3 == null) {
                objM38698b3 = yum0Var.getValue();
            }
            this.f146685a = objM38698b2;
            this.f146686b = objM38698b3;
        }
        eep eepVarM73664c2 = qs3Var.m73664c();
        Object obj = this.f146685a;
        wj50.m88279p(obj);
        float fM38702f = eepVarM73664c2.m38702f(obj);
        eep eepVarM73664c3 = qs3Var.m73664c();
        Object obj2 = this.f146686b;
        wj50.m88279p(obj2);
        this.f146687c = Math.abs(fM38702f - eepVarM73664c3.m38702f(obj2));
        if (Math.abs(uum0Var.m84031v() - qs3Var.m73664c().m38702f(yum0Var.getValue())) >= this.f146687c / 2.0f) {
            Object value = z ? this.f146686b : this.f146685a;
            if (value == null) {
                value = yum0Var.getValue();
            }
            if (((Boolean) qs3Var.f191963a.invoke(value)).booleanValue()) {
                qs3Var.m73669h(value);
            }
        }
    }
}
