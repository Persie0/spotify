package p204p;

import java.util.concurrent.TimeUnit;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes10.dex */
public final class b4z0 implements UnaryOperator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f23436a;

    public b4z0(long j) {
        this.f23436a = j;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        y4l0 y4l0Var = (y4l0) obj;
        y4l0Var.m92815b(this.f23436a, TimeUnit.SECONDS);
        return y4l0Var;
    }
}
