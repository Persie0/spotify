package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class w8y0 extends xoi0 {

    /* JADX INFO: renamed from: Y */
    public final String f249036Y;

    /* JADX INFO: renamed from: Z */
    public x8y0 f249037Z;

    public w8y0(x8y0 x8y0Var, String str, Object obj) {
        super(obj);
        this.f249036Y = str;
        this.f249037Z = x8y0Var;
    }

    @Override // p204p.ck90
    /* JADX INFO: renamed from: m */
    public final void mo33104m(Object obj) {
        x8y0 x8y0Var = this.f249037Z;
        if (x8y0Var != null) {
            LinkedHashMap linkedHashMap = x8y0Var.f259239a;
            String str = this.f249036Y;
            linkedHashMap.put(str, obj);
            lqi0 lqi0Var = (lqi0) x8y0Var.f259242d.get(str);
            if (lqi0Var != null) {
                ((zv41) lqi0Var).m97090l(obj);
            }
        }
        super.mo33104m(obj);
    }

    /* JADX INFO: renamed from: n */
    public final void m87476n() {
        this.f249037Z = null;
    }

    public w8y0(String str, x8y0 x8y0Var) {
        this.f249036Y = str;
        this.f249037Z = x8y0Var;
    }
}
