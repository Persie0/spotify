package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class a01 extends b01 {
    public static final Parcelable.Creator<a01> CREATOR = new zz0(0);

    /* JADX INFO: renamed from: a */
    public final String f10973a;

    public a01(String str) {
        this.f10973a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a01) && wj50.m88271j(this.f10973a, ((a01) obj).f10973a);
    }

    public final int hashCode() {
        return this.f10973a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10973a);
    }
}
