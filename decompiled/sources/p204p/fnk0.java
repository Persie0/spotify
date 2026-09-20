package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class fnk0 implements u0x0, bji {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ v0x0 f71315a;

    /* JADX INFO: renamed from: b */
    public final maw0 f71316b;

    /* JADX INFO: renamed from: c */
    public final wg61 f71317c = new wg61(new wjk0(this, 23));

    public fnk0(pc5 pc5Var, b9a b9aVar, y6q0 y6q0Var, maw0 maw0Var, C2529wd c2529wd) {
        this.f71315a = new v0x0(pth0.f181156a, c2529wd, new n250(b9aVar, pc5Var, y6q0Var, 0), new w0x0(jaw0.f110565b));
        this.f71316b = maw0Var;
    }

    @Override // p204p.u0x0
    /* JADX INFO: renamed from: a */
    public final Single mo30982a() {
        return this.f71315a.mo30982a();
    }

    @Override // p204p.u0x0
    /* JADX INFO: renamed from: b */
    public final tco0 mo30983b() {
        return this.f71315a.f236160f;
    }

    @Override // p204p.u0x0
    /* JADX INFO: renamed from: c */
    public final lb6 mo30984c(String str, String str2) {
        return this.f71315a.mo30984c(str, str2);
    }

    @Override // p204p.u0x0
    public final void clear() {
        this.f71315a.clear();
    }

    @Override // p204p.u0x0
    /* JADX INFO: renamed from: d */
    public final void mo30985d() {
        this.f71315a.mo30985d();
    }

    @Override // p204p.bji
    /* JADX INFO: renamed from: e */
    public final iys0 mo29483e(sys0 sys0Var) {
        return this.f71315a.mo29483e(sys0Var);
    }

    @Override // p204p.u0x0
    /* JADX INFO: renamed from: f */
    public final Single mo30986f(byte[] bArr, byte[] bArr2) {
        return this.f71315a.mo30986f(bArr, bArr2);
    }

    /* JADX INFO: renamed from: g */
    public final Observable m42227g() {
        return (Observable) this.f71317c.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m42228h(String str) {
        v0x0 v0x0Var = this.f71315a;
        vj50 vj50Var = v0x0Var.f236158d;
        if (vj50Var instanceof x0x0) {
            return false;
        }
        if (!(vj50Var instanceof w0x0)) {
            throw new NoWhenBranchMatchedException();
        }
        boolean zContains = v0x0Var.f236163i.contains(str);
        if (!zContains) {
            utu0 utu0Var = gk71.f80747a;
            utu0Var.m83940H("RCS");
            utu0Var.m83937E("Ignoring the mid session updates for the property " + str + " due to mix and match of the observable and non observable properties in EP. Treating it as a non-observable property to ensure consistency", new Object[0]);
        }
        return zContains;
    }
}
