package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class e4r0 implements Parcelable {
    public static final Parcelable.Creator<e4r0> CREATOR = new vzq0(11);

    /* JADX INFO: renamed from: a */
    public final String f56168a;

    /* JADX INFO: renamed from: b */
    public final String f56169b;

    public e4r0(String str, String str2) {
        this.f56168a = str;
        this.f56169b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4r0)) {
            return false;
        }
        e4r0 e4r0Var = (e4r0) obj;
        return wj50.m88271j(this.f56168a, e4r0Var.f56168a) && wj50.m88271j(this.f56169b, e4r0Var.f56169b);
    }

    public final int hashCode() {
        return this.f56169b.hashCode() + (this.f56168a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f56168a);
        parcel.writeString(this.f56169b);
    }
}
