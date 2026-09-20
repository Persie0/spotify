package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class wnp0 implements Parcelable, toc1 {
    public static final Parcelable.Creator<wnp0> CREATOR = new vnp0(0);

    /* JADX INFO: renamed from: a */
    public final String f253232a;

    /* JADX INFO: renamed from: b */
    public final voc1 f253233b;

    public wnp0(String str) {
        this.f253232a = str;
        uoc1 uoc1Var = xoc1.f263888G1;
        Set set = dd41.f47702f;
        String strM35694A = r46.m74726U("spotify:playlist-participants:".concat(r46.m74726U(str).m35710h())).m35694A();
        wj50.m88279p(strM35694A);
        this.f253233b = uoc1Var.m83614b(strM35694A);
    }

    @Override // p204p.toc1
    /* JADX INFO: renamed from: a */
    public final voc1 getF6520f1() {
        return this.f253233b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wnp0) && wj50.m88271j(this.f253232a, ((wnp0) obj).f253232a);
    }

    public final int hashCode() {
        return this.f253232a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f253232a);
    }
}
