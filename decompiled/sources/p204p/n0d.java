package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class n0d implements Parcelable {
    public static final Parcelable.Creator<n0d> CREATOR = new qvc(8);

    /* JADX INFO: renamed from: a */
    public final String f149021a;

    /* JADX INFO: renamed from: b */
    public final boolean f149022b;

    /* JADX INFO: renamed from: c */
    public final sxd f149023c;

    /* JADX INFO: renamed from: d */
    public final nmn0 f149024d;

    /* JADX INFO: renamed from: e */
    public final List f149025e;

    /* JADX INFO: renamed from: f */
    public final List f149026f;

    public n0d(String str, boolean z, sxd sxdVar, nmn0 nmn0Var, List list, List list2) {
        this.f149021a = str;
        this.f149022b = z;
        this.f149023c = sxdVar;
        this.f149024d = nmn0Var;
        this.f149025e = list;
        this.f149026f = list2;
    }

    /* JADX INFO: renamed from: c */
    public static n0d m63387c(n0d n0dVar, boolean z, rxd rxdVar, List list, List list2, int i) {
        String str = n0dVar.f149021a;
        if ((i & 2) != 0) {
            z = n0dVar.f149022b;
        }
        boolean z2 = z;
        sxd sxdVar = rxdVar;
        if ((i & 4) != 0) {
            sxdVar = n0dVar.f149023c;
        }
        sxd sxdVar2 = sxdVar;
        nmn0 nmn0Var = n0dVar.f149024d;
        if ((i & 16) != 0) {
            list = n0dVar.f149025e;
        }
        List list3 = list;
        if ((i & 32) != 0) {
            list2 = n0dVar.f149026f;
        }
        n0dVar.getClass();
        return new n0d(str, z2, sxdVar2, nmn0Var, list3, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0d)) {
            return false;
        }
        n0d n0dVar = (n0d) obj;
        return wj50.m88271j(this.f149021a, n0dVar.f149021a) && this.f149022b == n0dVar.f149022b && wj50.m88271j(this.f149023c, n0dVar.f149023c) && wj50.m88271j(this.f149024d, n0dVar.f149024d) && wj50.m88271j(this.f149025e, n0dVar.f149025e) && wj50.m88271j(this.f149026f, n0dVar.f149026f);
    }

    /* JADX INFO: renamed from: g */
    public final sxd m63388g() {
        return this.f149023c;
    }

    /* JADX INFO: renamed from: h */
    public final List m63389h() {
        return this.f149025e;
    }

    public final int hashCode() {
        return this.f149026f.hashCode() + s571.m77244c((this.f149024d.hashCode() + ((this.f149023c.hashCode() + s571.m77245d(this.f149021a.hashCode() * 31, 31, this.f149022b)) * 31)) * 31, 31, this.f149025e);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m63390j() {
        return this.f149022b;
    }

    /* JADX INFO: renamed from: k */
    public final nmn0 m63391k() {
        return this.f149024d;
    }

    /* JADX INFO: renamed from: l */
    public final List m63392l() {
        return this.f149026f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f149021a);
        parcel.writeInt(this.f149022b ? 1 : 0);
        parcel.writeParcelable(this.f149023c, i);
        this.f149024d.writeToParcel(parcel, i);
        Iterator itM42468l = fr0.m42468l(parcel, this.f149025e);
        while (itM42468l.hasNext()) {
            ((akk) itM42468l.next()).writeToParcel(parcel, i);
        }
        Iterator itM42468l2 = fr0.m42468l(parcel, this.f149026f);
        while (itM42468l2.hasNext()) {
            ((pck) itM42468l2.next()).writeToParcel(parcel, i);
        }
    }
}
