package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class hb90 implements zz41 {
    public static final Parcelable.Creator<hb90> CREATOR = new ra90(5);

    /* JADX INFO: renamed from: a */
    public final String f89453a;

    public hb90(String str) {
        this.f89453a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hb90) && wj50.m88271j(this.f89453a, ((hb90) obj).f89453a);
    }

    @Override // p204p.zz41
    public final String getId() {
        return this.f89453a;
    }

    public final int hashCode() {
        return this.f89453a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f89453a);
    }
}
