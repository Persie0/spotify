package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.allboarding.entrypoint.EntryPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ad3 implements Parcelable {
    public static final Parcelable.Creator<ad3> CREATOR = new bc3(2);

    /* JADX INFO: renamed from: e */
    public static final ad3 f14499e = new ad3(EntryPoint.DEFAULT, new q151("", C2433tz.f225078a, kiy0.f123141a, null, null), lau.f131415a, null);

    /* JADX INFO: renamed from: a */
    public final EntryPoint f14500a;

    /* JADX INFO: renamed from: b */
    public final q151 f14501b;

    /* JADX INFO: renamed from: c */
    public final List f14502c;

    /* JADX INFO: renamed from: d */
    public final ec3 f14503d;

    public ad3(EntryPoint entryPoint, q151 q151Var, List list, ec3 ec3Var) {
        this.f14500a = entryPoint;
        this.f14501b = q151Var;
        this.f14502c = list;
        this.f14503d = ec3Var;
    }

    /* JADX INFO: renamed from: c */
    public static ad3 m25511c(ad3 ad3Var, EntryPoint entryPoint, q151 q151Var, ArrayList arrayList, ec3 ec3Var, int i) {
        if ((i & 1) != 0) {
            entryPoint = ad3Var.f14500a;
        }
        if ((i & 2) != 0) {
            q151Var = ad3Var.f14501b;
        }
        List list = arrayList;
        if ((i & 4) != 0) {
            list = ad3Var.f14502c;
        }
        if ((i & 8) != 0) {
            ec3Var = ad3Var.f14503d;
        }
        ad3Var.getClass();
        return new ad3(entryPoint, q151Var, list, ec3Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad3)) {
            return false;
        }
        ad3 ad3Var = (ad3) obj;
        return this.f14500a == ad3Var.f14500a && wj50.m88271j(this.f14501b, ad3Var.f14501b) && wj50.m88271j(this.f14502c, ad3Var.f14502c) && wj50.m88271j(this.f14503d, ad3Var.f14503d);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c((this.f14501b.hashCode() + (this.f14500a.hashCode() * 31)) * 31, 31, this.f14502c);
        ec3 ec3Var = this.f14503d;
        return iM77244c + (ec3Var == null ? 0 : ec3Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14500a.name());
        parcel.writeParcelable(this.f14501b, i);
        Iterator itM42468l = fr0.m42468l(parcel, this.f14502c);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
        parcel.writeParcelable(this.f14503d, i);
    }
}
