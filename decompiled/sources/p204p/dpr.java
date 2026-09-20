package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class dpr implements Parcelable.Creator {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Number] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Integer numValueOf;
        Boolean boolValueOf;
        ?? r10;
        boolean z;
        boolean z2;
        boolean z3;
        Integer numValueOf2;
        Integer numValueOf3 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
        if (parcel.readInt() != 0) {
            numValueOf = Integer.valueOf(parcel.readInt());
            boolValueOf = null;
        } else {
            numValueOf = null;
            boolValueOf = null;
        }
        String string = parcel.readString();
        boolean z4 = parcel.readByte() != 0;
        boolean z5 = parcel.readByte() != 0;
        if (parcel.readInt() != 0) {
            numValueOf2 = Integer.valueOf(parcel.readInt());
        } else {
            r10 = boolValueOf;
        }
        if (r10 != 0) {
            if (r10.intValue() == 1) {
                r10 = numValueOf2;
                z3 = true;
            } else {
                r10 = numValueOf2;
                z3 = false;
            }
            boolValueOf = Boolean.valueOf(z3);
        }
        r10 = numValueOf2;
        ynr ynrVar = (ynr) parcel.readParcelable(ynr.class.getClassLoader());
        boolean z6 = parcel.readByte() != 0;
        if (parcel.readByte() != 0) {
            z = true;
            z2 = true;
        } else {
            z = true;
            z2 = false;
        }
        boolean z7 = parcel.readByte() != 0 ? z : false;
        if (parcel.readByte() == 0) {
            z = false;
        }
        boolean z8 = parcel.readByte() != 0 ? z : false;
        ppr pprVar = (ppr) parcel.readParcelable(ppr.class.getClassLoader());
        boolean z9 = parcel.readByte() != 0 ? z : false;
        boolean z10 = parcel.readByte() != 0 ? z : false;
        epr eprVar = (epr) parcel.readParcelable(epr.class.getClassLoader());
        String string2 = parcel.readString();
        if (string2 == null) {
            string2 = "";
        }
        return new fpr(numValueOf3, numValueOf, string, z4, z5, boolValueOf, null, ynrVar, z6, z2, z7, z, z8, pprVar, z9, z10, eprVar, string2, parcel.readByte() != 0, parcel.readByte() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new fpr[i];
    }
}
