package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class m5x0 extends b7x0 {
    public static final Parcelable.Creator<m5x0> CREATOR = new xxw0(6);

    /* JADX INFO: renamed from: a */
    public final String f140311a;

    public m5x0(String str) {
        this.f140311a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m5x0) && wj50.m88271j(this.f140311a, ((m5x0) obj).f140311a);
    }

    public final int hashCode() {
        return this.f140311a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f140311a);
    }
}
