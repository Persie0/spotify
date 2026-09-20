package p204p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes.dex */
public final class nun0 implements hvb0 {

    /* JADX INFO: renamed from: i */
    public static final String f158672i = s571.m77250i(xoc1.f263839A0.f243453a, "?facet=default");

    /* JADX INFO: renamed from: a */
    public final z9j0 f158673a;

    /* JADX INFO: renamed from: b */
    public final cgm f158674b;

    /* JADX INFO: renamed from: c */
    public final vfm f158675c;

    /* JADX INFO: renamed from: d */
    public final l5j0 f158676d;

    /* JADX INFO: renamed from: e */
    public final Scheduler f158677e;

    /* JADX INFO: renamed from: f */
    public final boolean f158678f;

    /* JADX INFO: renamed from: g */
    public Disposable f158679g = EmptyDisposable.f7220a;

    /* JADX INFO: renamed from: h */
    public final h7m f158680h = new h7m(this, 6);

    public nun0(z9j0 z9j0Var, cgm cgmVar, vfm vfmVar, l5j0 l5j0Var, Scheduler scheduler, boolean z) {
        this.f158673a = z9j0Var;
        this.f158674b = cgmVar;
        this.f158675c = vfmVar;
        this.f158676d = l5j0Var;
        this.f158677e = scheduler;
        this.f158678f = z;
    }
}
