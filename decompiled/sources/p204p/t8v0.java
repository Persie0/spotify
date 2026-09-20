package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t8v0 implements Parcelable {
    public static final Parcelable.Creator<t8v0> CREATOR = new h1v0(6);

    /* JADX INFO: renamed from: a */
    public final int f218139a;

    /* JADX INFO: renamed from: b */
    public final List f218140b;

    /* JADX INFO: renamed from: c */
    public final pxj f218141c;

    /* JADX INFO: renamed from: d */
    public final s4v0 f218142d;

    /* JADX INFO: renamed from: e */
    public final boolean f218143e;

    /* JADX INFO: renamed from: f */
    public final boolean f218144f;

    /* JADX INFO: renamed from: g */
    public final boolean f218145g;

    public t8v0(int i, List list, pxj pxjVar, s4v0 s4v0Var, boolean z, boolean z2, boolean z3) {
        this.f218139a = i;
        this.f218140b = list;
        this.f218141c = pxjVar;
        this.f218142d = s4v0Var;
        this.f218143e = z;
        this.f218144f = z2;
        this.f218145g = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8v0)) {
            return false;
        }
        t8v0 t8v0Var = (t8v0) obj;
        return this.f218139a == t8v0Var.f218139a && wj50.m88271j(this.f218140b, t8v0Var.f218140b) && this.f218141c == t8v0Var.f218141c && this.f218142d == t8v0Var.f218142d && this.f218143e == t8v0Var.f218143e && this.f218144f == t8v0Var.f218144f && this.f218145g == t8v0Var.f218145g;
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(Integer.hashCode(this.f218139a) * 31, 31, this.f218140b);
        pxj pxjVar = this.f218141c;
        int iHashCode = (iM77244c + (pxjVar == null ? 0 : pxjVar.hashCode())) * 31;
        s4v0 s4v0Var = this.f218142d;
        return Boolean.hashCode(this.f218145g) + s571.m77245d(s571.m77245d((iHashCode + (s4v0Var != null ? s4v0Var.hashCode() : 0)) * 31, 31, this.f218143e), 31, this.f218144f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f218139a);
        parcel.writeStringList(this.f218140b);
        parcel.writeParcelable(this.f218141c, i);
        s4v0 s4v0Var = this.f218142d;
        if (s4v0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            s4v0Var.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f218143e ? 1 : 0);
        parcel.writeInt(this.f218144f ? 1 : 0);
        parcel.writeInt(this.f218145g ? 1 : 0);
    }

    public /* synthetic */ t8v0(int i, List list, pxj pxjVar, s4v0 s4v0Var, boolean z, boolean z2, int i2) {
        this(i, (i2 & 2) != 0 ? lau.f131415a : list, (i2 & 4) != 0 ? null : pxjVar, (i2 & 8) != 0 ? null : s4v0Var, (i2 & 16) != 0 ? false : z, true, z2);
    }
}
