package p204p;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f330 {

    /* JADX INFO: renamed from: a */
    public final String f65341a;

    /* JADX INFO: renamed from: b */
    public final Object f65342b;

    /* JADX INFO: renamed from: c */
    public final Object f65343c;

    public f330(String str) {
        this.f65341a = str;
        pqm0 pqm0Var = new pqm0(Float.valueOf(0.95f), z230.f278470e);
        Float fValueOf = Float.valueOf(0.5f);
        this.f65342b = kkc0.m56695h0(pqm0Var, new pqm0(fValueOf, a330.f11843e), new pqm0(Float.valueOf(0.01f), c330.f33536e));
        this.f65343c = kkc0.m56695h0(new pqm0(fValueOf, b330.f22877e), new pqm0(Float.valueOf(0.05f), d330.f44756e));
    }
}
