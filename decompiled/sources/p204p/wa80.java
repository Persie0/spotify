package p204p;

import android.content.Intent;

/* JADX INFO: loaded from: classes10.dex */
public final class wa80 implements w8j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f249416a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f249417b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Intent f249418c;

    public wa80(int i, int i2, Intent intent) {
        this.f249416a = i;
        this.f249417b = i2;
        this.f249418c = intent;
    }

    @Override // p204p.w8j
    public final void accept(Object obj) {
        ((va80) obj).mo85020b(this.f249416a, this.f249417b, this.f249418c);
    }

    public final String toString() {
        return "Event.ON_ACTIVITY_RESULT";
    }
}
