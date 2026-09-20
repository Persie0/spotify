package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class q8w0 implements r8w0 {
    public static final Parcelable.Creator<q8w0> CREATOR = new b8w0(7);

    /* JADX INFO: renamed from: a */
    public final String f186414a;

    /* JADX INFO: renamed from: b */
    public final String f186415b;

    /* JADX INFO: renamed from: c */
    public final String f186416c;

    public q8w0(String str, String str2, String str3) {
        this.f186414a = str;
        this.f186415b = str2;
        this.f186416c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8w0)) {
            return false;
        }
        q8w0 q8w0Var = (q8w0) obj;
        return wj50.m88271j(this.f186414a, q8w0Var.f186414a) && wj50.m88271j(this.f186415b, q8w0Var.f186415b) && wj50.m88271j(this.f186416c, q8w0Var.f186416c);
    }

    @Override // p204p.r8w0
    public final String getId() {
        return this.f186414a;
    }

    public final int hashCode() {
        return this.f186416c.hashCode() + s571.m77243b(this.f186414a.hashCode() * 31, 31, this.f186415b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f186414a);
        parcel.writeString(this.f186415b);
        parcel.writeString(this.f186416c);
    }
}
