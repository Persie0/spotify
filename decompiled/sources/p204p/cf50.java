package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes5.dex */
public final class cf50 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37271a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ req f37272b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cf50(req reqVar, int i) {
        super(1);
        this.f37271a = i;
        this.f37272b = reqVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f37271a) {
            case 0:
                bkc0 bkc0Var = this.f37272b.f38918c;
                return bkc0Var == null ? lau.f131415a : new dfd0(Collections.singletonList(bkc0Var)).m35881b();
            default:
                bkc0 bkc0Var2 = this.f37272b.f38918c;
                return bkc0Var2 == null ? lau.f131415a : new dfd0(Collections.singletonList(bkc0Var2)).m35882c();
        }
    }
}
