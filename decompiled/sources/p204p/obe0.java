package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class obe0 implements Parcelable {
    public static final Parcelable.Creator<obe0> CREATOR = new jfd0(29);

    /* JADX INFO: renamed from: a */
    public final String f163629a;

    /* JADX INFO: renamed from: b */
    public final knc1 f163630b;

    public obe0(String str, knc1 knc1Var) {
        this.f163629a = str;
        this.f163630b = knc1Var;
    }

    /* JADX INFO: renamed from: c */
    public static obe0 m66642c(obe0 obe0Var, knc1 knc1Var) {
        String str = obe0Var.f163629a;
        obe0Var.getClass();
        return new obe0(str, knc1Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obe0)) {
            return false;
        }
        obe0 obe0Var = (obe0) obj;
        return wj50.m88271j(this.f163629a, obe0Var.f163629a) && wj50.m88271j(this.f163630b, obe0Var.f163630b);
    }

    public final int hashCode() {
        return this.f163630b.hashCode() + (this.f163629a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f163629a);
        parcel.writeParcelable(this.f163630b, i);
    }
}
