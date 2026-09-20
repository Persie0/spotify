package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class kvu0 {

    /* JADX INFO: renamed from: a */
    public final zuu0 f126955a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f126956b;

    /* JADX INFO: renamed from: c */
    public final int f126957c;

    /* JADX INFO: renamed from: d */
    public final qp4 f126958d;

    /* JADX INFO: renamed from: e */
    public final auw0 f126959e;

    /* JADX INFO: renamed from: f */
    public final int f126960f;

    /* JADX INFO: renamed from: g */
    public final int f126961g;

    /* JADX INFO: renamed from: h */
    public final int f126962h;

    /* JADX INFO: renamed from: i */
    public int f126963i;

    public kvu0(zuu0 zuu0Var, ArrayList arrayList, int i, qp4 qp4Var, auw0 auw0Var, int i2, int i3, int i4) {
        this.f126955a = zuu0Var;
        this.f126956b = arrayList;
        this.f126957c = i;
        this.f126958d = qp4Var;
        this.f126959e = auw0Var;
        this.f126960f = i2;
        this.f126961g = i3;
        this.f126962h = i4;
    }

    /* JADX INFO: renamed from: a */
    public static kvu0 m57488a(kvu0 kvu0Var, int i, qp4 qp4Var, auw0 auw0Var, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = kvu0Var.f126957c;
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            qp4Var = kvu0Var.f126958d;
        }
        qp4 qp4Var2 = qp4Var;
        if ((i5 & 4) != 0) {
            auw0Var = kvu0Var.f126959e;
        }
        auw0 auw0Var2 = auw0Var;
        if ((i5 & 8) != 0) {
            i2 = kvu0Var.f126960f;
        }
        int i7 = i2;
        if ((i5 & 16) != 0) {
            i3 = kvu0Var.f126961g;
        }
        return new kvu0(kvu0Var.f126955a, kvu0Var.f126956b, i6, qp4Var2, auw0Var2, i7, i3, (i5 & 32) != 0 ? kvu0Var.f126962h : i4);
    }

    /* JADX INFO: renamed from: b */
    public final n2x0 m57489b(auw0 auw0Var) {
        ArrayList arrayList = this.f126956b;
        int size = arrayList.size();
        int i = this.f126957c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f126963i++;
        qp4 qp4Var = this.f126958d;
        if (qp4Var != null) {
            pvu0 pvu0VarMo44705j = ((ggx) qp4Var.f191126d).mo44705j();
            ph30 ph30Var = auw0Var.f20037a;
            ph30 ph30Var2 = pvu0VarMo44705j.f181843j.f276529h;
            if (ph30Var.f177460e != ph30Var2.f177460e || !wj50.m88271j(ph30Var.f177459d, ph30Var2.f177459d)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.f126963i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        kvu0 kvu0VarM57488a = m57488a(this, i2, null, auw0Var, 0, 0, 0, 58);
        hc50 hc50Var = (hc50) arrayList.get(i);
        n2x0 n2x0VarMo47096a = hc50Var.mo47096a(kvu0VarM57488a);
        if (n2x0VarMo47096a == null) {
            throw new NullPointerException("interceptor " + hc50Var + " returned null");
        }
        if (qp4Var == null || i2 >= arrayList.size() || kvu0VarM57488a.f126963i == 1) {
            return n2x0VarMo47096a;
        }
        throw new IllegalStateException(("network interceptor " + hc50Var + " must call proceed() exactly once").toString());
    }
}
