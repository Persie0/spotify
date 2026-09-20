package p204p;

import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final class klr0 implements Function {

    /* JADX INFO: renamed from: b */
    public static final klr0 f123945b = new klr0(0);

    /* JADX INFO: renamed from: c */
    public static final klr0 f123946c = new klr0(1);

    /* JADX INFO: renamed from: d */
    public static final klr0 f123947d = new klr0(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f123948a;

    public /* synthetic */ klr0(int i) {
        this.f123948a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f123948a) {
            case 0:
                return new llr0((File) obj);
            case 1:
                return new AtomicInteger(0);
            default:
                j9c1 j9c1Var = (j9c1) obj;
                wj50.m88279p(j9c1Var);
                return new p4c1(j9c1Var);
        }
    }
}
