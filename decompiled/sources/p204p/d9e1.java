package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class d9e1 implements Parcelable {
    public static final Parcelable.Creator<d9e1> CREATOR = new xed1(9);

    /* JADX INFO: renamed from: a */
    public final String f46813a;

    /* JADX INFO: renamed from: b */
    public final String f46814b;

    public d9e1(String str, String str2) {
        this.f46813a = str;
        this.f46814b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9e1)) {
            return false;
        }
        d9e1 d9e1Var = (d9e1) obj;
        return wj50.m88271j(this.f46813a, d9e1Var.f46813a) && wj50.m88271j(this.f46814b, d9e1Var.f46814b);
    }

    public final int hashCode() {
        return this.f46814b.hashCode() + (this.f46813a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f46813a);
        parcel.writeString(this.f46814b);
    }
}
