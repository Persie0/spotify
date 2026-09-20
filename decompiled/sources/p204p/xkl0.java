package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class xkl0 implements Parcelable {
    public static final Parcelable.Creator<xkl0> CREATOR = new hbl0(25);

    /* JADX INFO: renamed from: a */
    public final String f262393a;

    /* JADX INFO: renamed from: b */
    public final String f262394b;

    public xkl0(String str, String str2) {
        this.f262393a = str;
        this.f262394b = str2;
    }

    /* JADX INFO: renamed from: c */
    public final String m91285c() {
        return this.f262394b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkl0)) {
            return false;
        }
        xkl0 xkl0Var = (xkl0) obj;
        return wj50.m88271j(this.f262393a, xkl0Var.f262393a) && wj50.m88271j(this.f262394b, xkl0Var.f262394b);
    }

    public final int hashCode() {
        return this.f262394b.hashCode() + (this.f262393a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f262393a);
        parcel.writeString(this.f262394b);
    }
}
