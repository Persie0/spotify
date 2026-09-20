package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class hws0 implements Parcelable {
    public static final Parcelable.Creator<hws0> CREATOR = new wds0(10);

    /* JADX INFO: renamed from: a */
    public final String f96038a;

    /* JADX INFO: renamed from: b */
    public final String f96039b;

    /* JADX INFO: renamed from: c */
    public final String f96040c;

    /* JADX INFO: renamed from: d */
    public final aus0 f96041d;

    public hws0(String str, String str2, String str3, aus0 aus0Var) {
        this.f96038a = str;
        this.f96039b = str2;
        this.f96040c = str3;
        this.f96041d = aus0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hws0)) {
            return false;
        }
        hws0 hws0Var = (hws0) obj;
        return wj50.m88271j(this.f96038a, hws0Var.f96038a) && wj50.m88271j(this.f96039b, hws0Var.f96039b) && wj50.m88271j(this.f96040c, hws0Var.f96040c) && this.f96041d == hws0Var.f96041d;
    }

    public final int hashCode() {
        String str = this.f96038a;
        return this.f96041d.hashCode() + s571.m77243b(s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f96039b), 31, this.f96040c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f96038a);
        parcel.writeString(this.f96039b);
        parcel.writeString(this.f96040c);
        parcel.writeString(this.f96041d.name());
    }
}
