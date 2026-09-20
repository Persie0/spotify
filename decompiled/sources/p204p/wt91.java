package p204p;

import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class wt91 {

    /* JADX INFO: renamed from: a */
    public final dj70 f254890a;

    /* JADX INFO: renamed from: b */
    public final fj70 f254891b;

    /* JADX INFO: renamed from: c */
    public final ej70 f254892c;

    /* JADX INFO: renamed from: d */
    public final sb5 f254893d;

    /* JADX INFO: renamed from: e */
    public final aey0 f254894e;

    public wt91(dj70 dj70Var, fj70 fj70Var, ej70 ej70Var, xre xreVar, sb5 sb5Var, aey0 aey0Var) {
        this.f254890a = dj70Var;
        this.f254891b = fj70Var;
        this.f254892c = ej70Var;
        this.f254893d = sb5Var;
        this.f254894e = aey0Var;
    }

    /* JADX INFO: renamed from: a */
    public final vt91 m88914a() {
        ocm0 ocm0VarMo32928a = this.f254890a.mo32928a(this.f254894e);
        String str = this.f254892c.f60155a;
        String string = UUID.randomUUID().toString();
        kbm0 kbm0Var = ocm0VarMo32928a != null ? ocm0VarMo32928a.f163959a : null;
        String str2 = ocm0VarMo32928a != null ? ocm0VarMo32928a.f163961c : null;
        String str3 = this.f254891b.f70107a;
        if (str3 == null) {
            str3 = "";
        }
        String lowerCase = str3.toLowerCase(Locale.ROOT);
        String str4 = ocm0VarMo32928a != null ? ocm0VarMo32928a.f163960b : null;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = str != null ? str : "";
        String id = TimeZone.getDefault().getID();
        String strM79876a = this.f254893d.f207352a.m79876a();
        sb5 sb5Var = this.f254893d;
        t1h1 t1h1Var = sb5Var.f207352a;
        bpn0 bpn0Var = sb5Var.f207354c;
        return new vt91(string, kbm0Var, str2, lowerCase, str4, str5, id, strM79876a, bpn0Var != null ? Integer.valueOf(bpn0Var.f29553a) : null);
    }
}
