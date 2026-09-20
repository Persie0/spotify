package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class rbl implements Parcelable {
    public static final Parcelable.Creator<rbl> CREATOR = new n6f1(12);

    /* JADX INFO: renamed from: a */
    public final boolean f197626a;

    /* JADX INFO: renamed from: b */
    public final qbl f197627b;

    public rbl(boolean z, qbl qblVar) {
        this.f197626a = z;
        this.f197627b = qblVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbl)) {
            return false;
        }
        rbl rblVar = (rbl) obj;
        return this.f197626a == rblVar.f197626a && wj50.m88271j(this.f197627b, rblVar.f197627b);
    }

    public final int hashCode() {
        return this.f197627b.hashCode() + (Boolean.hashCode(this.f197626a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f197626a ? 1 : 0);
        parcel.writeParcelable(this.f197627b, i);
    }
}
