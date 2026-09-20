package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class l1g0 implements pql0 {
    public static final Parcelable.Creator<l1g0> CREATOR = new xuf0(2);

    /* JADX INFO: renamed from: a */
    public final String f128715a;

    /* JADX INFO: renamed from: b */
    public final List f128716b;

    /* JADX INFO: renamed from: c */
    public final List f128717c;

    /* JADX INFO: renamed from: d */
    public final List f128718d;

    public l1g0(String str, ArrayList arrayList, List list, ArrayList arrayList2) {
        this.f128715a = str;
        this.f128716b = arrayList;
        this.f128717c = list;
        this.f128718d = arrayList2;
    }

    @Override // p204p.pql0
    /* JADX INFO: renamed from: E0 */
    public final jys mo26725E0(jys jysVar) {
        qf40 qf40Var = jysVar.f117475k;
        int iM31820L = c95.m31820L(i6f.m49804T(qf40Var, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
        for (Object obj : qf40Var) {
            linkedHashMap.put(((hys) obj).f96654a, obj);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f128716b.iterator();
        while (it.hasNext()) {
            hys hysVar = (hys) linkedHashMap.get((String) it.next());
            if (hysVar != null) {
                arrayList.add(hysVar);
            }
        }
        return jys.m54805a(jysVar, false, false, false, null, null, null, null, opo.m67574x(arrayList), 1023);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1g0)) {
            return false;
        }
        l1g0 l1g0Var = (l1g0) obj;
        return wj50.m88271j(this.f128715a, l1g0Var.f128715a) && wj50.m88271j(this.f128716b, l1g0Var.f128716b) && wj50.m88271j(this.f128717c, l1g0Var.f128717c) && wj50.m88271j(this.f128718d, l1g0Var.f128718d);
    }

    public final int hashCode() {
        return this.f128718d.hashCode() + s571.m77244c(s571.m77244c(this.f128715a.hashCode() * 31, 31, this.f128716b), 31, this.f128717c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f128715a);
        parcel.writeStringList(this.f128716b);
        Iterator itM42468l = fr0.m42468l(parcel, this.f128717c);
        while (itM42468l.hasNext()) {
            parcel.writeStringList((List) itM42468l.next());
        }
        parcel.writeStringList(this.f128718d);
    }

    @Override // p204p.pql0
    /* JADX INFO: renamed from: A1 */
    public final pql0 mo26724A1(jys jysVar) {
        return this;
    }
}
