package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class ml50 extends ql50 {
    public static final Parcelable.Creator<ml50> CREATOR = new gd50(6);

    /* JADX INFO: renamed from: a */
    public final String f144758a;

    public ml50(String str) {
        this.f144758a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ml50) && wj50.m88271j(this.f144758a, ((ml50) obj).f144758a);
    }

    public final int hashCode() {
        return this.f144758a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f144758a);
    }
}
