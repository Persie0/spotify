package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class gub0 implements Parcelable {
    public static final Parcelable.Creator<gub0> CREATOR = new apb0(15);

    /* JADX INFO: renamed from: a */
    public final String f84433a;

    /* JADX INFO: renamed from: b */
    public final String f84434b;

    /* JADX INFO: renamed from: c */
    public final boolean f84435c;

    /* JADX INFO: renamed from: d */
    public final boolean f84436d;

    /* JADX INFO: renamed from: e */
    public final fub0 f84437e;

    public gub0(String str, String str2, boolean z, boolean z2, fub0 fub0Var) {
        this.f84433a = str;
        this.f84434b = str2;
        this.f84435c = z;
        this.f84436d = z2;
        this.f84437e = fub0Var;
    }

    /* JADX INFO: renamed from: c */
    public static gub0 m45736c(gub0 gub0Var, String str, fub0 fub0Var, int i) {
        if ((i & 1) != 0) {
            str = gub0Var.f84433a;
        }
        String str2 = gub0Var.f84434b;
        boolean z = gub0Var.f84435c;
        boolean z2 = gub0Var.f84436d;
        gub0Var.getClass();
        return new gub0(str, str2, z, z2, fub0Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gub0)) {
            return false;
        }
        gub0 gub0Var = (gub0) obj;
        return wj50.m88271j(this.f84433a, gub0Var.f84433a) && wj50.m88271j(this.f84434b, gub0Var.f84434b) && this.f84435c == gub0Var.f84435c && this.f84436d == gub0Var.f84436d && wj50.m88271j(this.f84437e, gub0Var.f84437e);
    }

    /* JADX INFO: renamed from: g */
    public final String m45737g() {
        return this.f84433a;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m45738h() {
        String str = this.f84433a;
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = wj50.m88282u(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String string = str.subSequence(i, length + 1).toString();
        if (wl51.m88496t0(string, "@", false)) {
            return wcn0.f250078c.matcher(string).matches();
        }
        return string.length() > 0;
    }

    public final int hashCode() {
        return this.f84437e.hashCode() + s571.m77245d(s571.m77245d(s571.m77243b(this.f84433a.hashCode() * 31, 31, this.f84434b), 31, this.f84435c), 31, this.f84436d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f84433a);
        parcel.writeString(this.f84434b);
        parcel.writeInt(this.f84435c ? 1 : 0);
        parcel.writeInt(this.f84436d ? 1 : 0);
        parcel.writeParcelable(this.f84437e, i);
    }

    public /* synthetic */ gub0(String str, boolean z, String str2, boolean z2) {
        this(str, str2, z, z2, bub0.f31075a);
    }
}
