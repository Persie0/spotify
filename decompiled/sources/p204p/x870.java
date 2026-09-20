package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class x870 {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ qr60[] f259064p = {new spi0(x870.class, "_hasSetter", "get_hasSetter()Z", 0), new spi0(x870.class, "_hasGetter", "get_hasGetter()Z", 0)};

    /* JADX INFO: renamed from: a */
    public int f259065a;

    /* JADX INFO: renamed from: b */
    public final String f259066b;

    /* JADX INFO: renamed from: c */
    public final y870 f259067c;

    /* JADX INFO: renamed from: d */
    public final y870 f259068d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f259069e;

    /* JADX INFO: renamed from: f */
    public a970 f259070f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f259071g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f259072h;

    /* JADX INFO: renamed from: i */
    public g970 f259073i;

    /* JADX INFO: renamed from: j */
    public a970 f259074j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f259075k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f259076l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f259077m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f259078n;

    /* JADX INFO: renamed from: o */
    public final ArrayList f259079o;

    public x870(int i, int i2, int i3, String str) {
        this.f259065a = i;
        this.f259066b = str;
        zk1 zk1VarM84002v = uuf1.m84002v(new dfz(nfz.f153443C, 1));
        zk1 zk1VarM84002v2 = uuf1.m84002v(new dfz(nfz.f153442B, 1));
        y870 y870Var = new y870(i2);
        qr60[] qr60VarArr = f259064p;
        qr60 qr60Var = qr60VarArr[1];
        afz.f15244h.mo25834b0(this, Integer.valueOf(zk1VarM84002v2.f283580c | Integer.valueOf(this.f259065a).intValue()));
        this.f259067c = y870Var;
        qr60 qr60Var2 = qr60VarArr[0];
        this.f259068d = zk1VarM84002v.m96258A(this) ? new y870(i3) : null;
        this.f259069e = new ArrayList(0);
        this.f259071g = new ArrayList(0);
        new ArrayList(0);
        this.f259072h = new ArrayList();
        this.f259075k = new ArrayList(0);
        this.f259076l = new ArrayList(0);
        this.f259077m = new ArrayList(0);
        this.f259078n = new ArrayList(0);
        y6f0.f269773a.getClass();
        List listM90086a = x6f0.m90086a();
        ArrayList arrayList = new ArrayList(i6f.m49804T(listM90086a, 10));
        Iterator it = listM90086a.iterator();
        while (it.hasNext()) {
            ((ho60) ((y6f0) it.next())).getClass();
            arrayList.add(new po60());
        }
        this.f259079o = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final String m90180a() {
        return this.f259066b;
    }

    /* JADX INFO: renamed from: b */
    public final a970 m90181b() {
        return this.f259070f;
    }

    /* JADX INFO: renamed from: c */
    public final a970 m90182c() {
        a970 a970Var = this.f259074j;
        if (a970Var != null) {
            return a970Var;
        }
        wj50.m88260d0("returnType");
        throw null;
    }
}
