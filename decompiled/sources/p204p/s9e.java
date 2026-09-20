package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class s9e implements dae {
    public static final Parcelable.Creator<s9e> CREATOR = new n6e(14);

    /* JADX INFO: renamed from: a */
    public final f9e f206932a;

    public s9e(f9e f9eVar) {
        this.f206932a = f9eVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s9e) && wj50.m88271j(this.f206932a, ((s9e) obj).f206932a);
    }

    public final int hashCode() {
        return this.f206932a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f206932a.writeToParcel(parcel, i);
    }
}
