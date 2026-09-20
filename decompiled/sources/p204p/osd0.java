package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class osd0 extends qp71 {

    /* JADX INFO: renamed from: e */
    public final qp71 f168802e;

    /* JADX INFO: renamed from: f */
    public final ze40 f168803f;

    /* JADX INFO: renamed from: g */
    public final ze40 f168804g;

    public osd0(qp71 qp71Var, ze40 ze40Var, ze40 ze40Var2) {
        this.f168802e = qp71Var;
        this.f168803f = ze40Var;
        this.f168804g = ze40Var2;
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: a */
    public final int mo33542a(boolean z) {
        return this.f168802e.mo33542a(z);
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: b */
    public final int mo26650b(Object obj) {
        Object obj2;
        boolean z = obj instanceof String;
        qp71 qp71Var = this.f168802e;
        return (!z || (obj2 = ((vsv0) this.f168804g).f244505h.get(obj)) == null) ? qp71Var.mo26650b(obj) : qp71Var.mo26650b(obj2);
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: c */
    public final int mo33543c(boolean z) {
        return this.f168802e.mo33543c(z);
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: e */
    public final int mo33544e(int i, int i2, boolean z) {
        return this.f168802e.mo33544e(i, i2, z);
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: f */
    public final bp71 mo26651f(int i, bp71 bp71Var, boolean z) {
        String str;
        String str2;
        this.f168802e.mo26651f(i, bp71Var, z);
        if (z) {
            Object obj = bp71Var.f29343a;
            ze40 ze40Var = this.f168804g;
            if (obj != null && (str2 = (String) ze40Var.get(obj)) != null) {
                bp71Var.f29343a = str2;
            }
            Object obj2 = bp71Var.f29344b;
            if (obj2 != null && (str = (String) ze40Var.get(obj2)) != null) {
                bp71Var.f29344b = str;
            }
        }
        return bp71Var;
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: h */
    public final int mo26652h() {
        return this.f168802e.mo26652h();
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: k */
    public final int mo33545k(int i, int i2, boolean z) {
        return this.f168802e.mo33545k(i, i2, z);
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: l */
    public final Object mo26653l(int i) {
        Object objMo26653l = this.f168802e.mo26653l(i);
        String str = (String) this.f168804g.get(objMo26653l);
        return str == null ? objMo26653l : str;
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: n */
    public final mp71 mo26654n(int i, mp71 mp71Var, long j) {
        String str;
        this.f168802e.mo26654n(i, mp71Var, j);
        Object obj = mp71Var.f145926a;
        if (obj != null && (str = (String) this.f168803f.get(obj)) != null) {
            mp71Var.f145926a = str;
        }
        return mp71Var;
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: o */
    public final int mo26655o() {
        return this.f168802e.mo26655o();
    }
}
