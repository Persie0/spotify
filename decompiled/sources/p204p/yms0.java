package p204p;

import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class yms0 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f274331a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f274332b;

    public /* synthetic */ yms0(String str, int i) {
        this.f274331a = i;
        this.f274332b = str;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f274331a) {
            case 0:
                String str = ((bls0) ((pqm0) obj2).f180350a).f28284g;
                String str2 = this.f274332b;
                return jlg1.m53703m(Integer.valueOf(wl51.m88458H0(str2, str, 0, false, 6)), Integer.valueOf(wl51.m88458H0(str2, ((bls0) ((pqm0) obj).f180350a).f28284g, 0, false, 6)));
            case 1:
                b3n0 b3n0Var = (b3n0) obj;
                b3n0 b3n0Var2 = (b3n0) obj2;
                ytf ytfVarMo88922e = ytf.f276111a.mo88922e(b3n0Var.f23081e, b3n0Var2.f23081e);
                String str3 = b3n0Var.f23082f;
                String str4 = this.f274332b;
                return ytfVarMo88922e.mo88922e(str3.equals(str4), b3n0Var2.f23082f.equals(str4)).mo88923f();
            default:
                String str5 = ((pb71) obj).f175731a;
                String str6 = this.f274332b;
                return jlg1.m53703m(Integer.valueOf(wl51.m88458H0(str6, str5, 0, false, 6)), Integer.valueOf(wl51.m88458H0(str6, ((pb71) obj2).f175731a, 0, false, 6)));
        }
    }
}
