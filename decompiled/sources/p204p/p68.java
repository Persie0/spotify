package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class p68 implements Parcelable {
    public static final Parcelable.Creator<p68> CREATOR = new na7(27);

    /* JADX INFO: renamed from: a */
    public final ArrayList f174312a;

    /* JADX INFO: renamed from: b */
    public final double f174313b;

    /* JADX INFO: renamed from: c */
    public final double f174314c;

    public p68(ArrayList arrayList, double d, double d2) {
        this.f174312a = arrayList;
        this.f174313b = d;
        this.f174314c = d2;
    }

    /* JADX INFO: renamed from: c */
    public final String m69190c() {
        ArrayList arrayList = this.f174312a;
        Iterator it = arrayList.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((o68) it.next()).f162269a.size();
        }
        StringBuilder sbM36619s = dq60.m36619s(arrayList.size(), size, "AutomationCurves(", " curves, ", " pts, range=[");
        sbM36619s.append(this.f174313b);
        sbM36619s.append(",");
        sbM36619s.append(this.f174314c);
        sbM36619s.append("])");
        return sbM36619s.toString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p68)) {
            return false;
        }
        p68 p68Var = (p68) obj;
        return this.f174312a.equals(p68Var.f174312a) && Double.compare(this.f174313b, p68Var.f174313b) == 0 && Double.compare(this.f174314c, p68Var.f174314c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f174314c) + xl81.m91399h(this.f174313b, this.f174312a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42469m = fr0.m42469m(this.f174312a, parcel);
        while (itM42469m.hasNext()) {
            ((o68) itM42469m.next()).writeToParcel(parcel, i);
        }
        parcel.writeDouble(this.f174313b);
        parcel.writeDouble(this.f174314c);
    }
}
