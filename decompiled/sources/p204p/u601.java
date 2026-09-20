package p204p;

import android.util.Size;

/* JADX INFO: loaded from: classes3.dex */
public final class u601 extends m400 {

    /* JADX INFO: renamed from: d */
    public final Object f227191d;

    /* JADX INFO: renamed from: e */
    public final s640 f227192e;

    /* JADX INFO: renamed from: f */
    public final int f227193f;

    /* JADX INFO: renamed from: g */
    public final int f227194g;

    public u601(ua40 ua40Var, Size size, s640 s640Var) {
        super(ua40Var);
        this.f227191d = new Object();
        if (size == null) {
            this.f227193f = this.f139786b.mo60749d();
            this.f227194g = this.f139786b.mo60748b();
        } else {
            this.f227193f = size.getWidth();
            this.f227194g = size.getHeight();
        }
        this.f227192e = s640Var;
    }

    @Override // p204p.m400, p204p.ua40
    /* JADX INFO: renamed from: b */
    public final int mo60748b() {
        return this.f227194g;
    }

    @Override // p204p.m400, p204p.ua40
    /* JADX INFO: renamed from: d */
    public final int mo60749d() {
        return this.f227193f;
    }

    @Override // p204p.m400, p204p.ua40
    /* JADX INFO: renamed from: i1 */
    public final s640 mo60750i1() {
        return this.f227192e;
    }
}
