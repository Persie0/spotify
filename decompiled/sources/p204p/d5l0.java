package p204p;

import android.content.Intent;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class d5l0 implements if11, fz61, z591 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ d5l0 f45462b = new d5l0(8);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45463a;

    public /* synthetic */ d5l0(int i) {
        this.f45463a = i;
    }

    /* JADX INFO: renamed from: b */
    public static final nuf m35003b(Intent intent) {
        Serializable serializableExtra = intent.getSerializableExtra("queryCompletionSource");
        nuf nufVar = serializableExtra instanceof nuf ? (nuf) serializableExtra : null;
        return (nufVar == null ? -1 : myy0.f148560a[nufVar.ordinal()]) == -1 ? nuf.f158634c : nufVar;
    }

    @Override // p204p.if11
    /* JADX INFO: renamed from: a */
    public fiz mo33756a(du51 du51Var) {
        return new xjz0(du51Var, 11);
    }

    @Override // p204p.z591
    public /* synthetic */ Object apply(Object obj) {
        return ((r9h1) obj).m75076b();
    }

    public String toString() {
        switch (this.f45463a) {
            case 4:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    @Override // p204p.fz61
    /* JADX INFO: renamed from: w */
    public Object mo24968w(bz61 bz61Var) {
        dce dceVar = dce.NANO_OF_DAY;
        if (bz61Var.mo26516d(dceVar)) {
            return dfa0.m35864r6(bz61Var.mo26517g(dceVar));
        }
        return null;
    }
}
