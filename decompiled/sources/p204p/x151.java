package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class x151 implements Parcelable {
    public static final Parcelable.Creator<x151> CREATOR = new q051(11);

    /* JADX INFO: renamed from: a */
    public final String f257068a;

    /* JADX INFO: renamed from: b */
    public final d251 f257069b;

    /* JADX INFO: renamed from: c */
    public final f251 f257070c;

    /* JADX INFO: renamed from: d */
    public final List f257071d;

    public x151(String str, d251 d251Var, f251 f251Var, List list) {
        this.f257068a = str;
        this.f257069b = d251Var;
        this.f257070c = f251Var;
        this.f257071d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x151)) {
            return false;
        }
        x151 x151Var = (x151) obj;
        return wj50.m88271j(this.f257068a, x151Var.f257068a) && wj50.m88271j(this.f257069b, x151Var.f257069b) && wj50.m88271j(this.f257070c, x151Var.f257070c) && wj50.m88271j(this.f257071d, x151Var.f257071d);
    }

    public final int hashCode() {
        int iHashCode = (this.f257069b.hashCode() + (this.f257068a.hashCode() * 31)) * 31;
        f251 f251Var = this.f257070c;
        return this.f257071d.hashCode() + ((iHashCode + (f251Var == null ? 0 : f251Var.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f257068a);
        parcel.writeParcelable(this.f257069b, i);
        parcel.writeParcelable(this.f257070c, i);
        parcel.writeStringList(this.f257071d);
    }

    public /* synthetic */ x151(String str, d251 d251Var, bma0 bma0Var, List list, int i) {
        this(str, d251Var, (i & 4) != 0 ? null : bma0Var, (i & 8) != 0 ? lau.f131415a : list);
    }
}
