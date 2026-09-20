package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class enj extends onj {
    public static final Parcelable.Creator<enj> CREATOR = new dnj(0);

    /* JADX INFO: renamed from: a */
    public final jyn0 f61168a;

    public enj(jyn0 jyn0Var) {
        this.f61168a = jyn0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof enj) && wj50.m88271j(this.f61168a, ((enj) obj).f61168a);
    }

    public final int hashCode() {
        return this.f61168a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f61168a, i);
    }
}
