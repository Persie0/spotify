package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ixs0 extends mxs0 {
    public static final Parcelable.Creator<ixs0> CREATOR = new wds0(17);

    /* JADX INFO: renamed from: a */
    public final String f106756a;

    /* JADX INFO: renamed from: b */
    public final String f106757b;

    /* JADX INFO: renamed from: c */
    public final String f106758c;

    public ixs0(String str, String str2, String str3) {
        this.f106756a = str;
        this.f106757b = str2;
        this.f106758c = str3;
    }

    @Override // p204p.mxs0
    /* JADX INFO: renamed from: c */
    public final String mo49039c() {
        return this.f106756a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixs0)) {
            return false;
        }
        ixs0 ixs0Var = (ixs0) obj;
        return wj50.m88271j(this.f106756a, ixs0Var.f106756a) && wj50.m88271j(this.f106757b, ixs0Var.f106757b) && wj50.m88271j(this.f106758c, ixs0Var.f106758c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f106756a.hashCode() * 31, 31, this.f106757b);
        String str = this.f106758c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f106756a);
        parcel.writeString(this.f106757b);
        parcel.writeString(this.f106758c);
    }
}
