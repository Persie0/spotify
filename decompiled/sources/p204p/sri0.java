package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class sri0 implements Parcelable {
    public static final Parcelable.Creator<sri0> CREATOR = new rri0(0);

    /* JADX INFO: renamed from: a */
    public final String f213325a;

    /* JADX INFO: renamed from: b */
    public final String f213326b;

    public sri0(String str, String str2) {
        this.f213325a = str;
        this.f213326b = str2;
    }

    /* JADX INFO: renamed from: c */
    public final String m79116c() {
        return this.f213326b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sri0)) {
            return false;
        }
        sri0 sri0Var = (sri0) obj;
        return wj50.m88271j(this.f213325a, sri0Var.f213325a) && wj50.m88271j(this.f213326b, sri0Var.f213326b);
    }

    public final int hashCode() {
        return this.f213326b.hashCode() + (this.f213325a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f213325a);
        parcel.writeString(this.f213326b);
    }
}
