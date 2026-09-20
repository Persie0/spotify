package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class lr10 implements Parcelable {
    public static final Parcelable.Creator<lr10> CREATOR = new km10(4);

    /* JADX INFO: renamed from: a */
    public final cbm0 f136190a;

    /* JADX INFO: renamed from: b */
    public final voc1 f136191b;

    /* JADX INFO: renamed from: c */
    public final ss10 f136192c;

    /* JADX INFO: renamed from: d */
    public final voc1 f136193d;

    public lr10(cbm0 cbm0Var, voc1 voc1Var, ss10 ss10Var, voc1 voc1Var2) {
        this.f136190a = cbm0Var;
        this.f136191b = voc1Var;
        this.f136192c = ss10Var;
        this.f136193d = voc1Var2;
    }

    /* JADX INFO: renamed from: c */
    public final cbm0 m59783c() {
        return this.f136190a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr10)) {
            return false;
        }
        lr10 lr10Var = (lr10) obj;
        return wj50.m88271j(this.f136190a, lr10Var.f136190a) && wj50.m88271j(this.f136191b, lr10Var.f136191b) && this.f136192c == lr10Var.f136192c && wj50.m88271j(this.f136193d, lr10Var.f136193d);
    }

    /* JADX INFO: renamed from: g */
    public final voc1 m59784g() {
        return this.f136191b;
    }

    public final int hashCode() {
        return this.f136193d.f243453a.hashCode() + ((this.f136192c.hashCode() + s571.m77243b(this.f136190a.hashCode() * 31, 31, this.f136191b.f243453a)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f136190a);
        parcel.writeParcelable(this.f136191b, i);
        parcel.writeString(this.f136192c.name());
        parcel.writeParcelable(this.f136193d, i);
    }
}
