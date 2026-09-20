package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class fzd extends hzd {
    public static final Parcelable.Creator<fzd> CREATOR = new fjd(24);

    /* JADX INFO: renamed from: a */
    public final String f74976a;

    public fzd(String str) {
        this.f74976a = str;
    }

    @Override // p204p.hzd
    /* JADX INFO: renamed from: c */
    public final String mo40341c() {
        return this.f74976a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fzd) && wj50.m88271j(this.f74976a, ((fzd) obj).f74976a);
    }

    public final int hashCode() {
        return this.f74976a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f74976a);
    }
}
