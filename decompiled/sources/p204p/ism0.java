package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class ism0 extends ksm0 {
    public static final Parcelable.Creator<ism0> CREATOR = new cpl0(21);

    /* JADX INFO: renamed from: a */
    public final String f105270a;

    public ism0(String str) {
        this.f105270a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ism0) && wj50.m88271j(this.f105270a, ((ism0) obj).f105270a);
    }

    public final int hashCode() {
        return this.f105270a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f105270a);
    }
}
