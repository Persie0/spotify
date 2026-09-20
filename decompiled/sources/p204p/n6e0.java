package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class n6e0 implements k3r, Parcelable {
    public static final Parcelable.Creator<n6e0> CREATOR = new jfd0(24);

    /* JADX INFO: renamed from: a */
    public final String f150852a;

    /* JADX INFO: renamed from: b */
    public final String f150853b;

    /* JADX INFO: renamed from: c */
    public final List f150854c;

    /* JADX INFO: renamed from: d */
    public final int f150855d;

    public n6e0(int i, String str, String str2, List list) {
        this.f150852a = str;
        this.f150853b = str2;
        this.f150854c = list;
        this.f150855d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6e0)) {
            return false;
        }
        n6e0 n6e0Var = (n6e0) obj;
        return wj50.m88271j(this.f150852a, n6e0Var.f150852a) && wj50.m88271j(this.f150853b, n6e0Var.f150853b) && wj50.m88271j(this.f150854c, n6e0Var.f150854c) && this.f150855d == n6e0Var.f150855d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f150855d) + s571.m77244c(s571.m77243b(this.f150852a.hashCode() * 31, 31, this.f150853b), 31, this.f150854c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f150852a);
        parcel.writeString(this.f150853b);
        parcel.writeStringList(this.f150854c);
        parcel.writeInt(this.f150855d);
    }
}
