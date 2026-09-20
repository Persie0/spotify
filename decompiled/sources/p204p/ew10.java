package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ew10 implements Parcelable {
    public static final Parcelable.Creator<ew10> CREATOR = new km10(21);

    /* JADX INFO: renamed from: a */
    public final String f63389a;

    /* JADX INFO: renamed from: b */
    public final ss10 f63390b;

    public ew10(String str, ss10 ss10Var) {
        this.f63389a = str;
        this.f63390b = ss10Var;
    }

    /* JADX INFO: renamed from: c */
    public final String m40121c() {
        return this.f63389a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew10)) {
            return false;
        }
        ew10 ew10Var = (ew10) obj;
        return wj50.m88271j(this.f63389a, ew10Var.f63389a) && this.f63390b == ew10Var.f63390b;
    }

    /* JADX INFO: renamed from: g */
    public final ss10 m40122g() {
        return this.f63390b;
    }

    public final int hashCode() {
        return this.f63390b.hashCode() + (this.f63389a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f63389a);
        parcel.writeString(this.f63390b.name());
    }
}
