package p204p;

import java.util.UUID;
import java.util.function.BiFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class zfo implements BiFunction {

    /* JADX INFO: renamed from: b */
    public static final zfo f282353b = new zfo(0);

    /* JADX INFO: renamed from: c */
    public static final zfo f282354c = new zfo(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f282355a;

    public /* synthetic */ zfo(int i) {
        this.f282355a = i;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f282355a) {
            case 0:
                pjo pjoVar = (pjo) obj;
                pjo pjoVar2 = (pjo) obj2;
                return (!(pjoVar instanceof ojo) || (pjoVar2 instanceof ojo)) ? pjoVar2 : pjoVar;
            default:
                yi40 yi40Var = (yi40) obj2;
                return yi40Var != null ? new yi40(yi40Var.f273032a, yi40Var.f273033b + 1) : new yi40(UUID.randomUUID(), 0);
        }
    }
}
