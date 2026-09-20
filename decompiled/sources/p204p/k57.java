package p204p;

import android.os.Build;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: classes2.dex */
public final class k57 implements n57 {

    /* JADX INFO: renamed from: a */
    public final o57 f119424a;

    /* JADX INFO: renamed from: b */
    public final hz6 f119425b;

    /* JADX INFO: renamed from: c */
    public final BehaviorSubject f119426c = BehaviorSubject.m23795f();

    public k57(o57 o57Var, hz6 hz6Var) {
        this.f119424a = o57Var;
        this.f119425b = hz6Var;
    }

    @Override // p204p.n57
    /* JADX INFO: renamed from: a */
    public final void mo55422a(int i, String str, Integer num, String str2) {
        BehaviorSubject behaviorSubject = this.f119426c;
        if (str != null || num != null || str2 != null) {
            behaviorSubject.onNext(new r57(num, str, str2));
            return;
        }
        for (jw6 jw6Var : ((pz6) this.f119425b).m71692c()) {
            if (jw6Var.getId() == i) {
                behaviorSubject.onNext(new r57(Integer.valueOf(jw6Var.getType()), jw6Var.mo54406b().toString(), Build.VERSION.SDK_INT >= 28 ? jw6Var.mo54405a() : null));
                return;
            }
        }
    }
}
