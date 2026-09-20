package p204p;

import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bz8 implements be10 {

    /* JADX INFO: renamed from: a */
    public final h9p f32431a;

    /* JADX INFO: renamed from: b */
    public zd10 f32432b;

    /* JADX INFO: renamed from: c */
    public ae10 f32433c;

    /* JADX INFO: renamed from: d */
    public yd10 f32434d = new lp7(7);

    /* JADX INFO: renamed from: e */
    public Executor f32435e = ckr.f39074a;

    /* JADX INFO: renamed from: f */
    public int f32436f = -1;

    /* JADX INFO: renamed from: g */
    public int f32437g = -1;

    public bz8(boolean z, int i) {
        this.f32431a = new h9p(z, i);
        int i2 = 1;
        this.f32432b = new si5(i2);
        this.f32433c = new ti5(i2);
    }

    @Override // p204p.be10
    /* JADX INFO: renamed from: a */
    public final void mo28862a() {
        this.f32433c.mo25651e();
    }

    @Override // p204p.be10
    /* JADX INFO: renamed from: b */
    public final void mo28863b(zd10 zd10Var) {
        this.f32432b = zd10Var;
        for (int i = 0; i < this.f32431a.m46888o(); i++) {
            zd10Var.mo34259w();
        }
    }

    @Override // p204p.be10
    /* JADX INFO: renamed from: c */
    public final void mo28864c(Executor executor, yd10 yd10Var) {
        this.f32435e = executor;
        this.f32434d = yd10Var;
    }

    /* JADX INFO: renamed from: d */
    public abstract di21 mo30976d(int i, int i2);

    @Override // p204p.be10
    /* JADX INFO: renamed from: e */
    public void mo28865e(ce10 ce10Var) {
        h9p h9pVar = this.f32431a;
        if (((ArrayDeque) h9pVar.f89016d).contains(ce10Var)) {
            ArrayDeque arrayDeque = (ArrayDeque) h9pVar.f89016d;
            c95.m31855u(arrayDeque.contains(ce10Var));
            arrayDeque.remove(ce10Var);
            ((ArrayDeque) h9pVar.f89015c).add(ce10Var);
            this.f32432b.mo34259w();
        }
    }

    @Override // p204p.be10
    /* JADX INFO: renamed from: f */
    public final void mo28866f(cxb cxbVar) {
        this.f32433c = cxbVar;
    }

    @Override // p204p.be10
    public void flush() {
        h9p h9pVar = this.f32431a;
        ArrayDeque arrayDeque = (ArrayDeque) h9pVar.f89015c;
        ArrayDeque arrayDeque2 = (ArrayDeque) h9pVar.f89016d;
        arrayDeque.addAll(arrayDeque2);
        arrayDeque2.clear();
        this.f32432b.onFlush();
        for (int i = 0; i < h9pVar.f89013a; i++) {
            this.f32432b.mo34259w();
        }
    }

    @Override // p204p.be10
    /* JADX INFO: renamed from: g */
    public void mo28867g(ud10 ud10Var, ce10 ce10Var, long j) {
        try {
            int i = this.f32436f;
            int i2 = ce10Var.f36992c;
            int i3 = ce10Var.f36993d;
            h9p h9pVar = this.f32431a;
            if (i != i2 || this.f32437g != i3 || !((qw50) h9pVar.m46889p()).hasNext()) {
                int i4 = ce10Var.f36992c;
                this.f32436f = i4;
                this.f32437g = i3;
                di21 di21VarMo30976d = mo30976d(i4, i3);
                h9pVar.m46886l(ud10Var, di21VarMo30976d.f49219a, di21VarMo30976d.f49220b);
            }
            ce10 ce10VarM46899z = h9pVar.m46899z();
            mjx0.m62047y(ce10VarM46899z.f36991b, ce10VarM46899z.f36992c, ce10VarM46899z.f36993d);
            if (mo30978i()) {
                mjx0.m62035m();
            }
            mo30977h(ce10Var.f36990a, j);
            this.f32432b.mo34258v(ce10Var);
            this.f32433c.mo25650c(ce10VarM46899z, j);
        } catch (VideoFrameProcessingException e) {
            e = e;
            this.f32435e.execute(new fr2(17, this, e));
        } catch (GlUtil$GlException e2) {
            e = e2;
            this.f32435e.execute(new fr2(17, this, e));
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo30977h(int i, long j);

    /* JADX INFO: renamed from: i */
    public boolean mo30978i() {
        return true;
    }
}
