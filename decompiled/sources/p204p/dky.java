package p204p;

import com.spotify.mobius.First;
import com.spotify.mobius.Next;

/* JADX INFO: loaded from: classes8.dex */
public final class dky extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50065a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gky f50066b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dky(gky gkyVar, int i) {
        super(2);
        this.f50065a = i;
        this.f50066b = gkyVar;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f50065a) {
            case 0:
                bky bkyVar = (bky) obj2;
                return Next.m15606h(bky.m29726a(bkyVar, gky.m45083f(this.f50066b, bkyVar.f28038a, (zjy) obj), false, false, 6));
            default:
                bky bkyVar2 = (bky) obj2;
                return First.m15574b(bky.m29726a(bkyVar2, gky.m45083f(this.f50066b, bkyVar2.f28038a, (zjy) obj), false, false, 6));
        }
    }
}
