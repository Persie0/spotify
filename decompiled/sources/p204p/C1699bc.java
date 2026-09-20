package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.bc */
/* JADX INFO: loaded from: classes8.dex */
public final class C1699bc extends AbstractC1892gc implements Parcelable {
    public static final Parcelable.Creator<C1699bc> CREATOR = new ora(23);

    /* JADX INFO: renamed from: a */
    public final boolean f25692a;

    public C1699bc(boolean z) {
        this.f25692a = z;
    }

    @Override // p204p.AbstractC1892gc
    /* JADX INFO: renamed from: c */
    public final boolean mo28653c() {
        return this.f25692a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1699bc) && this.f25692a == ((C1699bc) obj).f25692a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25692a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f25692a ? 1 : 0);
    }
}
