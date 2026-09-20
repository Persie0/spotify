package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class mqa0 implements mn71 {
    @Override // p204p.mn71
    /* JADX INFO: renamed from: b */
    public final void mo62187b(mm71 mm71Var) {
        String string = mm71Var.toString();
        bga.m29094p(4000, 4000);
        int length = string.length();
        ArrayList arrayList = new ArrayList((length / 4000) + (length % 4000 == 0 ? 0 : 1));
        for (int i = 0; i >= 0 && i < length; i += 4000) {
            int i2 = i + 4000;
            if (i2 < 0 || i2 > length) {
                i2 = length;
            }
            string.subSequence(i, i2).toString();
            arrayList.add(w2a1.f247311a);
        }
    }
}
