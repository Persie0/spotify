package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.ss */
/* JADX INFO: loaded from: classes4.dex */
public final class C2387ss implements InterfaceC2426ts {
    public static final Parcelable.Creator<C2387ss> CREATOR = new C2267ps(2);

    /* JADX INFO: renamed from: a */
    public final boolean f213437a;

    public C2387ss(boolean z) {
        this.f213437a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2387ss) && this.f213437a == ((C2387ss) obj).f213437a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f213437a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f213437a ? 1 : 0);
    }
}
