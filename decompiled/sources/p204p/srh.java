package p204p;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public abstract class srh implements v550 {
    @Override // p204p.v550
    /* JADX INFO: renamed from: a */
    public final void mo27509a(cxe cxeVar) {
        int i;
        int i2;
        for (ogm0 ogm0Var : mo54184b()) {
            Iterator it = ogm0Var.mo24411b().iterator();
            while (true) {
                i = 19;
                i2 = 5;
                if (!it.hasNext()) {
                    break;
                } else {
                    cxeVar.m34279M(stg1.m79274o(new spr((gn80) it.next(), 8), new spr(ogm0Var, i2)), ogm0Var.getDescription(), new qq8(ogm0Var, i));
                }
            }
            Iterator it2 = ogm0Var.mo28839f().iterator();
            while (it2.hasNext()) {
                cxeVar.m34279M(stg1.m79274o(new spr((fka1) it2.next(), 9), new spr(ogm0Var, i2)), ogm0Var.getDescription(), new qq8(ogm0Var, i));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract Set mo54184b();
}
