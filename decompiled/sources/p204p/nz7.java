package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class nz7 {

    /* JADX INFO: renamed from: a */
    public u3l f160009a;

    /* JADX INFO: renamed from: b */
    public List f160010b;

    /* JADX INFO: renamed from: c */
    public List f160011c;

    /* JADX INFO: renamed from: d */
    public Boolean f160012d;

    /* JADX INFO: renamed from: e */
    public v3l f160013e;

    /* JADX INFO: renamed from: f */
    public List f160014f;

    /* JADX INFO: renamed from: g */
    public int f160015g;

    /* JADX INFO: renamed from: h */
    public byte f160016h;

    /* JADX INFO: renamed from: a */
    public final oz7 m65946a() {
        u3l u3lVar;
        if (this.f160016h == 1 && (u3lVar = this.f160009a) != null) {
            return new oz7(u3lVar, this.f160010b, this.f160011c, this.f160012d, this.f160013e, this.f160014f, this.f160015g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f160009a == null) {
            sb.append(" execution");
        }
        if ((1 & this.f160016h) == 0) {
            sb.append(" uiOrientation");
        }
        throw new IllegalStateException(edb.m38569r(sb, "Missing required properties:"));
    }

    /* JADX INFO: renamed from: b */
    public final void m65947b(List list) {
        this.f160014f = list;
    }

    /* JADX INFO: renamed from: c */
    public final void m65948c(Boolean bool) {
        this.f160012d = bool;
    }

    /* JADX INFO: renamed from: d */
    public final void m65949d(v3l v3lVar) {
        this.f160013e = v3lVar;
    }

    /* JADX INFO: renamed from: e */
    public final void m65950e(List list) {
        this.f160010b = list;
    }

    /* JADX INFO: renamed from: f */
    public final void m65951f(pz7 pz7Var) {
        this.f160009a = pz7Var;
    }

    /* JADX INFO: renamed from: g */
    public final void m65952g(List list) {
        this.f160011c = list;
    }

    /* JADX INFO: renamed from: h */
    public final void m65953h(int i) {
        this.f160015g = i;
        this.f160016h = (byte) (this.f160016h | 1);
    }
}
