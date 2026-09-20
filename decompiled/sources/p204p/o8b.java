package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class o8b implements Parcelable {
    public static final Parcelable.Creator<o8b> CREATOR = new jja(7);

    /* JADX INFO: renamed from: a */
    public final fyh0 f162755a;

    /* JADX INFO: renamed from: b */
    public final fyh0 f162756b;

    /* JADX INFO: renamed from: c */
    public final boo f162757c;

    /* JADX INFO: renamed from: d */
    public final fyh0 f162758d;

    /* JADX INFO: renamed from: e */
    public final int f162759e;

    /* JADX INFO: renamed from: f */
    public final int f162760f;

    public o8b(fyh0 fyh0Var, fyh0 fyh0Var2, boo booVar, fyh0 fyh0Var3) {
        this.f162755a = fyh0Var;
        this.f162756b = fyh0Var2;
        this.f162758d = fyh0Var3;
        this.f162757c = booVar;
        if (fyh0Var3 != null && fyh0Var.f74745a.compareTo(fyh0Var3.f74745a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (fyh0Var3 != null && fyh0Var3.compareTo(fyh0Var2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f162760f = fyh0Var.m43108l(fyh0Var2) + 1;
        this.f162759e = (fyh0Var2.f74747c - fyh0Var.f74747c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8b)) {
            return false;
        }
        o8b o8bVar = (o8b) obj;
        return this.f162755a.equals(o8bVar.f162755a) && this.f162756b.equals(o8bVar.f162756b) && Objects.equals(this.f162758d, o8bVar.f162758d) && this.f162757c.equals(o8bVar.f162757c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f162755a, this.f162756b, this.f162758d, this.f162757c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f162755a, 0);
        parcel.writeParcelable(this.f162756b, 0);
        parcel.writeParcelable(this.f162758d, 0);
        parcel.writeParcelable(this.f162757c, 0);
    }
}
