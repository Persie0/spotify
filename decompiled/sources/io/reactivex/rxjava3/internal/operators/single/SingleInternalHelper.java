package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import java.util.NoSuchElementException;
import p204p.i7t0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SingleInternalHelper {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NoSuchElementSupplier implements Supplier<NoSuchElementException> {

        /* JADX INFO: renamed from: a */
        public static final NoSuchElementSupplier f10001a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ NoSuchElementSupplier[] f10002b;

        static {
            NoSuchElementSupplier noSuchElementSupplier = new NoSuchElementSupplier("INSTANCE", 0);
            f10001a = noSuchElementSupplier;
            f10002b = new NoSuchElementSupplier[]{noSuchElementSupplier};
        }

        public static NoSuchElementSupplier valueOf(String str) {
            return (NoSuchElementSupplier) Enum.valueOf(NoSuchElementSupplier.class, str);
        }

        public static NoSuchElementSupplier[] values() {
            return (NoSuchElementSupplier[]) f10002b.clone();
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return new NoSuchElementException();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ToFlowable implements Function<SingleSource, i7t0> {

        /* JADX INFO: renamed from: a */
        public static final ToFlowable f10003a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ ToFlowable[] f10004b;

        static {
            ToFlowable toFlowable = new ToFlowable("INSTANCE", 0);
            f10003a = toFlowable;
            f10004b = new ToFlowable[]{toFlowable};
        }

        public static ToFlowable valueOf(String str) {
            return (ToFlowable) Enum.valueOf(ToFlowable.class, str);
        }

        public static ToFlowable[] values() {
            return (ToFlowable[]) f10004b.clone();
        }

        @Override // io.reactivex.rxjava3.functions.Function
        /* JADX INFO: renamed from: apply */
        public final Object mo98394apply(Object obj) {
            return new SingleToFlowable((SingleSource) obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Supplier m23706a() {
        return NoSuchElementSupplier.f10001a;
    }

    /* JADX INFO: renamed from: b */
    public static Function m23707b() {
        return ToFlowable.f10003a;
    }
}
