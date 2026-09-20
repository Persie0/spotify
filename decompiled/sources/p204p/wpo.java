package p204p;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class wpo implements be10 {

    /* JADX INFO: renamed from: a */
    public final Context f253791a;

    /* JADX INFO: renamed from: b */
    public final wra f253792b;

    /* JADX INFO: renamed from: c */
    public e6q f253793c;

    /* JADX INFO: renamed from: d */
    public final p7f f253794d;

    /* JADX INFO: renamed from: i */
    public EGLDisplay f253799i;

    /* JADX INFO: renamed from: j */
    public int f253800j = -1;

    /* JADX INFO: renamed from: k */
    public int f253801k = -1;

    /* JADX INFO: renamed from: e */
    public zd10 f253795e = new gg5(7);

    /* JADX INFO: renamed from: f */
    public ae10 f253796f = new oh5();

    /* JADX INFO: renamed from: g */
    public yd10 f253797g = new i4l(20);

    /* JADX INFO: renamed from: h */
    public Executor f253798h = ckr.f39074a;

    public wpo(Context context, wra wraVar, p7f p7fVar) {
        this.f253791a = context;
        this.f253792b = wraVar;
        this.f253794d = p7fVar;
    }

    @Override // p204p.be10
    /* JADX INFO: renamed from: a */
    public final void mo28862a() {
        this.f253796f.mo25651e();
    }

    @Override // p204p.be10
    /* JADX INFO: renamed from: b */
    public final void mo28863b(zd10 zd10Var) {
        this.f253795e = zd10Var;
        zd10Var.mo34259w();
    }

    @Override // p204p.be10
    /* JADX INFO: renamed from: c */
    public final void mo28864c(Executor executor, yd10 yd10Var) {
        this.f253797g = yd10Var;
        this.f253798h = executor;
    }

    /* JADX INFO: renamed from: d */
    public final void m88720d(int i, int i2) {
        if (this.f253799i == null) {
            this.f253799i = mjx0.m61998B();
        }
        EGL14.eglGetCurrentContext();
        if (this.f253800j == -1 || this.f253801k == -1) {
            this.f253800j = i;
            this.f253801k = i2;
        }
        this.f253792b.getClass();
        if (this.f253793c == null) {
            ddg1.m35736g(4, "initialCapacity");
            Object[] objArrCopyOf = new Object[4];
            szq0 szq0VarM79757f = szq0.m79757f(this.f253800j, this.f253801k);
            int iM32617b = cf40.m32617b(4, 1);
            if (iM32617b > 4) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iM32617b);
            }
            objArrCopyOf[0] = szq0VarM79757f;
            wsv0 wsv0VarM69787l = pf40.m69787l(1, objArrCopyOf);
            wsv0 wsv0Var = wsv0.f254763e;
            p7f p7fVar = this.f253794d;
            this.f253793c = e6q.m37949k(this.f253791a, wsv0VarM69787l, wsv0Var, p7fVar, p7fVar.f174677c == 1 ? 2 : 0);
        }
    }

    @Override // p204p.be10
    /* JADX INFO: renamed from: e */
    public final void mo28865e(ce10 ce10Var) {
        this.f253795e.mo34258v(ce10Var);
        this.f253795e.mo34259w();
    }

    @Override // p204p.be10
    /* JADX INFO: renamed from: f */
    public final void mo28866f(cxb cxbVar) {
        this.f253796f = cxbVar;
    }

    @Override // p204p.be10
    public final void flush() {
        e6q e6qVar = this.f253793c;
        if (e6qVar != null) {
            e6qVar.flush();
        }
        this.f253795e.onFlush();
        this.f253795e.mo34259w();
    }

    @Override // p204p.be10
    /* JADX INFO: renamed from: g */
    public final void mo28867g(ud10 ud10Var, ce10 ce10Var, long j) {
        try {
            m88720d(ce10Var.f36992c, ce10Var.f36993d);
            this.f253793c.getClass();
            throw null;
        } catch (VideoFrameProcessingException | GlUtil$GlException e) {
            this.f253798h.execute(new vpo(this, e, j, 0));
        }
    }

    @Override // p204p.be10
    public final void release() throws VideoFrameProcessingException {
        e6q e6qVar = this.f253793c;
        if (e6qVar != null) {
            e6qVar.release();
        }
        try {
            mjx0.m62033k();
        } catch (GlUtil$GlException e) {
            throw new VideoFrameProcessingException(e);
        }
    }
}
