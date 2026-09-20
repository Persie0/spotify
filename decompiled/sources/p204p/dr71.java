package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class dr71 implements fr71 {
    public static final Parcelable.Creator<dr71> CREATOR = new c071(28);

    /* JADX INFO: renamed from: a */
    public final boolean f52185a;

    /* JADX INFO: renamed from: b */
    public final boolean f52186b;

    /* JADX INFO: renamed from: c */
    public final boolean f52187c;

    /* JADX INFO: renamed from: d */
    public final String f52188d;

    /* JADX INFO: renamed from: e */
    public final String f52189e;

    public dr71(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.f52185a = z;
        this.f52186b = z2;
        this.f52187c = z3;
        this.f52188d = str;
        this.f52189e = str2;
    }

    @Override // p204p.fr71
    /* JADX INFO: renamed from: F0 */
    public final boolean mo33722F0() {
        return this.f52185a;
    }

    @Override // p204p.fr71
    /* JADX INFO: renamed from: P */
    public final boolean mo33723P() {
        return this.f52186b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr71)) {
            return false;
        }
        dr71 dr71Var = (dr71) obj;
        return this.f52185a == dr71Var.f52185a && this.f52186b == dr71Var.f52186b && this.f52187c == dr71Var.f52187c && wj50.m88271j(this.f52188d, dr71Var.f52188d) && wj50.m88271j(this.f52189e, dr71Var.f52189e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f52185a) * 31, 31, this.f52186b), 31, this.f52187c), 31, this.f52188d);
        String str = this.f52189e;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f52185a ? 1 : 0);
        parcel.writeInt(this.f52186b ? 1 : 0);
        parcel.writeInt(this.f52187c ? 1 : 0);
        parcel.writeString(this.f52188d);
        parcel.writeString(this.f52189e);
    }
}
