package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class t9e implements dae {
    public static final Parcelable.Creator<t9e> CREATOR = new n6e(15);

    /* JADX INFO: renamed from: a */
    public final f9e f218272a;

    /* JADX INFO: renamed from: b */
    public final qae f218273b;

    public t9e(f9e f9eVar, qae qaeVar) {
        this.f218272a = f9eVar;
        this.f218273b = qaeVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9e)) {
            return false;
        }
        t9e t9eVar = (t9e) obj;
        return wj50.m88271j(this.f218272a, t9eVar.f218272a) && wj50.m88271j(this.f218273b, t9eVar.f218273b);
    }

    public final int hashCode() {
        return this.f218273b.hashCode() + (this.f218272a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f218272a.writeToParcel(parcel, i);
        this.f218273b.writeToParcel(parcel, i);
    }
}
