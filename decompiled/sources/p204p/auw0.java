package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class auw0 {

    /* JADX INFO: renamed from: a */
    public final ph30 f20037a;

    /* JADX INFO: renamed from: b */
    public final String f20038b;

    /* JADX INFO: renamed from: c */
    public final sn20 f20039c;

    /* JADX INFO: renamed from: d */
    public final euw0 f20040d;

    /* JADX INFO: renamed from: e */
    public final c95 f20041e;

    /* JADX INFO: renamed from: f */
    public b3b f20042f;

    public auw0(ztw0 ztw0Var) {
        ph30 ph30Var = ztw0Var.f286275a;
        if (ph30Var == null) {
            throw new IllegalStateException("url == null");
        }
        this.f20037a = ph30Var;
        this.f20038b = ztw0Var.f286276b;
        this.f20039c = ztw0Var.f286277c.m77935i();
        this.f20040d = ztw0Var.f286278d;
        this.f20041e = ztw0Var.f286279e;
    }

    /* JADX INFO: renamed from: a */
    public final b3b m27218a() {
        b3b b3bVar = this.f20042f;
        if (b3bVar != null) {
            return b3bVar;
        }
        b3b b3bVar2 = b3b.f22994n;
        b3b b3bVarM95443w = z520.m95443w(this.f20039c);
        this.f20042f = b3bVarM95443w;
        return b3bVarM95443w;
    }

    /* JADX INFO: renamed from: b */
    public final ztw0 m27219b() {
        ztw0 ztw0Var = new ztw0();
        ztw0Var.f286275a = this.f20037a;
        ztw0Var.f286276b = this.f20038b;
        ztw0Var.f286278d = this.f20040d;
        ztw0Var.f286279e = this.f20041e;
        ztw0Var.f286277c = this.f20039c.m78536e();
        return ztw0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.f20038b);
        sb.append(", url=");
        sb.append(this.f20037a);
        sn20 sn20Var = this.f20039c;
        if (sn20Var.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : sn20Var) {
                int i2 = i + 1;
                if (i < 0) {
                    h6f.m46722S();
                    throw null;
                }
                pqm0 pqm0Var = (pqm0) obj;
                String str = (String) pqm0Var.f180350a;
                String str2 = (String) pqm0Var.f180351b;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (a0f1.m24351l(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        ocu ocuVar = ocu.f163990e;
        c95 c95Var = this.f20041e;
        if (!wj50.m88271j(c95Var, ocuVar)) {
            sb.append(", tags=");
            sb.append(c95Var);
        }
        sb.append('}');
        return sb.toString();
    }
}
