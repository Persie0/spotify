package p204p;

import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class t6f0 {

    /* JADX INFO: renamed from: a */
    public final xre f217545a;

    /* JADX INFO: renamed from: b */
    public final qwx0 f217546b;

    /* JADX INFO: renamed from: c */
    public final xr9 f217547c;

    /* JADX INFO: renamed from: d */
    public final t1w f217548d;

    public t6f0(xre xreVar, qwx0 qwx0Var, xr9 xr9Var, t1w t1wVar) {
        this.f217545a = xreVar;
        this.f217546b = qwx0Var;
        this.f217547c = xr9Var;
        this.f217548d = t1wVar;
    }

    /* JADX INFO: renamed from: a */
    public final Single m80159a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Set set = dd41.f47702f;
            if (r46.m74708A((String) obj, gn80.ALBUM)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            Set set2 = dd41.f47702f;
            if (r46.m74708A((String) obj2, gn80.TRACK)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            Set set3 = dd41.f47702f;
            if (r46.m74708A((String) obj3, gn80.ARTIST)) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list) {
            Set set4 = dd41.f47702f;
            if (r46.m74711D((String) obj4, avp0.f20242e)) {
                arrayList4.add(obj4);
            }
        }
        mec0 mec0Var = new mec0();
        mec0Var.put(d73.class, arrayList);
        mec0Var.put(ks81.class, arrayList2);
        mec0Var.put(w46.class, arrayList3);
        mec0Var.put(v140.class, arrayList4);
        mec0Var.put(erc1.class, arrayList4);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : list) {
            Set set5 = dd41.f47702f;
            if (r46.m74708A((String) obj5, gn80.SHOW_SHOW)) {
                arrayList5.add(obj5);
            }
        }
        mec0Var.put(fs11.class, arrayList5);
        ArrayList arrayList6 = new ArrayList();
        for (Object obj6 : list) {
            Set set6 = dd41.f47702f;
            if (r46.m74708A((String) obj6, gn80.SHOW_EPISODE)) {
                arrayList6.add(obj6);
            }
        }
        mec0Var.put(xaw.class, arrayList6);
        return this.f217548d.m79885b(new gpx(mec0Var.m61540b())).flatMap(new oge0(this, arrayList2, arrayList3, 2)).map(new i780(20, list, this)).flatMap(new uu5(this));
    }

    /* JADX INFO: renamed from: b */
    public final Single m80160b(String str) {
        return m80159a(Collections.singletonList(str)).map(hsy.f94829N0);
    }
}
