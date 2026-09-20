package p204p;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class m011 {

    /* JADX INFO: renamed from: a */
    public final luk f138484a;

    /* JADX INFO: renamed from: b */
    public final hb11 f138485b = j0g1.m52092t(0, 0, 0, 7);

    public m011(luk lukVar) {
        this.f138484a = lukVar;
    }

    /* JADX INFO: renamed from: a */
    public final Object m60397a(jr01 jr01Var, fbk fbkVar) {
        Object objEmit = this.f138485b.emit(jr01Var, fbkVar);
        return objEmit == yuk.f276404a ? objEmit : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: b */
    public final fiz m60398b(k011... k011VarArr) {
        ArrayList arrayList = new ArrayList(k011VarArr.length);
        for (k011 k011Var : k011VarArr) {
            arrayList.add(new hs01(new s5u(this.f138485b, k011Var.f117836a, 16), k011Var, 2));
        }
        fiz[] fizVarArr = (fiz[]) arrayList.toArray(new fiz[0]);
        return cyf1.m34374j(xtm0.m92105z((fiz[]) Arrays.copyOf(fizVarArr, fizVarArr.length)), this.f138484a);
    }
}
