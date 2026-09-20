package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class fn51 implements gn51 {
    public static final Parcelable.Creator<fn51> CREATOR = new nc51(20);

    /* JADX INFO: renamed from: a */
    public final int f71186a;

    /* JADX INFO: renamed from: b */
    public final List f71187b;

    /* JADX INFO: renamed from: c */
    public final String f71188c;

    /* JADX INFO: renamed from: d */
    public final boolean f71189d;

    /* JADX INFO: renamed from: e */
    public final String f71190e;

    /* JADX INFO: renamed from: f */
    public final xm51 f71191f;

    public fn51(int i, List list, String str, boolean z, String str2, xm51 xm51Var) {
        this.f71186a = i;
        this.f71187b = list;
        this.f71188c = str;
        this.f71189d = z;
        this.f71190e = str2;
        this.f71191f = xm51Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn51)) {
            return false;
        }
        fn51 fn51Var = (fn51) obj;
        return this.f71186a == fn51Var.f71186a && wj50.m88271j(this.f71187b, fn51Var.f71187b) && wj50.m88271j(this.f71188c, fn51Var.f71188c) && this.f71189d == fn51Var.f71189d && wj50.m88271j(this.f71190e, fn51Var.f71190e) && wj50.m88271j(this.f71191f, fn51Var.f71191f);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(s571.m77244c(Integer.hashCode(this.f71186a) * 31, 31, this.f71187b), 31, this.f71188c), 31, this.f71189d);
        String str = this.f71190e;
        return this.f71191f.hashCode() + ((iM77245d + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f71186a);
        parcel.writeStringList(this.f71187b);
        parcel.writeString(this.f71188c);
        parcel.writeInt(this.f71189d ? 1 : 0);
        parcel.writeString(this.f71190e);
        this.f71191f.writeToParcel(parcel, i);
    }

    public /* synthetic */ fn51(int i, List list, String str, String str2, xm51 xm51Var, int i2) {
        this(i, list, (i2 & 4) != 0 ? "" : str, false, (i2 & 16) != 0 ? null : str2, xm51Var);
    }
}
