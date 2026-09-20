package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class v870 implements p870 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f238419a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayList f238420b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f238421c = new ArrayList(0);

    /* JADX INFO: renamed from: d */
    public final ArrayList f238422d;

    public v870() {
        y6f0.f269773a.getClass();
        List listM90086a = x6f0.m90086a();
        ArrayList arrayList = new ArrayList(i6f.m49804T(listM90086a, 10));
        Iterator it = listM90086a.iterator();
        while (it.hasNext()) {
            ((ho60) ((y6f0) it.next())).getClass();
            arrayList.add(new lo60());
        }
        this.f238422d = arrayList;
    }

    @Override // p204p.p870
    /* JADX INFO: renamed from: a */
    public final ArrayList mo49936a() {
        return this.f238420b;
    }

    @Override // p204p.p870
    /* JADX INFO: renamed from: b */
    public final ArrayList mo49937b() {
        return this.f238421c;
    }

    @Override // p204p.p870
    /* JADX INFO: renamed from: c */
    public final ArrayList mo49938c() {
        return this.f238419a;
    }
}
