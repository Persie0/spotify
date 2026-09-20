package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class iq31 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f104625a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jq31 f104626b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iq31(jq31 jq31Var, int i) {
        super(0);
        this.f104625a = i;
        this.f104626b = jq31Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f104625a) {
            case 0:
                jq31 jq31Var = this.f104626b;
                String strMo48710e = jq31Var.f114781a.mo48710e(jq31.f114779e, null);
                if (strMo48710e != null) {
                    return jq31.m54030a(jq31Var, strMo48710e);
                }
                return null;
            default:
                jq31 jq31Var2 = this.f104626b;
                String strMo48710e2 = jq31Var2.f114781a.mo48710e(jq31.f114778d, null);
                if (strMo48710e2 != null) {
                    return jq31.m54030a(jq31Var2, strMo48710e2);
                }
                return null;
        }
    }
}
