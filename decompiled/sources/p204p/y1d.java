package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class y1d implements Parcelable {
    public static final Parcelable.Creator<y1d> CREATOR = new qvc(10);

    /* JADX INFO: renamed from: a */
    public final n0d f268233a;

    /* JADX INFO: renamed from: b */
    public final boolean f268234b;

    public y1d(n0d n0dVar, boolean z) {
        this.f268233a = n0dVar;
        this.f268234b = z;
    }

    /* JADX INFO: renamed from: c */
    public static y1d m92646c(y1d y1dVar, n0d n0dVar, boolean z, int i) {
        if ((i & 1) != 0) {
            n0dVar = y1dVar.f268233a;
        }
        if ((i & 2) != 0) {
            z = y1dVar.f268234b;
        }
        y1dVar.getClass();
        return new y1d(n0dVar, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1d)) {
            return false;
        }
        y1d y1dVar = (y1d) obj;
        return wj50.m88271j(this.f268233a, y1dVar.f268233a) && this.f268234b == y1dVar.f268234b;
    }

    /* JADX INFO: renamed from: g */
    public final n0d m92647g() {
        return this.f268233a;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m92648h() {
        return this.f268234b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f268234b) + (this.f268233a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f268233a, i);
        parcel.writeInt(this.f268234b ? 1 : 0);
    }
}
