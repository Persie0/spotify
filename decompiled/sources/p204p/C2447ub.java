package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.ub */
/* JADX INFO: loaded from: classes8.dex */
public final class C2447ub extends AbstractC2566xb implements Parcelable {
    public static final Parcelable.Creator<C2447ub> CREATOR = new ora(18);

    /* JADX INFO: renamed from: a */
    public final boolean f228587a;

    /* JADX INFO: renamed from: b */
    public final boolean f228588b;

    public C2447ub(boolean z, boolean z2) {
        this.f228587a = z;
        this.f228588b = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2447ub)) {
            return false;
        }
        C2447ub c2447ub = (C2447ub) obj;
        return this.f228587a == c2447ub.f228587a && this.f228588b == c2447ub.f228588b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f228588b) + (Boolean.hashCode(this.f228587a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f228587a ? 1 : 0);
        parcel.writeInt(this.f228588b ? 1 : 0);
    }
}
