package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class p9e implements dae {
    public static final Parcelable.Creator<p9e> CREATOR = new n6e(11);

    /* JADX INFO: renamed from: a */
    public final f9e f175218a;

    public p9e(f9e f9eVar) {
        this.f175218a = f9eVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p9e) && wj50.m88271j(this.f175218a, ((p9e) obj).f175218a);
    }

    public final int hashCode() {
        return this.f175218a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f175218a.writeToParcel(parcel, i);
    }
}
