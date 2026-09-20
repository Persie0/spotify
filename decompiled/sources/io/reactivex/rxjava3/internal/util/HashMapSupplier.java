package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.functions.Supplier;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class HashMapSupplier implements Supplier<Map<Object, Object>> {

    /* JADX INFO: renamed from: a */
    public static final HashMapSupplier f10259a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ HashMapSupplier[] f10260b;

    static {
        HashMapSupplier hashMapSupplier = new HashMapSupplier("INSTANCE", 0);
        f10259a = hashMapSupplier;
        f10260b = new HashMapSupplier[]{hashMapSupplier};
    }

    public static HashMapSupplier valueOf(String str) {
        return (HashMapSupplier) Enum.valueOf(HashMapSupplier.class, str);
    }

    public static HashMapSupplier[] values() {
        return (HashMapSupplier[]) f10260b.clone();
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        return new HashMap();
    }
}
