package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class dlt0 implements flt0 {
    public static final Parcelable.Creator<dlt0> CREATOR = new vit0(3);

    /* JADX INFO: renamed from: a */
    public final String f50354a;

    public dlt0(String str) {
        this.f50354a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dlt0) && wj50.m88271j(this.f50354a, ((dlt0) obj).f50354a);
    }

    public final int hashCode() {
        return this.f50354a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f50354a);
    }
}
