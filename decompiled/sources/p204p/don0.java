package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class don0 implements Parcelable {
    public static final Parcelable.Creator<don0> CREATOR = new ejn0(15);

    /* JADX INFO: renamed from: a */
    public final bon0 f51085a;

    public don0(bon0 bon0Var) {
        this.f51085a = bon0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof don0) && wj50.m88271j(this.f51085a, ((don0) obj).f51085a);
    }

    public final int hashCode() {
        return this.f51085a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f51085a.writeToParcel(parcel, i);
    }
}
