package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.sb */
/* JADX INFO: loaded from: classes8.dex */
public final class C2370sb extends AbstractC2566xb implements Parcelable {
    public static final Parcelable.Creator<C2370sb> CREATOR = new ora(16);

    /* JADX INFO: renamed from: a */
    public final boolean f207299a;

    /* JADX INFO: renamed from: b */
    public final boolean f207300b;

    public C2370sb(boolean z, boolean z2) {
        this.f207299a = z;
        this.f207300b = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2370sb)) {
            return false;
        }
        C2370sb c2370sb = (C2370sb) obj;
        return this.f207299a == c2370sb.f207299a && this.f207300b == c2370sb.f207300b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f207300b) + (Boolean.hashCode(this.f207299a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f207299a ? 1 : 0);
        parcel.writeInt(this.f207300b ? 1 : 0);
    }
}
