package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class fca extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68041a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n6q f68042b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fca(n6q n6qVar, int i) {
        super(1);
        this.f68041a = i;
        this.f68042b = n6qVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f68041a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                n6q n6qVar = this.f68042b;
                if (n6qVar != null) {
                    Iterator it = n6qVar.f150937b.iterator();
                    while (it.hasNext()) {
                        ((gh00) it.next()).invoke(bool);
                    }
                }
                break;
            case 1:
                ada adaVar = (ada) obj;
                n6q n6qVar2 = this.f68042b;
                if (n6qVar2 != null) {
                    Iterator it2 = n6qVar2.f150938c.iterator();
                    while (it2.hasNext()) {
                        ((gh00) it2.next()).invoke(adaVar);
                    }
                }
                break;
            default:
                bda bdaVar = (bda) obj;
                n6q n6qVar3 = this.f68042b;
                if (n6qVar3 != null) {
                    Iterator it3 = n6qVar3.f150939d.iterator();
                    while (it3.hasNext()) {
                        ((gh00) it3.next()).invoke(bdaVar);
                    }
                }
                break;
        }
        return w2a1.f247311a;
    }
}
