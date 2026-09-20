package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m9q implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f141357a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z9q f141358b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jx31 f141359c;

    public /* synthetic */ m9q(z9q z9qVar, jx31 jx31Var, int i) {
        this.f141357a = i;
        this.f141358b = z9qVar;
        this.f141359c = jx31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f141357a) {
            case 0:
                this.f141358b.m95710a(this.f141359c);
                break;
            case 1:
                z9q z9qVar = this.f141358b;
                ArrayList arrayList = z9qVar.f280851b;
                jx31 jx31Var = this.f141359c;
                if (arrayList.contains(jx31Var)) {
                    dq60.m36601a(jx31Var.f116780a, jx31Var.f116782c.f98706h1, z9qVar.f280850a);
                }
                break;
            default:
                z9q z9qVar2 = this.f141358b;
                ArrayList arrayList2 = z9qVar2.f280851b;
                jx31 jx31Var2 = this.f141359c;
                arrayList2.remove(jx31Var2);
                z9qVar2.f280852c.remove(jx31Var2);
                break;
        }
    }
}
