package p204p;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class oci0 implements fyb1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f163931a;

    /* JADX INFO: renamed from: b */
    public final vxb1 f163932b;

    public oci0(vxb1 vxb1Var) {
        this.f163931a = 0;
        this.f163932b = vxb1Var;
    }

    @Override // p204p.fyb1
    /* JADX INFO: renamed from: a */
    public final hyb1 mo43063a(Context context, p7f p7fVar, wra wraVar, gyb1 gyb1Var, Executor executor, long j, boolean z) {
        switch (this.f163931a) {
            case 0:
                return new pci0(context, executor, wraVar, p7fVar, this.f163932b, gyb1Var, z);
            default:
                try {
                    return ((fyb1) ye21.class.getConstructor(vxb1.class).newInstance((d6p0) this.f163932b)).mo43063a(context, p7fVar, wraVar, gyb1Var, executor, j, z);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }

    public oci0() {
        this.f163931a = 1;
        this.f163932b = new d6p0();
    }
}
