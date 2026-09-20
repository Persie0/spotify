package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ahr0 extends dhr0 {
    public static final Parcelable.Creator<ahr0> CREATOR = new vzq0(26);

    /* JADX INFO: renamed from: a */
    public final String f15758a;

    public ahr0(String str) {
        this.f15758a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ahr0) && wj50.m88271j(this.f15758a, ((ahr0) obj).f15758a);
    }

    public final int hashCode() {
        return this.f15758a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f15758a);
    }
}
