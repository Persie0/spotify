package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class gp61 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f83092a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h2w f83093b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gp61(h2w h2wVar, int i) {
        super(1);
        this.f83092a = i;
        this.f83093b = h2wVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f83092a) {
            case 0:
                return new ea20(this.f83093b.f87078a);
            case 1:
                return new nsf(this.f83093b.f87078a, true, 12);
            case 2:
                return Collections.singleton(this.f83093b.f87078a);
            case 3:
                return this.f83093b.f87078a;
            case 4:
                return Collections.singleton(this.f83093b.f87078a);
            case 5:
                return new rsv(this.f83093b.f87078a);
            case 6:
                return new xcf(this.f83093b.f87078a);
            default:
                return this.f83093b.f87078a;
        }
    }
}
