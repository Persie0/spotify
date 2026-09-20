package p204p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.SingleSubject;

/* JADX INFO: loaded from: classes2.dex */
public interface boe0 {
    /* JADX INFO: renamed from: a */
    Completable mo30086a(String str);

    /* JADX INFO: renamed from: b */
    SingleSubject mo30087b(Object obj, String str);

    String getId();

    BehaviorSubject getState();
}
