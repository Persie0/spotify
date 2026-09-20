package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class no01 implements Parcelable {
    public static final Parcelable.Creator<no01> CREATOR = new vj01(15);

    /* JADX INFO: renamed from: a */
    public final String f156546a;

    /* JADX INFO: renamed from: b */
    public final String f156547b;

    public no01(String str, String str2) {
        this.f156546a = str;
        this.f156547b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no01)) {
            return false;
        }
        no01 no01Var = (no01) obj;
        return wj50.m88271j(this.f156546a, no01Var.f156546a) && wj50.m88271j(this.f156547b, no01Var.f156547b);
    }

    public final int hashCode() {
        return this.f156547b.hashCode() + (this.f156546a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f156546a);
        parcel.writeString(this.f156547b);
    }
}
