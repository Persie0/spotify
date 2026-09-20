package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ggd1 implements k3r, Parcelable {
    public static final Parcelable.Creator<ggd1> CREATOR = new xed1(1);

    /* JADX INFO: renamed from: a */
    public final String f79644a;

    /* JADX INFO: renamed from: b */
    public final String f79645b;

    /* JADX INFO: renamed from: c */
    public final String f79646c;

    /* JADX INFO: renamed from: d */
    public final List f79647d;

    /* JADX INFO: renamed from: e */
    public final int f79648e;

    public ggd1(int i, String str, String str2, String str3, List list) {
        this.f79644a = str;
        this.f79645b = str2;
        this.f79646c = str3;
        this.f79647d = list;
        this.f79648e = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggd1)) {
            return false;
        }
        ggd1 ggd1Var = (ggd1) obj;
        return wj50.m88271j(this.f79644a, ggd1Var.f79644a) && wj50.m88271j(this.f79645b, ggd1Var.f79645b) && wj50.m88271j(this.f79646c, ggd1Var.f79646c) && wj50.m88271j(this.f79647d, ggd1Var.f79647d) && this.f79648e == ggd1Var.f79648e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f79648e) + s571.m77244c(s571.m77243b(s571.m77243b(this.f79644a.hashCode() * 31, 31, this.f79645b), 31, this.f79646c), 31, this.f79647d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f79644a);
        parcel.writeString(this.f79645b);
        parcel.writeString(this.f79646c);
        parcel.writeStringList(this.f79647d);
        parcel.writeInt(this.f79648e);
    }
}
