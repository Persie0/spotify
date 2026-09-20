package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class xes extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f260764a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f260765b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f260766c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ List f260767d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ rv41 f260768e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xes(int i, boolean z, String str, List list, rv41 rv41Var) {
        super(1);
        this.f260764a = i;
        this.f260765b = z;
        this.f260766c = str;
        this.f260767d = list;
        this.f260768e = rv41Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        mpz0 mpz0Var = (mpz0) obj;
        mpz0Var.mo62511a(i271.f97762a, new n6f(((n6f) this.f260768e.getValue()).f150873a));
        StringBuilder sb = new StringBuilder("text_section_");
        int i = this.f260764a;
        sb.append(i);
        jpz0.m54011y(mpz0Var, sb.toString());
        jpz0.m53986D(mpz0Var, i);
        if (this.f260765b) {
            jpz0.m54010x(mpz0Var, this.f260766c);
        }
        List list = this.f260767d;
        if (!list.isEmpty()) {
            jpz0.m54002p(mpz0Var, list);
        }
        return w2a1.f247311a;
    }
}
