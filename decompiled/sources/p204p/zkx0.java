package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zkx0 implements Parcelable {
    public static final Parcelable.Creator<zkx0> CREATOR = new xxw0(19);

    /* JADX INFO: renamed from: a */
    public final String f283861a;

    /* JADX INFO: renamed from: b */
    public final String f283862b;

    /* JADX INFO: renamed from: c */
    public final List f283863c;

    /* JADX INFO: renamed from: d */
    public final String f283864d;

    /* JADX INFO: renamed from: e */
    public final i8b0 f283865e;

    public zkx0(String str, String str2, List list, String str3, i8b0 i8b0Var) {
        this.f283861a = str;
        this.f283862b = str2;
        this.f283863c = list;
        this.f283864d = str3;
        this.f283865e = i8b0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkx0)) {
            return false;
        }
        zkx0 zkx0Var = (zkx0) obj;
        return wj50.m88271j(this.f283861a, zkx0Var.f283861a) && wj50.m88271j(this.f283862b, zkx0Var.f283862b) && wj50.m88271j(this.f283863c, zkx0Var.f283863c) && wj50.m88271j(this.f283864d, zkx0Var.f283864d) && wj50.m88271j(this.f283865e, zkx0Var.f283865e);
    }

    public final int hashCode() {
        return this.f283865e.hashCode() + s571.m77243b(s571.m77244c(s571.m77243b(this.f283861a.hashCode() * 31, 31, this.f283862b), 31, this.f283863c), 31, this.f283864d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f283861a);
        parcel.writeString(this.f283862b);
        parcel.writeStringList(this.f283863c);
        parcel.writeString(this.f283864d);
        this.f283865e.writeToParcel(parcel, i);
    }
}
