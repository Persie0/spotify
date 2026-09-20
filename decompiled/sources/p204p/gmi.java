package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class gmi implements Parcelable {
    public static final Parcelable.Creator<gmi> CREATOR = new f2i(9);

    /* JADX INFO: renamed from: a */
    public final jmi f81409a;

    public gmi(jmi jmiVar) {
        this.f81409a = jmiVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gmi) && wj50.m88271j(this.f81409a, ((gmi) obj).f81409a);
    }

    public final int hashCode() {
        return this.f81409a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f81409a, i);
    }
}
