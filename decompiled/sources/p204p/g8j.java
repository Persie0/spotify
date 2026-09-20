package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class g8j implements ri21, bp70 {

    /* JADX INFO: renamed from: a */
    public long f77528a = e1b1.f55172a;

    /* JADX INFO: renamed from: b */
    public ArrayList f77529b = new ArrayList();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.ri21
    /* JADX INFO: renamed from: b */
    public final Object mo40114b(fbk fbkVar) throws Throwable {
        f8j f8jVar;
        rlv0 rlv0Var;
        Throwable th;
        tjr njrVar;
        if (fbkVar instanceof f8j) {
            f8jVar = (f8j) fbkVar;
            int i = f8jVar.f67001d;
            if ((i & Integer.MIN_VALUE) != 0) {
                f8jVar.f67001d = i - Integer.MIN_VALUE;
            } else {
                f8jVar = new f8j(this, (ibk) fbkVar);
            }
        } else {
            f8jVar = new f8j(this, (ibk) fbkVar);
        }
        Object obj = f8jVar.f66999b;
        int i2 = f8jVar.f67001d;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (b8j.m28433l(this.f77528a)) {
                rlv0 rlv0Var2 = new rlv0();
                try {
                    f8jVar.f66998a = rlv0Var2;
                    f8jVar.f67001d = 1;
                    hqb hqbVar = new hqb(1, seg1.m77914f(f8jVar));
                    hqbVar.m48222q();
                    rlv0Var2.f200373a = hqbVar;
                    this.f77529b.add(hqbVar);
                    Object objM48221p = hqbVar.m48221p();
                    yuk yukVar = yuk.f276404a;
                    if (objM48221p == yukVar) {
                        return yukVar;
                    }
                    rlv0Var = rlv0Var2;
                    ArrayList arrayList = this.f77529b;
                    zn91.m96557j(arrayList).remove(rlv0Var.f200373a);
                } catch (Throwable th2) {
                    rlv0Var = rlv0Var2;
                    th = th2;
                    ArrayList arrayList2 = this.f77529b;
                    zn91.m96557j(arrayList2).remove(rlv0Var.f200373a);
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rlv0Var = f8jVar.f66998a;
            try {
                bga.m29073P(obj);
                ArrayList arrayList3 = this.f77529b;
                zn91.m96557j(arrayList3).remove(rlv0Var.f200373a);
            } catch (Throwable th3) {
                th = th3;
                ArrayList arrayList4 = this.f77529b;
                zn91.m96557j(arrayList4).remove(rlv0Var.f200373a);
                throw th;
            }
        }
        long j = this.f77528a;
        int iM28430i = b8j.m28430i(j);
        tjr njrVar2 = pjr.f178301a;
        if (iM28430i != Integer.MAX_VALUE) {
            wj50.m88254a(iM28430i);
            njrVar = new njr(iM28430i);
        } else {
            njrVar = njrVar2;
        }
        int iM28429h = b8j.m28429h(j);
        if (iM28429h != Integer.MAX_VALUE) {
            wj50.m88254a(iM28429h);
            njrVar2 = new njr(iM28429h);
        }
        return new ci21(njrVar, njrVar2);
    }

    /* JADX INFO: renamed from: c */
    public final void m43960c(long j) {
        this.f77528a = j;
        if (b8j.m28433l(j)) {
            return;
        }
        ArrayList arrayList = this.f77529b;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f77529b = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fbk) it.next()).resumeWith(w2a1.f247311a);
        }
    }

    @Override // p204p.bp70
    /* JADX INFO: renamed from: i */
    public final n6d0 mo25845i(o6d0 o6d0Var, h6d0 h6d0Var, long j) {
        m43960c(j);
        t5o0 t5o0VarMo39619B = h6d0Var.mo39619B(j);
        return o6d0Var.mo44714T(t5o0VarMo39619B.f217322a, t5o0VarMo39619B.f217323b, nau.f152117a, new C2484v6(t5o0VarMo39619B, 3));
    }
}
