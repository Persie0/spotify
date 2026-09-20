package p204p;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public final class tf30 implements fgx {

    /* JADX INFO: renamed from: f */
    public static final sn20 f219838f = epv0.m39668D("OkHttp-Response-Body", "Truncated");

    /* JADX INFO: renamed from: a */
    public final z4l0 f219839a;

    /* JADX INFO: renamed from: b */
    public final egx f219840b;

    /* JADX INFO: renamed from: c */
    public final rb5 f219841c;

    /* JADX INFO: renamed from: d */
    public int f219842d;

    /* JADX INFO: renamed from: e */
    public final tn20 f219843e;

    public tf30(z4l0 z4l0Var, egx egxVar, rb5 rb5Var) {
        this.f219839a = z4l0Var;
        this.f219840b = egxVar;
        this.f219841c = rb5Var;
        this.f219843e = new tn20((vuu0) rb5Var.f197472c);
    }

    @Override // p204p.fgx
    /* JADX INFO: renamed from: a */
    public final void mo41628a() {
        ((tuu0) this.f219841c.f197473d).flush();
    }

    @Override // p204p.fgx
    /* JADX INFO: renamed from: b */
    public final wt31 mo41629b(n2x0 n2x0Var) {
        auw0 auw0Var = n2x0Var.f149857a;
        if (!ch30.m32745a(n2x0Var)) {
            return m80601k(auw0Var.f20037a, 0L);
        }
        String strM78534b = n2x0Var.f149862f.m78534b("Transfer-Encoding");
        if (strM78534b == null) {
            strM78534b = null;
        }
        if ("chunked".equalsIgnoreCase(strM78534b)) {
            ph30 ph30Var = auw0Var.f20037a;
            if (this.f219842d == 4) {
                this.f219842d = 5;
                return new qf30(this, ph30Var);
            }
            throw new IllegalStateException(("state: " + this.f219842d).toString());
        }
        long jM31134e = c0f1.m31134e(n2x0Var);
        if (jM31134e != -1) {
            return m80601k(auw0Var.f20037a, jM31134e);
        }
        ph30 ph30Var2 = auw0Var.f20037a;
        if (this.f219842d == 4) {
            this.f219842d = 5;
            this.f219840b.mo27261b();
            return new sf30(this, ph30Var2);
        }
        throw new IllegalStateException(("state: " + this.f219842d).toString());
    }

    @Override // p204p.fgx
    /* JADX INFO: renamed from: c */
    public final void mo41630c(auw0 auw0Var) {
        Proxy.Type type = this.f219840b.mo27263d().f210739b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(auw0Var.f20038b);
        sb.append(' ');
        ph30 ph30Var = auw0Var.f20037a;
        if (ph30Var.m69942f() || type != Proxy.Type.HTTP) {
            String strM69938b = ph30Var.m69938b();
            String strM69940d = ph30Var.m69940d();
            if (strM69940d != null) {
                strM69938b = strM69938b + '?' + strM69940d;
            }
            sb.append(strM69938b);
        } else {
            sb.append(ph30Var);
        }
        sb.append(" HTTP/1.1");
        m80602l(auw0Var.f20039c, sb.toString());
    }

    @Override // p204p.fgx
    public final void cancel() {
        this.f219840b.cancel();
    }

    @Override // p204p.fgx
    /* JADX INFO: renamed from: d */
    public final ai21 mo41631d(auw0 auw0Var, long j) {
        if ("chunked".equalsIgnoreCase(auw0Var.f20039c.m78534b("Transfer-Encoding"))) {
            if (this.f219842d == 1) {
                this.f219842d = 2;
                return new pf30(this);
            }
            throw new IllegalStateException(("state: " + this.f219842d).toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f219842d == 1) {
            this.f219842d = 2;
            return new eey(this);
        }
        throw new IllegalStateException(("state: " + this.f219842d).toString());
    }

    @Override // p204p.fgx
    /* JADX INFO: renamed from: e */
    public final boolean mo41632e() {
        return this.f219842d == 6;
    }

    @Override // p204p.fgx
    /* JADX INFO: renamed from: f */
    public final z1x0 mo41633f(boolean z) {
        tn20 tn20Var = this.f219843e;
        gqa gqaVar = (gqa) tn20Var.f221865b;
        int i = this.f219842d;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f219842d).toString());
        }
        try {
            String strMo45421S = gqaVar.mo45421S(tn20Var.f221864a);
            tn20Var.f221864a -= (long) strMo45421S.length();
            vra0 vra0VarM43278t = g0b1.m43278t(strMo45421S);
            int i2 = vra0VarM43278t.f244125b;
            z1x0 z1x0Var = new z1x0();
            z1x0Var.f278423b = (r3t0) vra0VarM43278t.f244127d;
            z1x0Var.f278424c = i2;
            z1x0Var.f278425d = (String) vra0VarM43278t.f244126c;
            sep sepVar = new sep(1, false);
            while (true) {
                String strMo45421S2 = gqaVar.mo45421S(tn20Var.f221864a);
                tn20Var.f221864a -= (long) strMo45421S2.length();
                if (strMo45421S2.length() == 0) {
                    break;
                }
                sepVar.m77931e(strMo45421S2);
            }
            z1x0Var.f278427f = sepVar.m77935i().m78536e();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f219842d = 3;
                return z1x0Var;
            }
            if (102 > i2 || i2 >= 200) {
                this.f219842d = 4;
                return z1x0Var;
            }
            this.f219842d = 3;
            return z1x0Var;
        } catch (EOFException e) {
            throw new IOException(edb.m38564m("unexpected end of stream on ", this.f219840b.mo27263d().f210738a.f276529h.m69944h()), e);
        }
    }

    @Override // p204p.fgx
    /* JADX INFO: renamed from: g */
    public final long mo41634g(n2x0 n2x0Var) {
        if (!ch30.m32745a(n2x0Var)) {
            return 0L;
        }
        String strM78534b = n2x0Var.f149862f.m78534b("Transfer-Encoding");
        if (strM78534b == null) {
            strM78534b = null;
        }
        if ("chunked".equalsIgnoreCase(strM78534b)) {
            return -1L;
        }
        return c0f1.m31134e(n2x0Var);
    }

    @Override // p204p.fgx
    /* JADX INFO: renamed from: h */
    public final void mo41635h() {
        ((tuu0) this.f219841c.f197473d).flush();
    }

    @Override // p204p.fgx
    /* JADX INFO: renamed from: i */
    public final ck31 mo41636i() {
        return this.f219841c;
    }

    @Override // p204p.fgx
    /* JADX INFO: renamed from: j */
    public final egx mo41637j() {
        return this.f219840b;
    }

    /* JADX INFO: renamed from: k */
    public final rf30 m80601k(ph30 ph30Var, long j) {
        if (this.f219842d == 4) {
            this.f219842d = 5;
            return new rf30(this, ph30Var, j);
        }
        throw new IllegalStateException(("state: " + this.f219842d).toString());
    }

    /* JADX INFO: renamed from: l */
    public final void m80602l(sn20 sn20Var, String str) {
        if (this.f219842d != 0) {
            throw new IllegalStateException(("state: " + this.f219842d).toString());
        }
        rb5 rb5Var = this.f219841c;
        tuu0 tuu0Var = (tuu0) rb5Var.f197473d;
        tuu0 tuu0Var2 = (tuu0) rb5Var.f197473d;
        tuu0Var.mo42406b0(str);
        tuu0Var.mo42406b0("\r\n");
        int size = sn20Var.size();
        for (int i = 0; i < size; i++) {
            tuu0Var2.mo42406b0(sn20Var.m78535d(i));
            tuu0Var2.mo42406b0(": ");
            tuu0Var2.mo42406b0(sn20Var.m78538i(i));
            tuu0Var2.mo42406b0("\r\n");
        }
        tuu0Var2.mo42406b0("\r\n");
        this.f219842d = 1;
    }
}
