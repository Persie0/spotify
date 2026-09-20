package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class btk0 implements Parcelable {
    public static final Parcelable.Creator<btk0> CREATOR = new fgj0(23);

    /* JADX INFO: renamed from: b */
    public static final btk0 f30888b = new btk0(new ysk0(null));

    /* JADX INFO: renamed from: a */
    public final atk0 f30889a;

    public btk0(atk0 atk0Var) {
        this.f30889a = atk0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof btk0) && wj50.m88271j(this.f30889a, ((btk0) obj).f30889a);
    }

    public final int hashCode() {
        return this.f30889a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f30889a, i);
    }
}
