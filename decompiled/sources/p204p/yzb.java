package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class yzb {

    /* JADX INFO: renamed from: a */
    public final String f277745a;

    /* JADX INFO: renamed from: b */
    public final String f277746b;

    /* JADX INFO: renamed from: c */
    public final String f277747c;

    /* JADX INFO: renamed from: d */
    public final String f277748d;

    /* JADX INFO: renamed from: e */
    public final l3s0 f277749e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f277750f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f277751g;

    public yzb(String str, String str2, String str3, String str4, l3s0 l3s0Var, ArrayList arrayList, ArrayList arrayList2) {
        this.f277745a = str;
        this.f277746b = str2;
        this.f277747c = str3;
        this.f277748d = str4;
        this.f277749e = l3s0Var;
        this.f277750f = arrayList;
        this.f277751g = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzb)) {
            return false;
        }
        yzb yzbVar = (yzb) obj;
        return this.f277745a.equals(yzbVar.f277745a) && this.f277746b.equals(yzbVar.f277746b) && this.f277747c.equals(yzbVar.f277747c) && this.f277748d.equals(yzbVar.f277748d) && this.f277749e.equals(yzbVar.f277749e) && this.f277750f.equals(yzbVar.f277750f) && this.f277751g.equals(yzbVar.f277751g);
    }

    public final int hashCode() {
        return this.f277751g.hashCode() + lq51.m59700f(this.f277750f, (this.f277749e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f277745a.hashCode() * 31, 31, this.f277746b), 31, this.f277747c), 31, this.f277748d)) * 31, 31);
    }
}
