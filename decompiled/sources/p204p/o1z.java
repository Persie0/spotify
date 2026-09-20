package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class o1z implements Parcelable {
    public static final Parcelable.Creator<o1z> CREATOR = new eqy(29);

    /* JADX INFO: renamed from: a */
    public final p68 f160892a;

    /* JADX INFO: renamed from: b */
    public final p68 f160893b;

    /* JADX INFO: renamed from: c */
    public final p68 f160894c;

    public o1z(p68 p68Var, p68 p68Var2, p68 p68Var3) {
        this.f160892a = p68Var;
        this.f160893b = p68Var2;
        this.f160894c = p68Var3;
    }

    /* JADX INFO: renamed from: c */
    public static o1z m66089c(o1z o1zVar, p68 p68Var, p68 p68Var2, int i) {
        if ((i & 1) != 0) {
            p68Var = o1zVar.f160892a;
        }
        p68 p68Var3 = o1zVar.f160893b;
        if ((i & 4) != 0) {
            p68Var2 = o1zVar.f160894c;
        }
        return new o1z(p68Var, p68Var3, p68Var2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1z)) {
            return false;
        }
        o1z o1zVar = (o1z) obj;
        return wj50.m88271j(this.f160892a, o1zVar.f160892a) && wj50.m88271j(this.f160893b, o1zVar.f160893b) && wj50.m88271j(this.f160894c, o1zVar.f160894c);
    }

    public final int hashCode() {
        p68 p68Var = this.f160892a;
        int iHashCode = (p68Var == null ? 0 : p68Var.hashCode()) * 31;
        p68 p68Var2 = this.f160893b;
        int iHashCode2 = (iHashCode + (p68Var2 == null ? 0 : p68Var2.hashCode())) * 31;
        p68 p68Var3 = this.f160894c;
        return iHashCode2 + (p68Var3 != null ? p68Var3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        p68 p68Var = this.f160892a;
        if (p68Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            p68Var.writeToParcel(parcel, i);
        }
        p68 p68Var2 = this.f160893b;
        if (p68Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            p68Var2.writeToParcel(parcel, i);
        }
        p68 p68Var3 = this.f160894c;
        if (p68Var3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            p68Var3.writeToParcel(parcel, i);
        }
    }
}
