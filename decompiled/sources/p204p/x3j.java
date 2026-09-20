package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class x3j implements Parcelable {
    public static final Parcelable.Creator<x3j> CREATOR = new f2i(21);

    /* JADX INFO: renamed from: a */
    public final w3j f257822a;

    public x3j(w3j w3jVar) {
        this.f257822a = w3jVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x3j) && wj50.m88271j(this.f257822a, ((x3j) obj).f257822a);
    }

    public final int hashCode() {
        return this.f257822a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f257822a, i);
    }
}
