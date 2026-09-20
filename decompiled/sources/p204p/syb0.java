package p204p;

import androidx.constraintlayout.core.parser.CLParsingException;

/* JADX INFO: loaded from: classes8.dex */
public final class syb0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f215205a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o6j f215206b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z5j f215207c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ z5j f215208d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ syb0(o6j o6jVar, z5j z5jVar, z5j z5jVar2, int i) {
        super(1);
        this.f215205a = i;
        this.f215206b = o6jVar;
        this.f215207c = z5jVar;
        this.f215208d = z5jVar2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) throws CLParsingException {
        int i = this.f215205a;
        w2a1 w2a1Var = w2a1.f247311a;
        z5j z5jVar = this.f215208d;
        z5j z5jVar2 = this.f215207c;
        o6j o6jVar = this.f215206b;
        switch (i) {
            case 0:
                v5j v5jVar = (v5j) obj;
                rbz.m75198p(null, "parent", v5jVar);
                AbstractC1895gf.m44546o(v5jVar.f237517g, l6j.m58343f(o6jVar, new sq70[]{z5jVar2, z5jVar}), 0.0f, 0.0f, 6);
                break;
            case 1:
                v5j v5jVar2 = (v5j) obj;
                rbz.m75198p(null, "parent", v5jVar2);
                AbstractC1895gf.m44546o(v5jVar2.f237517g, l6j.m58343f(o6jVar, new sq70[]{z5jVar2, z5jVar}), 0.0f, 0.0f, 6);
                break;
            case 2:
                bjc bjcVar = ((v5j) obj).f237517g;
                sq70[] sq70VarArr = {z5jVar2, z5jVar};
                float f = 0;
                tq70 tq70Var = new tq70(Integer.valueOf(o6jVar.m58348e()));
                ova ovaVar = new ova(new char[0]);
                for (int i2 = 0; i2 < 2; i2++) {
                    ovaVar.m71126m(wva.m89079m(sq70VarArr[i2].mo78940a().toString()));
                }
                uva uvaVarM58345b = o6jVar.m58345b(tq70Var);
                uvaVarM58345b.m71124J("type", "barrier");
                uvaVarM58345b.m71124J("direction", "bottom");
                uvaVarM58345b.m71123I("margin", f);
                uvaVarM58345b.m71122H("contains", ovaVar);
                o6jVar.m58350h(15);
                for (int i3 = 0; i3 < 2; i3++) {
                    o6jVar.m58350h(sq70VarArr[i3].hashCode());
                }
                o6jVar.m58350h(Float.hashCode(f));
                AbstractC1895gf.m44546o(bjcVar, new j6j(tq70Var.f213033a, 0, tq70Var), 0.0f, 0.0f, 6);
                break;
            default:
                v5j v5jVar3 = (v5j) obj;
                v5jVar3.m84728h(new vjr(null, "parent"));
                v5jVar3.m84727g(new vjr(null, "spread"));
                AbstractC1895gf.m44546o(v5jVar3.f237515e, l6j.m58343f(o6jVar, new sq70[]{z5jVar2, z5jVar}), 0.0f, 0.0f, 6);
                AbstractC1895gf.m44546o(v5jVar3.f237517g, v5jVar3.f237513c.f279582g, 0.0f, 0.0f, 6);
                break;
        }
        return w2a1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syb0(o6j o6jVar, z5j z5jVar, z5j z5jVar2, z5j z5jVar3) {
        super(1);
        this.f215205a = 0;
        this.f215206b = o6jVar;
        this.f215207c = z5jVar;
        this.f215208d = z5jVar3;
    }
}
