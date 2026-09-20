package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class rvc implements Parcelable {
    public static final Parcelable.Creator<rvc> CREATOR = new qvc(0);

    /* JADX INFO: renamed from: X */
    public final boolean f203048X;

    /* JADX INFO: renamed from: a */
    public final String f203049a;

    /* JADX INFO: renamed from: b */
    public final sxd f203050b;

    /* JADX INFO: renamed from: c */
    public final nmn0 f203051c;

    /* JADX INFO: renamed from: d */
    public final pcu0 f203052d;

    /* JADX INFO: renamed from: e */
    public final List f203053e;

    /* JADX INFO: renamed from: f */
    public final List f203054f;

    /* JADX INFO: renamed from: g */
    public final int f203055g;

    /* JADX INFO: renamed from: h */
    public final g5a1 f203056h;

    /* JADX INFO: renamed from: i */
    public final boolean f203057i;

    /* JADX INFO: renamed from: t */
    public final long f203058t;

    public rvc(String str, sxd sxdVar, nmn0 nmn0Var, pcu0 pcu0Var, List list, List list2, int i, g5a1 g5a1Var, boolean z, long j, boolean z2) {
        this.f203049a = str;
        this.f203050b = sxdVar;
        this.f203051c = nmn0Var;
        this.f203052d = pcu0Var;
        this.f203053e = list;
        this.f203054f = list2;
        this.f203055g = i;
        this.f203056h = g5a1Var;
        this.f203057i = z;
        this.f203058t = j;
        this.f203048X = z2;
    }

    /* JADX INFO: renamed from: c */
    public static rvc m76470c(rvc rvcVar, String str, rxd rxdVar, pcu0 pcu0Var, ArrayList arrayList, List list, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = rvcVar.f203049a;
        }
        String str2 = str;
        sxd sxdVar = (i2 & 2) != 0 ? rvcVar.f203050b : rxdVar;
        nmn0 nmn0Var = rvcVar.f203051c;
        pcu0 pcu0Var2 = (i2 & 8) != 0 ? rvcVar.f203052d : pcu0Var;
        List list2 = (i2 & 16) != 0 ? rvcVar.f203053e : arrayList;
        List list3 = (i2 & 32) != 0 ? rvcVar.f203054f : list;
        int i3 = (i2 & 64) != 0 ? rvcVar.f203055g : i;
        g5a1 g5a1Var = rvcVar.f203056h;
        boolean z = rvcVar.f203057i;
        long j = rvcVar.f203058t;
        boolean z2 = rvcVar.f203048X;
        rvcVar.getClass();
        return new rvc(str2, sxdVar, nmn0Var, pcu0Var2, list2, list3, i3, g5a1Var, z, j, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvc)) {
            return false;
        }
        rvc rvcVar = (rvc) obj;
        return wj50.m88271j(this.f203049a, rvcVar.f203049a) && wj50.m88271j(this.f203050b, rvcVar.f203050b) && wj50.m88271j(this.f203051c, rvcVar.f203051c) && wj50.m88271j(this.f203052d, rvcVar.f203052d) && wj50.m88271j(this.f203053e, rvcVar.f203053e) && wj50.m88271j(this.f203054f, rvcVar.f203054f) && this.f203055g == rvcVar.f203055g && wj50.m88271j(this.f203056h, rvcVar.f203056h) && this.f203057i == rvcVar.f203057i && this.f203058t == rvcVar.f203058t && this.f203048X == rvcVar.f203048X;
    }

    /* JADX INFO: renamed from: g */
    public final List m76471g() {
        return this.f203054f;
    }

    public final String getId() {
        return this.f203049a;
    }

    /* JADX INFO: renamed from: h */
    public final List m76472h() {
        return this.f203053e;
    }

    public final int hashCode() {
        int iHashCode = (this.f203051c.hashCode() + ((this.f203050b.hashCode() + (this.f203049a.hashCode() * 31)) * 31)) * 31;
        pcu0 pcu0Var = this.f203052d;
        return Boolean.hashCode(this.f203048X) + dq60.m36605e(s571.m77245d((this.f203056h.hashCode() + mt60.m62800g(this.f203055g, s571.m77244c(s571.m77244c((iHashCode + (pcu0Var == null ? 0 : pcu0Var.hashCode())) * 31, 31, this.f203053e), 31, this.f203054f), 31)) * 31, 31, this.f203057i), this.f203058t, 31);
    }

    /* JADX INFO: renamed from: j */
    public final nmn0 m76473j() {
        return this.f203051c;
    }

    /* JADX INFO: renamed from: k */
    public final sxd m76474k() {
        return this.f203050b;
    }

    /* JADX INFO: renamed from: l */
    public final ArrayList m76475l() {
        List list = this.f203053e;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((akk) it.next()).f16560a);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m76476m() {
        nmn0 nmn0Var = this.f203051c;
        return nmn0Var.f156235b == 3 && nmn0Var.f156237d == 2 && (this.f203050b instanceof rxd) && this.f203053e.size() == 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f203049a);
        parcel.writeParcelable(this.f203050b, i);
        this.f203051c.writeToParcel(parcel, i);
        pcu0 pcu0Var = this.f203052d;
        if (pcu0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pcu0Var.writeToParcel(parcel, i);
        }
        Iterator itM42468l = fr0.m42468l(parcel, this.f203053e);
        while (itM42468l.hasNext()) {
            ((akk) itM42468l.next()).writeToParcel(parcel, i);
        }
        Iterator itM42468l2 = fr0.m42468l(parcel, this.f203054f);
        while (itM42468l2.hasNext()) {
            ((pck) itM42468l2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f203055g);
        this.f203056h.writeToParcel(parcel, i);
        parcel.writeInt(this.f203057i ? 1 : 0);
        parcel.writeLong(this.f203058t);
        parcel.writeInt(this.f203048X ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ rvc(String str, sxd sxdVar, nmn0 nmn0Var, pcu0 pcu0Var, ArrayList arrayList, List list, g5a1 g5a1Var, long j, boolean z, int i) {
        pcu0 pcu0Var2 = (i & 8) != 0 ? null : pcu0Var;
        List list2 = (i & 32) != 0 ? lau.f131415a : list;
        this(str, sxdVar, nmn0Var, pcu0Var2, arrayList, list2, list2.size(), (i & 128) != 0 ? new g5a1(0, 0, 0) : g5a1Var, false, (i & 512) != 0 ? 0L : j, (i & 1024) != 0 ? false : z);
    }
}
