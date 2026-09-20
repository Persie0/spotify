package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class knu0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ lnu0 f124475a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f124476b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f124477c;

    public knu0(lnu0 lnu0Var, String str, boolean z) {
        this.f124475a = lnu0Var;
        this.f124476b = str;
        this.f124477c = z;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        this.f124475a.f135228a.m82891c(this.f124476b, this.f124477c, (vy81) obj);
    }
}
