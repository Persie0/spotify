package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class r511 implements Parcelable {
    public static final Parcelable.Creator<r511> CREATOR = new u111(14);

    /* JADX INFO: renamed from: a */
    public final s511 f195928a;

    /* JADX INFO: renamed from: b */
    public final u511 f195929b;

    public r511(s511 s511Var, u511 u511Var) {
        this.f195928a = s511Var;
        this.f195929b = u511Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r511)) {
            return false;
        }
        r511 r511Var = (r511) obj;
        return wj50.m88271j(this.f195928a, r511Var.f195928a) && wj50.m88271j(this.f195929b, r511Var.f195929b);
    }

    public final int hashCode() {
        return this.f195929b.f226878a.hashCode() + (this.f195928a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f195928a, i);
        parcel.writeParcelable(this.f195929b, i);
    }
}
