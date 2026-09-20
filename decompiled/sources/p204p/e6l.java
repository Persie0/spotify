package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class e6l implements Parcelable {
    public static final Parcelable.Creator<e6l> CREATOR = new z4l(3);

    /* JADX INFO: renamed from: a */
    public final String f56655a;

    /* JADX INFO: renamed from: b */
    public final e4r0 f56656b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f56657c;

    /* JADX INFO: renamed from: d */
    public final dsc1 f56658d;

    /* JADX INFO: renamed from: e */
    public final ney0 f56659e;

    /* JADX INFO: renamed from: f */
    public final boolean f56660f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f56661g;

    /* JADX INFO: renamed from: h */
    public final String f56662h;

    /* JADX INFO: renamed from: i */
    public final ol21 f56663i;

    public e6l(String str, e4r0 e4r0Var, ArrayList arrayList, dsc1 dsc1Var, ney0 ney0Var, boolean z, ArrayList arrayList2, String str2, ol21 ol21Var) {
        this.f56655a = str;
        this.f56656b = e4r0Var;
        this.f56657c = arrayList;
        this.f56658d = dsc1Var;
        this.f56659e = ney0Var;
        this.f56660f = z;
        this.f56661g = arrayList2;
        this.f56662h = str2;
        this.f56663i = ol21Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6l)) {
            return false;
        }
        e6l e6lVar = (e6l) obj;
        return wj50.m88271j(this.f56655a, e6lVar.f56655a) && wj50.m88271j(this.f56656b, e6lVar.f56656b) && this.f56657c.equals(e6lVar.f56657c) && wj50.m88271j(this.f56658d, e6lVar.f56658d) && wj50.m88271j(this.f56659e, e6lVar.f56659e) && this.f56660f == e6lVar.f56660f && this.f56661g.equals(e6lVar.f56661g) && wj50.m88271j(this.f56662h, e6lVar.f56662h) && this.f56663i == e6lVar.f56663i;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(lq51.m59700f(this.f56661g, s571.m77245d((this.f56659e.hashCode() + ((this.f56658d.hashCode() + lq51.m59700f(this.f56657c, (this.f56656b.hashCode() + (this.f56655a.hashCode() * 31)) * 31, 31)) * 31)) * 31, 31, this.f56660f), 31), 31, this.f56662h);
        ol21 ol21Var = this.f56663i;
        return iM77243b + (ol21Var == null ? 0 : ol21Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f56655a);
        this.f56656b.writeToParcel(parcel, i);
        Iterator itM42469m = fr0.m42469m(this.f56657c, parcel);
        while (itM42469m.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42469m.next(), i);
        }
        this.f56658d.writeToParcel(parcel, i);
        this.f56659e.writeToParcel(parcel, i);
        parcel.writeInt(this.f56660f ? 1 : 0);
        Iterator itM42469m2 = fr0.m42469m(this.f56661g, parcel);
        while (itM42469m2.hasNext()) {
            ((ogv0) itM42469m2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.f56662h);
        ol21 ol21Var = this.f56663i;
        if (ol21Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(ol21Var.name());
        }
    }
}
