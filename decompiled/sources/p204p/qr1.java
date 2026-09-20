package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class qr1 implements Parcelable {
    public static final Parcelable.Creator<qr1> CREATOR = new g11(23);

    /* JADX INFO: renamed from: a */
    public final String f191692a;

    /* JADX INFO: renamed from: b */
    public final pr1 f191693b;

    /* JADX INFO: renamed from: c */
    public final String f191694c;

    /* JADX INFO: renamed from: d */
    public final List f191695d;

    /* JADX INFO: renamed from: e */
    public final String f191696e;

    /* JADX INFO: renamed from: f */
    public final Set f191697f;

    /* JADX INFO: renamed from: g */
    public final Set f191698g;

    /* JADX INFO: renamed from: h */
    public final du1 f191699h;

    /* JADX INFO: renamed from: i */
    public final boolean f191700i;

    /* JADX INFO: renamed from: t */
    public final Set f191701t;

    public qr1(String str, pr1 pr1Var, String str2, List list, String str3, Set set, Set set2, du1 du1Var, boolean z, Set set3) {
        this.f191692a = str;
        this.f191693b = pr1Var;
        this.f191694c = str2;
        this.f191695d = list;
        this.f191696e = str3;
        this.f191697f = set;
        this.f191698g = set2;
        this.f191699h = du1Var;
        this.f191700i = z;
        this.f191701t = set3;
    }

    /* JADX INFO: renamed from: c */
    public final pr1 m73582c() {
        return this.f191693b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr1)) {
            return false;
        }
        qr1 qr1Var = (qr1) obj;
        return wj50.m88271j(this.f191692a, qr1Var.f191692a) && wj50.m88271j(this.f191693b, qr1Var.f191693b) && wj50.m88271j(this.f191694c, qr1Var.f191694c) && wj50.m88271j(this.f191695d, qr1Var.f191695d) && wj50.m88271j(this.f191696e, qr1Var.f191696e) && wj50.m88271j(this.f191697f, qr1Var.f191697f) && wj50.m88271j(this.f191698g, qr1Var.f191698g) && wj50.m88271j(this.f191699h, qr1Var.f191699h) && this.f191700i == qr1Var.f191700i && wj50.m88271j(this.f191701t, qr1Var.f191701t);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m73583g() {
        return this.f191700i;
    }

    public final String getUsername() {
        return this.f191692a;
    }

    /* JADX INFO: renamed from: h */
    public final List m73584h() {
        return this.f191695d;
    }

    public final int hashCode() {
        int iHashCode = this.f191692a.hashCode() * 31;
        pr1 pr1Var = this.f191693b;
        return this.f191701t.hashCode() + s571.m77245d((this.f191699h.hashCode() + klh.m56830b(klh.m56830b(s571.m77243b(s571.m77244c(s571.m77243b((iHashCode + (pr1Var == null ? 0 : pr1Var.hashCode())) * 31, 31, this.f191694c), 31, this.f191695d), 31, this.f191696e), 31, this.f191697f), 31, this.f191698g)) * 31, 31, this.f191700i);
    }

    /* JADX INFO: renamed from: j */
    public final String m73585j() {
        return this.f191696e;
    }

    /* JADX INFO: renamed from: k */
    public final du1 m73586k() {
        return this.f191699h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f191692a);
        pr1 pr1Var = this.f191693b;
        if (pr1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pr1Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f191694c);
        parcel.writeStringList(this.f191695d);
        parcel.writeString(this.f191696e);
        Iterator itM64022o = nap.m64022o(this.f191697f, parcel);
        while (itM64022o.hasNext()) {
            parcel.writeString((String) itM64022o.next());
        }
        Iterator itM64022o2 = nap.m64022o(this.f191698g, parcel);
        while (itM64022o2.hasNext()) {
            parcel.writeString((String) itM64022o2.next());
        }
        parcel.writeParcelable(this.f191699h, i);
        parcel.writeInt(this.f191700i ? 1 : 0);
        Iterator itM64022o3 = nap.m64022o(this.f191701t, parcel);
        while (itM64022o3.hasNext()) {
            parcel.writeString((String) itM64022o3.next());
        }
    }
}
