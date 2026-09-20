package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class yyt0 implements Parcelable {
    public static final Parcelable.Creator<yyt0> CREATOR = new vit0(21);

    /* JADX INFO: renamed from: a */
    public final String f277583a;

    public yyt0(String str) {
        this.f277583a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yyt0) && wj50.m88271j(this.f277583a, ((yyt0) obj).f277583a);
    }

    public final int hashCode() {
        return this.f277583a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f277583a);
    }
}
