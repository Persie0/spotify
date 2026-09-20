package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class pck implements Parcelable {
    public static final Parcelable.Creator<pck> CREATOR = new dnj(22);

    /* JADX INFO: renamed from: X */
    public final boolean f176145X;

    /* JADX INFO: renamed from: Y */
    public final zi2 f176146Y;

    /* JADX INFO: renamed from: a */
    public final String f176147a;

    /* JADX INFO: renamed from: b */
    public final String f176148b;

    /* JADX INFO: renamed from: c */
    public final pla1 f176149c;

    /* JADX INFO: renamed from: d */
    public final long f176150d;

    /* JADX INFO: renamed from: e */
    public final boolean f176151e;

    /* JADX INFO: renamed from: f */
    public final fej f176152f;

    /* JADX INFO: renamed from: g */
    public final nck f176153g;

    /* JADX INFO: renamed from: h */
    public final List f176154h;

    /* JADX INFO: renamed from: i */
    public final List f176155i;

    /* JADX INFO: renamed from: t */
    public final ick f176156t;

    public pck(String str, String str2, pla1 pla1Var, long j, boolean z, fej fejVar, nck nckVar, List list, List list2, ick ickVar, boolean z2, zi2 zi2Var) {
        this.f176147a = str;
        this.f176148b = str2;
        this.f176149c = pla1Var;
        this.f176150d = j;
        this.f176151e = z;
        this.f176152f = fejVar;
        this.f176153g = nckVar;
        this.f176154h = list;
        this.f176155i = list2;
        this.f176156t = ickVar;
        this.f176145X = z2;
        this.f176146Y = zi2Var;
    }

    /* JADX INFO: renamed from: c */
    public static pck m69590c(pck pckVar, pla1 pla1Var, fej fejVar, nck nckVar, List list, List list2, ick ickVar, boolean z, int i) {
        String str = pckVar.f176147a;
        String str2 = pckVar.f176148b;
        pla1 pla1Var2 = (i & 4) != 0 ? pckVar.f176149c : pla1Var;
        long j = pckVar.f176150d;
        boolean z2 = pckVar.f176151e;
        fej fejVar2 = (i & 32) != 0 ? pckVar.f176152f : fejVar;
        nck nckVar2 = (i & 64) != 0 ? pckVar.f176153g : nckVar;
        List list3 = (i & 128) != 0 ? pckVar.f176154h : list;
        List list4 = (i & 256) != 0 ? pckVar.f176155i : list2;
        ick ickVar2 = (i & 512) != 0 ? pckVar.f176156t : ickVar;
        boolean z3 = (i & 1024) != 0 ? pckVar.f176145X : z;
        zi2 zi2Var = pckVar.f176146Y;
        pckVar.getClass();
        return new pck(str, str2, pla1Var2, j, z2, fejVar2, nckVar2, list3, list4, ickVar2, z3, zi2Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pck)) {
            return false;
        }
        pck pckVar = (pck) obj;
        return wj50.m88271j(this.f176147a, pckVar.f176147a) && wj50.m88271j(this.f176148b, pckVar.f176148b) && wj50.m88271j(this.f176149c, pckVar.f176149c) && this.f176150d == pckVar.f176150d && this.f176151e == pckVar.f176151e && wj50.m88271j(this.f176152f, pckVar.f176152f) && wj50.m88271j(this.f176153g, pckVar.f176153g) && wj50.m88271j(this.f176154h, pckVar.f176154h) && wj50.m88271j(this.f176155i, pckVar.f176155i) && wj50.m88271j(this.f176156t, pckVar.f176156t) && this.f176145X == pckVar.f176145X && wj50.m88271j(this.f176146Y, pckVar.f176146Y);
    }

    /* JADX INFO: renamed from: g */
    public final String m69591g() {
        return this.f176148b;
    }

    public final String getId() {
        return this.f176147a;
    }

    /* JADX INFO: renamed from: h */
    public final fej m69592h() {
        return this.f176152f;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f176156t.hashCode() + s571.m77244c(s571.m77244c((this.f176153g.hashCode() + ((this.f176152f.hashCode() + s571.m77245d(dq60.m36605e(ydj.m93448g(this.f176149c, s571.m77243b(this.f176147a.hashCode() * 31, 31, this.f176148b), 31), this.f176150d, 31), 31, this.f176151e)) * 31)) * 31, 31, this.f176154h), 31, this.f176155i)) * 31, 31, this.f176145X);
        zi2 zi2Var = this.f176146Y;
        return iM77245d + (zi2Var == null ? 0 : zi2Var.hashCode());
    }

    /* JADX INFO: renamed from: j */
    public final String m69593j() {
        String str;
        zi2 zi2Var = this.f176146Y;
        return (zi2Var == null || (str = zi2Var.f283069c) == null) ? this.f176149c.f178681a : str;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m69594k() {
        return this.f176146Y != null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f176147a);
        parcel.writeString(this.f176148b);
        this.f176149c.writeToParcel(parcel, i);
        parcel.writeLong(this.f176150d);
        parcel.writeInt(this.f176151e ? 1 : 0);
        parcel.writeParcelable(this.f176152f, i);
        parcel.writeParcelable(this.f176153g, i);
        Iterator itM42468l = fr0.m42468l(parcel, this.f176154h);
        while (itM42468l.hasNext()) {
            ((pcu0) itM42468l.next()).writeToParcel(parcel, i);
        }
        Iterator itM42468l2 = fr0.m42468l(parcel, this.f176155i);
        while (itM42468l2.hasNext()) {
            ((czu0) itM42468l2.next()).writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.f176156t, i);
        parcel.writeInt(this.f176145X ? 1 : 0);
        zi2 zi2Var = this.f176146Y;
        if (zi2Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            zi2Var.writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ pck(String str, String str2, pla1 pla1Var, long j, boolean z, fej fejVar, nck nckVar, ArrayList arrayList, ArrayList arrayList2, ick ickVar, boolean z2, zi2 zi2Var, int i) {
        nck nckVar2 = (i & 64) != 0 ? mck.f142173a : nckVar;
        int i2 = i & 128;
        lau lauVar = lau.f131415a;
        this(str, str2, pla1Var, j, z, fejVar, nckVar2, i2 != 0 ? lauVar : arrayList, (i & 256) != 0 ? lauVar : arrayList2, (i & 512) != 0 ? fck.f68135a : ickVar, (i & 1024) != 0 ? false : z2, (i & 2048) != 0 ? null : zi2Var);
    }
}
