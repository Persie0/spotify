package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ney0 implements Parcelable {
    public static final Parcelable.Creator<ney0> CREATOR = new csx0(15);

    /* JADX INFO: renamed from: a */
    public final int f153157a;

    /* JADX INFO: renamed from: b */
    public final joo f153158b;

    public ney0(int i, joo jooVar) {
        this.f153157a = i;
        this.f153158b = jooVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ney0)) {
            return false;
        }
        ney0 ney0Var = (ney0) obj;
        return this.f153157a == ney0Var.f153157a && this.f153158b == ney0Var.f153158b;
    }

    public final int hashCode() {
        int iM38547C = edb.m38547C(this.f153157a) * 31;
        joo jooVar = this.f153158b;
        return iM38547C + (jooVar == null ? 0 : jooVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.f153157a;
        if (i2 == 1) {
            str = "NONE";
        } else if (i2 == 2) {
            str = "DAILY";
        } else if (i2 == 3) {
            str = "WEEKLY";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "MONTHLY";
        }
        parcel.writeString(str);
        joo jooVar = this.f153158b;
        if (jooVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(jooVar.name());
        }
    }
}
