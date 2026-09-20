package p204p;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class kzl0 implements vac {

    /* JADX INFO: renamed from: a */
    public final i4t0 f128163a;

    public kzl0(ihm ihmVar) {
        this.f128163a = ihmVar;
    }

    /* JADX INFO: renamed from: a */
    public final fsi m57760a() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        String lowerCase2 = Build.BRAND.toLowerCase(locale);
        int i = Build.VERSION.SDK_INT;
        boolean z = lowerCase.equals("lge") || lowerCase2.equals("lge");
        fsi fsiVar = fsi.OFF;
        if (z || lowerCase.equals("huawei") || lowerCase2.equals("huawei") || i < 34 || ((lowerCase.equals(d6n0.f45731d) || lowerCase2.equals(d6n0.f45731d)) && i < 36)) {
            return fsiVar;
        }
        i4t0 i4t0Var = this.f128163a;
        return (((fsi) i4t0Var.get()) != fsi.GOS_SE || i >= 36) ? (fsi) i4t0Var.get() : fsi.GOS;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m57761b() {
        return m57760a() != fsi.OFF;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m57762c() {
        return m57760a() == fsi.GOS_SE;
    }
}
