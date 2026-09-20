package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class p2r {

    /* JADX INFO: renamed from: a */
    public final ArrayList f173415a;

    /* JADX INFO: renamed from: b */
    public final String f173416b;

    /* JADX INFO: renamed from: c */
    public final byte[] f173417c;

    public p2r(String str, ArrayList arrayList, byte[] bArr) {
        this.f173415a = arrayList;
        this.f173416b = str;
        this.f173417c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p2r.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        p2r p2rVar = (p2r) obj;
        return this.f173415a.equals(p2rVar.f173415a) && wj50.m88271j(this.f173416b, p2rVar.f173416b);
    }

    public final int hashCode() {
        int iHashCode = this.f173415a.hashCode() * 31;
        String str = this.f173416b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
