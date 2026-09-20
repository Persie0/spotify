package p204p;

import androidx.car.app.C0023j;
import androidx.car.app.C0024k;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fxz0 implements hc80 {

    /* JADX INFO: renamed from: a */
    public final oc80 f74494a;

    /* JADX INFO: renamed from: b */
    public final oc80 f74495b;

    /* JADX INFO: renamed from: c */
    public final C0023j f74496c;

    public fxz0() {
        ywz0 ywz0Var = new ywz0(this);
        oc80 oc80Var = new oc80(this, true);
        this.f74494a = oc80Var;
        this.f74495b = new oc80(this, true);
        oc80Var.mo31986a(ywz0Var);
        this.f74496c = new C0023j(oc80Var, new C0024k());
    }

    /* JADX INFO: renamed from: a */
    public final C0023j m43030a() {
        C0023j c0023j = this.f74496c;
        Objects.requireNonNull(c0023j);
        return c0023j;
    }

    /* JADX INFO: renamed from: b */
    public final void m43031b(ta80 ta80Var) {
        this.f74494a.m66676g(ta80Var);
    }

    @Override // p204p.hc80
    public final gb80 getLifecycle() {
        return this.f74495b;
    }
}
