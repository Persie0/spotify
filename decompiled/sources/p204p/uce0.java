package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class uce0 implements Parcelable {
    public static final Parcelable.Creator<uce0> CREATOR = new ube0(1);

    /* JADX INFO: renamed from: a */
    public final String f229022a;

    /* JADX INFO: renamed from: b */
    public final String f229023b;

    public uce0(String str, String str2) {
        this.f229022a = str;
        this.f229023b = str2;
    }

    /* JADX INFO: renamed from: c */
    public final String m82773c() {
        return this.f229022a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uce0)) {
            return false;
        }
        uce0 uce0Var = (uce0) obj;
        return wj50.m88271j(this.f229022a, uce0Var.f229022a) && wj50.m88271j(this.f229023b, uce0Var.f229023b);
    }

    public final int hashCode() {
        return this.f229023b.hashCode() + (this.f229022a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f229022a);
        parcel.writeString(this.f229023b);
    }
}
