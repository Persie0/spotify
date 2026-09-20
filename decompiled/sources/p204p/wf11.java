package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class wf11 {

    /* JADX INFO: renamed from: a */
    public final boolean f250664a;

    /* JADX INFO: renamed from: b */
    public final gh00 f250665b;

    /* JADX INFO: renamed from: c */
    public final boolean f250666c;

    /* JADX INFO: renamed from: d */
    public n05 f250667d;

    /* JADX INFO: renamed from: e */
    public final zu0 f250668e;

    /* JADX INFO: renamed from: f */
    public w9z f250669f;

    /* JADX INFO: renamed from: g */
    public w9z f250670g;

    public /* synthetic */ wf11(eh00 eh00Var, eh00 eh00Var2, gh00 gh00Var) {
        this(true, eh00Var, eh00Var2, yf11.f272100b, gh00Var, false);
    }

    /* JADX INFO: renamed from: a */
    public static Object m87919a(wf11 wf11Var, yf11 yf11Var, w9z w9zVar, fbk fbkVar) {
        Object objM96971b = wf11Var.f250668e.m96971b(yf11Var, xqi0.f265055a, new vf11(wf11Var, ((uum0) wf11Var.f250668e.f286296Y).m84031v(), w9zVar, null), fbkVar);
        return objM96971b == yuk.f276404a ? objM96971b : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: b */
    public final Object m87920b(mb61 mb61Var) {
        Object objM87919a;
        gh00 gh00Var = this.f250665b;
        yf11 yf11Var = yf11.f272100b;
        return (((Boolean) gh00Var.invoke(yf11Var)).booleanValue() && (objM87919a = m87919a(this, yf11Var, this.f250669f, mb61Var)) == yuk.f276404a) ? objM87919a : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: c */
    public final zu0 m87921c() {
        return this.f250668e;
    }

    /* JADX INFO: renamed from: d */
    public final yf11 m87922d() {
        return (yf11) ((yum0) this.f250668e.f286305h).getValue();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m87923e() {
        rgc0 rgc0VarM96982m = this.f250668e.m96982m();
        return rgc0VarM96982m.f198930a.containsKey(yf11.f272100b);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m87924f() {
        rgc0 rgc0VarM96982m = this.f250668e.m96982m();
        return rgc0VarM96982m.f198930a.containsKey(yf11.f272101c);
    }

    /* JADX INFO: renamed from: g */
    public final float m87925g() {
        return ((uum0) this.f250668e.f286295X).m84031v();
    }

    /* JADX INFO: renamed from: h */
    public final Object m87926h(fbk fbkVar) {
        Object objM87919a;
        if (this.f250666c) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
        }
        gh00 gh00Var = this.f250665b;
        yf11 yf11Var = yf11.f272099a;
        return (((Boolean) gh00Var.invoke(yf11Var)).booleanValue() && (objM87919a = m87919a(this, yf11Var, this.f250670g, fbkVar)) == yuk.f276404a) ? objM87919a : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m87927i() {
        return ((yum0) this.f250668e.f286305h).getValue() != yf11.f272099a;
    }

    /* JADX INFO: renamed from: j */
    public final Object m87928j(mb61 mb61Var) {
        Object objM87919a;
        if (this.f250664a) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        gh00 gh00Var = this.f250665b;
        yf11 yf11Var = yf11.f272101c;
        return (((Boolean) gh00Var.invoke(yf11Var)).booleanValue() && (objM87919a = m87919a(this, yf11Var, this.f250670g, mb61Var)) == yuk.f276404a) ? objM87919a : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: k */
    public final Object m87929k(mb61 mb61Var) {
        Object objM87919a;
        yf11 yf11Var = m87924f() ? yf11.f272101c : yf11.f272100b;
        return (((Boolean) this.f250665b.invoke(yf11Var)).booleanValue() && (objM87919a = m87919a(this, yf11Var, this.f250669f, mb61Var)) == yuk.f276404a) ? objM87919a : w2a1.f247311a;
    }

    public wf11(boolean z, eh00 eh00Var, eh00 eh00Var2, yf11 yf11Var, gh00 gh00Var, boolean z2) {
        this.f250664a = z;
        this.f250665b = gh00Var;
        this.f250666c = z2;
        if (z && yf11Var == yf11.f272101c) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        if (z2 && yf11Var == yf11.f272099a) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.");
        }
        this.f250667d = pf11.f176940b;
        this.f250668e = new zu0(yf11Var, new t45(8, eh00Var), eh00Var2, new ew40(this, 23), gh00Var);
        this.f250669f = jg31.m53284w();
        this.f250670g = jg31.m53284w();
    }
}
