package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class s7f implements Parcelable {
    public static final Parcelable.Creator<s7f> CREATOR = new rae(11);

    /* JADX INFO: renamed from: a */
    public final wab0 f206350a;

    /* JADX INFO: renamed from: b */
    public final sbb0 f206351b;

    public s7f(wab0 wab0Var, sbb0 sbb0Var) {
        this.f206350a = wab0Var;
        this.f206351b = sbb0Var;
    }

    /* JADX INFO: renamed from: c */
    public static s7f m77373c(s7f s7fVar, wab0 wab0Var, sbb0 sbb0Var, int i) {
        if ((i & 1) != 0) {
            wab0Var = s7fVar.f206350a;
        }
        if ((i & 2) != 0) {
            sbb0Var = s7fVar.f206351b;
        }
        s7fVar.getClass();
        return new s7f(wab0Var, sbb0Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7f)) {
            return false;
        }
        s7f s7fVar = (s7f) obj;
        return wj50.m88271j(this.f206350a, s7fVar.f206350a) && wj50.m88271j(this.f206351b, s7fVar.f206351b);
    }

    /* JADX INFO: renamed from: g */
    public final sbb0 m77374g() {
        return this.f206351b;
    }

    /* JADX INFO: renamed from: h */
    public final wab0 m77375h() {
        return this.f206350a;
    }

    public final int hashCode() {
        return this.f206351b.hashCode() + (this.f206350a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f206350a.writeToParcel(parcel, i);
        this.f206351b.writeToParcel(parcel, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s7f(ArrayList arrayList, int i, List list, String str, boolean z, sab0 sab0Var, vab0 vab0Var, int i2, sbb0 sbb0Var, int i3) {
        int i4 = i3 & 1;
        lau lauVar = lau.f131415a;
        this(i4 != 0 ? lauVar : arrayList, (i3 & 2) != 0 ? 1 : i, (i3 & 4) != 0 ? lauVar : list, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? new sab0("", "", "") : sab0Var, (i3 & 64) != 0 ? new vab0(false) : vab0Var, (i3 & 128) != 0 ? 1 : i2, lauVar, (i3 & 512) != 0 ? new sbb0(yq20.m94324e("FF353535"), yq20.m94324e("FF565656"), yq20.m94324e("FFFFFFFF"), yq20.m94324e("FFCDCDCD"), yq20.m94324e("FF1ED760"), true) : sbb0Var);
    }

    public s7f(List list, int i, List list2, String str, boolean z, sab0 sab0Var, vab0 vab0Var, int i2, List list3, sbb0 sbb0Var) {
        this(new wab0(list, i, list2, str, z, sab0Var, vab0Var, i2, list3), sbb0Var);
    }
}
