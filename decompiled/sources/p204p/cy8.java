package p204p;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cy8 implements t27 {

    /* JADX INFO: renamed from: b */
    public q27 f43179b;

    /* JADX INFO: renamed from: c */
    public q27 f43180c;

    /* JADX INFO: renamed from: d */
    public q27 f43181d;

    /* JADX INFO: renamed from: e */
    public q27 f43182e;

    /* JADX INFO: renamed from: f */
    public ByteBuffer f43183f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f43184g;

    /* JADX INFO: renamed from: h */
    public boolean f43185h;

    public cy8() {
        ByteBuffer byteBuffer = t27.f216437a;
        this.f43183f = byteBuffer;
        this.f43184g = byteBuffer;
        q27 q27Var = q27.f184525e;
        this.f43181d = q27Var;
        this.f43182e = q27Var;
        this.f43179b = q27Var;
        this.f43180c = q27Var;
    }

    /* JADX INFO: renamed from: a */
    public abstract q27 mo34344a(q27 q27Var);

    @Override // p204p.t27
    /* JADX INFO: renamed from: d */
    public boolean mo31666d() {
        return this.f43185h && this.f43184g == t27.f216437a;
    }

    @Override // p204p.t27
    /* JADX INFO: renamed from: e */
    public ByteBuffer mo31667e() {
        ByteBuffer byteBuffer = this.f43184g;
        this.f43184g = t27.f216437a;
        return byteBuffer;
    }

    @Override // p204p.t27
    /* JADX INFO: renamed from: f */
    public final q27 mo31668f(q27 q27Var) {
        this.f43181d = q27Var;
        this.f43182e = mo34344a(q27Var);
        return isActive() ? this.f43182e : q27.f184525e;
    }

    @Override // p204p.t27
    public final void flush() {
        mo31669g(s27.f204911d);
    }

    @Override // p204p.t27
    /* JADX INFO: renamed from: g */
    public final void mo31669g(s27 s27Var) {
        this.f43184g = t27.f216437a;
        this.f43185h = false;
        this.f43179b = this.f43181d;
        this.f43180c = this.f43182e;
        mo34345b();
    }

    @Override // p204p.t27
    /* JADX INFO: renamed from: i */
    public final void mo31671i() {
        this.f43185h = true;
        mo34346c();
    }

    @Override // p204p.t27
    public boolean isActive() {
        return this.f43182e != q27.f184525e;
    }

    /* JADX INFO: renamed from: l */
    public final ByteBuffer m34348l(int i) {
        if (this.f43183f.capacity() < i) {
            this.f43183f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f43183f.clear();
        }
        ByteBuffer byteBuffer = this.f43183f;
        this.f43184g = byteBuffer;
        return byteBuffer;
    }

    @Override // p204p.t27
    public final void reset() {
        ByteBuffer byteBuffer = t27.f216437a;
        this.f43184g = byteBuffer;
        this.f43185h = false;
        this.f43183f = byteBuffer;
        q27 q27Var = q27.f184525e;
        this.f43181d = q27Var;
        this.f43182e = q27Var;
        this.f43179b = q27Var;
        this.f43180c = q27Var;
        mo34347k();
    }

    /* JADX INFO: renamed from: b */
    public void mo34345b() {
    }

    /* JADX INFO: renamed from: c */
    public void mo34346c() {
    }

    /* JADX INFO: renamed from: k */
    public void mo34347k() {
    }
}
