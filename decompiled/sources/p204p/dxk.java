package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class dxk implements Parcelable {
    public static final Parcelable.Creator<dxk> CREATOR = new kck(26);

    /* JADX INFO: renamed from: a */
    public final mwk f53999a;

    /* JADX INFO: renamed from: b */
    public final boolean f54000b;

    public dxk(mwk mwkVar, boolean z) {
        this.f53999a = mwkVar;
        this.f54000b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxk)) {
            return false;
        }
        dxk dxkVar = (dxk) obj;
        return wj50.m88271j(this.f53999a, dxkVar.f53999a) && this.f54000b == dxkVar.f54000b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f54000b) + (this.f53999a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f53999a, i);
        parcel.writeInt(this.f54000b ? 1 : 0);
    }
}
