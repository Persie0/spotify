package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class a7w0 implements Parcelable {
    public static final Parcelable.Creator<a7w0> CREATOR = new h1v0(22);

    /* JADX INFO: renamed from: a */
    public final eil f13145a;

    /* JADX INFO: renamed from: b */
    public final Set f13146b;

    public a7w0(eil eilVar, Set set) {
        this.f13145a = eilVar;
        this.f13146b = set;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7w0)) {
            return false;
        }
        a7w0 a7w0Var = (a7w0) obj;
        return wj50.m88271j(this.f13145a, a7w0Var.f13145a) && wj50.m88271j(this.f13146b, a7w0Var.f13146b);
    }

    public final int hashCode() {
        return this.f13146b.hashCode() + (this.f13145a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f13145a, i);
        Iterator itM64022o = nap.m64022o(this.f13146b, parcel);
        while (itM64022o.hasNext()) {
            ((fyy) itM64022o.next()).writeToParcel(parcel, i);
        }
    }
}
