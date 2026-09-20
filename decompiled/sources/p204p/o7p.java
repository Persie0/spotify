package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final class o7p implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f162595a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ l7i f162596b;

    public o7p(String str, String str2, l7i l7iVar) {
        this.f162596b = l7iVar;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f162595a) {
            case 0:
                this.f162596b.invoke(Boolean.FALSE);
                ((Throwable) obj).getMessage();
                break;
            default:
                n050 n050Var = (n050) obj;
                int i = n050Var.f148894a;
                l7i l7iVar = this.f162596b;
                if (i >= 100) {
                    n050Var.toString();
                    l7iVar.invoke(Boolean.FALSE);
                } else if (n050Var == n050.PAIRING) {
                    l7iVar.invoke(Boolean.TRUE);
                }
                break;
        }
    }

    public o7p(l7i l7iVar, String str, String str2) {
        this.f162596b = l7iVar;
    }
}
