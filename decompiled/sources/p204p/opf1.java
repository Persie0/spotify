package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class opf1 extends ypf1 {
    @Override // p204p.ypf1
    /* JADX INFO: renamed from: a */
    public final void mo33563a(long j, Object obj) {
        ((kbf1) ((gnf1) czf1.f43554c.m89357m(j, obj))).f121199a = false;
    }

    @Override // p204p.ypf1
    /* JADX INFO: renamed from: b */
    public final void mo33564b(Object obj, long j, Object obj2) {
        wyf1 wyf1Var = czf1.f43554c;
        gnf1 gnf1VarZzd = (gnf1) wyf1Var.m89357m(j, obj);
        gnf1 gnf1Var = (gnf1) wyf1Var.m89357m(j, obj2);
        int size = gnf1VarZzd.size();
        int size2 = gnf1Var.size();
        if (size > 0 && size2 > 0) {
            if (!((kbf1) gnf1VarZzd).f121199a) {
                gnf1VarZzd = gnf1VarZzd.zzd(size2 + size);
            }
            gnf1VarZzd.addAll(gnf1Var);
        }
        if (size > 0) {
            gnf1Var = gnf1VarZzd;
        }
        czf1.m34443h(obj, j, gnf1Var);
    }
}
