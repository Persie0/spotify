package p204p;

import io.reactivex.rxjava3.subjects.ReplaySubject;
import io.reactivex.rxjava3.subjects.Subject;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public final class q3x0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f184980a;

    /* JADX INFO: renamed from: b */
    public final ReplaySubject f184981b;

    public q3x0(WeakReference weakReference, ReplaySubject replaySubject) {
        this.f184980a = weakReference;
        this.f184981b = replaySubject;
    }

    /* JADX INFO: renamed from: a */
    public final Subject m72131a() {
        return this.f184981b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3x0)) {
            return false;
        }
        q3x0 q3x0Var = (q3x0) obj;
        return this.f184980a.equals(q3x0Var.f184980a) && this.f184981b.equals(q3x0Var.f184981b);
    }

    public final int hashCode() {
        return this.f184981b.hashCode() + (this.f184980a.hashCode() * 31);
    }
}
