package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ogv0 implements Parcelable {
    public static final Parcelable.Creator<ogv0> CREATOR = new h1v0(15);

    /* JADX INFO: renamed from: a */
    public final String f165278a;

    /* JADX INFO: renamed from: b */
    public final boolean f165279b;

    /* JADX INFO: renamed from: c */
    public final boolean f165280c;

    /* JADX INFO: renamed from: d */
    public final String f165281d;

    /* JADX INFO: renamed from: e */
    public final String f165282e;

    /* JADX INFO: renamed from: f */
    public final String f165283f;

    public ogv0(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.f165278a = str;
        this.f165279b = z;
        this.f165280c = z2;
        this.f165281d = str2;
        this.f165282e = str3;
        this.f165283f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogv0)) {
            return false;
        }
        ogv0 ogv0Var = (ogv0) obj;
        return wj50.m88271j(this.f165278a, ogv0Var.f165278a) && this.f165279b == ogv0Var.f165279b && this.f165280c == ogv0Var.f165280c && wj50.m88271j(this.f165281d, ogv0Var.f165281d) && wj50.m88271j(this.f165282e, ogv0Var.f165282e) && wj50.m88271j(this.f165283f, ogv0Var.f165283f);
    }

    public final int hashCode() {
        return this.f165283f.hashCode() + s571.m77243b(s571.m77243b(s571.m77245d(s571.m77245d(this.f165278a.hashCode() * 31, 31, this.f165279b), 31, this.f165280c), 31, this.f165281d), 31, this.f165282e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f165278a);
        parcel.writeInt(this.f165279b ? 1 : 0);
        parcel.writeInt(this.f165280c ? 1 : 0);
        parcel.writeString(this.f165281d);
        parcel.writeString(this.f165282e);
        parcel.writeString(this.f165283f);
    }
}
