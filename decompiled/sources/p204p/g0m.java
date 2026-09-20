package p204p;

import java.util.concurrent.TimeUnit;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public final class g0m implements UnaryOperator {

    /* JADX INFO: renamed from: a */
    public static final g0m f75394a = new g0m();

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        y4l0 y4l0Var = (y4l0) obj;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        y4l0Var.m92815b(30L, timeUnit);
        y4l0Var.m92817d(30L, timeUnit);
        return y4l0Var;
    }
}
