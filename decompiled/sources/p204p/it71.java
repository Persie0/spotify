package p204p;

import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class it71 implements by11 {

    /* JADX INFO: renamed from: a */
    public final vmz f105456a;

    /* JADX INFO: renamed from: b */
    public final i4t0 f105457b;

    /* JADX INFO: renamed from: c */
    public final boolean f105458c;

    /* JADX INFO: renamed from: d */
    public final wg61 f105459d;

    public it71(jw20 jw20Var, vmz vmzVar, pwn pwnVar, boolean z) {
        this.f105456a = vmzVar;
        this.f105457b = pwnVar;
        this.f105458c = z;
        this.f105459d = new wg61(new e371(9, jw20Var, this));
    }

    /* JADX INFO: renamed from: b */
    public static final xx11 m51610b(it71 it71Var, int i) {
        fou fouVar = fou.f71631c;
        Integer numValueOf = Integer.valueOf(i);
        String strM77250i = it71Var.f105458c ? s571.m77250i(xoc1.f264171q4.f243453a, ":0") : xoc1.f264171q4.f243453a;
        p221 p221Var = new p221(0, 12, "listening_stats", new tf41(1, it71Var, it71.class, "newnessExpiryDate", "newnessExpiryDate(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 12), false);
        tfh0 tfh0Var = (tfh0) it71Var.f105457b.get();
        tfh0Var.getClass();
        return new xx11(fouVar, numValueOf, strM77250i, p221Var, new wx11(new lfh0(tfh0Var), ua71.f228425t), null, 66);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: c */
    public static final Object m51611c(it71 it71Var, fbk fbkVar) {
        ht71 ht71Var;
        it71Var.getClass();
        if (fbkVar instanceof ht71) {
            ht71Var = (ht71) fbkVar;
            int i = ht71Var.f94951c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ht71Var.f94951c = i - Integer.MIN_VALUE;
            } else {
                ht71Var = new ht71(it71Var, fbkVar);
            }
        } else {
            ht71Var = new ht71(it71Var, fbkVar);
        }
        Object objM86755t = ht71Var.f94949a;
        int i2 = ht71Var.f94951c;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            fiz fizVarM86026c = it71Var.f105456a.m86026c("country_code", "");
            ht71Var.f94951c = 1;
            objM86755t = vyf1.m86755t(fizVarM86026c, ht71Var);
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
        int iHashCode = upperCase.hashCode();
        if (iHashCode != 2128) {
            if (iHashCode != 2331) {
                if (iHashCode != 2341 || !upperCase.equals("IN")) {
                    return null;
                }
            } else if (!upperCase.equals("ID")) {
                return null;
            }
        } else if (!upperCase.equals("BR")) {
            return null;
        }
        return jba0.m52886z6(2026, 12, 1);
    }

    @Override // p204p.by11
    /* JADX INFO: renamed from: a */
    public final fiz mo30863a() {
        return (fiz) this.f105459d.getValue();
    }
}
