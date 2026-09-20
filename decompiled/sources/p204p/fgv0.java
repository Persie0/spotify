package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class fgv0 implements Parcelable {
    public static final Parcelable.Creator<fgv0> CREATOR = new h1v0(14);

    /* JADX INFO: renamed from: a */
    public final String f69408a;

    /* JADX INFO: renamed from: b */
    public final String f69409b;

    public fgv0(String str, String str2) {
        this.f69408a = str;
        this.f69409b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgv0)) {
            return false;
        }
        fgv0 fgv0Var = (fgv0) obj;
        return wj50.m88271j(this.f69408a, fgv0Var.f69408a) && wj50.m88271j(this.f69409b, fgv0Var.f69409b);
    }

    public final int hashCode() {
        return this.f69409b.hashCode() + (this.f69408a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f69408a);
        parcel.writeString(this.f69409b);
    }
}
