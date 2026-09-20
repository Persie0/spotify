package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.internal.util.VolatileSizeArrayList;
import io.reactivex.rxjava3.observers.BaseTestConsumer;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseTestConsumer<T, U extends BaseTestConsumer<T, U>> {

    /* JADX INFO: renamed from: d */
    public boolean f10276d;

    /* JADX INFO: renamed from: b */
    public final VolatileSizeArrayList f10274b = new VolatileSizeArrayList();

    /* JADX INFO: renamed from: c */
    public final VolatileSizeArrayList f10275c = new VolatileSizeArrayList();

    /* JADX INFO: renamed from: a */
    public final CountDownLatch f10273a = new CountDownLatch(1);
}
