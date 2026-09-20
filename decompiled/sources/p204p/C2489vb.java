package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.vb */
/* JADX INFO: loaded from: classes8.dex */
public final class C2489vb extends AbstractC2566xb implements Parcelable {
    public static final Parcelable.Creator<C2489vb> CREATOR = new ora(19);

    /* JADX INFO: renamed from: a */
    public final boolean f239348a;

    /* JADX INFO: renamed from: b */
    public final boolean f239349b;

    public C2489vb(boolean z, boolean z2) {
        this.f239348a = z;
        this.f239349b = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2489vb)) {
            return false;
        }
        C2489vb c2489vb = (C2489vb) obj;
        return this.f239348a == c2489vb.f239348a && this.f239349b == c2489vb.f239349b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f239349b) + (Boolean.hashCode(this.f239348a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f239348a ? 1 : 0);
        parcel.writeInt(this.f239349b ? 1 : 0);
    }
}
