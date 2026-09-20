package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ph3 implements Parcelable {
    public static final Parcelable.Creator<ph3> CREATOR = new bc3(5);

    /* JADX INFO: renamed from: a */
    public final List f177453a;

    /* JADX INFO: renamed from: b */
    public final jz80 f177454b;

    /* JADX INFO: renamed from: c */
    public final fa80 f177455c;

    public ph3(List list, jz80 jz80Var, fa80 fa80Var) {
        this.f177453a = list;
        this.f177454b = jz80Var;
        this.f177455c = fa80Var;
    }

    /* JADX INFO: renamed from: g */
    public static ph3 m69935g(ph3 ph3Var, List list, jz80 jz80Var, fa80 fa80Var, int i) {
        if ((i & 1) != 0) {
            list = ph3Var.f177453a;
        }
        if ((i & 2) != 0) {
            jz80Var = ph3Var.f177454b;
        }
        if ((i & 4) != 0) {
            fa80Var = ph3Var.f177455c;
        }
        ph3Var.getClass();
        return new ph3(list, jz80Var, fa80Var);
    }

    /* JADX INFO: renamed from: c */
    public final ibj m69936c() {
        return this.f177454b.f117618a.f84784e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph3)) {
            return false;
        }
        ph3 ph3Var = (ph3) obj;
        return wj50.m88271j(this.f177453a, ph3Var.f177453a) && wj50.m88271j(this.f177454b, ph3Var.f177454b) && wj50.m88271j(this.f177455c, ph3Var.f177455c);
    }

    public final int hashCode() {
        return this.f177455c.f67458a.hashCode() + ((this.f177454b.hashCode() + (this.f177453a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42468l = fr0.m42468l(parcel, this.f177453a);
        while (itM42468l.hasNext()) {
            parcel.writeString(((wr31) itM42468l.next()).name());
        }
        this.f177454b.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f177455c, i);
    }
}
