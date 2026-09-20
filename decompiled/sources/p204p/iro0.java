package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class iro0 implements qro0 {
    public static final Parcelable.Creator<iro0> CREATOR = new igo0(10);

    /* JADX INFO: renamed from: a */
    public final String f105023a;

    public iro0(String str) {
        this.f105023a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iro0) && wj50.m88271j(this.f105023a, ((iro0) obj).f105023a);
    }

    public final int hashCode() {
        return this.f105023a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f105023a);
    }
}
