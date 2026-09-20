package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class dpl0 implements iet0 {
    public static final Parcelable.Creator<dpl0> CREATOR = new cpl0(0);

    /* JADX INFO: renamed from: a */
    public final int f51363a;

    /* JADX INFO: renamed from: b */
    public final String f51364b;

    /* JADX INFO: renamed from: c */
    public final String f51365c;

    /* JADX INFO: renamed from: d */
    public final String f51366d;

    /* JADX INFO: renamed from: e */
    public final boolean f51367e;

    /* JADX INFO: renamed from: f */
    public final String f51368f;

    public dpl0(String str, int i, String str2, String str3, boolean z, String str4) {
        this.f51363a = i;
        this.f51364b = str;
        this.f51365c = str2;
        this.f51366d = str3;
        this.f51367e = z;
        this.f51368f = str4;
    }

    @Override // p204p.iet0
    /* JADX INFO: renamed from: I0 */
    public final int mo33720I0() {
        return this.f51363a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpl0)) {
            return false;
        }
        dpl0 dpl0Var = (dpl0) obj;
        return this.f51363a == dpl0Var.f51363a && wj50.m88271j(this.f51364b, dpl0Var.f51364b) && wj50.m88271j(this.f51365c, dpl0Var.f51365c) && wj50.m88271j(this.f51366d, dpl0Var.f51366d) && this.f51367e == dpl0Var.f51367e && wj50.m88271j(this.f51368f, dpl0Var.f51368f);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(Integer.hashCode(this.f51363a) * 31, 31, this.f51364b), 31, this.f51365c), 31, this.f51366d), 31, this.f51367e);
        String str = this.f51368f;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f51363a);
        parcel.writeString(this.f51364b);
        parcel.writeString(this.f51365c);
        parcel.writeString(this.f51366d);
        parcel.writeInt(this.f51367e ? 1 : 0);
        parcel.writeString(this.f51368f);
    }
}
