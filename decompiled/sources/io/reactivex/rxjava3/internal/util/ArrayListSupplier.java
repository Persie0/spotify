package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ArrayListSupplier implements Supplier<List<Object>>, Function<Object, List<Object>> {

    /* JADX INFO: renamed from: a */
    public static final ArrayListSupplier f10248a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ArrayListSupplier[] f10249b;

    static {
        ArrayListSupplier arrayListSupplier = new ArrayListSupplier("INSTANCE", 0);
        f10248a = arrayListSupplier;
        f10249b = new ArrayListSupplier[]{arrayListSupplier};
    }

    public static ArrayListSupplier valueOf(String str) {
        return (ArrayListSupplier) Enum.valueOf(ArrayListSupplier.class, str);
    }

    public static ArrayListSupplier[] values() {
        return (ArrayListSupplier[]) f10249b.clone();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        return new ArrayList();
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        return new ArrayList();
    }
}
