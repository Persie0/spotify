package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class i870 implements p870 {

    /* JADX INFO: renamed from: a */
    public int f99709a;

    /* JADX INFO: renamed from: b */
    public String f99710b;

    /* JADX INFO: renamed from: m */
    public String f99721m;

    /* JADX INFO: renamed from: n */
    public a970 f99722n;

    /* JADX INFO: renamed from: r */
    public final ArrayList f99726r;

    /* JADX INFO: renamed from: c */
    public final ArrayList f99711c = new ArrayList(0);

    /* JADX INFO: renamed from: d */
    public final ArrayList f99712d = new ArrayList(1);

    /* JADX INFO: renamed from: e */
    public final ArrayList f99713e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f99714f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final ArrayList f99715g = new ArrayList(0);

    /* JADX INFO: renamed from: h */
    public final ArrayList f99716h = new ArrayList(1);

    /* JADX INFO: renamed from: i */
    public final ArrayList f99717i = new ArrayList(0);

    /* JADX INFO: renamed from: j */
    public final ArrayList f99718j = new ArrayList(0);

    /* JADX INFO: renamed from: k */
    public final ArrayList f99719k = new ArrayList(0);

    /* JADX INFO: renamed from: l */
    public final ArrayList f99720l = new ArrayList(0);

    /* JADX INFO: renamed from: o */
    public final ArrayList f99723o = new ArrayList(0);

    /* JADX INFO: renamed from: p */
    public final ArrayList f99724p = new ArrayList(0);

    /* JADX INFO: renamed from: q */
    public final ArrayList f99725q = new ArrayList(0);

    public i870() {
        y6f0.f269773a.getClass();
        List listM90086a = x6f0.m90086a();
        ArrayList arrayList = new ArrayList(i6f.m49804T(listM90086a, 10));
        Iterator it = listM90086a.iterator();
        while (it.hasNext()) {
            ((ho60) ((y6f0) it.next())).getClass();
            arrayList.add(new tn60());
        }
        this.f99726r = arrayList;
    }

    @Override // p204p.p870
    /* JADX INFO: renamed from: a */
    public final ArrayList mo49936a() {
        return this.f99714f;
    }

    @Override // p204p.p870
    /* JADX INFO: renamed from: b */
    public final ArrayList mo49937b() {
        return this.f99715g;
    }

    @Override // p204p.p870
    /* JADX INFO: renamed from: c */
    public final ArrayList mo49938c() {
        return this.f99713e;
    }

    /* JADX INFO: renamed from: d */
    public final List m49939d() {
        return this.f99716h;
    }

    /* JADX INFO: renamed from: e */
    public final String m49940e() {
        String str = this.f99710b;
        if (str != null) {
            return str;
        }
        wj50.m88260d0("name");
        throw null;
    }
}
