package io.reactivex.rxjava3.internal.functions;

import io.reactivex.rxjava3.functions.BiPredicate;
import java.util.Objects;
import p204p.edb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ObjectHelper {

    /* JADX INFO: renamed from: a */
    public static final BiPredicate f7265a = new BiObjectPredicate();

    public static final class BiObjectPredicate implements BiPredicate<Object, Object> {
        @Override // io.reactivex.rxjava3.functions.BiPredicate
        public final boolean test(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23450a(int i, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException(edb.m38565n(str, " > 0 required but it was ", i));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m23451b(long j, String str) {
        if (j > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + j);
    }
}
