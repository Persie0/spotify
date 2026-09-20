package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class nt5 implements m6k {
    public static final Parcelable.Creator<nt5> CREATOR = new vp5(7);

    /* JADX INFO: renamed from: a */
    public final String f157978a;

    /* JADX INFO: renamed from: b */
    public final voc1 f157979b;

    /* JADX INFO: renamed from: c */
    public final String f157980c;

    /* JADX INFO: renamed from: d */
    public final jt5 f157981d;

    /* JADX INFO: renamed from: e */
    public final z6k f157982e;

    public nt5(String str, voc1 voc1Var, String str2, jt5 jt5Var) {
        this.f157978a = str;
        this.f157979b = voc1Var;
        this.f157980c = str2;
        this.f157981d = jt5Var;
        this.f157982e = new z6k(str, str2, 4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt5)) {
            return false;
        }
        nt5 nt5Var = (nt5) obj;
        return wj50.m88271j(this.f157978a, nt5Var.f157978a) && wj50.m88271j(this.f157979b, nt5Var.f157979b) && wj50.m88271j(this.f157980c, nt5Var.f157980c) && wj50.m88271j(this.f157981d, nt5Var.f157981d);
    }

    @Override // p204p.m6k
    public final z6k getTarget() {
        return this.f157982e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f157978a.hashCode() * 31, 31, this.f157979b.f243453a);
        String str = this.f157980c;
        return this.f157981d.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f157978a);
        parcel.writeParcelable(this.f157979b, i);
        parcel.writeString(this.f157980c);
        this.f157981d.writeToParcel(parcel, i);
    }

    public /* synthetic */ nt5(String str, voc1 voc1Var, jt5 jt5Var) {
        this(str, voc1Var, null, jt5Var);
    }
}
