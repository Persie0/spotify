package p204p;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
public final class qb70 implements hab, r7l0, k7l0, oal0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hqb f187031a;

    public /* synthetic */ qb70(hqb hqbVar) {
        this.f187031a = hqbVar;
    }

    @Override // p204p.k7l0
    /* JADX INFO: renamed from: b */
    public void mo31435b() {
        this.f187031a.resumeWith(null);
    }

    @Override // p204p.hab
    /* JADX INFO: renamed from: c */
    public void mo25640c(x8b x8bVar, o2x0 o2x0Var) {
        this.f187031a.resumeWith(o2x0Var);
    }

    @Override // p204p.hab
    /* JADX INFO: renamed from: l */
    public void mo25646l(x8b x8bVar, Throwable th) {
        this.f187031a.resumeWith(new c6x0(th));
    }

    @Override // p204p.oal0
    /* JADX INFO: renamed from: o */
    public void mo27479o(Exception exc) {
        this.f187031a.resumeWith(null);
    }

    @Override // p204p.r7l0
    public void onComplete(Task task) {
        Exception excMo1514f = task.mo1514f();
        if (excMo1514f != null) {
            this.f187031a.resumeWith(new c6x0(excMo1514f));
        } else if (((y7h1) task).f270088d) {
            this.f187031a.mo42416r(null);
        } else {
            this.f187031a.resumeWith(task.mo1515g());
        }
    }
}
