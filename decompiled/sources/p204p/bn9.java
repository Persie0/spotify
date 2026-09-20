package p204p;

import android.os.Parcelable;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class bn9 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final doh f28727a;

    /* JADX INFO: renamed from: b */
    public final en9 f28728b;

    /* JADX INFO: renamed from: c */
    public final a99 f28729c;

    /* JADX INFO: renamed from: d */
    public final q831 f28730d;

    /* JADX INFO: renamed from: e */
    public final nt7 f28731e;

    /* JADX INFO: renamed from: f */
    public final pfm0 f28732f;

    public bn9(doh dohVar, en9 en9Var, a99 a99Var, q831 q831Var, nt7 nt7Var) {
        this.f28727a = dohVar;
        this.f28728b = en9Var;
        this.f28729c = a99Var;
        this.f28730d = q831Var;
        this.f28731e = nt7Var;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        cbm0 cbm0VarM90814j0 = xgg1.m90814j0();
        Parcelable.Creator<voc1> creator = voc1.CREATOR;
        this.f28732f = new pfm0(new qfm0[]{new q040(cbm0VarM90814j0, mug1.m62869n(gn9.m45295a()), null), new fda(null, bda.f26062b, null, 0, null, null, false, false, true, 1789)}, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: c */
    public static final Object m29928c(bn9 bn9Var, String str, ibk ibkVar) {
        an9 an9Var;
        en9 en9Var = bn9Var.f28728b;
        if (ibkVar instanceof an9) {
            an9Var = (an9) ibkVar;
            int i = an9Var.f17339d;
            if ((i & Integer.MIN_VALUE) != 0) {
                an9Var.f17339d = i - Integer.MIN_VALUE;
            } else {
                an9Var = new an9(bn9Var, ibkVar);
            }
        } else {
            an9Var = new an9(bn9Var, ibkVar);
        }
        Object objM25094m = an9Var.f17337b;
        int i2 = an9Var.f17339d;
        lau lauVar = lau.f131415a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM25094m);
                if (wl51.m88460J0(en9Var.m39480c())) {
                    return new vz51(lauVar);
                }
                a99 a99Var = bn9Var.f28729c;
                String strM39480c = en9Var.m39480c();
                an9Var.f17336a = str;
                an9Var.f17339d = 1;
                objM25094m = a99Var.m25094m(strM39480c, an9Var);
                Object obj = yuk.f276404a;
                if (objM25094m == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = an9Var.f17336a;
                bga.m29073P(objM25094m);
            }
            return new vz51((List) objM25094m);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            bn9Var.f28730d.m72305j(t0j.m79825f(str).m52392q());
            return new vz51(lauVar);
        }
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f28732f;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f28727a.m36532a(rkk.m75763o(new gd6(this, 22), true, 514657027));
    }
}
