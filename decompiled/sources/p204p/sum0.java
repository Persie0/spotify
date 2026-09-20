package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class sum0 implements Parcelable {
    public static final Parcelable.Creator<sum0> CREATOR = new pum0(2);

    /* JADX INFO: renamed from: a */
    public final String f214149a;

    public sum0(String str) {
        this.f214149a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sum0) && wj50.m88271j(this.f214149a, ((sum0) obj).f214149a);
    }

    public final int hashCode() {
        return this.f214149a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f214149a);
    }
}
