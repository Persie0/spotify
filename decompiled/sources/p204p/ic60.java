package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ic60 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f100744a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kc60 f100745b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f100746c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic60(long j, kc60 kc60Var) {
        super(0);
        this.f100746c = j;
        this.f100745b = kc60Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f100744a) {
            case 0:
                kc60 kc60Var = this.f100745b;
                if (this.f100746c != kc60Var.f121381Y) {
                    return null;
                }
                kc60Var.f121380X = false;
                return kc60.m56012a(kc60Var, kc60.m56013b(kc60Var));
            default:
                long j = this.f100746c;
                kc60 kc60Var2 = this.f100745b;
                kc60Var2.m56016e(new ic60(j, kc60Var2));
                return w2a1.f247311a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic60(kc60 kc60Var, long j) {
        super(0);
        this.f100745b = kc60Var;
        this.f100746c = j;
    }
}
