package p204p;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ob1 implements zb1 {

    /* JADX INFO: renamed from: a */
    public final pla1 f163508a;

    static {
        Parcelable.Creator<pla1> creator = pla1.CREATOR;
    }

    public ob1(pla1 pla1Var) {
        this.f163508a = pla1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ob1) && wj50.m88271j(this.f163508a, ((ob1) obj).f163508a);
    }

    public final int hashCode() {
        return this.f163508a.hashCode();
    }
}
