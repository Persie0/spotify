package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class p0e extends e1e {
    public static final Parcelable.Creator<p0e> CREATOR = new j0e(5);

    /* JADX INFO: renamed from: b */
    public final String f172660b;

    public p0e(String str) {
        super("hubsiap.".concat(str));
        this.f172660b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0e) && wj50.m88271j(this.f172660b, ((p0e) obj).f172660b);
    }

    public final int hashCode() {
        return this.f172660b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f172660b);
    }
}
