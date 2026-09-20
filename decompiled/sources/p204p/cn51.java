package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class cn51 implements hn51 {
    public static final Parcelable.Creator<cn51> CREATOR = new nc51(17);

    /* JADX INFO: renamed from: a */
    public final int f39894a;

    /* JADX INFO: renamed from: b */
    public final List f39895b;

    /* JADX INFO: renamed from: c */
    public final String f39896c;

    /* JADX INFO: renamed from: d */
    public final String f39897d;

    /* JADX INFO: renamed from: e */
    public final int f39898e;

    public cn51(int i, int i2, String str, String str2, List list) {
        this.f39894a = i;
        this.f39895b = list;
        this.f39896c = str;
        this.f39897d = str2;
        this.f39898e = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn51)) {
            return false;
        }
        cn51 cn51Var = (cn51) obj;
        return this.f39894a == cn51Var.f39894a && wj50.m88271j(this.f39895b, cn51Var.f39895b) && wj50.m88271j(this.f39896c, cn51Var.f39896c) && wj50.m88271j(this.f39897d, cn51Var.f39897d) && this.f39898e == cn51Var.f39898e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39898e) + s571.m77243b(s571.m77243b(s571.m77244c(Integer.hashCode(this.f39894a) * 31, 31, this.f39895b), 31, this.f39896c), 31, this.f39897d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f39894a);
        parcel.writeStringList(this.f39895b);
        parcel.writeString(this.f39896c);
        parcel.writeString(this.f39897d);
        parcel.writeInt(this.f39898e);
    }

    public /* synthetic */ cn51(int i, int i2) {
        this(i, i2, "", "", lau.f131415a);
    }
}
