package p204p;

import android.content.Context;
import android.content.ServiceConnection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class q1f1 implements l2f1 {

    /* JADX INFO: renamed from: b */
    public static final String f184312b;

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f184313a = new LinkedHashMap();

    static {
        String canonicalName = q1f1.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = q1f1.class.getSimpleName();
        }
        f184312b = canonicalName;
    }

    @Override // p204p.l2f1
    /* JADX INFO: renamed from: a */
    public final int mo57898a() {
        LinkedHashMap linkedHashMap = this.f184313a;
        int i = 0;
        if (linkedHashMap.isEmpty()) {
            return 0;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            p1f1 p1f1Var = (p1f1) ((Map.Entry) it.next()).getValue();
            if (p1f1Var.f173065b != null && p1f1Var.f173066c) {
                i++;
            }
        }
        return i;
    }

    @Override // p204p.l2f1
    /* JADX INFO: renamed from: c */
    public final g2f1 mo57899c(String str) {
        p1f1 p1f1Var = (p1f1) this.f184313a.get(str);
        if (p1f1Var != null) {
            return p1f1Var.f173065b;
        }
        return null;
    }

    @Override // p204p.l2f1
    /* JADX INFO: renamed from: e */
    public final void mo57900e(Context context, String str) {
        LinkedHashMap linkedHashMap = this.f184313a;
        p1f1 p1f1Var = (p1f1) linkedHashMap.get(str);
        if (p1f1Var != null) {
            mr6 mr6Var = p1f1Var.f173064a;
            String strConcat = "***Debug unbinding service connection for ".concat(str);
            utu0 utu0Var = gk71.f80747a;
            utu0Var.m83940H(f184312b);
            utu0Var.m83952u(strConcat, new Object[0]);
            context.unbindService(mr6Var);
            p1f1Var.f173065b = null;
            p1f1Var.f173066c = false;
        }
    }

    @Override // p204p.l2f1
    /* JADX INFO: renamed from: f */
    public final boolean mo57901f(String str) {
        Boolean boolValueOf;
        p1f1 p1f1Var = (p1f1) this.f184313a.get(str);
        if (p1f1Var != null) {
            boolValueOf = Boolean.valueOf(p1f1Var.f173065b != null && p1f1Var.f173066c);
        } else {
            boolValueOf = null;
        }
        return wj50.m88271j(boolValueOf, Boolean.TRUE);
    }

    @Override // p204p.l2f1
    /* JADX INFO: renamed from: g */
    public final ServiceConnection mo57902g(String str) {
        return new mr6(4, this, str);
    }
}
