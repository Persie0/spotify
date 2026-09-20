package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class noa1 implements Parcelable {
    public static final Parcelable.Creator<noa1> CREATOR = new u2a1(13);

    /* JADX INFO: renamed from: a */
    public final boolean f156637a;

    /* JADX INFO: renamed from: b */
    public final boolean f156638b;

    /* JADX INFO: renamed from: c */
    public final boolean f156639c;

    /* JADX INFO: renamed from: d */
    public final boolean f156640d;

    /* JADX INFO: renamed from: e */
    public final boolean f156641e;

    /* JADX INFO: renamed from: f */
    public final boolean f156642f;

    /* JADX INFO: renamed from: g */
    public final vy80 f156643g;

    /* JADX INFO: renamed from: h */
    public final jw10 f156644h;

    /* JADX INFO: renamed from: i */
    public final boolean f156645i;

    /* JADX INFO: renamed from: t */
    public final boolean f156646t;

    public noa1(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, vy80 vy80Var, jw10 jw10Var, boolean z7, boolean z8) {
        this.f156637a = z;
        this.f156638b = z2;
        this.f156639c = z3;
        this.f156640d = z4;
        this.f156641e = z5;
        this.f156642f = z6;
        this.f156643g = vy80Var;
        this.f156644h = jw10Var;
        this.f156645i = z7;
        this.f156646t = z8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof noa1)) {
            return false;
        }
        noa1 noa1Var = (noa1) obj;
        return this.f156637a == noa1Var.f156637a && this.f156638b == noa1Var.f156638b && this.f156639c == noa1Var.f156639c && this.f156640d == noa1Var.f156640d && this.f156641e == noa1Var.f156641e && this.f156642f == noa1Var.f156642f && wj50.m88271j(this.f156643g, noa1Var.f156643g) && wj50.m88271j(this.f156644h, noa1Var.f156644h) && this.f156645i == noa1Var.f156645i && this.f156646t == noa1Var.f156646t;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f156646t) + s571.m77245d((this.f156644h.hashCode() + ((this.f156643g.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f156637a) * 31, 31, this.f156638b), 31, this.f156639c), 31, this.f156640d), 31, this.f156641e), 31, this.f156642f)) * 31)) * 31, 31, this.f156645i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f156637a ? 1 : 0);
        parcel.writeInt(this.f156638b ? 1 : 0);
        parcel.writeInt(this.f156639c ? 1 : 0);
        parcel.writeInt(this.f156640d ? 1 : 0);
        parcel.writeInt(this.f156641e ? 1 : 0);
        parcel.writeInt(this.f156642f ? 1 : 0);
        this.f156643g.writeToParcel(parcel, i);
        this.f156644h.writeToParcel(parcel, i);
        parcel.writeInt(this.f156645i ? 1 : 0);
        parcel.writeInt(this.f156646t ? 1 : 0);
    }

    public /* synthetic */ noa1(boolean z, vy80 vy80Var, jw10 jw10Var, boolean z2, boolean z3, int i) {
        jw10 jw10Var2;
        boolean z4 = (i & 2) != 0 ? false : z;
        vy80 vy80Var2 = (i & 64) != 0 ? new vy80(false, false, false) : vy80Var;
        if ((i & 128) != 0) {
            lau lauVar = lau.f131415a;
            jw10Var2 = new jw10(lauVar, lauVar);
        } else {
            jw10Var2 = jw10Var;
        }
        this(false, z4, false, false, false, false, vy80Var2, jw10Var2, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? false : z3);
    }
}
