package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class eu50 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62873a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f62874b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ esq f62875c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eu50(ArrayList arrayList, esq esqVar, int i) {
        super(1);
        this.f62873a = i;
        this.f62874b = arrayList;
        this.f62875c = esqVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f62873a) {
            case 0:
                th00 th00Var = (th00) obj;
                ArrayList<swp0> arrayList = this.f62874b;
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                for (swp0 swp0Var : arrayList) {
                    arrayList2.add((wt50) th00Var.invoke(swp0Var, new du50(swp0Var, this.f62875c, 0)));
                }
                return arrayList2;
            default:
                th00 th00Var2 = (th00) obj;
                ArrayList<swp0> arrayList3 = this.f62874b;
                ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList3, 10));
                for (swp0 swp0Var2 : arrayList3) {
                    arrayList4.add((wt50) th00Var2.invoke(swp0Var2, new du50(swp0Var2, this.f62875c, 1)));
                }
                return arrayList4;
        }
    }
}
