package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class v5j {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ qr60[] f237510k;

    /* JADX INFO: renamed from: a */
    public final Object f237511a;

    /* JADX INFO: renamed from: b */
    public final uva f237512b;

    /* JADX INFO: renamed from: d */
    public final t7j f237514d;

    /* JADX INFO: renamed from: e */
    public final bjc f237515e;

    /* JADX INFO: renamed from: f */
    public final t7j f237516f;

    /* JADX INFO: renamed from: g */
    public final bjc f237517g;

    /* JADX INFO: renamed from: c */
    public final z5j f237513c = new z5j("parent");

    /* JADX INFO: renamed from: h */
    public final u5j f237518h = new u5j(this, mc40.m61444g());

    /* JADX INFO: renamed from: i */
    public final u5j f237519i = new u5j(this, mc40.m61444g());

    /* JADX INFO: renamed from: j */
    public final u5j f237520j = new u5j(this);

    static {
        spi0 spi0Var = new spi0(v5j.class, "width", "getWidth()Landroidx/constraintlayout/compose/Dimension;", 0);
        jqv0 jqv0Var = qpv0.f191387a;
        f237510k = new qr60[]{jqv0Var.mo54116f(spi0Var), jqv0Var.mo54116f(new spi0(v5j.class, "height", "getHeight()Landroidx/constraintlayout/compose/Dimension;", 0)), jqv0Var.mo54116f(new spi0(v5j.class, "visibility", "getVisibility()Landroidx/constraintlayout/compose/Visibility;", 0)), jqv0Var.mo54116f(new spi0(v5j.class, "scaleX", "getScaleX()F", 0)), jqv0Var.mo54116f(new spi0(v5j.class, "scaleY", "getScaleY()F", 0)), jqv0Var.mo54116f(new spi0(v5j.class, "rotationX", "getRotationX()F", 0)), jqv0Var.mo54116f(new spi0(v5j.class, "rotationY", "getRotationY()F", 0)), jqv0Var.mo54116f(new spi0(v5j.class, "rotationZ", "getRotationZ()F", 0)), jqv0Var.mo54116f(new spi0(v5j.class, "translationX", "getTranslationX-D9Ej5fM()F", 0)), jqv0Var.mo54116f(new spi0(v5j.class, "translationY", "getTranslationY-D9Ej5fM()F", 0)), jqv0Var.mo54116f(new spi0(v5j.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0)), jqv0Var.mo54116f(new spi0(v5j.class, "pivotX", "getPivotX()F", 0)), jqv0Var.mo54116f(new spi0(v5j.class, "pivotY", "getPivotY()F", 0)), jqv0Var.mo54116f(new spi0(v5j.class, "horizontalChainWeight", "getHorizontalChainWeight()F", 0)), jqv0Var.mo54116f(new spi0(v5j.class, "verticalChainWeight", "getVerticalChainWeight()F", 0))};
    }

    public v5j(Object obj, uva uvaVar) {
        this.f237511a = obj;
        this.f237512b = uvaVar;
        this.f237514d = new t7j(-2, uvaVar);
        this.f237515e = new bjc(0, uvaVar);
        this.f237516f = new t7j(-1, uvaVar);
        this.f237517g = new bjc(1, uvaVar);
    }

    /* JADX INFO: renamed from: a */
    public static void m84721a(v5j v5jVar, z5j z5jVar) {
        v5jVar.getClass();
        m84724e(v5jVar, z5jVar.f279579d, z5jVar.f279581f, 0.0f, 0.0f, 0.5f, 60);
    }

    /* JADX INFO: renamed from: c */
    public static void m84722c(v5j v5jVar, z5j z5jVar) {
        v5jVar.getClass();
        m84723d(v5jVar, z5jVar.f279580e, z5jVar.f279582g, 0.0f, 0.5f, 60);
    }

    /* JADX INFO: renamed from: d */
    public static void m84723d(v5j v5jVar, j6j j6jVar, j6j j6jVar2, float f, float f2, int i) {
        if ((i & 4) != 0) {
            f = 0;
        }
        float f3 = 0;
        float f4 = 0;
        float f5 = 0;
        if ((i & 64) != 0) {
            f2 = 0.5f;
        }
        v5jVar.f237515e.m44558n(j6jVar, f, f4);
        v5jVar.f237517g.m44558n(j6jVar2, f3, f5);
        v5jVar.f237512b.m71123I("vBias", f2);
    }

    /* JADX INFO: renamed from: e */
    public static void m84724e(v5j v5jVar, k6j k6jVar, k6j k6jVar2, float f, float f2, float f3, int i) {
        if ((i & 4) != 0) {
            f = 0;
        }
        if ((i & 8) != 0) {
            f2 = 0;
        }
        float f4 = 0;
        float f5 = 0;
        if ((i & 64) != 0) {
            f3 = 0.5f;
        }
        v5jVar.f237514d.m80232i(k6jVar, f, f4);
        v5jVar.f237516f.m80232i(k6jVar2, f2, f5);
        v5jVar.f237512b.m71123I("hRtlBias", f3);
    }

    /* JADX INFO: renamed from: f */
    public static void m84725f(v5j v5jVar, k6j k6jVar, j6j j6jVar, k6j k6jVar2, j6j j6jVar2) {
        v5jVar.f237514d.m80232i(k6jVar, 0, 0);
        v5jVar.f237516f.m80232i(k6jVar2, 0, 0);
        uva uvaVar = v5jVar.f237512b;
        uvaVar.m71123I("hRtlBias", 0.5f);
        v5jVar.f237515e.m44558n(j6jVar, 0, 0);
        v5jVar.f237517g.m44558n(j6jVar2, 0, 0);
        uvaVar.m71123I("vBias", 0.5f);
    }

    /* JADX INFO: renamed from: b */
    public final void m84726b(z5j z5jVar) {
        m84725f(this, z5jVar.f279579d, z5jVar.f279580e, z5jVar.f279581f, z5jVar.f279582g);
    }

    /* JADX INFO: renamed from: g */
    public final void m84727g(vjr vjrVar) {
        this.f237519i.m39516c(f237510k[1], this, vjrVar);
    }

    /* JADX INFO: renamed from: h */
    public final void m84728h(vjr vjrVar) {
        this.f237518h.m39516c(f237510k[0], this, vjrVar);
    }
}
