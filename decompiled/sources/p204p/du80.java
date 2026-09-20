package p204p;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes7.dex */
public final class du80 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53008a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gwo0 f53009b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f53010c;

    public /* synthetic */ du80(Object obj, gwo0 gwo0Var, int i) {
        this.f53008a = i;
        this.f53010c = obj;
        this.f53009b = gwo0Var;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f53008a) {
            case 0:
                ((c1p0) ((a1p0) obj)).m31270d("esperanto_play_status:".concat(((k2x0) this.f53010c).f118699a.mo27976a()), this.f53009b);
                break;
            default:
                ((c1p0) ((a1p0) obj)).m31270d(edb.m38564m("esperanto_play_exception:", (String) this.f53010c), this.f53009b);
                break;
        }
    }
}
