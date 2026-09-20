package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class t9c1 implements u9c1 {
    public static final Parcelable.Creator<t9c1> CREATOR = new c8b1(22);

    /* JADX INFO: renamed from: a */
    public final String f218249a;

    public t9c1(String str) {
        this.f218249a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t9c1) && wj50.m88271j(this.f218249a, ((t9c1) obj).f218249a);
    }

    public final int hashCode() {
        return this.f218249a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f218249a);
    }
}
