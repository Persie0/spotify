package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l4v implements Update {

    /* JADX INFO: renamed from: a */
    public static final l4v f129768a = new l4v();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        u4v u4vVar = (u4v) obj;
        g4v g4vVar = (g4v) obj2;
        if (g4vVar instanceof c4v) {
            return Next.m15606h(u4v.m82366a(u4vVar, ((c4v) g4vVar).f34014a, null, 14));
        }
        if (g4vVar instanceof e4v) {
            return Next.m15607i(u4v.m82366a(u4vVar, 0, null, 13), Collections.singleton(new y3v(u4vVar.f226805a, ((e4v) g4vVar).f56178a)));
        }
        if (g4vVar instanceof d4v) {
            return Next.m15606h(u4v.m82366a(u4vVar, 0, ((d4v) g4vVar).f45247a, 11));
        }
        if (g4vVar instanceof f4v) {
            return Next.m15606h(u4v.m82366a(u4vVar, 0, null, 7));
        }
        throw new NoWhenBranchMatchedException();
    }
}
