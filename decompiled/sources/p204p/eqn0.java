package p204p;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class eqn0 extends AbstractC2328r7 implements frn0 {

    /* JADX INFO: renamed from: c */
    public static final eqn0 f61927c = new eqn0(mj91.f144207e, 0);

    /* JADX INFO: renamed from: a */
    public final mj91 f61928a;

    /* JADX INFO: renamed from: b */
    public final int f61929b;

    public eqn0(mj91 mj91Var, int i) {
        this.f61928a = mj91Var;
        this.f61929b = i;
    }

    @Override // p204p.AbstractC2328r7
    /* JADX INFO: renamed from: a */
    public final Set mo36657a() {
        return new sqn0(this);
    }

    @Override // p204p.AbstractC2328r7
    /* JADX INFO: renamed from: b */
    public final Set mo36658b() {
        return new vqn0(this);
    }

    @Override // p204p.AbstractC2328r7
    /* JADX INFO: renamed from: c */
    public final int mo36659c() {
        return this.f61929b;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f61928a.m61943d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // p204p.AbstractC2328r7
    /* JADX INFO: renamed from: d */
    public final Collection mo36660d() {
        return new yqn0(this);
    }

    @Override // p204p.frn0
    /* JADX INFO: renamed from: e */
    public iqn0 mo39729e() {
        return new iqn0(this);
    }

    /* JADX INFO: renamed from: f */
    public final eqn0 m39730f(Object obj, zn80 zn80Var) {
        t9w0 t9w0VarM61959u = this.f61928a.m61959u(obj != null ? obj.hashCode() : 0, obj, zn80Var, 0);
        if (t9w0VarM61959u == null) {
            return this;
        }
        return new eqn0(t9w0VarM61959u.m80318c(), t9w0VarM61959u.m80319d() + this.f61929b);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f61928a.m61946g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
