package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes11.dex */
public final class bfb1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f26656a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1790du f26657b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bfb1(C1790du c1790du, int i) {
        super(0);
        this.f26656a = i;
        this.f26657b = c1790du;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f26656a) {
            case 0:
                C1790du c1790du = this.f26657b;
                Uri uriM38597c = ((edi0) ((fke) ((h4t0) c1790du.f52927e).get())).m38597c();
                return uriM38597c == null ? Uri.parse((String) ((wg61) c1790du.f52924b).getValue()) : uriM38597c;
            default:
                return edb.m38564m("https://play.google.com/store/apps/details?id=", ((edi0) ((fke) ((h4t0) this.f26657b.f52927e).get())).f58523a);
        }
    }
}
