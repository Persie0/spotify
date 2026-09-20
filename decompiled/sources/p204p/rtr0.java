package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class rtr0 implements Parcelable {
    public static final Parcelable.Creator<rtr0> CREATOR = new uir0(12);

    /* JADX INFO: renamed from: a */
    public final String f202631a;

    /* JADX INFO: renamed from: b */
    public final String f202632b;

    /* JADX INFO: renamed from: c */
    public final boolean f202633c;

    /* JADX INFO: renamed from: d */
    public final boolean f202634d;

    /* JADX INFO: renamed from: e */
    public final String f202635e;

    public rtr0(String str, String str2, String str3, boolean z, boolean z2) {
        this.f202631a = str;
        this.f202632b = str2;
        this.f202633c = z;
        this.f202634d = z2;
        this.f202635e = str3;
    }

    /* JADX INFO: renamed from: c */
    public final String m76401c() {
        return this.f202632b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rtr0)) {
            return false;
        }
        rtr0 rtr0Var = (rtr0) obj;
        return wj50.m88271j(this.f202631a, rtr0Var.f202631a) && wj50.m88271j(this.f202632b, rtr0Var.f202632b) && this.f202633c == rtr0Var.f202633c && this.f202634d == rtr0Var.f202634d && wj50.m88271j(this.f202635e, rtr0Var.f202635e);
    }

    /* JADX INFO: renamed from: g */
    public final String m76402g() {
        return this.f202635e;
    }

    /* JADX INFO: renamed from: h */
    public final String m76403h() {
        return this.f202631a;
    }

    public final int hashCode() {
        return this.f202635e.hashCode() + s571.m77245d(s571.m77245d(s571.m77243b(this.f202631a.hashCode() * 31, 31, this.f202632b), 31, this.f202633c), 31, this.f202634d);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m76404j() {
        return this.f202633c;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m76405k() {
        return this.f202634d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f202631a);
        parcel.writeString(this.f202632b);
        parcel.writeInt(this.f202633c ? 1 : 0);
        parcel.writeInt(this.f202634d ? 1 : 0);
        parcel.writeString(this.f202635e);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ rtr0(int i, String str, String str2, boolean z, boolean z2) {
        String str3;
        String str4;
        boolean z3 = (i & 4) != 0 ? false : z;
        boolean z4 = (i & 8) != 0 ? false : z2;
        if ((i & 16) != 0) {
            str4 = str;
            str3 = str4;
        } else {
            str3 = "spotify:user";
            str4 = str;
        }
        this(str4, str2, str3, z3, z4);
    }
}
