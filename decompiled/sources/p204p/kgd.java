package p204p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kgd implements Update {

    /* JADX INFO: renamed from: a */
    public static final kgd f122370a = new kgd();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        mgd mgdVar = (mgd) obj;
        ggd ggdVar = (ggd) obj2;
        if (ggdVar.equals(egd.f59305a)) {
            return Next.m15607i(mgd.m61703a(mgdVar, 1, null, false, 6), Effects.m15571a(zfd.f282283a));
        }
        if (ggdVar.equals(bgd.f26918a)) {
            return Next.m15606h(mgd.m61703a(mgdVar, 1, null, false, 6));
        }
        if (ggdVar.equals(cgd.f37639a)) {
            return Next.m15606h(mgd.m61703a(mgdVar, 3, null, false, 6));
        }
        if (ggdVar instanceof dgd) {
            return Next.m15606h(mgd.m61703a(mgdVar, 2, ((dgd) ggdVar).f48780a, false, 4));
        }
        if (ggdVar instanceof fgd) {
            return Next.m15606h(mgd.m61703a(mgdVar, 0, null, ((fgd) ggdVar).f69286a, 3));
        }
        throw new NoWhenBranchMatchedException();
    }
}
