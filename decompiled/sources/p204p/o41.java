package p204p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class o41 implements Parcelable {
    public static final Parcelable.Creator<o41> CREATOR = new g11(12);

    /* JADX INFO: renamed from: a */
    public final ArrayList f161505a;

    /* JADX INFO: renamed from: b */
    public final boolean f161506b;

    /* JADX INFO: renamed from: c */
    public final Intent f161507c;

    /* JADX INFO: renamed from: d */
    public final int f161508d;

    /* JADX INFO: renamed from: e */
    public final boolean f161509e;

    /* JADX INFO: renamed from: f */
    public final boolean f161510f;

    /* JADX INFO: renamed from: g */
    public final Integer f161511g;

    /* JADX INFO: renamed from: h */
    public final String f161512h;

    public o41(ArrayList arrayList, boolean z, Intent intent, int i, boolean z2, boolean z3, Integer num, String str) {
        this.f161505a = arrayList;
        this.f161506b = z;
        this.f161507c = intent;
        this.f161508d = i;
        this.f161509e = z2;
        this.f161510f = z3;
        this.f161511g = num;
        this.f161512h = str;
    }

    /* JADX INFO: renamed from: c */
    public static o41 m66224c(o41 o41Var, Intent intent, int i, int i2) {
        ArrayList arrayList = o41Var.f161505a;
        boolean z = o41Var.f161506b;
        if ((i2 & 4) != 0) {
            intent = o41Var.f161507c;
        }
        Intent intent2 = intent;
        if ((i2 & 8) != 0) {
            i = o41Var.f161508d;
        }
        boolean z2 = o41Var.f161509e;
        boolean z3 = o41Var.f161510f;
        Integer num = o41Var.f161511g;
        String str = o41Var.f161512h;
        o41Var.getClass();
        return new o41(arrayList, z, intent2, i, z2, z3, num, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o41)) {
            return false;
        }
        o41 o41Var = (o41) obj;
        return this.f161505a.equals(o41Var.f161505a) && this.f161506b == o41Var.f161506b && wj50.m88271j(this.f161507c, o41Var.f161507c) && this.f161508d == o41Var.f161508d && this.f161509e == o41Var.f161509e && this.f161510f == o41Var.f161510f && wj50.m88271j(this.f161511g, o41Var.f161511g) && wj50.m88271j(this.f161512h, o41Var.f161512h);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f161505a.hashCode() * 31, 31, this.f161506b);
        Intent intent = this.f161507c;
        int iM77245d2 = s571.m77245d(s571.m77245d(f710.m40938f(this.f161508d, (iM77245d + (intent == null ? 0 : intent.hashCode())) * 31, 31), 31, this.f161509e), 31, this.f161510f);
        Integer num = this.f161511g;
        int iHashCode = (iM77245d2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f161512h;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        Iterator itM42469m = fr0.m42469m(this.f161505a, parcel);
        while (itM42469m.hasNext()) {
            ((i9o0) itM42469m.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f161506b ? 1 : 0);
        parcel.writeParcelable(this.f161507c, i);
        int i2 = this.f161508d;
        if (i2 == 1) {
            str = "READY";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "LOADING";
        }
        parcel.writeString(str);
        parcel.writeInt(this.f161509e ? 1 : 0);
        parcel.writeInt(this.f161510f ? 1 : 0);
        Integer num = this.f161511g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        parcel.writeString(this.f161512h);
    }
}
