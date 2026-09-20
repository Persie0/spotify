package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class mgz implements Parcelable {
    public static final Parcelable.Creator<mgz> CREATOR = new c2z(27);

    /* JADX INFO: renamed from: a */
    public final Integer f143673a;

    /* JADX INFO: renamed from: b */
    public final ogz f143674b;

    public mgz(Integer num, ogz ogzVar) {
        this.f143673a = num;
        this.f143674b = ogzVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgz)) {
            return false;
        }
        mgz mgzVar = (mgz) obj;
        return wj50.m88271j(this.f143673a, mgzVar.f143673a) && wj50.m88271j(this.f143674b, mgzVar.f143674b);
    }

    public final int hashCode() {
        Integer num = this.f143673a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        ogz ogzVar = this.f143674b;
        return iHashCode + (ogzVar != null ? ogzVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.f143673a;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        ogz ogzVar = this.f143674b;
        if (ogzVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ogzVar.writeToParcel(parcel, i);
        }
    }
}
