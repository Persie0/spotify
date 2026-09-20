package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class r8t implements Parcelable {
    public static final Parcelable.Creator<r8t> CREATOR = new f9s(25);

    /* JADX INFO: renamed from: a */
    public final String f196832a;

    /* JADX INFO: renamed from: b */
    public final String f196833b;

    /* JADX INFO: renamed from: c */
    public final c6u0 f196834c;

    public r8t(String str, String str2, c6u0 c6u0Var) {
        this.f196832a = str;
        this.f196833b = str2;
        this.f196834c = c6u0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8t)) {
            return false;
        }
        r8t r8tVar = (r8t) obj;
        return wj50.m88271j(this.f196832a, r8tVar.f196832a) && wj50.m88271j(this.f196833b, r8tVar.f196833b) && wj50.m88271j(this.f196834c, r8tVar.f196834c);
    }

    public final String getUsername() {
        return this.f196832a;
    }

    public final int hashCode() {
        return this.f196834c.hashCode() + s571.m77243b(this.f196832a.hashCode() * 31, 31, this.f196833b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f196832a);
        parcel.writeString(this.f196833b);
        c6u0 c6u0Var = this.f196834c;
        parcel.writeInt(c6u0Var.f34630a);
        parcel.writeInt(c6u0Var.f34631b);
        parcel.writeInt(c6u0Var.f34632c);
    }
}
