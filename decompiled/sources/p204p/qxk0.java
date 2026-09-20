package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class qxk0 implements Parcelable {
    public static final Parcelable.Creator<qxk0> CREATOR = new oxk0(0);

    /* JADX INFO: renamed from: a */
    public final String f193697a;

    /* JADX INFO: renamed from: b */
    public final String f193698b;

    /* JADX INFO: renamed from: c */
    public final String f193699c;

    /* JADX INFO: renamed from: d */
    public final boolean f193700d;

    /* JADX INFO: renamed from: e */
    public final boolean f193701e;

    public qxk0(String str, String str2, String str3, boolean z, boolean z2) {
        this.f193697a = str;
        this.f193698b = str2;
        this.f193699c = str3;
        this.f193700d = z;
        this.f193701e = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxk0)) {
            return false;
        }
        qxk0 qxk0Var = (qxk0) obj;
        return wj50.m88271j(this.f193697a, qxk0Var.f193697a) && wj50.m88271j(this.f193698b, qxk0Var.f193698b) && wj50.m88271j(this.f193699c, qxk0Var.f193699c) && this.f193700d == qxk0Var.f193700d && this.f193701e == qxk0Var.f193701e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f193697a.hashCode() * 31, 31, this.f193698b);
        String str = this.f193699c;
        return Boolean.hashCode(this.f193701e) + s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f193700d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f193697a);
        parcel.writeString(this.f193698b);
        parcel.writeString(this.f193699c);
        parcel.writeInt(this.f193700d ? 1 : 0);
        parcel.writeInt(this.f193701e ? 1 : 0);
    }
}
