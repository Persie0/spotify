package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class jmc1 implements pmc1 {
    public static final Parcelable.Creator<jmc1> CREATOR = new nlc1(20);

    /* JADX INFO: renamed from: a */
    public final String f113820a;

    /* JADX INFO: renamed from: b */
    public final pdn0 f113821b;

    public jmc1(String str, pdn0 pdn0Var) {
        this.f113820a = str;
        this.f113821b = pdn0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmc1)) {
            return false;
        }
        jmc1 jmc1Var = (jmc1) obj;
        return wj50.m88271j(this.f113820a, jmc1Var.f113820a) && wj50.m88271j(this.f113821b, jmc1Var.f113821b);
    }

    @Override // p204p.pmc1
    public final String getTitle() {
        return this.f113820a;
    }

    public final int hashCode() {
        return this.f113821b.hashCode() + (this.f113820a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f113820a);
        parcel.writeParcelable(this.f113821b, i);
    }
}
