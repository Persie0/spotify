package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class s5o0 implements yqq {

    /* JADX INFO: renamed from: a */
    public boolean f205868a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m77284a(s5o0 s5o0Var, t5o0 t5o0Var) {
        s5o0Var.getClass();
        if (t5o0Var instanceof s1i0) {
            ((s1i0) t5o0Var).mo34820h(s5o0Var.f205868a);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m77286h(s5o0 s5o0Var, t5o0 t5o0Var, long j) {
        s5o0Var.getClass();
        m77284a(s5o0Var, t5o0Var);
        t5o0Var.mo40646X(y350.m92731d(j, t5o0Var.f217326e), 0.0f, null);
    }

    /* JADX INFO: renamed from: l */
    public static void m77288l(s5o0 s5o0Var, t5o0 t5o0Var, int i, int i2, gh00 gh00Var, int i3) {
        if ((i3 & 8) != 0) {
            int i4 = u5o0.f227076b;
            gh00Var = win0.f251690O0;
        }
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (s5o0Var.mo37626d() == ko70.f124556a || s5o0Var.mo37627e() == 0) {
            m77284a(s5o0Var, t5o0Var);
            t5o0Var.mo40646X(y350.m92731d(j, t5o0Var.f217326e), 0.0f, gh00Var);
        } else {
            m77284a(s5o0Var, t5o0Var);
            t5o0Var.mo40646X(y350.m92731d((((long) ((s5o0Var.mo37627e() - t5o0Var.f217322a) - ((int) (j >> 32)))) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), t5o0Var.f217326e), 0.0f, gh00Var);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m77289m(s5o0 s5o0Var, t5o0 t5o0Var, long j) {
        int i = u5o0.f227076b;
        win0 win0Var = win0.f251690O0;
        if (s5o0Var.mo37626d() == ko70.f124556a || s5o0Var.mo37627e() == 0) {
            m77284a(s5o0Var, t5o0Var);
            t5o0Var.mo40646X(y350.m92731d(j, t5o0Var.f217326e), 0.0f, win0Var);
        } else {
            int iMo37627e = (s5o0Var.mo37627e() - t5o0Var.f217322a) - ((int) (j >> 32));
            m77284a(s5o0Var, t5o0Var);
            t5o0Var.mo40646X(y350.m92731d((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) iMo37627e) << 32), t5o0Var.f217326e), 0.0f, win0Var);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m77290o(s5o0 s5o0Var, t5o0 t5o0Var, long j, rx10 rx10Var) {
        if (s5o0Var.mo37626d() == ko70.f124556a || s5o0Var.mo37627e() == 0) {
            m77284a(s5o0Var, t5o0Var);
            t5o0Var.mo30019b0(y350.m92731d(j, t5o0Var.f217326e), 0.0f, rx10Var);
        } else {
            int iMo37627e = (s5o0Var.mo37627e() - t5o0Var.f217322a) - ((int) (j >> 32));
            m77284a(s5o0Var, t5o0Var);
            t5o0Var.mo30019b0(y350.m92731d((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) iMo37627e) << 32), t5o0Var.f217326e), 0.0f, rx10Var);
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m77291r(s5o0 s5o0Var, t5o0 t5o0Var, int i, int i2, gh00 gh00Var, int i3) {
        if ((i3 & 8) != 0) {
            int i4 = u5o0.f227076b;
            gh00Var = win0.f251690O0;
        }
        s5o0Var.m77295p(t5o0Var, i, i2, 0.0f, gh00Var);
    }

    /* JADX INFO: renamed from: s */
    public static void m77292s(s5o0 s5o0Var, t5o0 t5o0Var, long j) {
        int i = u5o0.f227076b;
        win0 win0Var = win0.f251690O0;
        s5o0Var.getClass();
        m77284a(s5o0Var, t5o0Var);
        t5o0Var.mo40646X(y350.m92731d(j, t5o0Var.f217326e), 0.0f, win0Var);
    }

    /* JADX INFO: renamed from: b */
    public float mo37624b(dux0 dux0Var) {
        return Float.NaN;
    }

    /* JADX INFO: renamed from: c */
    public abstract jo70 mo37625c();

    /* JADX INFO: renamed from: d */
    public abstract ko70 mo37626d();

    /* JADX INFO: renamed from: e */
    public abstract int mo37627e();

    /* JADX INFO: renamed from: f */
    public final void m77293f(t5o0 t5o0Var, int i, int i2, float f) {
        m77284a(this, t5o0Var);
        t5o0Var.mo40646X(y350.m92731d((((long) i2) & 4294967295L) | (((long) i) << 32), t5o0Var.f217326e), f, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m77294i(t5o0 t5o0Var, int i, int i2, float f) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (mo37626d() == ko70.f124556a || mo37627e() == 0) {
            m77284a(this, t5o0Var);
            t5o0Var.mo40646X(y350.m92731d(j, t5o0Var.f217326e), f, null);
        } else {
            int iMo37627e = (mo37627e() - t5o0Var.f217322a) - ((int) (j >> 32));
            m77284a(this, t5o0Var);
            t5o0Var.mo40646X(y350.m92731d((((long) iMo37627e) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), t5o0Var.f217326e), f, null);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m77295p(t5o0 t5o0Var, int i, int i2, float f, gh00 gh00Var) {
        m77284a(this, t5o0Var);
        t5o0Var.mo40646X(y350.m92731d((((long) i2) & 4294967295L) | (((long) i) << 32), t5o0Var.f217326e), f, gh00Var);
    }
}
