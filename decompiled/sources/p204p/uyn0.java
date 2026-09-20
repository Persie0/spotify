package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class uyn0 implements wyn0 {
    public static final Parcelable.Creator<uyn0> CREATOR = new ejn0(21);

    /* JADX INFO: renamed from: a */
    public final kdj f235342a;

    public uyn0(kdj kdjVar) {
        this.f235342a = kdjVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uyn0) && wj50.m88271j(this.f235342a, ((uyn0) obj).f235342a);
    }

    public final int hashCode() {
        return this.f235342a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f235342a, i);
    }
}
