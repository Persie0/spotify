package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class e731 {

    /* JADX INFO: renamed from: a */
    public final lsi0 f56796a = msi0.m62770a();

    /* JADX INFO: renamed from: b */
    public final yum0 f56797b = sam.m77645B(null);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final Object m38031a(String str, j631 j631Var, ibk ibkVar) {
        b731 b731Var;
        jsi0 jsi0Var;
        String str2;
        String str3;
        jsi0 jsi0Var2;
        if (ibkVar instanceof b731) {
            b731Var = (b731) ibkVar;
            int i = b731Var.f24154g;
            if ((i & Integer.MIN_VALUE) != 0) {
                b731Var.f24154g = i - Integer.MIN_VALUE;
            } else {
                b731Var = new b731(this, ibkVar);
            }
        } else {
            b731Var = new b731(this, ibkVar);
        }
        Object obj = b731Var.f24152e;
        int i2 = b731Var.f24154g;
        yum0 yum0Var = this.f56797b;
        yuk yukVar = yuk.f276404a;
        try {
            try {
                if (i2 == 0) {
                    bga.m29073P(obj);
                    b731Var.f24148a = str;
                    b731Var.f24149b = null;
                    b731Var.f24150c = j631Var;
                    jsi0Var = this.f56796a;
                    b731Var.f24151d = jsi0Var;
                    b731Var.f24154g = 1;
                    if (jsi0Var.mo54248a(b731Var) != yukVar) {
                        str2 = null;
                        str3 = str;
                    }
                    return yukVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jsi0Var2 = b731Var.f24151d;
                    try {
                        bga.m29073P(obj);
                        yum0Var.setValue(null);
                        jsi0Var2.mo54249c(null);
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        yum0Var.setValue(null);
                        throw th;
                    }
                }
                jsi0 jsi0Var3 = b731Var.f24151d;
                j631Var = b731Var.f24150c;
                str2 = b731Var.f24149b;
                String str4 = b731Var.f24148a;
                bga.m29073P(obj);
                jsi0Var = jsi0Var3;
                str3 = str4;
                b731Var.f24148a = str3;
                b731Var.f24149b = str2;
                b731Var.f24150c = j631Var;
                b731Var.f24151d = jsi0Var;
                b731Var.f24154g = 2;
                hqb hqbVar = new hqb(1, seg1.m77914f(b731Var));
                hqbVar.m48222q();
                yum0Var.setValue(new z631(str3, str2, j631Var, hqbVar));
                Object objM48221p = hqbVar.m48221p();
                if (objM48221p != yukVar) {
                    jsi0 jsi0Var4 = jsi0Var;
                    obj = objM48221p;
                    jsi0Var2 = jsi0Var4;
                    yum0Var.setValue(null);
                    jsi0Var2.mo54249c(null);
                    return obj;
                }
                return yukVar;
            } catch (Throwable th2) {
                th = th2;
                yum0Var.setValue(null);
                throw th;
            }
        } catch (Throwable th3) {
            str.mo54249c(null);
            throw th3;
        }
    }
}
