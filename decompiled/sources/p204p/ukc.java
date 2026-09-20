package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ukc implements Update {

    /* JADX INFO: renamed from: a */
    public static final ukc f231277a = new ukc();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        wkc wkcVar = (wkc) obj;
        tkc tkcVar = (tkc) obj2;
        if (tkcVar.equals(qkc.f189525a)) {
            return Next.m15605a(Collections.singleton(ikc.f103087a));
        }
        if (tkcVar.equals(qkc.f189526b)) {
            return Next.m15606h(new wkc(wkcVar.f252201a, dlc.f50180a));
        }
        if (tkcVar.equals(qkc.f189527c)) {
            return Next.m15605a(Collections.singleton(hkc.f92415a));
        }
        if (tkcVar.equals(qkc.f189528d)) {
            String str = wkcVar.f252201a;
            return Next.m15607i(new wkc(str, elc.f60684a), Collections.singleton(new jkc(str)));
        }
        if (tkcVar instanceof rkc) {
            return Next.m15606h(new wkc(((rkc) tkcVar).f200047a, flc.f70752a));
        }
        if (tkcVar instanceof skc) {
            return Next.m15606h(new wkc(((skc) tkcVar).f210076a, clc.f39244a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
