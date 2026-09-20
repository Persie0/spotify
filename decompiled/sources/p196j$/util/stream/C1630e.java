package p196j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: renamed from: j$.util.stream.e */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1630e implements Collector {

    /* JADX INFO: renamed from: a */
    public final C1626a f10903a;

    /* JADX INFO: renamed from: b */
    public final C1627b f10904b;

    /* JADX INFO: renamed from: c */
    public final C1628c f10905c;

    /* JADX INFO: renamed from: d */
    public final C1629d f10906d;

    /* JADX INFO: renamed from: e */
    public final Set f10907e;

    public C1630e(C1626a c1626a, C1627b c1627b, C1628c c1628c, C1629d c1629d, Set set) {
        this.f10903a = c1626a;
        this.f10904b = c1627b;
        this.f10905c = c1628c;
        this.f10906d = c1629d;
        this.f10907e = set;
    }

    @Override // java.util.stream.Collector
    public final BiConsumer accumulator() {
        return this.f10904b;
    }

    @Override // java.util.stream.Collector
    public final Set characteristics() {
        return this.f10907e;
    }

    @Override // java.util.stream.Collector
    public final BinaryOperator combiner() {
        return this.f10905c;
    }

    @Override // java.util.stream.Collector
    public final Function finisher() {
        return this.f10906d;
    }

    @Override // java.util.stream.Collector
    public final Supplier supplier() {
        return this.f10903a;
    }
}
