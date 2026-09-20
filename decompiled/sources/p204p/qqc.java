package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class qqc implements vwf {

    /* JADX INFO: renamed from: a */
    public final String f191528a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f191529b;

    /* JADX INFO: renamed from: c */
    public final String f191530c;

    public qqc(String str, String str2, ArrayList arrayList) {
        this.f191528a = str;
        this.f191529b = arrayList;
        this.f191530c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqc)) {
            return false;
        }
        qqc qqcVar = (qqc) obj;
        return wj50.m88271j(this.f191528a, qqcVar.f191528a) && this.f191529b.equals(qqcVar.f191529b) && wj50.m88271j(this.f191530c, qqcVar.f191530c);
    }

    public final int hashCode() {
        return this.f191530c.hashCode() + lq51.m59700f(this.f191529b, this.f191528a.hashCode() * 31, 31);
    }
}
