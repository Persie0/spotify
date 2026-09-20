package p204p;

import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class nkq {

    /* JADX INFO: renamed from: a */
    public final oxe f154924a;

    /* JADX INFO: renamed from: b */
    public final luk f154925b;

    /* JADX INFO: renamed from: c */
    public final luk f154926c;

    /* JADX INFO: renamed from: d */
    public final Set f154927d;

    /* JADX INFO: renamed from: e */
    public final zv41 f154928e = jag1.m52819d(kkq.f123689c);

    public nkq(oxe oxeVar, luk lukVar, luk lukVar2, hg40 hg40Var) {
        this.f154924a = oxeVar;
        this.f154925b = lukVar;
        this.f154926c = lukVar2;
        this.f154927d = hg40Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0083 A[LOOP:0: B:29:0x007d->B:31:0x0083, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final void m64701a(ViewGroup viewGroup, ibk ibkVar) {
        mkq mkqVar;
        Iterator it;
        if (ibkVar instanceof mkq) {
            mkqVar = (mkq) ibkVar;
            int i = mkqVar.f144631d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mkqVar.f144631d = i - Integer.MIN_VALUE;
            } else {
                mkqVar = new mkq(this, ibkVar);
            }
        } else {
            mkqVar = new mkq(this, ibkVar);
        }
        Object obj = mkqVar.f144629b;
        int i2 = mkqVar.f144631d;
        fbk fbkVar = null;
        Object obj2 = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                viewGroup = mkqVar.f144628a;
                bga.m29073P(obj);
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        throw edb.m38575x(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                viewGroup = mkqVar.f144628a;
                bga.m29073P(obj);
            }
            it = this.f154927d.iterator();
            while (it.hasNext()) {
                ((cvb0) ((er70) it.next()).get()).mo25304g(viewGroup);
            }
            ncp ncpVar = new ncp(this, 5);
            mkqVar.f144628a = null;
            mkqVar.f144631d = 3;
            this.f154928e.collect(ncpVar, mkqVar);
        }
        bga.m29073P(obj);
        mkqVar.f144628a = viewGroup;
        mkqVar.f144631d = 1;
        Object objM89557A = x0h1.m89557A(this.f154926c, new xuo(this.f154924a, fbkVar, 21), mkqVar);
        if (objM89557A != obj2) {
            objM89557A = w2a1.f247311a;
        }
        if (objM89557A == obj2) {
            return;
        }
        yse yseVar = new yse(this, fbkVar, 23);
        mkqVar.f144628a = viewGroup;
        mkqVar.f144631d = 2;
        if (x0h1.m89557A(this.f154925b, yseVar, mkqVar) == obj2) {
            return;
        }
        it = this.f154927d.iterator();
        while (it.hasNext()) {
            ((cvb0) ((er70) it.next()).get()).mo25304g(viewGroup);
        }
        ncp ncpVar2 = new ncp(this, 5);
        mkqVar.f144628a = null;
        mkqVar.f144631d = 3;
        this.f154928e.collect(ncpVar2, mkqVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m64702b(kkq kkqVar) {
        zv41 zv41Var = this.f154928e;
        if (zv41Var.getValue() == kkq.f123689c && kkqVar == kkq.f123688b) {
            return;
        }
        zv41Var.getClass();
        zv41Var.m97091m(null, kkqVar);
    }
}
