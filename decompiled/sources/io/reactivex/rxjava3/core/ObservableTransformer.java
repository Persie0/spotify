package io.reactivex.rxjava3.core;

/* JADX INFO: loaded from: classes2.dex */
@FunctionalInterface
public interface ObservableTransformer<Upstream, Downstream> {
    ObservableSource apply(Observable observable);
}
