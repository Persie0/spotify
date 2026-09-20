package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Subject<T> extends Observable<T> implements Observer<T> {
    /* JADX INFO: renamed from: a */
    public abstract boolean mo23797a();

    /* JADX INFO: renamed from: c */
    public final Subject m23811c() {
        return this instanceof SerializedSubject ? this : new SerializedSubject(this);
    }
}
