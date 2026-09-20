package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class hxk implements n4y {
    public static final Parcelable.Creator<hxk> CREATOR = new kck(27);

    /* JADX INFO: renamed from: a */
    public final String f96235a;

    public hxk(String str) {
        this.f96235a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hxk) && wj50.m88271j(this.f96235a, ((hxk) obj).f96235a);
    }

    public final int hashCode() {
        return this.f96235a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f96235a);
    }
}
