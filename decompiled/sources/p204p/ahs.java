package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class ahs implements Comparator, Parcelable {
    public static final Parcelable.Creator<ahs> CREATOR = new f9s(5);

    /* JADX INFO: renamed from: a */
    public final zgs[] f15759a;

    /* JADX INFO: renamed from: b */
    public int f15760b;

    /* JADX INFO: renamed from: c */
    public final String f15761c;

    /* JADX INFO: renamed from: d */
    public final int f15762d;

    public ahs(zgs... zgsVarArr) {
        this(null, true, zgsVarArr);
    }

    /* JADX INFO: renamed from: c */
    public final ahs m25998c(String str) {
        return Objects.equals(this.f15761c, str) ? this : new ahs(str, false, this.f15759a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zgs zgsVar = (zgs) obj;
        zgs zgsVar2 = (zgs) obj2;
        UUID uuid = mva.f147545b;
        if (uuid.equals(zgsVar.f282701b)) {
            return uuid.equals(zgsVar2.f282701b) ? 0 : 1;
        }
        return zgsVar.f282701b.compareTo(zgsVar2.f282701b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ahs.class == obj.getClass()) {
            ahs ahsVar = (ahs) obj;
            if (Objects.equals(this.f15761c, ahsVar.f15761c) && Arrays.equals(this.f15759a, ahsVar.f15759a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f15760b == 0) {
            String str = this.f15761c;
            this.f15760b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f15759a);
        }
        return this.f15760b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f15761c);
        parcel.writeTypedArray(this.f15759a, 0);
    }

    public ahs(String str, boolean z, zgs... zgsVarArr) {
        this.f15761c = str;
        zgsVarArr = z ? (zgs[]) zgsVarArr.clone() : zgsVarArr;
        this.f15759a = zgsVarArr;
        this.f15762d = zgsVarArr.length;
        Arrays.sort(zgsVarArr, this);
    }

    public ahs(Parcel parcel) {
        this.f15761c = parcel.readString();
        zgs[] zgsVarArr = (zgs[]) parcel.createTypedArray(zgs.CREATOR);
        String str = h0b1.f86200a;
        this.f15759a = zgsVarArr;
        this.f15762d = zgsVarArr.length;
    }
}
