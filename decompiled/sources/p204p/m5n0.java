package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class m5n0 extends p5n0 {
    public static final Parcelable.Creator<m5n0> CREATOR = new pum0(22);

    /* JADX INFO: renamed from: a */
    public final String f140264a;

    public m5n0(String str) {
        this.f140264a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m5n0) && wj50.m88271j(this.f140264a, ((m5n0) obj).f140264a);
    }

    public final int hashCode() {
        return this.f140264a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f140264a);
    }
}
