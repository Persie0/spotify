package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class yjn0 implements akn0 {
    public static final Parcelable.Creator<yjn0> CREATOR = new ejn0(5);

    /* JADX INFO: renamed from: a */
    public final String f273411a;

    /* JADX INFO: renamed from: b */
    public final String f273412b;

    /* JADX INFO: renamed from: c */
    public final String f273413c;

    public yjn0(String str, String str2, String str3) {
        this.f273411a = str;
        this.f273412b = str2;
        this.f273413c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjn0)) {
            return false;
        }
        yjn0 yjn0Var = (yjn0) obj;
        return wj50.m88271j(this.f273411a, yjn0Var.f273411a) && wj50.m88271j(this.f273412b, yjn0Var.f273412b) && wj50.m88271j(this.f273413c, yjn0Var.f273413c);
    }

    public final int hashCode() {
        return this.f273413c.hashCode() + s571.m77243b(this.f273411a.hashCode() * 31, 31, this.f273412b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f273411a);
        parcel.writeString(this.f273412b);
        parcel.writeString(this.f273413c);
    }
}
