package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class er71 implements fr71 {
    public static final Parcelable.Creator<er71> CREATOR = new c071(29);

    /* JADX INFO: renamed from: a */
    public final boolean f62034a;

    /* JADX INFO: renamed from: b */
    public final boolean f62035b;

    /* JADX INFO: renamed from: c */
    public final boolean f62036c;

    /* JADX INFO: renamed from: d */
    public final String f62037d;

    /* JADX INFO: renamed from: e */
    public final String f62038e;

    public er71(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.f62034a = z;
        this.f62035b = z2;
        this.f62036c = z3;
        this.f62037d = str;
        this.f62038e = str2;
    }

    @Override // p204p.fr71
    /* JADX INFO: renamed from: F0 */
    public final boolean mo33722F0() {
        return this.f62034a;
    }

    @Override // p204p.fr71
    /* JADX INFO: renamed from: P */
    public final boolean mo33723P() {
        return this.f62035b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er71)) {
            return false;
        }
        er71 er71Var = (er71) obj;
        return this.f62034a == er71Var.f62034a && this.f62035b == er71Var.f62035b && this.f62036c == er71Var.f62036c && wj50.m88271j(this.f62037d, er71Var.f62037d) && wj50.m88271j(this.f62038e, er71Var.f62038e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f62034a) * 31, 31, this.f62035b), 31, this.f62036c), 31, this.f62037d);
        String str = this.f62038e;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f62034a ? 1 : 0);
        parcel.writeInt(this.f62035b ? 1 : 0);
        parcel.writeInt(this.f62036c ? 1 : 0);
        parcel.writeString(this.f62037d);
        parcel.writeString(this.f62038e);
    }
}
