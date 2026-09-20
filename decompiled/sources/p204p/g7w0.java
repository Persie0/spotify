package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class g7w0 implements h7w0 {
    public static final Parcelable.Creator<g7w0> CREATOR = new h1v0(28);

    /* JADX INFO: renamed from: a */
    public final fyy f77362a;

    /* JADX INFO: renamed from: b */
    public final String f77363b;

    public g7w0(fyy fyyVar, String str) {
        this.f77362a = fyyVar;
        this.f77363b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7w0)) {
            return false;
        }
        g7w0 g7w0Var = (g7w0) obj;
        return wj50.m88271j(this.f77362a, g7w0Var.f77362a) && wj50.m88271j(this.f77363b, g7w0Var.f77363b);
    }

    public final int hashCode() {
        return this.f77363b.hashCode() + (this.f77362a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f77362a.writeToParcel(parcel, i);
        parcel.writeString(this.f77363b);
    }
}
