package p204p;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes7.dex */
public final class cu80 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42075a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gwo0 f42076b;

    public /* synthetic */ cu80(gwo0 gwo0Var, int i) {
        this.f42075a = i;
        this.f42076b = gwo0Var;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f42075a) {
            case 0:
                ((c1p0) ((a1p0) obj)).m31272f("ListEndpointImpl.play", this.f42076b, hff0.f90728a, null);
                break;
            default:
                gwo0 gwo0Var = this.f42076b;
                c1p0 c1p0Var = (c1p0) ((a1p0) obj);
                if (c1p0Var.f33172c) {
                    if (!c1p0Var.f33171b.m83401c()) {
                        c1p0Var.m31269b();
                    } else {
                        c1p0.m31268c(c1p0Var, "cancelled", gwo0Var, null, null, 12);
                    }
                    break;
                }
                break;
        }
    }
}
