package p204p;

import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class zvq0 implements Init {
    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public final First mo15576f0(Object obj) {
        hwq0 hwq0Var = (hwq0) obj;
        List list = hwq0Var.f96006c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((hxq0) it.next()).f96269c;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return First.m15575c(hwq0Var, Collections.singleton(new gtq0(arrayList)));
    }
}
