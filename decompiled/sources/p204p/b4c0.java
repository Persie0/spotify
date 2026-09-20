package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class b4c0 implements Parcelable {
    public static final Parcelable.Creator<b4c0> CREATOR = new apb0(29);

    /* JADX INFO: renamed from: a */
    public final String f23301a;

    /* JADX INFO: renamed from: b */
    public final String f23302b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f23303c;

    public b4c0(String str, String str2, ArrayList arrayList) {
        this.f23301a = str;
        this.f23302b = str2;
        this.f23303c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4c0)) {
            return false;
        }
        b4c0 b4c0Var = (b4c0) obj;
        return wj50.m88271j(this.f23301a, b4c0Var.f23301a) && wj50.m88271j(this.f23302b, b4c0Var.f23302b) && this.f23303c.equals(b4c0Var.f23303c);
    }

    public final int hashCode() {
        return this.f23303c.hashCode() + s571.m77243b(this.f23301a.hashCode() * 31, 31, this.f23302b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23301a);
        parcel.writeString(this.f23302b);
        Iterator itM42469m = fr0.m42469m(this.f23303c, parcel);
        while (itM42469m.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42469m.next(), i);
        }
    }
}
