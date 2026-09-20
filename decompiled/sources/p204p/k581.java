package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class k581 implements Parcelable {
    public static final Parcelable.Creator<k581> CREATOR = new sr71(23);

    /* JADX INFO: renamed from: a */
    public final String f119437a;

    /* JADX INFO: renamed from: b */
    public final String f119438b;

    /* JADX INFO: renamed from: c */
    public final String f119439c;

    /* JADX INFO: renamed from: d */
    public final String f119440d;

    /* JADX INFO: renamed from: e */
    public final boolean f119441e;

    public k581(String str, String str2, String str3, String str4, boolean z) {
        this.f119437a = str;
        this.f119438b = str2;
        this.f119439c = str3;
        this.f119440d = str4;
        this.f119441e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k581)) {
            return false;
        }
        k581 k581Var = (k581) obj;
        return wj50.m88271j(this.f119437a, k581Var.f119437a) && wj50.m88271j(this.f119438b, k581Var.f119438b) && wj50.m88271j(this.f119439c, k581Var.f119439c) && wj50.m88271j(this.f119440d, k581Var.f119440d) && this.f119441e == k581Var.f119441e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f119441e) + s571.m77243b(s571.m77243b(s571.m77243b(this.f119437a.hashCode() * 31, 31, this.f119438b), 31, this.f119439c), 31, this.f119440d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f119437a);
        parcel.writeString(this.f119438b);
        parcel.writeString(this.f119439c);
        parcel.writeString(this.f119440d);
        parcel.writeInt(this.f119441e ? 1 : 0);
    }
}
