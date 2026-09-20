package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class kkl implements rkl {
    public static final Parcelable.Creator<kkl> CREATOR = new z4l(25);

    /* JADX INFO: renamed from: a */
    public final ArrayList f123627a;

    /* JADX INFO: renamed from: b */
    public final int f123628b;

    /* JADX INFO: renamed from: c */
    public final gh00 f123629c;

    public kkl(int i, ArrayList arrayList, gh00 gh00Var) {
        this.f123627a = arrayList;
        this.f123628b = i;
        this.f123629c = gh00Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkl)) {
            return false;
        }
        kkl kklVar = (kkl) obj;
        return wj50.m88271j(this.f123627a, kklVar.f123627a) && this.f123628b == kklVar.f123628b && wj50.m88271j(this.f123629c, kklVar.f123629c);
    }

    public final int hashCode() {
        return this.f123629c.hashCode() + mt60.m62800g(this.f123628b, this.f123627a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42469m = fr0.m42469m(this.f123627a, parcel);
        while (itM42469m.hasNext()) {
            ((ekl) itM42469m.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f123628b);
        parcel.writeSerializable((Serializable) this.f123629c);
    }

    public /* synthetic */ kkl(ArrayList arrayList) {
        this(2, arrayList, ofl.f164797W0);
    }
}
