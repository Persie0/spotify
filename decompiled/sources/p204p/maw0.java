package p204p;

import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: classes2.dex */
public final class maw0 {

    /* JADX INFO: renamed from: a */
    public final PublishSubject f141703a = new PublishSubject();

    /* JADX INFO: renamed from: a */
    public final PublishSubject m61331a() {
        utu0 utu0Var = gk71.f80747a;
        utu0Var.m83940H("RCS");
        utu0Var.m83952u(s571.m77246e(hashCode(), "Remote config notifier instance "), new Object[0]);
        return this.f141703a;
    }

    /* JADX INFO: renamed from: b */
    public final void m61332b(waw0 waw0Var) {
        utu0 utu0Var = gk71.f80747a;
        utu0Var.m83940H("RCS");
        utu0Var.m83952u(s571.m77246e(hashCode(), "Remote config notifier instance "), new Object[0]);
        this.f141703a.onNext(waw0Var);
    }
}
