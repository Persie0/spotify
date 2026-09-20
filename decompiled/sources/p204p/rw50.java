package p204p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class rw50 implements Iterator {

    /* JADX INFO: renamed from: a */
    public static final rw50 f203263a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ rw50[] f203264b;

    static {
        rw50 rw50Var = new rw50("INSTANCE", 0);
        f203263a = rw50Var;
        f203264b = new rw50[]{rw50Var};
    }

    public static rw50 valueOf(String str) {
        return (rw50) Enum.valueOf(rw50.class, str);
    }

    public static rw50[] values() {
        return (rw50[]) f203264b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        c95.m31856v(false, "no calls to next() since the last call to remove()");
    }
}
