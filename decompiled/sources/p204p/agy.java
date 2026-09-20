package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class agy implements Parcelable {
    public static final Parcelable.Creator<agy> CREATOR = new p7y(5);

    /* JADX INFO: renamed from: a */
    public final String f15543a;

    public agy(String str) {
        this.f15543a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        agy agyVar = obj instanceof agy ? (agy) obj : null;
        return wj50.m88271j(agyVar != null ? agyVar.getName() : null, getName());
    }

    public String getName() {
        return this.f15543a;
    }

    public final int hashCode() {
        return getName().hashCode();
    }

    public final String toString() {
        return getName();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f15543a);
    }
}
