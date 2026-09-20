package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vrh implements zsz0 {

    /* JADX INFO: renamed from: a */
    public final wsv0 f244210a;

    /* JADX INFO: renamed from: b */
    public long f244211b;

    public vrh(zsz0[] zsz0VarArr) {
        this(pf40.m69792q(zsz0VarArr), Collections.nCopies(zsz0VarArr.length, pf40.m69794t(-1)));
    }

    @Override // p204p.zsz0
    /* JADX INFO: renamed from: b */
    public final long mo26774b() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            wsv0 wsv0Var = this.f244210a;
            if (i >= wsv0Var.f254765d) {
                break;
            }
            long jMo26774b = ((urh) wsv0Var.get(i)).f233377a.mo26774b();
            if (jMo26774b != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo26774b);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // p204p.zsz0
    /* JADX INFO: renamed from: c */
    public final boolean mo26775c() {
        int i = 0;
        while (true) {
            wsv0 wsv0Var = this.f244210a;
            if (i >= wsv0Var.f254765d) {
                return false;
            }
            if (((urh) wsv0Var.get(i)).f233377a.mo26775c()) {
                return true;
            }
            i++;
        }
    }

    @Override // p204p.zsz0
    /* JADX INFO: renamed from: h */
    public final boolean mo26780h(m8a0 m8a0Var) {
        boolean zMo26780h;
        boolean z = false;
        do {
            long jMo26774b = mo26774b();
            if (jMo26774b == Long.MIN_VALUE) {
                return z;
            }
            int i = 0;
            zMo26780h = false;
            while (true) {
                wsv0 wsv0Var = this.f244210a;
                if (i >= wsv0Var.f254765d) {
                    break;
                }
                long jMo26774b2 = ((urh) wsv0Var.get(i)).f233377a.mo26774b();
                boolean z2 = jMo26774b2 != Long.MIN_VALUE && jMo26774b2 <= m8a0Var.f140996a;
                if (jMo26774b2 == jMo26774b || z2) {
                    zMo26780h |= ((urh) wsv0Var.get(i)).f233377a.mo26780h(m8a0Var);
                }
                i++;
            }
            z |= zMo26780h;
        } while (zMo26780h);
        return z;
    }

    @Override // p204p.zsz0
    /* JADX INFO: renamed from: y */
    public final long mo26791y() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            wsv0 wsv0Var = this.f244210a;
            if (i >= wsv0Var.f254765d) {
                break;
            }
            urh urhVar = (urh) wsv0Var.get(i);
            long jMo26791y = urhVar.f233377a.mo26791y();
            pf40 pf40Var = urhVar.f233378b;
            if ((pf40Var.contains(1) || pf40Var.contains(2) || pf40Var.contains(4)) && jMo26791y != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo26791y);
            }
            if (jMo26791y != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jMo26791y);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f244211b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.f244211b;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // p204p.zsz0
    /* JADX INFO: renamed from: z */
    public final void mo26792z(long j) {
        int i = 0;
        while (true) {
            wsv0 wsv0Var = this.f244210a;
            if (i >= wsv0Var.f254765d) {
                return;
            }
            ((urh) wsv0Var.get(i)).mo26792z(j);
            i++;
        }
    }

    public vrh(List list, List list2) {
        jf40 jf40VarM69788m = pf40.m69788m();
        c95.m31843i(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            jf40VarM69788m.m28985c(new urh((zsz0) list.get(i), (List) list2.get(i)));
        }
        this.f244210a = jf40VarM69788m.m53150g();
        this.f244211b = -9223372036854775807L;
    }
}
