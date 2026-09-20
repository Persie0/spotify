package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class fnd implements ind {
    public static final Parcelable.Creator<fnd> CREATOR = new fjd(6);

    /* JADX INFO: renamed from: a */
    public final String f71264a;

    public fnd(String str) {
        this.f71264a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fnd) && wj50.m88271j(this.f71264a, ((fnd) obj).f71264a);
    }

    public final int hashCode() {
        return this.f71264a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f71264a);
    }
}
