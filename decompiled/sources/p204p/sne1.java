package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class sne1 implements wne1 {
    public static final Parcelable.Creator<sne1> CREATOR = new xed1(29);

    /* JADX INFO: renamed from: a */
    public final List f210919a;

    /* JADX INFO: renamed from: b */
    public final String f210920b;

    public sne1(List list, String str) {
        this.f210919a = list;
        this.f210920b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sne1)) {
            return false;
        }
        sne1 sne1Var = (sne1) obj;
        return wj50.m88271j(this.f210919a, sne1Var.f210919a) && wj50.m88271j(this.f210920b, sne1Var.f210920b);
    }

    public final int hashCode() {
        int iHashCode = this.f210919a.hashCode() * 31;
        String str = this.f210920b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f210919a);
        parcel.writeString(this.f210920b);
    }
}
