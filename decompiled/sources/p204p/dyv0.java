package p204p;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes8.dex */
public final class dyv0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54454a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zv41 f54455b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dyv0(zv41 zv41Var, int i) {
        super(1);
        this.f54454a = i;
        this.f54455b = zv41Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f54454a) {
            case 0:
                z6k0 z6k0Var = (z6k0) obj;
                vxv0 vxv0Var = new vxv0(z6k0Var.f279943a, z6k0Var.f279944b, z6k0Var.f279945c);
                LinkedHashSet linkedHashSetM77308k0 = s601.m77308k0(vxv0Var.f245843a, g6f.m43736n1(vxv0Var.f245844b));
                this.f54455b.m97091m(null, linkedHashSetM77308k0);
                return linkedHashSetM77308k0;
            default:
                return this.f54455b;
        }
    }
}
