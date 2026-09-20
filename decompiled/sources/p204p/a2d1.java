package p204p;

import com.spotify.mobius.First;
import com.spotify.mobius.Init;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a2d1 implements Init, z591 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11633a;

    public /* synthetic */ a2d1(int i) {
        this.f11633a = i;
    }

    @Override // p204p.z591
    public Object apply(Object obj) {
        switch (this.f11633a) {
            case 2:
                return ((zig1) obj).m79593b();
            default:
                return (byte[]) obj;
        }
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        i1d1 i1d1Var = (i1d1) obj;
        x401 x401Var = new x401();
        if (i1d1Var.f97487d == 0) {
            x401Var.add(new m0d1(i1d1Var.f97485b));
        }
        return First.m15575c(i1d1Var, n0e1.m63425d(x401Var));
    }
}
