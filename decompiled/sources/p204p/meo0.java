package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final class meo0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f142785a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ neo0 f142786b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z650 f142787c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f142788d;

    public /* synthetic */ meo0(neo0 neo0Var, z650 z650Var, boolean z, int i) {
        this.f142785a = i;
        this.f142786b = neo0Var;
        this.f142787c = z650Var;
        this.f142788d = z;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f142785a) {
            case 0:
                if (((yzv) obj) == yzv.f277903a) {
                    neo0.m64265b(this.f142786b, this.f142787c, this.f142788d);
                }
                break;
            case 1:
                neo0.m64265b(this.f142786b, this.f142787c, this.f142788d);
                break;
            default:
                neo0.m64265b(this.f142786b, this.f142787c, this.f142788d);
                break;
        }
    }
}
