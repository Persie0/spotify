package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class hd11 {
    /* JADX INFO: renamed from: a */
    public static vbn0 m47144a(ed11 ed11Var) {
        cb11 cb11Var = (cb11) ed11Var.f58423c.getValue();
        if (cb11Var == null) {
            throw new IllegalArgumentException("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
        }
        cb11 cb11Var2 = cb11Var.f35967X;
        ed11 ed11VarM32132l = cb11Var2 != null ? cb11Var2.m32132l() : null;
        if (ed11VarM32132l == null) {
            return null;
        }
        cb11 cb11Var3 = (cb11) ed11VarM32132l.f58423c.getValue();
        if (cb11Var3 != null) {
            return cb11Var3.f35979t;
        }
        throw new IllegalArgumentException("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
    }
}
