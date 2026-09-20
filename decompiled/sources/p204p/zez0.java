package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zez0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f282162a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sag0 f282163b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zez0(sag0 sag0Var, int i) {
        super(0);
        this.f282162a = i;
        this.f282163b = sag0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f282162a) {
            case 0:
                return this.f282163b.m77626k(1, 2);
            case 1:
                return this.f282163b.m77626k(2, 1);
            default:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f282163b.f207208b, st91.f213865b, System.currentTimeMillis());
        }
    }
}
