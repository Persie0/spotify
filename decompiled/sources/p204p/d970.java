package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class d970 {

    /* JADX INFO: renamed from: a */
    public int f46708a;

    /* JADX INFO: renamed from: b */
    public final String f46709b;

    /* JADX INFO: renamed from: c */
    public final int f46710c;

    /* JADX INFO: renamed from: d */
    public final int f46711d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f46712e = new ArrayList(1);

    /* JADX INFO: renamed from: f */
    public final ArrayList f46713f;

    public d970(int i, int i2, int i3, String str) {
        this.f46708a = i;
        this.f46709b = str;
        this.f46710c = i2;
        this.f46711d = i3;
        y6f0.f269773a.getClass();
        List listM90086a = x6f0.m90086a();
        ArrayList arrayList = new ArrayList(i6f.m49804T(listM90086a, 10));
        Iterator it = listM90086a.iterator();
        while (it.hasNext()) {
            ((ho60) ((y6f0) it.next())).getClass();
            arrayList.add(new np60());
        }
        this.f46713f = arrayList;
    }
}
