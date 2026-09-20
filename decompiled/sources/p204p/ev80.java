package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ev80 extends gv80 {
    @Override // p204p.gv80
    /* JADX INFO: renamed from: a */
    public final void mo33980a(long j, Object obj) {
        ((AbstractC1696b9) ((zd50) a5a1.f12473d.m87173i(j, obj))).f24728a = false;
    }

    @Override // p204p.gv80
    /* JADX INFO: renamed from: b */
    public final void mo33981b(Object obj, long j, Object obj2) {
        w4a1 w4a1Var = a5a1.f12473d;
        zd50 zd50VarMo46604h = (zd50) w4a1Var.m87173i(j, obj);
        zd50 zd50Var = (zd50) w4a1Var.m87173i(j, obj2);
        int size = zd50VarMo46604h.size();
        int size2 = zd50Var.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC1696b9) zd50VarMo46604h).f24728a) {
                zd50VarMo46604h = zd50VarMo46604h.mo46604h(size2 + size);
            }
            zd50VarMo46604h.addAll(zd50Var);
        }
        if (size > 0) {
            zd50Var = zd50VarMo46604h;
        }
        a5a1.m24792o(obj, j, zd50Var);
    }

    @Override // p204p.gv80
    /* JADX INFO: renamed from: c */
    public final List mo33982c(long j, Object obj) {
        zd50 zd50Var = (zd50) a5a1.f12473d.m87173i(j, obj);
        if (((AbstractC1696b9) zd50Var).f24728a) {
            return zd50Var;
        }
        int size = zd50Var.size();
        zd50 zd50VarMo46604h = zd50Var.mo46604h(size == 0 ? 10 : size * 2);
        a5a1.m24792o(obj, j, zd50VarMo46604h);
        return zd50VarMo46604h;
    }
}
