package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class af21 implements wr50 {

    /* JADX INFO: renamed from: a */
    public final String f15010a;

    public af21(String str) {
        this.f15010a = str;
    }

    @Override // p204p.wr50
    /* JADX INFO: renamed from: a */
    public final List mo25797a(List list) {
        String str = this.f15010a;
        if (list.contains(str)) {
            return Collections.singletonList(str);
        }
        return !list.isEmpty() ? Collections.singletonList(g6f.m43741q0(list)) : lau.f131415a;
    }
}
