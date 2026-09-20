package p204p;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class rzy0 {

    /* JADX INFO: renamed from: a */
    public final String f204254a;

    /* JADX INFO: renamed from: b */
    public final Parcelable f204255b;

    public rzy0(String str, Parcelable parcelable) {
        this.f204254a = str;
        this.f204255b = parcelable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzy0)) {
            return false;
        }
        rzy0 rzy0Var = (rzy0) obj;
        return wj50.m88271j(this.f204254a, rzy0Var.f204254a) && this.f204255b.equals(rzy0Var.f204255b);
    }

    public final int hashCode() {
        return this.f204255b.hashCode() + (this.f204254a.hashCode() * 31);
    }
}
