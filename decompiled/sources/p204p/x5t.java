package p204p;

import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class x5t implements yf0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f258513a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ p5t f258514b;

    public /* synthetic */ x5t(p5t p5tVar, int i) {
        this.f258513a = i;
        this.f258514b = p5tVar;
    }

    @Override // p204p.yf0
    /* JADX INFO: renamed from: a */
    public final void mo25836a(Object obj) {
        switch (this.f258513a) {
            case 0:
                j670 j670Var = (j670) obj;
                boolean z = j670Var instanceof i670;
                p5t p5tVar = this.f258514b;
                if (z) {
                    p5tVar.accept(new f5t(((i670) j670Var).f99114a));
                    return;
                }
                if (j670Var instanceof h670) {
                    h670 h670Var = (h670) j670Var;
                    p5tVar.accept(new e5t(new aa8(h670Var.f88022a, h670Var.f88023b)));
                    return;
                } else if (j670Var instanceof g670) {
                    p5tVar.accept(c5t.f34277a);
                    return;
                } else {
                    if (!j670Var.equals(f670.f66306a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            case 1:
                Boolean bool = (Boolean) ((Map) obj).get("android.permission.CAMERA");
                if (bool != null) {
                    this.f258514b.accept(new r4t(bool.booleanValue()));
                    return;
                }
                return;
            default:
                fzn0 fzn0Var = (fzn0) obj;
                boolean z2 = fzn0Var instanceof ezn0;
                p5t p5tVar2 = this.f258514b;
                if (z2) {
                    p5tVar2.accept(new d5t(((ezn0) fzn0Var).f64421a.toString()));
                    return;
                } else if (fzn0Var instanceof dzn0) {
                    p5tVar2.accept(c5t.f34277a);
                    return;
                } else {
                    if (!(fzn0Var instanceof czn0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
        }
    }
}
