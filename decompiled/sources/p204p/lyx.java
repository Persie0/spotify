package p204p;

import java.util.Collections;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class lyx implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f138127a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ myx f138128b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f138129c;

    public lyx(boolean z, myx myxVar, String str) {
        this.f138127a = z;
        this.f138128b = myxVar;
        this.f138129c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        eag0 eag0Var = this.f138128b.f148555h;
        boolean z = this.f138127a;
        String str = this.f138129c;
        if (z) {
            eag0Var.getClass();
            dv91 dv91Var = new dv91("hit", 1);
            string = str != null ? str.toString() : null;
            return new av91("", "", dv91Var, new bv91("like", 1, Collections.singletonMap("item_to_be_liked", string != null ? string : "")), eag0Var.f57667c, eag0Var.f57666b, System.currentTimeMillis());
        }
        eag0Var.getClass();
        dv91 dv91Var2 = new dv91("hit", 1);
        string = str != null ? str.toString() : null;
        return new av91("", "", dv91Var2, new bv91("remove_like", 1, Collections.singletonMap("item_no_longer_liked", string != null ? string : "")), eag0Var.f57667c, eag0Var.f57666b, System.currentTimeMillis());
    }
}
