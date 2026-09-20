package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class y840 implements k3r, Parcelable {
    public static final Parcelable.Creator<y840> CREATOR = new y240(4);

    /* JADX INFO: renamed from: a */
    public final String f270192a;

    /* JADX INFO: renamed from: b */
    public final String f270193b;

    /* JADX INFO: renamed from: c */
    public final String f270194c;

    /* JADX INFO: renamed from: d */
    public final List f270195d;

    /* JADX INFO: renamed from: e */
    public final int f270196e;

    public y840(int i, String str, String str2, String str3, List list) {
        this.f270192a = str;
        this.f270193b = str2;
        this.f270194c = str3;
        this.f270195d = list;
        this.f270196e = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y840)) {
            return false;
        }
        y840 y840Var = (y840) obj;
        return wj50.m88271j(this.f270192a, y840Var.f270192a) && wj50.m88271j(this.f270193b, y840Var.f270193b) && wj50.m88271j(this.f270194c, y840Var.f270194c) && wj50.m88271j(this.f270195d, y840Var.f270195d) && this.f270196e == y840Var.f270196e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f270196e) + s571.m77244c(s571.m77243b(s571.m77243b(this.f270192a.hashCode() * 31, 31, this.f270193b), 31, this.f270194c), 31, this.f270195d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f270192a);
        parcel.writeString(this.f270193b);
        parcel.writeString(this.f270194c);
        parcel.writeStringList(this.f270195d);
        parcel.writeInt(this.f270196e);
    }
}
