package p204p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class yzx implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f277913a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c0y f277914b;

    public /* synthetic */ yzx(c0y c0yVar, int i) {
        this.f277913a = i;
        this.f277914b = c0yVar;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f277913a) {
            case 0:
                c0y c0yVar = this.f277914b;
                List listM31192a = c0y.m31192a(c0yVar, (lcf) obj);
                if (listM31192a != null) {
                    c0yVar.f32911h.onNext(new o4x0(aew.f14976g, listM31192a));
                }
                break;
            case 1:
                c0y c0yVar2 = this.f277914b;
                List listM31192a2 = c0y.m31192a(c0yVar2, (lcf) obj);
                if (listM31192a2 != null) {
                    c0yVar2.f32911h.onNext(new o4x0(aew.f14973d, listM31192a2));
                }
                break;
            case 2:
                c0y c0yVar3 = this.f277914b;
                List listM31192a3 = c0y.m31192a(c0yVar3, (lcf) obj);
                if (listM31192a3 != null) {
                    c0yVar3.f32911h.onNext(new o4x0(aew.f14973d, listM31192a3));
                }
                break;
            default:
                c0y c0yVar4 = this.f277914b;
                List listM31192a4 = c0y.m31192a(c0yVar4, (lcf) obj);
                if (listM31192a4 != null) {
                    c0yVar4.f32911h.onNext(new o4x0(aew.f14973d, listM31192a4));
                }
                break;
        }
    }
}
