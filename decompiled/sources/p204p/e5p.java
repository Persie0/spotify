package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class e5p implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56439a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f56440b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ j5p f56441c;

    public e5p(j5p j5pVar, gh00 gh00Var) {
        this.f56439a = 4;
        this.f56441c = j5pVar;
        this.f56440b = gh00Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f56439a) {
            case 0:
                d7i d7iVar = this.f56441c.f109050a1;
                if (d7iVar == null) {
                    wj50.m88260d0("model");
                    throw null;
                }
                this.f56440b.invoke(new y6i(d7iVar.f46209j));
                return;
            case 1:
                d7i d7iVar2 = this.f56441c.f109050a1;
                if (d7iVar2 == null) {
                    wj50.m88260d0("model");
                    throw null;
                }
                this.f56440b.invoke(new y6i(d7iVar2.f46209j));
                return;
            case 2:
                d7i d7iVar3 = this.f56441c.f109050a1;
                if (d7iVar3 == null) {
                    wj50.m88260d0("model");
                    throw null;
                }
                String str = d7iVar3.f46200a;
                if (d7iVar3 == null) {
                    wj50.m88260d0("model");
                    throw null;
                }
                this.f56440b.invoke(new x6i(str, d7iVar3.f46213n));
                return;
            case 3:
                d7i d7iVar4 = this.f56441c.f109050a1;
                if (d7iVar4 == null) {
                    wj50.m88260d0("model");
                    throw null;
                }
                String str2 = d7iVar4.f46200a;
                if (d7iVar4 == null) {
                    wj50.m88260d0("model");
                    throw null;
                }
                this.f56440b.invoke(new x6i(str2, d7iVar4.f46213n));
                return;
            default:
                j5p j5pVar = this.f56441c;
                d7i d7iVar5 = j5pVar.f109050a1;
                if (d7iVar5 == null) {
                    wj50.m88260d0("model");
                    throw null;
                }
                es5 es5VarM52463b = j5pVar.m52463b(d7iVar5);
                if (es5VarM52463b != null) {
                    this.f56440b.invoke(new s6i(es5VarM52463b.f62292c));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ e5p(gh00 gh00Var, j5p j5pVar, int i) {
        this.f56439a = i;
        this.f56440b = gh00Var;
        this.f56441c = j5pVar;
    }
}
