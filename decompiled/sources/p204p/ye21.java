package p204p;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class ye21 implements fyb1 {

    /* JADX INFO: renamed from: a */
    public final vxb1 f271908a;

    public ye21(vxb1 vxb1Var) {
        this.f271908a = vxb1Var;
    }

    @Override // p204p.fyb1
    /* JADX INFO: renamed from: a */
    public final hyb1 mo43063a(Context context, p7f p7fVar, wra wraVar, gyb1 gyb1Var, Executor executor, long j, boolean z) {
        return new ze21(context, executor, wraVar, p7fVar, this.f271908a, gyb1Var, z);
    }
}
