package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class epb0 extends gpb0 {
    public static final Parcelable.Creator<epb0> CREATOR = new apb0(3);

    /* JADX INFO: renamed from: a */
    public final int f61614a;

    public epb0(int i) {
        this.f61614a = i;
    }

    @Override // p204p.gpb0
    /* JADX INFO: renamed from: c */
    public final int mo39642c() {
        return this.f61614a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof epb0) && this.f61614a == ((epb0) obj).f61614a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61614a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f61614a);
    }
}
