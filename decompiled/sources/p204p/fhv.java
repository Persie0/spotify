package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class fhv extends ghv {
    public static final Parcelable.Creator<fhv> CREATOR = new m8v(12);

    /* JADX INFO: renamed from: a */
    public final String f69719a;

    /* JADX INFO: renamed from: b */
    public final u980 f69720b;

    public fhv(String str, u980 u980Var) {
        this.f69719a = str;
        this.f69720b = u980Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhv)) {
            return false;
        }
        fhv fhvVar = (fhv) obj;
        return wj50.m88271j(this.f69719a, fhvVar.f69719a) && wj50.m88271j(this.f69720b, fhvVar.f69720b);
    }

    @Override // p204p.ghv
    public final String getId() {
        return this.f69719a;
    }

    public final int hashCode() {
        return this.f69720b.hashCode() + (this.f69719a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f69719a);
        parcel.writeParcelable(this.f69720b, i);
    }
}
