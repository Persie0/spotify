package p204p;

import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rnj implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f200931a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fnj f200932b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f200933c;

    public rnj(int i, fnj fnjVar, boolean z) {
        this.f200931a = i;
        this.f200932b = fnjVar;
        this.f200933c = z;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        List list = (List) obj;
        int i = this.f200931a;
        List listM43714b1 = g6f.m43714b1(list, i);
        fnj fnjVar = this.f200932b;
        boolean z = fnjVar.f71309b;
        String uri = fnjVar.f71308a.getUri();
        String str = fnjVar.f71310c;
        boolean z2 = this.f200933c;
        return new wnj(listM43714b1, z, uri, str, z2, !z2 && list.size() <= i);
    }
}
