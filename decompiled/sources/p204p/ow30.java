package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ow30 extends fx30 {
    public static final Parcelable.Creator<ow30> CREATOR = new bw30(10);

    /* JADX INFO: renamed from: c */
    public final String f170623c;

    /* JADX INFO: renamed from: d */
    public final String f170624d;

    /* JADX INFO: renamed from: e */
    public final String f170625e;

    /* JADX INFO: renamed from: f */
    public final String f170626f;

    /* JADX INFO: renamed from: g */
    public final String f170627g;

    public ow30(String str, String str2, String str3, String str4, String str5) {
        super(2, 1);
        this.f170623c = str;
        this.f170624d = str2;
        this.f170625e = str3;
        this.f170626f = str4;
        this.f170627g = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow30)) {
            return false;
        }
        ow30 ow30Var = (ow30) obj;
        return wj50.m88271j(this.f170623c, ow30Var.f170623c) && wj50.m88271j(this.f170624d, ow30Var.f170624d) && wj50.m88271j(this.f170625e, ow30Var.f170625e) && wj50.m88271j(this.f170626f, ow30Var.f170626f) && wj50.m88271j(this.f170627g, ow30Var.f170627g);
    }

    public final int hashCode() {
        String str = this.f170623c;
        return this.f170627g.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f170624d), 31, this.f170625e), 31, this.f170626f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f170623c);
        parcel.writeString(this.f170624d);
        parcel.writeString(this.f170625e);
        parcel.writeString(this.f170626f);
        parcel.writeString(this.f170627g);
    }
}
