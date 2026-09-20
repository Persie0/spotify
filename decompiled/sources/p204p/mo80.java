package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class mo80 extends AbstractC2601y5 {

    /* JADX INFO: renamed from: a */
    public final ko80 f145624a;

    /* JADX INFO: renamed from: b */
    public boolean f145625b;

    /* JADX INFO: renamed from: c */
    public int f145626c;

    public mo80(ko80 ko80Var) {
        this.f145624a = ko80Var;
    }

    @Override // p204p.AbstractC2601y5
    /* JADX INFO: renamed from: c */
    public final boolean mo49421c(gq9 gq9Var) {
        if (!(gq9Var instanceof pw80)) {
            return false;
        }
        if (this.f145625b && this.f145626c == 1) {
            this.f145625b = false;
        }
        return true;
    }

    @Override // p204p.AbstractC2601y5
    /* JADX INFO: renamed from: f */
    public final gq9 mo30336f() {
        return this.f145624a;
    }

    @Override // p204p.AbstractC2601y5
    /* JADX INFO: renamed from: h */
    public final boolean mo49422h() {
        return true;
    }

    @Override // p204p.AbstractC2601y5
    /* JADX INFO: renamed from: j */
    public final lwe mo30337j(m1s m1sVar) {
        if (m1sVar.f139071i) {
            this.f145625b = true;
            this.f145626c = 0;
        } else if (this.f145625b) {
            this.f145626c++;
        }
        return lwe.m60120a(m1sVar.f139065c);
    }
}
