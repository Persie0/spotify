package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class xnr implements ynr {
    public static final Parcelable.Creator<xnr> CREATOR = new o5r(14);

    /* JADX INFO: renamed from: a */
    public final String f263701a;

    public xnr(String str) {
        this.f263701a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xnr) && wj50.m88271j(this.f263701a, ((xnr) obj).f263701a);
    }

    public final int hashCode() {
        return this.f263701a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f263701a);
    }
}
