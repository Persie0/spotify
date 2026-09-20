package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.yb */
/* JADX INFO: loaded from: classes8.dex */
public final class C2607yb extends AbstractC1662ac implements Parcelable {
    public static final Parcelable.Creator<C2607yb> CREATOR = new ora(21);

    /* JADX INFO: renamed from: a */
    public final boolean f271033a;

    public C2607yb(boolean z) {
        this.f271033a = z;
    }

    @Override // p204p.AbstractC1662ac
    /* JADX INFO: renamed from: c */
    public final boolean mo25408c() {
        return this.f271033a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2607yb) && this.f271033a == ((C2607yb) obj).f271033a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f271033a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f271033a ? 1 : 0);
    }
}
