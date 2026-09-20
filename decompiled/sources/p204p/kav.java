package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class kav {

    /* JADX INFO: renamed from: a */
    public final String f120967a;

    /* JADX INFO: renamed from: b */
    public final long f120968b;

    /* JADX INFO: renamed from: c */
    public final String f120969c;

    /* JADX INFO: renamed from: d */
    public final Object f120970d;

    public kav(String str, long j, String str2, List list) {
        this.f120967a = str;
        this.f120968b = j;
        this.f120969c = str2;
        this.f120970d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kav)) {
            return false;
        }
        kav kavVar = (kav) obj;
        return wj50.m88271j(this.f120967a, kavVar.f120967a) && this.f120968b == kavVar.f120968b && wj50.m88271j(this.f120969c, kavVar.f120969c) && this.f120970d.equals(kavVar.f120970d);
    }

    public final int hashCode() {
        return this.f120970d.hashCode() + s571.m77243b(dq60.m36605e(this.f120967a.hashCode() * 31, this.f120968b, 31), 31, this.f120969c);
    }
}
