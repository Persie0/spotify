package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class kv01 extends lv01 {
    public static final Parcelable.Creator<kv01> CREATOR = new bv01(7);

    /* JADX INFO: renamed from: a */
    public final String f126751a;

    public kv01(String str) {
        this.f126751a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kv01) && wj50.m88271j(this.f126751a, ((kv01) obj).f126751a);
    }

    @Override // p204p.lv01
    public final String getUri() {
        return this.f126751a;
    }

    public final int hashCode() {
        return this.f126751a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f126751a);
    }
}
