package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;

/* JADX INFO: loaded from: classes8.dex */
public final class j9d0 implements h9d0 {

    /* JADX INFO: renamed from: a */
    public final h9d0 f110149a;

    /* JADX INFO: renamed from: b */
    public final myx f110150b;

    /* JADX INFO: renamed from: c */
    public final sxi f110151c;

    public j9d0(h9d0 h9d0Var, myx myxVar, sxi sxiVar) {
        this.f110149a = h9d0Var;
        this.f110150b = myxVar;
        this.f110151c = sxiVar;
    }

    @Override // p204p.h9d0
    /* JADX INFO: renamed from: a */
    public final Object mo38243a(g9d0 g9d0Var, ibk ibkVar) {
        String str = g9d0Var.f77733a;
        String str2 = g9d0Var.f77734b;
        String str3 = g9d0Var.f77735c;
        if (str3 != null && str3.length() != 0) {
            if (str == null) {
                str = str2;
            }
            ExternalAccessoryDescription externalAccessoryDescriptionM79644a = this.f110151c.m79644a(str);
            myx myxVar = this.f110150b;
            myxVar.m63229q(externalAccessoryDescriptionM79644a, myxVar.f148555h.m38294o(), null);
        }
        return this.f110149a.mo38243a(g9d0Var, ibkVar);
    }
}
