package p204p;

import com.spotify.mobius.runners.WorkRunner;

/* JADX INFO: loaded from: classes6.dex */
public final class igl extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f102004a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mgl f102005b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ igl(mgl mglVar, int i) {
        super(0);
        this.f102004a = i;
        this.f102005b = mglVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f102004a) {
            case 0:
                return (WorkRunner) this.f102005b.f143592x.get();
            default:
                return (WorkRunner) this.f102005b.f143593y.get();
        }
    }
}
