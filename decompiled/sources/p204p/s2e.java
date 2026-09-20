package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s2e implements Update {
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        q2e q2eVar = (q2e) obj2;
        if (q2eVar.equals(p2e.f173335a)) {
            return Next.m15606h(new u2e(true, false, false));
        }
        if (q2eVar.equals(p2e.f173339e)) {
            return Next.m15607i(new u2e(false, true, false), Collections.singleton(k2e.f118604a));
        }
        if (q2eVar.equals(p2e.f173340f)) {
            return Next.m15606h(new u2e(false, false, false));
        }
        if (q2eVar.equals(p2e.f173338d)) {
            return Next.m15606h(new u2e(false, false, false));
        }
        if (q2eVar.equals(p2e.f173337c)) {
            return Next.m15606h(new u2e(false, false, false));
        }
        if (q2eVar.equals(p2e.f173336b)) {
            return Next.m15606h(new u2e(false, false, true));
        }
        if (q2eVar.equals(p2e.f173341g)) {
            return Next.m15606h(new u2e(false, false, false));
        }
        if (q2eVar.equals(p2e.f173342h)) {
            return Next.m15606h(new u2e(true, false, false));
        }
        throw new NoWhenBranchMatchedException();
    }
}
