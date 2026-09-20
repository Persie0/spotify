package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class n0l0 implements Parcelable {
    public static final Parcelable.Creator<n0l0> CREATOR = new oxk0(6);

    /* JADX INFO: renamed from: a */
    public final String f149108a;

    /* JADX INFO: renamed from: b */
    public final String f149109b;

    /* JADX INFO: renamed from: c */
    public final String f149110c;

    public n0l0(String str, String str2, String str3) {
        this.f149108a = str;
        this.f149109b = str2;
        this.f149110c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0l0)) {
            return false;
        }
        n0l0 n0l0Var = (n0l0) obj;
        return wj50.m88271j(this.f149108a, n0l0Var.f149108a) && wj50.m88271j(this.f149109b, n0l0Var.f149109b) && wj50.m88271j(this.f149110c, n0l0Var.f149110c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f149108a.hashCode() * 31, 31, this.f149109b);
        String str = this.f149110c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f149108a);
        parcel.writeString(this.f149109b);
        parcel.writeString(this.f149110c);
    }
}
