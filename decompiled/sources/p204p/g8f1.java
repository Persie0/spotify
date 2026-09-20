package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class g8f1 extends AbstractC2206o9 {
    public static final Parcelable.Creator<g8f1> CREATOR = new c5f1(12);

    /* JADX INFO: renamed from: a */
    public double f77476a;

    /* JADX INFO: renamed from: b */
    public boolean f77477b;

    /* JADX INFO: renamed from: c */
    public int f77478c;

    /* JADX INFO: renamed from: d */
    public lg5 f77479d;

    /* JADX INFO: renamed from: e */
    public int f77480e;

    /* JADX INFO: renamed from: f */
    public ogf1 f77481f;

    /* JADX INFO: renamed from: g */
    public double f77482g;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g8f1)) {
            return false;
        }
        g8f1 g8f1Var = (g8f1) obj;
        if (this.f77476a == g8f1Var.f77476a && this.f77477b == g8f1Var.f77477b && this.f77478c == g8f1Var.f77478c && acc.m25453c(this.f77479d, g8f1Var.f77479d) && this.f77480e == g8f1Var.f77480e) {
            ogf1 ogf1Var = this.f77481f;
            if (acc.m25453c(ogf1Var, ogf1Var) && this.f77482g == g8f1Var.f77482g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f77476a), Boolean.valueOf(this.f77477b), Integer.valueOf(this.f77478c), this.f77479d, Integer.valueOf(this.f77480e), this.f77481f, Double.valueOf(this.f77482g)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.f77476a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        double d = this.f77476a;
        alf1.m26313S(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z = this.f77477b;
        alf1.m26313S(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        int i2 = this.f77478c;
        alf1.m26313S(parcel, 4, 4);
        parcel.writeInt(i2);
        alf1.m26307M(parcel, 5, this.f77479d, i);
        int i3 = this.f77480e;
        alf1.m26313S(parcel, 6, 4);
        parcel.writeInt(i3);
        alf1.m26307M(parcel, 7, this.f77481f, i);
        double d2 = this.f77482g;
        alf1.m26313S(parcel, 8, 8);
        parcel.writeDouble(d2);
        alf1.m26316V(iM26314T, parcel);
    }
}
