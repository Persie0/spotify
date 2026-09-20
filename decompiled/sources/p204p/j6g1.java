package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class j6g1 extends AbstractC2206o9 {
    public static final Parcelable.Creator<j6g1> CREATOR = new xvf1(27);

    /* JADX INFO: renamed from: a */
    public final String f109313a;

    /* JADX INFO: renamed from: b */
    public final String f109314b;

    /* JADX INFO: renamed from: c */
    public final int f109315c;

    /* JADX INFO: renamed from: d */
    public final boolean f109316d;

    public j6g1(String str, int i, String str2, boolean z) {
        this.f109313a = str;
        this.f109314b = str2;
        this.f109315c = i;
        this.f109316d = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j6g1) {
            return ((j6g1) obj).f109313a.equals(this.f109313a);
        }
        return false;
    }

    public final String getId() {
        return this.f109313a;
    }

    public final int hashCode() {
        return this.f109313a.hashCode();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m52576k() {
        return this.f109316d;
    }

    public final String toString() {
        StringBuilder sbM38573v = edb.m38573v("Node{", this.f109314b, ", id=", this.f109313a, ", hops=");
        sbM38573v.append(this.f109315c);
        sbM38573v.append(", isNearby=");
        sbM38573v.append(this.f109316d);
        sbM38573v.append("}");
        return sbM38573v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26308N(parcel, 2, this.f109313a);
        alf1.m26308N(parcel, 3, this.f109314b);
        alf1.m26313S(parcel, 4, 4);
        parcel.writeInt(this.f109315c);
        alf1.m26313S(parcel, 5, 4);
        parcel.writeInt(this.f109316d ? 1 : 0);
        alf1.m26316V(iM26314T, parcel);
    }
}
