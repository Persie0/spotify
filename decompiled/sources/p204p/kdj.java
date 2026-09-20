package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class kdj implements pdj {
    public static final Parcelable.Creator<kdj> CREATOR = new wcj(13);

    /* JADX INFO: renamed from: a */
    public final String f121685a;

    /* JADX INFO: renamed from: b */
    public final sfx0 f121686b;

    /* JADX INFO: renamed from: c */
    public final boolean f121687c;

    public kdj(String str, sfx0 sfx0Var, boolean z) {
        this.f121685a = str;
        this.f121686b = sfx0Var;
        this.f121687c = z;
    }

    /* JADX INFO: renamed from: c */
    public static kdj m56174c(kdj kdjVar, sfx0 sfx0Var, int i) {
        String str = kdjVar.f121685a;
        if ((i & 2) != 0) {
            sfx0Var = kdjVar.f121686b;
        }
        boolean z = (i & 4) != 0 ? kdjVar.f121687c : true;
        kdjVar.getClass();
        return new kdj(str, sfx0Var, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdj)) {
            return false;
        }
        kdj kdjVar = (kdj) obj;
        return wj50.m88271j(this.f121685a, kdjVar.f121685a) && wj50.m88271j(this.f121686b, kdjVar.f121686b) && this.f121687c == kdjVar.f121687c;
    }

    @Override // p204p.pdj
    public final String getId() {
        return this.f121685a;
    }

    public final int hashCode() {
        int iHashCode = this.f121685a.hashCode() * 31;
        sfx0 sfx0Var = this.f121686b;
        return Boolean.hashCode(this.f121687c) + ((iHashCode + (sfx0Var == null ? 0 : sfx0Var.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f121685a);
        sfx0 sfx0Var = this.f121686b;
        if (sfx0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sfx0Var.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f121687c ? 1 : 0);
    }

    public /* synthetic */ kdj(String str, sfx0 sfx0Var, int i) {
        this(str, (i & 2) != 0 ? null : sfx0Var, false);
    }
}
