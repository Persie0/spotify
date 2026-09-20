package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class qjq0 implements Parcelable {
    public static final Parcelable.Creator<qjq0> CREATOR = new vnp0(18);

    /* JADX INFO: renamed from: a */
    public final String f189292a;

    /* JADX INFO: renamed from: b */
    public final e1e f189293b;

    /* JADX INFO: renamed from: c */
    public final boolean f189294c;

    public qjq0(String str, e1e e1eVar, boolean z) {
        this.f189292a = str;
        this.f189293b = e1eVar;
        this.f189294c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjq0)) {
            return false;
        }
        qjq0 qjq0Var = (qjq0) obj;
        return wj50.m88271j(this.f189292a, qjq0Var.f189292a) && wj50.m88271j(this.f189293b, qjq0Var.f189293b) && this.f189294c == qjq0Var.f189294c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f189294c) + ((this.f189293b.hashCode() + (this.f189292a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f189292a);
        parcel.writeParcelable(this.f189293b, i);
        parcel.writeInt(this.f189294c ? 1 : 0);
    }
}
