package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class drk implements Parcelable {
    public static final Parcelable.Creator<drk> CREATOR = new kck(19);

    /* JADX INFO: renamed from: a */
    public final b370 f52349a;

    /* JADX INFO: renamed from: b */
    public final voc1 f52350b;

    public drk(b370 b370Var, voc1 voc1Var) {
        this.f52349a = b370Var;
        this.f52350b = voc1Var;
    }

    /* JADX INFO: renamed from: c */
    public final b370 m36734c() {
        return this.f52349a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drk)) {
            return false;
        }
        drk drkVar = (drk) obj;
        return wj50.m88271j(this.f52349a, drkVar.f52349a) && wj50.m88271j(this.f52350b, drkVar.f52350b);
    }

    public final int hashCode() {
        return this.f52350b.f243453a.hashCode() + (this.f52349a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f52349a, i);
        parcel.writeParcelable(this.f52350b, i);
    }
}
