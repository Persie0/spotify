package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes10.dex */
public final class r751 implements Parcelable {
    public static final Parcelable.Creator<r751> CREATOR = new q051(23);

    /* JADX INFO: renamed from: a */
    public final String f196443a;

    /* JADX INFO: renamed from: b */
    public final boolean f196444b;

    /* JADX INFO: renamed from: c */
    public final boolean f196445c;

    /* JADX INFO: renamed from: d */
    public final Long f196446d;

    /* JADX INFO: renamed from: e */
    public final boolean f196447e;

    /* JADX INFO: renamed from: f */
    public final Long f196448f;

    /* JADX INFO: renamed from: g */
    public final Long f196449g;

    /* JADX INFO: renamed from: h */
    public final tdu f196450h;

    public r751(String str, boolean z, int i) {
        this(str, z, false, null, false, null, null, new pdu(Integer.valueOf(R.string.settings_disabled_reason_loading), null));
    }

    /* JADX INFO: renamed from: c */
    public static r751 m74892c(r751 r751Var, boolean z, Long l, boolean z2, Long l2, Long l3, tdu tduVar, int i) {
        String str = r751Var.f196443a;
        boolean z3 = r751Var.f196444b;
        if ((i & 4) != 0) {
            z = r751Var.f196445c;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            l = r751Var.f196446d;
        }
        Long l4 = l;
        if ((i & 16) != 0) {
            z2 = r751Var.f196447e;
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            l2 = r751Var.f196448f;
        }
        Long l5 = l2;
        if ((i & 64) != 0) {
            l3 = r751Var.f196449g;
        }
        Long l6 = l3;
        tdu tduVar2 = (i & 128) != 0 ? r751Var.f196450h : tduVar;
        r751Var.getClass();
        return new r751(str, z3, z4, l4, z5, l5, l6, tduVar2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r751)) {
            return false;
        }
        r751 r751Var = (r751) obj;
        return wj50.m88271j(this.f196443a, r751Var.f196443a) && this.f196444b == r751Var.f196444b && this.f196445c == r751Var.f196445c && wj50.m88271j(this.f196446d, r751Var.f196446d) && this.f196447e == r751Var.f196447e && wj50.m88271j(this.f196448f, r751Var.f196448f) && wj50.m88271j(this.f196449g, r751Var.f196449g) && wj50.m88271j(this.f196450h, r751Var.f196450h);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(this.f196443a.hashCode() * 31, 31, this.f196444b), 31, this.f196445c);
        Long l = this.f196446d;
        int iM77245d2 = s571.m77245d((iM77245d + (l == null ? 0 : l.hashCode())) * 31, 31, this.f196447e);
        Long l2 = this.f196448f;
        int iHashCode = (iM77245d2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f196449g;
        return this.f196450h.hashCode() + ((iHashCode + (l3 != null ? l3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f196443a);
        parcel.writeInt(this.f196444b ? 1 : 0);
        parcel.writeInt(this.f196445c ? 1 : 0);
        Long l = this.f196446d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            nap.m64026s(parcel, 1, l);
        }
        parcel.writeInt(this.f196447e ? 1 : 0);
        Long l2 = this.f196448f;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            nap.m64026s(parcel, 1, l2);
        }
        Long l3 = this.f196449g;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            nap.m64026s(parcel, 1, l3);
        }
        parcel.writeParcelable(this.f196450h, i);
    }

    public r751(String str, boolean z, boolean z2, Long l, boolean z3, Long l2, Long l3, tdu tduVar) {
        this.f196443a = str;
        this.f196444b = z;
        this.f196445c = z2;
        this.f196446d = l;
        this.f196447e = z3;
        this.f196448f = l2;
        this.f196449g = l3;
        this.f196450h = tduVar;
    }
}
