package p204p;

import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final class ix61 {

    /* JADX INFO: renamed from: a */
    public final vmz f106610a;

    public ix61(vmz vmzVar) {
        this.f106610a = vmzVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m51859a(ix61 ix61Var, fbk fbkVar) {
        hx61 hx61Var;
        ix61Var.getClass();
        if (fbkVar instanceof hx61) {
            hx61Var = (hx61) fbkVar;
            int i = hx61Var.f96150c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hx61Var.f96150c = i - Integer.MIN_VALUE;
            } else {
                hx61Var = new hx61(ix61Var, fbkVar);
            }
        } else {
            hx61Var = new hx61(ix61Var, fbkVar);
        }
        Object objM86755t = hx61Var.f96148a;
        int i2 = hx61Var.f96150c;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            fiz fizVarM86026c = ix61Var.f106610a.m86026c("country_code", "");
            hx61Var.f96150c = 1;
            objM86755t = vyf1.m86755t(fizVarM86026c, hx61Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        String upperCase = ((String) objM86755t).toUpperCase(Locale.ROOT);
        if (upperCase.equals("NZ")) {
            return null;
        }
        return upperCase.equals("US") ? jba0.m52886z6(2026, 10, 23) : jba0.m52886z6(2026, 12, 1);
    }
}
