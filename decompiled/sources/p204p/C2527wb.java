package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.wb */
/* JADX INFO: loaded from: classes8.dex */
public final class C2527wb extends AbstractC2566xb implements Parcelable {
    public static final Parcelable.Creator<C2527wb> CREATOR = new ora(20);

    /* JADX INFO: renamed from: a */
    public final boolean f249647a;

    /* JADX INFO: renamed from: b */
    public final boolean f249648b;

    public C2527wb(boolean z, boolean z2) {
        this.f249647a = z;
        this.f249648b = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2527wb)) {
            return false;
        }
        C2527wb c2527wb = (C2527wb) obj;
        return this.f249647a == c2527wb.f249647a && this.f249648b == c2527wb.f249648b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f249648b) + (Boolean.hashCode(this.f249647a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f249647a ? 1 : 0);
        parcel.writeInt(this.f249648b ? 1 : 0);
    }
}
