package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class um01 implements Parcelable {
    public static final Parcelable.Creator<um01> CREATOR = new vj01(9);

    /* JADX INFO: renamed from: a */
    public final up60 f231702a;

    public um01(up60 up60Var) {
        this.f231702a = up60Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof um01) && wj50.m88271j(this.f231702a, ((um01) obj).f231702a);
    }

    public final int hashCode() {
        return this.f231702a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        up60 up60Var = this.f231702a;
        parcel.writeString(up60Var != null ? ((ife) up60Var).mo28587A().getName() : null);
    }
}
