package p196j$.nio.file;

import java.util.function.Consumer;
import p196j$.desugar.sun.nio.p197fs.AbstractC1419g;

/* JADX INFO: renamed from: j$.nio.file.y */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C1502y implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10597a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Consumer f10598b;

    public /* synthetic */ C1502y(Consumer consumer, int i) {
        this.f10597a = i;
        this.f10598b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f10597a) {
            case 0:
                this.f10598b.accept(AbstractC1419g.m23821d(obj));
                break;
            default:
                this.f10598b.accept(AbstractC1419g.m23821d(obj));
                break;
        }
    }
}
