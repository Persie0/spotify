package com.spotify.mobius;

import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.internal_util.ImmutableUtil;
import com.spotify.mobius.internal_util.Preconditions;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Next<M, F> {
    /* JADX INFO: renamed from: a */
    public static Next m15605a(Set set) {
        return new AutoValue_Next(null, ImmutableUtil.m15647b(set));
    }

    /* JADX INFO: renamed from: h */
    public static Next m15606h(Object obj) {
        ImmutableUtil.m15646a();
        return new AutoValue_Next(obj, Collections.EMPTY_SET);
    }

    /* JADX INFO: renamed from: i */
    public static Next m15607i(Object obj, Set set) {
        return new AutoValue_Next(obj, ImmutableUtil.m15647b(set));
    }

    /* JADX INFO: renamed from: j */
    public static Next m15608j() {
        ImmutableUtil.m15646a();
        return new AutoValue_Next(null, Collections.EMPTY_SET);
    }

    /* JADX INFO: renamed from: b */
    public abstract Set mo15561b();

    /* JADX INFO: renamed from: c */
    public final boolean m15609c() {
        return !((AutoValue_Next) this).f5532b.isEmpty();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m15610d() {
        return ((AutoValue_Next) this).f5531a != null;
    }

    /* JADX INFO: renamed from: e */
    public final void m15611e(Consumer consumer) {
        if (m15610d()) {
            consumer.accept(m15613g());
        }
    }

    /* JADX INFO: renamed from: f */
    public final Object m15612f(Object obj) {
        Preconditions.m15649b(obj);
        return m15610d() ? m15613g() : obj;
    }

    /* JADX INFO: renamed from: g */
    public final Object m15613g() {
        if (m15610d()) {
            return ((AutoValue_Next) this).f5531a;
        }
        throw new NoSuchElementException("there is no model in this Next<>");
    }
}
