package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p204p.dq60;

/* JADX INFO: loaded from: classes11.dex */
public abstract class EndConsumerHelper {
    /* JADX INFO: renamed from: a */
    public static void m23748a(Class cls) {
        String name = cls.getName();
        RxJavaPlugins.m23782b(new ProtocolViolationException(dq60.m36615o("It is not allowed to subscribe with a(n) ", name, " multiple times. Please create a fresh instance of ", name, " and subscribe that to the target source instead.")));
    }
}
