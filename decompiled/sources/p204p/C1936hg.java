package p204p;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: renamed from: p.hg */
/* JADX INFO: loaded from: classes5.dex */
public final class C1936hg extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sir0 f90970a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qe70 f90971b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1936hg(sir0 sir0Var, eh00 eh00Var, Handler handler) {
        super(handler);
        this.f90970a = sir0Var;
        this.f90971b = (qe70) eh00Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [p.eh00, p.qe70] */
    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f90970a.mo30231j(this.f90971b.invoke());
    }
}
