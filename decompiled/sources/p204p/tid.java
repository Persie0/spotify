package p204p;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class tid extends sy61 {

    /* JADX INFO: renamed from: a */
    public final atj0 f220607a;

    /* JADX INFO: renamed from: b */
    public final ome0 f220608b;

    /* JADX INFO: renamed from: c */
    public final String f220609c;

    /* JADX INFO: renamed from: d */
    public final e8d0 f220610d;

    /* JADX INFO: renamed from: e */
    public final jid f220611e;

    /* JADX INFO: renamed from: f */
    public final jid f220612f;

    /* JADX INFO: renamed from: g */
    public final Bundle f220613g;

    /* JADX INFO: renamed from: h */
    public final wdt0 f220614h;

    /* JADX INFO: renamed from: i */
    public final List f220615i;

    public tid(atj0 atj0Var, ome0 ome0Var, String str, e8d0 e8d0Var, jid jidVar, jid jidVar2, Bundle bundle, wdt0 wdt0Var, List list) {
        this.f220607a = atj0Var;
        this.f220608b = ome0Var;
        this.f220609c = str;
        this.f220610d = e8d0Var;
        this.f220611e = jidVar;
        this.f220612f = jidVar2;
        this.f220613g = bundle;
        this.f220614h = wdt0Var;
        this.f220615i = list;
    }

    @Override // p204p.sy61
    /* JADX INFO: renamed from: a */
    public final wdt0 mo32339a() {
        return this.f220614h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tid)) {
            return false;
        }
        tid tidVar = (tid) obj;
        return wj50.m88271j(this.f220607a, tidVar.f220607a) && wj50.m88271j(this.f220608b, tidVar.f220608b) && this.f220609c.equals(tidVar.f220609c) && wj50.m88271j(this.f220610d, tidVar.f220610d) && this.f220611e.equals(tidVar.f220611e) && this.f220612f.equals(tidVar.f220612f) && this.f220613g.equals(tidVar.f220613g) && this.f220614h.equals(tidVar.f220614h) && this.f220615i.equals(tidVar.f220615i);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((this.f220608b.hashCode() + (this.f220607a.hashCode() * 31)) * 31, 31, this.f220609c);
        e8d0 e8d0Var = this.f220610d;
        return s571.m77244c((this.f220614h.hashCode() + ((this.f220613g.hashCode() + ((this.f220612f.hashCode() + ((this.f220611e.hashCode() + ((iM77243b + (e8d0Var == null ? 0 : e8d0Var.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f220615i);
    }
}
