package p204p;

import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.exoplayer.ExoPlaybackException;

/* JADX INFO: loaded from: classes3.dex */
public final class vpp implements oad0 {

    /* JADX INFO: renamed from: a */
    public boolean f243737a;

    /* JADX INFO: renamed from: b */
    public boolean f243738b;

    /* JADX INFO: renamed from: c */
    public Object f243739c;

    /* JADX INFO: renamed from: d */
    public Object f243740d;

    /* JADX INFO: renamed from: e */
    public Object f243741e;

    /* JADX INFO: renamed from: f */
    public Object f243742f;

    /* JADX INFO: renamed from: a */
    public nsn0 m86166a() {
        nsn0 nsn0Var = new nsn0();
        nsn0Var.f157848a = (CharSequence) this.f243739c;
        nsn0Var.f157849b = (IconCompat) this.f243740d;
        nsn0Var.f157850c = (String) this.f243741e;
        nsn0Var.f157851d = (String) this.f243742f;
        nsn0Var.f157852e = this.f243737a;
        nsn0Var.f157853f = this.f243738b;
        return nsn0Var;
    }

    /* JADX INFO: renamed from: b */
    public void m86167b(o09 o09Var) {
        if (o09Var == ((o09) this.f243741e)) {
            this.f243742f = null;
            this.f243741e = null;
            this.f243737a = true;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m86168c(o09 o09Var) {
        oad0 oad0Var;
        oad0 oad0VarMo39148h = o09Var.mo39148h();
        if (oad0VarMo39148h == null || oad0VarMo39148h == (oad0Var = (oad0) this.f243742f)) {
            return;
        }
        if (oad0Var != null) {
            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f243742f = oad0VarMo39148h;
        this.f243741e = o09Var;
        oad0VarMo39148h.mo41695l(((fi41) this.f243739c).f69780e);
    }

    /* JADX INFO: renamed from: d */
    public void m86169d(boolean z) {
        this.f243737a = z;
    }

    /* JADX INFO: renamed from: e */
    public void m86170e(IconCompat iconCompat) {
        this.f243740d = iconCompat;
    }

    /* JADX INFO: renamed from: f */
    public void m86171f(boolean z) {
        this.f243738b = z;
    }

    /* JADX INFO: renamed from: g */
    public void m86172g(String str) {
        this.f243742f = str;
    }

    /* JADX INFO: renamed from: h */
    public void m86173h(CharSequence charSequence) {
        this.f243739c = charSequence;
    }

    /* JADX INFO: renamed from: i */
    public void m86174i(String str) {
        this.f243741e = str;
    }

    @Override // p204p.oad0
    /* JADX INFO: renamed from: j */
    public h1p0 mo41694j() {
        oad0 oad0Var = (oad0) this.f243742f;
        return oad0Var != null ? oad0Var.mo41694j() : ((fi41) this.f243739c).f69780e;
    }

    @Override // p204p.oad0
    /* JADX INFO: renamed from: l */
    public void mo41695l(h1p0 h1p0Var) {
        oad0 oad0Var = (oad0) this.f243742f;
        if (oad0Var != null) {
            oad0Var.mo41695l(h1p0Var);
            h1p0Var = ((oad0) this.f243742f).mo41694j();
        }
        ((fi41) this.f243739c).mo41695l(h1p0Var);
    }

    @Override // p204p.oad0
    /* JADX INFO: renamed from: m */
    public boolean mo66547m() {
        if (this.f243737a) {
            ((fi41) this.f243739c).getClass();
            return false;
        }
        oad0 oad0Var = (oad0) this.f243742f;
        oad0Var.getClass();
        return oad0Var.mo66547m();
    }

    @Override // p204p.oad0
    /* JADX INFO: renamed from: q */
    public long mo41696q() {
        if (this.f243737a) {
            return ((fi41) this.f243739c).mo41696q();
        }
        oad0 oad0Var = (oad0) this.f243742f;
        oad0Var.getClass();
        return oad0Var.mo41696q();
    }
}
