package p204p;

import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class b3c {

    /* JADX INFO: renamed from: a */
    public final a3c f23014a;

    /* JADX INFO: renamed from: b */
    public i0c f23015b = f0c.f64597a;

    /* JADX INFO: renamed from: c */
    public final BehaviorSubject f23016c = BehaviorSubject.m23795f();

    /* JADX INFO: renamed from: d */
    public final Map f23017d = Collections.synchronizedMap(new LinkedHashMap());

    public b3c(a3c a3cVar) {
        this.f23014a = a3cVar;
    }
}
