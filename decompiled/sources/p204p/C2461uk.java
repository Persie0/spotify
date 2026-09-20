package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.uk */
/* JADX INFO: loaded from: classes7.dex */
public final class C2461uk extends AbstractC2616yk {
    public static final Parcelable.Creator<C2461uk> CREATOR = new C2047kc(14);

    /* JADX INFO: renamed from: b */
    public final h891 f231190b;

    public C2461uk(h891 h891Var) {
        super(true);
        this.f231190b = h891Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2461uk) && wj50.m88271j(this.f231190b, ((C2461uk) obj).f231190b);
    }

    public final int hashCode() {
        return this.f231190b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f231190b, i);
    }
}
