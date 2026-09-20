package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class c9w extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35669a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nuh0 f35670b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c9w(nuh0 nuh0Var, int i) {
        super(0);
        this.f35669a = i;
        this.f35670b = nuh0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f35669a) {
            case 0:
                this.f35670b.getClass();
                return true;
            case 1:
                return Boolean.valueOf(!this.f35670b.f158651c);
            case 2:
                return Boolean.valueOf(!(this.f35670b.f158650b.f141141d));
            default:
                m8w m8wVar = this.f35670b.f158650b;
                float f = m8wVar.f141140c;
                boolean z = true;
                if (f > 0.0f && (!m8wVar.f141141d || f < 1.0f)) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
