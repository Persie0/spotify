package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class bxa1 extends dxa1 {
    public static final Parcelable.Creator<bxa1> CREATOR = new u2a1(23);

    /* JADX INFO: renamed from: a */
    public final c181 f31811a;

    public bxa1(c181 c181Var) {
        this.f31811a = c181Var;
    }

    @Override // p204p.dxa1
    /* JADX INFO: renamed from: c */
    public final c181 mo27372c() {
        return this.f31811a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bxa1) && wj50.m88271j(this.f31811a, ((bxa1) obj).f31811a);
    }

    public final int hashCode() {
        return this.f31811a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f31811a, i);
    }
}
