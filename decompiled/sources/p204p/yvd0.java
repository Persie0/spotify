package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class yvd0 implements awd0 {
    public static final Parcelable.Creator<yvd0> CREATOR = new jfd0(21);

    /* JADX INFO: renamed from: a */
    public final String f276648a;

    /* JADX INFO: renamed from: b */
    public final String f276649b;

    /* JADX INFO: renamed from: c */
    public final t2b0 f276650c;

    public yvd0(String str, String str2, t2b0 t2b0Var) {
        this.f276648a = str;
        this.f276649b = str2;
        this.f276650c = t2b0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvd0)) {
            return false;
        }
        yvd0 yvd0Var = (yvd0) obj;
        return wj50.m88271j(this.f276648a, yvd0Var.f276648a) && wj50.m88271j(this.f276649b, yvd0Var.f276649b) && wj50.m88271j(this.f276650c, yvd0Var.f276650c);
    }

    public final int hashCode() {
        return this.f276650c.hashCode() + s571.m77243b(this.f276648a.hashCode() * 31, 31, this.f276649b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f276648a);
        parcel.writeString(this.f276649b);
        t2b0 t2b0Var = this.f276650c;
        parcel.writeLong(t2b0Var.f195112a);
        parcel.writeLong(t2b0Var.f195113b);
    }
}
