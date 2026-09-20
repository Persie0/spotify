package androidx.work;

import android.content.Context;
import kotlin.Metadata;
import p204p.C2069kx;
import p204p.bvk;
import p204p.cct;
import p204p.f890;
import p204p.fbk;
import p204p.jbb;
import p204p.k0e1;
import p204p.luk;
import p204p.qlg1;
import p204p.rrd;
import p204p.u790;
import p204p.uf60;
import p204p.wj50;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m24212d2 = {"Landroidx/work/CoroutineWorker;", "Lp/f890;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "p/bvk", "work-runtime_release"}, m24213k = 1, m24214mv = {1, 8, 0}, m24216xi = 48)
public abstract class CoroutineWorker extends f890 {

    /* JADX INFO: renamed from: e */
    public final WorkerParameters f1401e;

    /* JADX INFO: renamed from: f */
    public final bvk f1402f;

    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f1401e = workerParameters;
        this.f1402f = bvk.f31387c;
    }

    @Override // p204p.f890
    /* JADX INFO: renamed from: a */
    public final jbb mo1146a() {
        luk f945j = getF945j();
        uf60 uf60VarM73202g = qlg1.m73202g();
        f945j.getClass();
        return k0e1.m54970E(cct.m32296A(f945j, uf60VarM73202g), new rrd(this, (fbk) null, 24));
    }

    @Override // p204p.f890
    /* JADX INFO: renamed from: d */
    public final u790 mo1147d() {
        return k0e1.m54970E((!wj50.m88271j(getF945j(), bvk.f31387c) ? getF945j() : this.f1401e.f1407e).mo26608y(qlg1.m73202g()), new C2069kx(this, null, 16));
    }

    /* JADX INFO: renamed from: f */
    public abstract Object mo750f(fbk fbkVar);

    /* JADX INFO: renamed from: g */
    public luk getF945j() {
        return this.f1402f;
    }

    /* JADX INFO: renamed from: h */
    public Object mo1148h() {
        throw new IllegalStateException("Not implemented");
    }
}
