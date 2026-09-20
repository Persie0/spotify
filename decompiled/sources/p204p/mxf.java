package p204p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
public final class mxf {

    /* JADX INFO: renamed from: a */
    public final ovf f148041a;

    /* JADX INFO: renamed from: b */
    public final ViewGroup f148042b;

    public mxf(ViewGroup viewGroup, ovf ovfVar) {
        this.f148041a = ovfVar;
        this.f148042b = viewGroup;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxf)) {
            return false;
        }
        mxf mxfVar = (mxf) obj;
        return wj50.m88271j(this.f148041a, mxfVar.f148041a) && wj50.m88271j(this.f148042b, mxfVar.f148042b);
    }

    public final int hashCode() {
        return this.f148042b.hashCode() + (this.f148041a.hashCode() * 31);
    }
}
