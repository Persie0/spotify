package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class u980 extends v980 {
    public static final Parcelable.Creator<u980> CREATOR = new i980(2);

    /* JADX INFO: renamed from: a */
    public final lw8 f228089a;

    /* JADX INFO: renamed from: b */
    public final String f228090b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f228091c;

    /* JADX INFO: renamed from: d */
    public final pyl f228092d;

    /* JADX INFO: renamed from: e */
    public final String f228093e;

    public u980(lw8 lw8Var, String str, ArrayList arrayList, pyl pylVar, String str2) {
        this.f228089a = lw8Var;
        this.f228090b = str;
        this.f228091c = arrayList;
        this.f228092d = pylVar;
        this.f228093e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u980)) {
            return false;
        }
        u980 u980Var = (u980) obj;
        return this.f228089a == u980Var.f228089a && wj50.m88271j(this.f228090b, u980Var.f228090b) && this.f228091c.equals(u980Var.f228091c) && wj50.m88271j(this.f228092d, u980Var.f228092d) && wj50.m88271j(this.f228093e, u980Var.f228093e);
    }

    public final int hashCode() {
        int iM59700f = lq51.m59700f(this.f228091c, s571.m77243b(this.f228089a.hashCode() * 31, 31, this.f228090b), 31);
        pyl pylVar = this.f228092d;
        return this.f228093e.hashCode() + ((iM59700f + (pylVar == null ? 0 : pylVar.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f228089a.name());
        parcel.writeString(this.f228090b);
        Iterator itM42469m = fr0.m42469m(this.f228091c, parcel);
        while (itM42469m.hasNext()) {
            ((lt8) itM42469m.next()).writeToParcel(parcel, i);
        }
        pyl pylVar = this.f228092d;
        if (pylVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pylVar.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f228093e);
    }
}
