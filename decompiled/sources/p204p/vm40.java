package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class vm40 implements Parcelable {
    public static final Parcelable.Creator<vm40> CREATOR = new y240(15);

    /* JADX INFO: renamed from: a */
    public final String f242697a;

    /* JADX INFO: renamed from: b */
    public final String f242698b;

    /* JADX INFO: renamed from: c */
    public final boolean f242699c;

    /* JADX INFO: renamed from: d */
    public final String f242700d;

    /* JADX INFO: renamed from: e */
    public final String f242701e;

    public vm40(String str, String str2, String str3, String str4, boolean z) {
        this.f242697a = str;
        this.f242698b = str2;
        this.f242699c = z;
        this.f242700d = str3;
        this.f242701e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm40)) {
            return false;
        }
        vm40 vm40Var = (vm40) obj;
        return wj50.m88271j(this.f242697a, vm40Var.f242697a) && wj50.m88271j(this.f242698b, vm40Var.f242698b) && this.f242699c == vm40Var.f242699c && wj50.m88271j(this.f242700d, vm40Var.f242700d) && wj50.m88271j(this.f242701e, vm40Var.f242701e);
    }

    public final int hashCode() {
        return this.f242701e.hashCode() + s571.m77243b(s571.m77245d(s571.m77243b(this.f242697a.hashCode() * 31, 31, this.f242698b), 31, this.f242699c), 31, this.f242700d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f242697a);
        parcel.writeString(this.f242698b);
        parcel.writeInt(this.f242699c ? 1 : 0);
        parcel.writeString(this.f242700d);
        parcel.writeString(this.f242701e);
    }
}
