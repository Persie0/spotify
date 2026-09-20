package p000;

import java.util.Iterator;
import p204p.qwb;
import p204p.swb;
import p204p.x920;

/* JADX INFO: renamed from: r */
/* JADX INFO: loaded from: classes9.dex */
public final class C2670r implements x920 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f288162a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Iterable f288163b;

    public /* synthetic */ C2670r(Iterable iterable, int i) {
        this.f288162a = i;
        this.f288163b = iterable;
    }

    @Override // p204p.x920
    /* JADX INFO: renamed from: b */
    public final Object mo36147b(Object obj) {
        switch (this.f288162a) {
            case 0:
                return ((swb) obj).f214634a;
            default:
                return ((qwb) obj).f193220a;
        }
    }

    @Override // p204p.x920
    /* JADX INFO: renamed from: g */
    public final Iterator mo36148g() {
        switch (this.f288162a) {
            case 0:
                break;
        }
        return this.f288163b.iterator();
    }
}
