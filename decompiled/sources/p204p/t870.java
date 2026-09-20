package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class t870 {

    /* JADX INFO: renamed from: a */
    public int f217987a;

    /* JADX INFO: renamed from: b */
    public final String f217988b;

    /* JADX INFO: renamed from: d */
    public a970 f217990d;

    /* JADX INFO: renamed from: f */
    public final ArrayList f217992f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f217993g;

    /* JADX INFO: renamed from: h */
    public a970 f217994h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f217995i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f217996j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f217997k;

    /* JADX INFO: renamed from: c */
    public final ArrayList f217989c = new ArrayList(0);

    /* JADX INFO: renamed from: e */
    public final ArrayList f217991e = new ArrayList(0);

    public t870(int i, String str) {
        this.f217987a = i;
        this.f217988b = str;
        new ArrayList(0);
        this.f217992f = new ArrayList();
        this.f217993g = new ArrayList();
        this.f217995i = new ArrayList(0);
        this.f217996j = new ArrayList(0);
        y6f0.f269773a.getClass();
        List listM90086a = x6f0.m90086a();
        ArrayList arrayList = new ArrayList(i6f.m49804T(listM90086a, 10));
        Iterator it = listM90086a.iterator();
        while (it.hasNext()) {
            ((ho60) ((y6f0) it.next())).getClass();
            arrayList.add(new zn60());
        }
        this.f217997k = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final String m80255a() {
        return this.f217988b;
    }
}
