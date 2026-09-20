package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class akd1 implements Comparable {
    /* JADX INFO: renamed from: a */
    public final int m26213a() {
        return bkd1.m29677a().intValue();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        akd1 akd1Var = (akd1) obj;
        akd1Var.getClass();
        if (m26213a() == akd1Var.m26213a()) {
            return 0;
        }
        return m26213a() > akd1Var.m26213a() ? 1 : -1;
    }
}
