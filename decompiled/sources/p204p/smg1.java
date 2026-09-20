package p204p;

import com.google.android.recaptcha.internal.zzhg;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class smg1 {

    /* JADX INFO: renamed from: a */
    public final log1 f210653a;

    /* JADX INFO: renamed from: b */
    public final Integer f210654b;

    /* JADX INFO: renamed from: c */
    public final long f210655c;

    /* JADX INFO: renamed from: d */
    public final int f210656d;

    public smg1(log1 log1Var, int i, Integer num) {
        this.f210653a = log1Var;
        this.f210656d = i;
        this.f210654b = num;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ybf1 ybf1VarM64135b = ncf1.m64135b((int) ((jCurrentTimeMillis % 1000) * 1000000), jCurrentTimeMillis / 1000);
        ncf1.m64134a(ybf1VarM64135b);
        long jM93261w = ybf1VarM64135b.m93261w();
        int iM93262x = ybf1VarM64135b.m93262x();
        ((SimpleDateFormat) ncf1.f152507a.get()).format(new Date(jM93261w * 1000));
        if (iM93262x != 0) {
            if (iM93262x % 1000000 == 0) {
                String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(iM93262x / 1000000));
            } else if (iM93262x % 1000 == 0) {
                String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(iM93262x / 1000));
            } else {
                String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(iM93262x));
            }
        }
        this.f210655c = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: a */
    public final log1 m78523a() {
        return this.f210653a;
    }

    /* JADX INFO: renamed from: b */
    public final void m78524b(zzhg zzhgVar) {
        int i;
        vcf1 vcf1VarM38578w = edf1.m38578w();
        String strValueOf = String.valueOf(zzhgVar.f2335a.f287861b);
        vcf1VarM38578w.m52811c();
        ((edf1) vcf1VarM38578w.f110458b).m38580x(strValueOf);
        int i2 = zzhgVar.f2336b.f287861b;
        vcf1VarM38578w.m52811c();
        ((edf1) vcf1VarM38578w.f110458b).m38581y(i2);
        switch (zzhgVar.m1671b().f2332a) {
            case 1:
                i = 0;
                break;
            case 2:
                i = 1;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 4;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 7;
                break;
            case 9:
                i = 100;
                break;
            default:
                throw null;
        }
        vcf1VarM38578w.m52811c();
        ((edf1) vcf1VarM38578w.f110458b).m38579A(i);
        String str = zzhgVar.f2337c;
        if (str != null) {
            vcf1VarM38578w.m52811c();
            ((edf1) vcf1VarM38578w.f110458b).m38582z(str);
        }
        this.f210653a.m59567c(m78525c(4), (edf1) vcf1VarM38578w.m52814g());
    }

    /* JADX INFO: renamed from: c */
    public final idf1 m78525c(int i) {
        idf1 idf1VarM53021A = jdf1.m53021A();
        idf1VarM53021A.m52811c();
        ((jdf1) idf1VarM53021A.f110458b).m53033M(this.f210656d);
        String str = cmg1.f39668d;
        idf1VarM53021A.m52811c();
        ((jdf1) idf1VarM53021A.f110458b).m53023C(str);
        log1 log1Var = this.f210653a;
        String str2 = log1Var.f135428d;
        idf1VarM53021A.m52811c();
        ((jdf1) idf1VarM53021A.f110458b).m53025E(str2);
        fog1 fog1Var = log1Var.f135427c;
        String str3 = fog1Var.f71533d;
        idf1VarM53021A.m52811c();
        ((jdf1) idf1VarM53021A.f110458b).m53024D(str3);
        int i2 = fog1Var.f71534e;
        idf1VarM53021A.m52811c();
        ((jdf1) idf1VarM53021A.f110458b).m53034N(i2);
        idf1VarM53021A.m52811c();
        ((jdf1) idf1VarM53021A.f110458b).m53036x(i);
        long j = this.f210655c;
        ybf1 ybf1VarM64135b = ncf1.m64135b((int) ((j % 1000) * 1000000), j / 1000);
        idf1VarM53021A.m52811c();
        ((jdf1) idf1VarM53021A.f110458b).m53029I(ybf1VarM64135b);
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        gaf1 gaf1VarM61462c = mcf1.m61462c((int) ((jCurrentTimeMillis % 1000) * 1000000), jCurrentTimeMillis / 1000);
        idf1VarM53021A.m52811c();
        ((jdf1) idf1VarM53021A.f110458b).m53026F(gaf1VarM61462c);
        Integer num = this.f210654b;
        if (num != null) {
            int iIntValue = num.intValue();
            idf1VarM53021A.m52811c();
            ((jdf1) idf1VarM53021A.f110458b).m53031K(iIntValue);
        }
        return idf1VarM53021A;
    }
}
