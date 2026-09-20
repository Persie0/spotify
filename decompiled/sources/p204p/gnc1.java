package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class gnc1 implements Parcelable {
    public static final Parcelable.Creator<gnc1> CREATOR = new vmc1(8);

    /* JADX INFO: renamed from: a */
    public final List f82686a;

    /* JADX INFO: renamed from: b */
    public final String f82687b;

    /* JADX INFO: renamed from: c */
    public final cmc1 f82688c;

    public gnc1(List list, String str, cmc1 cmc1Var) {
        this.f82686a = list;
        this.f82687b = str;
        this.f82688c = cmc1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnc1)) {
            return false;
        }
        gnc1 gnc1Var = (gnc1) obj;
        return wj50.m88271j(this.f82686a, gnc1Var.f82686a) && wj50.m88271j(this.f82687b, gnc1Var.f82687b) && wj50.m88271j(this.f82688c, gnc1Var.f82688c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f82686a.hashCode() * 31, 31, this.f82687b);
        cmc1 cmc1Var = this.f82688c;
        return iM77243b + (cmc1Var == null ? 0 : cmc1Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f82686a);
        parcel.writeString(this.f82687b);
        cmc1 cmc1Var = this.f82688c;
        if (cmc1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cmc1Var.writeToParcel(parcel, i);
        }
    }
}
