package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class xdj implements pdj {
    public static final Parcelable.Creator<xdj> CREATOR = new wcj(20);

    /* JADX INFO: renamed from: a */
    public final String f260495a;

    /* JADX INFO: renamed from: b */
    public final boolean f260496b;

    public xdj(String str, boolean z) {
        this.f260495a = str;
        this.f260496b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdj)) {
            return false;
        }
        xdj xdjVar = (xdj) obj;
        return wj50.m88271j(this.f260495a, xdjVar.f260495a) && this.f260496b == xdjVar.f260496b;
    }

    @Override // p204p.pdj
    public final String getId() {
        return this.f260495a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f260496b) + (this.f260495a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f260495a);
        parcel.writeInt(this.f260496b ? 1 : 0);
    }

    public /* synthetic */ xdj(String str) {
        this(str, false);
    }
}
