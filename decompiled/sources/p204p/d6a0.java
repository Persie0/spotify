package p204p;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d6a0 {

    /* JADX INFO: renamed from: a */
    public volatile w8j f45637a = f6a0.f66344a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f45638b = new AtomicReference(c6a0.f34467a);

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f45639c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public final boolean m35103d() {
        return this.f45638b.get() == c6a0.f34469c;
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo25474e();

    /* JADX INFO: renamed from: f */
    public abstract void mo25475f();

    /* JADX INFO: renamed from: g */
    public final void m35104g() {
        if (mt60.m62808o(this.f45638b)) {
            this.f45637a.accept(fby.m41266a(this));
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m35105h(Throwable th) {
        if (mt60.m62808o(this.f45638b)) {
            this.f45637a.accept(k2z0.m55217s(th));
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m35106i() {
        if (mt60.m62807n(this.f45638b)) {
            this.f45637a.accept(fby.m41267b(this));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m35107j() {
        if (this.f45638b.get() == c6a0.f34468b && this.f45639c.compareAndSet(false, true)) {
            w8j w8jVar = this.f45637a;
            fby.m41268c();
            w8jVar.accept(o3a0.f161331a);
        }
    }
}
