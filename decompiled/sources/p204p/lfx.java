package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class lfx implements Parcelable {
    public static final Parcelable.Creator<lfx> CREATOR = new n6f1(21);

    /* JADX INFO: renamed from: a */
    public final String f133023a;

    /* JADX INFO: renamed from: b */
    public final String f133024b;

    public lfx(String str, String str2) {
        this.f133023a = str;
        this.f133024b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfx)) {
            return false;
        }
        lfx lfxVar = (lfx) obj;
        return wj50.m88271j(this.f133023a, lfxVar.f133023a) && wj50.m88271j(this.f133024b, lfxVar.f133024b);
    }

    public final int hashCode() {
        return this.f133024b.hashCode() + (this.f133023a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f133023a);
        parcel.writeString(this.f133024b);
    }
}
