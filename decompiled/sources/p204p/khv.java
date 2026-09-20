package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class khv extends mhv {
    public static final Parcelable.Creator<khv> CREATOR = new m8v(16);

    /* JADX INFO: renamed from: a */
    public final String f122731a;

    public khv(String str) {
        this.f122731a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof khv) && wj50.m88271j(this.f122731a, ((khv) obj).f122731a);
    }

    public final int hashCode() {
        return this.f122731a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f122731a);
    }
}
