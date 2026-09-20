package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class f0b0 extends w0b0 {
    public static final Parcelable.Creator<f0b0> CREATOR = new ama0(24);

    /* JADX INFO: renamed from: a */
    public final String f64585a;

    public f0b0(String str) {
        this.f64585a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0b0) && wj50.m88271j(this.f64585a, ((f0b0) obj).f64585a);
    }

    /* JADX INFO: renamed from: g */
    public final String m40446g() {
        return this.f64585a;
    }

    public final int hashCode() {
        return this.f64585a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f64585a);
    }
}
