package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class bma0 implements f251 {
    public static final Parcelable.Creator<bma0> CREATOR = new ama0(0);

    /* JADX INFO: renamed from: a */
    public final String f28481a;

    /* JADX INFO: renamed from: b */
    public final boolean f28482b;

    public bma0(String str, boolean z) {
        this.f28481a = str;
        this.f28482b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bma0)) {
            return false;
        }
        bma0 bma0Var = (bma0) obj;
        return wj50.m88271j(this.f28481a, bma0Var.f28481a) && this.f28482b == bma0Var.f28482b;
    }

    public final int hashCode() {
        String str = this.f28481a;
        return Boolean.hashCode(this.f28482b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f28481a);
        parcel.writeInt(this.f28482b ? 1 : 0);
    }
}
