package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class clx implements dlx {
    public static final Parcelable.Creator<clx> CREATOR = new wfw(14);

    /* JADX INFO: renamed from: a */
    public final String f39418a;

    public clx(String str) {
        this.f39418a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof clx) && wj50.m88271j(this.f39418a, ((clx) obj).f39418a);
    }

    public final int hashCode() {
        return this.f39418a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f39418a);
    }
}
