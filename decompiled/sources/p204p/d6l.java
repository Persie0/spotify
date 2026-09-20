package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class d6l implements Parcelable {
    public static final Parcelable.Creator<d6l> CREATOR = new z4l(2);

    /* JADX INFO: renamed from: a */
    public final String f45719a;

    /* JADX INFO: renamed from: b */
    public final String f45720b;

    /* JADX INFO: renamed from: c */
    public final List f45721c;

    /* JADX INFO: renamed from: d */
    public final ney0 f45722d;

    /* JADX INFO: renamed from: e */
    public final List f45723e;

    public d6l(String str, String str2, List list, ney0 ney0Var, List list2) {
        this.f45719a = str;
        this.f45720b = str2;
        this.f45721c = list;
        this.f45722d = ney0Var;
        this.f45723e = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6l)) {
            return false;
        }
        d6l d6lVar = (d6l) obj;
        return wj50.m88271j(this.f45719a, d6lVar.f45719a) && wj50.m88271j(this.f45720b, d6lVar.f45720b) && wj50.m88271j(this.f45721c, d6lVar.f45721c) && wj50.m88271j(this.f45722d, d6lVar.f45722d) && wj50.m88271j(this.f45723e, d6lVar.f45723e);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77243b(this.f45719a.hashCode() * 31, 31, this.f45720b), 31, this.f45721c);
        ney0 ney0Var = this.f45722d;
        return this.f45723e.hashCode() + ((iM77244c + (ney0Var == null ? 0 : ney0Var.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f45719a);
        parcel.writeString(this.f45720b);
        parcel.writeStringList(this.f45721c);
        ney0 ney0Var = this.f45722d;
        if (ney0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ney0Var.writeToParcel(parcel, i);
        }
        Iterator itM42468l = fr0.m42468l(parcel, this.f45723e);
        while (itM42468l.hasNext()) {
            ((s151) itM42468l.next()).writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ d6l(String str, String str2, List list, ney0 ney0Var, int i) {
        int i2 = i & 4;
        lau lauVar = lau.f131415a;
        this(str, str2, i2 != 0 ? lauVar : list, (i & 8) != 0 ? null : ney0Var, lauVar);
    }
}
