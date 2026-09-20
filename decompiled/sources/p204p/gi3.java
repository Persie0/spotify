package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class gi3 implements Parcelable {
    public static final Parcelable.Creator<gi3> CREATOR = new bc3(6);

    /* JADX INFO: renamed from: a */
    public final String f80026a;

    /* JADX INFO: renamed from: b */
    public final gn80 f80027b;

    /* JADX INFO: renamed from: c */
    public final String f80028c;

    /* JADX INFO: renamed from: d */
    public final String f80029d;

    /* JADX INFO: renamed from: e */
    public final boolean f80030e;

    /* JADX INFO: renamed from: f */
    public final boolean f80031f;

    public gi3(String str, gn80 gn80Var, String str2, String str3, boolean z, boolean z2) {
        this.f80026a = str;
        this.f80027b = gn80Var;
        this.f80028c = str2;
        this.f80029d = str3;
        this.f80030e = z;
        this.f80031f = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi3)) {
            return false;
        }
        gi3 gi3Var = (gi3) obj;
        return wj50.m88271j(this.f80026a, gi3Var.f80026a) && this.f80027b == gi3Var.f80027b && wj50.m88271j(this.f80028c, gi3Var.f80028c) && wj50.m88271j(this.f80029d, gi3Var.f80029d) && this.f80030e == gi3Var.f80030e && this.f80031f == gi3Var.f80031f;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((this.f80027b.hashCode() + (this.f80026a.hashCode() * 31)) * 31, 31, this.f80028c);
        String str = this.f80029d;
        return Boolean.hashCode(this.f80031f) + s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f80030e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f80026a);
        parcel.writeString(this.f80027b.name());
        parcel.writeString(this.f80028c);
        parcel.writeString(this.f80029d);
        parcel.writeInt(this.f80030e ? 1 : 0);
        parcel.writeInt(this.f80031f ? 1 : 0);
    }

    public /* synthetic */ gi3(String str, gn80 gn80Var, String str2, String str3) {
        this(str, gn80Var, str2, str3, false, false);
    }
}
