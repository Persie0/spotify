package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class gz2 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f85812a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dem f85813b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gz2(dem demVar, int i) {
        super(1);
        this.f85812a = i;
        this.f85813b = demVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f85812a) {
            case 0:
                v6w0 v6w0Var = (v6w0) obj;
                return new j5m(this.f85813b.f48123a, v6w0Var.f237980b, v6w0Var.f237979a);
            case 1:
                return new x9j(this.f85813b.f48123a);
            case 2:
                return new wy2(this.f85813b.f48123a);
            case 3:
                return Collections.singleton(this.f85813b.f48123a);
            case 4:
                return new atq0(this.f85813b.f48123a);
            case 5:
                return Collections.singleton(this.f85813b.f48123a);
            default:
                return Collections.singleton(this.f85813b.f48123a);
        }
    }
}
