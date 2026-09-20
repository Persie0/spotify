package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class je81 implements vwf {

    /* JADX INFO: renamed from: a */
    public final a7k f111506a;

    /* JADX INFO: renamed from: b */
    public final l0k f111507b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f111508c;

    /* JADX INFO: renamed from: d */
    public final String f111509d;

    /* JADX INFO: renamed from: e */
    public final String f111510e;

    public je81(a7k a7kVar, l0k l0kVar, ArrayList arrayList, String str, String str2) {
        this.f111506a = a7kVar;
        this.f111507b = l0kVar;
        this.f111508c = arrayList;
        this.f111509d = str;
        this.f111510e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je81)) {
            return false;
        }
        je81 je81Var = (je81) obj;
        return this.f111506a.equals(je81Var.f111506a) && this.f111507b.equals(je81Var.f111507b) && this.f111508c.equals(je81Var.f111508c) && wj50.m88271j(this.f111509d, je81Var.f111509d) && wj50.m88271j(this.f111510e, je81Var.f111510e);
    }

    public final int hashCode() {
        return this.f111510e.hashCode() + s571.m77243b(lq51.m59700f(this.f111508c, (this.f111507b.hashCode() + (this.f111506a.hashCode() * 31)) * 31, 31), 31, this.f111509d);
    }
}
