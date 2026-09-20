package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class crm0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41328a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f41329b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f41330c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f41331d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ z00 f41332e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ tbo0 f41333f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ crm0(gh00 gh00Var, boolean z, boolean z2, z00 z00Var, tbo0 tbo0Var, int i) {
        super(1);
        this.f41328a = i;
        this.f41329b = gh00Var;
        this.f41330c = z;
        this.f41331d = z2;
        this.f41332e = z00Var;
        this.f41333f = tbo0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        String str;
        switch (this.f41328a) {
            case 0:
                aai0 aai0Var = (aai0) obj;
                boolean zEquals = aai0Var.equals(y9i0.f270605b);
                gh00 gh00Var = this.f41329b;
                if (zEquals) {
                    gh00Var.invoke(bbo0.f25625a);
                } else if (aai0Var.equals(y9i0.f270606c)) {
                    gh00Var.invoke(yao0.f270956a);
                } else if (aai0Var.equals(y9i0.f270608e)) {
                    gh00Var.invoke(vao0.f239304a);
                } else if (aai0Var.equals(y9i0.f270609f)) {
                    gh00Var.invoke(wao0.f249556a);
                } else if (aai0Var instanceof z9i0) {
                    ang1.m26499h(((z9i0) aai0Var).f280812a, gh00Var, this.f41330c, this.f41331d);
                } else {
                    if (aai0Var.equals(y9i0.f270610g)) {
                        z00 z00Var = this.f41332e;
                        gh00Var.invoke(new fbo0(z00Var != null ? z00Var.f277928e : null, null));
                    } else if (aai0Var.equals(y9i0.f270604a)) {
                        z00 z00Var2 = (z00) this.f41333f.f218912c.get(k70.f119892t);
                        gh00Var.invoke(new sao0(z00Var2 != null ? z00Var2.f277928e : null));
                    }
                }
                break;
            case 1:
                s9i0 s9i0Var = (s9i0) obj;
                boolean zEquals2 = s9i0Var.equals(q9i0.f186600b);
                gh00 gh00Var2 = this.f41329b;
                if (zEquals2) {
                    gh00Var2.invoke(bbo0.f25625a);
                } else if (s9i0Var.equals(q9i0.f186601c)) {
                    gh00Var2.invoke(yao0.f270956a);
                } else if (s9i0Var.equals(q9i0.f186603e)) {
                    gh00Var2.invoke(vao0.f239304a);
                } else if (s9i0Var.equals(q9i0.f186604f)) {
                    gh00Var2.invoke(wao0.f249556a);
                } else if (s9i0Var instanceof r9i0) {
                    ang1.m26499h(((r9i0) s9i0Var).f197065a, gh00Var2, this.f41330c, this.f41331d);
                } else {
                    if (s9i0Var.equals(q9i0.f186605g)) {
                        z00 z00Var3 = this.f41332e;
                        gh00Var2.invoke(new fbo0(z00Var3 != null ? z00Var3.f277928e : null, null));
                    } else if (s9i0Var.equals(q9i0.f186599a)) {
                        z00 z00Var4 = (z00) this.f41333f.f218912c.get(k70.f119892t);
                        gh00Var2.invoke(new sao0(z00Var4 != null ? z00Var4.f277928e : null));
                    }
                }
                break;
            default:
                w9i0 w9i0Var = (w9i0) obj;
                boolean zEquals3 = w9i0Var.equals(u9i0.f228204b);
                tbo0 tbo0Var = this.f41333f;
                gh00 gh00Var3 = this.f41329b;
                if (zEquals3) {
                    if (tbo0Var.f218911b.f38724h.f262978h) {
                        gh00Var3.invoke(abo0.f14149a);
                    } else {
                        gh00Var3.invoke(bbo0.f25625a);
                    }
                } else if (w9i0Var.equals(u9i0.f228205c)) {
                    gh00Var3.invoke(yao0.f270956a);
                } else if (w9i0Var.equals(u9i0.f228206d)) {
                    z00 z00Var5 = (z00) tbo0Var.f218912c.get(k70.f119881Y);
                    if (z00Var5 == null || (str = z00Var5.f277928e) == null) {
                        str = "";
                    }
                    gh00Var3.invoke(new rao0(str));
                } else if (w9i0Var.equals(u9i0.f228208f)) {
                    gh00Var3.invoke(vao0.f239304a);
                } else if (w9i0Var.equals(u9i0.f228209g)) {
                    gh00Var3.invoke(wao0.f249556a);
                } else if (w9i0Var instanceof v9i0) {
                    ang1.m26499h(((v9i0) w9i0Var).f238974a, gh00Var3, this.f41330c, this.f41331d);
                } else {
                    if (w9i0Var.equals(u9i0.f228210h)) {
                        z00 z00Var6 = this.f41332e;
                        gh00Var3.invoke(new fbo0(z00Var6 != null ? z00Var6.f277928e : null, null));
                    } else if (w9i0Var.equals(u9i0.f228203a)) {
                        z00 z00Var7 = (z00) tbo0Var.f218912c.get(k70.f119892t);
                        gh00Var3.invoke(new sao0(z00Var7 != null ? z00Var7.f277928e : null));
                    }
                }
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crm0(tbo0 tbo0Var, gh00 gh00Var, boolean z, boolean z2, z00 z00Var) {
        super(1);
        this.f41328a = 2;
        this.f41333f = tbo0Var;
        this.f41329b = gh00Var;
        this.f41330c = z;
        this.f41331d = z2;
        this.f41332e = z00Var;
    }
}
