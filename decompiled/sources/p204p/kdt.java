package p204p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class kdt implements Update {

    /* JADX INFO: renamed from: a */
    public static final kdt f121737a = new kdt();

    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        mdt mdtVar = (mdt) obj;
        gdt gdtVar = (gdt) obj2;
        if (gdtVar instanceof ddt) {
            return Next.m15605a(Collections.singleton(new yct(mdtVar.f142492b, mdtVar.f142493c, ((ddt) gdtVar).f47867a)));
        }
        if (gdtVar.equals(edt.f58589a)) {
            return Next.m15605a(Collections.singleton(new zct()));
        }
        if (gdtVar.equals(fdt.f68561a)) {
            return Next.m15605a(Collections.singleton(new zct()));
        }
        throw new NoWhenBranchMatchedException();
    }
}
