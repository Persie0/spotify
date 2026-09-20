package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mbl implements obl {
    public static final Parcelable.Creator<mbl> CREATOR = new z4l(8);

    /* JADX INFO: renamed from: a */
    public final List f141941a;

    /* JADX INFO: renamed from: b */
    public final boolean f141942b;

    public mbl(List list, boolean z) {
        this.f141941a = list;
        this.f141942b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbl)) {
            return false;
        }
        mbl mblVar = (mbl) obj;
        return wj50.m88271j(this.f141941a, mblVar.f141941a) && this.f141942b == mblVar.f141942b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f141942b) + (this.f141941a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f141941a);
        parcel.writeInt(this.f141942b ? 1 : 0);
    }

    @Override // p204p.obl
    /* JADX INFO: renamed from: z0 */
    public final boolean mo61420z0() {
        return this.f141942b;
    }
}
