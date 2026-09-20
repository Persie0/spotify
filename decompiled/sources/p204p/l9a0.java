package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class l9a0 implements faa0 {
    public static final Parcelable.Creator<l9a0> CREATOR = new z8a0(5);

    /* JADX INFO: renamed from: a */
    public final Parcelable f131043a;

    public l9a0(Parcelable parcelable) {
        this.f131043a = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l9a0) && wj50.m88271j(this.f131043a, ((l9a0) obj).f131043a);
    }

    public final int hashCode() {
        return this.f131043a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f131043a, i);
    }
}
