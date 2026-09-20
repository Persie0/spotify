package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.xw */
/* JADX INFO: loaded from: classes9.dex */
public final class C2591xw extends AbstractC1683ax {
    public static final Parcelable.Creator<C2591xw> CREATOR = new C2267ps(7);

    /* JADX INFO: renamed from: a */
    public final String f266547a;

    public C2591xw(String str) {
        this.f266547a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2591xw) && wj50.m88271j(this.f266547a, ((C2591xw) obj).f266547a);
    }

    public final int hashCode() {
        return this.f266547a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f266547a);
    }
}
