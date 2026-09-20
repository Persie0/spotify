package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class wnr implements ynr {
    public static final Parcelable.Creator<wnr> CREATOR = new o5r(13);

    /* JADX INFO: renamed from: a */
    public final String f253265a;

    public wnr(String str) {
        this.f253265a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wnr) && wj50.m88271j(this.f253265a, ((wnr) obj).f253265a);
    }

    public final int hashCode() {
        return this.f253265a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f253265a);
    }
}
