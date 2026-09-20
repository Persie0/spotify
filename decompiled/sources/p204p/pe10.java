package p204p;

/* JADX INFO: loaded from: classes3.dex */
public interface pe10 extends qe10 {
    @Override // p204p.qe10
    /* JADX INFO: renamed from: a */
    default Object mo47026a(Object obj, th00 th00Var) {
        return th00Var.invoke(obj, this);
    }

    @Override // p204p.qe10
    /* JADX INFO: renamed from: b */
    default boolean mo47027b(gh00 gh00Var) {
        return ((Boolean) gh00Var.invoke(this)).booleanValue();
    }

    @Override // p204p.qe10
    /* JADX INFO: renamed from: c */
    default boolean mo47028c() {
        return Boolean.TRUE.booleanValue();
    }
}
