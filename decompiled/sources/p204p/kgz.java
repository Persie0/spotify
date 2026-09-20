package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class kgz implements Parcelable {
    public static final Parcelable.Creator<kgz> CREATOR = new c2z(26);

    /* JADX INFO: renamed from: a */
    public final int f122487a;

    /* JADX INFO: renamed from: b */
    public final ogz f122488b;

    public kgz(int i, ogz ogzVar) {
        this.f122487a = i;
        this.f122488b = ogzVar;
    }

    /* JADX INFO: renamed from: c */
    public final ogz m56372c() {
        return this.f122488b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgz)) {
            return false;
        }
        kgz kgzVar = (kgz) obj;
        return this.f122487a == kgzVar.f122487a && wj50.m88271j(this.f122488b, kgzVar.f122488b);
    }

    /* JADX INFO: renamed from: g */
    public final int m56373g() {
        return this.f122487a;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f122487a) * 31;
        ogz ogzVar = this.f122488b;
        return iHashCode + (ogzVar == null ? 0 : ogzVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f122487a);
        ogz ogzVar = this.f122488b;
        if (ogzVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ogzVar.writeToParcel(parcel, i);
        }
    }
}
