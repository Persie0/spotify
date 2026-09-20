package p204p;

import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: classes3.dex */
public final class x3a implements c5y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f257720a;

    /* JADX INFO: renamed from: b */
    public final Object f257721b;

    public x3a(int i) {
        this.f257720a = i;
        switch (i) {
            case 1:
                this.f257721b = new dh21(35152, 2, "image/png");
                break;
            default:
                this.f257721b = new dh21(16973, 2, "image/bmp");
                break;
        }
    }

    @Override // p204p.c5y
    /* JADX INFO: renamed from: a */
    public final void mo31287a(long j, long j2) {
        switch (this.f257720a) {
            case 0:
                ((dh21) this.f257721b).mo31287a(j, j2);
                break;
            case 1:
                ((dh21) this.f257721b).mo31287a(j, j2);
                break;
        }
    }

    @Override // p204p.c5y
    /* JADX INFO: renamed from: b */
    public final void mo31288b(e5y e5yVar) {
        switch (this.f257720a) {
            case 0:
                ((dh21) this.f257721b).mo31288b(e5yVar);
                break;
            case 1:
                ((dh21) this.f257721b).mo31288b(e5yVar);
                break;
            default:
                ck81 ck81VarMo37837x = e5yVar.mo37837x(0, 3);
                e5yVar.mo37835d(new ra8(-9223372036854775807L));
                e5yVar.mo37836t();
                r300 r300Var = (r300) this.f257721b;
                p300 p300VarM74564a = r300Var.m74564a();
                p300VarM74564a.f173527o = def0.m35799p("text/x-unknown");
                p300VarM74564a.f173523k = r300Var.f195387p;
                t3d1.m80000o(p300VarM74564a, ck81VarMo37837x);
                break;
        }
    }

    @Override // p204p.c5y
    /* JADX INFO: renamed from: c */
    public final int mo31289c(d5y d5yVar, vaq0 vaq0Var) {
        switch (this.f257720a) {
            case 0:
                return ((dh21) this.f257721b).mo31289c(d5yVar, vaq0Var);
            case 1:
                return ((dh21) this.f257721b).mo31289c(d5yVar, vaq0Var);
            default:
                return d5yVar.mo35043s(Alert.DURATION_SHOW_INDEFINITELY) == -1 ? -1 : 0;
        }
    }

    @Override // p204p.c5y
    /* JADX INFO: renamed from: d */
    public final boolean mo31290d(d5y d5yVar) {
        switch (this.f257720a) {
            case 0:
                return ((dh21) this.f257721b).mo31290d(d5yVar);
            case 1:
                return ((dh21) this.f257721b).mo31290d(d5yVar);
            default:
                return true;
        }
    }

    @Override // p204p.c5y
    public final void release() {
        int i = this.f257720a;
    }

    public x3a(r300 r300Var) {
        this.f257720a = 2;
        this.f257721b = r300Var;
    }

    /* JADX INFO: renamed from: f */
    private final void m89781f() {
    }

    /* JADX INFO: renamed from: g */
    private final void m89782g() {
    }

    /* JADX INFO: renamed from: h */
    private final void m89783h() {
    }

    /* JADX INFO: renamed from: i */
    private final void m89784i(long j, long j2) {
    }
}
