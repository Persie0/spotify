package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class d731 {

    /* JADX INFO: renamed from: a */
    public final lsi0 f45984a = msi0.m62770a();

    /* JADX INFO: renamed from: b */
    public final yum0 f45985b = sam.m77645B(null);

    /* JADX INFO: renamed from: c */
    public static Object m35172c(d731 d731Var, String str, mb61 mb61Var, int i) {
        d731Var.getClass();
        return d731Var.m35174b(new a731(str, 1), mb61Var);
    }

    /* JADX INFO: renamed from: a */
    public final y631 m35173a() {
        return (y631) this.f45985b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final Object m35174b(a731 a731Var, ibk ibkVar) {
        c731 c731Var;
        jsi0 jsi0Var;
        a731 a731Var2;
        Throwable th;
        jsi0 jsi0Var2;
        if (ibkVar instanceof c731) {
            c731Var = (c731) ibkVar;
            int i = c731Var.f34738e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c731Var.f34738e = i - Integer.MIN_VALUE;
            } else {
                c731Var = new c731(this, ibkVar);
            }
        } else {
            c731Var = new c731(this, ibkVar);
        }
        Object obj = c731Var.f34736c;
        int i2 = c731Var.f34738e;
        yum0 yum0Var = this.f45985b;
        yuk yukVar = yuk.f276404a;
        try {
            try {
                if (i2 == 0) {
                    bga.m29073P(obj);
                    c731Var.f34734a = a731Var;
                    jsi0Var = this.f45984a;
                    c731Var.f34735b = jsi0Var;
                    c731Var.f34738e = 1;
                    if (jsi0Var.mo54248a(c731Var) != yukVar) {
                    }
                    a731Var2 = a731Var;
                    return yukVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jsi0Var2 = c731Var.f34735b;
                    try {
                        bga.m29073P(obj);
                        yum0Var.setValue(null);
                        jsi0Var2.mo54249c(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        yum0Var.setValue(null);
                        throw th;
                    }
                }
                jsi0 jsi0Var3 = c731Var.f34735b;
                a731 a731Var3 = c731Var.f34734a;
                bga.m29073P(obj);
                jsi0Var = jsi0Var3;
                a731Var2 = a731Var3;
                a731Var2 = a731Var;
                c731Var.f34734a = a731Var2;
                c731Var.f34735b = jsi0Var;
                c731Var.f34738e = 2;
                hqb hqbVar = new hqb(1, seg1.m77914f(c731Var));
                hqbVar.m48222q();
                yum0Var.setValue(new y631(a731Var2, hqbVar));
                Object objM48221p = hqbVar.m48221p();
                if (objM48221p != yukVar) {
                    jsi0 jsi0Var4 = jsi0Var;
                    obj = objM48221p;
                    jsi0Var2 = jsi0Var4;
                    yum0Var.setValue(null);
                    jsi0Var2.mo54249c(null);
                    return obj;
                }
                a731Var2 = a731Var;
                return yukVar;
            } catch (Throwable th3) {
                th = th3;
                yum0Var.setValue(null);
                throw th;
            }
        } catch (Throwable th4) {
            a731Var.mo54249c(null);
            throw th4;
        }
    }
}
