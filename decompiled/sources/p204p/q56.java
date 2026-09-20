package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class q56 implements Parcelable {
    public static final Parcelable.Creator<q56> CREATOR = new vp5(15);

    /* JADX INFO: renamed from: a */
    public final String f185406a;

    /* JADX INFO: renamed from: b */
    public final String f185407b;

    /* JADX INFO: renamed from: c */
    public final String f185408c;

    /* JADX INFO: renamed from: d */
    public final List f185409d;

    /* JADX INFO: renamed from: e */
    public final Long f185410e;

    public q56(String str, String str2, String str3, List list, Long l) {
        this.f185406a = str;
        this.f185407b = str2;
        this.f185408c = str3;
        this.f185409d = list;
        this.f185410e = l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q56)) {
            return false;
        }
        q56 q56Var = (q56) obj;
        return wj50.m88271j(this.f185406a, q56Var.f185406a) && wj50.m88271j(this.f185407b, q56Var.f185407b) && wj50.m88271j(this.f185408c, q56Var.f185408c) && wj50.m88271j(this.f185409d, q56Var.f185409d) && wj50.m88271j(this.f185410e, q56Var.f185410e);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77243b(s571.m77243b(this.f185406a.hashCode() * 31, 31, this.f185407b), 31, this.f185408c), 31, this.f185409d);
        Long l = this.f185410e;
        return iM77244c + (l == null ? 0 : l.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f185406a);
        parcel.writeString(this.f185407b);
        parcel.writeString(this.f185408c);
        parcel.writeStringList(this.f185409d);
        Long l = this.f185410e;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            nap.m64026s(parcel, 1, l);
        }
    }
}
