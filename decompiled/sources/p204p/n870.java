package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class n870 {

    /* JADX INFO: renamed from: a */
    public int f151384a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f151385b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f151386c = new ArrayList(0);

    /* JADX INFO: renamed from: d */
    public final ArrayList f151387d = new ArrayList(0);

    /* JADX INFO: renamed from: e */
    public final ArrayList f151388e;

    public n870(int i) {
        this.f151384a = i;
        y6f0.f269773a.getClass();
        List listM90086a = x6f0.m90086a();
        ArrayList arrayList = new ArrayList(i6f.m49804T(listM90086a, 10));
        Iterator it = listM90086a.iterator();
        while (it.hasNext()) {
            ((ho60) ((y6f0) it.next())).getClass();
            arrayList.add(new vn60());
        }
        this.f151388e = arrayList;
    }
}
