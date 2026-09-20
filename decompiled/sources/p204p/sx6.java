package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sx6 implements wfq0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f214822a;

    public /* synthetic */ sx6(int i) {
        this.f214822a = i;
    }

    @Override // p204p.wfq0
    public final boolean apply(Object obj) {
        switch (this.f214822a) {
            case 0:
                return !((tx6) obj).f224573a.f255954m;
            case 1:
                return ((Map.Entry) obj).getKey() != null;
            case 2:
                return ((String) obj) != null;
            case 3:
                return ((nnx) obj).f156506b != null;
            case 4:
                return ((nnx) obj).f156507c != null;
            case 5:
                sf50 sf50Var = (sf50) obj;
                return sf50Var.f208467b.equals("com.apple.iTunes") && sf50Var.f208468c.equals("iTunSMPB");
            case 6:
                return ((String) obj) != null;
            case 7:
                return nhg1.m64492l(((z8t) obj).f280556a, new sx6(10));
            case 8:
                return nhg1.m64492l(((z8t) obj).f280556a, new sx6(9));
            case 9:
                return !((y8t) obj).f270378f.f157605b.isEmpty();
            default:
                return !((y8t) obj).f270378f.f157604a.isEmpty();
        }
    }
}
