package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class h520 implements i520 {
    public static final Parcelable.Creator<h520> CREATOR = new t320(10);

    /* JADX INFO: renamed from: a */
    public final String f87704a;

    /* JADX INFO: renamed from: b */
    public final String f87705b;

    /* JADX INFO: renamed from: c */
    public final List f87706c;

    public h520(String str, List list, String str2) {
        this.f87704a = str;
        this.f87705b = str2;
        this.f87706c = list;
    }

    @Override // p204p.i520
    /* JADX INFO: renamed from: I1 */
    public final String mo40744I1() {
        return this.f87705b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h520)) {
            return false;
        }
        h520 h520Var = (h520) obj;
        return wj50.m88271j(this.f87704a, h520Var.f87704a) && wj50.m88271j(this.f87705b, h520Var.f87705b) && wj50.m88271j(this.f87706c, h520Var.f87706c);
    }

    @Override // p204p.i520
    /* JADX INFO: renamed from: h0 */
    public final String mo40745h0() {
        return this.f87704a;
    }

    public final int hashCode() {
        return this.f87706c.hashCode() + s571.m77243b(this.f87704a.hashCode() * 31, 31, this.f87705b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f87704a);
        parcel.writeString(this.f87705b);
        parcel.writeStringList(this.f87706c);
    }
}
