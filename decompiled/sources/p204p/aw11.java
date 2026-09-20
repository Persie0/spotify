package p204p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes10.dex */
public final class aw11 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bw11 f20349a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f20350b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f20351c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f20352d;

    public aw11(bw11 bw11Var, String str, boolean z, boolean z2) {
        this.f20349a = bw11Var;
        this.f20350b = str;
        this.f20351c = z;
        this.f20352d = z2;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        this.f20349a.f31499f.onNext(new pqm0(this.f20350b, new i2p0(Boolean.valueOf(this.f20351c), Boolean.valueOf(this.f20352d))));
    }
}
