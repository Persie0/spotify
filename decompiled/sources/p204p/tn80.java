package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class tn80 {

    /* JADX INFO: renamed from: a */
    public final Object f221904a;

    /* JADX INFO: renamed from: b */
    public final Object f221905b;

    /* JADX INFO: renamed from: c */
    public final Object f221906c;

    public tn80(Object obj, Object obj2, Object obj3) {
        this.f221904a = obj;
        this.f221905b = obj2;
        this.f221906c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m81161a() {
        return this.f221906c != t6x0.f217624Q0;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m81162b() {
        return this.f221905b != t6x0.f217624Q0;
    }

    /* JADX INFO: renamed from: c */
    public final Object m81163c() {
        return this.f221906c;
    }

    /* JADX INFO: renamed from: d */
    public final Object m81164d() {
        return this.f221905b;
    }

    /* JADX INFO: renamed from: e */
    public final Object m81165e() {
        return this.f221904a;
    }

    /* JADX INFO: renamed from: f */
    public final tn80 m81166f(Object obj) {
        return new tn80(this.f221904a, this.f221905b, obj);
    }

    /* JADX INFO: renamed from: g */
    public final tn80 m81167g(Object obj) {
        return new tn80(this.f221904a, obj, this.f221906c);
    }

    /* JADX INFO: renamed from: h */
    public final tn80 m81168h(Object obj) {
        return new tn80(obj, this.f221905b, this.f221906c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public tn80(Object obj) {
        t6x0 t6x0Var = t6x0.f217624Q0;
        this(obj, t6x0Var, t6x0Var);
    }

    public tn80(Object obj, Object obj2) {
        this(obj, obj2, t6x0.f217624Q0);
    }
}
