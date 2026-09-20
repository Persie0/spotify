package p204p;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ak70 {

    /* JADX INFO: renamed from: a */
    public final am71 f16445a;

    /* JADX INFO: renamed from: b */
    public final Set f16446b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f16447c = new LinkedHashMap();

    public ak70(am71 am71Var, hg40 hg40Var) {
        this.f16445a = am71Var;
        this.f16446b = hg40Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m26198a(bsa bsaVar, int i, int i2) {
        if (bsaVar == null) {
            bsaVar = null;
        }
        if (bsaVar == null) {
            return;
        }
        if (bsaVar.m30391Z()) {
            String strM30387T = bsaVar.m30387T();
            LinkedHashMap linkedHashMap = this.f16447c;
            z2a0 z2a0Var = (z2a0) linkedHashMap.get(strM30387T);
            if (z2a0Var != null) {
                z2a0Var.m95180a(i, i2);
            }
            linkedHashMap.remove(bsaVar.m30387T());
        }
        bsaVar.m30382O(i, i2);
    }

    /* JADX INFO: renamed from: b */
    public final bsa m26199b(String str, String str2, boolean z) {
        Object next;
        Object next2;
        z2a0 z2a0Var;
        Set set = this.f16446b;
        Iterator it = set.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((ow3) next).m68154b(str));
        boolean z2 = next != null;
        Iterator it2 = set.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!((ow3) next2).m68153a(str));
        boolean z3 = next2 != null;
        if (!z2 && !z3) {
            return null;
        }
        if (z2 && z && (z2a0Var = (z2a0) this.f16447c.get(str)) != null) {
            z2a0Var.m95181b(str2);
        }
        bsa bsaVar = new bsa(this.f16445a, str, str2, z);
        if (z3) {
            bsaVar.m30414n0();
        }
        return bsaVar;
    }
}
