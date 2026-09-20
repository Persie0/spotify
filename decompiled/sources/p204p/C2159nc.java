package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.nc */
/* JADX INFO: loaded from: classes8.dex */
public final class C2159nc extends AbstractC2209oc implements Parcelable {
    public static final Parcelable.Creator<C2159nc> CREATOR = new C2047kc(2);

    /* JADX INFO: renamed from: a */
    public final boolean f152381a;

    public C2159nc(boolean z) {
        this.f152381a = z;
    }

    @Override // p204p.AbstractC2209oc
    /* JADX INFO: renamed from: c */
    public final boolean mo58677c() {
        return this.f152381a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2159nc) && this.f152381a == ((C2159nc) obj).f152381a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f152381a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f152381a ? 1 : 0);
    }
}
