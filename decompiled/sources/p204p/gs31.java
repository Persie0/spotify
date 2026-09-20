package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class gs31 implements Parcelable {
    public static final Parcelable.Creator<gs31> CREATOR = new ln31(11);

    /* JADX INFO: renamed from: a */
    public final String f83874a;

    /* JADX INFO: renamed from: b */
    public final boolean f83875b;

    /* JADX INFO: renamed from: c */
    public final gs31 f83876c;

    public gs31(String str, boolean z, gs31 gs31Var) {
        this.f83874a = str;
        this.f83875b = z;
        this.f83876c = gs31Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs31)) {
            return false;
        }
        gs31 gs31Var = (gs31) obj;
        return wj50.m88271j(this.f83874a, gs31Var.f83874a) && this.f83875b == gs31Var.f83875b && wj50.m88271j(this.f83876c, gs31Var.f83876c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f83874a.hashCode() * 31, 31, this.f83875b);
        gs31 gs31Var = this.f83876c;
        return iM77245d + (gs31Var == null ? 0 : gs31Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f83874a);
        parcel.writeInt(this.f83875b ? 1 : 0);
        gs31 gs31Var = this.f83876c;
        if (gs31Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gs31Var.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ gs31(String str, gs31 gs31Var, int i) {
        this(str, (i & 2) == 0, (i & 4) != 0 ? null : gs31Var);
    }
}
