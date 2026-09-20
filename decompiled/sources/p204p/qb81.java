package p204p;

import io.reactivex.rxjava3.core.Single;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qb81 implements jn80 {

    /* JADX INFO: renamed from: a */
    public final dcz f187038a;

    /* JADX INFO: renamed from: b */
    public final mi80 f187039b;

    /* JADX INFO: renamed from: c */
    public final dn81 f187040c;

    public qb81(dcz dczVar, mi80 mi80Var, dn81 dn81Var) {
        this.f187038a = dczVar;
        this.f187039b = mi80Var;
        this.f187040c = dn81Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0067 A[PHI: r8
      0x0067: PHI (r8v1 p.s50) = (r8v0 p.s50), (r8v4 p.s50) binds: [B:17:0x0043, B:22:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r9 == r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
    
        if (r9 == r5) goto L34;
     */
    @Override // p204p.jn80
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo33757a(s50 s50Var, fbk fbkVar) {
        pb81 pb81Var;
        g3m d3mVar;
        g3m g3mVar;
        if (fbkVar instanceof pb81) {
            pb81Var = (pb81) fbkVar;
            int i = pb81Var.f175738e;
            if ((i & Integer.MIN_VALUE) != 0) {
                pb81Var.f175738e = i - Integer.MIN_VALUE;
            } else {
                pb81Var = new pb81(this, (ibk) fbkVar);
            }
        } else {
            pb81Var = new pb81(this, (ibk) fbkVar);
        }
        Object objM96567o = pb81Var.f175736c;
        int i2 = pb81Var.f175738e;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                s50Var = pb81Var.f175734a;
                bga.m29073P(objM96567o);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g3mVar = pb81Var.f175735b;
                bga.m29073P(objM96567o);
            }
            return new t50(g3mVar, (List) objM96567o);
        }
        bga.m29073P(objM96567o);
        if (s50Var.f205672c) {
            if (s50Var.f205672c) {
                d3mVar = c3m.f33702a;
            } else {
                this.f187039b.getClass();
                if (s50Var.f205674e) {
                    d3mVar = new e3m("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ");
                } else {
                    d3mVar = new d3m("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ");
                }
            }
            g3m g3mVar2 = d3mVar;
            s50 s50Var2 = s50Var;
            g3mVar = g3mVar2;
            Single singleMo36056a = this.f187040c.mo36056a(s50Var2.f205670a);
            pb81Var.f175734a = null;
            pb81Var.f175735b = g3mVar;
            pb81Var.f175738e = 2;
            objM96567o = zn91.m96567o(singleMo36056a, pb81Var);
        } else {
            Single singleM35687a = this.f187038a.m35687a();
            pb81Var.f175734a = s50Var;
            pb81Var.f175738e = 1;
            objM96567o = zn91.m96567o(singleM35687a, pb81Var);
        }
        return yukVar;
        if (((Boolean) objM96567o).booleanValue()) {
            d3mVar = new b3m(null);
        } else if (s50Var.f205672c) {
            d3mVar = c3m.f33702a;
        } else {
            this.f187039b.getClass();
            if (s50Var.f205674e) {
                d3mVar = new e3m("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ");
            } else {
                d3mVar = new d3m("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ");
            }
        }
        g3m g3mVar3 = d3mVar;
        s50 s50Var3 = s50Var;
        g3mVar = g3mVar3;
        Single singleMo36056a2 = this.f187040c.mo36056a(s50Var3.f205670a);
        pb81Var.f175734a = null;
        pb81Var.f175735b = g3mVar;
        pb81Var.f175738e = 2;
        objM96567o = zn91.m96567o(singleMo36056a2, pb81Var);
    }
}
