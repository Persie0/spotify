package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class fwh0 implements Parcelable {
    public static final Parcelable.Creator<fwh0> CREATOR = new xuf0(21);

    /* JADX INFO: renamed from: a */
    public final String f74067a;

    public fwh0(String str) {
        this.f74067a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fwh0) && wj50.m88271j(this.f74067a, ((fwh0) obj).f74067a);
    }

    public final int hashCode() {
        return this.f74067a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f74067a);
    }
}
