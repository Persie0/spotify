package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class w0m implements ktx {

    /* JADX INFO: renamed from: a */
    public final v0m f246752a;

    /* JADX INFO: renamed from: b */
    public final v0m f246753b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f246754c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f246755d;

    public w0m(v0m v0mVar, v0m v0mVar2, ArrayList arrayList, ArrayList arrayList2) {
        this.f246752a = v0mVar;
        this.f246753b = v0mVar2;
        this.f246754c = arrayList;
        this.f246755d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0m)) {
            return false;
        }
        w0m w0mVar = (w0m) obj;
        return wj50.m88271j(this.f246752a, w0mVar.f246752a) && wj50.m88271j(this.f246753b, w0mVar.f246753b) && this.f246754c.equals(w0mVar.f246754c) && this.f246755d.equals(w0mVar.f246755d);
    }

    public final int hashCode() {
        v0m v0mVar = this.f246752a;
        int iHashCode = (v0mVar == null ? 0 : v0mVar.hashCode()) * 31;
        v0m v0mVar2 = this.f246753b;
        return this.f246755d.hashCode() + lq51.m59700f(this.f246754c, (iHashCode + (v0mVar2 != null ? v0mVar2.hashCode() : 0)) * 31, 31);
    }
}
