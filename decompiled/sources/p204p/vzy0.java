package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class vzy0 extends yzy0 {
    public static final Parcelable.Creator<vzy0> CREATOR = new lpy0(9);

    /* JADX INFO: renamed from: a */
    public final String f246593a;

    public vzy0(String str) {
        this.f246593a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vzy0) && wj50.m88271j(this.f246593a, ((vzy0) obj).f246593a);
    }

    public final int hashCode() {
        return this.f246593a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f246593a);
    }
}
