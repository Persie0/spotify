package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class m11 implements x11 {
    public static final Parcelable.Creator<m11> CREATOR = new g11(2);

    /* JADX INFO: renamed from: a */
    public final String f138789a;

    public m11(String str) {
        this.f138789a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m11) && wj50.m88271j(this.f138789a, ((m11) obj).f138789a);
    }

    public final int hashCode() {
        return this.f138789a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f138789a);
    }
}
