package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class oz70 implements zz41 {
    public static final Parcelable.Creator<oz70> CREATOR = new w270(25);

    /* JADX INFO: renamed from: a */
    public final ArrayList f172148a;

    /* JADX INFO: renamed from: b */
    public final nz70 f172149b;

    /* JADX INFO: renamed from: c */
    public final String f172150c;

    public oz70(ArrayList arrayList, nz70 nz70Var, String str) {
        this.f172148a = arrayList;
        this.f172149b = nz70Var;
        this.f172150c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz70)) {
            return false;
        }
        oz70 oz70Var = (oz70) obj;
        return this.f172148a.equals(oz70Var.f172148a) && wj50.m88271j(this.f172149b, oz70Var.f172149b) && wj50.m88271j(this.f172150c, oz70Var.f172150c);
    }

    @Override // p204p.zz41
    public final String getId() {
        return this.f172150c;
    }

    public final int hashCode() {
        int iHashCode = this.f172148a.hashCode() * 31;
        nz70 nz70Var = this.f172149b;
        return this.f172150c.hashCode() + ((iHashCode + (nz70Var == null ? 0 : nz70Var.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42469m = fr0.m42469m(this.f172148a, parcel);
        while (itM42469m.hasNext()) {
            ((nz70) itM42469m.next()).writeToParcel(parcel, i);
        }
        nz70 nz70Var = this.f172149b;
        if (nz70Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nz70Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f172150c);
    }
}
