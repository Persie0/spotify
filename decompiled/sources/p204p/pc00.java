package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class pc00 implements Parcelable {
    public static final Parcelable.Creator<pc00> CREATOR = new k700(2);

    /* JADX INFO: renamed from: a */
    public final r7y f175923a;

    /* JADX INFO: renamed from: b */
    public final r7y f175924b;

    public pc00(r7y r7yVar, r7y r7yVar2) {
        this.f175923a = r7yVar;
        this.f175924b = r7yVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pc00)) {
            return false;
        }
        pc00 pc00Var = (pc00) obj;
        return wj50.m88271j(this.f175923a, pc00Var.f175923a) && wj50.m88271j(this.f175924b, pc00Var.f175924b);
    }

    public final int hashCode() {
        return this.f175924b.hashCode() + (this.f175923a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f175923a.writeToParcel(parcel, i);
        this.f175924b.writeToParcel(parcel, i);
    }
}
